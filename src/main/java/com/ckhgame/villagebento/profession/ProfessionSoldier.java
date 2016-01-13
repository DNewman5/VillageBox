package com.ckhgame.villagebento.profession;

import java.util.ArrayList;

import com.ckhgame.villagebento.entity.villager.EntityVBGuard;
import com.ckhgame.villagebento.entity.villager.EntityVBVillager;
import com.ckhgame.villagebento.util.data.RangeInt;
import com.ckhgame.villagebento.util.data.VillagerChat;
import com.ckhgame.villagebento.villagercomponent.VillagerCompAbout;
import com.ckhgame.villagebento.villagercomponent.VillagerCompWork;
import com.ckhgame.villagebento.villagercomponent.VillagerComponent;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class ProfessionSoldier extends Profession {

	@Override
	public String getProfessionName() {
		
		return StatCollector.translateToLocal("villager.soldier.name");
	}

	@Override
	public String getProfessionDescription() {
		
		return StatCollector.translateToLocal("villager.soldier.description");
	}
	
	@Override
	public Class<? extends EntityVBVillager> getEntityClass(){
		return EntityVBGuard.class;
	}
	
	@Override
	public boolean canSpawn() {
		
		return true;
	}

	
	
	@Override
	public void createVillagerComponents(ArrayList<VillagerComponent> components,EntityVBVillager villager) {

        components.add(new VillagerCompAbout(villager));

	}

	@Override
	public void initVillagerChat(VillagerChat villagerChat) {

		villagerChat.add(0, "villager.soldier.chat0");
		villagerChat.add(0, "villager.soldier.chat1");
		villagerChat.add(0, "villager.soldier.chat2");
		
	}

	@Override
	public String getSkinName() {
		return "soldier";
	}
	
	@Override
	protected void setTimeSchedule(){	
		timeSchedule.setSleeptime(new  RangeInt(6,14));
	}
	
	@Override
	protected void setILevelRequirements() {
		
		this.levelRequirements = new ItemStack[2][];
		
		this.levelRequirements[0] = new ItemStack[]{	new ItemStack(Items.stone_sword),
																						new ItemStack(Items.leather_boots),
																						new ItemStack(Items.leather_helmet),
																						new ItemStack(Items.leather_chestplate),
																						new ItemStack(Items.leather_leggings)};
		
		this.levelRequirements[1] = new ItemStack[]{	new ItemStack(Items.iron_sword),
																						new ItemStack(Items.iron_boots),
																						new ItemStack(Items.iron_helmet),
																						new ItemStack(Items.iron_chestplate),
																						new ItemStack(Items.iron_leggings)};

		
	}

}
