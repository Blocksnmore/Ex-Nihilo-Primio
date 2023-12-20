package io.github.blocksnmore.exnihilo.primio.items.craftable.shapeless.rocks;

import io.github.blocksnmore.exnihilo.primio.items.uncraftable.pebbles.TuffPebble;
import io.github.blocksnmore.exnihilo.primio.utils.ShapelessCraft;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Tuff extends ShapelessCraft {
    public Tuff() {
        ItemStack pebble = new TuffPebble().item;

        this.item = new ItemStack(Material.TUFF);
        this.customModelDataNumber = 0;
        this.namespaceName = "tuff";
        this.recipeIngredients = new ItemStack[]{
                pebble,
                pebble,
                pebble,
                pebble
        };
    }
}
