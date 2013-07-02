package mod.oc.block;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import mod.oc.ObsidiCraft;
import mod.oc.item.ModItems;
import mod.oc.lib.ReferenceVariables;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ModOre extends BlockOre
{

    public ModOre(int par1)
    {
        super(par1);
        this.setCreativeTab(ObsidiCraft.tabsOC);
    }
    
    @Override
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return this.blockID == ModBlocks.blackDiamondOre.blockID ? ModItems.blackDiamond.itemID : this.blockID;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
        String name = this.getUnlocalizedName();
        String name2 = name.substring(5);
        blockIcon = iconRegister.registerIcon(ReferenceVariables.MOD_ID.toLowerCase() + ":" +name2);
    }
}
