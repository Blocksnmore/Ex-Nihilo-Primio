package io.github.blocksnmore.exnihilo.primio.items.craftable.shapeless.rocks;

import io.github.blocksnmore.exnihilo.primio.items.uncraftable.pebbles.DioritePebble;
import io.github.blocksnmore.exnihilo.primio.utils.ShapelessCraft;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Diorite extends ShapelessCraft {
    public Diorite() {
        ItemStack pebble = new DioritePebble().item;

        this.item = new ItemStack(Material.DIORITE);
        this.customModelDataNumber = 0;
        this.namespaceName = "diorite";
        this.recipeIngredients = new ItemStack[]{
                pebble,
                pebble,
                pebble,
                pebble
        };
    }
}
