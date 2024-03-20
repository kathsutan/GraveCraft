package net.kelenna.gravecraft.blocks;

import net.kelenna.gravecraft.blocks.custom.broccrop;
import net.kelenna.gravecraft.blocks.custom.carrotcrop;
import net.kelenna.gravecraft.blocks.custom.grapecrop;
import net.kelenna.gravecraft.blocks.custom.shroom;
import net.kelenna.gravecraft.gravecraft;
import net.kelenna.gravecraft.item.ModCreativeModeTab;
import net.kelenna.gravecraft.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, gravecraft.MOD_ID);

    public static final RegistryObject<Block> SHROOM = registerBlock("shroom",
            () -> new shroom(BlockBehaviour.Properties.of(Material.PLANT).instabreak().noOcclusion()), ModCreativeModeTab.GRAVECRAFT_TAB);

    public static final RegistryObject<Block> BROCCROP = BLOCKS.register("broccrop",
            () -> new broccrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS)));

    public static final RegistryObject<Block> CARROTCROP = BLOCKS.register("carrotcrop",
            () -> new carrotcrop(BlockBehaviour.Properties.copy(Blocks.CARROTS)));

    public static final RegistryObject<Block> GRAPECROP = BLOCKS.register("grapecrop",
            () -> new grapecrop(BlockBehaviour.Properties.copy(Blocks.WHEAT)));




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
