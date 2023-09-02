package io.github.kraksy.coopventory;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class clickEventCancellation implements Listener {

    @EventHandler
    public void something(InventoryClickEvent event){
        ItemStack currentItem = event.getCurrentItem();

        assert currentItem != null;
        if (currentItem.getType().equals(Material.BLACK_STAINED_GLASS)){
            event.setCancelled(true);
        }
    }
}
