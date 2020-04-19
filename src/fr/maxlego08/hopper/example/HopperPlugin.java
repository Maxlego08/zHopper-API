package fr.maxlego08.hopper.example;

import org.bukkit.Bukkit;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import fr.maxlego08.hopper.api.HopperManager;
import fr.maxlego08.hopper.api.Level;

public class HopperPlugin extends JavaPlugin {

	private HopperManager hopperManager;
	private HopperListener hopperListener;

	@Override
	public void onEnable() {

		//Get HopperManager
		RegisteredServiceProvider<HopperManager> provider = getServer().getServicesManager()
				.getRegistration(HopperManager.class);
		hopperManager = provider.getProvider();

		//Add module for every level
		hopperManager.addModule(new ModuleExample("example", 5));

		//Add module for single level
		Level level = hopperManager.getLevel(3);
		level.addModule(new ModuleExample("example", 5));
		
		//Add property for a level
		level.addPropertyIfAbsent("myString", "hey");
		
		//Add property for every level
		hopperManager.addPropertyIfAbsent("myInteger", 10);
		
		hopperManager.saveLevel();
		
		//Add listener
		hopperListener = new HopperListener(hopperManager);
		Bukkit.getPluginManager().registerEvents(hopperListener, this);
	}

}
