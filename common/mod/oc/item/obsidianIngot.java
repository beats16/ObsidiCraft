package mod.oc.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mod.oc.ObsidiCraft;
import mod.oc.lib.ReferenceVariables;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class obsidianIngot extends Item
{

    public obsidianIngot(int par1)
    {
        super(par1);
        this.setUnlocalizedName("obsidianIngot");
        this.setCreativeTab(ObsidiCraft.tabsOC);
        maxStackSize = 64;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {

        itemIcon = iconRegister.registerIcon(ReferenceVariables.MOD_ID.toLowerCase() + ":obsidianIngot");
    }

}
