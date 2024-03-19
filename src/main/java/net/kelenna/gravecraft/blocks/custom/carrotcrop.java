package net.kelenna.gravecraft.blocks.custom;

import net.kelenna.gravecraft.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class carrotcrop extends CropBlock {
    public carrotcrop(Properties p_52247_) {
        super(p_52247_);
    }
    public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 3);
    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.CAVECARROT.get();
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return 3;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
    @Override
    public boolean canSurvive(BlockState p_52282_, LevelReader p_52283_, BlockPos p_52284_) {
        // Check if the block is not exposed to the sky and is not air.
        return !p_52283_.canSeeSky(p_52284_) && p_52283_.getBlockState(p_52284_.below()).getBlock() != Blocks.AIR && super.canSurvive(p_52282_, p_52283_, p_52284_);
    }
}
