package io.github.blocksnmore.exnihilo.primio.listeners;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.HashMap;

public class Mine implements Listener {

    HashMap<Material, Material> itemConversions = new HashMap<>(){{
        // From https://novamachina-mods.github.io/exnihilosequentia/items/hammers/#block-breakdown
        put(Material.STONE, Material.COBBLESTONE);
        put(Material.COBBLESTONE, Material.GRAVEL);
        // Andesite	Crushed Andesite
        // Granite	Crushed Granite
        // Diorite	Crushed Diorite
        put(Material.GRAVEL, Material.SAND);
        // Sand	Dust
        // End Stone Crushed End Stone
        // Netherrack Crushed Netherrack

        put(Material.TUBE_CORAL_BLOCK, Material.TUBE_CORAL);
        put(Material.BRAIN_CORAL_BLOCK, Material.BRAIN_CORAL);
        put(Material.BUBBLE_CORAL_BLOCK, Material.BUBBLE_CORAL);
        put(Material.HORN_CORAL_BLOCK, Material.HORN_CORAL);
        put(Material.FIRE_CORAL_BLOCK, Material.FIRE_CORAL);

        put(Material.TUBE_CORAL, Material.TUBE_CORAL_FAN);
        put(Material.BRAIN_CORAL, Material.BRAIN_CORAL_FAN);
        put(Material.BUBBLE_CORAL, Material.BUBBLE_CORAL_FAN);
        put(Material.HORN_CORAL, Material.HORN_CORAL_FAN);
        put(Material.FIRE_CORAL, Material.FIRE_CORAL_FAN);
    }};

    @EventHandler
    public void onBreakEvent(BlockBreakEvent e) {
        if (!e.getBlock().getDrops().isEmpty()) return;
        // TODO: This
    }

    @EventHandler
    public void beforeBreakEvent(PlayerInteractEvent e) {
        if (e.getAction() != Action.LEFT_CLICK_BLOCK) return;
        if (e.getPlayer().getGameMode() != GameMode.SURVIVAL) return;

        Block block = e.getClickedBlock();

        if (block == null) return;

        if (block.getType() != Material.SPAWNER) return;

        // TODO: This
        CreatureSpawner state = (CreatureSpawner) block.getState();

        e.getPlayer().sendMessage("Breaking");

    }
}
