package ckhbox.villagebox.common.village.quest;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Quest {
	public ItemStack[] required;
	public ItemStack[] rewards;
	
	public boolean canComplete(EntityPlayer player){
		if(required == null) return true;
		for(int i = 0;i<required.length;i++){
			if(this.getItemNum(required[i], player) < required[i].stackSize){
				return false;
			}
		}
		return true;
	}
	
	public boolean complete(EntityPlayer player){
		
		if(!canComplete(player)) return false;
		
		for(int i = 0;i<required.length;i++){
			this.consumeItems(required[i], player);
		}
		
		if(rewards != null){
			for(int i =0;i<rewards.length;i++){
				if(!player.inventory.addItemStackToInventory(rewards[i])){
					player.dropPlayerItemWithRandomChoice(rewards[i], false);
				}
			}	
		}
		
		return true;
	}
	
	private int getItemNum(ItemStack itemstack, EntityPlayer player){
		ItemStack[] stacks = player.inventory.mainInventory;
		int count = 0;
		for (int i = 0; i < stacks.length; ++i)
        {
            if (stacks[i] != null && stacks[i].isItemEqual(itemstack))
            {
                count += stacks[i].stackSize;
            }
        }
		return count;
	}
	
	private void consumeItems(ItemStack itemstack, EntityPlayer player){
		ItemStack[] stacks = player.inventory.mainInventory;

		for (int i = 0; i < stacks.length; ++i)
        {
            if (stacks[i] != null && stacks[i].isItemEqual(itemstack))
            {
            	if(stacks[i].stackSize >= itemstack.stackSize){
            		stacks[i].stackSize -= itemstack.stackSize;
            		if(stacks[i].stackSize == 0) stacks[i] = null;
            		break;
            	}
            	else{
            		itemstack.stackSize -= stacks[i].stackSize;
            		stacks[i] = null;
            	}
            }
        }
	}
}
