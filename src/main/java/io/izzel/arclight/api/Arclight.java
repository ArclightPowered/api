package io.izzel.arclight.api;

import net.minecraftforge.eventbus.api.IEventBus;
import org.bukkit.plugin.Plugin;

import java.util.Objects;

public class Arclight {

    private static ArclightServer server;

    /**
     * Version info for current Arclight
     */
    public static ArclightVersion getVersion() {
        return getServer().getVersion();
    }

    /**
     * @param target Either a {@link Class} instance or an arbitrary object
     * @see IEventBus#register(Object)
     */
    public static void registerForgeEvent(Plugin plugin, IEventBus eventBus, Object target) {
        getServer().registerForgeEvent(plugin, eventBus, target);
    }

    /**
     * Gets the {@link TickingTracker} instance.
     *
     * @return the ticking tracker
     * @since 1.4.0
     */
    public static TickingTracker getTickingTracker() {
        return getServer().getTickingTracker();
    }

    /**
     * Get current platform Arclight is running
     *
     * @return current platform
     * @since 1.6.0
     */
    public static ArclightPlatform getPlatform() {
        return ArclightPlatform.current();
    }

    private static ArclightServer getServer() {
        return Objects.requireNonNull(server, "Server not set!");
    }

    /**
     * Internal api for Arclight
     */
    public static void setServer(ArclightServer server) {
        Objects.requireNonNull(server, "server");
        if (Arclight.server != null) {
            throw new IllegalStateException("Server already set!");
        }
        Arclight.server = server;
    }
}
