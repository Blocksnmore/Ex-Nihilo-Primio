package io.github.blocksnmore.exnihilo.primio.listeners;

import io.github.blocksnmore.exnihilo.primio.Primio;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Join implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();

        for (String keyStr : Primio.craftNamespaces) {
            NamespacedKey key = new NamespacedKey(Primio.pluginNamespace, keyStr);

            player.discoverRecipe(key);
        }
    }
}
