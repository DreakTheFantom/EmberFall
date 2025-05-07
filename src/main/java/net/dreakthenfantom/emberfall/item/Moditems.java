package net.dreakthenfantom.emberfall.item;

import net.dreakthenfantom.emberfall.EmberFall;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Moditems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EmberFall.MOD_ID);

    public static final DeferredItem<Item> BERYL = ITEMS.register("beryl",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BERYL_DUST = ITEMS.register("beryl_dust",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
