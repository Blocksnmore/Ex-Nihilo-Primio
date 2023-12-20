package io.github.blocksnmore.exnihilo.primio.items.craftable.shapeless.rocks;

import io.github.blocksnmore.exnihilo.primio.items.uncraftable.pebbles.BasaltPebble;
import io.github.blocksnmore.exnihilo.primio.utils.ShapelessCraft;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Basalt extends ShapelessCraft {
    public Basalt() {
        ItemStack pebble = new BasaltPebble().item;

        this.item = new ItemStack(Material.BASALT);
        this.customModelDataNumber = 0;
        this.namespaceName = "basalt";
        this.recipeIngredients = new ItemStack[]{
                pebble,
                pebble,
                pebble,
                pebble
        };
    }
}
