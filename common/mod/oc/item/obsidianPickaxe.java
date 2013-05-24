package mod.oc.item;

import mod.oc.ObsidiCraft;
import mod.oc.lib.ReferenceVariables;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class obsidianPickaxe extends ItemPickaxe
{

    public obsidianPickaxe(int par1, EnumToolMaterial par2)
    {
        super(par1, par2);
        this.setUnlocalizedName("pickaxeObsidian");
        this.setCreativeTab(ObsidiCraft.tabsLMM);
        maxStackSize = 1;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {

        itemIcon = iconRegister.registerIcon(ReferenceVariables.MOD_ID.toLowerCase() + ":pickaxeObsidian");
    }
}
