package io.github.kraksy.coopventory;

import net.kyori.adventure.text.Component;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Objects;

public class CustomCoopCrafting implements Listener {

    @EventHandler
    public void onBlockClick(PlayerInteractEvent event){

        Player player = event.getPlayer();
        Action action = event.getAction();
        ItemStack clickedItem = new ItemStack(Objects.requireNonNull(event.getClickedBlock()).getType());
        ItemMeta itemMeta = clickedItem.getItemMeta();
        itemMeta.setCustomModelData(1);

        if (action.isRightClick() ){
            player.sendMessage(Component.text("block clicked"));
        }
    }
}