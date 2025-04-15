package com.uncraftbar.easyautocycler;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class Keybindings {

    public static final String KEY_CATEGORY_AUTO_TRADER = "key.category.easyautocycler";
    public static final String KEY_TOGGLE_AUTO_TRADE = "key.easyautocycler.toggle_auto_trade";
    public static final String KEY_OPEN_CONFIG = "key.easyautocycler.open_config";

    public static KeyMapping toggleAutoTradeKey;
    public static KeyMapping openConfigKey;

    public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
        toggleAutoTradeKey = new KeyMapping(
                KEY_TOGGLE_AUTO_TRADE,
                KeyConflictContext.GUI, // Use Forge context
                InputConstants.Type.KEYSYM,
                GLFW.GLFW_KEY_R, // Your chosen key
                KEY_CATEGORY_AUTO_TRADER
        );
        event.register(toggleAutoTradeKey);

        openConfigKey = new KeyMapping(
                KEY_OPEN_CONFIG,
                KeyConflictContext.IN_GAME, // Use Forge context
                InputConstants.Type.KEYSYM,
                GLFW.GLFW_KEY_C, // Your chosen key
                KEY_CATEGORY_AUTO_TRADER
        );
        event.register(openConfigKey);

        EasyAutoCyclerMod.LOGGER.info("Registered key mappings");
    }
}