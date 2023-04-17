package com.lucky.battletowers.client.renderer;

import com.lucky.battletowers.BattleTowers;
import com.lucky.battletowers.client.models.BattleTowerGolemModel;
import com.lucky.battletowers.entity.custom.BattleTowerGolemEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BattleTowerGolemRenderer extends MobRenderer<BattleTowerGolemEntity, BattleTowerGolemModel> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(BattleTowers.MODID, "assets/battletowers/textures/entities/battletower_golem.png");
    public BattleTowerGolemRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new BattleTowerGolemModel(ctx.bakeLayer(BattleTowerGolemModel.LAYER_LOCATION)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(BattleTowerGolemEntity pEntity) {
        return null;
    }
}
