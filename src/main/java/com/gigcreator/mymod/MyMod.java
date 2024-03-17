package com.gigcreator.mymod;


import com.gigcreator.mymod.blocks.ModBlocks;
import com.gigcreator.mymod.events.CommonModEvents;
import com.gigcreator.mymod.handler.ClientForgeHandler;
import com.gigcreator.mymod.handler.ClientModHandler;
import com.gigcreator.mymod.tabs.ModCreativeModTabs;
import com.gigcreator.mymod.items.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MyMod.MOD_ID)
public class MyMod {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "my_mod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public MyMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeEventBus = MinecraftForge.EVENT_BUS;


        ModCreativeModTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        modEventBus.register(new ClientModHandler());
        modEventBus.register(new CommonModEvents());

        // Register ourselves for server and other game events we are interested in
        forgeEventBus.register(new ClientForgeHandler());
        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }
}
