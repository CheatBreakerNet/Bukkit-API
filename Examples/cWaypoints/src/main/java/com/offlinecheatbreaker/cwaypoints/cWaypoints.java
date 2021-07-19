package com.offlinecheatbreaker.cwaypoints;

import com.cheatbreaker.api.CheatBreakerAPI;
import com.cheatbreaker.api.object.CBWaypoint;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

public final class cWaypoints extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        for (String s : getConfig().getConfigurationSection("waypoints").getKeys(false)) {
            FileConfiguration config = getConfig();

            String path = "waypoints." + s;

            CheatBreakerAPI.getInstance().sendWaypoint(event.getPlayer(), new CBWaypoint(s, new Location(Bukkit.getWorld(config.getString(path + ".world")),  config.getDouble(path + ".x"), config.getDouble(path + ".y"), config.getDouble(path + ".z")), config.getInt(path + ".color"), config.getBoolean(path + ".forced"), config.getBoolean(path + ".visible")));
        }
    }
}
