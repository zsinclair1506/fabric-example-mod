package net.lynxzz.testmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.lynxzz.testmod.TestMod;
import net.lynxzz.testmod.item.custom.*;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item RAW_CHROMIUM = registerItem("raw_chromium",
            new Item(new FabricItemSettings().group(ModItemGroup.LYNXZZS_ADDONS)));

    public static final Item CHROMIUM_INGOT = registerItem("chromium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.LYNXZZS_ADDONS)));

    public static final Item CHROMIUM_ALLOY_INGOT = registerItem("chromium_alloy_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.LYNXZZS_ADDONS)));

    public static final Item TECHNETIUM_INGOT = registerItem("technetium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.LYNXZZS_ADDONS)));

    public static final Item ACTIVATED_TECHNETIUM_INGOT = registerItem("activated_technetium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.LYNXZZS_ADDONS)));

    public static final Item CRYSTALLINE_METHANOL = registerItem("crystalline_methanol",
            new Item(new FabricItemSettings().group(ModItemGroup.LYNXZZS_ADDONS)));

    public static final Item LEAN_BOTTLE = registerItem("lean_bottle",
            new LeanBottleItem(new FabricItemSettings().group(ModItemGroup.LYNXZZS_ADDONS).food(ModFoodComponents.LEAN_BOTTLE)));

    public static final Item CRYSTAL_METH = registerItem("crystal_meth",
            new Item(new FabricItemSettings().group(ModItemGroup.LYNXZZS_ADDONS).food(ModFoodComponents.CRYSTAL_METH)));

    public static final Item RITALIN = registerItem("ritalin",
            new Item(new FabricItemSettings().group(ModItemGroup.LYNXZZS_ADDONS).food(ModFoodComponents.RITALIN)));

    public static final Item CHROMIUM_SWORD = registerItem("chromium_sword",
            new ModSwordItem(ModToolMaterials.CHROMIUM, 3,-2.4f,
                    new FabricItemSettings().group(ModItemGroup.LYNXZZS_ADDONS)));

    public static final Item CHROMIUM_AXE = registerItem("chromium_axe",
            new ModAxeItem(ModToolMaterials.CHROMIUM, 6,-3.05f,
                    new FabricItemSettings().group(ModItemGroup.LYNXZZS_ADDONS)));

    public static final Item CHROMIUM_SHOVEL = registerItem("chromium_shovel",
            new ModShovelItem(ModToolMaterials.CHROMIUM, 2,-3.0f,
                    new FabricItemSettings().group(ModItemGroup.LYNXZZS_ADDONS)));

    public static final Item CHROMIUM_HOE = registerItem("chromium_hoe",
            new ModHoeItem(ModToolMaterials.CHROMIUM, (int) -2.5,0.0f,
                    new FabricItemSettings().group(ModItemGroup.LYNXZZS_ADDONS)));

    public static final Item CHROMIUM_PICKAXE = registerItem("chromium_pickaxe",
            new ModPickaxeItem(ModToolMaterials.CHROMIUM, 2,-2.8f ,
                    new FabricItemSettings().group(ModItemGroup.LYNXZZS_ADDONS)));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name), item);
    }


    public static void registerModItems(){
        TestMod.LOGGER.info("Registering Mod Items for " + TestMod.MOD_ID);

    }

}
