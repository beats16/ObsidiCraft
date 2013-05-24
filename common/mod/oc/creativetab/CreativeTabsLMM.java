package mod.oc.creativetab;



import mod.oc.lib.ItemIDs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.StringTranslate;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabsLMM extends CreativeTabs
{

    public CreativeTabsLMM(int par1, String par2Str)
    {
        super(par1, par2Str);
    }
    
    @Override
    @SideOnly(Side.CLIENT)

    /**
     * Gets the translated Label.
     */
    public String getTranslatedTabLabel(){
        return StringTranslate.getInstance().translateKey(this.getTabLabel());
        
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    /**
     * the itemID for the item to be displayed on the tab
     */
    public int getTabIconItemIndex() {

        return ItemIDs.obsidianSworddefault + 256;
    }
  
}
