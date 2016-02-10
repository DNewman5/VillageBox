package ckhbox.villagebento.common.item.mail;

import java.util.List;

import ckhbox.villagebento.VillageBentoMod;
import ckhbox.villagebento.client.gui.mail.GuiMail;
import ckhbox.villagebento.common.gui.GuiIDs;
import ckhbox.villagebento.common.item.ModItems;
import ckhbox.villagebento.common.util.helper.PathHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class ItemMail extends Item{
	public ItemMail(){
		this.setUnlocalizedName(PathHelper.full("mail"));
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setMaxStackSize(1);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
		
		if(worldIn.isRemote){
			Minecraft.getMinecraft().displayGuiScreen(new GuiMail(playerIn));
		}
		
		return super.onItemRightClick(itemStackIn, worldIn, playerIn);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		super.addInformation(stack, playerIn, tooltip, advanced);
		String info = StatCollector.translateToLocalFormatted(PathHelper.full("mail.item.info"), getMailSender(stack));
		tooltip.add(info);
	}
	
	public static ItemStack generateMail(String sender, String content, boolean newVillager){
		ItemStack mail = new ItemStack(ModItems.mail);
		setMailSender(mail, sender);
		setMailContent(mail, content);
		setIsNewVillager(mail, newVillager);
		return mail;
	}
	
	private static boolean checkStack(ItemStack stack){
		if(stack.getItem() == ModItems.mail){
			if(!stack.hasTagCompound()){
				stack.setTagCompound(new NBTTagCompound());
			}
			return true;
		}
		return false;
	}
		
	
	public static void setMailContent(ItemStack stack, String content){
		if(checkStack(stack)){
			stack.getTagCompound().setString("content", content);
		}
	}
	
	public static void setMailSender(ItemStack stack, String sender){
		if(checkStack(stack)){
			stack.getTagCompound().setString("sender", sender);
		}
	}
	
	public static void setIsNewVillager(ItemStack stack, boolean isNewVillager){
		if(checkStack(stack)){
			stack.getTagCompound().setBoolean("newvlg", isNewVillager);
		}
	}
	
	public static String getMailContent(ItemStack stack){
		if(checkStack(stack)){
			String content = stack.getTagCompound().getString("content");
			if(content != null && content != "") 
				return content;
		}
		return "unknown";
	}
	
	public static String getMailSender(ItemStack stack){
		if(checkStack(stack)){
			String sender = stack.getTagCompound().getString("sender");
			if(sender != null && sender != "") 
				return sender;
		}
		return "unknown";
	}
	
	public static boolean isNewVillager(ItemStack stack){
		if(checkStack(stack)){
			return stack.getTagCompound().getBoolean("newvlg");
		}
		return false;
	}
	
	
	
}
