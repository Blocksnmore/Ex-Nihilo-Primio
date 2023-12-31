package io.github.blocksnmore.exnihilo.primio.items.uncraftable.pebbles;

import io.github.blocksnmore.exnihilo.primio.utils.Color;
import io.github.blocksnmore.exnihilo.primio.utils.Craft;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class EndStonePebble extends Craft {

    public EndStonePebble() {
        this.item = new ItemStack(Material.RECOVERY_COMPASS);
        this.customModelDataNumber = 11;

        ItemMeta meta = this.item.getItemMeta();
        meta.setCustomModelData(this.customModelDataNumber);
        meta.displayName(Color.applyColor("&r&fEnd Stone Pebble"));
        this.item.setItemMeta(meta);

        this.namespaceName = "end_stone_pebble";
    }
}
