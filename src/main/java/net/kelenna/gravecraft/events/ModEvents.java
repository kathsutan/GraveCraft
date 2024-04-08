package net.kelenna.gravecraft.events;

import net.kelenna.gravecraft.entity.ModEntityTypes;
import net.kelenna.gravecraft.entity.custom.ZombieBoss;
import net.kelenna.gravecraft.gravecraft;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ModEvents {
    @Mod.EventBusSubscriber(modid = gravecraft.MOD_ID)
    public static class ForgeEvents {

    }

    @Mod.EventBusSubscriber(modid = gravecraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents {
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.ZOMBIEBOSS.get(), ZombieBoss.setAttributes());
        }
    }
}
