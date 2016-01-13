package com.ckhgame.villagebento.profession;

import java.util.ArrayList;

import com.ckhgame.villagebento.entity.villager.EntityVBGuard;
import com.ckhgame.villagebento.entity.villager.EntityVBVillager;
import com.ckhgame.villagebento.util.data.VillagerChat;
import com.ckhgame.villagebento.villagercomponent.VillagerCompAbout;
import com.ckhgame.villagebento.villagercomponent.VillagerCompWork;
import com.ckhgame.villagebento.villagercomponent.VillagerComponent;

import net.minecraft.init.Items;

public class ProfessionKnight extends Profession {

	@Override
	public String getProfessionName() {
		
		return "Knight";
	}

	@Override
	public String getProfessionDescription() {
		
		return "Portect our homeland...";
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

		villagerChat.add(0, "Glad to see you!");
		villagerChat.add(0, "On your side...");
		
	}

	@Override
	public String getSkinName() {
		return "knight";
	}

}
