package dev.maksiks.blockpetra;

import dev.maksiks.blockpetra.block.ModBlocks;
import dev.maksiks.blockpetra.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

import static dev.maksiks.blockpetra.ModFabricCreativeTab.CUSTOM_CREATIVE_TAB;
import static dev.maksiks.blockpetra.ModFabricCreativeTab.CUSTOM_CREATIVE_TAB_KEY;

public class BlockPetra implements ModInitializer {

    @Override
    public void onInitialize() {

        // This method is invoked by the Fabric mod loader when it is ready
        // to load your mod. You can access Fabric and Common code in this
        // project.

        // Use Fabric to bootstrap the Common mod.
        Constants.LOG.info("Hello Fabric world!");
        CommonClass.init();

        ModBlocks.BLOCK_MAP.forEach((path, blockSupplier) -> Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, path), blockSupplier.get()));
        ModItems.ITEM_MAP.forEach((path, itemSupplier) -> Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, path), itemSupplier.get()));

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CUSTOM_CREATIVE_TAB_KEY, CUSTOM_CREATIVE_TAB);
    }
}
