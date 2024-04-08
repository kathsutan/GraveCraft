package net.kelenna.gravecraft;

import com.mojang.logging.LogUtils;
import net.kelenna.gravecraft.blocks.ModBlocks;
import net.kelenna.gravecraft.entity.ModEntityTypes;
import net.kelenna.gravecraft.entity.client.ZombieBossRenderer;
import net.kelenna.gravecraft.item.ModItems;
import net.kelenna.gravecraft.painting.ModPaintings;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(gravecraft.MOD_ID)
public class gravecraft {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "gravecraft";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public gravecraft() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        ModPaintings.register(modEventBus);

        GeckoLib.initialize();
        ModEntityTypes.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }
    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntityTypes.ZOMBIEBOSS.get(), ZombieBossRenderer::new);
        }
    }
}
