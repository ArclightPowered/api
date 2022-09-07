package io.izzel.arclight.api;

import org.bukkit.block.Block;
import org.bukkit.block.TileState;
import org.bukkit.entity.Entity;

import javax.annotation.Nullable;

/**
 * Provides an interface for ticking source access.
 *
 * @since 1.4.0
 */
public interface TickingTracker {

    /**
     * Gets the currently ticking entity.
     *
     * @return currently ticking entity if available
     */
    @Nullable
    Entity getTickingEntity();

    /**
     * Gets the currently ticking(scheduled or random) block.
     *
     * @return currently ticking block if available
     */
    @Nullable
    Block getTickingBlock();

    /**
     * Gets the currently ticking block entity.
     *
     * @return currently ticking block entity if available
     */
    @Nullable
    TileState getTickingBlockEntity();
}
