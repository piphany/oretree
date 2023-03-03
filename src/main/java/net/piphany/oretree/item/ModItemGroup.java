package net.piphany.oretree.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.piphany.oretree.OreTree;
import net.minecraft.item.ItemGroup;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup OreTrees;
    public static void registerItemGroups(){
        OreTrees = FabricItemGroup.builder(new Identifier(OreTree.MOD_ID,"oretree"))
                .displayName(Text.translatable("itemgroup.oretrees"))
                .icon(()->new ItemStack(ModItems.Sliver_ingot)).build();
    }
}
