package net.kelenna.gravecraft.entity.client;

import net.kelenna.gravecraft.entity.custom.huskBoss;
import net.kelenna.gravecraft.gravecraft;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class huskBossModel extends AnimatedGeoModel<huskBoss> {
    @Override
    public ResourceLocation getModelResource(huskBoss huskBoss) {
        return new ResourceLocation(gravecraft.MOD_ID, "geo/husk.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(huskBoss huskBoss) {
        return new ResourceLocation(gravecraft.MOD_ID, "textures/entity/husk_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(huskBoss huskBoss) {
        return new ResourceLocation(gravecraft.MOD_ID, "animations/husk.animation.json");
    }
}
