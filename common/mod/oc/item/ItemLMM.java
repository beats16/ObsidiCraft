package mod.oc.item;

import mod.oc.lib.ReferenceVariables;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Lets-Mod-Mod
 * 
 * Let's Mod Mod
 * 
 * @author matthew
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ItemLMM extends Item
{

    public ItemLMM(int id)
    {
        super(id);
    }
    

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) 
    {
        String name = this.getUnlocalizedName();
        String name2 = name.substring(5);
        itemIcon = iconRegister.registerIcon(ReferenceVariables.MOD_ID.toLowerCase() + ":" + name2);
    }

}
