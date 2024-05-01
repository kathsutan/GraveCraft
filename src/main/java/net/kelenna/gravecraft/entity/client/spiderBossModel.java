package net.kelenna.gravecraft.entity.client;

import net.kelenna.gravecraft.entity.custom.ZombieBoss;
import net.kelenna.gravecraft.entity.custom.spiderBoss;
import net.kelenna.gravecraft.gravecraft;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class spiderBossModel extends AnimatedGeoModel<spiderBoss> {


    @Override
    public ResourceLocation getModelResource(spiderBoss object) {
        return new ResourceLocation(gravecraft.MOD_ID, "geo/spiderboss.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(spiderBoss object) {
        return new ResourceLocation(gravecraft.MOD_ID, "textures/entity/spiderboss.png");
    }

    @Override
    public ResourceLocation getAnimationResource(spiderBoss animatable) {
        return new ResourceLocation(gravecraft.MOD_ID, "animations/spiderboss.animation.json");
    }
}
