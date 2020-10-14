package coelho.coelho;

import org.bukkit.plugin.java.JavaPlugin;

import coelho.coelho.commands.HideCommand;

public class Hide extends JavaPlugin {
	
	public void onEnable() {
		Commands();
		Listeners();
		Messages();
	}
	
	private void Messages() {
		getServer().getConsoleSender().sendMessage("");
		getServer().getConsoleSender().sendMessage("§a[Hide] §fPlugin habilited");
		getServer().getConsoleSender().sendMessage("§a[Hide] §fAuthor §a" + getDescription().getAuthors().get(0));
		getServer().getConsoleSender().sendMessage("§a[Hide] §fVersion §a" + getDescription().getVersion());
		getServer().getConsoleSender().sendMessage("");
	}

	private void Listeners() {
	}

	private void Commands() {
		getCommand("hide").setExecutor(new HideCommand());
	}

	public void onDisable() {
		
	}
	
	public static Hide getHide() {
		return getPlugin(Hide.class);
	}
}