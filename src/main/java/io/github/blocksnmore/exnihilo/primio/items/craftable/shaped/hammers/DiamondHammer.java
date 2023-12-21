package io.github.blocksnmore.exnihilo.primio.items.craftable.shaped.hammers;

import io.github.blocksnmore.exnihilo.primio.utils.KeyedItem;
import io.github.blocksnmore.exnihilo.primio.utils.ShapedCraft;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class DiamondHammer extends ShapedCraft {
    public DiamondHammer() {
        this.item = new ItemStack(Material.DIAMOND_PICKAXE);
        this.customModelDataNumber = 1;
        this.namespaceName = "diamond_hammer";

        ItemMeta meta = this.item.getItemMeta();
        meta.displayName(Component.text("Diamond Hammer"));
        meta.setCustomModelData(this.customModelDataNumber);

        this.item.setItemMeta(meta);

        this.recipeShape = new String[]{
                " b ",
                " sb",
                "s  "
        };

        this.recipeIngredients.add(new KeyedItem('b', Material.DIAMOND));

    }
}
