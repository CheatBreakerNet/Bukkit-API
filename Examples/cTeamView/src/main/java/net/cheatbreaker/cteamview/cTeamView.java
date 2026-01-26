package net.cheatbreaker.cteamview;

import com.cheatbreaker.api.CheatBreakerAPI;
import com.cheatbreaker.nethandler.server.CBPacketTeammates;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;

public final class cTeamView extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        FileConfiguration config = getConfig();
        List<String> memberUUIDs = config.getStringList("team.members");

        List<Player> onlineMembers = memberUUIDs.stream()
                .map(UUID::fromString)
                .map(Bukkit::getPlayer)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        CheatBreakerAPI.getInstance().sendTeammates(
                event.getPlayer(),
                new CBPacketTeammates(
                        event.getPlayer().getUniqueId(),
                        System.currentTimeMillis(),
                        buildTeamMembers(onlineMembers)
                )
        );
    }

    private Map<UUID, Map<String, Double>> buildTeamMembers(List<Player> players) {
        Map<UUID, Map<String, Double>> teamMap = new HashMap<>();

        for (Player player : players) {
            Map<String, Double> playerInfo = new HashMap<>();
            playerInfo.put("x", player.getLocation().getX());
            playerInfo.put("y", player.getLocation().getY() + 0.5D);
            playerInfo.put("z", player.getLocation().getZ());

            teamMap.put(player.getUniqueId(), playerInfo);
        }

        return teamMap;
    }
}