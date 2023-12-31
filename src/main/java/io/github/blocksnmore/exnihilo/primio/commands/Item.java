package io.github.blocksnmore.exnihilo.primio.commands;

import io.github.blocksnmore.exnihilo.primio.shared.Items;
import io.github.blocksnmore.exnihilo.primio.utils.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;

public class Item extends Command {

    public Item(@NotNull String name, @NotNull String description, @NotNull String usageMessage, @NotNull List<String> aliases) {
        super(name, description, usageMessage, aliases);
    }

    @Override
    public boolean execute(@NotNull CommandSender sender, @NotNull String commandLabel, @NotNull String[] args) {
        if (sender instanceof ConsoleCommandSender) {
            sender.sendMessage(Color.applyColor("&rThis only works for players!"));
            return true;
        }

        if (!sender.hasPermission("primo.give")) {
            sender.sendMessage(Color.applyColor("&rMissing Permissions!"));
            return true;
        }

        if (args.length < 1) {
            sender.sendMessage(Color.applyColor("&rPlease provide an item!"));
            return true;
        }

        int amount = 1;

        if (args.length >= 2) {
            try {
                amount = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                sender.sendMessage(Color.applyColor("&rInvalid amount requested!"));
                return true;
            }
        }

        HashMap<String, ItemStack> validItems = Items.items;

        if (!validItems.containsKey(args[0].toLowerCase())) {
            sender.sendMessage(Color.applyColor("&rUnknown item!"));
            return true;
        }

        ItemStack originalItem = validItems.get(args[0].toLowerCase());

        if (amount < 1 || amount > originalItem.getMaxStackSize()) {
            sender.sendMessage(Color.applyColor("&rQuantity must be between 1 and " + originalItem.getMaxStackSize() + "!"));
        }

        Player player = (Player) sender;

        ItemStack item = originalItem.asQuantity(amount);

        player.getInventory().addItem(item);

        sender.sendMessage(Color.applyColor("&bGave " + amount + " of " + args[0] + "!"));

        return true;
    }
}
