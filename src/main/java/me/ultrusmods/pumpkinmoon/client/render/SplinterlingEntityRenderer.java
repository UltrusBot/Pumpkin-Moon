package me.ultrusmods.pumpkinmoon.client.render;

import me.ultrusmods.pumpkinmoon.PumpkinMoonMod;
import me.ultrusmods.pumpkinmoon.client.PumpkinMoonModelLayers;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ZombieEntityRenderer;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.util.Identifier;

public class SplinterlingEntityRenderer extends ZombieEntityRenderer {
    public static final Identifier TEXTURE = PumpkinMoonMod.id("textures/entity/splinterling.png");
    public SplinterlingEntityRenderer(EntityRendererFactory.Context context) {
        super(context, PumpkinMoonModelLayers.SPLINTERLING_LAYER, PumpkinMoonModelLayers.SPLINTERLING_INNER_ARMOR_LAYER, PumpkinMoonModelLayers.SPLINTERLING_OUTER_ARMOR_LAYER);
        addFeature(new SplinterlingOverlayFeature(this, context.getModelLoader()));
    }

    @Override
    public Identifier getTexture(ZombieEntity zombieEntity) {
        return TEXTURE;
    }
}
