package net.lynxzz.testmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.lynxzz.testmod.TestMod;
import net.lynxzz.testmod.block.custom.*;
import net.lynxzz.testmod.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ModBlocks {
    public static final Block RAW_CHROMIUM_BLOCK = registerBlock("raw_chromium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.LYNXZZS_ADDONS);

    public static final Block CHROMIUM_BLOCK = registerBlock("chromium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.LYNXZZS_ADDONS);

    public static final Block CHROMIUM_ORE = registerBlock("chromium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroup.LYNXZZS_ADDONS);

    public static final Block DEEPSLATE_CHROMIUM_ORE = registerBlock("deepslate_chromium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroup.LYNXZZS_ADDONS);

    public static final Block TECHNETIUM_BLOCK = registerBlock("technetium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6.0f).requiresTool()), ModItemGroup.LYNXZZS_ADDONS);

    public static final Block NETHER_TECHNETIUM_ORE = registerBlock("nether_technetium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0f).requiresTool()), ModItemGroup.LYNXZZS_ADDONS);

    public static final Block NETHER_ACTIVATED_TECHNETIUM_ORE = registerBlock("nether_activated_technetium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0f).requiresTool()), ModItemGroup.LYNXZZS_ADDONS);

    public static final Block DEEPSLATE_TECHNETIUM_ORE = registerBlock("deepslate_technetium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0f).requiresTool()), ModItemGroup.LYNXZZS_ADDONS);

    public static final Block LEAN_BLOCK = registerBlock("lean_block",
            new LeanBlock(FabricBlockSettings.of(Material.METAL).strength(1f,100f).requiresTool()),
            ModItemGroup.LYNXZZS_ADDONS);

    public static final Block REGEN_PEDESTAL = registerBlock("regen_pedestal",
            new RegenBlock(FabricBlockSettings.of(Material.METAL).strength(8.0f).requiresTool()), ModItemGroup.LYNXZZS_ADDONS,
            "tooltip.testmod.regen_pedestal");

    public static final Block PERFECT_REGEN_PEDESTAL = registerBlock("perfect_regen_pedestal",
            new PerfectRegenBlock(FabricBlockSettings.of(Material.METAL).strength(8.0f).requiresTool()), ModItemGroup.LYNXZZS_ADDONS,
            "tooltip.testmod.perfect_regen_pedestal");

    public static final Block CRYSTALLINE_METHANOL_ORE = registerBlock("crystalline_methanol_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool()), ModItemGroup.LYNXZZS_ADDONS);

    public static final Block DEEPSLATE_CRYSTALLINE_METHANOL_ORE = registerBlock("deepslate_crystalline_methanol_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), ModItemGroup.LYNXZZS_ADDONS);

    public static final Block CHROMIUM_PRESSURE_PLATE = registerBlock("chromium_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.of(Material.METAL)
                    .strength(4.0f).requiresTool()), ModItemGroup.LYNXZZS_ADDONS);

    public static final Block CHROMIUM_BUTTON = registerBlock("chromium_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool().noCollision()),
            ModItemGroup.LYNXZZS_ADDONS);

    public static final Block CHROMIUM_WALL = registerBlock("chromium_wall",
            new WallBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()),
                ModItemGroup.LYNXZZS_ADDONS);

    public static final Block CHROMIUM_FENCE_GATE = registerBlock("chromium_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()),
                ModItemGroup.LYNXZZS_ADDONS);

    private static Block registerBlock(String name, Block block, ItemGroup group, String tooltipKey){
        registerBlockItem(name, block, group, tooltipKey);
        return Registry.register(Registry.BLOCK, new Identifier(TestMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group, String tooltipKey){
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)){
                    @Override
                    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                        tooltip.add(Text.translatable(tooltipKey));
                    }
                });
    }

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
