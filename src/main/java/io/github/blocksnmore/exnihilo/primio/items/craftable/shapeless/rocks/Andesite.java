package io.github.blocksnmore.exnihilo.primio.items.craftable.shapeless.rocks;

import io.github.blocksnmore.exnihilo.primio.items.uncraftable.pebbles.AndesitePebble;
import io.github.blocksnmore.exnihilo.primio.utils.ShapelessCraft;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Andesite extends ShapelessCraft {
    public Andesite() {
        ItemStack pebble = new AndesitePebble().item;

        this.item = new ItemStack(Material.ANDESITE);
        this.customModelDataNumber = 0;
        this.namespaceName = "andesite";
        this.recipeIngredients = new ItemStack[]{
                pebble,
                pebble,
                pebble,
                pebble
        };
    }
}
