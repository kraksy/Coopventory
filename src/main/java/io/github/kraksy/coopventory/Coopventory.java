package io.github.kraksy.coopventory;

import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;
import java.util.logging.Logger;

public final class Coopventory extends JavaPlugin {

    @Override
    public void onEnable() {
        Logger logger = getLogger();
        logger.info(">> Coopventory <<");
        getServer().getPluginManager().registerEvents(new PlayerInventory(), this);
        getServer().getPluginManager().registerEvents(new sendResourcePack(), this);
        getServer().getPluginManager().registerEvents(new clickEventCancellation(), this);
        getServer().getPluginManager().registerEvents(new CustomCoopCrafting(), this);
        Objects.requireNonNull(this.getCommand("gui")).setExecutor(new commands());
        logger.info(">> loaded <<");
    }


    @Override
    public void onDisable() {
        System.out.println("seeya");
    }
}
