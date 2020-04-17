package fr.maxlego08.hopper.example;

import org.bukkit.Bukkit;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import fr.maxlego08.hopper.api.HopperManager;
import fr.maxlego08.hopper.api.Level;

public class HopperPlugin extends JavaPlugin {

	private HopperManager hopperManager;
	private HopperListener  hopperListener;

	@Override
	public void onEnable() {

		RegisteredServiceProvider<HopperManager> provider = getServer().getServicesManager()
				.getRegistration(HopperManager.class);
		hopperManager = provider.getProvider();

		hopperManager.addModule(new ModuleExample("example", 5));
		
		Level level = hopperManager.getLevel(3);
		level.addModule(new ModuleExample("example", 5));
		
		hopperListener = new HopperListener(hopperManager);
		Bukkit.getPluginManager().registerEvents(hopperListener, this);
	}

}
