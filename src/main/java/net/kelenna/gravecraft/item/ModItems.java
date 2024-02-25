package net.kelenna.gravecraft.item;

import net.kelenna.gravecraft.gravecraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, gravecraft.MOD_ID);

    public static final RegistryObject<Item> PEARL = ITEMS.register("pearl",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GRAVECRAFT_TAB)));
     public static final RegistryObject<Item> GLOWSTICk = ITEMS.register("glowstick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GRAVECRAFT_TAB)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
