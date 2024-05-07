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
        } public ItemStack tunaIcon() {
            return new ItemStack(ModItems.TUNA.get());
        }

        public ItemStack cooked_tunaIcon() {
            return new ItemStack(ModItems.COOKED_TUNA.get());
        }

        public ItemStack tuffyIcon() {
            return new ItemStack(ModItems.TUFFY.get());
        }

        public ItemStack broccoliIcon() {
            return new ItemStack(ModItems.BROCCOLI.get());
        }
        public ItemStack brocseedsIcon() {
            return new ItemStack(ModItems.BROCSEEDS.get());
        }
        public ItemStack cavecarrotIcon() {
            return new ItemStack(ModItems.CAVECARROT.get());
        }
        public ItemStack grapeIcon() {
            return new ItemStack(ModItems.GRAPE.get());
        }
        public ItemStack grapeseedsIcon() {
            return new ItemStack(ModItems.GRAPESEEDS.get());
        }
        public ItemStack candyappleIcon() {
            return new ItemStack(ModItems.CANDYAPPLE.get());
        }
        public ItemStack chocomilkIcon() {
            return new ItemStack(ModItems.CHOCOMILK.get());
        }
        public ItemStack avocadoIcon() {return new ItemStack(ModItems.AVOCADO.get());}
        public ItemStack avocadoseedsIcon() {return new ItemStack(ModItems.AVOCADOSEEDS.get());}


    };

}
