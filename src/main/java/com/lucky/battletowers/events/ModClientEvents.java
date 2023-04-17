package com.lucky.battletowers.events;

import com.lucky.battletowers.BattleTowers;
import com.lucky.battletowers.client.models.BattleTowerGolemModel;
import com.lucky.battletowers.client.renderer.BattleTowerGolemRenderer;
import com.lucky.battletowers.entity.custom.ModEntityTypes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BattleTowers.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEvents {
    @SubscribeEvent
    public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntityTypes.BATTLETOWER_GOLEM.get(), BattleTowerGolemRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(BattleTowerGolemModel.LAYER_LOCATION, BattleTowerGolemModel::createBodyLayer);
    }
}
