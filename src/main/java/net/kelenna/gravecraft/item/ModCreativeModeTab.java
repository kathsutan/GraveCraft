package net.kelenna.gravecraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.checkerframework.checker.units.qual.C;

public class ModCreativeModeTab {
    public static final CreativeModeTab GRAVECRAFT_TAB = new CreativeModeTab("gravecrafttab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PEARL.get());
        }
        public ItemStack glowstickIcon() {
            return new ItemStack(ModItems.GLOWSTICk.get());
        }

        public ItemStack tuffyIcon() {
            return new ItemStack(ModItems.TUFFY.get());
        }
    };
}
