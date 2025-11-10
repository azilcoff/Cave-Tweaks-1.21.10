package net.azilcoff.cavetweaks;

import net.azilcoff.cavetweaks.item.ModItems;
import net.azilcoff.cavetweaks.tag.ModBlockTags;
import net.azilcoff.cavetweaks.tag.ModItemTags;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CaveTweaks implements ModInitializer {
	public static final String MOD_ID = "cavetweaks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModItemTags.registerModItemTags();
        ModBlockTags.registerModBlockTags();
	}
}