package com.gigcreator.mymod.items;

import com.gigcreator.mymod.MyMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MyMod.MOD_ID);

    public static final RegistryObject<Item> SCRUMPY =
            ITEMS.register("scrumpy", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCOTTISH_FLASHBACK =
            ITEMS.register("scottish_flashback", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
