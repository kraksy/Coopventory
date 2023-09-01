package io.github.kraksy.coopventory;

import org.bukkit.block.data.type.Light;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class sendResourcePack implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){

        // TODO make custom items for gui


        Player player = event.getPlayer();
        player.setResourcePack();

    }
}
