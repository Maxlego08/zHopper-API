package fr.maxlego08.hopper.api.events;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import fr.maxlego08.hopper.api.Hopper;

public class HopperDestroyEvent extends HopperEvent {

	private final Hopper hopper;
	private final Player player;
	private ItemStack itemStack;

	public HopperDestroyEvent(Hopper hopper, Player player, ItemStack itemStack) {
		super();
		this.hopper = hopper;
		this.player = player;
		this.itemStack = itemStack;
	}

	/**
	 * @return the itemStack
	 */
	public ItemStack getItemStack() {
		return itemStack;
	}

	/**
	 * @param itemStack
	 *            the itemStack to set
	 */
	public void setItemStack(ItemStack itemStack) {
		this.itemStack = itemStack;
	}

	/**
	 * @return the hopper
	 */
	public Hopper getHopper() {
		return hopper;
	}

	/**
	 * 
	 * @return
	 */
	public World getWorld() {
		return hopper.getWorld();
	}

	/**
	 * 
	 * @return
	 */
	public Location getLocation() {
		return hopper.getLocation();
	}

	/**
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}

}
