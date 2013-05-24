package mod.oc.helper;


import mod.oc.item.ModItems;
import net.minecraft.block.BlockOre;
import net.minecraft.entity.player.EntityPlayer;


public class itemDropHelper
{
    private static double rand;

    public static void dropBlackDiamond(EntityPlayer player, BlockOre block) 
    {
        if(generalHelper.isBlackDiamond(block))
        {
            rand = Math.random()*100;

            if (rand < 0.15d || (rand > 50.0d && rand < 51.0d))
            {
                player.dropItem(ModItems.blackDiamond.itemID, 2);
            }
            else if(rand > 95.0d)
            {
                
            }
            player.dropItem(ModItems.blackDiamond.itemID, 1);
        }
    }
}
