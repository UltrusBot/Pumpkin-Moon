package me.ultrusmods.pumpkinmoon.client.render;

import me.ultrusmods.pumpkinmoon.PumpkinMoonMod;
import me.ultrusmods.pumpkinmoon.client.PumpkinMoonModelLayers;
import me.ultrusmods.pumpkinmoon.entity.HauntedHorseEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.HorseBaseEntityRenderer;
import net.minecraft.client.render.entity.model.HorseEntityModel;
import net.minecraft.util.Identifier;

public class HauntedHorseEntityRenderer extends HorseBaseEntityRenderer<HauntedHorseEntity, HorseEntityModel<HauntedHorseEntity>> {
    public static final Identifier TEXTURE = PumpkinMoonMod.id("textures/entity/haunted_horse/haunted_horse.png");

    public HauntedHorseEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new HorseEntityModel<>(ctx.getPart(PumpkinMoonModelLayers.HAUNTED_HORSE_LAYER)), 1.2f);
        this.addFeature(new HauntedHorseOverlayFeature(this, ctx.getModelLoader()));
    }


    @Override
    public Identifier getTexture(HauntedHorseEntity entity) {
        return TEXTURE;
    }
}
