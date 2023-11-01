package me.ultrusmods.pumpkinmoon.client;

import me.ultrusmods.pumpkinmoon.PumpkinMoonMod;
import me.ultrusmods.pumpkinmoon.client.model.SplinterlingEntityModel;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.model.Dilation;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.HorseEntityModel;

public class PumpkinMoonModelLayers {
    public static final EntityModelLayer HAUNTED_HORSE_LAYER = new EntityModelLayer(PumpkinMoonMod.id("haunted_horse"), "main");
    public static final EntityModelLayer HAUNTED_HORSE_LAYER_OUTER = new EntityModelLayer(PumpkinMoonMod.id("haunted_horse_outer"), "outer");
    public static final EntityModelLayer SPLINTERLING_LAYER = new EntityModelLayer(PumpkinMoonMod.id("splinterling"), "main");
    public static final EntityModelLayer SPLINTERLING_INNER_ARMOR_LAYER = new EntityModelLayer(PumpkinMoonMod.id("splinterling"), "inner_armor");
    public static final EntityModelLayer SPLINTERLING_OUTER_ARMOR_LAYER = new EntityModelLayer(PumpkinMoonMod.id("splinterling"), "outer_armor");
    public static final EntityModelLayer SPLINTERLING_LAYER_OUTER = new EntityModelLayer(PumpkinMoonMod.id("splinterling"), "outer");
    public static void init() {
        EntityModelLayerRegistry.registerModelLayer(HAUNTED_HORSE_LAYER, () ->
                TexturedModelData.of(HorseEntityModel.getModelData(Dilation.NONE), 64, 64));
        EntityModelLayerRegistry.registerModelLayer(HAUNTED_HORSE_LAYER_OUTER, () ->
                TexturedModelData.of(HorseEntityModel.getModelData(new Dilation(0.07f)), 64, 64));
        EntityModelLayerRegistry.registerModelLayer(SPLINTERLING_LAYER, () ->
                SplinterlingEntityModel.getTexturedModelData(Dilation.NONE));
        EntityModelLayerRegistry.registerModelLayer(SPLINTERLING_INNER_ARMOR_LAYER, () ->
                SplinterlingEntityModel.getTexturedModelData(new Dilation(0.5f)));
        EntityModelLayerRegistry.registerModelLayer(SPLINTERLING_OUTER_ARMOR_LAYER, () ->
                SplinterlingEntityModel.getTexturedModelData(new Dilation(1.0f)));
        EntityModelLayerRegistry.registerModelLayer(SPLINTERLING_LAYER_OUTER, () ->
                SplinterlingEntityModel.getTexturedModelData(new Dilation(0.1f)));


    }
}
