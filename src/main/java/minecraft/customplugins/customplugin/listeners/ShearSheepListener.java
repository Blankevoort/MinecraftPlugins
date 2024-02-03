package minecraft.customplugins.customplugin.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class ShearSheepListener implements Listener {

    @EventHandler
    public void onShearSheep(PlayerShearEntityEvent e) {

        Entity entity = e.getEntity();
        Player player = e.getPlayer();

        if (entity.getType() == EntityType.SHEEP) {
            e.setCancelled(true);
            player.sendMessage("This is a sheep." + ChatColor.DARK_RED + " just kill it!");
        } else {
            player.sendMessage(ChatColor.GREEN + "Feel free");
        }

    }

}
