package com.lucky.battletowers.events;

import com.lucky.battletowers.BattleTowers;
import com.lucky.battletowers.entity.custom.BattleTowerGolemEntity;
import com.lucky.battletowers.entity.custom.ModEntityTypes;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BattleTowers.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCommonEvents {

    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.BATTLETOWER_GOLEM.get(), BattleTowerGolemEntity.getBattleTowerGolemAttributes().build());
    }
}
