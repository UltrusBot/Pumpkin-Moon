package me.ultrusmods.pumpkinmoon;

import me.ultrusmods.pumpkinmoon.register.PumpkinMoonBlocks;
import me.ultrusmods.pumpkinmoon.register.PumpkinMoonEntities;
import me.ultrusmods.pumpkinmoon.register.PumpkinMoonItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.atomic.AtomicBoolean;

public class PumpkinMoonMod implements ModInitializer {
	public static final String MOD_ID = "pumpkinmoon";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
	public static final Identifier DUNGEON_LOOT_TABLE_ID = new Identifier("chests/simple_dungeon");

	@Override
	public void onInitialize() {
		LOGGER.info("Pumpkin Moon has loaded!");
		PumpkinMoonEntities.init();
		PumpkinMoonBlocks.init();
		PumpkinMoonItems.init();
		LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
			if (source.isBuiltin() && DUNGEON_LOOT_TABLE_ID.equals(id)) {
				LootPool.Builder poolBuilder = LootPool.builder()
						.rolls(ConstantLootNumberProvider.create(1))
						.conditionally(RandomChanceLootCondition.builder(0.05f))
						.with(ItemEntry.builder(PumpkinMoonItems.PUMPKIN_MOON_MEDALLION).weight(1).build());
				tableBuilder.pool(poolBuilder);
			}
		});

	}

	public static Identifier id(String name) {
		return new Identifier(MOD_ID, name);
	}
}
