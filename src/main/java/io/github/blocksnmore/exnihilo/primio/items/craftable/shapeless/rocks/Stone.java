package io.github.blocksnmore.exnihilo.primio.items.craftable.shapeless.rocks;

import io.github.blocksnmore.exnihilo.primio.items.uncraftable.pebbles.StonePebble;
import io.github.blocksnmore.exnihilo.primio.utils.ShapelessCraft;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Stone extends ShapelessCraft {
    public Stone() {
        ItemStack pebble = new StonePebble().item;

        this.item = new ItemStack(Material.COBBLESTONE);
        this.customModelDataNumber = 0;
        this.namespaceName = "stone";
        this.recipeIngredients = new ItemStack[]{
                pebble,
                pebble,
                pebble,
                pebble
        };
    }
}
