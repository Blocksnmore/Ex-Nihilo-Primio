package io.github.blocksnmore.exnihilo.primio.utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;

public class KeyedItem {
    public char letter;
    public ItemStack item;
    public RecipeChoice choice;

    public KeyedItem(char letter, ItemStack item) {
        this.letter = letter;
        this.item = item;
    }

    public KeyedItem(char letter, RecipeChoice choice) {
        this.letter = letter;
        this.choice = choice;
    }

    public KeyedItem(char letter, Material item) {
        this.letter = letter;
        this.item = new ItemStack(item);
    }
}
