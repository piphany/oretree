package net.piphany.oretree;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.piphany.oretree.data.ModLootTableGenerator;
import net.piphany.oretree.data.ModModelProvider;
import net.piphany.oretree.data.ModRecipeGenerator;

public class OreTreeDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModLootTableGenerator::new);
		pack.addProvider(ModRecipeGenerator::new);
		pack.addProvider(ModModelProvider::new);

	}
}
