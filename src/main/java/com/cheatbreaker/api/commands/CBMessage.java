package com.cheatbreaker.api.commands;

import com.cheatbreaker.api.CheatBreakerAPI;
import com.cheatbreaker.api.object.CBNotification;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CBMessage implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission(CheatBreakerAPI.getInstance().getConfig().getString("permissions.message"))) {
            sender.sendMessage(ChatColor.RED + "You don't have permission to run /cbm");
        } else if (args.length < 2) {
            sender.sendMessage(ChatColor.RED + "/cbm <time> <message>");
        } else {
            String message = StringUtils.join(args, ' ', 1, args.length);
            
            if (!StringUtils.isNumeric(args[0])) {
                sender.sendMessage(ChatColor.RED + args[0] + " isn't a number!");
            } else if (Integer.parseInt(args[0]) > 30) {
                sender.sendMessage(ChatColor.RED + "You cannot make a message last for longer than 30 seconds!");
            } else {
                for (Player player : Bukkit.getOnlinePlayers()) {
                    CheatBreakerAPI.getInstance().sendNotification(player, new CBNotification(message, Long.parseLong(args[0]), TimeUnit.SECONDS));
                }       
                sender.sendMessage(ChatColor.GREEN + "Successfully sent a CheatBreaker message.");
            }
        }
        return false;
    }
}
