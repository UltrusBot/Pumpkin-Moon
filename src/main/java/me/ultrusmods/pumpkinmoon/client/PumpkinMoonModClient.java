package me.ultrusmods.pumpkinmoon.client;

import me.ultrusmods.pumpkinmoon.client.render.HauntedHorseEntityRenderer;
import me.ultrusmods.pumpkinmoon.client.render.SplinterlingEntityRenderer;
import me.ultrusmods.pumpkinmoon.register.PumpkinMoonEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class PumpkinMoonModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        PumpkinMoonModelLayers.init();
        EntityRendererRegistry.register(PumpkinMoonEntities.HAUNTED_HORSE, HauntedHorseEntityRenderer::new);
        EntityRendererRegistry.register(PumpkinMoonEntities.SPLINTERLING, SplinterlingEntityRenderer::new);

    }
}
