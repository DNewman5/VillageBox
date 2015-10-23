package com.ckhgame.villagebento.rendering;

import java.util.ArrayList;

import org.lwjgl.opengl.GL11;

import com.ckhgame.villagebento.config.ConfigBuilding;
import com.ckhgame.villagebento.data.DataBuilding;
import com.ckhgame.villagebento.data.DataVillage;
import com.ckhgame.villagebento.data.DataVillageBento;
import com.ckhgame.villagebento.util.BoxWithColor;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraftforge.client.event.RenderWorldLastEvent;

public class VillageOutlines {
	
	private static VillageOutlines instance = null;
	public static VillageOutlines getInstance(){
		if(instance == null)
			instance = new VillageOutlines();
		return instance;
	}
	
	private boolean enabled = false;
	
	public boolean getEnabled(){
		return enabled;
	}
	
	public void setEnabled(boolean enabled){
		this.enabled = enabled;
	}
	
	private double px,py,pz;
	private ArrayList<BoxWithColor> villageOutlines = null;
	
	public void setVillageOutlines(ArrayList<BoxWithColor> villageOutlines){ //if set vbData to null, no outlines will be display
		this.villageOutlines = villageOutlines;
	}
	
	int count = 0;
	
	@SubscribeEvent
	public void renderWorldLastEvent(RenderWorldLastEvent event) {
				
		/*count++;
		if(count > 300){
			count = 0;
			System.out.println(Minecraft.getMinecraft().thePlayer.getDisplayName() + ": <==");
			if(villageBentoData == null)
				System.out.println("dataVB is null!");
			System.out.println(Minecraft.getMinecraft().thePlayer.getDisplayName() + ": ==>");
		}*/

		if(enabled && this.villageOutlines != null){
			EntityPlayer p = Minecraft.getMinecraft().thePlayer;
			
			px = p.lastTickPosX + (p.posX - p.lastTickPosX) * (double) event.partialTicks;
			py = p.lastTickPosY + (p.posY - p.lastTickPosY) * (double) event.partialTicks;
			pz = p.lastTickPosZ + (p.posZ - p.lastTickPosZ) * (double) event.partialTicks;
			
			renderOutlines();
		}
    }
	
private void renderOutlines() {
        
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glLineWidth(3.0f);
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        GL11.glDisable(GL11.GL_CULL_FACE);
        
        //render
        for(BoxWithColor b:villageOutlines)
        	renderOutline(b);
        
       

        GL11.glPolygonMode(GL11.GL_FRONT_AND_BACK, GL11.GL_FILL);
        GL11.glEnable(GL11.GL_CULL_FACE);
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        GL11.glDisable(GL11.GL_BLEND);
    }

private void renderOutline(BoxWithColor b) {
    
	Tessellator tessellator = Tessellator.instance;
    
	double minx = b.minX - px;
	double miny = b.minY - py;
	double minz = b.minZ - pz;
	double maxx = b.maxX - px;
	double maxy = b.maxY - py;
	double maxz = b.maxZ - pz;
	
    /*
    tessellator.startDrawing(GL11.GL_QUADS);
    tessellator.setColorRGBA_F(colorR, colorG, colorB, colorA);
    tessellator.addVertex(b.minX, b.minY, b.minZ);
    tessellator.addVertex(b.maxX, b.minY, b.minZ);
    tessellator.addVertex(b.maxX, b.minY, b.maxZ);
    tessellator.addVertex(b.minX, b.minY, b.maxZ);
    tessellator.draw();
    
    tessellator.startDrawing(GL11.GL_QUADS);
    tessellator.setColorRGBA_F(colorR, colorG, colorB, colorA);
    tessellator.addVertex(b.minX, b.maxY, b.minZ);
    tessellator.addVertex(b.maxX, b.maxY, b.minZ);
    tessellator.addVertex(b.maxX, b.maxY, b.maxZ);
    tessellator.addVertex(b.minX, b.maxY, b.maxZ);
    tessellator.draw();
 	*/
    
	tessellator.startDrawing(GL11.GL_LINE_LOOP);
    tessellator.setColorRGBA(b.R, b.G, b.B, b.A);
    tessellator.addVertex(minx, maxy, maxz);
    tessellator.addVertex(maxx, maxy, maxz);
    tessellator.addVertex(maxx, miny, maxz);
    tessellator.addVertex(minx, miny, maxz);
    tessellator.draw();
    
    tessellator.startDrawing(GL11.GL_LINE_LOOP);
    tessellator.setColorRGBA(b.R, b.G, b.B, b.A);
    tessellator.addVertex(minx, miny, minz);
    tessellator.addVertex(minx, maxy, minz);
    tessellator.addVertex(maxx, maxy, minz);
    tessellator.addVertex(maxx, miny, minz);
    tessellator.draw();
    
    tessellator.startDrawing(GL11.GL_LINE_LOOP);
    tessellator.setColorRGBA(b.R, b.G, b.B, b.A);
    tessellator.addVertex(minx,miny, minz);
    tessellator.addVertex(minx,miny, maxz);
    tessellator.addVertex(minx,maxy, maxz);
    tessellator.addVertex(minx,maxy, minz);
    tessellator.draw();
    
    tessellator.startDrawing(GL11.GL_LINE_LOOP);
    tessellator.setColorRGBA(b.R, b.G, b.B, b.A);
    tessellator.addVertex(maxx,miny, minz);
    tessellator.addVertex(maxx,miny, maxz);
    tessellator.addVertex(maxx,maxy, maxz);
    tessellator.addVertex(maxx,maxy, minz);
    tessellator.draw();
}
}