package net.kelenna.gravecraft.entity;

import net.kelenna.gravecraft.entity.custom.ZombieBoss;
import net.kelenna.gravecraft.gravecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, gravecraft.MOD_ID);

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
    public static final RegistryObject<EntityType<ZombieBoss>> ZOMBIEBOSS =
            ENTITY_TYPES.register("zombieboss",
                    () -> EntityType.Builder.of(ZombieBoss::new, MobCategory.MONSTER)
                            .sized(2.4f, 7.8f)
                            .build(new ResourceLocation(gravecraft.MOD_ID, "zombieboss").toString()));
}
