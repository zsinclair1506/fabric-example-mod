package net.lynxzz.testmod.util;

import net.lynxzz.testmod.TestMod;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModTags {
    public static class Blocks {

    }

    public static class Items {
        public static final TagKey<Item> ALLOYABLE_METALS = TagKey.of(Registry.ITEM_KEY, new Identifier(TestMod.MOD_ID, "alloyable_metals"));
    }
}
