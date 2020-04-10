package fr.maxlego08.hopper.api.events;

import org.bukkit.entity.Player;

public class EconomyHasMoneyEvent extends EconomyEvent {

	private final Player player;
	private final double money;
	private boolean hasMoney = false;

	public EconomyHasMoneyEvent(Player player, double money) {
		super();
		this.player = player;
		this.money = money;
	}

	/**
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * @return the money
	 */
	public double getMoney() {
		return money;
	}
	
	public boolean hasMoney() {
		return hasMoney;
	}
	
	public void setHasMoney(boolean hasMoney) {
		this.hasMoney = hasMoney;
	}
	
}
