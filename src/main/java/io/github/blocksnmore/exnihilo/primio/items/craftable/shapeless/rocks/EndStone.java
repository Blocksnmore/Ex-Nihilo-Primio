package io.github.blocksnmore.exnihilo.primio.items.craftable.shapeless.rocks;

import io.github.blocksnmore.exnihilo.primio.items.uncraftable.pebbles.EndStonePebble;
import io.github.blocksnmore.exnihilo.primio.utils.ShapelessCraft;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class EndStone extends ShapelessCraft {
    public EndStone() {
        ItemStack pebble = new EndStonePebble().item;

        this.item = new ItemStack(Material.END_STONE);
        this.customModelDataNumber = 0;
        this.namespaceName = "end_stone";
        this.recipeIngredients = new ItemStack[]{
                pebble,
                pebble,
                pebble,
                pebble
        };
    }
}
