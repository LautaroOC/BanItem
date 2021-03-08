package com.lauti.item.comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.lauti.item.items.ItemManager;

public class Comando implements CommandExecutor{
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String [] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Solo los jugadores pueden usar este comando");
			return true;
		}
		Player player = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("esmeralda")) {
			player.getInventory().addItem(ItemManager.Emerald);
		}
		
		return true;
	}

}
