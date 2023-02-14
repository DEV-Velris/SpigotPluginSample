package fr.velris.pluginsample.commands;

import fr.velris.pluginsample.PluginSample;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CTest implements CommandExecutor {

    private final PluginSample main = PluginSample.getInstance();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 1) {

            if (args[0].equalsIgnoreCase("test")) {
                sender.sendMessage("§cThis is a test !");
                return true;
            } else if (args[0].equalsIgnoreCase("tester")) {
                sender.sendMessage("§cThis is a tester !");
                return true;
            }

        } else {
            sender.sendMessage("§cYou need to specifies 1 argument like test or tester");
            return false;
        }

        return false;
    }
}
