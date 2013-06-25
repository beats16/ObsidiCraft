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
        
        
        //crafting recipies
        GameRegistry.addRecipe(new ItemStack(Block.obsidian, 2), new Object[]{"11","11", Character.valueOf('1'), ModBlocks.obsidianInfusedGravel});
        
        
        //Smelting recipies
        GameRegistry.addSmelting(ModBlocks.obsidianInfusedGravel.blockID, new ItemStack(ModItems.obsidianShard), 0.1F);

        
        //language registry
        LanguageRegistry.addName(ModBlocks.obsidianInfusedGravel, "Obsidian Infused Gravel");
        LanguageRegistry.addName(ModBlocks.blackDiamondBlock, "Block Of Black Diamond");
        LanguageRegistry.addName(ModBlocks.obsidianBrickCarved, "Obsidian Brick");
        LanguageRegistry.addName(ModBlocks.obsidianGlass, "Obsidian Glass");
        LanguageRegistry.addName(ModBlocks.obsidianStone, "Obsidian Stone");
        LanguageRegistry.addName(ModBlocks.obsidianStoneBrick, "Obsidian Stone Brick");
    }
}
