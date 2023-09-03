package io.github.kraksy.coopventory;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class CustomCoopCrafting implements Listener {

    @EventHandler
    public void onBlockClick(PlayerInteractEvent event){

        Player player = event.getPlayer();
        Action action = event.getAction();
        ItemStack clickedItem = new ItemStack(Objects.requireNonNull(event.getClickedBlock()).getType());
        ItemStack targetItem = new ItemStack(Material.CRAFTING_TABLE);
        Block block = event.getClickedBlock();

        if (action.isRightClick() && clickedItem.equals(targetItem)){
            player.sendMessage(Component.text("block clicked"));
        }
    }

    @EventHandler
    public void getItemInCrafting(PrepareItemCraftEvent event){

        CraftingInventory craftingInventory = event.getInventory();
        ItemStack[] items = craftingInventory.getContents();

        // TODO get items from crafting table , player should place just one item


    }

    public void saveConfig(){

        // TODO create and safe int into config


    }
}