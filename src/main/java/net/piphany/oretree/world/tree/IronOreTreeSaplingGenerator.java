package net.piphany.oretree.world.tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.piphany.oretree.world.ModConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class IronOreTreeSaplingGenerator extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return ModConfiguredFeatures.Iron_Ore_Tree_Key;
    }
}
