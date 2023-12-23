package io.github.blocksnmore.exnihilo.primio.items.uncraftable.pieces;

import io.github.blocksnmore.exnihilo.primio.utils.Color;
import io.github.blocksnmore.exnihilo.primio.utils.Craft;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CopperPiece extends Craft {

    public CopperPiece() {
        this.item = new ItemStack(Material.RECOVERY_COMPASS);
        this.customModelDataNumber = 3;

        ItemMeta meta = this.item.getItemMeta();
        meta.setCustomModelData(this.customModelDataNumber);
        meta.displayName(Color.applyColor("&r&fCopper Piece"));
        this.item.setItemMeta(meta);

        this.namespaceName = "copper_piece";
    }
}
