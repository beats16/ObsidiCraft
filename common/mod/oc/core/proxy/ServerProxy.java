package mod.oc.core.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ServerProxy
{
    public int addArmor(String armor)
    {
        return 0;
    }
    
    @SuppressWarnings("unchecked")
    public void registerTileEntity(Class clas, String ident) 
    {
        GameRegistry.registerTileEntity(clas, ident);
    }
}
