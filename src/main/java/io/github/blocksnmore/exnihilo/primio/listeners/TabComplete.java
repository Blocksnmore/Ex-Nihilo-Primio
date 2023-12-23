package io.github.blocksnmore.exnihilo.primio.listeners;

import io.github.blocksnmore.exnihilo.primio.Primio;
import io.github.blocksnmore.exnihilo.primio.shared.Items;
import org.bukkit.command.Command;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.TabCompleteEvent;

import java.util.ArrayList;

public class TabComplete implements Listener {
    @EventHandler
    public void onTabComplete(TabCompleteEvent e) {
        String[] args = e.getBuffer().split(" ");

        Command cmd = Primio.instance.getServer().getCommandMap().getCommand(args[0].substring(1));

        if (cmd == null) {
            return;
        }

        if (!cmd.getName().equals("primio")) {
            return;
        }

        if (args.length == 1) {
            e.setCompletions(Items.items.keySet().stream().toList());
            return;
        }

        e.setCompletions(new ArrayList<>());
    }
}
