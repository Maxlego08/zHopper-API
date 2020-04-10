package fr.maxlego08.hopper.api.events;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import fr.maxlego08.hopper.api.Hopper;

public class HopperLinkEvent extends HopperEvent {

	private final Player player;
	private final Hopper hopper;
	private final Block block;

	public HopperLinkEvent(Player player, Hopper hopper, Block block) {
		super();
		this.player = player;
		this.hopper = hopper;
		this.block = block;
	}

	/**
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * @return the hopper
	 */
	public Hopper getHopper() {
		return hopper;
	}

	/**
	 * @return the block
	 */
	public Block getBlock() {
		return block;
	}

}
