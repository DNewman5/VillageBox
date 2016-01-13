package com.ckhgame.villagebento.profession;

import java.util.ArrayList;

import com.ckhgame.villagebento.block.ModBlocks;
import com.ckhgame.villagebento.entity.villager.EntityVBVillager;
import com.ckhgame.villagebento.util.data.RangeInt;
import com.ckhgame.villagebento.util.data.VillagerChat;
import com.ckhgame.villagebento.villagercomponent.VillagerCompAbout;
import com.ckhgame.villagebento.villagercomponent.VillagerCompBuy;
import com.ckhgame.villagebento.villagercomponent.VillagerComponent;

import net.minecraft.init.Items;
import net.minecraft.util.StatCollector;

public class ProfessionFlowerShopOwner extends Profession {

	@Override
	public String getProfessionName() {
		
		return StatCollector.translateToLocal("villager.flowershopowner.name");
	}

	@Override
	public String getProfessionDescription() {
		
		return StatCollector.translateToLocal("villager.flowershopowner.description");
	}
	
	@Override
	public boolean isMale(){
		return false;
	}
	
	@Override
	public boolean canSpawn() {
		
		return true;
	}

	
	
	@Override
	public void createVillagerComponents(ArrayList<VillagerComponent> components,EntityVBVillager villager) {

        components.add(new VillagerCompAbout(villager));
        
        VillagerCompBuy compBuy = new VillagerCompBuy(villager);
        compBuy.addItem(Items.flower_pot, 0);
        compBuy.addItem(ModBlocks.blockSunflower, 0);
        compBuy.addItem(ModBlocks.blockPeacefulGarden, 0);
        compBuy.addItem(ModBlocks.blockTeaChair, 0);
        compBuy.addItem(ModBlocks.blockAutumnGarden, 0);
        compBuy.addItem(ModBlocks.blockRoseBridge, 0);
        compBuy.addItem(ModBlocks.blockRosePath, 0);
        compBuy.addItem(ModBlocks.blockChristmas, 0);
        components.add(compBuy);

	}

	@Override
	public void initVillagerChat(VillagerChat villagerChat) {

		villagerChat.add(0, StatCollector.translateToLocal("villager.flowershopowner.chat0"));
		villagerChat.add(0, StatCollector.translateToLocal("villager.flowershopowner.chat1"));
		villagerChat.add(0, StatCollector.translateToLocal("villager.flowershopowner.chat2"));
		

		
	}

	@Override
	public String getSkinName() {
		return "flowershopowner";
	}
	
	@Override
	protected void setTimeSchedule(){
		timeSchedule.setWorkTime(0, new RangeInt(11,17));	
		timeSchedule.setWorkTime(1, new RangeInt(11,17));	

		timeSchedule.setWorkTime(3, new RangeInt(11,17));	
		timeSchedule.setWorkTime(4, new RangeInt(11,17));	
		timeSchedule.setWorkTime(5, new RangeInt(11,17));	
		timeSchedule.setWorkTime(6, new RangeInt(11,17));	
		
		timeSchedule.setSleeptime(new RangeInt(22,30));
	}

}
