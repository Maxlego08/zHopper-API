package fr.maxlego08.hopper.api.events;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class HopperPreCreateEvent extends HopperEvent {

	private final Player player;
	private final Block block;
	private boolean createHopper;

	public HopperPreCreateEvent(Player player, Block block, boolean createHopper) {
		super();
		this.player = player;
		this.block = block;
		this.createHopper = createHopper;
	}

	/**
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * @return the block
	 */
	public Block getBlock() {
		return block;
	}

	/**
	 * @return the createHopper
	 */
	public boolean isCreateHopper() {
		return createHopper;
	}

	/**
	 * @param createHopper
	 *            the createHopper to set
	 */
	public void setCreateHopper(boolean createHopper) {
		this.createHopper = createHopper;
	}

}
