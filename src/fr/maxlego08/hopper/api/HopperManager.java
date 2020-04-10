package fr.maxlego08.hopper.api;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;

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
	 * Allows you to interact with a Hopper
	 * 
	 * @param player
	 * @param block
	 * @param event
	 */
	void interactBlock(Player player, Block block, PlayerInteractEvent event);

	/**
	 * 
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
	 * 
	 * @param hopper
	 * @param player
	 */
	void updateLevel(Hopper hopper, Player player);
	
	/**
	 * 
	 * @param hopper
	 */
	void deleteHopper(Hopper hopper);
	
	/**
	 * 
	 * @param player
	 * @param hopper
	 */
	void linkHopper(Player player, Hopper hopper);

}
