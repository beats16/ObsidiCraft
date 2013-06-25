package mod.oc.item.tools;

import mod.oc.ObsidiCraft;
import mod.oc.lib.ReferenceVariables;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class obsidianPickaxe extends ItemPickaxe
{

    public obsidianPickaxe(int par1, EnumToolMaterial par2)
    {
        super(par1, par2);
        this.setCreativeTab(ObsidiCraft.tabsOC);
        maxStackSize = 1;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) 
    {
        String name = this.getUnlocalizedName();
        String name2 = name.substring(5);
        itemIcon = iconRegister.registerIcon(ReferenceVariables.MOD_ID.toLowerCase() + ":" + name2);
    }
    
    
    @Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return false;
    }
}
