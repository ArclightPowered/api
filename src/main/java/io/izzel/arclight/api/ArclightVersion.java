package io.izzel.arclight.api;

import java.util.Objects;

public class ArclightVersion {

    public static final ArclightVersion v1_14 = new ArclightVersion("1.14.4", 1140, "v1_14_R1");
    public static final ArclightVersion v1_15 = new ArclightVersion("1.15.2", 1152, "v1_15_R1");
    public static final ArclightVersion v1_16 = new ArclightVersion("1.16.3", 1163, "v1_16_R2");
    public static final ArclightVersion v1_16_4 = new ArclightVersion("1.16.4", 1164, "v1_16_R3");
    public static final ArclightVersion v1_17_R1 = new ArclightVersion("1.17", 1170, "v1_17_R1");
    public static final ArclightVersion v1_18_R1 = new ArclightVersion("1.18", 1180, "v1_18_R1");
    public static final ArclightVersion v1_18_R2 = new ArclightVersion("1.18.2", 1182, "v1_18_R2");
    public static final ArclightVersion v1_19_R1 = new ArclightVersion("1.19.1", 1191, "v1_19_R1", "Horn");
    public static final ArclightVersion HORN = v1_19_R1;
    public static final ArclightVersion GREAT_HORN = new ArclightVersion("1.19.3", 1193, "v1_19_R2", "GreatHorn");
    public static final ArclightVersion EXECUTIONS = new ArclightVersion("1.19.4", 1194, "v1_19_R3", "Executions");
    public static final ArclightVersion TRIALS = new ArclightVersion("1.20", 1200, "v1_20_R1", "Trials");
    public static final ArclightVersion NET = new ArclightVersion("1.20.2", 1202, "v1_20_R2", "Net");
    public static final ArclightVersion WHISPER = new ArclightVersion("1.20.4", 1204, "v1_20_R3", "Whisper");

    private final String name;
    private final int num;
    private final String pkg;
    private final String releaseName;

    public ArclightVersion(String name, int num, String pkg) {
        this(name, num, pkg, null);
    }

    public ArclightVersion(String name, int num, String pkg, String releaseName) {
        this.name = name;
        this.num = num;
        this.pkg = pkg;
        this.releaseName = releaseName;
    }

    public String getName() {
        return name;
    }

    public String packageName() {
        return pkg;
    }

    public String getReleaseName() {
        return releaseName;
    }

    @Override
    public String toString() {
        return "ArclightVersion{" +
            "name='" + name + '\'' +
            ", num=" + num +
            ", releaseName='" + releaseName + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArclightVersion that = (ArclightVersion) o;
        return num == that.num &&
            Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, num);
    }

    private static ArclightVersion version;

    public static ArclightVersion current() {
        if (ArclightVersion.version == null) throw new IllegalStateException("Version is not set!");
        return version;
    }

    public static void setVersion(ArclightVersion version) {
        if (ArclightVersion.version != null) throw new IllegalStateException("Version is already set!");
        if (version == null) throw new IllegalArgumentException("Version cannot be null!");
        ArclightVersion.version = version;
    }

    public static boolean atLeast(ArclightVersion v) {
        return v.num <= version.num;
    }

    public static boolean lesserThan(ArclightVersion v) {
        return v.num > version.num;
    }
}
