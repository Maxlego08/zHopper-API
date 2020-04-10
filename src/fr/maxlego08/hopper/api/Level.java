package fr.maxlego08.hopper.api;

import java.util.List;

import fr.maxlego08.hopper.economy.Economy;
import fr.maxlego08.hopper.modules.Module;
import fr.maxlego08.hopper.zcore.utils.builder.ItemBuilder;

public interface Level {

	/**
	 * Get level name
	 * @return name
	 */
	String getName();
	
	/**
	 * Get level to integer
	 * @return integer
	 */
	int getInteger();
	
	/**
	 * 
	 * @return
	 */
	int getMaxDistanceLink();
	
	/**
	 * 
	 * @return
	 */
	int getMaxDistanceSuction();
	
	/**
	 * 
	 * @return
	 */
	int getMaxDistanceKill();
	
	/**
	 * 
	 * @return
	 */
	int getMaxLink();
	
	/**
	 * 
	 * @return
	 */
	int getMaxItemPerSecond();
	
	/**
	 * 
	 * @return
	 */
	int getMaxKillPerSecond();
	
	/**
	 * 
	 * @return
	 */
	Level next();
	
	/**
	 * 
	 * @return
	 */
	ItemBuilder build();
	
	/**
	 * 
	 * @return
	 */
	boolean isDefault();
	
	/**
	 * 
	 * @return
	 */
	long getPrice();
	
	/**
	 * 
	 * @return
	 */
	Economy getEconomy();
	
	/**
	 * 
	 * @return
	 */
	List<Module> getModules();
	
	/**
	 * 
	 * @return
	 */
	boolean canKillMonster();
	
	/**
	 * 
	 * @return
	 */
	boolean canKillPassive();
	
	/**
	 * 
	 * @param hopper
	 */
	void run(Hopper hopper);
	
}
