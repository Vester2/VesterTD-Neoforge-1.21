package net.vester.vestertd.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.vester.vestertd.VesterTD;
import net.vester.vestertd.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB=
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VesterTD.MOD_ID);


    public static final Supplier<CreativeModeTab> VESTER_TD_ITEMS_TAB = CREATIVE_MODE_TAB.register("vester_td_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TOWN_HEART.get()))
                    .title(Component.translatable("creativetab.vestertd.items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.TOWN_HEART);
                        output.accept(ModItems.EVIL_ESSENCE);
                        output.accept(ModItems.EVIL_EYE);

                    }).build());

    public static final Supplier<CreativeModeTab> VESTER_TD_BLOCK_TAB = CREATIVE_MODE_TAB.register("vester_td_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.REFINED_EVIL.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(VesterTD.MOD_ID,"vester_td_items_tab"))
                    .title(Component.translatable("creativetab.vestertd.blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.EVIl_ASH);
                        output.accept(ModBlocks.REFINED_EVIL);

                    }).build());

    public static  void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);

    }
}
