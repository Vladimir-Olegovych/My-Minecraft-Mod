package com.gigcreator.mymod.handler;

import com.gigcreator.mymod.MyMod;
import com.gigcreator.mymod.events.Keybindings;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MyMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientForgeHandler {

    private static final Component EXAMPLE_KEY_PRESSED =
            Component.translatable("message." + MyMod.MOD_ID + ".example_key_pressed");

    @SubscribeEvent
    public static void clientTick(TickEvent.ClientTickEvent event){
        Minecraft minecraft = Minecraft.getInstance();
        if (Keybindings.INSTANCE.exampleKey.consumeClick() && minecraft.player != null){
            minecraft.player.displayClientMessage(EXAMPLE_KEY_PRESSED, false);
        }
        if (Keybindings.INSTANCE.examplePacketKey.consumeClick() && minecraft.player != null){
            minecraft.player.displayClientMessage(EXAMPLE_KEY_PRESSED, true);
        }
    }
}