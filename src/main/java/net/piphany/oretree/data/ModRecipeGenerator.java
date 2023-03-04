package net.piphany.oretree.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
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

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.Coal_Ore_Sapling)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("ACA")
                .input('A',ModItems.Sliver_ingot)
                .input('B',Items.COAL)
                .input('C',Items.OAK_SAPLING)
                .criterion(FabricRecipeProvider.hasItem(ModItems.Sliver_ingot),FabricRecipeProvider.conditionsFromItem(ModItems.Sliver_ingot))
                .offerTo(exporter,new Identifier(FabricRecipeProvider.convertBetween(ModBlocks.Coal_Ore_Sapling,Items.COAL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.Copper_Ore_Sapling)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("ACA")
                .input('A',ModItems.Sliver_ingot)
                .input('B',Items.COPPER_INGOT)
                .input('C',Items.OAK_SAPLING)
                .criterion(FabricRecipeProvider.hasItem(ModItems.Sliver_ingot),FabricRecipeProvider.conditionsFromItem(ModItems.Sliver_ingot))
                .offerTo(exporter,new Identifier(FabricRecipeProvider.convertBetween(ModBlocks.Copper_Ore_Sapling,Items.COPPER_INGOT)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.Diamond_Ore_Sapling)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("ACA")
                .input('A',ModItems.Sliver_ingot)
                .input('B',Items.DIAMOND)
                .input('C',Items.OAK_SAPLING)
                .criterion(FabricRecipeProvider.hasItem(ModItems.Sliver_ingot),FabricRecipeProvider.conditionsFromItem(ModItems.Sliver_ingot))
                .offerTo(exporter,new Identifier(FabricRecipeProvider.convertBetween(ModBlocks.Diamond_Ore_Sapling,Items.DIAMOND)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.Emerald_Ore_Sapling)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("ACA")
                .input('A',ModItems.Sliver_ingot)
                .input('B',Items.EMERALD)
                .input('C',Items.OAK_SAPLING)
                .criterion(FabricRecipeProvider.hasItem(ModItems.Sliver_ingot),FabricRecipeProvider.conditionsFromItem(ModItems.Sliver_ingot))
                .offerTo(exporter,new Identifier(FabricRecipeProvider.convertBetween(ModBlocks.Emerald_Ore_Sapling,Items.EMERALD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.Gold_Ore_Sapling)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("ACA")
                .input('A',ModItems.Sliver_ingot)
                .input('B',Items.GOLD_INGOT)
                .input('C',Items.OAK_SAPLING)
                .criterion(FabricRecipeProvider.hasItem(ModItems.Sliver_ingot),FabricRecipeProvider.conditionsFromItem(ModItems.Sliver_ingot))
                .offerTo(exporter,new Identifier(FabricRecipeProvider.convertBetween(ModBlocks.Gold_Ore_Sapling,Items.GOLD_INGOT)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.Iron_Ore_Sapling)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("ACA")
                .input('A',ModItems.Sliver_ingot)
                .input('B',Items.IRON_INGOT)
                .input('C',Items.OAK_SAPLING)
                .criterion(FabricRecipeProvider.hasItem(ModItems.Sliver_ingot),FabricRecipeProvider.conditionsFromItem(ModItems.Sliver_ingot))
                .offerTo(exporter,new Identifier(FabricRecipeProvider.convertBetween(ModBlocks.Iron_Ore_Sapling,Items.IRON_INGOT)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.Lapis_Lazuli_Ore_Sapling)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("ACA")
                .input('A',ModItems.Sliver_ingot)
                .input('B',Items.LAPIS_LAZULI)
                .input('C',Items.OAK_SAPLING)
                .criterion(FabricRecipeProvider.hasItem(ModItems.Sliver_ingot),FabricRecipeProvider.conditionsFromItem(ModItems.Sliver_ingot))
                .offerTo(exporter,new Identifier(FabricRecipeProvider.convertBetween(ModBlocks.Lapis_Lazuli_Ore_Sapling,Items.LAPIS_LAZULI)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.Nether_Quartz_Ore_Sapling)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("ACA")
                .input('A',ModItems.Sliver_ingot)
                .input('B',Items.QUARTZ)
                .input('C',Items.OAK_SAPLING)
                .criterion(FabricRecipeProvider.hasItem(ModItems.Sliver_ingot),FabricRecipeProvider.conditionsFromItem(ModItems.Sliver_ingot))
                .offerTo(exporter,new Identifier(FabricRecipeProvider.convertBetween(ModBlocks.Nether_Quartz_Ore_Sapling,Items.QUARTZ)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.Redstone_Ore_Sapling)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("ACA")
                .input('A',ModItems.Sliver_ingot)
                .input('B',Items.REDSTONE)
                .input('C',Items.OAK_SAPLING)
                .criterion(FabricRecipeProvider.hasItem(ModItems.Sliver_ingot),FabricRecipeProvider.conditionsFromItem(ModItems.Sliver_ingot))
                .offerTo(exporter,new Identifier(FabricRecipeProvider.convertBetween(ModBlocks.Redstone_Ore_Sapling,Items.REDSTONE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.Sliver_Ore_Sapling)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("ABA")
                .input('A',ModItems.Sliver_ingot)
                .input('B',Items.OAK_SAPLING)
                .criterion(FabricRecipeProvider.hasItem(ModItems.Sliver_ingot),FabricRecipeProvider.conditionsFromItem(ModItems.Sliver_ingot))
                .offerTo(exporter,new Identifier(FabricRecipeProvider.convertBetween(ModBlocks.Sliver_Ore_Sapling,ModItems.Sliver_ingot)));











        offerSmelting(exporter, List.of(ModItems.Raw_Sliver), RecipeCategory.MISC,ModItems.Sliver_ingot,0.7f,200,"sliver_ingot");
        offerBlasting(exporter, List.of(ModItems.Raw_Sliver), RecipeCategory.MISC,ModItems.Sliver_ingot,0.7f,100,"sliver_ingot");
    }
}
