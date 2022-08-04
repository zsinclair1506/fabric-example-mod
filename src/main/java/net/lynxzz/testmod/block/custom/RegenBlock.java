package net.lynxzz.testmod.block.custom;

import com.mojang.brigadier.LiteralMessage;
import com.mojang.brigadier.Message;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.LiteralTextContent;
import net.minecraft.text.Text;
import net.minecraft.text.TextContent;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Util;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RegenBlock extends Block{

    public RegenBlock(Settings settings) {
        super(settings);


    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if(!world.isClient()){
            if(entity instanceof LivingEntity){
                LivingEntity livingEntity = ((LivingEntity) entity);
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100));
            }
        }

        super.onSteppedOn(world, pos, state, entity);
    }
}
