package minecraft.customplugins.customplugin.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();

        if (player.hasPlayedBefore()) {
            e.setJoinMessage(ChatColor.YELLOW + "Welcome " + ChatColor.YELLOW + ChatColor.BOLD + player.getDisplayName() + "To The xServer");
        } else {
            e.setJoinMessage(ChatColor.YELLOW + "Welcome Back To The Server " + ChatColor.YELLOW + player.getDisplayName());
        }
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        Player player = e.getPlayer();
        e.setQuitMessage(ChatColor.YELLOW + player.getDisplayName() + ChatColor.RED + " left.");
    }
}
