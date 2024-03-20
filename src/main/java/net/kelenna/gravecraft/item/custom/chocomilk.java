package net.kelenna.gravecraft.item.custom;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.MilkBucketItem;
import net.minecraft.world.level.Level;

public class chocomilk extends MilkBucketItem {

    public chocomilk(Properties p_42921_) {
        super(p_42921_);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack p_42923_, Level p_42924_, LivingEntity p_42925_) {
        if (!p_42924_.isClientSide) {
            p_42925_.curePotionEffects(p_42923_);
        }

        if (p_42925_ instanceof ServerPlayer serverplayer) {
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayer, p_42923_);
            serverplayer.getFoodData().eat(10, 0.5f);
        }

        if (p_42925_ instanceof Player && !((Player)p_42925_).getAbilities().instabuild) {
            p_42923_.shrink(1);
        }

        return p_42923_.isEmpty() ? new ItemStack(Items.BUCKET) : p_42923_;


    }
}
