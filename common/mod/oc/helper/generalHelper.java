package mod.oc.helper;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;


public class generalHelper
{
    public static boolean isBlackDiamond(BlockOre block) {

        if (block.equals(Block.oreDiamond))
            return true;
        else
            return false;
    }
}
