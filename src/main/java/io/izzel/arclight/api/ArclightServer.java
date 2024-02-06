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
     * @deprecated Use {@link ArclightServer#registerModEvent(Plugin, Object, Object)} instead.
     */
    @Deprecated
    void registerForgeEvent(Plugin plugin, IEventBus eventBus, Object target);

    /**
     * @see Arclight#registerModEvent(Plugin, Object, Object)
     * @since 1.6.2
     */
    void registerModEvent(Plugin plugin, Object eventBus, Object target);

    /**
     * @return ticking tracker
     * @see Arclight#getTickingTracker()
     */
    TickingTracker getTickingTracker();
}
