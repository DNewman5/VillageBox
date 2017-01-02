package ckhbox.villagebox.common.village.villager;

import ckhbox.villagebox.common.entity.villager.EntityVillager;
import ckhbox.villagebox.common.util.helper.ItemStackHelper;
import ckhbox.villagebox.common.village.profession.Profession;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;

public class InventoryUpgrading implements IInventory{

	private ItemStack[] inventoryItems = new ItemStack[3];
	
	private EntityVillager villager;
	private EntityPlayer player;
	
	private int currentUpgradeOptionIndex;
	private Profession currentUpgradeOption;
	
	private boolean canUpgrade = false;
	
	public InventoryUpgrading(EntityPlayer player, EntityVillager villager){
		this.villager = villager;
		this.player = player;
		this.resetUpgradeOptionAndSlots();
	}
	
	@Override
	public String getName() {
		return "villagebox.upgrading";
	}

	@Override
	public boolean hasCustomName() {
		return false;
	}

	@Override
	public ITextComponent getDisplayName() {
		return new TextComponentString(this.getName());
	}

	@Override
	public int getSizeInventory() {
		return this.inventoryItems.length;
	}
	
	@Override
	public ItemStack getStackInSlot(int index) {
		return index >= this.getSizeInventory() ? null : this.inventoryItems[index];
	}

	@Override
	public ItemStack decrStackSize(int index, int count) {
		if (this.inventoryItems[index] != null)
        {
			if (this.inventoryItems[index].func_190916_E() <= count)
            {
                ItemStack take = this.inventoryItems[index];
                this.inventoryItems[index] = null;

                this.resetUpgradeOptionAndSlots();

    			//System.out.println("decrStackSize(not empty)");
                return take;
            }
            else
            {
                ItemStack take = this.inventoryItems[index].splitStack(count);

                if (this.inventoryItems[index].func_190916_E() == 0)
                {
                    this.inventoryItems[index] = null;
                }

                this.resetUpgradeOptionAndSlots();

                return take;
            }
        }
        else
        {
            return null;
        }
	}
	
	@Override
	public ItemStack removeStackFromSlot(int index) {
		if(this.inventoryItems[index] != null){
			ItemStack removed = this.inventoryItems[index];
			this.inventoryItems[index] = null;
			return removed;
		}
		else{
			return null;
		}
	}

	@Override
	public void setInventorySlotContents(int index, ItemStack stack) {
		
 		this.inventoryItems[index] = stack;
		
		if (stack != null && stack.func_190916_E() > this.getInventoryStackLimit())
        {
            stack.func_190920_e(this.getInventoryStackLimit());
        }

        this.resetUpgradeOptionAndSlots();
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public void markDirty() {
		this.resetUpgradeOptionAndSlots();
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		return true;
	}

	@Override
	public void openInventory(EntityPlayer player) {
		
	}

	@Override
	public void closeInventory(EntityPlayer player) {
		
	}

	@Override
	public boolean isItemValidForSlot(int index, ItemStack stack) {
		return true;
	}

	@Override
	public int getField(int id) {
		return 0;
	}

	@Override
	public void setField(int id, int value) {
		
	}

	@Override
	public int getFieldCount() {
		return 0;
	}

	@Override
	public void clear() {
		for (int i = 0; i < this.inventoryItems.length; ++i)
        {
            this.inventoryItems[i] = null;
        }
	}

	public boolean canUpgrade(){
		return this.canUpgrade;
	}
	
	public void upgrade(){
    	if(this.canUpgrade()){
    		if(ItemStackHelper.consume(this.inventoryItems, this.currentUpgradeOption.getUpgradeToCurentNeeds(), 3)){
    			this.villager.upgrade(this.currentUpgradeOption.getRegID());
    			this.player.closeScreen();
    		}
    	}
	}
	
	public void resetUpgradeOptionAndSlots()
    {     
        Profession[] options = this.villager.getProfession().getUpgradeToNextOptions();
        this.currentUpgradeOption = options == null?null:options[this.currentUpgradeOptionIndex];
 
        this.canUpgrade = false;
        if(this.currentUpgradeOption != null){
        	if(ItemStackHelper.match(this.inventoryItems, this.currentUpgradeOption.getUpgradeToCurentNeeds(), 3)){
            	this.canUpgrade = true;
            }
        }  

    }
	
	public void setCurrentUpgradeOptionIndex(int currentUpgradeOptionIndex)
    {
        this.currentUpgradeOptionIndex = currentUpgradeOptionIndex;
        this.resetUpgradeOptionAndSlots();
    }

	@Override
	public boolean func_191420_l() {
		// TODO Auto-generated method stub
		return false;
	}
}
