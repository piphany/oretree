package net.piphany.oretree.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.piphany.oretree.OreTree;
import net.piphany.oretree.block.ModBlocks;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> Coal_Ore_Tree_Placed_Key = registerKey("coal_ore_tree_placed");
    public static final RegistryKey<PlacedFeature> Copper_Ore_Tree_Placed_Key = registerKey("cooper_ore_tree_placed");
    public static final RegistryKey<PlacedFeature> Diamond_Ore_Tree_Placed_Key = registerKey("diamond_ore_tree_placed");
    public static final RegistryKey<PlacedFeature> Emerald_Ore_Tree_Placed_Key = registerKey("emerald_ore_tree_placed");
    public static final RegistryKey<PlacedFeature> Gold_Ore_Tree_Placed_Key = registerKey("gold_ore_tree_placed");
    public static final RegistryKey<PlacedFeature> Iron_Ore_Tree_Placed_Key = registerKey("iron_ore_tree_placed");
    public static final RegistryKey<PlacedFeature> Lapis_Lazuli_Ore_Tree_Placed_Key = registerKey("lapis_lazuli_ore_tree_placed");
    public static final RegistryKey<PlacedFeature> Nether_Quartz_Ore_Tree_Placed_Key = registerKey("nether_quartz_ore_tree_placed");
    public static final RegistryKey<PlacedFeature> Redstone_Ore_Tree_Placed_Key = registerKey("redstone_ore_tree_placed");
    public static final RegistryKey<PlacedFeature> Sliver_Ore_Tree_Placed_Key = registerKey("sliver_ore_tree_placed");




    public static void bootstrap(Registerable<PlacedFeature>context){
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context,Coal_Ore_Tree_Placed_Key,configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.Coal_Ore_Tree_Key),
               VegetationPlacedFeatures.modifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(
                        1,0.02f,0),ModBlocks.Coal_Ore_Sapling));
        register(context,Copper_Ore_Tree_Placed_Key,configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.Copper_Ore_Tree_Key),
                VegetationPlacedFeatures.modifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(
                        1,0.02f,0),ModBlocks.Copper_Ore_Sapling));
        register(context,Diamond_Ore_Tree_Placed_Key,configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.Diamond_Ore_Tree_Key),
                VegetationPlacedFeatures.modifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(
                        1,0.02f,0),ModBlocks.Diamond_Ore_Sapling));
        register(context,Emerald_Ore_Tree_Placed_Key,configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.Emerald_Ore_Tree_Key),
                VegetationPlacedFeatures.modifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(
                        1,0.02f,0),ModBlocks.Emerald_Ore_Sapling));
        register(context,Gold_Ore_Tree_Placed_Key,configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.Gold_Ore_Tree_Key),
                VegetationPlacedFeatures.modifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(
                        1,0.02f,0),ModBlocks.Gold_Ore_Sapling));
        register(context,Iron_Ore_Tree_Placed_Key,configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.Iron_Ore_Tree_Key),
                VegetationPlacedFeatures.modifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(
                        1,0.02f,0),ModBlocks.Iron_Ore_Sapling));
        register(context,Lapis_Lazuli_Ore_Tree_Placed_Key,configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.Lapis_Lazuli_Ore_Tree_Key),
                VegetationPlacedFeatures.modifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(
                        1,0.02f,0),ModBlocks.Lapis_Lazuli_Ore_Sapling));
        register(context,Nether_Quartz_Ore_Tree_Placed_Key,configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.Nether_Quartz_Ore_Tree_Key),
                VegetationPlacedFeatures.modifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(
                        1,0.02f,0),ModBlocks.Nether_Quartz_Ore_Sapling));
        register(context,Redstone_Ore_Tree_Placed_Key,configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.Redstone_Ore_Tree_Key),
                VegetationPlacedFeatures.modifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(
                        1,0.02f,0),ModBlocks.Redstone_Ore_Sapling));
        register(context,Sliver_Ore_Tree_Placed_Key,configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.Sliver_Ore_Tree_Key),
                VegetationPlacedFeatures.modifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(
                        3,0.25f,3),ModBlocks.Sliver_Ore_Sapling));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name){
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE,new Identifier(OreTree.MOD_ID,name));
    }

    private static void register(Registerable<PlacedFeature>context,
                                 RegistryKey<PlacedFeature>Key,
                                 RegistryEntry<ConfiguredFeature<?,?>>configuration,
                                 List<PlacementModifier>modifiers){
        context.register(Key,new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
    private static<FC extends FeatureConfig,F extends Feature<FC>>void register(
            Registerable<PlacedFeature>context,
            RegistryKey<PlacedFeature>Key,
            RegistryEntry<ConfiguredFeature<?,?>>configuration,
            PlacementModifier...modifiers){
        register(context,Key,configuration,List.of(modifiers));
    }
}
