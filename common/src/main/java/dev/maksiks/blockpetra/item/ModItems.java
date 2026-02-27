package dev.maksiks.blockpetra.item;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import net.minecraft.world.item.Item;

import java.util.HashMap;

public class ModItems {
    public static final HashMap<String, Supplier<Item>> ITEM_MAP = new HashMap<>();

    public static final Supplier<Item> KVASS = Suppliers.memoize(() -> new Item(new Item.Properties()));

    static {
        register("kvass", KVASS);
    }

    public static void register(String key, Supplier<Item> item) {
        ITEM_MAP.put(key, item);
    }
}
