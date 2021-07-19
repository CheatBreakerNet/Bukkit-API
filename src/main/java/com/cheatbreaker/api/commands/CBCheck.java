package com.cheatbreaker.api.commands;

import com.cheatbreaker.api.CheatBreakerAPI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CBCheck implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length > 0) {
                Player target = Bukkit.getPlayer(args[0]);
                if (target == null) {
                    sender.sendMessage(ChatColor.RED + "The player '" + args[0] + "' is not online.");
                    return false;
                } else if (CheatBreakerAPI.getInstance().isRunningCheatBreaker(target)) {
                    sender.sendMessage(ChatColor.GREEN + target.getName() + " is on " + ChatColor.RED + ChatColor.BOLD + "Cheat" + ChatColor.WHITE + ChatColor.BOLD + "Breaker.");
                    return true;
                } else {
                    sender.sendMessage(ChatColor.RED + target.getName() + " is not on " + ChatColor.RED + ChatColor.BOLD + "Cheat" + ChatColor.WHITE + ChatColor.BOLD + "Breaker.");
                    return true;
                }
            } else {
                sender.sendMessage(ChatColor.RED + "/cb (username)");
                return true;
        }
    }
}
