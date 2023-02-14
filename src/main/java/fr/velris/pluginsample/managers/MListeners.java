package fr.velris.pluginsample.managers;

import fr.velris.pluginsample.PluginSample;
import fr.velris.pluginsample.listeners.LOnPlayerJoin;
import org.bukkit.plugin.PluginManager;

public class MListeners {

    private final PluginSample main = PluginSample.getInstance();

    public void LoadListeners() {
        PluginManager pm = main.getServer().getPluginManager();

        //Register a listener for example
        pm.registerEvents(new LOnPlayerJoin(), main);

    }

}
