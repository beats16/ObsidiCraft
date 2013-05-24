package mod.oc.registry;

import mod.oc.item.ModItems;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;

public class achievements
{
    public static Achievement buildFurnace;
    public static Achievement blackDiamond;
    public static Achievement buildObsidianPickaxe;
    public static Achievement buildObsidianHoe;
    public static Achievement buildObsidianSword;
    
    public void init()
    {
        //Achievements
        //buildFurnace = (new Achievement(4, "buildFurnace", 3, 4, ModBlocks.obsidianFurnaceIdle, AchievementList.buildPickaxe)).setIndependent().registerAchievement();
        blackDiamond = (new Achievement(30, "blackDiamonds", -3, 5, ModItems.blackDiamond, AchievementList.diamonds)).setIndependent().registerAchievement();
        buildObsidianPickaxe = (new Achievement(31, "buildObsidianPickaxe", 8, 2, ModItems.obsidianPickaxe, AchievementList.buildBetterPickaxe)).setIndependent().registerAchievement();
        buildObsidianHoe = (new Achievement(32, "buildObsidianHoe", 4, -5, ModItems.obsidianHoe, AchievementList.buildHoe)).setIndependent().registerAchievement();
        buildObsidianSword = (new Achievement(33, "buildObsidianSword", 7, -1, ModItems.obsidianSword, AchievementList.buildSword)).setIndependent().registerAchievement();

    }

}
