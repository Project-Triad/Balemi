package economy.balemi;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import economy.cmds.Cmds;

public class Zaklad extends JavaPlugin {
	public Cmds cmds;
	
	public void onEnable(){
		Bukkit.getServer().getLogger().info("ON");
	}

	public void onDisable(){
		Bukkit.getServer().getLogger().info("OFF");		
	}
	// some code
}
