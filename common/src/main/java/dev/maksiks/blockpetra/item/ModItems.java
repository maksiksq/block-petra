package dev.maksiks.blockpetra.item;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

import java.util.HashMap;

public class ModItems {
    public static final HashMap<String, Supplier<Item>> ITEM_MAP = new HashMap<>();

    public static final FoodProperties KVASS_FOOD_PROPS = new FoodProperties.Builder().nutrition(8).saturationModifier(5)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 0), 1.0F)
            .alwaysEdible()
            .build();

    public static final Supplier<Item> KVASS = Suppliers.memoize(() -> new Item(new Item.Properties().food(KVASS_FOOD_PROPS)));

    static {
        register("kvass", KVASS);
    }

    public static void register(String key, Supplier<Item> item) {
        ITEM_MAP.put(key, item);
    }
}
