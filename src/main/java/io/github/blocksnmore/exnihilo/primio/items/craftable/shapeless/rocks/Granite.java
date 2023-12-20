package io.github.blocksnmore.exnihilo.primio.items.craftable.shapeless.rocks;

import io.github.blocksnmore.exnihilo.primio.items.uncraftable.pebbles.GranitePebble;
import io.github.blocksnmore.exnihilo.primio.utils.ShapelessCraft;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Granite extends ShapelessCraft {
    public Granite() {
        ItemStack pebble = new GranitePebble().item;

        this.item = new ItemStack(Material.GRANITE);
        this.customModelDataNumber = 0;
        this.namespaceName = "granite";
        this.recipeIngredients = new ItemStack[]{
                pebble,
                pebble,
                pebble,
                pebble
        };
    }
}
