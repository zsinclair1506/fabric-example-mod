package net.lynxzz.testmod.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.lynxzz.testmod.TestMod;
import net.lynxzz.testmod.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs(){
        registerFuels();
    }

    private static void registerFuels(){
        TestMod.LOGGER.info("Registering Fuels for " + TestMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.CRYSTALLINE_METHANOL, 3000);
    }


}
