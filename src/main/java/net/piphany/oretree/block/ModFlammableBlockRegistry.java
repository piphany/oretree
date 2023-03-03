package net.piphany.oretree.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlockRegistry {
    public static void registerFlammableBlocks(){
        FlammableBlockRegistry registry=FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.Coal_Ore_Sapling,30,60);
    }
}
