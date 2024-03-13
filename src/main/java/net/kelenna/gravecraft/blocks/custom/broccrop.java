package net.kelenna.gravecraft.blocks.custom;

import net.kelenna.gravecraft.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class broccrop extends CropBlock {
    public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 6);
    public broccrop(Properties p_52247_) {
        super(p_52247_);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.BROCSEEDS.get();
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return 6;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}
