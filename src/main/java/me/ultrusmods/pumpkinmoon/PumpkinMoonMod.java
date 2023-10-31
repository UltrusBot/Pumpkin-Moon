package me.ultrusmods.pumpkinmoon;

import me.ultrusmods.pumpkinmoon.register.PumpkinMoonBlocks;
import me.ultrusmods.pumpkinmoon.register.PumpkinMoonItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PumpkinMoonMod implements ModInitializer {
	public static final String MOD_ID = "pumpkinmoon";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Pumpkin Moon has loaded!");
		PumpkinMoonBlocks.init();
		PumpkinMoonItems.init();

	}

	public static Identifier id(String name) {
		return new Identifier(MOD_ID, name);
	}
}
