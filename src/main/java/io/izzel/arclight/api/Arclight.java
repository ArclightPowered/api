package io.izzel.arclight.api;

import net.minecraftforge.eventbus.api.IEventBus;
import org.bukkit.plugin.Plugin;

public class Arclight {

    /**
     * Version info for current Arclight
     */
    public static ArclightVersion getVersion() {
        return ArclightVersion.current();
    }

    /**
     * @see IEventBus#register(Object)
     *
     * @param target Either a {@link Class} instance or an arbitrary object
     */
    public static void registerForgeEvent(Plugin plugin, IEventBus eventBus, Object target) {
        throw new IllegalStateException();
    }
}
