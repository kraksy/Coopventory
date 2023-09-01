package io.github.kraksy.coopventory;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

public class commands implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (commandSender instanceof Player){

            // TODO testing for future

            Player player = ((Player) commandSender).getPlayer();
            Inventory inventory = Bukkit.createInventory(player, 27);


            assert player != null;
            player.openInventory(inventory);
        }

        return true;
    }
}
