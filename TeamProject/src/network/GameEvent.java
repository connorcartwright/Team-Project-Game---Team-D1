package network;

import java.io.Serializable;

/**
 * Models a game event.
 * 
 * @author Anh Pham
 */
public abstract class GameEvent implements Serializable {
	
	private static final long serialVersionUID = 5351736924124300703L;

	public static interface GameEventListener {
		public void onEventReceived(GameEvent event);
	}

	public static class PlayerDieEvent extends GameEvent {
		private static final long serialVersionUID = 7455242055782855036L;
		public final int killerID;
		public final int killedID;

		public PlayerDieEvent(int killerID, int killedID) {
			this.killerID = killerID;
			this.killedID = killedID;
		}
	}

	public static class ScoreChangedEvent extends GameEvent {
		private static final long serialVersionUID = -6702972540422715379L;
		public final int team1Score;
		public final int team2Score;

		public ScoreChangedEvent(int team1Score, int team2Score) {
			this.team1Score = team1Score;
			this.team2Score = team2Score;
		}
	}

	public static class FootStepEvent extends GameEvent {
		private static final long serialVersionUID = 4014556827130454737L;
		public final int x;
		public final int y;
		public final float noise;

		public FootStepEvent(int x, int y, float noise) {
			this.x = x;
			this.y = y;
			this.noise = noise;
		}
	}

	public static class BulletHitPlayerEvent extends GameEvent {
		private static final long serialVersionUID = 667197569856295166L;
		public final int x;
		public final int y;

		public BulletHitPlayerEvent(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static class BulletHitWallEvent extends GameEvent {
		private static final long serialVersionUID = 4594610802812112579L;
		public final int x;
		public final int y;

		public BulletHitWallEvent(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static class GunShotEvent extends GameEvent {
		private static final long serialVersionUID = -3238104958505763917L;
		public final int x;
		public final int y;
		public final float direction;
		public final int weaponId;

		public GunShotEvent(int x, int y, float direction, int weaponId) {
			this.x = x;
			this.y = y;
			this.direction = direction;
			this.weaponId = weaponId;
		}
	}

	public static class PowerUpPickedUpEvent extends GameEvent {
		private static final long serialVersionUID = 2494937010949207076L;
		public final int x;
		public final int y;
		public final int id;

		public PowerUpPickedUpEvent(int x, int y, int id) {
			this.x = x;
			this.y = y;
			this.id = id;
		}
	}

	public static class GameEndEvent extends GameEvent {
		private static final long serialVersionUID = 4030097780765059510L;
	}
	
}
