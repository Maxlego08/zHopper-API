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
	 * @return the property maxDistanceLink
	 */
	int getMaxDistanceLink();
	
	/**
	 * 
	 * @return the property maxDistanceSuction
	 */
	int getMaxDistanceSuction();
	
	/**
	 * 
	 * @return the property maxDistanceKill
	 */
	int getMaxDistanceKill();
	
	/**
	 * 
	 * @return the property maxLink
	 */
	int getMaxLink();
	
	/**
	 * 
	 * @return the property maxItemPerSecond
	 */
	int getMaxItemPerSecond();
	
	/**
	 * 
	 * @return the property maxKillPerSecond 
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
	 * @return the price
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
	 * @return the property 
	 */
	boolean canKillMonster();
	
	/**
	 * @return the property passiveKill
	 */
	boolean canKillPassive();
	
	/**
	 * Allows to recover a property in a Object
	 * @param key
	 * @return object
	 */
	Object getProperty(String key);
	
	/**
	 * Allows to recover a property in a integer
	 * @param key
	 * @return integer
	 */
	int getIntegerAsProperty(String key);
	
	/**
	 * Allows to recover a property in a boolean
	 * @param key
	 * @return boolean
	 */
	boolean getBooleanAsProperty(String key);
	
	/**
	 * Allows to recover a property in a long
	 * @param key
	 * @return long
	 */
	long getLongAsProperty(String key);
	
	/**
	 * Used to retrieve the list of properties
	 * @return map of properties
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
	
	/**
	 * Allows you to add a property in a level, be careful if the property already exists it will be replaced.
	 * @param key
	 * @param value
	 */
	void addProperty(String key, Object value);
	
	/**
	 * Add a property to a level if it does not exist
	 * @param key
	 * @param value
	 */
	void addPropertyIfAbsent(String key, Object value);
	
	/**
	 * Allows you to remove a property, be careful if this property is a default then it will not be removed.
	 * @param key
	 */
	void removeProperty(String key);

	/**
	 * Allows to update the modules of a level according to the config
	 */
	void updateModule();
	
	/**
	 * Lets you know if a property is a default
	 * @param key
	 * @return
	 */
	boolean isDefaultProperty(String key);
	
}
