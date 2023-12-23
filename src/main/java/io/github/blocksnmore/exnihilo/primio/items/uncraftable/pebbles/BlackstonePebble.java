package io.github.blocksnmore.exnihilo.primio.items.uncraftable.pebbles;

import io.github.blocksnmore.exnihilo.primio.utils.Color;
import io.github.blocksnmore.exnihilo.primio.utils.Craft;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class BlackstonePebble extends Craft {

    public BlackstonePebble() {
        this.item = new ItemStack(Material.RECOVERY_COMPASS);
        this.customModelDataNumber = 6;

        ItemMeta meta = this.item.getItemMeta();
        meta.setCustomModelData(this.customModelDataNumber);
        meta.displayName(Color.applyColor("&r&fBlackstone Pebble"));
        this.item.setItemMeta(meta);

        this.namespaceName = "blackstone_pebble";
    }
}
