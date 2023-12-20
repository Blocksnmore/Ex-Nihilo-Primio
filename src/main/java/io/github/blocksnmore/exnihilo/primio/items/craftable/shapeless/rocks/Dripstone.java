package io.github.blocksnmore.exnihilo.primio.items.craftable.shapeless.rocks;

import io.github.blocksnmore.exnihilo.primio.items.uncraftable.pebbles.DripstonePebble;
import io.github.blocksnmore.exnihilo.primio.utils.ShapelessCraft;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Dripstone extends ShapelessCraft {
    public Dripstone() {
        ItemStack pebble = new DripstonePebble().item;

        this.item = new ItemStack(Material.DRIPSTONE_BLOCK);
        this.customModelDataNumber = 0;
        this.namespaceName = "dripstone";
        this.recipeIngredients = new ItemStack[]{
                pebble,
                pebble,
                pebble,
                pebble
        };
    }
}
