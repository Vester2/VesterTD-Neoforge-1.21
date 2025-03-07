package net.vester.vestertd.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.vester.vestertd.VesterTD;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(VesterTD.MOD_ID);

    public static final DeferredItem<Item> TOWN_HEART = ITEMS.register("town_heart",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EVIL_ESSENCE = ITEMS.register("evil_essence",
    () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EVIL_EYE = ITEMS.register("evil_eye",
            () -> new Item(new Item.Properties()));

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
