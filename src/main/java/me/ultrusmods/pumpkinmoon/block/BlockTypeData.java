package me.ultrusmods.pumpkinmoon.block;

import me.ultrusmods.pumpkinmoon.PumpkinMoonMod;
import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.sign.SignType;

public class BlockTypeData {
    // Regular wood types all use the same sounds, so we can just copy the oak type
    public static final BlockSetType SPOOKY_BLOCK_SET_TYPE = BlockSetTypeBuilder.copyOf(BlockSetType.OAK)
            .register(PumpkinMoonMod.id("spooky"));

    public static final SignType SPOOKY_WOOD_TYPE = WoodTypeBuilder.copyOf(SignType.OAK)
            .build(PumpkinMoonMod.id("spooky"), SPOOKY_BLOCK_SET_TYPE);
}
