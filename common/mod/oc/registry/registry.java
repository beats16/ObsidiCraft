package mod.oc.registry;

import mod.oc.block.ModBlocks;
import mod.oc.craftingHandler.craftingHandler;
import mod.oc.item.ModItems;
import mod.oc.item.armor.ModArmor;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class registry
{
    
    public static void init()
    {
        GameRegistry.registerCraftingHandler(new craftingHandler());
        addMetaCycleRecipe(ModItems.obsidianCutter, Block.obsidian, 100);
        
        
        
        //gameRegistry 
        GameRegistry.registerItem(ModItems.obsidianShard, "shardObsidian");
        GameRegistry.registerItem(ModItems.obsidianSword, "swordObsidian");
        GameRegistry.registerItem(ModItems.obsidianPickaxe, "pickaxeObsidian");
        GameRegistry.registerItem(ModItems.obsidianAxe, "axeObsidian");
        GameRegistry.registerItem(ModItems.obsidianHoe, "hoeObsidian");
        GameRegistry.registerItem(ModItems.obsidianShovel, "shovelObsidian");
        GameRegistry.registerItem(ModItems.obsidianCutter, "obsidianCutter");
        GameRegistry.registerItem(ModItems.blackDiamond, "blackDiamond");
        GameRegistry.registerItem(ModItems.obsidianIngot, "obsidianIngot");
        GameRegistry.registerItem(ModArmor.obsidianBoots, "obsidianBoots");
        GameRegistry.registerItem(ModArmor.obsidianHelmet, "obsidianHelmet");
        GameRegistry.registerItem(ModArmor.obsidianChestPlate, "obsidianChestPlate");
        GameRegistry.registerItem(ModArmor.obsidianLeggings, "obsidianLeggings");
        GameRegistry.registerItem(ModArmor.blackDiamondBoots, "blackDiamondBoots");
        GameRegistry.registerItem(ModArmor.blackDiamondHelmet, "blackDiamondHelmet");
        GameRegistry.registerItem(ModArmor.blackDiamondChestPlate, "blackDiamondChestPlate");
        GameRegistry.registerItem(ModArmor.blackDiamondLeggings, "blackDiamondLeggings");
        GameRegistry.registerItem(ModItems.blackDiamondSword, "swordBlackDiamond");
        GameRegistry.registerItem(ModItems.blackDiamondPickaxe, "pickaxeBlackDiamond");
        GameRegistry.registerItem(ModItems.blackDiamondAxe, "axeBlackDiamond");
        GameRegistry.registerItem(ModItems.blackDiamondHoe, "hoeBlackDiamond");
        GameRegistry.registerItem(ModItems.blackDiamondShovel, "shovelBlackDiamond");
        GameRegistry.registerItem(ModItems.obsidianBow, "obsidianBow");
        GameRegistry.registerItem(ModItems.obsidianArrow, "obsidianArrow");
        
        //Recipies
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidianSword), new Object[]{" 1 "," 1 "," 2 ", Character.valueOf('1'), ModItems.obsidianShard, Character.valueOf('2'), Item.stick});
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidianShard, 4), new Object[]{" 1 ","121"," 1 ", Character.valueOf('1'), Block.obsidian, Character.valueOf('2'), new ItemStack(ModItems.obsidianCutter, 1, -1)});
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidianPickaxe), new Object[]{"111"," 2 "," 2 ", Character.valueOf('1'), ModItems.obsidianShard, Character.valueOf('2'), Item.stick});
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidianAxe), new Object[]{"11 ","12 "," 2 ", Character.valueOf('1'), ModItems.obsidianShard, Character.valueOf('2'), Item.stick});
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidianHoe), new Object[]{"11 "," 2 "," 2 ", Character.valueOf('1'), ModItems.obsidianShard, Character.valueOf('2'), Item.stick});
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidianShovel), new Object[]{" 1 "," 2 "," 2 ", Character.valueOf('1'), ModItems.obsidianShard, Character.valueOf('2'), Item.stick});
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidianCutter,1,100), new Object[]{" 1 ", " 3 ", " 2 ", Character.valueOf('1'), Item.ingotIron, Character.valueOf('2'), Item.stick, Character.valueOf('3'), Item.ingotGold});
        GameRegistry.addRecipe(new ItemStack(ModItems.blackDiamond), new Object[]{"121", "232", "121", Character.valueOf('1'), ModItems.obsidianShard, Character.valueOf('2'), Item.ingotGold, Character.valueOf('3'), Item.diamond});
        GameRegistry.addRecipe(new ItemStack(ModArmor.obsidianBoots), new Object[]{"   ", "2 2", "2 2", Character.valueOf('2'), ModItems.obsidianIngot});
        GameRegistry.addRecipe(new ItemStack(ModArmor.obsidianHelmet), new Object[]{"222", "2 2", "   ", Character.valueOf('2'), ModItems.obsidianIngot});
        GameRegistry.addRecipe(new ItemStack(ModArmor.obsidianChestPlate), new Object[]{"2 2", "222", "222", Character.valueOf('2'), ModItems.obsidianIngot});
        GameRegistry.addRecipe(new ItemStack(ModArmor.obsidianLeggings), new Object[]{"222", "2 2", "2 2", Character.valueOf('2'), ModItems.obsidianIngot});
        GameRegistry.addRecipe(new ItemStack(ModArmor.blackDiamondBoots), new Object[]{"   ", "2 2", "2 2", Character.valueOf('2'), ModItems.blackDiamond});
        GameRegistry.addRecipe(new ItemStack(ModArmor.blackDiamondHelmet), new Object[]{"222", "2 2", "   ", Character.valueOf('2'), ModItems.blackDiamond});
        GameRegistry.addRecipe(new ItemStack(ModArmor.blackDiamondChestPlate), new Object[]{"2 2", "222", "222", Character.valueOf('2'), ModItems.blackDiamond});
        GameRegistry.addRecipe(new ItemStack(ModArmor.blackDiamondLeggings), new Object[]{"222", "2 2", "2 2", Character.valueOf('2'), ModItems.blackDiamond});
        GameRegistry.addRecipe(new ItemStack(ModItems.blackDiamondSword), new Object[]{" 1 "," 1 "," 2 ", Character.valueOf('1'), ModItems.blackDiamond, Character.valueOf('2'), Item.ingotGold});
        GameRegistry.addRecipe(new ItemStack(ModItems.blackDiamondPickaxe), new Object[]{"111"," 2 "," 2 ", Character.valueOf('1'), ModItems.blackDiamond, Character.valueOf('2'), Item.ingotGold});
        GameRegistry.addRecipe(new ItemStack(ModItems.blackDiamondAxe), new Object[]{"11 ","12 "," 2 ", Character.valueOf('1'), ModItems.blackDiamond, Character.valueOf('2'), Item.ingotGold});
        GameRegistry.addRecipe(new ItemStack(ModItems.blackDiamondHoe), new Object[]{"11 "," 2 "," 2 ", Character.valueOf('1'), ModItems.blackDiamond, Character.valueOf('2'), Item.ingotGold});
        GameRegistry.addRecipe(new ItemStack(ModItems.blackDiamondShovel), new Object[]{" 1 "," 2 "," 2 ", Character.valueOf('1'), ModItems.blackDiamond, Character.valueOf('2'), Item.ingotGold});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.blackDiamond,9), new Object[] {ModBlocks.blackDiamondBlock});
        
        
        //smelting recipies
        GameRegistry.addSmelting(ModItems.obsidianShard.itemID, new ItemStack(ModItems.obsidianIngot), 0.1F);
        
        //Language Registry 
        LanguageRegistry.addName(ModItems.obsidianSword, "Obsidian Sword");
        LanguageRegistry.addName(ModItems.obsidianShard, "Obsidian Shard");
        LanguageRegistry.addName(ModItems.obsidianPickaxe, "Obsidian Pickaxe");
        LanguageRegistry.addName(ModItems.obsidianAxe, "Obsidian Axe");
        LanguageRegistry.addName(ModItems.obsidianHoe, "Obsidian Hoe");
        LanguageRegistry.addName(ModItems.obsidianShovel, "Obsidian Shovel");
        LanguageRegistry.addName(ModItems.obsidianCutter, "Obsidian Cutter");
        LanguageRegistry.addName(ModItems.blackDiamond, "Black Diamond");
        LanguageRegistry.addName(ModItems.obsidianIngot, "Obsidian Ingot");
        LanguageRegistry.addName(ModItems.blackDiamondSword, "Black Diamond Sword");
        LanguageRegistry.addName(ModItems.blackDiamondPickaxe, "Black Diamond Pickaxe");
        LanguageRegistry.addName(ModItems.blackDiamondAxe, "Black Diamond Axe");
        LanguageRegistry.addName(ModItems.blackDiamondHoe, "Black Diamond Hoe");
        LanguageRegistry.addName(ModItems.blackDiamondShovel, "Black Diamond Shovel");
        LanguageRegistry.addName(ModItems.obsidianArrow, "Obsidian Arrow");
        LanguageRegistry.addName(ModItems.obsidianBow, "Obsidian Bow");
        
        LanguageRegistry.addName(ModArmor.obsidianBoots, "Obsidian Boots");
        LanguageRegistry.addName(ModArmor.obsidianHelmet, "Obsidian Helmet");
        LanguageRegistry.addName(ModArmor.obsidianLeggings, "Obsidian Leggings");
        LanguageRegistry.addName(ModArmor.obsidianChestPlate, "Obsidian Chestplate");
        LanguageRegistry.addName(ModArmor.blackDiamondBoots, "Black Diamond Boots");
        LanguageRegistry.addName(ModArmor.blackDiamondHelmet, "Black Diamond Helmet");
        LanguageRegistry.addName(ModArmor.blackDiamondLeggings, "Black Diamond Leggings");
        LanguageRegistry.addName(ModArmor.blackDiamondChestPlate, "Black Diamond Chestplate");
        
    }
    
    
    protected static void addMetaCycleRecipe(Object input, Block stone, int n) 
    {

        int outputI;

        /*
         * Makes a single item cycle through its meta values when it's crafted
         * with a PStone
         */
        for (int i = 0; i < n; i++) 
        {
            outputI = i == n - 1 ? 0 : i + 1;

            GameRegistry.addRecipe(new ItemStack(ModItems.obsidianShard, 4), new Object[]{" 1 ","121"," 1 ", Character.valueOf('1'), Block.obsidian, Character.valueOf('2'), new ItemStack((Item) input, 1, outputI)});
        }
    }


    

    
}
