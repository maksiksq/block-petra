package dev.maksiks.blockpetra;

import dev.maksiks.blockpetra.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.function.Supplier;

public class ModNeoCreativeTab {
    private static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Constants.MOD_ID);
    public static final Supplier<CreativeModeTab> MOD_CREATIVE_TAB = CREATIVE_MODE_TABS.register("blockpetra_tab",
            () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + Constants.MOD_ID + ".blockpetra_tab"))
            .icon(() -> new ItemStack(ModBlocks.BLOCK_PETRA_POROSHENKA.get()))
            .displayItems((params, output) -> {
                for (Supplier<ItemLike> item : ModCreativeTab.CREATIVE_TAB_CONTENTS) {
                    output.accept(item.get());
                }
            })
            .build()
    );
}
