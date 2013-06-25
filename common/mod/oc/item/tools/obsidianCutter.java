package mod.oc.item.tools;

import mod.oc.ObsidiCraft;
import mod.oc.item.ItemLMM;
import mod.oc.lib.ReferenceVariables;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class obsidianCutter extends ItemLMM
{

    public obsidianCutter(int par1)
    {
        super(par1);
        this.setUnlocalizedName("obsidianCutter");
        this.setMaxDamage(100);
        this.setCreativeTab(ObsidiCraft.tabsOC);
        maxStackSize = 1;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {

        itemIcon = iconRegister.registerIcon(ReferenceVariables.MOD_ID.toLowerCase() + ":obsidianCutter");
    }
    
    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack) {

        return false;
    }
    
    @Override
    public ItemStack getContainerItemStack(ItemStack itemStack) {

        itemStack.setItemDamage(itemStack.getItemDamage() + 1);

        return itemStack;
    }
    
 
}
