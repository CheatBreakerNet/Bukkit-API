package net.cheatbreaker.clegacycombat;

import com.cheatbreaker.api.CheatBreakerAPI;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class cLegacyCombat extends JavaPlugin implements Listener {

    @Getter cLegacyCombat instance;

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
        CheatBreakerAPI.getInstance().setLegacyCombat(event.getPlayer(), this.getConfig().getBoolean("legacyCombat"));
    }
}
