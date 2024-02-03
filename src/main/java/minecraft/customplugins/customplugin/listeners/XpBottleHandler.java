package minecraft.customplugins.customplugin.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExpBottleEvent;

public class XpBottleHandler implements Listener {

    @EventHandler
    public void onEXPBottleBreak(ExpBottleEvent e) {
        e.setShowEffect(false);
    }

}
