package net.piphany.oretree.world;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.piphany.oretree.OreTree;
import net.piphany.oretree.block.ModBlocks;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?,?>> Coal_Ore_Tree_Key =registerKey("coal_ore_tree");

    public static void bootstrap(Registerable<ConfiguredFeature<?,?>> context){

        register(context,Coal_Ore_Tree_Key,Feature.TREE,new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.STONE),new StraightTrunkPlacer(3,2,1),
                BlockStateProvider.of(ModBlocks.Coal_Ore_Leaves),new BlobFoliagePlacer(ConstantIntProvider.create(3),ConstantIntProvider.create(2),3),
                new TwoLayersFeatureSize(1,0,2)).build());
    }

    private static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE,new Identifier(OreTree.MOD_ID,name));
    }
    private static <FC extends FeatureConfig,F extends Feature<FC>> void register(
            Registerable<ConfiguredFeature<?,?>>context,
            RegistryKey<ConfiguredFeature<?,?>>Key,
            F feature,FC configuration){
        context.register(Key,new ConfiguredFeature<>(feature,configuration));
            }
}