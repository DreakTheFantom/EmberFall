package net.dreakthenfantom.emberfall.item;

import net.dreakthenfantom.emberfall.EmberFall;
import net.dreakthenfantom.emberfall.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EmberFall.MOD_ID);

    public static final Supplier<CreativeModeTab> BERYL_ITEMS_TAB = CREATIVE_MODE_TAB.register("beryl_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.BERYL.get()))
                    .title(Component.translatable("creativetab.emberfall.beryl_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Moditems.BERYL);
                        output.accept(Moditems.BERYL_DUST);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> BERYL_BLOCKS_TAB = CREATIVE_MODE_TAB.register("beryl_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BERYL_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EmberFall.MOD_ID, "beryl_items_tab"))
                    .title(Component.translatable("creativetab.emberfall.beryl_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.BERYL_BLOCK);
                        output.accept(ModBlocks.BERYL_ORE);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
