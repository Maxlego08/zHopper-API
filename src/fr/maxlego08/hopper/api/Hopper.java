package fr.maxlego08.hopper.api;

import java.util.List;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import fr.maxlego08.hopper.modules.Module;

public interface Hopper {

	/**
	 * Allows to recover the owner of the hopper
	 * @return uuid of owner
	 */
	UUID getOwner();
	
	/**
	 * 
	 * @return uuid of hopper
	 */
	UUID getUniqueId();
	
	/**
	 * Allows you to retrieve the list of players who have access to modify the hopper
	 * @return uuid list
	 */
	List<UUID> getWhitelistPlayers();
	
	/**
	 * Allows to recover the location of the hopper if the hopper is placed, otherwise a null will be returned
	 * @return location of hopper
	 */
	Location getLocation();
	
	/**
	 * Allows to recover the block according to the location 
	 * @return
	 */
	Block getBlock();
	
	/**
	 * Allows you to recover the Bukkit Hopper depending on the block.
	 * @return hopper
	 */
	org.bukkit.block.Hopper toBukkitHopper();
	
	/**
	 * Allows to recover the world where the hopper is placed
	 * @return world
	 */
	World getWorld();

	/**
	 * Get hopper level
	 * @return level
	 */
	int getLevel();
	
	/**
	 * Transforme level to Level object
	 * @return
	 */
	Level toLevel();
	
	/**
	 * Get manager
	 * @return manager
	 */
	HopperManager getManager();
	
	/**
	 * Returns the list of chests linked to the hopper
	 * @return list
	 */
	List<Location> getLinkedContainers();
	
	/**
	 * Used to find out if the hopper is valid and can be used
	 * @return true if is valid
	 */
	boolean isValid();
	
	/**
	 * Used to find out if a module is activated
	 * @param module
	 * @return
	 */
	boolean isActive(Module module);

	/**
	 * Lets you know if a hopper is fake or not
	 * @return
	 */
	boolean isFake();
	
	/**
	 * Allows you to deactivate or activate a module
	 * @param module
	 * @param active
	 */
	void setActive(Module module, boolean active);
	
	/**
	 * Lets you know if it is possible to link a new chest to the hopper
	 * @return
	 */
	boolean canLink();
	
	/**
	 * Set hopper level
	 * @param level
	 */
	void setLevel(int level);
	
	/**
	 * Open the hopper configuration to a player
	 * @param player
	 */
	void openConfiguration(Player player);

	/**
	 * Destroy hopper
	 */
	void destroy();
	
	/**
	 * Method that will run all modules
	 */
	void run();
	
	/**
	 * Used to connect a chest to a hopper
	 * @param player
	 * @param block
	 */
	void linkContainer(Player player, Block block);
}
