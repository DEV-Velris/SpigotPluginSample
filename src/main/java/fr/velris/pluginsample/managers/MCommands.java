package fr.velris.pluginsample.managers;

import fr.velris.pluginsample.PluginSample;
import fr.velris.pluginsample.commands.CTest;
import fr.velris.pluginsample.commands.CTestCompleter;

public class MCommands {

    private final PluginSample main = PluginSample.getInstance();

    public void LoadCommands() {
        //Creating the “Test” CommandExecutor
        main.getCommand("test").setExecutor(new CTest());
        //Creating the “Test” TabCompleter
        main.getCommand("test").setTabCompleter(new CTestCompleter());
    }

}
