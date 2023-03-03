package net.piphany.oretree.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.piphany.oretree.OreTree;
import net.piphany.oretree.item.ModItemGroup;
import net.piphany.oretree.world.tree.CoalOreTreeSaplingGenerator;

public class ModBlocks {
    //添加新方块
    public static final Block Sliver_Ore=registerBlock("sliver_ore",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.OreTrees);
    public static final Block Coal_Ore_Leaves=registerBlock("coal_ore_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4.0f).requiresTool()),ModItemGroup.OreTrees);
   // public static final Block Cooper_Ore_Leaves=registerBlock("cooper_ore_leaves",
   //         new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4.0f).requiresTool()),ModItemGroup.OreTrees);
   // public static final Block Diamond_Ore_Leaves=registerBlock("diamond_ore_leaves",
   //         new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4.0f).requiresTool()),ModItemGroup.OreTrees);
   // public static final Block Emerald_Ore_Leaves=registerBlock("emerald_ore_leaves",
   //         new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4.0f).requiresTool()),ModItemGroup.OreTrees);
   // public static final Block Gold_Ore_Leaves=registerBlock("gold_ore_leaves",
   //         new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4.0f).requiresTool()),ModItemGroup.OreTrees);
   // public static final Block Iron_Ore_Leaves=registerBlock("iron_ore_leaves",
   //         new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4.0f).requiresTool()),ModItemGroup.OreTrees);
   // public static final Block Lapis_Lazuli_Ore_Leaves=registerBlock("lapis_lazuli_ore_leaves",
   //         new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4.0f).requiresTool()),ModItemGroup.OreTrees);
   // public static final Block Nether_Quartz_Ore_Leaves=registerBlock("nether_quartz_ore_leaves",
   //         new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4.0f).requiresTool()),ModItemGroup.OreTrees);
   // public static final Block Redstone_Ore_Leaves=registerBlock("redstone_ore_leaves",
   //         new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4.0f).requiresTool()),ModItemGroup.OreTrees);
   // public static final Block Sliver_Ore_Leaves=registerBlock("sliver_ore_leaves",
   //         new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4.0f).requiresTool()),ModItemGroup.OreTrees);
     public static final Block Coal_Ore_Sapling=registerBlock("coal_ore_sapling",
            new SaplingBlock(new CoalOreTreeSaplingGenerator(),FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(4.0f).requiresTool()),ModItemGroup.OreTrees);
   // public static final Block Cooper_Ore_Sapling=registerBlock("cooper_ore_sapling",
   //         new SaplingBlock(FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(4.0f).requiresTool()),ModItemGroup.OreTrees);
   // public static final Block Diamond_Ore_Sapling=registerBlock("diamond_ore_sapling",
   //         new SaplingBlock(FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(4.0f).requiresTool()),ModItemGroup.OreTrees);
   // public static final Block Emerald_Ore_Sapling=registerBlock("emerald_ore_sapling",
   //         new SaplingBlock(FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(4.0f).requiresTool()),ModItemGroup.OreTrees);
   // public static final Block Gold_Ore_Sapling=registerBlock("gold_ore_sapling",
   //         new SaplingBlock(FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(4.0f).requiresTool()),ModItemGroup.OreTrees);
   // public static final Block Iron_Ore_Sapling=registerBlock("iron_ore_sapling",
   //         new SaplingBlock(FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(4.0f).requiresTool()),ModItemGroup.OreTrees);
   // public static final Block Lapis_Lazuli_Ore_Sapling=registerBlock("lapis_lazuli_ore_sapling",
   //         new SaplingBlock(FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(4.0f).requiresTool()),ModItemGroup.OreTrees);
   // public static final Block Nether_Quartz_Ore_Sapling=registerBlock("nether_quartz_ore_sapling",
   //         new SaplingBlock(FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(4.0f).requiresTool()),ModItemGroup.OreTrees);
   // public static final Block Redstone_Ore_Sapling=registerBlock("redstone_ore_sapling",
   //         new SaplingBlock(FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(4.0f).requiresTool()),ModItemGroup.OreTrees);
   // public static final Block Sliver_Ore_Sapling=registerBlock("sliver_ore_sapling",
   //         new SaplingBlock(FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(4.0f).requiresTool()),ModItemGroup.OreTrees);



    private static Block registerBlock(String name,Block block,ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK,new Identifier(OreTree.MOD_ID,name),block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        Item item= Registry.register(Registries.ITEM,new Identifier(OreTree.MOD_ID,name),
                new BlockItem(block,new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks()  {
        OreTree.LOGGER.debug("Registering ModBlocks for"+ OreTree.MOD_ID);
    }
}
