package com.ckhgame.villagebento.entity.animal;

import com.ckhgame.villagebento.item.ModItems;
import com.ckhgame.villagebento.util.village.PlayerMsg;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityVBSheep extends EntityVBAnimal
{

    public EntityVBSheep(World p_i1691_1_)
    {
        super(p_i1691_1_);
        this.setSize(0.9F, 1.3F);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 1.25D));
        this.tasks.addTask(3, new EntityAITempt(this, 1.0D, ModItems.itemSheepFood, false));
        this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        
        this.setAlwaysRenderNameTag(true);
        
        this.setGrowingAge(-24000 * 7);
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    protected boolean isAIEnabled()
    {
        return true;
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(12.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.23000000417232513D);
    }

    protected void entityInit()
    {
        super.entityInit();
    }

    /**
     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
     */
    public boolean interact(EntityPlayer p_70085_1_)
    {
        return super.interact(p_70085_1_);
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.sheep.say";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.sheep.say";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.sheep.say";
    }

    protected void func_145780_a(int p_145780_1_, int p_145780_2_, int p_145780_3_, Block p_145780_4_)
    {
        this.playSound("mob.sheep.step", 0.15F, 1.0F);
    }
    

	@Override
	public boolean breed(ItemStack food,EntityPlayer player) {
		if(food == null)
			return false;
		
		if(food.getItem() == ModItems.itemSheepFood){
			int s = this.getAnimState();
			if(s == AnimStateSick){
				PlayerMsg.send(player, this.getCommandSenderName() + "is sick and doesn't like to eat anything!");
			}
			else{
				this.feedAnimal(24000);
			}		
			return true;
		}
		else if(food.getItem() == ModItems.itemSheepPotion){
			int s = this.getAnimState();
			if(s != AnimStateSick){
				PlayerMsg.send(player, this.getCommandSenderName() + " is not sick!");
			}
			else{
				this.setAnimStateValue(-12000);
			}
		}
		
		return false;
	}

	@Override
	public boolean dropProduct(ItemStack tool,EntityPlayer player) {
		if(tool == null)
			return false;
		
		if(tool.getItem() == ModItems.itemWoolShears){ // hands
			
			if(this.hasProduct()){
				this.harvestProdcut();
				this.dropItem(ModItems.itemVillageWool, 1);
				this.playSound("mob.sheep.shear", 1.0F, 1.0F);
			}
		}
		return false;
	}
}