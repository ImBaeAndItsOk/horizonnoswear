package com.horizonnoswear.ImBaeAndItsOk.playerevent;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
		public class PlayerChat implements Listener {
			@EventHandler
			public void onPlayerChat(AsyncPlayerChatEvent event) {
				Player player = event.getPlayer();
				
				String message = event.getMessage().toLowerCase();
				
				if(message.contains("fuck")) {
					event.setCancelled(true);
					player.sendMessage(ChatColor.RED + "Please do not swear!");
				}
					if(message.contains("nigger")) {
						event.setCancelled(true);;
						player.sendMessage(ChatColor.RED + "Please do not swear!");
					}
						if(message.contains("faggot")) {
							event.setCancelled(true);
							player.sendMessage(ChatColor.RED + "Please do not swear!");
						}
							if(message.contains("whore")){
								event.setCancelled(true);
								player.sendMessage(ChatColor.RED + "Please do not swear!");
							}
								if (message.contains("slut")) {
									event.setCancelled(true);
									player.sendMessage(ChatColor.RED + "Please do not swear!");
								}
								if (message.contains("bitch")) {
									event.setCancelled(true);
									player.sendMessage(ChatColor.RED + "Please do not swear!");
								}
								if (message.contains("trash")) {
									event.setCancelled(true);
									player.sendMessage(ChatColor.RED + "Please do not disrespect other players!");
								}
								if (message.contains("ez")) {
									event.setCancelled(true);
									player.sendMessage(ChatColor.RED + "Please do not disrespect other players!");
								}
								if (message.contains("this server is bad")) {
									event.setCancelled(true);
									player.sendMessage(ChatColor.RED + "I'm sorry that you don't like the server. Please leave.");
								}
								if (message.contains("cunt")) {
									event.setCancelled(true);
									player.sendMessage(ChatColor.RED + "Please do not swear!");
								}
								if (message.contains("ass")) {
									event.setCancelled(true);
									player.sendMessage(ChatColor.RED + "Please do not sweat!");
								}
				}
		}

