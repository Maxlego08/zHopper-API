package fr.maxlego08.hopper.api.events;

import fr.maxlego08.hopper.api.Hopper;
import fr.maxlego08.hopper.modules.Module;

public class HopperModuleRunEvent extends HopperEvent {

	private final Hopper hopper;
	private final Module module;
	private final boolean isAsync;

	public HopperModuleRunEvent(Hopper hopper, Module module, boolean async) {
		super();
		this.hopper = hopper;
		this.module = module;
		this.isAsync = async;
	}

	/**
	 * @return the hopper
	 */
	public Hopper getHopper() {
		return hopper;
	}

	/**
	 * @return the module
	 */
	public Module getModule() {
		return module;
	}

	/**
	 * @return the isAsync
	 */
	public boolean isAsync() {
		return isAsync;
	}

}
