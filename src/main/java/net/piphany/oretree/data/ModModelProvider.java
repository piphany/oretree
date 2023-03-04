package net.piphany.oretree.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.piphany.oretree.block.ModBlocks;
import net.piphany.oretree.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.Sliver_Ore);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.Coal_Ore_Leaves);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.Copper_Ore_Leaves);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.Diamond_Ore_Leaves);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.Emerald_Ore_Leaves);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.Gold_Ore_Leaves);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.Iron_Ore_Leaves);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.Lapis_Lazuli_Ore_Leaves);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.Nether_Quartz_Ore_Leaves);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.Redstone_Ore_Leaves);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.Sliver_Ore_Leaves);

        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.Coal_Ore_Sapling,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.Copper_Ore_Sapling,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.Diamond_Ore_Sapling,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.Emerald_Ore_Sapling,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.Gold_Ore_Sapling,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.Iron_Ore_Sapling,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.Lapis_Lazuli_Ore_Sapling,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.Nether_Quartz_Ore_Sapling,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.Redstone_Ore_Sapling,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.Sliver_Ore_Sapling,BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.Raw_Sliver, Models.GENERATED);
        itemModelGenerator.register(ModItems.Sliver_ingot, Models.GENERATED);

    }
}
