package io.github.blocksnmore.exnihilo.primio.items.craftable.shapeless.rocks;

import io.github.blocksnmore.exnihilo.primio.items.uncraftable.pebbles.CalcitePebble;
import io.github.blocksnmore.exnihilo.primio.utils.ShapelessCraft;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Calcite extends ShapelessCraft {
    public Calcite() {
        ItemStack pebble = new CalcitePebble().item;

        this.item = new ItemStack(Material.CALCITE);
        this.customModelDataNumber = 0;
        this.namespaceName = "calcite";
        this.recipeIngredients = new ItemStack[]{
                pebble,
                pebble,
                pebble,
                pebble
        };
    }
}
