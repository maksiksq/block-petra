package dev.maksiks.blockpetra;


import dev.maksiks.blockpetra.block.ModBlocks;
import dev.maksiks.blockpetra.item.ModItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(Constants.MOD_ID)
public class BlockPetra {

    static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, Constants.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BuiltInRegistries.BLOCK, Constants.MOD_ID);

    public BlockPetra(IEventBus eventBus) {
        CommonClass.init();

        ModBlocks.BLOCK_MAP.forEach(BLOCKS::register);
        ModItems.ITEM_MAP.forEach(ITEMS::register);

        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}