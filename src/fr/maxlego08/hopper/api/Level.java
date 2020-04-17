package fr.maxlego08.hopper.api;

import java.util.List;
import java.util.Map;

import org.bukkit.inventory.ItemStack;

import fr.maxlego08.hopper.economy.Economy;
import fr.maxlego08.hopper.modules.Module;

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
	ItemStack build();
	
	/**
	 * 
	 * @return
	 */
	ItemStack getItemStack();
	
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
	 * @return You will get a copy of the list of modules
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
	 * @param key
	 * @return
	 */
	Object getProperty(String key);
	
	/**
	 * 
	 * @param key
	 * @return
	 */
	int getIntegerAsProperty(String key);
	
	/**
	 * 
	 * @param key
	 * @return
	 */
	boolean getBooleanAsProperty(String key);
	
	/**
	 * 
	 * @param key
	 * @return
	 */
	long getLongAsProperty(String key);
	
	/**
	 *
	 * @return
	 */
	Map<String, Object> getProperties();
	
	/**
	 * 
	 * @param hopper
	 */
	void run(Hopper hopper);
	
	/**
	 * When you add a module the priorities will be recalculated
	 * @param module
	 */
	void addModule(Module module);
	
}
