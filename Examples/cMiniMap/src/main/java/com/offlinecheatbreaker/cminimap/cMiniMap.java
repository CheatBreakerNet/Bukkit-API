package com.offlinecheatbreaker.cminimap;

import com.cheatbreaker.api.CheatBreakerAPI;
import com.cheatbreaker.api.object.MinimapStatus;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class cMiniMap extends JavaPlugin implements Listener {

    @Getter cMiniMap instance;

    @Override
    public void onEnable() {
        instance = this;

        this.saveDefaultConfig();

        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        instance = this;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        if (this.getConfig().getBoolean("minimapEnabled")) {
            CheatBreakerAPI.getInstance().setMinimapStatus(event.getPlayer(), MinimapStatus.NEUTRAL);
        } else {
            CheatBreakerAPI.getInstance().setMinimapStatus(event.getPlayer(), MinimapStatus.FORCED_OFF);
        }
    }
}
