package coelho.coelho.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import coelho.coelho.methods.HideMethods;

public class HideCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (!(sender instanceof Player)) {
			return false;
		}
		if (HideMethods.getHide().contains(Bukkit.getPlayer(sender.getName()))) {
			HideMethods.getHide().add(sender.getName());
			
			for (Player onlines : Bukkit.getOnlinePlayers()) {
				Bukkit.getPlayer(sender.getName()).hidePlayer(onlines);
			}
			Bukkit.getPlayer(sender.getName()).sendMessage("§aVocê escondeu os players.");
		}
		HideMethods.getHide().remove(sender.getName());
		
		for (Player onlines : Bukkit.getOnlinePlayers()) {
			Bukkit.getPlayer(sender.getName()).showPlayer(onlines);
		}
		Bukkit.getPlayer(sender.getName()).sendMessage("§aVocê fez os players aparecerem.");
		return false;
	}
}