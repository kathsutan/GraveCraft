package net.kelenna.gravecraft.entity.client;

import net.kelenna.gravecraft.entity.custom.ZombieBoss;
import net.kelenna.gravecraft.gravecraft;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ZombieBossModel extends AnimatedGeoModel<ZombieBoss> {
    @Override
    public ResourceLocation getModelResource(ZombieBoss object) {
        return new ResourceLocation(gravecraft.MOD_ID, "geo/zom.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ZombieBoss object) {
        return new ResourceLocation(gravecraft.MOD_ID, "textures/entity/zom_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ZombieBoss animatable) {
        return new ResourceLocation(gravecraft.MOD_ID, "animations/zom.animation.json");
    }

}