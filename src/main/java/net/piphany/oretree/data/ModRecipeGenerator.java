package net.piphany.oretree.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.piphany.oretree.block.ModBlocks;
import net.piphany.oretree.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    private void OreTreeRecipes(Block block, Item ore, Consumer<RecipeJsonProvider> exporter){
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,block)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("ACA")
                .input('A',ModItems.Sliver_ingot)
                .input('B',ore)
                .input('C',Items.OAK_SAPLING)
                .criterion(FabricRecipeProvider.hasItem(ModItems.Sliver_ingot),FabricRecipeProvider.conditionsFromItem(ModItems.Sliver_ingot))
                .offerTo(exporter,new Identifier(FabricRecipeProvider.convertBetween(block,ore)));
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        OreTreeRecipes(ModBlocks.Coal_Ore_Sapling,Items.COAL,exporter);
        OreTreeRecipes(ModBlocks.Copper_Ore_Sapling,Items.COPPER_INGOT,exporter);
        OreTreeRecipes(ModBlocks.Diamond_Ore_Sapling,Items.DIAMOND,exporter);
        OreTreeRecipes(ModBlocks.Emerald_Ore_Sapling,Items.EMERALD,exporter);
        OreTreeRecipes(ModBlocks.Gold_Ore_Sapling,Items.GOLD_INGOT,exporter);
        OreTreeRecipes(ModBlocks.Iron_Ore_Sapling,Items.IRON_INGOT,exporter);
        OreTreeRecipes(ModBlocks.Lapis_Lazuli_Ore_Sapling,Items.LAPIS_LAZULI,exporter);
        OreTreeRecipes(ModBlocks.Nether_Quartz_Ore_Sapling,Items.QUARTZ,exporter);
        OreTreeRecipes(ModBlocks.Redstone_Ore_Sapling,Items.REDSTONE,exporter);
        OreTreeRecipes(ModBlocks.Sliver_Ore_Sapling,ModItems.Sliver_ingot,exporter);

        offerSmelting(exporter, List.of(ModItems.Raw_Sliver), RecipeCategory.MISC,ModItems.Sliver_ingot,0.7f,200,"sliver_ingot");
        offerBlasting(exporter, List.of(ModItems.Raw_Sliver), RecipeCategory.MISC,ModItems.Sliver_ingot,0.7f,100,"sliver_ingot");
    }
}
