package me.ultrusmods.pumpkinmoon.register;

import me.ultrusmods.pumpkinmoon.PumpkinMoonMod;
import net.minecraft.block.*;
import net.minecraft.block.sign.SignType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class PumpkinMoonBlocks {
    public static final Block SPOOKY_PLANKS = register("spooky_planks", new Block(Block.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.PURPLE)));
    public static final Block SPOOKY_SLAB = register("spooky_slab", new SlabBlock(Block.Settings.copy(Blocks.OAK_SLAB).mapColor(MapColor.PURPLE)));
    public static final Block SPOOKY_STAIRS = register("spooky_stairs", new StairsBlock(SPOOKY_PLANKS.getDefaultState(), Block.Settings.copy(Blocks.OAK_STAIRS).mapColor(MapColor.PURPLE)));
    public static final Block SPOOKY_BUTTON = register("spooky_button", new AbstractButtonBlock(Block.Settings.copy(Blocks.OAK_BUTTON).mapColor(MapColor.PURPLE), BlockSetType.ACACIA, 30, true));
    public static final Block SPOOKY_PRESSURE_PLATE = register("spooky_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, Block.Settings.copy(Blocks.OAK_PRESSURE_PLATE).mapColor(MapColor.PURPLE), BlockSetType.ACACIA));
    public static final Block SPOOKY_FENCE = register("spooky_fence", new FenceBlock(Block.Settings.copy(Blocks.OAK_FENCE).mapColor(MapColor.PURPLE)));
    public static final Block SPOOKY_FENCE_GATE = register("spooky_fence_gate", new FenceGateBlock(Block.Settings.copy(Blocks.OAK_FENCE_GATE).mapColor(MapColor.PURPLE), SignType.ACACIA));

    public static void init() {
        // No-op
    }
    public static Block register(String name, Block block) {
        return Registry.register(Registries.BLOCK, PumpkinMoonMod.id(name), block);
    }
}
