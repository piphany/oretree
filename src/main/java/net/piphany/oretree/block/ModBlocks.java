package net.piphany.oretree.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.piphany.oretree.OreTree;
import net.piphany.oretree.item.ModItemGroup;

public class ModBlocks {

    public static final Block Sliver_Ore=registerBlock("sliver_ore",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.OreTrees);



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
