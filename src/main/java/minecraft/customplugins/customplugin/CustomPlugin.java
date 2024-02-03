package minecraft.customplugins.customplugin;

import minecraft.customplugins.customplugin.commands.SuicideCommand;
import minecraft.customplugins.customplugin.listeners.BedLeaveListener;
import minecraft.customplugins.customplugin.listeners.PlayerJoinListener;
import minecraft.customplugins.customplugin.listeners.ShearSheepListener;
import minecraft.customplugins.customplugin.listeners.XpBottleHandler;
import org.bukkit.ChatColor;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println(ChatColor.GREEN + "Custom Plugin is now Online");

        getCommand("suicide").setExecutor(new SuicideCommand());
        getServer().getPluginManager().registerEvents(new XpBottleHandler(), this);
        getServer().getPluginManager().registerEvents(new BedLeaveListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
        getServer().getPluginManager().registerEvents(new ShearSheepListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println(ChatColor.RED + "Custom Plugin is now Offline");
    }
}
