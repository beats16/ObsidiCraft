package mod.oc.block;


import mod.oc.ObsidiCraft;
import mod.oc.lib.BlockIDs;
import mod.oc.registry.registryBlock;
import net.minecraft.block.Block;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static Block obsidianFurnaceIdle;
    public static Block obsidianFurnaceBurning;
    public static Block obsidianInfusedGravel;
    
    
    public static void init()
    {
        //obsidianFurnaceIdle = new obsidianFurnace(ItemIDs.obsidianFurnaceIdleDefault, false);
        //obsidianFurnaceBurning = new obsidianFurnace(ItemIDs.obsidianFurnaceBurningDefault, true);
        obsidianInfusedGravel = new obsidianGravel(BlockIDs.obsdianGravel);
        
        //GameRegistry.registerTileEntity(TileEntityObsidianFurnace.class, "TileEntityObsidianFurnace");
        //NetworkRegistry.instance().registerGuiHandler(ObsidiCraft.instance, ObsidiCraft.guiHandler);
        
        registryBlock.init();
    }
}
