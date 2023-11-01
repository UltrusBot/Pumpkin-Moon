package me.ultrusmods.pumpkinmoon.client.render;

import me.ultrusmods.pumpkinmoon.PumpkinMoonMod;
import me.ultrusmods.pumpkinmoon.client.PumpkinMoonModelLayers;
import me.ultrusmods.pumpkinmoon.client.model.SplinterlingEntityModel;
import me.ultrusmods.pumpkinmoon.entity.HauntedHorseEntity;
import me.ultrusmods.pumpkinmoon.entity.SplinterlingEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.DrownedEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.client.render.entity.model.HorseEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.mob.DrownedEntity;
import net.minecraft.util.Identifier;

public class SplinterlingOverlayFeature<T extends SplinterlingEntity> extends FeatureRenderer<T, SplinterlingEntityModel<T>>{
    private static final Identifier OVERLAY = PumpkinMoonMod.id("textures/entity/splinterling_overlay.png");
    private final SplinterlingEntityModel<T> overlayModel;

    public SplinterlingOverlayFeature(FeatureRendererContext<T, SplinterlingEntityModel<T>> context, EntityModelLoader loader) {
        super(context);
        overlayModel = new SplinterlingEntityModel<>(loader.getModelPart(PumpkinMoonModelLayers.SPLINTERLING_LAYER_OUTER));
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, T entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
        render(this.getContextModel(), overlayModel, OVERLAY, matrices, vertexConsumers, 15728880, entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch, tickDelta, 1.0F, 1.0F, 1.0F);
    }


}
