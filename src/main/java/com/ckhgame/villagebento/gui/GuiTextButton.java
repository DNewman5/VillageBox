package com.ckhgame.villagebento.gui;

import java.util.ArrayList;
import java.util.List;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.ckhgame.villagebento.config.ConfigVillager;
import com.ckhgame.villagebento.entity.villager.EntityVBVillager;
import com.ckhgame.villagebento.item.ModItems;
import com.ckhgame.villagebento.network.action.Action;
import com.ckhgame.villagebento.network.action.ActionSyncVillagerComp;
import com.ckhgame.villagebento.util.data.VBCompResult;
import com.ckhgame.villagebento.util.village.ItemPrice;
import com.ckhgame.villagebento.villagercomponent.VillagerComponent;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class GuiTextButton extends GuiButton {

	private String[] extraTexts = null;
	public GuiScreen guiScreen = null;
	
	public GuiTextButton(Minecraft mc,int id, int x, int y, String text, String...extraTexts) {
		super(id, x, y,mc.fontRenderer.getStringWidth(text),mc.fontRenderer.FONT_HEIGHT,text);
		this.extraTexts = extraTexts;
	}

	public String[] getExtraTexts(){
		return this.extraTexts;
	}
	
	public boolean isMouseOn(){
		return this.field_146123_n;
	}
	
	@Override
	public void drawButton(Minecraft mc, int p_146112_2_, int p_146112_3_) {
		 if (this.visible)
	        {
	            FontRenderer fontrenderer = mc.fontRenderer;
	            this.field_146123_n = p_146112_2_ >= this.xPosition && p_146112_3_ >= this.yPosition && p_146112_2_ < this.xPosition + this.width && p_146112_3_ < this.yPosition + this.height;
	            int k = this.getHoverState(this.field_146123_n);
	            this.mouseDragged(mc, p_146112_2_, p_146112_3_);
	            int l = 0xFFFFFFAA;

	            if (packedFGColour != 0)
	            {
	                l = packedFGColour;
	            }
	            else if (!this.enabled)
	            {
	                l = 0xFF999999;
	            }
	            else if (this.field_146123_n)
	            {
	                l = 0xFFFFCC00;
	            }

	            this.drawString(fontrenderer, this.displayString, this.xPosition,  this.yPosition, l);
	        }
	}
	
	
}
