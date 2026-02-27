package dev.maksiks.blockpetra.block;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import dev.maksiks.blockpetra.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.HashMap;

public class ModBlocks {
    public static final HashMap<String, Supplier<Block>> BLOCK_MAP = new HashMap<>();

    public static final Supplier<Block> BLOCK_PETRA_POROSHENKA = Suppliers.memoize(() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

    static {
        registerWithItem("block_petra_poroshenka", BLOCK_PETRA_POROSHENKA);
    }

    private static void register(String key, Supplier<Block> block) {
        BLOCK_MAP.put(key, block);
    }

    public static void registerWithItem(String key, Supplier<Block> block) {
        register(key, block);
        ModItems.register(key, () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
