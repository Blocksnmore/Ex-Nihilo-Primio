package io.github.blocksnmore.exnihilo.primio.items.uncraftable.pebbles;

import io.github.blocksnmore.exnihilo.primio.utils.Color;
import io.github.blocksnmore.exnihilo.primio.utils.Craft;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class TuffPebble extends Craft {

    public TuffPebble() {
        this.item = new ItemStack(Material.RECOVERY_COMPASS);
        this.customModelDataNumber = 15;

        ItemMeta meta = this.item.getItemMeta();
        meta.setCustomModelData(this.customModelDataNumber);
        meta.displayName(Color.applyColor("&r&fTuff Pebble"));
        this.item.setItemMeta(meta);

        this.namespaceName = "tuff_pebble";
    }
}
