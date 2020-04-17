package fr.maxlego08.hopper.example;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;

import fr.maxlego08.hopper.api.Hopper;
import fr.maxlego08.hopper.api.Level;
import fr.maxlego08.hopper.modules.Module;
import fr.maxlego08.hopper.zcore.utils.inventory.Button;

public class ModuleExample extends Module {

	public ModuleExample(String name, int priority) {
		super(name, priority);
		//If you need to interact with world or entity you need to set this at false
		this.runAsync = false;
	}

	@Override
	public void execute(Hopper hopper, Level level) {

		if (level.getInteger() >= 3){

			Block block = hopper.getLocation().getBlock().getRelative(BlockFace.UP);
			if (block.getType().equals(Material.AIR)){
			
				block.setType(Material.DIRT);
				
			}
			
		}
		
	}

	@Override
	public Button getButton() {
		Button button = new Button(5, "§aExample module", 1, 0, "§e");
		return button;
	}

	@Override
	public boolean isCooldown(Hopper hopper, Level level) {
		//timer is in millisecond
		return super.isCooldown(hopper, "examplekey", 1000);
	}

}
