package com.ckhgame.villagebento.profession;

import java.util.ArrayList;

import com.ckhgame.villagebento.block.ModBlocks;
import com.ckhgame.villagebento.entity.villager.EntityVBVillager;
import com.ckhgame.villagebento.item.ModItems;
import com.ckhgame.villagebento.util.data.VillagerChat;
import com.ckhgame.villagebento.villagercomponent.VillagerCompAbout;
import com.ckhgame.villagebento.villagercomponent.VillagerCompBuy;
import com.ckhgame.villagebento.villagercomponent.VillagerComponent;

import net.minecraft.init.Items;

public class ProfessionSheepSeller extends Profession {

	@Override
	public String getProfessionName() {
		
		return "Sheep Products Seller";
	}

	@Override
	public String getProfessionDescription() {
		
		return "White as snow is sheep.";
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
        compBuy.addItem(ModBlocks.blockSheep, 1, 1, 0);
        compBuy.addItem(ModItems.itemSheepFood, 30, 50, 0);
        compBuy.addItem(ModItems.itemSheepPotion, 3, 5, 0);
        compBuy.addItem(ModItems.itemWoolShears, 1, 1, 0);
        compBuy.addItem(ModItems.itemGauze, 30, 50, 0);
        compBuy.addItem(ModItems.itemVillageWool, 5, 10, 0);
        compBuy.addItem(Items.lead, 1, 2, 0);

        components.add(compBuy);

	}

	@Override
	public void initVillagerChat(VillagerChat villagerChat) {

		villagerChat.add(0, "shearing?");
		villagerChat.add(0, "Wanna warm clothes?");
		
	}

	@Override
	public String getSkinName() {
		return "sheepseller";
	}

}
