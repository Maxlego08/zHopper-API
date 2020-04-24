package fr.maxlego08.hopper.api.events;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import fr.maxlego08.hopper.api.FakeHopper;

public class HopperGiveEvent extends HopperEvent {

	private final FakeHopper fakeHopper;
	private final CommandSender sender;
	private final Player receiver;
	private ItemStack itemStack;

	public HopperGiveEvent(FakeHopper fakeHopper, CommandSender sender, Player receiver, ItemStack itemStack) {
		super();
		this.fakeHopper = fakeHopper;
		this.sender = sender;
		this.receiver = receiver;
		this.itemStack = itemStack;
	}

	/**
	 * @return the fakeHopper
	 */
	public FakeHopper getFakeHopper() {
		return fakeHopper;
	}

	/**
	 * @return the sender
	 */
	public CommandSender getSender() {
		return sender;
	}

	/**
	 * @return the receiver
	 */
	public Player getReceiver() {
		return receiver;
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

}
