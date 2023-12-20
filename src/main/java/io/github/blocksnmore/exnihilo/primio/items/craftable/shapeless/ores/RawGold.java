package io.github.blocksnmore.exnihilo.primio.items.craftable.shapeless.ores;

import io.github.blocksnmore.exnihilo.primio.items.uncraftable.pieces.GoldPiece;
import io.github.blocksnmore.exnihilo.primio.utils.ShapelessCraft;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class RawGold extends ShapelessCraft {
    public RawGold() {
        ItemStack piece = new GoldPiece().item;

        this.item = new ItemStack(Material.RAW_GOLD);
        this.customModelDataNumber = 0;
        this.namespaceName = "raw_gold";
        this.recipeIngredients = new ItemStack[]{
                piece,
                piece,
                piece,
                piece
        };
    }
}
