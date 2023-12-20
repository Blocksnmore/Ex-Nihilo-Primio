package io.github.blocksnmore.exnihilo.primio.utils;

import org.bukkit.inventory.ItemStack;

public class KeyedItem {
    public char letter;
    public ItemStack item;

    public KeyedItem(char letter, ItemStack item) {
        this.letter = letter;
        this.item = item;
    }
}
