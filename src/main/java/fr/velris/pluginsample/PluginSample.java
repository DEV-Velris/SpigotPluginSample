package fr.velris.pluginsample;

import fr.velris.pluginsample.managers.MCommands;
import fr.velris.pluginsample.managers.MFiles;
import fr.velris.pluginsample.managers.MListeners;
import org.bukkit.plugin.java.JavaPlugin;

public final class PluginSample extends JavaPlugin {

    private static PluginSample instance;

    /*
    MANAGERS CLASS
     */
    private MFiles mFiles;
    private MListeners mListeners;
    private MCommands mCommands;

    @Override
    public void onEnable() {
        //Instance
        instance = this;

        //Managers Class
        mFiles = new MFiles();
        mFiles.LoadFiles();
        mListeners = new MListeners();
        mCommands = new MCommands();

        //Initialization at the end
        mListeners.LoadListeners();
        mCommands.LoadCommands();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static PluginSample getInstance() {
        return instance;
    }

    public MFiles getmFiles() {
        return mFiles;
    }

    public MListeners getmListeners() {
        return mListeners;
    }

    public MCommands getmCommands() {
        return mCommands;
    }
}
