package io.github.blocksnmore.exnihilo.primio.items.craftable.shaped.hammers;

import io.github.blocksnmore.exnihilo.primio.utils.Color;
import io.github.blocksnmore.exnihilo.primio.utils.KeyedItem;
import io.github.blocksnmore.exnihilo.primio.utils.ShapedCraft;
import org.bukkit.Material;
import org.bukkit.Tag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.meta.ItemMeta;

public class WoodenHammer extends ShapedCraft {
    public WoodenHammer() {
        this.item = new ItemStack(Material.WOODEN_PICKAXE);
        this.customModelDataNumber = 1;
        this.namespaceName = "wooden_hammer";

        ItemMeta meta = this.item.getItemMeta();
        meta.displayName(Color.applyColor("&r&fWooden Hammer"));
        meta.setCustomModelData(this.customModelDataNumber);

        this.item.setItemMeta(meta);

        this.recipeShape = new String[]{
                " b ",
                " sb",
                "s  "
        };

        this.recipeIngredients.add(new KeyedItem('b', new RecipeChoice.MaterialChoice(Tag.PLANKS)));
    }
}
