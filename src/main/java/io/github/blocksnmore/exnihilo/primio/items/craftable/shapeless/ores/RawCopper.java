package io.github.blocksnmore.exnihilo.primio.items.craftable.shapeless.ores;

import io.github.blocksnmore.exnihilo.primio.items.uncraftable.pieces.CopperPiece;
import io.github.blocksnmore.exnihilo.primio.utils.ShapelessCraft;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class RawCopper extends ShapelessCraft {
    public RawCopper() {
        ItemStack piece = new CopperPiece().item;

        this.item = new ItemStack(Material.RAW_COPPER);
        this.customModelDataNumber = 0;
        this.namespaceName = "raw_copper";
        this.recipeIngredients = new ItemStack[]{
                piece,
                piece,
                piece,
                piece
        };
    }
}
