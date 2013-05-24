package mod.oc.block;


import mod.oc.ObsidiCraft;
import mod.oc.lib.ItemIDs;
import mod.oc.registry.registryBlock;
import net.minecraft.block.Block;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static Block obsidianFurnaceIdle;
    public static Block obsidianFurnaceBurning;
    
    
    public static void init()
    {
        obsidianFurnaceIdle = new obsidianFurnace(ItemIDs.obsidianFurnaceIdleDefault, false);
        obsidianFurnaceBurning = new obsidianFurnace(ItemIDs.obsidianFurnaceBurningDefault, true);
        
        
        GameRegistry.registerTileEntity(TileEntityObsidianFurnace.class, "TileEntityObsidianFurnace");
        NetworkRegistry.instance().registerGuiHandler(ObsidiCraft.instance2, ObsidiCraft.guiHandler);
        
        registryBlock.init();
    }
}
