package net.cheatbreaker.cworldborder;

import com.cheatbreaker.api.CheatBreakerAPI;
import com.cheatbreaker.api.object.CBWorldBorder;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

public final class cWorldBorder extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        for (String s : getConfig().getConfigurationSection("worldborders").getKeys(false)) {
            FileConfiguration config = getConfig();

            String path = "worldborders." + s;

            CheatBreakerAPI.getInstance().sendWorldBorder(event.getPlayer(), new CBWorldBorder(s, new Location(Bukkit.getWorld(config.getString(path + ".world")), config.getDouble(path + ".min_x"), 0, config.getDouble(path + ".min_z")), new Location(Bukkit.getWorld(config.getString(path + ".world")), config.getDouble(path + ".max_x"), 0, config.getDouble(path + ".max_z")), config.getInt(path + ".color"), config.getBoolean(path + ".prohibit_exiting"), config.getBoolean(path + ".allow_shrink_expand")));
        }
    }
}
