package com.otakusaikou.spritcraft.block.mark;

import com.otakusaikou.spritcraft.tileentity.CollectiveMarkTileEntity;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class CollectiveMarkBlock extends MarkBlock {
    public CollectiveMarkBlock(Properties properties) {
        super(properties);
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new CollectiveMarkTileEntity();
    }
}