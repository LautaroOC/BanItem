package com.lauti.item.eventos;

import javax.print.attribute.standard.Destination;

import org.bukkit.BanList.Type;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.util.io.BukkitObjectInputStream;
import org.w3c.dom.events.Event;

import com.lauti.item.items.ItemManager;

import net.minecraft.server.v1_16_R2.ItemStack;
import net.minecraft.server.v1_16_R2.PlayerInventory;

public class Eventos implements Listener {
	
	@EventHandler
	public static void onMoveEvent(InventoryClickEvent event) {
		
		Player player = (Player) event.getWhoClicked();
		
		Inventory inv = player.getInventory();
		
		for (int i = 0; i<inv.getSize(); i++) {
			org.bukkit.inventory.ItemStack is = inv.getItem(i);
			
			if (is != null) {
				if (event.getCurrentItem().getItemMeta().equals(ItemManager.Emerald.getItemMeta())) {
					Player player1 = (Player) event.getWhoClicked();
					player1.getName();
					Bukkit.getBanList(Type.NAME).addBan(player1.getName(), "No vas a poder entrar por ladron", null, null);
					player1.kickPlayer("No debiste haber tocado ese item");
				}
			}
		}
		
	}	
	}


