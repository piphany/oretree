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
    public static final RegistryKey<ConfiguredFeature<?,?>> Copper_Ore_Tree_Key =registerKey("copper_ore_tree");
    public static final RegistryKey<ConfiguredFeature<?,?>> Diamond_Ore_Tree_Key =registerKey("diamond_ore_tree");
    public static final RegistryKey<ConfiguredFeature<?,?>> Emerald_Ore_Tree_Key =registerKey("emerald_ore_tree");
    public static final RegistryKey<ConfiguredFeature<?,?>> Gold_Ore_Tree_Key =registerKey("gold_ore_tree");
    public static final RegistryKey<ConfiguredFeature<?,?>> Iron_Ore_Tree_Key =registerKey("iron_ore_tree");
    public static final RegistryKey<ConfiguredFeature<?,?>> Lapis_Lazuli_Ore_Tree_Key =registerKey("lapis_lazuli_ore_tree");
    public static final RegistryKey<ConfiguredFeature<?,?>> Nether_Quartz_Ore_Tree_Key =registerKey("nether_quartz_ore_tree");
    public static final RegistryKey<ConfiguredFeature<?,?>> Redstone_Ore_Tree_Key =registerKey("redstone_ore_tree");
    public static final RegistryKey<ConfiguredFeature<?,?>> Sliver_Ore_Tree_Key =registerKey("sliver_ore_tree");

    public static void bootstrap(Registerable<ConfiguredFeature<?,?>> context){

        register(context,Coal_Ore_Tree_Key,Feature.TREE,new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.COAL_ORE),new StraightTrunkPlacer(3,2,1),
                BlockStateProvider.of(ModBlocks.Coal_Ore_Leaves),new BlobFoliagePlacer(ConstantIntProvider.create(3),ConstantIntProvider.create(2),3),
                new TwoLayersFeatureSize(1,0,2)).build());
        register(context,Copper_Ore_Tree_Key,Feature.TREE,new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.COPPER_ORE),new StraightTrunkPlacer(3,2,1),
                BlockStateProvider.of(ModBlocks.Copper_Ore_Leaves),new BlobFoliagePlacer(ConstantIntProvider.create(3),ConstantIntProvider.create(2),3),
                new TwoLayersFeatureSize(1,0,2)).build());
        register(context,Diamond_Ore_Tree_Key,Feature.TREE,new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.DIAMOND_ORE),new StraightTrunkPlacer(3,2,1),
                BlockStateProvider.of(ModBlocks.Diamond_Ore_Leaves),new BlobFoliagePlacer(ConstantIntProvider.create(3),ConstantIntProvider.create(2),3),
                new TwoLayersFeatureSize(1,0,2)).build());
        register(context,Emerald_Ore_Tree_Key,Feature.TREE,new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.EMERALD_ORE),new StraightTrunkPlacer(3,2,1),
                BlockStateProvider.of(ModBlocks.Emerald_Ore_Leaves),new BlobFoliagePlacer(ConstantIntProvider.create(3),ConstantIntProvider.create(2),3),
                new TwoLayersFeatureSize(1,0,2)).build());
        register(context,Gold_Ore_Tree_Key,Feature.TREE,new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.GOLD_ORE),new StraightTrunkPlacer(3,2,1),
                BlockStateProvider.of(ModBlocks.Gold_Ore_Leaves),new BlobFoliagePlacer(ConstantIntProvider.create(3),ConstantIntProvider.create(2),3),
                new TwoLayersFeatureSize(1,0,2)).build());
        register(context,Iron_Ore_Tree_Key,Feature.TREE,new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.IRON_ORE),new StraightTrunkPlacer(3,2,1),
                BlockStateProvider.of(ModBlocks.Iron_Ore_Leaves),new BlobFoliagePlacer(ConstantIntProvider.create(3),ConstantIntProvider.create(2),3),
                new TwoLayersFeatureSize(1,0,2)).build());
        register(context,Lapis_Lazuli_Ore_Tree_Key,Feature.TREE,new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.LAPIS_ORE),new StraightTrunkPlacer(3,2,1),
                BlockStateProvider.of(ModBlocks.Lapis_Lazuli_Ore_Leaves),new BlobFoliagePlacer(ConstantIntProvider.create(3),ConstantIntProvider.create(2),3),
                new TwoLayersFeatureSize(1,0,2)).build());
        register(context,Nether_Quartz_Ore_Tree_Key,Feature.TREE,new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.NETHER_QUARTZ_ORE),new StraightTrunkPlacer(3,2,1),
                BlockStateProvider.of(ModBlocks.Nether_Quartz_Ore_Leaves),new BlobFoliagePlacer(ConstantIntProvider.create(3),ConstantIntProvider.create(2),3),
                new TwoLayersFeatureSize(1,0,2)).build());
        register(context,Redstone_Ore_Tree_Key,Feature.TREE,new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.REDSTONE_ORE),new StraightTrunkPlacer(3,2,1),
                BlockStateProvider.of(ModBlocks.Redstone_Ore_Leaves),new BlobFoliagePlacer(ConstantIntProvider.create(3),ConstantIntProvider.create(2),3),
                new TwoLayersFeatureSize(1,0,2)).build());
        register(context,Sliver_Ore_Tree_Key,Feature.TREE,new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.Sliver_Ore),new StraightTrunkPlacer(3,2,1),
                BlockStateProvider.of(ModBlocks.Sliver_Ore_Leaves),new BlobFoliagePlacer(ConstantIntProvider.create(3),ConstantIntProvider.create(2),3),
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