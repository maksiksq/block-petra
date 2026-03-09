package dev.maksiks.blockpetra;

import com.google.common.base.Supplier;
import dev.maksiks.blockpetra.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

import static net.minecraft.resources.ResourceLocation.fromNamespaceAndPath;

public class ModFabricCreativeTab {
    public static final ResourceKey<CreativeModeTab> CUSTOM_CREATIVE_TAB_KEY =
            ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), fromNamespaceAndPath(Constants.MOD_ID, "block_petra_creative_tab"));
    public static final CreativeModeTab CUSTOM_CREATIVE_TAB = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModBlocks.BLOCK_PETRA_POROSHENKA.get()))
            .title(Component.translatable("itemGroup." + Constants.MOD_ID + ".blockpetra_tab"))
            .displayItems((params, output) -> {
                for (Supplier<ItemLike> item : ModCreativeTab.CREATIVE_TAB_CONTENTS) {
                    output.accept(item.get());
                }
            })
            .build();
}
