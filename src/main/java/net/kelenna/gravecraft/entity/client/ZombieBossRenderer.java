package net.kelenna.gravecraft.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.kelenna.gravecraft.entity.custom.ZombieBoss;
import net.kelenna.gravecraft.gravecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import javax.annotation.Nullable;

public class ZombieBossRenderer extends GeoEntityRenderer<ZombieBoss> {

    public ZombieBossRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ZombieBossModel());
        this.shadowRadius = 0.3f;
    }
    @Override
    public ResourceLocation getTextureLocation(ZombieBoss instance) {
        return new ResourceLocation(gravecraft.MOD_ID, "textures/entity/zom_texture.png");
    }

    @Override
    public RenderType getRenderType(ZombieBoss animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8f, 0.8f, 0.8f);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
