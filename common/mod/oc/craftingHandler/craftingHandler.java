package mod.oc.craftingHandler;

import mod.oc.item.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;

public class craftingHandler implements ICraftingHandler
{

    
    @Override
    public void onCrafting(EntityPlayer player, ItemStack item, IInventory craftMatrix)
    {
        if(player.worldObj.isRemote)
        {
            for(int i = 0; i<craftMatrix.getSizeInventory(); i++)
            {
                if(craftMatrix.getStackInSlot(i) != null)
                {
                    ItemStack j = craftMatrix.getStackInSlot(i);
                    if(j.getItem() == ModItems.obsidianCutter)
                    {
                        j.damageItem(1, player);
                        System.out.println(ModItems.obsidianCutter.getItemDamageFromStack(j));
                        
                        j.damageItem(1, player);
                        if(j.stackSize == 0)
                            j = null;
                        craftMatrix.setInventorySlotContents(i, j);
                    }
                }
            }
        }
    }

    @Override
    public void onSmelting(EntityPlayer player, ItemStack item)
    {
        // TODO Auto-generated method stub
        
    }
    
} 
