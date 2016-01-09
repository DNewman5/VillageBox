package com.ckhgame.villagebento.building;

import com.ckhgame.villagebento.block.ModBlocks;
import com.ckhgame.villagebento.building.builder.BuildingBuilder;
import com.ckhgame.villagebento.config.ConfigBuilding;
import com.ckhgame.villagebento.profession.ProfessionNoviceBaker;

import net.minecraft.init.Blocks;

public class BuildingSmallBakery extends Building {

	@Override
	public String getName() {
		return "Small Bakery";
	}

	@Override
	public String getDescription() {
		return "Welcome to the Small Bakery!";
	}

	@Override
	protected boolean canBuild() {
		return true;
	}
	
	@Override
	protected void generateVillagers(BuildingBuilder bb) {
		// TODO Auto-generated method stub
		//add villager
		bb.addVillager(ProfessionNoviceBaker.class,1,2);
	}

	@Override
	public int getSizeType() {
		return ConfigBuilding.SizeType_Small;
	}

	@Override
	protected void buildBlocks(BuildingBuilder bb) {
		bb.buildBlock(3,-2,0,Blocks.air,0);bb.buildBlock(-1,-1,-2,Blocks.planks,0);bb.buildBlock(-1,-1,-1,Blocks.planks,0);
		bb.buildBlock(-1,-1,0,Blocks.planks,0);bb.buildBlock(-1,-1,1,Blocks.planks,0);bb.buildBlock(-1,-1,2,Blocks.planks,0);
		bb.buildBlock(0,-1,-2,Blocks.planks,0);bb.buildBlock(0,-1,-1,Blocks.planks,0);bb.buildBlock(0,-1,0,Blocks.planks,0);
		bb.buildBlock(0,-1,1,Blocks.planks,0);bb.buildBlock(0,-1,2,Blocks.planks,0);bb.buildBlock(1,-1,-2,Blocks.planks,0);
		bb.buildBlock(1,-1,-1,Blocks.planks,0);bb.buildBlock(1,-1,0,Blocks.planks,0);bb.buildBlock(1,-1,1,Blocks.planks,0);
		bb.buildBlock(1,-1,2,Blocks.planks,0);bb.buildBlock(2,-1,-2,Blocks.planks,0);bb.buildBlock(2,-1,-1,Blocks.planks,0);
		bb.buildBlock(2,-1,0,Blocks.planks,0);bb.buildBlock(2,-1,1,Blocks.planks,0);bb.buildBlock(2,-1,2,Blocks.planks,0);
		bb.buildBlock(3,-1,0,Blocks.planks,0);bb.buildBlock(-3,0,-3,Blocks.planks,4);bb.buildBlock(-3,0,-2,Blocks.planks,4);
		bb.buildBlock(-3,0,-1,Blocks.planks,4);bb.buildBlock(-3,0,0,Blocks.planks,4);bb.buildBlock(-3,0,1,Blocks.planks,4);
		bb.buildBlock(-3,0,2,Blocks.planks,4);bb.buildBlock(-3,0,3,Blocks.planks,4);bb.buildBlock(-2,0,-3,Blocks.planks,4);
		bb.buildBlock(-2,0,-2,Blocks.planks,0);bb.buildBlock(-2,0,-1,Blocks.planks,0);bb.buildBlock(-2,0,0,Blocks.planks,0);
		bb.buildBlock(-2,0,1,Blocks.planks,0);bb.buildBlock(-2,0,2,Blocks.acacia_stairs,1);bb.buildBlock(-2,0,3,Blocks.planks,4);
		bb.buildBlock(-1,0,-3,Blocks.planks,4);bb.buildBlock(-1,0,-2,ModBlocks.blockWoodenChair,0);bb.buildBlock(-1,0,3,Blocks.planks,4);bb.buildBlock(0,0,-3,Blocks.planks,4);bb.buildBlock(0,0,-2,Blocks.fence,0);
		bb.buildBlock(0,0,1,Blocks.planks,1);bb.buildBlock(0,0,3,Blocks.planks,4);bb.buildBlock(1,0,-3,Blocks.planks,4);
		bb.buildBlock(1,0,-2,ModBlocks.blockWoodenChair,0);bb.buildBlock(1,0,1,Blocks.planks,1);bb.buildBlock(1,0,3,Blocks.planks,4);bb.buildBlock(2,0,-3,Blocks.planks,4);
		bb.buildBlock(2,0,1,Blocks.planks,1);bb.buildBlock(2,0,2,Blocks.monster_egg,2);bb.buildBlock(2,0,3,Blocks.planks,4);
		bb.buildBlock(3,0,-3,Blocks.planks,4);bb.buildBlock(3,0,-2,Blocks.planks,4);bb.buildBlock(3,0,-1,Blocks.planks,4);
		bb.buildBlock(3,0,0,Blocks.wooden_door,0);bb.buildBlock(3,0,1,Blocks.planks,4);bb.buildBlock(3,0,2,Blocks.planks,4);
		bb.buildBlock(3,0,3,Blocks.planks,4);bb.buildBlock(-3,1,-3,Blocks.planks,4);bb.buildBlock(-3,1,-2,Blocks.planks,0);
		bb.buildBlock(-3,1,-1,Blocks.glass_pane,0);bb.buildBlock(-3,1,0,Blocks.planks,0);bb.buildBlock(-3,1,1,Blocks.glass_pane,0);
		bb.buildBlock(-3,1,2,Blocks.planks,0);bb.buildBlock(-3,1,3,Blocks.planks,4);bb.buildBlock(-2,1,-3,Blocks.planks,0);
		bb.buildBlock(-2,1,-2,Blocks.planks,0);bb.buildBlock(-2,1,-1,Blocks.planks,0);bb.buildBlock(-2,1,0,Blocks.planks,0);
		bb.buildBlock(-2,1,1,Blocks.acacia_stairs,3);bb.buildBlock(-2,1,3,Blocks.planks,0);bb.buildBlock(-1,1,-3,Blocks.glass_pane,0);
		bb.buildBlock(-1,1,3,Blocks.glass_pane,0);bb.buildBlock(0,1,-3,Blocks.planks,0);bb.buildBlock(0,1,-2,Blocks.wooden_pressure_plate,0);
		bb.buildBlock(0,1,3,Blocks.planks,0);bb.buildBlock(1,1,-3,Blocks.glass_pane,0);bb.buildBlock(1,1,3,Blocks.glass_pane,0);
		bb.buildBlock(2,1,-3,Blocks.planks,0);bb.buildBlock(2,1,1,Blocks.flower_pot,7);bb.addTileEntityPot(2,1,1,38,7);
		bb.buildBlock(2,1,2,Blocks.furnace,4);bb.buildBlock(2,1,3,Blocks.planks,0);bb.buildBlock(3,1,-3,Blocks.planks,4);bb.buildBlock(3,1,-2,Blocks.glass_pane,0);
		bb.buildBlock(3,1,-1,Blocks.planks,0);bb.buildBlock(3,1,0,Blocks.wooden_door,8);bb.buildBlock(3,1,1,Blocks.planks,0);
		bb.buildBlock(3,1,2,Blocks.glass_pane,0);bb.buildBlock(3,1,3,Blocks.planks,4);bb.buildBlock(-3,2,-3,Blocks.planks,4);
		bb.buildBlock(-3,2,-2,Blocks.planks,0);bb.buildBlock(-3,2,-1,Blocks.glass_pane,0);bb.buildBlock(-3,2,0,Blocks.planks,0);
		bb.buildBlock(-3,2,1,Blocks.glass_pane,0);bb.buildBlock(-3,2,2,Blocks.planks,0);bb.buildBlock(-3,2,3,Blocks.planks,4);
		bb.buildBlock(-2,2,-3,Blocks.planks,0);bb.buildBlock(-2,2,-2,Blocks.planks,0);bb.buildBlock(-2,2,-1,Blocks.planks,0);
		bb.buildBlock(-2,2,0,Blocks.acacia_stairs,3);bb.buildBlock(-2,2,3,Blocks.planks,0);bb.buildBlock(-1,2,-3,Blocks.glass_pane,0);
		bb.buildBlock(-1,2,3,Blocks.glass_pane,0);bb.buildBlock(0,2,-3,Blocks.planks,0);bb.buildBlock(0,2,3,Blocks.planks,0);
		bb.buildBlock(1,2,-3,Blocks.glass_pane,0);bb.buildBlock(1,2,3,Blocks.glass_pane,0);bb.buildBlock(2,2,-3,Blocks.planks,0);
		bb.buildBlock(2,2,3,Blocks.planks,0);bb.buildBlock(3,2,-3,Blocks.planks,4);bb.buildBlock(3,2,-2,Blocks.glass_pane,0);
		bb.buildBlock(3,2,-1,Blocks.planks,0);bb.buildBlock(3,2,0,Blocks.planks,0);bb.buildBlock(3,2,1,Blocks.planks,0);
		bb.buildBlock(3,2,2,Blocks.glass_pane,0);bb.buildBlock(3,2,3,Blocks.planks,4);bb.buildBlock(-3,3,-3,Blocks.planks,4);
		bb.buildBlock(-3,3,-2,Blocks.planks,0);bb.buildBlock(-3,3,-1,Blocks.planks,0);bb.buildBlock(-3,3,0,Blocks.planks,0);
		bb.buildBlock(-3,3,1,Blocks.planks,0);bb.buildBlock(-3,3,2,Blocks.planks,0);bb.buildBlock(-3,3,3,Blocks.planks,4);
		bb.buildBlock(-2,3,-3,Blocks.planks,0);bb.buildBlock(-2,3,-2,Blocks.planks,4);bb.buildBlock(-2,3,-1,Blocks.acacia_stairs,3);
		bb.buildBlock(-2,3,3,Blocks.planks,0);bb.buildBlock(-1,3,-3,Blocks.planks,0);bb.buildBlock(-1,3,3,Blocks.planks,0);
		bb.buildBlock(0,3,-3,Blocks.planks,0);bb.buildBlock(0,3,3,Blocks.planks,0);bb.buildBlock(1,3,-3,Blocks.planks,0);
		bb.buildBlock(1,3,3,Blocks.planks,0);bb.buildBlock(2,3,-3,Blocks.planks,0);bb.buildBlock(2,3,3,Blocks.planks,0);
		bb.buildBlock(3,3,-3,Blocks.planks,4);bb.buildBlock(3,3,-2,Blocks.planks,0);bb.buildBlock(3,3,-1,Blocks.planks,0);
		bb.buildBlock(3,3,0,Blocks.planks,0);bb.buildBlock(3,3,1,Blocks.planks,0);bb.buildBlock(3,3,2,Blocks.planks,0);
		bb.buildBlock(3,3,3,Blocks.planks,4);bb.buildBlock(-3,4,-2,Blocks.planks,1);bb.buildBlock(-3,4,-1,Blocks.planks,1);
		bb.buildBlock(-3,4,0,Blocks.planks,1);bb.buildBlock(-3,4,1,Blocks.planks,1);bb.buildBlock(-3,4,2,Blocks.planks,1);
		bb.buildBlock(-2,4,-3,Blocks.planks,1);bb.buildBlock(-2,4,3,Blocks.planks,1);bb.buildBlock(-1,4,-3,Blocks.planks,1);
		bb.buildBlock(-1,4,-2,Blocks.acacia_stairs,0);bb.buildBlock(-1,4,-1,Blocks.planks,0);bb.buildBlock(-1,4,0,Blocks.planks,0);
		bb.buildBlock(-1,4,1,Blocks.planks,0);bb.buildBlock(-1,4,2,Blocks.planks,0);bb.buildBlock(-1,4,3,Blocks.planks,1);
		bb.buildBlock(0,4,-3,Blocks.planks,1);bb.buildBlock(0,4,-2,Blocks.planks,0);bb.buildBlock(0,4,-1,Blocks.planks,0);
		bb.buildBlock(0,4,0,Blocks.planks,0);bb.buildBlock(0,4,1,Blocks.planks,0);bb.buildBlock(0,4,2,Blocks.planks,0);
		bb.buildBlock(0,4,3,Blocks.planks,1);bb.buildBlock(1,4,-3,Blocks.planks,1);bb.buildBlock(1,4,-2,Blocks.planks,0);
		bb.buildBlock(1,4,-1,Blocks.planks,0);bb.buildBlock(1,4,0,Blocks.planks,0);bb.buildBlock(1,4,1,Blocks.planks,0);
		bb.buildBlock(1,4,2,Blocks.planks,0);bb.buildBlock(1,4,3,Blocks.planks,1);bb.buildBlock(2,4,-3,Blocks.planks,1);
		bb.buildBlock(2,4,-2,Blocks.planks,0);bb.buildBlock(2,4,-1,Blocks.planks,0);bb.buildBlock(2,4,0,Blocks.planks,0);
		bb.buildBlock(2,4,1,Blocks.planks,0);bb.buildBlock(2,4,2,Blocks.planks,0);bb.buildBlock(2,4,3,Blocks.planks,1);
		bb.buildBlock(3,4,-2,Blocks.spruce_stairs,1);bb.buildBlock(3,4,-1,Blocks.spruce_stairs,1);bb.buildBlock(3,4,0,Blocks.spruce_stairs,1);
		bb.buildBlock(3,4,1,Blocks.spruce_stairs,1);bb.buildBlock(3,4,2,Blocks.spruce_stairs,1);bb.buildBlock(-3,5,-2,Blocks.planks,0);
		bb.buildBlock(-3,5,-1,Blocks.planks,0);bb.buildBlock(-3,5,0,Blocks.planks,0);bb.buildBlock(-3,5,1,Blocks.planks,0);
		bb.buildBlock(-3,5,2,Blocks.planks,0);bb.buildBlock(-2,5,-3,Blocks.planks,0);bb.buildBlock(-2,5,3,Blocks.planks,0);
		bb.buildBlock(-1,5,-3,Blocks.planks,0);bb.buildBlock(-1,5,-1,Blocks.planks,0);bb.buildBlock(-1,5,0,Blocks.planks,0);
		bb.buildBlock(-1,5,1,Blocks.planks,0);bb.buildBlock(-1,5,2,Blocks.planks,0);bb.buildBlock(-1,5,3,Blocks.planks,0);
		bb.buildBlock(0,5,-3,Blocks.planks,0);bb.buildBlock(0,5,-1,Blocks.planks,0);bb.buildBlock(0,5,0,Blocks.chest,5);
		bb.buildBlock(0,5,1,Blocks.bed,0);bb.buildBlock(0,5,2,Blocks.bed,8);bb.buildBlock(0,5,3,Blocks.planks,0);
		bb.buildBlock(1,5,-3,Blocks.planks,0);bb.buildBlock(1,5,-1,Blocks.wooden_door,3);bb.buildBlock(1,5,2,Blocks.bookshelf,0);
		bb.buildBlock(1,5,3,Blocks.planks,0);bb.buildBlock(2,5,-2,Blocks.planks,0);bb.buildBlock(2,5,-1,Blocks.planks,0);
		bb.buildBlock(2,5,0,Blocks.planks,0);bb.buildBlock(2,5,1,Blocks.planks,0);bb.buildBlock(2,5,2,Blocks.planks,0);
		bb.buildBlock(-3,6,-2,Blocks.planks,0);bb.buildBlock(-3,6,-1,Blocks.planks,0);bb.buildBlock(-3,6,0,Blocks.planks,0);
		bb.buildBlock(-3,6,1,Blocks.planks,0);bb.buildBlock(-3,6,2,Blocks.planks,0);bb.buildBlock(-2,6,-3,Blocks.planks,0);
		bb.buildBlock(-2,6,3,Blocks.planks,0);bb.buildBlock(-1,6,-3,Blocks.glass_pane,0);bb.buildBlock(-1,6,-1,Blocks.planks,0);
		bb.buildBlock(-1,6,0,Blocks.planks,0);bb.buildBlock(-1,6,1,Blocks.planks,0);bb.buildBlock(-1,6,2,Blocks.planks,0);
		bb.buildBlock(-1,6,3,Blocks.planks,0);bb.buildBlock(0,6,-3,Blocks.glass_pane,0);bb.buildBlock(0,6,-1,Blocks.planks,0);
		bb.buildBlock(0,6,3,Blocks.planks,0);bb.buildBlock(1,6,-3,Blocks.planks,0);bb.buildBlock(1,6,-1,Blocks.wooden_door,8);
		bb.buildBlock(1,6,2,Blocks.flower_pot,5);bb.addTileEntityPot(1,6,2,38,5);
		bb.buildBlock(1,6,3,Blocks.planks,0);bb.buildBlock(2,6,-2,Blocks.planks,0);bb.buildBlock(2,6,-1,Blocks.planks,0);
		bb.buildBlock(2,6,0,Blocks.planks,0);bb.buildBlock(2,6,1,Blocks.glass_pane,0);bb.buildBlock(2,6,2,Blocks.planks,0);
		bb.buildBlock(-3,7,-2,Blocks.planks,0);bb.buildBlock(-3,7,-1,Blocks.planks,0);bb.buildBlock(-3,7,0,Blocks.planks,0);
		bb.buildBlock(-3,7,1,Blocks.planks,0);bb.buildBlock(-3,7,2,Blocks.planks,0);bb.buildBlock(-2,7,-3,Blocks.planks,0);
		bb.buildBlock(-2,7,3,Blocks.planks,0);bb.buildBlock(-1,7,-3,Blocks.planks,0);bb.buildBlock(-1,7,-1,Blocks.planks,0);
		bb.buildBlock(-1,7,0,Blocks.planks,0);bb.buildBlock(-1,7,1,Blocks.planks,0);bb.buildBlock(-1,7,2,Blocks.planks,0);
		bb.buildBlock(-1,7,3,Blocks.planks,0);bb.buildBlock(0,7,-3,Blocks.planks,0);bb.buildBlock(0,7,-1,Blocks.planks,0);
		bb.buildBlock(0,7,3,Blocks.planks,0);bb.buildBlock(1,7,-3,Blocks.planks,0);bb.buildBlock(1,7,-1,Blocks.planks,0);
		bb.buildBlock(1,7,3,Blocks.planks,0);bb.buildBlock(2,7,-2,Blocks.planks,0);bb.buildBlock(2,7,-1,Blocks.planks,0);
		bb.buildBlock(2,7,0,Blocks.planks,0);bb.buildBlock(2,7,1,Blocks.glass_pane,0);bb.buildBlock(2,7,2,Blocks.planks,0);
		bb.buildBlock(-3,8,-2,Blocks.spruce_stairs,0);bb.buildBlock(-3,8,-1,Blocks.spruce_stairs,0);bb.buildBlock(-3,8,0,Blocks.spruce_stairs,0);
		bb.buildBlock(-3,8,1,Blocks.spruce_stairs,0);bb.buildBlock(-3,8,2,Blocks.spruce_stairs,0);bb.buildBlock(-2,8,-3,Blocks.spruce_stairs,2);
		bb.buildBlock(-2,8,-2,Blocks.planks,0);bb.buildBlock(-2,8,-1,Blocks.planks,0);bb.buildBlock(-2,8,0,Blocks.planks,0);
		bb.buildBlock(-2,8,1,Blocks.planks,0);bb.buildBlock(-2,8,2,Blocks.planks,0);bb.buildBlock(-2,8,3,Blocks.spruce_stairs,3);
		bb.buildBlock(-1,8,-3,Blocks.spruce_stairs,2);bb.buildBlock(-1,8,-2,Blocks.planks,0);bb.buildBlock(-1,8,-1,Blocks.planks,0);
		bb.buildBlock(-1,8,0,Blocks.planks,0);bb.buildBlock(-1,8,1,Blocks.planks,0);bb.buildBlock(-1,8,2,Blocks.planks,0);
		bb.buildBlock(-1,8,3,Blocks.spruce_stairs,3);bb.buildBlock(0,8,-3,Blocks.spruce_stairs,2);bb.buildBlock(0,8,-2,Blocks.planks,0);
		bb.buildBlock(0,8,-1,Blocks.planks,0);bb.buildBlock(0,8,0,Blocks.planks,0);bb.buildBlock(0,8,1,Blocks.planks,0);
		bb.buildBlock(0,8,2,Blocks.planks,0);bb.buildBlock(0,8,3,Blocks.spruce_stairs,3);bb.buildBlock(1,8,-3,Blocks.spruce_stairs,2);
		bb.buildBlock(1,8,-2,Blocks.planks,0);bb.buildBlock(1,8,-1,Blocks.planks,0);bb.buildBlock(1,8,0,Blocks.planks,0);
		bb.buildBlock(1,8,1,Blocks.planks,0);bb.buildBlock(1,8,2,Blocks.planks,0);bb.buildBlock(1,8,3,Blocks.spruce_stairs,3);
		bb.buildBlock(2,8,-2,Blocks.spruce_stairs,1);bb.buildBlock(2,8,-1,Blocks.spruce_stairs,1);bb.buildBlock(2,8,0,Blocks.spruce_stairs,1);
		bb.buildBlock(2,8,1,Blocks.spruce_stairs,1);bb.buildBlock(2,8,2,Blocks.spruce_stairs,1);bb.buildBlock(-1,3,-2,Blocks.torch,1);
		bb.buildBlock(2,3,0,Blocks.torch,2);bb.buildBlock(2,3,2,Blocks.torch,4);bb.buildBlock(-2,7,-2,Blocks.torch,1);
		bb.buildBlock(0,7,2,Blocks.torch,4);bb.buildBlock(1,7,2,Blocks.torch,4);bb.addEntityPainting(2,6,-2,1,"Kebab");
		bb.addEntityPainting(-2,2,-1,3,"Kebab");
		bb.addEntityPainting(-2,2,-2,3,"Wasteland");
		bb.addEntityPainting(-1,6,1,3,"Wasteland");
	}

}