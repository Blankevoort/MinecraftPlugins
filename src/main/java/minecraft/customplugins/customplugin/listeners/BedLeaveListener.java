package minecraft.customplugins.customplugin.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class BedLeaveListener implements Listener {

    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent e) {
        Player player = e.getPlayer();

        player.setHealth(1.0);
        player.sendMessage(ChatColor.AQUA + "Hey! You didnt sleep and you should go to school");
    }
}
