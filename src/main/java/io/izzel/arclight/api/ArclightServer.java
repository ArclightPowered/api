package io.izzel.arclight.api;

import net.minecraftforge.eventbus.api.IEventBus;
import org.bukkit.plugin.Plugin;

public interface ArclightServer {

    /**
     * @see Arclight#getVersion()
     */
    default ArclightVersion getVersion() {
        return ArclightVersion.current();
    }

    /**
     * @see Arclight#registerForgeEvent(Plugin, IEventBus, Object)
     */
    void registerForgeEvent(Plugin plugin, IEventBus eventBus, Object target);

    /**
     * @return ticking tracker
     * @see Arclight#getTickingTracker()
     */
    TickingTracker getTickingTracker();

    /**
     * @return current platform
     * @see Arclight#getPlatform()
     */
    ArclightPlatform getPlatform();
}
