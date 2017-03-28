package com.horizonnoswear.ImBaeAndItsOk;

//These imports go into the Enabler methods.
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.horizonnoswear.ImBaeAndItsOk.commands.InfoHNS;
import com.horizonnoswear.ImBaeAndItsOk.playerevent.PlayerChat;
import com.horizonnoswear.ImBaeAndItsOk.playerevent.PlayerJoin;

import java.util.logging.Logger;

//Original version 1.0 written by: ImBaeAndItsOk

public class Plugin extends JavaPlugin{
	public void onEnable(){
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();
		
		registerCommands();
		registerEvents();
		registerConfigs();
		
		logger.info(pdfFile.getName() + " has been enabled (V " + pdfFile.getVersion() + ")");
	}
	
	public void onDisable(){
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();
		
		logger.info(pdfFile.getName() + " has been disabled (V " + pdfFile.getVersion() + ")");
	}
	
	public void registerCommands() {
		getCommand("infohorizon").setExecutor(new InfoHNS());
	}
	public void registerEvents() {
		PluginManager pm = getServer().getPluginManager();
		
		pm.registerEvents(new PlayerChat(), this);
		pm.registerEvents(new PlayerJoin(this), this);
	}
	private void registerConfigs() {
		getConfig().options().copyDefaults(true);	
		saveConfig();
	}

}