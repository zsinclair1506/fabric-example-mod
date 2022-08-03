package net.lynxzz.testmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.lynxzz.testmod.TestMod;
import net.lynxzz.testmod.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

//TODO add smelting recipes for technetium ores and chromium ores

public class ModBlocks {
    public static final Block RAW_CHROMIUM_BLOCK = registerBlock("raw_chromium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.LYNXZZS_ADDONS);

    public static final Block CHROMIUM_BLOCK = registerBlock("chromium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.LYNXZZS_ADDONS);

    public static final Block CHROMIUM_ORE = registerBlock("chromium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroup.LYNXZZS_ADDONS);

    public static final Block DEEPSLATE_CHROMIUM_ORE = registerBlock("deepslate_chromium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroup.LYNXZZS_ADDONS);

    public static final Block TECHNETIUM_BLOCK = registerBlock("technetium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.LYNXZZS_ADDONS);

    public static final Block NETHER_TECHNETIUM_ORE = registerBlock("nether_technetium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroup.LYNXZZS_ADDONS);

    public static final Block NETHER_ACTIVATED_TECHNETIUM_ORE = registerBlock("nether_activated_technetium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroup.LYNXZZS_ADDONS);

    public static final Block DEEPSLATE_TECHNETIUM_ORE = registerBlock("deepslate_technetium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroup.LYNXZZS_ADDONS);

    public static final Block LEAN_BLOCK = registerBlock("lean_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(1f,100f).requiresTool()),
            ModItemGroup.LYNXZZS_ADDONS);

    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(TestMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }



    public static void registerModBlocks(){
        TestMod.LOGGER.info("Registering ModBlocks for "+ TestMod.MOD_ID);
    }
}
