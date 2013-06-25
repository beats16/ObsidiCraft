package mod.oc.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mod.oc.lib.ReferenceVariables;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class ModPane extends BlockPane
{

    @SideOnly(Side.CLIENT)
    private Icon theIcon;
    
    protected ModPane(int par1, String par2Str, String par3Str,Material par4Material, boolean par5)
    {
        super(par1, par2Str, par3Str, par4Material, par5);
    }

    @SideOnly(Side.CLIENT)

    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IconRegister iconRegister)
    {
        String name = this.getUnlocalizedName();
        String name2 = name.substring(5);
        blockIcon = iconRegister.registerIcon(ReferenceVariables.MOD_ID.toLowerCase() + ":" +name2);
        theIcon = iconRegister.registerIcon(ReferenceVariables.MOD_ID.toLowerCase() + ":obsidianGlass");
    }
    
    @SideOnly(Side.CLIENT)

    /**
     * Returns the texture index of the thin side of the pane.
     */
    public Icon getSideTextureIndex()
    {
        return this.theIcon;
    }
}
