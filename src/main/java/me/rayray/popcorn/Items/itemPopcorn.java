package me.rayray.popcorn.Items;

import me.rayray.popcorn.Main;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class itemPopcorn extends Item {
	public itemPopcorn() {
		this.setMaxStackSize(16);
		this.setCreativeTab(Main.tabPopcornMod);
		this.setTextureName("pc:popcorn");
	}
}
