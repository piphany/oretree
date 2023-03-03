package net.piphany.oretree.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;
import net.piphany.oretree.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.Raw_Sliver), RecipeCategory.MISC,ModItems.Sliver_ingot,0.7f,200,"sliver_ingot");
        offerBlasting(exporter, List.of(ModItems.Raw_Sliver), RecipeCategory.MISC,ModItems.Sliver_ingot,0.7f,100,"sliver_ingot");
    }
}
