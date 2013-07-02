package mod.oc.registry;

import mod.oc.block.ModBlocks;
import mod.oc.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class registryBlock
{
    public static void init()
    {

        GameRegistry.registerBlock(ModBlocks.obsidianInfusedGravel, "ObsidianInfusedGravel");
        GameRegistry.registerBlock(ModBlocks.blackDiamondBlock, "blackDiamondBlock");
        GameRegistry.registerBlock(ModBlocks.obsidianBrickCarved, "ObsidianBrickCarved");
        GameRegistry.registerBlock(ModBlocks.obsidianGlass, "ObsidianGlass");
        GameRegistry.registerBlock(ModBlocks.obsidianStone, "ObsidianStone");
        GameRegistry.registerBlock(ModBlocks.obsidianStoneBrick, "ObsidianStoneBrick");
        GameRegistry.registerBlock(ModBlocks.obsidianLava, "ObsidianLava");
        GameRegistry.registerBlock(ModBlocks.obsidianLavaStoneBrick, "ObsidianLavaStoneBrick");
        GameRegistry.registerBlock(ModBlocks.obsidianLavaBrickCarved, "ObsidianLavaStoneBrickCarved");
        GameRegistry.registerBlock(ModBlocks.blackDiamondOre, "BlackDiamondOre");
        
        GameRegistry.registerBlock(ModBlocks.obsidianPane, "ObsidianPane");
        
        //crafting recipies
        GameRegistry.addRecipe(new ItemStack(Block.obsidian, 2), new Object[]{"11","11", Character.valueOf('1'), ModBlocks.obsidianInfusedGravel});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.obsidianGlass, 8), new Object[]{"111","121","111", Character.valueOf('1'), Block.glass, Character.valueOf('2'), ModItems.obsidianShard});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blackDiamondBlock,1), new Object[]{"111","111","111", Character.valueOf('1'), ModItems.blackDiamond});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.obsidianStoneBrick, 4), new Object[]{"11","11", Character.valueOf('1'), ModBlocks.obsidianStone});
        //GameRegistry.addRecipe(new ItemStack(ModBlocks.obsidianPane, 16), new Object[]{"111","111", Character.valueOf('1'), ModBlocks.obsidianGlass});
        
        //Smelting recipies
        GameRegistry.addSmelting(ModBlocks.obsidianInfusedGravel.blockID, new ItemStack(ModItems.obsidianShard), 0.1F);
        GameRegistry.addSmelting(Block.obsidian.blockID, new ItemStack(ModBlocks.obsidianStone), 0.5f);
        
        //language registry
        LanguageRegistry.addName(ModBlocks.obsidianInfusedGravel, "Obsidian Infused Gravel");
        LanguageRegistry.addName(ModBlocks.blackDiamondBlock, "Block Of Black Diamond");
        LanguageRegistry.addName(ModBlocks.obsidianBrickCarved, "Obsidian Brick");
        LanguageRegistry.addName(ModBlocks.obsidianGlass, "Obsidian Glass");
        LanguageRegistry.addName(ModBlocks.obsidianStone, "Obsidian Stone");
        LanguageRegistry.addName(ModBlocks.obsidianStoneBrick, "Obsidian Stone Brick");
        LanguageRegistry.addName(ModBlocks.obsidianLavaStoneBrick, "Obsidian Lava Stone Brick");
        LanguageRegistry.addName(ModBlocks.obsidianLavaBrickCarved, "Obsidian Lava Brick Carved");
        LanguageRegistry.addName(ModBlocks.blackDiamondOre, "Black Diamond Ore");
        LanguageRegistry.addName(ModBlocks.obsidianLava, "Lava Infused Obsidian");
        LanguageRegistry.addName(ModBlocks.obsidianPane, "Obsidian Glass Pane");
    }
}
