package io.github.kraksy.coopventory;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
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
    public void onBlockClick(PlayerInteractEvent event){

        Player player = event.getPlayer();
        Action action = event.getAction();
        ItemStack clickedItem = new ItemStack(Objects.requireNonNull(event.getClickedBlock()).getType());
        ItemStack targetItem = new ItemStack(Material.CRAFTING_TABLE);

        if (action.isRightClick() && clickedItem.equals(targetItem)){
            player.sendMessage(Component.text("block clicked"));
        }
    }

    @EventHandler
    public void getItemInCrafting(PrepareItemCraftEvent event){

        CraftingInventory craftingInventory = event.getInventory();
        ItemStack[] items = craftingInventory.getContents();
        HumanEntity[] players = event.getViewers().toArray(new HumanEntity[0]);

        List<@Nullable ItemStack[]> itemStackList = new ArrayList<>();

        itemStackList.add(craftingInventory.getContents());


        saveConfig(items, players);
    }

    public void saveConfig(ItemStack[] items, HumanEntity[] players){

        Logger logger = getLogger();

        // when the errors drop im going to fucking krill myself B )
        for (ItemStack itemStack : items) {
            if (itemStack != null) {
                items.
            }
        }

        for (HumanEntity player : players){
            if (player != null){
                player.sendMessage(Component.text("works"));
            }
        }

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