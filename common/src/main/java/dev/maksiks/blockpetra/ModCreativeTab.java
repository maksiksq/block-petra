package dev.maksiks.blockpetra;

import com.google.common.base.Supplier;
import dev.maksiks.blockpetra.block.ModBlocks;
import dev.maksiks.blockpetra.item.ModItems;
import net.minecraft.world.level.ItemLike;

import java.util.ArrayList;
import java.util.List;

public class ModCreativeTab {
    public static List<Supplier<ItemLike>> CREATIVE_TAB_CONTENTS = new ArrayList<>();

    static {
        add(ModBlocks.BLOCK_PETRA_POROSHENKA::get);
        add(ModItems.KVASS::get);
    }

    public static void add(Supplier<ItemLike> item) {
        CREATIVE_TAB_CONTENTS.add(item);
    }
}
