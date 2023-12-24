package io.github.blocksnmore.exnihilo.primio.utils;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextDecoration;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;

public class Color {
    public static Component applyColor(String text) {
        return Component
                .text("")
                .decoration(TextDecoration.ITALIC, false)
                .append(LegacyComponentSerializer.legacyAmpersand().deserialize(text));
    }
}
