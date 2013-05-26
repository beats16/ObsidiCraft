package mod.oc.block;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import mod.oc.ObsidiCraft;
import mod.oc.item.ModItems;
import mod.oc.lib.ReferenceVariables;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGravel;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;

public class obsidianGravel extends BlockGravel
{

    public obsidianGravel(int par1)
    {
        super(par1);
        this.setUnlocalizedName("obsidianInfusedGravel");
        this.setCreativeTab(ObsidiCraft.tabsOC);
        this.setHardness(0.9F);
    }
    
    @Override
    public int idDropped(int par1, Random par2Random, int par3)
    {
        if (par3 > 3)
        {
            par3 = 3;
        }

        return par2Random.nextInt(10 - par3 * 3) == 0 ? ModItems.obsidianShard.itemID: par2Random.nextInt(10 - par3 * 3) == 1 ?ModBlocks.obsidianInfusedGravel.blockID:Block.gravel.blockID;
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(ReferenceVariables.MOD_ID.toLowerCase() + ":obsidianInfusedGravel");
    }
    
    /**
     * How many world ticks before ticking
     */
    @Override
    public int tickRate(World par1World)
    {
        return 15;
    }


}
