package me.ultrusmods.pumpkinmoon.datagen;

import me.ultrusmods.pumpkinmoon.register.PumpkinMoonBlocks;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;

public class PumpkinMoonBlockFamilies {
    public static final BlockFamily SPOOKY_WOOD = BlockFamilies.register(PumpkinMoonBlocks.SPOOKY_PLANKS)
            .slab(PumpkinMoonBlocks.SPOOKY_SLAB)
            .stairs(PumpkinMoonBlocks.SPOOKY_STAIRS)
            .button(PumpkinMoonBlocks.SPOOKY_BUTTON)
            .pressurePlate(PumpkinMoonBlocks.SPOOKY_PRESSURE_PLATE)
            .fence(PumpkinMoonBlocks.SPOOKY_FENCE)
            .fenceGate(PumpkinMoonBlocks.SPOOKY_FENCE_GATE)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();
}
