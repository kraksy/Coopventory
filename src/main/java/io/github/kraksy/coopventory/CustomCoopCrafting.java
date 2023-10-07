package io.github.kraksy.coopventory;

import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static org.bukkit.Bukkit.getLogger;

public class CustomCoopCrafting implements Listener {

    @EventHandler
    public void getItemInCrafting(PrepareItemCraftEvent event){
        CraftingInventory craftingInventory = event.getInventory();
        List<Player> playerList = new ArrayList<>();
        playerList.add((Player) event.getViewers());

    }

    public void getSlot(CraftingInventory craftingInventory){
        ItemStack[][] matrix = new ItemStack[3][3];

        for (int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++){
                int slot = row * 3 + col;
                ItemStack item = craftingInventory.getItem(slot);
                matrix[row][col] = item;
            }
        }

    }

    @EventHandler
    public void onCraftingTableClick(PlayerInteractEvent event)
    {
        // interaction with crafting table will call inventory



    }

    public void sendCraftingInventory(List<Player> playerList, CraftingInventory craftingInventory){
        Logger logger = getLogger();

        for (HumanEntity player : playerList){
            if (player != null){

                getSlot(craftingInventory);


            }
        }
    }

    @EventHandler
    public void playerCrafting(CraftItemEvent event){

        Player player = (Player) event.getWhoClicked();
        Event.@NotNull Result item = event.getResult();

    }
}