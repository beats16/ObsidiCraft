package mod.oc.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mod.oc.ObsidiCraft;
import mod.oc.lib.ReferenceVariables;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class ModBlock extends Block
{

    public ModBlock(int par1)
    {
        super(par1, Material.rock);
        this.setCreativeTab(ObsidiCraft.tabsOC);
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
