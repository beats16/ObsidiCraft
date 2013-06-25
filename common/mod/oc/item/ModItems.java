package mod.oc.item;

import mod.oc.ObsidiCraft;
import mod.oc.core.proxy.ClientProxy;
import mod.oc.core.proxy.ServerProxy;
import mod.oc.item.armor.ItemObsidianArmor;
import mod.oc.item.armor.ModArmor;
import mod.oc.item.tools.obsidianAxe;
import mod.oc.item.tools.obsidianCutter;
import mod.oc.item.tools.obsidianHoe;
import mod.oc.item.tools.obsidianPickaxe;
import mod.oc.item.tools.obsidianShovel;
import mod.oc.item.tools.obsidianSword;
import mod.oc.lib.ItemIDs;
import mod.oc.registry.registry;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraftforge.common.EnumHelper;


public class ModItems
{
    public static ClientProxy proxy;
    public static Item obsidianSword;
    public static Item obsidianShard;
    public static Item obsidianPickaxe;
    public static Item obsidianAxe;
    public static Item obsidianHoe;
    public static Item obsidianShovel;
    public static Item obsidianCutter;
    public static Item blackDiamond;
    public static Item obsidianIngot;
    public static Item blackDiamondSword;
    public static Item blackDiamondPickaxe;
    public static Item blackDiamondAxe;
    public static Item blackDiamondHoe;
    public static Item blackDiamondShovel;
    public static ModItemBow obsidianBow;
    public static Item obsidianArrow;
    
    public static EnumToolMaterial obsidianTool;
    public static EnumToolMaterial blackDiamondTool;
    
    public static void init(){
        
        obsidianTool = EnumHelper.addToolMaterial("OBSIDIAN", 4, 1100, 9.0F, 3, 20);
        blackDiamondTool = EnumHelper.addToolMaterial("BLACKDIAMOND", 6, 2000, 15.0F, 6, 40);
        
        //items
        obsidianSword = new obsidianSword(ItemIDs.obsidianSworddefault, obsidianTool).setUnlocalizedName("swordObsidian");
        obsidianShard = new obsidianShard(ItemIDs.obsidianSharddefault).setUnlocalizedName("shardObsidian");
        obsidianPickaxe = new obsidianPickaxe(ItemIDs.obsidianPickaxedefault, obsidianTool).setUnlocalizedName("pickaxeObsidian");
        obsidianAxe = new obsidianAxe(ItemIDs.obsidianHatchetdefault, obsidianTool).setUnlocalizedName("hatchetObsidian");
        obsidianHoe = new obsidianHoe(ItemIDs.obsidianHoedefault, obsidianTool).setUnlocalizedName("hatchetObsidian");
        obsidianShovel = new obsidianShovel(ItemIDs.obsidianShoveldefault, obsidianTool).setUnlocalizedName("shovelObsidian");
        blackDiamondSword = new obsidianSword(ItemIDs.blackDiamondSworddefault, blackDiamondTool).setUnlocalizedName("swordBlackDiamond");
        blackDiamondPickaxe = new obsidianPickaxe(ItemIDs.blackDiamondPickaxedefault, blackDiamondTool).setUnlocalizedName("pickaxeBlackDiamond");
        blackDiamondAxe = new obsidianAxe(ItemIDs.blackDiamondAxedefault, blackDiamondTool).setUnlocalizedName("hatchetBlackDiamond");
        blackDiamondHoe = new obsidianHoe(ItemIDs.blackDiamondHoedefault, blackDiamondTool).setUnlocalizedName("hoeBlackDiamond");
        blackDiamondShovel = new obsidianShovel(ItemIDs.blackDiamondShoveldefault, blackDiamondTool).setUnlocalizedName("shovelBlackDiamond");
        obsidianCutter = new obsidianCutter(ItemIDs.obsidianCutterdefault);
        blackDiamond = new blackDiamond(ItemIDs.blackDiamonddefault);
        obsidianIngot = new obsidianIngot(ItemIDs.obsidianIngotDefault);
        obsidianBow = (ModItemBow)(new ModItemBow(ItemIDs.obsidianBowDefault)).setUnlocalizedName("obsidianBow");
        obsidianArrow = new ItemLMM(ItemIDs.obsidianArrowDefault).setCreativeTab(ObsidiCraft.tabsOC).setUnlocalizedName("obsidianTippedArrow");
        
        obsidianCutter.setContainerItem(obsidianCutter);
        
        ModArmor.init();
        
        registry.init();
        
    }
}
