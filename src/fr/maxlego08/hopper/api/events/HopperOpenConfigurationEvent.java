package fr.maxlego08.hopper.api.events;

import org.bukkit.entity.Player;

import fr.maxlego08.hopper.api.Hopper;

public class HopperOpenConfigurationEvent extends HopperEvent {

	private final Hopper hopper;
	private final Player player;

	public HopperOpenConfigurationEvent(Hopper hopper, Player player) {
		super();
		this.hopper = hopper;
		this.player = player;
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

}
