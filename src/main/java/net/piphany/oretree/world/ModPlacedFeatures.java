package net.piphany.oretree.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
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


    public static void bootstrap(Registerable<PlacedFeature>context){
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context,Coal_Ore_Tree_Placed_Key,configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.Coal_Ore_Tree_Key),
               VegetationPlacedFeatures.modifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(
                       1,0.1f,2),ModBlocks.Coal_Ore_Sapling));
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
