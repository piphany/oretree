package net.piphany.oretree;

import net.fabricmc.api.ModInitializer;
import net.piphany.oretree.block.ModBlocks;
import net.piphany.oretree.block.ModFlammableBlockRegistry;
import net.piphany.oretree.item.ModItemGroup;
import net.piphany.oretree.item.ModItems;
import net.piphany.oretree.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OreTree implements ModInitializer {
	public static final String MOD_ID = "oretree";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
	ModItemGroup.registerItemGroups();
	ModBlocks.registerModBlocks();
	ModItems.registerModItems();

	ModWorldGeneration.generateModWorldGen();


	ModFlammableBlockRegistry.registerFlammableBlocks();
	}
}
