package io.github.blocksnmore.exnihilo.primio.items.uncraftable.pieces;

import io.github.blocksnmore.exnihilo.primio.utils.Craft;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class IronPiece extends Craft {

    public IronPiece() {
        this.item = new ItemStack(Material.RECOVERY_COMPASS);
        this.customModelDataNumber = 1;

        ItemMeta meta = this.item.getItemMeta();
        meta.setCustomModelData(this.customModelDataNumber);
        meta.displayName(Component.text("Iron Piece"));
        this.item.setItemMeta(meta);

        this.namespaceName = "iron_piece";
    }
}
