package net.lynxzz.testmod;

import net.fabricmc.api.ModInitializer;
import net.lynxzz.testmod.block.ModBlocks;
import net.lynxzz.testmod.item.ModItems;
import net.lynxzz.testmod.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final	String MOD_ID = "testmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	/*
	* TODO:
	* Lean Recipe
	* Alloying
	* Chromium Alloy Texture
	* Chromium Alloy Tools
	* Chromium Doors
	* Scrap Alloying for now?
	* Ore Generation
	* Custom Bow
	* Custom flower and crop
	*
	* Post Beta-1 Release
	* Custom Tree
	* Custom Music Disc (Lowkey wanna write a song for this)
	* Custom potion effects and brewing (lean recipe here)
	* Custom Advancements
	* Custom Block Entity and Recipe Types (Alloying here)
	* Custom Fluids (Lean Fluid)
	* New Ore for End Dimension
	* 3D endgame armor for End Ore
	* 
	* Release 1.0.0 :D
	 */

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerModStuffs();
	}
}
