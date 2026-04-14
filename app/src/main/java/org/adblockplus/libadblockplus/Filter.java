package org.adblockplus.libadblockplus;

import java.lang.ref.WeakReference;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class Filter {
    private WeakReference<FilterEngine> filterEngine;
    private final String raw;
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES = null;
        public static final Type BLOCKING = null;
        public static final Type COMMENT = null;
        public static final Type ELEMHIDE = null;
        public static final Type ELEMHIDE_EMULATION = null;
        public static final Type ELEMHIDE_EXCEPTION = null;
        public static final Type EXCEPTION = null;
        public static final Type INVALID = null;

        private static /* synthetic */ Type[] $values() {
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
        }

        public static Type[] values() {
        }
    }

    private Filter(Type type, String str) {
    }

    @Deprecated
    public void addToList() {
    }

    public boolean equals(Object obj) {
    }

    public String getRaw() {
    }

    public Type getType() {
    }

    @Deprecated
    public boolean isListed() {
    }

    @Deprecated
    public void removeFromList() {
    }

    void setFilterEngine(FilterEngine filterEngine) {
    }
}
