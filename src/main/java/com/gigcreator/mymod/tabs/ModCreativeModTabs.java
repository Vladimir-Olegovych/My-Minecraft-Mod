package com.gigcreator.mymod.tabs;

import com.gigcreator.mymod.MyMod;
import com.gigcreator.mymod.blocks.ModBlocks;
import com.gigcreator.mymod.items.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MyMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> INVALID_CRAFT_TAB =
            CREATIVE_MODE_TABS.register("my_mod_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.SCRUMPY.get()))
                    .title(Component.translatable("creativetab.my_mod_tab"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.SCRUMPY.get());
                        output.accept(ModItems.SCOTTISH_FLASHBACK.get());
                        output.accept(ModBlocks.SCRUMPY_BLOCK.get());
                        output.accept(ModBlocks.SCOTTISH_FLASHBACK_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
