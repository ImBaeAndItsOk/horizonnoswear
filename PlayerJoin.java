package com.horizonnoswear.ImBaeAndItsOk.playerevent;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.horizonnoswear.ImBaeAndItsOk.Plugin;


public class PlayerJoin implements Listener {
	private Plugin plugin;
	public PlayerJoin(Plugin pl) {
		plugin = pl;
	}
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		String welcomeMessage;
		
		welcomeMessage = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("Welcome Message"));
			
		Player player = event.getPlayer();
		player.sendMessage(welcomeMessage);
	}
}
