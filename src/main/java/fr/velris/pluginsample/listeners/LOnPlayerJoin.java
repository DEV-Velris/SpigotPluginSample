package fr.velris.pluginsample.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class LOnPlayerJoin implements Listener {

    @EventHandler
    public void OnPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage("§7[§c+§7] §6" + event.getPlayer().getName());
    }

}
