package io.github.blocksnmore.exnihilo.primio.items.craftable.shapeless.ores;

import io.github.blocksnmore.exnihilo.primio.items.uncraftable.pieces.IronPiece;
import io.github.blocksnmore.exnihilo.primio.utils.ShapelessCraft;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class RawIron extends ShapelessCraft {
    public RawIron() {
        ItemStack piece = new IronPiece().item;

        this.item = new ItemStack(Material.RAW_IRON);
        this.customModelDataNumber = 0;
        this.namespaceName = "raw_iron";
        this.recipeIngredients = new ItemStack[]{
                piece,
                piece,
                piece,
                piece
        };
    }
}
