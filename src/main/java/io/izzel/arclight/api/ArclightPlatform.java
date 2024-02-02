package io.izzel.arclight.api;

/**
 * Platforms where Arclight supports
 */
public enum ArclightPlatform {
    VANILLA,
    FORGE,
    NEOFORGE;

    private static ArclightPlatform platform;

    public static void setPlatform(ArclightPlatform platform) {
        if (ArclightPlatform.platform != null) throw new IllegalStateException("Platform is already set!");
        if (platform == null) throw new IllegalArgumentException("Platform cannot be null!");
        ArclightPlatform.platform = platform;
    }

    public static ArclightPlatform current() {
        if (ArclightPlatform.platform == null) throw new IllegalStateException("Version is not set!");
        return platform;
    }
}
