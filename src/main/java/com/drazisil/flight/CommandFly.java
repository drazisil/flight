package com.drazisil.flight;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandFly implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("flight.fly") && sender instanceof Player) {
            Player player = (Player) sender;

            if (!(Flight.plugin.getServer().getAllowFlight())) {
                player.sendMessage("Flight is not allowed on this server, please check with staff.");
                return true;
            }

            player.setAllowFlight(!(player.getAllowFlight()));
            player.sendMessage(String.format("Flight has been set to %s", player.getAllowFlight()));
            return true;
        }

        sender.sendMessage("You do not have the flight.fly permission!");

        return true;
    }
}
