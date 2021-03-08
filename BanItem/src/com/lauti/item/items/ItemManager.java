package com.lauti.item.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class ItemManager {
	
	public static ItemStack Emerald;
	
	public static void init() {
		createEmerald();
		
	}
	
	private static void createEmerald() {
		ItemStack item = new ItemStack(Material.EMERALD,64);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GREEN+"Esmeralda Comercial");
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.RED+"El item mas valioso del server");
		item.setItemMeta(meta);
		Emerald = item;
		
				
	}

}
