package io.github.blocksnmore.exnihilo.primio.items.craftable.shapeless.rocks;

import io.github.blocksnmore.exnihilo.primio.items.uncraftable.pebbles.NetherrackPebble;
import io.github.blocksnmore.exnihilo.primio.utils.ShapelessCraft;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Netherrack extends ShapelessCraft {
    public Netherrack() {
        ItemStack pebble = new NetherrackPebble().item;

        this.item = new ItemStack(Material.NETHERRACK);
        this.customModelDataNumber = 0;
        this.namespaceName = "netherrack";
        this.recipeIngredients = new ItemStack[]{
                pebble,
                pebble,
                pebble,
                pebble
        };
    }
}
