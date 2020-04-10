package fr.maxlego08.hopper.api.events;

public class EconomyDepositEvent extends EconomyEvent {

	private final String player;
	private final double money;

	public EconomyDepositEvent(String player, double money) {
		super();
		this.player = player;
		this.money = money;
	}

	/**
	 * @return the player
	 */
	public String getPlayer() {
		return player;
	}

	/**
	 * @return the money
	 */
	public double getMoney() {
		return money;
	}
	
}
