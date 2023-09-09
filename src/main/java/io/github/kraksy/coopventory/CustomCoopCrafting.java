package io.github.kraksy.coopventory;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

import static org.bukkit.Bukkit.getLogger;

public class CustomCoopCrafting implements Listener {
    @EventHandler
    public void getItemInCrafting(PrepareItemCraftEvent event){
        CraftingInventory craftingInventory = event.getInventory();

        // 2D array for the crafting layout , stolen from chatgpt
        ItemStack[][] matrix = new ItemStack[3][3];

        for (int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++){
                int slot = row * 3 + col;
                ItemStack item = craftingInventory.getItem(slot);
                matrix[row][col] = item;
            }
        }

        List<Player> playerList = new ArrayList<>();
        List<ItemStack[]> itemStackList = new ArrayList<>();

        itemStackList.add(items);
        playerList.add((Player) event.getViewers());

        //todo maybe make a for loop where it will look at every slot and it will make a array with where are the items




        mergeItemStack(itemStackList, craftingInventory);
        saveConfig(playerList, craftingInventory);
    }

    public void mergeItemStack(List<ItemStack[]> itemStacks, CraftingInventory craftingInventory){
        for (ItemStack[] items : itemStacks){
            for (ItemStack itemStack : items){
                //todo set specific item to its place
                craftingInventory.setItem(); // set item in its place
            }
        }

        //todo send the geral crafting table to all the players
    }

    public void saveConfig(List<Player> playerList, CraftingInventory craftingInventory){

        Logger logger = getLogger();

        // for every player send merged list of items , send it like crafting inventory
        for (HumanEntity player : playerList){
            if (player != null){
                itemStacks.get(i);

            }
        }

    }

    public void sendPlayer(Player player, CraftingInventory craftingInventory, List<ItemStack[]> itemStacks){

        craftingInventory.setMatrix();

    }

    @EventHandler
    public void playerCrafting(CraftItemEvent event){

        Player player = (Player) event.getWhoClicked();
        Event.@NotNull Result item = event.getResult();

        // 4 rows today B ]



        //todo send players all items in crafting table and sync
        //todo it should be done after that T T
        //todo maybe im gonna need LAST event for finishing the crafting

    }
}