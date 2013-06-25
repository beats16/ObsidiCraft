package mod.oc.item.armor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mod.oc.ObsidiCraft;
import mod.oc.lib.ReferenceVariables;
import mod.oc.lib.Textures;
import net.minecraft.block.BlockDispenser;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.dispenser.IBehaviorDispenseItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.IArmorTextureProvider;

public class ItemObsidianArmor extends ItemArmor 
{
    /** Holds the 'base' maxDamage that each armorType have. */
    private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
    private static final String[] field_94606_cu = new String[] {"helmetCloth_overlay", "chestplateCloth_overlay", "leggingsCloth_overlay", "bootsCloth_overlay"};
    public static final String[] field_94603_a = new String[] {"slot_empty_helmet", "slot_empty_chestplate", "slot_empty_leggings", "slot_empty_boots"};
    private static final IBehaviorDispenseItem field_96605_cw = new BehaviorDispenseArmorObsidian();

    /**
     * Stores the armor type: 0 is helmet, 1 is plate, 2 is legs and 3 is boots
     */
    public final int armorType;

    /** Holds the amount of damage that the armor reduces at full durability. */
    public final int damageReduceAmount;

    /**
     * Used on RenderPlayer to select the correspondent armor to be rendered on the player: 0 is cloth, 1 is chain, 2 is
     * iron, 3 is diamond and 4 is gold.
     */
    public final int renderIndex;

    /** The EnumArmorMaterial used for this ItemArmor */
    private final EnumArmorMaterial material;
    @SideOnly(Side.CLIENT)
    private Icon field_94605_cw;
    @SideOnly(Side.CLIENT)
    public Icon field_94604_cx;

    public ItemObsidianArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4)
    {
        super(par1, par2EnumArmorMaterial, par3, par4);
        this.material = par2EnumArmorMaterial;
        this.armorType = par4;
        this.renderIndex = par3;
        this.damageReduceAmount = par2EnumArmorMaterial.getDamageReductionAmount(par4);
        this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
        this.maxStackSize = 1;
        this.setCreativeTab(ObsidiCraft.tabsOC);
        BlockDispenser.dispenseBehaviorRegistry.putObject(this, field_96605_cw);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister)
    {
        String name = this.getUnlocalizedName();
        String name2 = name.substring(5);
        itemIcon = iconRegister.registerIcon(ReferenceVariables.MOD_ID.toLowerCase() + ":" + name2);
        
    }


    @SideOnly(Side.CLIENT)
    public static Icon func_94602_b(int par0)
    {
        switch (par0)
        {
            case 0:
                return ModArmor.obsidianHelmet.field_94604_cx;
            case 1:
                return ModArmor.obsidianChestPlate.field_94604_cx;
            case 2:
                return ModArmor.obsidianLeggings.field_94604_cx;
            case 3:
                return ModArmor.obsidianBoots.field_94604_cx;
            default:
                return null;
        }
    }


    @Override
    @SideOnly(Side.CLIENT)
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, int layer)
    {
        if(itemstack.itemID == ModArmor.obsidianBoots.itemID || itemstack.itemID == ModArmor.obsidianChestPlate.itemID || itemstack.itemID == ModArmor.obsidianHelmet.itemID)
        {
            return "/mods/oc/textures/armor/obsidian_1.png";
        }
        
        if(itemstack.itemID == ModArmor.obsidianLeggings.itemID )
        {
            return "/mods/oc/textures/armor/obsidian_2.png";
        }
        return null;
    }
}
