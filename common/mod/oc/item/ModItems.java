package mod.oc.item;

import mod.oc.lib.ItemIDs;
import mod.oc.registry.registry;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;


public class ModItems
{
    public static Item obsidianSword;
    public static Item obsidianShard;
    public static Item obsidianPickaxe;
    public static Item obsidianAxe;
    public static Item obsidianHoe;
    public static Item obsidianShovel;
    public static Item obsidianCutter;
    public static Item blackDiamond;
    public static Item obsidianIngot;
    public static EnumToolMaterial obsidian;
    
    public static void init(){
        
        obsidian = EnumHelper.addToolMaterial("OBSIDIAN", 4, 1100, 9.0F, 3, 30);
        
        //items
        obsidianSword = new obsidianSword(ItemIDs.obsidianSworddefault, obsidian);
        obsidianShard = new obsidianShard(ItemIDs.obsidianSharddefault).setUnlocalizedName("shardObsidian");
        obsidianPickaxe = new obsidianPickaxe(ItemIDs.obsidianPickaxedefault, obsidian);
        obsidianAxe = new obsidianAxe(ItemIDs.obsidianHatchetdefault, obsidian);
        obsidianHoe = new obsidianHoe(ItemIDs.obsidianHoedefault, obsidian);
        obsidianShovel = new obsidianShovel(ItemIDs.obsidianShoveldefault, obsidian);
        obsidianCutter = new obsidianCutter(ItemIDs.obsidianCutterdefault);
        blackDiamond = new blackDiamond(ItemIDs.blackDiamonddefault);
        obsidianIngot = new obsidianIngot(ItemIDs.obsidianIngotDefault);
        
        
        obsidianCutter.setContainerItem(obsidianCutter);
        
        registry.init();
        
    }
}
