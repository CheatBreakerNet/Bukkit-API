package com.cheatbreaker.api.commands;

import com.cheatbreaker.api.CheatBreakerAPI;
import com.cheatbreaker.api.object.TitleType;
import java.time.Duration;
import java.util.Iterator;
import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CBTitle implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission(CheatBreakerAPI.getInstance().getConfig().getString("permissions.title"))) {
            return false;
        } else if (args.length < 4) {
            sender.sendMessage(ChatColor.RED + "/cbt <fadeInTime> <displayTime> <fadeOutTime> <message>");
            return false;
        } else {
            String message = StringUtils.join(args, ' ', 3, args.length);
            if (StringUtils.isNumeric(args[0]) && StringUtils.isNumeric(args[1]) && StringUtils.isNumeric(args[2])) {
                if (Long.parseLong(args[0]) <= 30L && Long.parseLong(args[1]) <= 30L && Long.parseLong(args[2]) <= 30L) {
                    Iterator var6 = Bukkit.getOnlinePlayers().iterator();

                    while(var6.hasNext()) {
                        Player player = (Player)var6.next();
                        CheatBreakerAPI.getInstance().sendTitle(player, TitleType.TITLE, ChatColor.translateAlternateColorCodes('&', message), Duration.ofSeconds(Long.parseLong(args[0])), Duration.ofSeconds(Long.parseLong(args[1])), Duration.ofSeconds(Long.parseLong(args[2])), 1.0F);
                    }

                    return false;
                } else {
                    sender.sendMessage(ChatColor.RED + "You cannot make an title last for longer than 30 seconds!");
                    return false;
                }
            } else {
                sender.sendMessage(ChatColor.RED + "one of the numbers you provided is invalid!");
                return false;
            }
        }
    }
}