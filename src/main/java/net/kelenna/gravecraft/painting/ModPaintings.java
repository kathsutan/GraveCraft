package net.kelenna.gravecraft.painting;

import net.kelenna.gravecraft.gravecraft;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;

public class ModPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, gravecraft.MOD_ID);

    public static final RegistryObject<PaintingVariant> KAT = PAINTING_VARIANTS.register("kat",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> KATHERINES = PAINTING_VARIANTS.register("katherines",
            () -> new PaintingVariant(32, 32));

    public static final RegistryObject<PaintingVariant> ELENAS = PAINTING_VARIANTS.register("elenas",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> ANNA = PAINTING_VARIANTS.register("anna",
            () -> new PaintingVariant(32, 32));

    public static void register(IEventBus eventBus) {
        PAINTING_VARIANTS.register(eventBus);
    }
}
