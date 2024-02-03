package minecraft.customplugins.customplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class SuicideCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("suicide")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;

                player.setHealth(0.0);
                player.sendMessage(ChatColor.DARK_GRAY + "you commited suicide");
            } else if (sender instanceof ConsoleCommandSender) {
                System.out.println(ChatColor.DARK_GRAY + "You have to be inside the server to suicide yourself");
            } else if (sender instanceof BlockCommandSender) {
                System.out.println(ChatColor.DARK_GRAY + "You are a command block...");
            }
        }

        return true;
    }
}
