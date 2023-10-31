package me.ultrusmods.pumpkinmoon.block;

import me.ultrusmods.pumpkinmoon.PumpkinMoonMod;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class PumpkinMoonBlockTags {
    public static final TagKey<Block> SPOOKY_LOGS = TagKey.of(RegistryKeys.BLOCK, PumpkinMoonMod.id("spooky_logs"));
}
