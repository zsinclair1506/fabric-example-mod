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
	* Technetium and Chromium Alloy Tools
	* Golden Rod, texture and recipe, for chromium tools
	*
	 */

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerModStuffs();
	}
}
