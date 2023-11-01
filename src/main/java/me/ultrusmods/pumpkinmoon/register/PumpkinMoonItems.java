package me.ultrusmods.pumpkinmoon.register;

import me.ultrusmods.pumpkinmoon.PumpkinMoonMod;
import me.ultrusmods.pumpkinmoon.item.PumpkinMoonMedallionItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Rarity;

import java.util.ArrayList;

public class PumpkinMoonItems {
    public static ArrayList<Item> ITEMS = new ArrayList<>();
    public static final ItemGroup PUMPKIN_MOON_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            PumpkinMoonMod.id("pumpkin_moon_items"),
            FabricItemGroup.builder()
                    .name(Text.translatable("itemGroup.pumpkinmoon.items"))
                    .icon(Items.PUMPKIN::getDefaultStack)
                    .entries(((displayParameters, itemStackCollector) -> ITEMS.forEach(itemStackCollector::addItem))).build());
    public static final Item SPOOKY_PLANKS = registerBlockItem("spooky_planks", PumpkinMoonBlocks.SPOOKY_PLANKS);
    public static final Item SPOOKY_SLAB = registerBlockItem("spooky_slab", PumpkinMoonBlocks.SPOOKY_SLAB);
    public static final Item SPOOKY_STAIRS = registerBlockItem("spooky_stairs", PumpkinMoonBlocks.SPOOKY_STAIRS);
    public static final Item SPOOKY_BUTTON = registerBlockItem("spooky_button", PumpkinMoonBlocks.SPOOKY_BUTTON);
    public static final Item SPOOKY_PRESSURE_PLATE = registerBlockItem("spooky_pressure_plate", PumpkinMoonBlocks.SPOOKY_PRESSURE_PLATE);
    public static final Item SPOOKY_FENCE = registerBlockItem("spooky_fence", PumpkinMoonBlocks.SPOOKY_FENCE);
    public static final Item SPOOKY_FENCE_GATE = registerBlockItem("spooky_fence_gate", PumpkinMoonBlocks.SPOOKY_FENCE_GATE);
    public static final Item SPOOKY_LOG = registerBlockItem("spooky_log", PumpkinMoonBlocks.SPOOKY_LOG);
    public static final Item STRIPPED_SPOOKY_LOG = registerBlockItem("stripped_spooky_log", PumpkinMoonBlocks.STRIPPED_SPOOKY_LOG);
    public static final Item SPOOKY_WOOD = registerBlockItem("spooky_wood", PumpkinMoonBlocks.SPOOKY_WOOD);
    public static final Item STRIPPED_SPOOKY_WOOD = registerBlockItem("stripped_spooky_wood", PumpkinMoonBlocks.STRIPPED_SPOOKY_WOOD);

    public static final Item HAUNTED_HORSE_SPAWN_EGG = register("haunted_horse_spawn_egg", new SpawnEggItem(PumpkinMoonEntities.HAUNTED_HORSE, 0x000000, 0xFAA228, new Item.Settings()));
    public static final Item SPLINTERLING_SPAWN_EGG = register("splinterling_spawn_egg", new SpawnEggItem(PumpkinMoonEntities.SPLINTERLING, 0x400094, 0xFAA228, new Item.Settings()));
    public static final Item PUMPKIN_MOON_MEDALLION = register("pumpkin_moon_medallion", new PumpkinMoonMedallionItem(new Item.Settings().maxCount(1).rarity(Rarity.RARE)));
    public static void init() {
        // No-op

    }
    public static Item register(String name, Item item) {
        ITEMS.add(item);
        return Registry.register(Registries.ITEM, PumpkinMoonMod.id(name), item);
    }
    public static Item registerBlockItem(String name, Block block) {
        return register(name, new BlockItem(block, new Item.Settings()));
    }
}
