package com.ckhgame.villagebento.item;

import com.ckhgame.villagebento.Main;
import com.ckhgame.villagebento.data.DataVillageBento;
import com.ckhgame.villagebento.event.EventRenderVillageOutlines;
import com.ckhgame.villagebento.network.VBNetwork;
import com.ckhgame.villagebento.network.message.MessageVillageOutlinesChanged;
import com.ckhgame.villagebento.util.helper.HelperDataVB;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemVillageStick extends Item {
	public ItemVillageStick(){
		super();
		this.setUnlocalizedName("ItemVillageStick");
		this.setTextureName(Main.MODID + ":itemvillagestick");
		this.setCreativeTab(CreativeTabs.tabTools);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer p) {
		
		if(world.provider.dimensionId == 0){
			if(world.isRemote){
				//client
				EventRenderVillageOutlines.getInstance().setEnabled(!EventRenderVillageOutlines.getInstance().getEnabled());
				
			}
			else{
				//server				
				
				DataVillageBento dataVB = DataVillageBento.get();
				
				MessageVillageOutlinesChanged msg = new MessageVillageOutlinesChanged();
				msg.listOutlines = HelperDataVB.getVillageOutlines(dataVB,p.getDisplayName());
				
				VBNetwork.networkWrapper.sendTo(msg, (EntityPlayerMP)p);
			}
		}
		
		return itemStack;
	}	
}
