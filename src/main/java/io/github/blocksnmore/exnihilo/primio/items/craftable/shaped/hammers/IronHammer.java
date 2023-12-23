package io.github.blocksnmore.exnihilo.primio.items.craftable.shaped.hammers;

import io.github.blocksnmore.exnihilo.primio.utils.Color;
import io.github.blocksnmore.exnihilo.primio.utils.KeyedItem;
import io.github.blocksnmore.exnihilo.primio.utils.ShapedCraft;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class IronHammer extends ShapedCraft {
    public IronHammer() {
        this.item = new ItemStack(Material.IRON_PICKAXE);
        this.customModelDataNumber = 1;
        this.namespaceName = "iron_hammer";

        ItemMeta meta = this.item.getItemMeta();
        meta.displayName(Color.applyColor("&r&fIron Hammer"));
        meta.setCustomModelData(this.customModelDataNumber);

        this.item.setItemMeta(meta);

        this.recipeShape = new String[]{
                " b ",
                " sb",
                "s  "
        };

        this.recipeIngredients.add(new KeyedItem('b', Material.IRON_INGOT));

    }
}
