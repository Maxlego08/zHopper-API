package fr.maxlego08.hopper.api;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import fr.maxlego08.hopper.modules.Module;
import fr.maxlego08.hopper.zcore.utils.storage.Saveable;

public interface HopperManager extends Saveable {

	/**
	 * Allows you to retrieve the list of all hoppers
	 * 
	 * @return hoppers
	 */
	List<Hopper> getHoppers();

	/**
	 * Allows you to recover a hopper according to a location
	 * 
	 * @param location
	 * @return {@link Hopper}
	 */
	Hopper getHopper(Location location);

	/**
	 * Lets check if a location is a hopper
	 * 
	 * @param location
	 * @return true if location is hopper
	 */
	boolean isHopper(Location location);

	/**
	 * Get {@link Level} from integer
	 * 
	 * @param level
	 * @return
	 */
	Level getLevel(int level);

	/**
	 * Return default level
	 * 
	 * @return level
	 */
	Level getDefaultLevel();

	/**
	 * Get next level
	 * 
	 * @param level
	 * @return level
	 */
	Level next(int level);
	
	/**
	 * Allows you to create a new hopper
	 * 
	 * @param block
	 * @param player
	 */
	void createHopper(Block block, Player player);

	/**
	 * Cancels the BlockBreakEvent if a player breaks a hopper
	 * 
	 * @param block
	 * @param player
	 * @param event
	 */
	void destroyHopper(Block block, Player player, BlockBreakEvent event);

	/**
	 * Allows you to interact with a Hopper
	 * 
	 * @param player
	 * @param block
	 * @param event
	 */
	void interactHopper(Player player, Block block, PlayerInteractEvent event);
	
	/**
	 * Allows you to interact with a block
	 * 
	 * @param player
	 * @param block
	 * @param event
	 */
	void interactBlock(Player player, Block block, PlayerInteractEvent event);

	/**
	 * Destroy a hopper
	 * 
	 * @param player
	 * @param hopper
	 */
	void destroyHopper(Player player, Hopper hopper);

	/**
	 * 
	 */
	void loadLevel();

	/**
	 * 
	 */
	void saveLevel();

	/**
	 * 
	 */
	void saveDefaultLevel();

	/**
	 * Adding a level to the hopper
	 * 
	 * @param hopper
	 * @param player
	 */
	void updateLevel(Hopper hopper, Player player);
	
	/**
	 * Delete a hopper
	 * 
	 * @param hopper
	 */
	void deleteHopper(Hopper hopper);
	
	/**
	 * Allows you to put the player in "link" mode, when he will click on a container he will connect to the selected hopper
	 * 
	 * @param player
	 * @param hopper
	 */
	void linkHopper(Player player, Hopper hopper);
	
	/**
	 * Add a module for all levels
	 * 
	 * @param module
	 */
	void addModule(Module module);
	
	/**
	 * 
	 */
	void run();


	/**
	 * Allows you to add a property for every level, be careful if the property already exists it will be replaced.
	 * @param key
	 * @param value
	 */
	void addProperty(String key, Object value);
	
	/**
	 * Add a property for every level if it does not exist
	 * @param key
	 * @param value
	 */
	void addPropertyIfAbsent(String key, Object value);
	
	/**
	 * Allows you to remove a property for every level, be careful if this property is a default then it will not be removed.
	 * @param key
	 */
	void removeProperty(String key);
	
	/**
	 * Allows you to update the modules of all levels according to the config
	 */
	void updateLevel();
	
}
