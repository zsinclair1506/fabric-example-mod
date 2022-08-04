package net.lynxzz.testmod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class LeanBlock extends Block {
    public LeanBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (!world.isClient()) {
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = ((LivingEntity) entity);
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300, 2));
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 300,1));
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 300));
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS,300,2));
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.UNLUCK, 6000,2));
            }
        }

        super.onSteppedOn(world, pos, state, entity);
    }

}
