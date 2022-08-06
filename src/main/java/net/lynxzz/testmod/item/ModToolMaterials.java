package net.lynxzz.testmod.item;

import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    CHROMIUM(2, 1024, 7.25F, 2.0F, 17, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.CHROMIUM_INGOT});
    }),
    CHROMIUM_ALLOY(3, 1536, 8.25F, 2.5F, 19, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.CHROMIUM_ALLOY_INGOT});
    }),
    ACTIVATED_TECHNETIUM(4, 4096, 12.0F, 5.0F, 30, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.ACTIVATED_TECHNETIUM_INGOT});
    });

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
