package fr.maxlego08.hopper.api.events;

import org.bukkit.entity.Player;

import fr.maxlego08.hopper.api.Hopper;
import fr.maxlego08.hopper.api.Level;

public class HopperUpgradeEvent extends HopperEvent {

	private final Hopper hopper;
	private final Level currentLevel;
	private Level newLevel;
	private final Player player;

	public HopperUpgradeEvent(Hopper hopper, Level currentLevel, Level newLevel, Player player) {
		super();
		this.hopper = hopper;
		this.currentLevel = currentLevel;
		this.newLevel = newLevel;
		this.player = player;
	}

	/**
	 * @return the hopper
	 */
	public Hopper getHopper() {
		return hopper;
	}

	/**
	 * @return the currentLevel
	 */
	public Level getCurrentLevel() {
		return currentLevel;
	}

	/**
	 * @return the newLevel
	 */
	public Level getNewLevel() {
		return newLevel;
	}

	/**
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * @param newLevel
	 *            the newLevel to set
	 */
	public void setNewLevel(Level newLevel) {
		this.newLevel = newLevel;
	}

}
