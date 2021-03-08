package com.lauti.item;

import org.bukkit.plugin.java.JavaPlugin;

import com.lauti.item.comandos.Comando;
import com.lauti.item.eventos.Eventos;
import com.lauti.item.items.ItemManager;

public class Item extends JavaPlugin {
	
	@Override
	public void onEnable( ) {
		ItemManager.init();
		getServer().getPluginManager().registerEvents(new Eventos(), this);
		getCommand("esmeralda").setExecutor(new Comando());
	}
	
	@Override
	public void onDisable() {
		
	}

}
