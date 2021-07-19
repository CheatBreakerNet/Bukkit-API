package com.offlinecheatbreaker.cholograms;

import com.cheatbreaker.api.CheatBreakerAPI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class cHolograms extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        this.saveDefaultConfig();

        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        for (String s : getConfig().getConfigurationSection("holograms").getKeys(false)) {
            FileConfiguration config = getConfig();

            String path = "holograms." + s;
            UUID uuid = UUID.randomUUID();
            Vector vector = new Vector(getConfig().getDouble(path + ".x"), getConfig().getDouble(path + ".y"), getConfig().getDouble(path + ".z"));
            CheatBreakerAPI.getInstance().addHologram(event.getPlayer(), uuid, vector, getFormattedLines(config.getStringList(path + ".lines")));
        }
    }

    public List<String> getFormattedLines(List<String> lines) {
        List<String> format = new ArrayList<>();
        for (String s : lines) {
            s = ChatColor.translateAlternateColorCodes('&', s);

            format.add(s);
        }
        return format;
    }
}
