package net.lynxzz.testmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents  {
        public static final FoodComponent CRYSTAL_METH;
        public static final FoodComponent LEAN_BOTTLE;
        public static final FoodComponent RITALIN;

    static {
        CRYSTAL_METH = (new FoodComponent.Builder()).hunger(-4).saturationModifier(10.0F).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200), 1.0f).build();
        LEAN_BOTTLE = (new FoodComponent.Builder()).hunger(10).saturationModifier(14.0F).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,600,2),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS,600,2),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE,600,2),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.POISON,100),1.0f).build();
        RITALIN = (new FoodComponent.Builder()).hunger(8).saturationModifier(14.0f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 1800,1), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1800,1), 1.0f).build();
    }
}
