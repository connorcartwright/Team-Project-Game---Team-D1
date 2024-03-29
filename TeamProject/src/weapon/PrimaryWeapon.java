package weapon;

/**
 * The <code>Primary Weapon</code> class extends the generic Weapon class. It defines the data that
 * each Primary Weapon below (e.g. Shotgun, Sniper) must have in order to be a Primary Weapon. The
 * Primary Weapon will take up the clientPlayers first Weapon slot, which will be accessed by
 * pressing the '1' key on the keyboard. This will be the clientPlayers strongest weapon and will be
 * primarily what they will use.
 * 
 * @see Weapon
 * @author Team D1
 * @author Connor Cartwright
 *
 */
public abstract class PrimaryWeapon extends Weapon {

	/**
	 * This is the constructor for creating a new <code>Primary Weapon</code> which takes nine
	 * parameters, which when combined completely define the behaviour of the weapon - how it will
	 * fire, how much damage it will do, etc. Primary Weapons will be the clientPlayers main defence
	 * against enemies.
	 * 
	 * @param accuracy
	 *            the accuracy of the weapon; the lower the accuracy the more random the projectiles
	 *            will be.
	 * @param damage
	 *            the damage of the weapon - this is the amount it will do to the enemies health on
	 *            hit.
	 * @param cooldown
	 *            the time it takes in ms between shots; a cooldown of 100 is 10 projectiles per
	 *            second.
	 * @param range
	 *            how far the projectiles fly before dropping.
	 * @param numProjectiles
	 *            how many projectiles are fired on each shot.
	 * @param projectileSpeed
	 *            how fast the projectiles fly.
	 * @param reloadTime
	 *            the time it takes in ms for the gun to reload after the entire magazine is
	 *            expended.
	 * @param magSize
	 *            the number of projectiles per magazine.
	 * @param maxAmmo
	 *            the maximum ammo the player should be able to hold at any one time for this
	 *            weapon.
	 */
	public PrimaryWeapon(int weaponId, double accuracy, double damage, int cooldown, int range, int numProjectiles, double projectileSpeed,
			int reloadTime, int magSize, int maxAmmo) {
		super(weaponId, accuracy, damage, cooldown, range, numProjectiles, projectileSpeed, reloadTime, magSize, maxAmmo);
	}

}
