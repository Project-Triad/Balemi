package economy.cmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import economy.balemi.Zaklad;

public class Cmds extends Zaklad {
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String [] args){
		
		if (cmd.getName().equalsIgnoreCase("aaa")){
			sender.sendMessage("cc pejzku");
		}
		
		return true;
	}

}
