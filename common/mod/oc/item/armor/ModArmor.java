package mod.oc.item.armor;

import mod.oc.lib.ItemIDs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraftforge.common.EnumHelper;

public class ModArmor
{
    public static ItemObsidianArmor obsidianBoots;
    public static ItemObsidianArmor obsidianLeggings;
    public static ItemObsidianArmor obsidianHelmet;
    public static ItemObsidianArmor obsidianChestPlate;
    public static ItemBlackDiamondArmor blackDiamondBoots;
    public static ItemBlackDiamondArmor blackDiamondLeggings;
    public static ItemBlackDiamondArmor blackDiamondHelmet;
    public static ItemBlackDiamondArmor blackDiamondChestPlate;
    
    public static EnumArmorMaterial obsidianArmour;
    public static EnumArmorMaterial blackDiamondArmour;
    
    public static void init()
    {
        obsidianArmour = EnumHelper.addArmorMaterial("OBSIDIAN", 50, new int[] {2,7,5,2}, 20);
        blackDiamondArmour = EnumHelper.addArmorMaterial("BLACK_DIAMOND", 90, new int[] {4,10,8,4}, 40);
        
        obsidianBoots = (ItemObsidianArmor) new ItemObsidianArmor(ItemIDs.obsidianBootsDefault, obsidianArmour, 0 , 3).setUnlocalizedName("bootsObsidian");
        obsidianLeggings = (ItemObsidianArmor) new ItemObsidianArmor(ItemIDs.obsidianLeggingsDefault, obsidianArmour, 0 ,2).setUnlocalizedName("leggingsObsidian");
        obsidianHelmet = (ItemObsidianArmor) new ItemObsidianArmor(ItemIDs.obsidianHelmetDefault, obsidianArmour, 0, 0).setUnlocalizedName("helmetObsidian");
        obsidianChestPlate = (ItemObsidianArmor) new ItemObsidianArmor(ItemIDs.obsidianChestPlateDefault, obsidianArmour, 0 , 1).setUnlocalizedName("chestplateObsidian");
        
        blackDiamondBoots = (ItemBlackDiamondArmor) new ItemBlackDiamondArmor(ItemIDs.blackDiamondBootsDefault, blackDiamondArmour, 0 , 3).setUnlocalizedName("bootsBlackDiamond");
        blackDiamondLeggings = (ItemBlackDiamondArmor) new ItemBlackDiamondArmor(ItemIDs.blackDiamondLeggingsDefault, blackDiamondArmour, 0 ,2).setUnlocalizedName("leggingsBlackDiamond");
        blackDiamondHelmet = (ItemBlackDiamondArmor) new ItemBlackDiamondArmor(ItemIDs.blackDiamondHelmetDefault, blackDiamondArmour, 0, 0).setUnlocalizedName("helmetBlackDiamond");
        blackDiamondChestPlate = (ItemBlackDiamondArmor) new ItemBlackDiamondArmor(ItemIDs.blackDiamondChestPlateDefault, blackDiamondArmour, 0 , 1).setUnlocalizedName("chestplateBlackDiamond");
    }
}
