package ckhbox.villagebento.client.renderer;

import ckhbox.villagebento.client.renderer.villager.RenderFactoryVillager;
import ckhbox.villagebento.common.block.ModBlocks;
import ckhbox.villagebento.common.entity.villager.EntityVillager;
import ckhbox.villagebento.common.item.ModItems;
import ckhbox.villagebento.common.util.helper.PathHelper;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModItemRenderers {
	
	public static void init(){
		
		registerModel(ModItems.treasureHuntBookI, 0, "treasure_hunt_book_0");
		registerModel(ModItems.treasureHuntBookII, 0, "treasure_hunt_book_1");
		registerModel(ModItems.treasureHuntBookIII, 0, "treasure_hunt_book_2");
		registerModel(ModItems.blueGem, 0, "blue_gem");
		registerModel(ModItems.violetGem, 0, "violet_gem");
		registerModel(ModItems.orangeGem, 0, "orange_gem");
		registerModel(ModItems.mail, 0, "mail");
		registerModel(ModItems.flameStaff, 0, "flame_staff");
		registerModel(ModItems.processedWoodPlank, 0, "processed_wood_plank");
		registerModel(ModItems.reinforcedIronIngot, 0, "reinforced_iron_ingot");
		
	}

	private static void registerModel(Item item, int meta, String resource){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(item, meta, new ModelResourceLocation(PathHelper.full(resource), "inventory"));
	}
}
