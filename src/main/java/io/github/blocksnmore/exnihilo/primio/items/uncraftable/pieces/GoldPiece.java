package io.github.blocksnmore.exnihilo.primio.items.uncraftable.pieces;

import io.github.blocksnmore.exnihilo.primio.utils.Craft;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GoldPiece extends Craft {

    public GoldPiece() {
        this.item = new ItemStack(Material.RECOVERY_COMPASS);
        this.customModelDataNumber = 2;

        ItemMeta meta = this.item.getItemMeta();
        meta.setCustomModelData(this.customModelDataNumber);
        meta.displayName(Component.text("Gold Piece"));
        this.item.setItemMeta(meta);

        this.namespaceName = "gold_piece";
    }
}