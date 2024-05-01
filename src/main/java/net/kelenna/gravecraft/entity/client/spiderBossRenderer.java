package net.kelenna.gravecraft.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.kelenna.gravecraft.entity.custom.ZombieBoss;
import net.kelenna.gravecraft.entity.custom.spiderBoss;
import net.kelenna.gravecraft.gravecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import javax.annotation.Nullable;

public class spiderBossRenderer extends GeoEntityRenderer<spiderBoss> {
    public spiderBossRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new spiderBossModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(spiderBoss instance) {
        return new ResourceLocation(gravecraft.MOD_ID, "textures/entity/spiderboss.png");
    }

    @Override
    public RenderType getRenderType(spiderBoss animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.8f, 1.8f, 1.8f);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
