package dev.maksiks.blockpetra.datagen;

import dev.maksiks.blockpetra.block.ModBlocks;
import dev.maksiks.blockpetra.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.BLOCK_PETRA_POROSHENKA.get(), 1)
                .requires(ModItems.KVASS.get(), 9)
                .unlockedBy("has_kvass", has(ModItems.KVASS.get()))
                .save(recipeOutput);

    }
}
