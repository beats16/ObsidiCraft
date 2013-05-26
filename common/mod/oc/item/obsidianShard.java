package mod.oc.item;

import mod.oc.ObsidiCraft;
import mod.oc.lib.ReferenceVariables;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class obsidianShard extends ItemLMM
{

    public obsidianShard(int par1)
    {
        super(par1);
        this.setUnlocalizedName("shardObsidian");
        this.setCreativeTab(ObsidiCraft.tabsOC);
        maxStackSize = 64;
        // TODO Auto-generated constructor stub
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {

        itemIcon = iconRegister.registerIcon(ReferenceVariables.MOD_ID.toLowerCase() + ":shardObsidian");
    }

}
