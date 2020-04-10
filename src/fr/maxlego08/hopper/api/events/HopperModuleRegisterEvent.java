package fr.maxlego08.hopper.api.events;

import java.util.List;

import fr.maxlego08.hopper.api.Level;
import fr.maxlego08.hopper.modules.Module;

public class HopperModuleRegisterEvent extends HopperEvent{

	private final List<Module> modules;
	private final Level level;

	public HopperModuleRegisterEvent(List<Module> modules, Level level) {
		super();
		this.modules = modules;
		this.level = level;
	}

	/**
	 * @return the modules
	 */
	public List<Module> getModules() {
		return modules;
	}

	/**
	 * @return the level
	 */
	public Level getLevel() {
		return level;
	}

}
