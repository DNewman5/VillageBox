package com.ckhgame.villagebento.building;

import com.ckhgame.villagebento.building.builder.BuildingBuilder;
import com.ckhgame.villagebento.config.ConfigBuilding;
import com.ckhgame.villagebento.villager.VillagerMiner;
import com.ckhgame.villagebento.villager.VillagerVillageElder;

import net.minecraft.init.Blocks;

public class BuildingMiningHouse extends Building {

	@Override
	public String getName() {
		return "Mining House";
	}

	@Override
	public String getDescription() {
		return "Welcome to the Mining House!";
	}

	@Override
	protected boolean canBuild() {
		return true;
	}
	
	@Override
	protected void generateVillagers(BuildingBuilder bb) {
		// TODO Auto-generated method stub
		//add villager
		bb.addBuildingVillager(VillagerMiner.class,"Tylor",0,0);
		bb.addBuildingVillager(VillagerMiner.class,"Chris",0,-1);
	}

	@Override
	public int getSizeType() {
		return ConfigBuilding.SizeType_Small;
	}

	@Override
	protected void buildBlocks(BuildingBuilder bb) {
		bb.buildBlock(-2,-6,-2,Blocks.bookshelf,0);bb.buildBlock(-2,-6,-1,Blocks.flower_pot,3);bb.buildBlock(-2,-6,0,Blocks.air,0);
		bb.buildBlock(-2,-6,1,Blocks.air,0);bb.buildBlock(-2,-6,2,Blocks.chest,2);bb.buildBlock(-1,-6,-2,Blocks.air,0);
		bb.buildBlock(-1,-6,-1,Blocks.air,0);bb.buildBlock(-1,-6,0,Blocks.air,0);bb.buildBlock(-1,-6,1,Blocks.air,0);
		bb.buildBlock(-1,-6,2,Blocks.bed,3);bb.buildBlock(0,-6,-2,Blocks.air,0);bb.buildBlock(0,-6,-1,Blocks.air,0);
		bb.buildBlock(0,-6,0,Blocks.air,0);bb.buildBlock(0,-6,1,Blocks.air,0);bb.buildBlock(0,-6,2,Blocks.bed,11);
		bb.buildBlock(1,-6,-2,Blocks.air,0);bb.buildBlock(1,-6,-1,Blocks.stone_brick_stairs,2);bb.buildBlock(2,-6,-2,Blocks.air,0);
		bb.buildBlock(2,-6,-1,Blocks.stone_brick_stairs,2);bb.buildBlock(-2,-5,-2,Blocks.flower_pot,0);bb.buildBlock(-2,-5,-1,Blocks.air,0);
		bb.buildBlock(-2,-5,0,Blocks.air,0);bb.buildBlock(-2,-5,1,Blocks.air,0);bb.buildBlock(-1,-5,-2,Blocks.air,0);
		bb.buildBlock(-1,-5,-1,Blocks.air,0);bb.buildBlock(-1,-5,0,Blocks.air,0);bb.buildBlock(-1,-5,1,Blocks.air,0);
		bb.buildBlock(-1,-5,2,Blocks.air,0);bb.buildBlock(0,-5,-2,Blocks.air,0);bb.buildBlock(0,-5,-1,Blocks.air,0);
		bb.buildBlock(0,-5,0,Blocks.air,0);bb.buildBlock(0,-5,1,Blocks.air,0);bb.buildBlock(1,-5,-2,Blocks.air,0);
		bb.buildBlock(1,-5,-1,Blocks.air,0);bb.buildBlock(1,-5,0,Blocks.stone_brick_stairs,2);bb.buildBlock(2,-5,-2,Blocks.air,0);
		bb.buildBlock(2,-5,-1,Blocks.air,0);bb.buildBlock(2,-5,0,Blocks.stone_brick_stairs,2);bb.buildBlock(-2,-4,-2,Blocks.glowstone,0);
		bb.buildBlock(-2,-4,-1,Blocks.air,0);bb.buildBlock(-2,-4,0,Blocks.air,0);bb.buildBlock(-2,-4,1,Blocks.air,0);
		bb.buildBlock(-2,-4,2,Blocks.stone_slab,13);bb.buildBlock(-1,-4,-2,Blocks.air,0);bb.buildBlock(-1,-4,-1,Blocks.air,0);
		bb.buildBlock(-1,-4,0,Blocks.air,0);bb.buildBlock(-1,-4,1,Blocks.air,0);bb.buildBlock(-1,-4,2,Blocks.stone_slab,13);
		bb.buildBlock(0,-4,-2,Blocks.air,0);bb.buildBlock(0,-4,-1,Blocks.air,0);bb.buildBlock(0,-4,0,Blocks.air,0);
		bb.buildBlock(0,-4,1,Blocks.air,0);bb.buildBlock(0,-4,2,Blocks.stone_slab,13);bb.buildBlock(1,-4,-2,Blocks.air,0);
		bb.buildBlock(1,-4,-1,Blocks.air,0);bb.buildBlock(1,-4,0,Blocks.air,0);bb.buildBlock(1,-4,1,Blocks.stone_brick_stairs,1);
		bb.buildBlock(1,-4,2,Blocks.stone_brick_stairs,1);bb.buildBlock(2,-4,-2,Blocks.air,0);bb.buildBlock(2,-4,-1,Blocks.air,0);
		bb.buildBlock(2,-4,0,Blocks.air,0);bb.buildBlock(2,-4,1,Blocks.air,0);bb.buildBlock(2,-4,2,Blocks.air,0);
		bb.buildBlock(-2,-3,-2,Blocks.fence,0);bb.buildBlock(-2,-3,-1,Blocks.air,0);bb.buildBlock(-1,-3,-2,Blocks.air,0);
		bb.buildBlock(-1,-3,-1,Blocks.air,0);bb.buildBlock(-1,-3,0,Blocks.air,0);bb.buildBlock(-1,-3,1,Blocks.stone_brick_stairs,3);
		bb.buildBlock(-1,-3,2,Blocks.air,0);bb.buildBlock(0,-3,-2,Blocks.air,0);bb.buildBlock(0,-3,-1,Blocks.air,0);
		bb.buildBlock(0,-3,1,Blocks.stone_brick_stairs,3);bb.buildBlock(0,-3,2,Blocks.air,0);bb.buildBlock(1,-3,-2,Blocks.air,0);
		bb.buildBlock(1,-3,-1,Blocks.air,0);bb.buildBlock(1,-3,0,Blocks.air,0);bb.buildBlock(1,-3,1,Blocks.air,0);
		bb.buildBlock(1,-3,2,Blocks.air,0);bb.buildBlock(2,-3,-1,Blocks.air,0);bb.buildBlock(2,-3,0,Blocks.air,0);
		bb.buildBlock(2,-3,1,Blocks.air,0);bb.buildBlock(2,-3,2,Blocks.air,0);bb.buildBlock(-1,-2,0,Blocks.stone_brick_stairs,3);
		bb.buildBlock(-1,-2,1,Blocks.air,0);bb.buildBlock(-1,-2,2,Blocks.air,0);bb.buildBlock(0,-2,0,Blocks.stone_brick_stairs,3);
		bb.buildBlock(0,-2,1,Blocks.air,0);bb.buildBlock(0,-2,2,Blocks.air,0);bb.buildBlock(1,-2,0,Blocks.stone_slab,13);
		bb.buildBlock(1,-2,1,Blocks.air,0);bb.buildBlock(1,-2,2,Blocks.air,0);bb.buildBlock(2,-2,0,Blocks.stone_slab,13);
		bb.buildBlock(2,-2,1,Blocks.air,0);bb.buildBlock(-1,-1,-1,Blocks.stone_brick_stairs,3);bb.buildBlock(-1,-1,0,Blocks.air,0);
		bb.buildBlock(-1,-1,1,Blocks.air,0);bb.buildBlock(0,-1,-1,Blocks.stone_brick_stairs,3);bb.buildBlock(0,-1,0,Blocks.air,0);
		bb.buildBlock(0,-1,1,Blocks.air,0);bb.buildBlock(0,-1,2,Blocks.air,0);bb.buildBlock(1,-1,1,Blocks.stone_slab,13);
		bb.buildBlock(1,-1,2,Blocks.stone_slab,13);bb.buildBlock(-2,0,-2,Blocks.stonebrick,1);bb.buildBlock(-2,0,-1,Blocks.stonebrick,1);
		bb.buildBlock(-2,0,0,Blocks.stonebrick,1);bb.buildBlock(-2,0,1,Blocks.stonebrick,1);bb.buildBlock(-2,0,2,Blocks.stonebrick,1);
		bb.buildBlock(-1,0,-2,Blocks.stonebrick,1);bb.buildBlock(-1,0,2,Blocks.stonebrick,1);bb.buildBlock(0,0,-2,Blocks.wooden_door,3);
		bb.buildBlock(0,0,2,Blocks.stonebrick,1);bb.buildBlock(1,0,-2,Blocks.stonebrick,1);bb.buildBlock(1,0,0,Blocks.standing_sign,4);
		bb.buildBlock(1,0,1,Blocks.rail,0);bb.buildBlock(1,0,2,Blocks.stonebrick,1);bb.buildBlock(2,0,-2,Blocks.stonebrick,1);
		bb.buildBlock(2,0,-1,Blocks.stonebrick,1);bb.buildBlock(2,0,0,Blocks.stonebrick,1);bb.buildBlock(2,0,1,Blocks.stonebrick,1);
		bb.buildBlock(2,0,2,Blocks.stonebrick,1);bb.buildBlock(-2,1,-2,Blocks.stone_brick_stairs,2);bb.buildBlock(-2,1,-1,Blocks.stone_brick_stairs,0);
		bb.buildBlock(-2,1,0,Blocks.stone_brick_stairs,0);bb.buildBlock(-2,1,1,Blocks.stone_brick_stairs,0);bb.buildBlock(-2,1,2,Blocks.stone_brick_stairs,3);
		bb.buildBlock(-1,1,-2,Blocks.stone_brick_stairs,2);bb.buildBlock(-1,1,2,Blocks.stone_brick_stairs,3);bb.buildBlock(0,1,-2,Blocks.wooden_door,8);
		bb.buildBlock(0,1,2,Blocks.stone_brick_stairs,3);bb.buildBlock(1,1,-2,Blocks.stone_brick_stairs,2);bb.buildBlock(1,1,2,Blocks.stone_brick_stairs,3);
		bb.buildBlock(2,1,-2,Blocks.stone_brick_stairs,2);bb.buildBlock(2,1,-1,Blocks.stone_brick_stairs,1);bb.buildBlock(2,1,0,Blocks.stone_brick_stairs,1);
		bb.buildBlock(2,1,1,Blocks.stone_brick_stairs,1);bb.buildBlock(2,1,2,Blocks.stone_brick_stairs,3);bb.buildBlock(-1,2,-1,Blocks.stone_brick_stairs,0);
		bb.buildBlock(-1,2,0,Blocks.stone_brick_stairs,0);bb.buildBlock(-1,2,1,Blocks.stone_brick_stairs,0);bb.buildBlock(0,2,-1,Blocks.stone_brick_stairs,2);
		bb.buildBlock(0,2,0,Blocks.stonebrick,1);bb.buildBlock(0,2,1,Blocks.stone_brick_stairs,3);bb.buildBlock(1,2,-1,Blocks.stone_brick_stairs,1);
		bb.buildBlock(1,2,0,Blocks.stone_brick_stairs,1);bb.buildBlock(1,2,1,Blocks.stone_brick_stairs,3);bb.buildBlock(-2,-5,2,Blocks.torch,4);
		bb.buildBlock(0,-5,2,Blocks.torch,4);bb.buildBlock(-2,-3,0,Blocks.torch,4);bb.buildBlock(0,-3,0,Blocks.torch,4);
		bb.buildBlock(2,-3,-2,Blocks.torch,3);bb.buildBlock(2,-2,2,Blocks.torch,2);bb.buildBlock(-1,-1,2,Blocks.torch,1);
		bb.buildBlock(-3,0,-3,Blocks.torch,5);bb.buildBlock(-3,0,3,Blocks.torch,5);bb.buildBlock(-1,0,-3,Blocks.torch,4);
		bb.buildBlock(1,0,-3,Blocks.torch,4);bb.buildBlock(3,0,-3,Blocks.torch,5);bb.buildBlock(3,0,3,Blocks.torch,5);
		bb.buildBlock(-1,1,-1,Blocks.torch,1);bb.buildBlock(-1,1,1,Blocks.torch,1);bb.buildBlock(1,1,-1,Blocks.torch,2);
		bb.buildBlock(1,1,1,Blocks.torch,2);
	}

}