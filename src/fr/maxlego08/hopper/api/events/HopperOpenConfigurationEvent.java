package fr.maxlego08.hopper.api.events;

import org.bukkit.entity.Player;

import fr.maxlego08.hopper.api.Hopper;

public class HopperOpenConfigurationEvent extends HopperEvent {

	private final Hopper hopper;
	private final Player player;
	private boolean isOwner;

	public HopperOpenConfigurationEvent(Hopper hopper, Player player, boolean isOwner) {
		super();
		this.hopper = hopper;
		this.player = player;
		this.isOwner = isOwner;
	}

	/**
	 * @return the hopper
	 */
	public Hopper getHopper() {
		return hopper;
	}

	/**
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * @return the isOwner
	 */
	public boolean isOwner() {
		return isOwner;
	}

	/**
	 * @param isOwner
	 *            the isOwner to set
	 */
	public void setOwner(boolean isOwner) {
		this.isOwner = isOwner;
	}

}
