package io.github.kraksy.coopventory;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class PlayerInventory implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){

        // TODO fill inventory with custom item

        Player player = event.getPlayer();
        Inventory inventory = player.getInventory();
        ItemStack fillItem = new ItemStack(Material.BLACK_STAINED_GLASS);

        for (int i = 0; i < 27; i++){
            inventory.setItem(i, fillItem);
        }
    }
}
