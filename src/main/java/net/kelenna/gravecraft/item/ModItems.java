package net.kelenna.gravecraft.item;

import net.kelenna.gravecraft.blocks.ModBlocks;
import net.kelenna.gravecraft.entity.ModEntityTypes;
import net.kelenna.gravecraft.gravecraft;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
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
     public static final RegistryObject<Item> TUFFY = ITEMS.register("tuffy",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GRAVECRAFT_TAB)));
     public static final RegistryObject<Item> TUNA = ITEMS.register("tuna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GRAVECRAFT_TAB)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(2f).build())));
    public static final RegistryObject<Item> BROCCOLI = ITEMS.register("broccoli",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GRAVECRAFT_TAB)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(2f).build())));
    public static final RegistryObject<Item> BROCSEEDS = ITEMS.register("brocseeds",
            () -> new ItemNameBlockItem(ModBlocks.BROCCROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.GRAVECRAFT_TAB)));

    public static final RegistryObject<Item> COOKED_TUNA = ITEMS.register("cooked_tuna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GRAVECRAFT_TAB)
                    .food(new FoodProperties.Builder().nutrition(7).saturationMod(6f).build())));
//    public static final RegistryObject<Item> CAVECARROT = ITEMS.register("cavecarrot",
//            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GRAVECRAFT_TAB)
//                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(2f).build())));

    public static final RegistryObject<Item> CAVECARROT = ITEMS.register("cavecarrot",
            () -> new ItemNameBlockItem(ModBlocks.CARROTCROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.GRAVECRAFT_TAB)
                            .food(new FoodProperties.Builder().nutrition(4).saturationMod(4f).build())));
    public static final RegistryObject<Item> GRAPE = ITEMS.register("grape",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GRAVECRAFT_TAB)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(2f).build())));

    public static final RegistryObject<Item> GRAPESEEDS = ITEMS.register("grapeseeds",
            () -> new ItemNameBlockItem(ModBlocks.GRAPECROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.GRAVECRAFT_TAB)));
    public static final RegistryObject<Item> CANDYAPPLE = ITEMS.register("candyapple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GRAVECRAFT_TAB)
                    .food(new FoodProperties.Builder().nutrition(6).saturationMod(9f).build())));
    public static final RegistryObject<Item> CHOCOMILK = ITEMS.register("chocomilk",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GRAVECRAFT_TAB).stacksTo(1)
                    /*.food(new FoodProperties.Builder().nutrition(0).saturationMod(0).build())*/));
    public static final RegistryObject<Item> ZOMBIEBOSS_SPAWN_EGG = ITEMS.register("zombieboss_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.ZOMBIEBOSS, 0x22b341, 0x19732e,
                    new Item.Properties().tab(ModCreativeModeTab.GRAVECRAFT_TAB)));

        public static final RegistryObject<Item> AVOCADO = ITEMS.register("avocado",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GRAVECRAFT_TAB)
                    .food(new FoodProperties.Builder().nutrition(5).saturationMod(9f).build())));
    public static final RegistryObject<Item> AVOCADOSEEDS = ITEMS.register("avocadoseeds",
            () -> new ItemNameBlockItem(ModBlocks.AVOCADOCROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.GRAVECRAFT_TAB)));
    public static final RegistryObject<Item> SPIDERBOSS_SPAWN_EGG = ITEMS.register("spiderboss_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.SPIDERBOSS, 0x890F8A, 0x8A5980,
                    new Item.Properties().tab(ModCreativeModeTab.GRAVECRAFT_TAB)));
    public static final RegistryObject<Item> HUSKBOSS_SPAWN_EGG = ITEMS.register("huskboss_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.HUSKBOSS, 0x9E7A5C, 0x5E4D3A,
                    new Item.Properties().tab(ModCreativeModeTab.GRAVECRAFT_TAB)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
