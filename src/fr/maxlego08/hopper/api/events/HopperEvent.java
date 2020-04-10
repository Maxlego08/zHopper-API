/**
 * 
 */
package fr.maxlego08.hopper.api.events;

import org.bukkit.Bukkit;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * @author Maxlego08
 * 
 */
public class HopperEvent extends Event implements Cancellable {

	private final static HandlerList handlers = new HandlerList();

	protected boolean cancelled;

	/**
	 * 
	 */
	public HopperEvent() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param isAsync
	 */
	public HopperEvent(boolean isAsync) {
		super(isAsync);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.bukkit.event.Event#getHandlers()
	 */
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	@Override
	public boolean isCancelled() {
		return cancelled;
	}

	@Override
	public void setCancelled(boolean c) {
		this.cancelled = c;
	}

	public void callEvent() {
		Bukkit.getPluginManager().callEvent(this);
	}

}
