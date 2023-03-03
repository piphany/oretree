package net.piphany.oretree.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.piphany.oretree.block.ModBlocks;
import net.piphany.oretree.item.ModItems;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {


        addDrop(ModBlocks.Sliver_Ore,oreDrops(ModBlocks.Sliver_Ore, ModItems.Raw_Sliver));
    }
}
