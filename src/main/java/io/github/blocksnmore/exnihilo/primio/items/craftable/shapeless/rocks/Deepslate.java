package io.github.blocksnmore.exnihilo.primio.items.craftable.shapeless.rocks;

import io.github.blocksnmore.exnihilo.primio.items.uncraftable.pebbles.DeepslatePebble;
import io.github.blocksnmore.exnihilo.primio.utils.ShapelessCraft;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Deepslate extends ShapelessCraft {
    public Deepslate() {
        ItemStack pebble = new DeepslatePebble().item;

        this.item = new ItemStack(Material.DEEPSLATE);
        this.customModelDataNumber = 0;
        this.namespaceName = "deepslate";
        this.recipeIngredients = new ItemStack[]{
                pebble,
                pebble,
                pebble,
                pebble
        };
    }
}
