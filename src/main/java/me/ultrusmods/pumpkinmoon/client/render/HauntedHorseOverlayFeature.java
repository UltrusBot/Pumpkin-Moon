package me.ultrusmods.pumpkinmoon.client.render;

import me.ultrusmods.pumpkinmoon.PumpkinMoonMod;
import me.ultrusmods.pumpkinmoon.client.PumpkinMoonModelLayers;
import me.ultrusmods.pumpkinmoon.entity.HauntedHorseEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.client.render.entity.model.HorseEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class HauntedHorseOverlayFeature extends FeatureRenderer<HauntedHorseEntity, HorseEntityModel<HauntedHorseEntity>> {
    private static final Identifier OVERLAY = PumpkinMoonMod.id("textures/entity/haunted_horse/outer_layer.png");
    private final HorseEntityModel<HauntedHorseEntity> overlayModel;

    public HauntedHorseOverlayFeature(FeatureRendererContext<HauntedHorseEntity, HorseEntityModel<HauntedHorseEntity>> context, EntityModelLoader loader) {
        super(context);
        overlayModel = new HorseEntityModel<>(loader.getModelPart(PumpkinMoonModelLayers.HAUNTED_HORSE_LAYER_OUTER));


    }

    @Override
    public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, HauntedHorseEntity entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
        render(this.getContextModel(), overlayModel, OVERLAY, matrices, vertexConsumers, 15728880, entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch, tickDelta, 1.0F, 1.0F, 1.0F);
    }
}
