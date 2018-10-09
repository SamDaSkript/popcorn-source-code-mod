package me.rayray.popcorn;

import me.rayray.popcorn.Items.itemPopcorn;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "pc", name = "Popcorn Mod", version = "0.1")
public class Main {
	
	//Item Strings
	public static Item itemPopcorn;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		//Items
		itemPopcorn = new itemPopcorn().setUnlocalizedName("itemPopcorn");
		
		//Registry for Items
		GameRegistry.registerItem(itemPopcorn, itemPopcorn.getUnlocalizedName().substring(5));
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		//Title Entities, GUI Registering
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		//stuff
	}
	
	public static CreativeTabs tabPopcornMod = new CreativeTabs("tabPopcornMod"){
		
		@Override
		public Item getTabIconItem(){
			return new ItemStack(itemPopcorn).getItem();
		}
	};
}
