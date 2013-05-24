package mod.oc.item;

import mod.oc.ObsidiCraft;
import mod.oc.lib.ReferenceVariables;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;

public class obsidianAxe extends ItemAxe
{

    public obsidianAxe(int par1, EnumToolMaterial par2)
    {
        super(par1, par2);
        this.setUnlocalizedName("hatchetObsidian");
        this.setCreativeTab(ObsidiCraft.tabsLMM);
        maxStackSize = 1;
    }
    
    public void registerIcons(IconRegister iconRegister) 
    {
     itemIcon = iconRegister.registerIcon(ReferenceVariables.MOD_ID.toLowerCase() + ":hatchetObsidian");
    }
}
