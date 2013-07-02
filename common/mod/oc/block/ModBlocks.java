package mod.oc.block;



import mod.oc.ObsidiCraft;
import mod.oc.lib.BlockIDs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;

public class ModBlocks
{
    public static Block obsidianInfusedGravel;
    public static Block obsidianStoneBrick;
    public static Block obsidianStone;
    public static Block obsidianBrickCarved;
    public static Block obsidianGlass;
    public static Block blackDiamondBlock;
    public static Block obsidianPane;
    public static Block obsidianLava;
    public static Block obsidianLavaStoneBrick;
    public static Block obsidianLavaBrickCarved;
    public static Block blackDiamondOre;
    
    public static void init()
    {
        obsidianInfusedGravel = new obsidianGravel(BlockIDs.obsdianGravel);
        obsidianStoneBrick = new ModBlock(BlockIDs.obsidianStoneBrick).setHardness(4.0f).setResistance(2000.0f).setUnlocalizedName("obsidianStoneBrick");
        obsidianStone = new ModBlock(BlockIDs.obsidianStone).setHardness(4.0f).setResistance(2000.0f).setUnlocalizedName("obsidianStone");
        obsidianBrickCarved = new ModBlock(BlockIDs.obsidianBrickCarved).setHardness(4.0f).setResistance(2000.0f).setUnlocalizedName("obsidianBrickCarved");
        obsidianGlass = new ModGlass(BlockIDs.obsidianGlass).setResistance(2000.0f).setHardness(10.0f).setUnlocalizedName("obsidianGlass");
        blackDiamondBlock = new ModBlock(BlockIDs.blackDiamondBlock).setHardness(10.0f).setUnlocalizedName("blockBlackDiamond");
        obsidianPane = (new ModPane(BlockIDs.obsidianPane, "obsidianGlass", "thinObsidianGlass_top", Material.glass, true)).setCreativeTab(ObsidiCraft.tabsOC).setHardness(0.3F).setUnlocalizedName("obsidianGlass");
        obsidianLava = new ModBlock(BlockIDs.obsidianLava).setHardness(20.0f).setResistance(2000.0f).setUnlocalizedName("obsidianLava");
        obsidianLavaStoneBrick = new ModBlock(BlockIDs.obsidianLavaStoneBrick).setHardness(4.0f).setResistance(2000.0f).setUnlocalizedName("obsidianLavaStoneBrick");
        obsidianLavaBrickCarved = new ModBlock(BlockIDs.obsidianLavaBrickCarved).setHardness(4.0f).setResistance(2000.0f).setUnlocalizedName("obsidianLavaBrickCarved");
        blackDiamondOre = new ModOre(BlockIDs.blackDiamondOre).setHardness(4.0f).setUnlocalizedName("blackDiamondOre");
    }
}
