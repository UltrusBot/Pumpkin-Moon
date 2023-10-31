package me.ultrusmods.pumpkinmoon.register;

import me.ultrusmods.pumpkinmoon.PumpkinMoonMod;
import me.ultrusmods.pumpkinmoon.block.BlockTypeData;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class PumpkinMoonBlocks {
    public static final Block SPOOKY_PLANKS = register("spooky_planks", new Block(Block.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.PURPLE)));
    public static final Block SPOOKY_SLAB = register("spooky_slab", new SlabBlock(Block.Settings.copy(Blocks.OAK_SLAB).mapColor(MapColor.PURPLE)));
    public static final Block SPOOKY_STAIRS = register("spooky_stairs", new StairsBlock(SPOOKY_PLANKS.getDefaultState(), Block.Settings.copy(Blocks.OAK_STAIRS).mapColor(MapColor.PURPLE)));
    public static final Block SPOOKY_BUTTON = register("spooky_button", new AbstractButtonBlock(Block.Settings.copy(Blocks.OAK_BUTTON).mapColor(MapColor.PURPLE), BlockTypeData.SPOOKY_BLOCK_SET_TYPE, 30, true));
    public static final Block SPOOKY_PRESSURE_PLATE = register("spooky_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, Block.Settings.copy(Blocks.OAK_PRESSURE_PLATE).mapColor(MapColor.PURPLE), BlockTypeData.SPOOKY_BLOCK_SET_TYPE));
    public static final Block SPOOKY_FENCE = register("spooky_fence", new FenceBlock(Block.Settings.copy(Blocks.OAK_FENCE).mapColor(MapColor.PURPLE)));
    public static final Block SPOOKY_FENCE_GATE = register("spooky_fence_gate", new FenceGateBlock(Block.Settings.copy(Blocks.OAK_FENCE_GATE).mapColor(MapColor.PURPLE), BlockTypeData.SPOOKY_WOOD_TYPE));
    public static final Block SPOOKY_LOG = register("spooky_log", Blocks.createPillarBlock(MapColor.PURPLE, MapColor.PURPLE_TERRACOTTA));
    public static final Block STRIPPED_SPOOKY_LOG = register("stripped_spooky_log", Blocks.createPillarBlock(MapColor.PURPLE, MapColor.PURPLE_TERRACOTTA));
    public static final Block SPOOKY_WOOD = register("spooky_wood", Blocks.createPillarBlock(MapColor.PURPLE, MapColor.PURPLE));
    public static final Block STRIPPED_SPOOKY_WOOD = register("stripped_spooky_wood", Blocks.createPillarBlock(MapColor.PURPLE_TERRACOTTA, MapColor.PURPLE_TERRACOTTA));
    public static void init() {
        StrippableBlockRegistry.register(SPOOKY_LOG, STRIPPED_SPOOKY_LOG);
        StrippableBlockRegistry.register(SPOOKY_WOOD, STRIPPED_SPOOKY_WOOD);
    }
    public static Block register(String name, Block block) {
        return Registry.register(Registries.BLOCK, PumpkinMoonMod.id(name), block);
    }
}
