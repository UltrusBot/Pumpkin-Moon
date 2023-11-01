package me.ultrusmods.pumpkinmoon.datagen;

import me.ultrusmods.pumpkinmoon.block.PumpkinMoonBlockTags;
import me.ultrusmods.pumpkinmoon.register.PumpkinMoonBlocks;
import me.ultrusmods.pumpkinmoon.register.PumpkinMoonItems;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.model.BlockStateModelGenerator;
import net.minecraft.data.client.model.Models;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.registry.HolderLookup;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class PumpkinMoonDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(PumpkinMoonModelGenerator::new);
        pack.addProvider(PumpkinMoonBlockTagProvider::new);
        pack.addProvider(PumpkinMoonRecipeProvider::new);
        pack.addProvider(PumpkinMoonBlockLootProvider::new);
    }


    public static class PumpkinMoonModelGenerator extends FabricModelProvider {

        public PumpkinMoonModelGenerator(FabricDataOutput output) {
            super(output);
        }

        @Override
        public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
            blockStateModelGenerator.registerCubeAllModelTexturePool(PumpkinMoonBlockFamilies.SPOOKY_WOOD.getBaseBlock())
                            .family(PumpkinMoonBlockFamilies.SPOOKY_WOOD);
            blockStateModelGenerator.registerLog(PumpkinMoonBlocks.SPOOKY_LOG)
                    .log(PumpkinMoonBlocks.SPOOKY_LOG)
                    .wood(PumpkinMoonBlocks.SPOOKY_WOOD);
            blockStateModelGenerator.registerLog(PumpkinMoonBlocks.STRIPPED_SPOOKY_LOG)
                    .log(PumpkinMoonBlocks.STRIPPED_SPOOKY_LOG)
                    .wood(PumpkinMoonBlocks.STRIPPED_SPOOKY_WOOD);
        }

        @Override
        public void generateItemModels(ItemModelGenerator itemModelGenerator) {
            itemModelGenerator.register(PumpkinMoonItems.PUMPKIN_MOON_MEDALLION, Models.SINGLE_LAYER_ITEM);
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
            getOrCreateTagBuilder(PumpkinMoonBlockTags.SPOOKY_LOGS)
                    .add(PumpkinMoonBlocks.SPOOKY_LOG)
                    .add(PumpkinMoonBlocks.STRIPPED_SPOOKY_LOG)
                    .add(PumpkinMoonBlocks.SPOOKY_WOOD)
                    .add(PumpkinMoonBlocks.STRIPPED_SPOOKY_WOOD);
            getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                    .add(PumpkinMoonBlocks.SPOOKY_LOG);
        }
    }
    public static class PumpkinMoonRecipeProvider extends FabricRecipeProvider {
        public PumpkinMoonRecipeProvider(FabricDataOutput output) {
            super(output);
        }

        @Override
        public void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
            generateFamily(exporter, PumpkinMoonBlockFamilies.SPOOKY_WOOD);

        }
    }
    public static class PumpkinMoonBlockLootProvider extends FabricBlockLootTableProvider {
        protected PumpkinMoonBlockLootProvider(FabricDataOutput dataOutput) {
            super(dataOutput);
        }

        @Override
        public void generate() {
            this.addDrop(PumpkinMoonBlocks.SPOOKY_PLANKS);
            this.slabDrops(PumpkinMoonBlocks.SPOOKY_SLAB);
            this.addDrop(PumpkinMoonBlocks.SPOOKY_STAIRS);
            this.addDrop(PumpkinMoonBlocks.SPOOKY_BUTTON);
            this.addDrop(PumpkinMoonBlocks.SPOOKY_PRESSURE_PLATE);
            this.addDrop(PumpkinMoonBlocks.SPOOKY_FENCE);
            this.addDrop(PumpkinMoonBlocks.SPOOKY_FENCE_GATE);
            this.addDrop(PumpkinMoonBlocks.SPOOKY_LOG);
            this.addDrop(PumpkinMoonBlocks.STRIPPED_SPOOKY_LOG);
            this.addDrop(PumpkinMoonBlocks.SPOOKY_WOOD);
            this.addDrop(PumpkinMoonBlocks.STRIPPED_SPOOKY_WOOD);
        }
    }
}
