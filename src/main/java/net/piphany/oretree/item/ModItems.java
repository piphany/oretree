package net.piphany.oretree.item;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.piphany.oretree.OreTree;


public class ModItems {
    public static final Item Sliver_ingot =registerItem("sliver_ingot",new Item(
            new FabricItemSettings()));
    public static final Item Raw_Sliver=registerItem("raw_sliver",new Item(
            new FabricItemSettings()));

    private static Item registerItem(String name,Item item){
        return Registry.register(Registries.ITEM,new Identifier(OreTree.MOD_ID,name),item);
    }




    public static void addItemsToItemGroup(){
        addToItemGroup(ModItemGroup.OreTrees, Sliver_ingot);
        addToItemGroup(ModItemGroup.OreTrees, Raw_Sliver);
    }

    private static void addToItemGroup(ItemGroup group ,Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }


    public static void registerModItems(){
        OreTree.LOGGER.debug("Registering Mod Item for"+ OreTree.MOD_ID);

        addItemsToItemGroup();
    }
}
