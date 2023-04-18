package com.lucky.battletowers.entity;

import com.lucky.battletowers.BattleTowers;
import com.lucky.battletowers.entity.custom.BattleTowerGolemEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BattleTowers.MODID);

    public static final RegistryObject<EntityType<BattleTowerGolemEntity>> BATTLETOWER_GOLEM =
            ENTITY.register("battle_tower_golem",
                    () -> EntityType.Builder.of(BattleTowerGolemEntity::new, MobCategory.MONSTER).sized(0.6f, 1.8f).build(new ResourceLocation(BattleTowers.MODID, "battle_tower_golem").toString()));

    public static void register(IEventBus eventBus)
    {
        ENTITY.register(eventBus);
    }
}
