package com.lucky.battletowers.entity.custom;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class BattleTowerGolemEntity extends Monster {
    public BattleTowerGolemEntity(EntityType<? extends Monster> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public static AttributeSupplier.Builder getBattleTowerGolemAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 200)
                .add(Attributes.MOVEMENT_SPEED, 0.2f)
                .add(Attributes.ARMOR, 4)
                .add(Attributes.ATTACK_DAMAGE, 8)
                .add(Attributes.ATTACK_KNOCKBACK, 1)
                .add(Attributes.ATTACK_SPEED, 0.25)
                .add(Attributes.KNOCKBACK_RESISTANCE, 1);
    }

    // AI here!!!
    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(2, new RestrictSunGoal(this));
        this.goalSelector.addGoal(3, new FleeSunGoal(this, 1.0D));
        this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, IronGolem.class, true));
    }

    // Here is the tick procedure. This happens 20 times a second.
    @Override
    public void tick() {
        super.tick();
    }


    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return super.getAmbientSound();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource pDamageSource) {
        return super.getHurtSound(pDamageSource);
    }
}

