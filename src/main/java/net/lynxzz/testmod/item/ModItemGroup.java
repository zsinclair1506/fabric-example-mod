package net.lynxzz.testmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.lynxzz.testmod.TestMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup LYNXZZS_ADDONS = FabricItemGroupBuilder.build(new Identifier(TestMod.MOD_ID, "lynxzz_addons"),
            () -> new ItemStack(ModItems.TECHNETIUM_INGOT));
}
