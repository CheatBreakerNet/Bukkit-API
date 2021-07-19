package com.offlinecheatbreaker.cstaffmodules;

import com.cheatbreaker.api.CheatBreakerAPI;
import com.cheatbreaker.nethandler.server.CBPacketHologram;
import com.cheatbreaker.nethandler.server.CBPacketTeammates;
import com.cheatbreaker.nethandler.server.CBPacketWorldBorder;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class cStaffModules extends JavaPlugin implements Listener {

    @Getter
    cStaffModules instance;

    @Override
    public void onEnable() {
        instance = this;

        this.saveDefaultConfig();

        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        if (event.getPlayer().hasPermission(this.getConfig().getString("permission"))) {
            CheatBreakerAPI.getInstance().giveAllStaffModules(event.getPlayer());
        }
    }
}
