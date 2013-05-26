package mod.oc;


import mod.oc.block.GuiHandler;
import mod.oc.block.ModBlocks;
import mod.oc.creativetab.CreativeTabsLMM;
import mod.oc.helper.PacketHandler;
import mod.oc.item.ModItems;
import mod.oc.lib.ReferenceVariables;
import mod.oc.worldGen.ModWorldGenerator;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Lets-Mod-Mod
 * 
 * Let's Mod Mod
 * 
 * @author matthew
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

@Mod(modid = ReferenceVariables.MOD_ID, name = ReferenceVariables.MOD_NAME, version = ReferenceVariables.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false, channels = "ObsidiCraft", packetHandler = PacketHandler.class)
public class ObsidiCraft {
    
    @Instance(ReferenceVariables.MOD_ID)
    public static ObsidiCraft instance; 
    public static ModBlocks instance2 = new ModBlocks();  
    public static GuiHandler guiHandler = new GuiHandler();
    
    public static CreativeTabs tabsOC = new CreativeTabsLMM(CreativeTabs.getNextID(), "ObsidiCraft");
    
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event) 
    {
        ModItems.init();
        
        ModBlocks.init();
        
    }
    
    @Init
    public void load(FMLInitializationEvent event) 
    { 
        MinecraftForge.ORE_GEN_BUS.register(new ModWorldGenerator());
        //GameRegistry.registerWorldGenerator(new ModWorldGenerator());
       
    }

    @PostInit
    public void modsLoaded(FMLPostInitializationEvent event) 
    {
        

    }
}