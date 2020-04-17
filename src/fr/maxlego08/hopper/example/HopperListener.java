package fr.maxlego08.hopper.example;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import fr.maxlego08.hopper.api.Hopper;
import fr.maxlego08.hopper.api.HopperManager;
import fr.maxlego08.hopper.api.Level;
import fr.maxlego08.hopper.api.events.HopperModuleRunEvent;
import fr.maxlego08.hopper.modules.Module;

public class HopperListener implements Listener {

	private final HopperManager hopperManager;

	public HopperListener(HopperManager hopperManager) {
		super();
		this.hopperManager = hopperManager;
	}
	
	@EventHandler
	public void onRun(HopperModuleRunEvent event){
		
		Hopper hopper = event.getHopper();
		Level level = event.getLevel();
		Module module = event.getModule();
		
	}

}
