package io.github.blocksnmore.exnihilo.primio.items.craftable.shapeless.rocks;

import io.github.blocksnmore.exnihilo.primio.items.uncraftable.pebbles.BlackstonePebble;
import io.github.blocksnmore.exnihilo.primio.utils.ShapelessCraft;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Blackstone extends ShapelessCraft {
    public Blackstone() {
        ItemStack pebble = new BlackstonePebble().item;

        this.item = new ItemStack(Material.BLACKSTONE);
        this.customModelDataNumber = 0;
        this.namespaceName = "blackstone";
        this.recipeIngredients = new ItemStack[]{
                pebble,
                pebble,
                pebble,
                pebble
        };
    }
}
