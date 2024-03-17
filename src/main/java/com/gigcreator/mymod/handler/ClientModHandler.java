package com.gigcreator.mymod.handler;

import com.gigcreator.mymod.MyMod;
import com.gigcreator.mymod.events.Keybindings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = MyMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModHandler {

    // Register the commonSetup method for modloading
    @SubscribeEvent
    public void clientSetup(final FMLClientSetupEvent event) {

    }
    @SubscribeEvent
    public void registerKeys(final RegisterKeyMappingsEvent event) {
        event.register(Keybindings.INSTANCE.exampleKey);
        event.register(Keybindings.INSTANCE.examplePacketKey);
    }
}
