package io.github.blocksnmore.exnihilo.primio;

import io.github.blocksnmore.exnihilo.primio.commands.Item;
import io.github.blocksnmore.exnihilo.primio.shared.Items;
import io.github.blocksnmore.exnihilo.primio.utils.Craft;
import io.github.blocksnmore.exnihilo.primio.utils.KeyedItem;
import io.github.blocksnmore.exnihilo.primio.utils.ShapedCraft;
import io.github.blocksnmore.exnihilo.primio.utils.ShapelessCraft;
import io.github.classgraph.ClassGraph;
import io.github.classgraph.ScanResult;
import org.bukkit.NamespacedKey;
import org.bukkit.command.Command;
import org.bukkit.command.SimpleCommandMap;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.logging.Logger;

public class Primio extends JavaPlugin {
    public static String pluginNamespace = "exnihiloprimio";
    public static ArrayList<String> craftNamespaces = new ArrayList<>();
    ArrayList<Command> usedCommands = new ArrayList<>();
    Logger logger;

    public static Primio instance;

    @Override
    public void onEnable() {
        Primio.instance = this;
        this.logger = getLogger();
        this.logger.info("Starting Ex Nihilo: Primio");
        this.loadListeners();
        this.logger.info("Started Ex Nihilo: Primio");
    }

    @Override
    public void onDisable() {
        this.logger.info("Disabling Ex Nihilo: Primio");

        for (String recipe : Primio.craftNamespaces) {
            getServer().removeRecipe(new NamespacedKey(Primio.pluginNamespace, recipe));
        }

        for (Command command : usedCommands) {
            unregisterCommands(command.getName());
        }

        this.logger.info("Disabled Ex Nihilo: Primio");
    }

    @SuppressWarnings({"SpellCheckingInspection", "CommentedOutCode"})
    public void loadListeners() {
        String base = "io.github.blocksnmore.exnihilo.primio";

        try(ScanResult result = new ClassGraph().acceptPackages(
                base + ".listeners",
                base + ".items.craftable",
                // Only used for filling the items object
                base + ".items.uncraftable"
        ).scan()
        ) {

            // TODO: !IMPORTANT! FIGURE OUT WHAT BROKE THIS
            logger.info("Amount: " + result.getAllInterfaces().size());

            // Listeners
            for(Class<Listener> listenerClass : result.getClassesImplementing(Listener.class.getName()).loadClasses(Listener.class)) {
                getServer().getPluginManager().registerEvents(listenerClass.getDeclaredConstructor().newInstance(), this);
            }

            // Items object filling
            for(Class<Craft> itemCraft : result.getSubclasses(Craft.class.getName()).loadClasses(Craft.class)) {
                Craft item = itemCraft.getDeclaredConstructor().newInstance();

                // Weird edge case for when ShapelessCraft is counted as one of them????
                if (item.namespaceName == null) continue;

                Items.items.put(item.namespaceName, item.item);
            }

            // Shapeless Crafts
            for(Class<ShapelessCraft> shapelessCraftClass : result.getSubclasses(ShapelessCraft.class.getName()).loadClasses(ShapelessCraft.class)) {
                ShapelessCraft recipeInfo = shapelessCraftClass.getDeclaredConstructor().newInstance();

                ShapelessRecipe recipe = new ShapelessRecipe(new NamespacedKey(Primio.pluginNamespace, recipeInfo.namespaceName), recipeInfo.item);

                for (ItemStack item : recipeInfo.recipeIngredients) {
                    // TODO: Eventually add multi item support via RecipeChoices
                    recipe.addIngredient(new RecipeChoice.ExactChoice(item));
                }

                Items.items.put(recipeInfo.namespaceName, recipeInfo.item);

                getServer().addRecipe(recipe);

                Primio.craftNamespaces.add(recipeInfo.namespaceName);
            }

            // Shaped Crafts
            for(Class<ShapedCraft> shapedCraftClass : result.getSubclasses(ShapedCraft.class.getName()).loadClasses(ShapedCraft.class)) {
                ShapedCraft recipeInfo = shapedCraftClass.getDeclaredConstructor().newInstance();

                ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(Primio.pluginNamespace, recipeInfo.namespaceName), recipeInfo.item);

                recipe.shape(recipeInfo.recipeShape);

                for (KeyedItem item : recipeInfo.recipeIngredients) {
                    if (item.item != null) {
                        recipe.setIngredient(item.letter, item.item);
                    } else {
                        recipe.setIngredient(item.letter, item.choice);
                    }
                }

                Items.items.put(recipeInfo.namespaceName, recipeInfo.item);

                getServer().addRecipe(recipe);
                Primio.craftNamespaces.add(recipeInfo.namespaceName);
            }

            // Smelt Crafts
            // TODO: Make this work (prob via smelt listener)
//            for (Class<SmeltCraft> smeltCraftClass : result.getClassesImplementing(SmeltCraft.class.getName()).loadClasses(SmeltCraft.class)) {
//                SmeltCraft recipeInfo = smeltCraftClass.getDeclaredConstructor().newInstance();
//
//                FurnaceRecipe recipe = new FurnaceRecipe(new NamespacedKey(this.pluginNamespace, recipeInfo.namespaceName), recipeInfo.item, recipeInfo.inputItem);
//            }

        } catch (Exception e) {
            this.logger.throwing("Primio", "loadListeners", e);
        }

        for (Player player : getServer().getOnlinePlayers()) {
            for (String keyStr : Primio.craftNamespaces) {
                NamespacedKey key = new NamespacedKey(Primio.pluginNamespace, keyStr);

                player.discoverRecipe(key);
            }
        }

        getServer().updateRecipes();

        usedCommands.add(new Item(
                "primio",
                "Give an Ex Nihilo: Primio item",
                "/item <item>",
                new ArrayList<>(Arrays.asList("primioitem", "item", "i", "pi"))
        ));

        for (Command command : usedCommands) {
            getServer().getCommandMap().register(command.getName(), command);
        }
    }

    @SuppressWarnings("unchecked")

    private void unregisterCommands(String... commands) {
        try {
            Field knownCommandsField = SimpleCommandMap.class.getDeclaredField("knownCommands");
            knownCommandsField.setAccessible(true);
            Map<String, Command> knownCommands = ((Map<String, Command>) knownCommandsField.get(getServer().getCommandMap()));
            for (String commandName : commands) {
                Command command = getServer().getCommandMap().getCommand(commandName);
                assert command != null;
                for (String alias : command.getAliases())
                    knownCommands.remove(alias);
                knownCommands.remove(command.getName());
                command.unregister(getServer().getCommandMap());
            }
            knownCommandsField.setAccessible(false);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
