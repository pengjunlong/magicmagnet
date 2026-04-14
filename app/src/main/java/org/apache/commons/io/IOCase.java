package org.apache.commons.io;

import java.io.Serializable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class IOCase implements Serializable {
    public static final IOCase INSENSITIVE = null;
    public static final IOCase SENSITIVE = null;
    public static final IOCase SYSTEM = null;
    private static final long serialVersionUID = -6343169151696340687L;
    private final String name;
    private final transient boolean sensitive;

    private IOCase(String str, boolean z) {
    }

    public static IOCase forName(String str) {
    }

    private Object readResolve() {
    }

    public int checkCompareTo(String str, String str2) {
    }

    public boolean checkEndsWith(String str, String str2) {
    }

    public boolean checkEquals(String str, String str2) {
    }

    public int checkIndexOf(String str, int i, String str2) {
    }

    public boolean checkRegionMatches(String str, int i, String str2) {
    }

    public boolean checkStartsWith(String str, String str2) {
    }

    public String getName() {
    }

    public boolean isCaseSensitive() {
    }

    public String toString() {
    }
}
