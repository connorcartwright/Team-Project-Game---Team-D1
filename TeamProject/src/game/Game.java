package game;

import gui.SplashScreen;

import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;

import javax.swing.JComponent;
import javax.swing.JFrame;

import character.CharacterFactory;
import core.PowerUpFactory;

/**
<<<<<<< .mine
 * The main game class.
 * 
 * @author Anh Pham
 * @author Connor Cartwright
 *
=======
 * The master frame that holds the game screens.
 * 
 *  @author Anh Pham
 * 
 * @author Anh Pham
>>>>>>> .r133
 */
public class Game extends JFrame {
	
	private static final long serialVersionUID = 5913371417037613515L;

	private JComponent screen;
	private int width;
	private int height;
	// private int scale;
	public static int FPS = 60;
	public static int MS_PER_UPDATE = 1000 / FPS;

	public Game() {
		GraphicsDevice screen = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];
		setIgnoreRepaint(true);
		CharacterFactory.initImage();
		PowerUpFactory.initializeIcons();
		// Should change to load from save file
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		width =  1440; // (int) screenSize.getWidth();
		height = 800; // (int) screenSize.getHeight();

		setTitle("Deadlock");
		// setIgnoreRepaint(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

//		if (screen.isFullScreenSupported()) {
//			setUndecorated(true);
//			screen.setFullScreenWindow(this);
//		}

		pack();
		setVisible(true);
		setLocationRelativeTo(null);

		init();
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(width, height);
	}

	/**
	 * Initialize the game, only called after added to a frame.
	 */
	public void init() {
		setScreen(new SplashScreen(this));
	}

	/**
	 * The screens should use this method to change between screens. NOTE: The screens should handle
	 * disposing/saving themselves before changing to another gui.
	 */
	public void setScreen(JComponent abstractScreen) {
		if (abstractScreen == null) {
			throw new IllegalArgumentException("AbstractScreen must not be null");
		}
		this.setContentPane(abstractScreen);
		this.screen = abstractScreen;
		abstractScreen.requestFocus();
	}

	public JComponent getCurrentScreen() {
		return screen;
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}

}