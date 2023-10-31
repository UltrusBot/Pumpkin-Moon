package me.ultrusmods.pumpkinmoon.datagen;

import me.ultrusmods.pumpkinmoon.register.PumpkinMoonBlocks;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.model.BlockStateModelGenerator;
import net.minecraft.registry.HolderLookup;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class PumpkinMoonDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(PumpkinMoonModelGenerator::new);
        pack.addProvider(PumpkinMoonBlockTagProvider::new);
    }


    public static class PumpkinMoonModelGenerator extends FabricModelProvider {

        public PumpkinMoonModelGenerator(FabricDataOutput output) {
            super(output);
        }

        @Override
        public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
            blockStateModelGenerator.registerCubeAllModelTexturePool(PumpkinMoonBlockFamilies.SPOOKY_WOOD.getBaseBlock())
                            .family(PumpkinMoonBlockFamilies.SPOOKY_WOOD);
        }

        @Override
        public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        }
    }
    public static class PumpkinMoonBlockTagProvider extends FabricTagProvider.BlockTagProvider {


        public PumpkinMoonBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        protected void configure(HolderLookup.Provider arg) {
            getOrCreateTagBuilder(BlockTags.PLANKS)
                    .add(PumpkinMoonBlocks.SPOOKY_PLANKS);
            getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                    .add(PumpkinMoonBlocks.SPOOKY_FENCE);
            getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                    .add(PumpkinMoonBlocks.SPOOKY_FENCE_GATE);
            getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                    .add(PumpkinMoonBlocks.SPOOKY_PRESSURE_PLATE);
            getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                    .add(PumpkinMoonBlocks.SPOOKY_BUTTON);
            getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                    .add(PumpkinMoonBlocks.SPOOKY_SLAB);

        }
    }
}
