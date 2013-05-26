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
        //Block Registry 
        //GameRegistry.registerBlock(ModBlocks.obsidianFurnaceIdle, "ObsidianFurnace");
        //GameRegistry.registerBlock(ModBlocks.obsidianFurnaceBurning, "ObsidianFurnace2");
        GameRegistry.registerBlock(ModBlocks.obsidianInfusedGravel, "ObsidianInfusedGravel");
        
        //crafting recipies
        //GameRegistry.addRecipe(new ItemStack(ModBlocks.obsidianFurnaceIdle), new Object[]{" 1 ","121"," 1 ", Character.valueOf('1'), ModItems.obsidianShard, Character.valueOf('2'), Block.furnaceIdle});
        GameRegistry.addRecipe(new ItemStack(Block.obsidian, 2), new Object[]{"11","11", Character.valueOf('1'), ModBlocks.obsidianInfusedGravel});
        
        
        //Smelting recipies
        GameRegistry.addSmelting(ModBlocks.obsidianInfusedGravel.blockID, new ItemStack(ModItems.obsidianShard), 0.1F);

        
        //language registry
        //LanguageRegistry.addName(ModBlocks.obsidianFurnaceIdle, "Obsidian Furnace");
        //LanguageRegistry.addName(ModBlocks.obsidianFurnaceBurning, "Obsidian Furnace");
        LanguageRegistry.addName(ModBlocks.obsidianInfusedGravel, "Obsidian Infused Gravel");
    }
}
