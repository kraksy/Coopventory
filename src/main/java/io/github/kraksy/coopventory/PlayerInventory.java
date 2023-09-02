package io.github.kraksy.coopventory;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PlayerInventory implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){

        Player player = event.getPlayer();
        Inventory inventory = player.getInventory();
        ItemStack fillItem = new ItemStack(Material.BLACK_STAINED_GLASS);
        ItemMeta itemMeta =  fillItem.getItemMeta();
        TextComponent textComponent = Component.text(" ");

        for (int i = 0; i < 44; i++){
            inventory.clear(0);
            inventory.setItem(i, fillItem);
            itemMeta.displayName(textComponent);
            fillItem.setItemMeta(itemMeta);
        }
    }

}
