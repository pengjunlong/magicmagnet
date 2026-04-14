package com.google.android.exoplayer2.util;

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class Assertions {
    private Assertions() {
    }

    @Pure
    public static void checkArgument(boolean z) {
    }

    @Pure
    public static int checkIndex(int i, int i2, int i3) {
    }

    @Pure
    public static void checkMainThread() {
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static String checkNotEmpty(String str) {
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T checkNotNull(T t) {
    }

    @Pure
    public static void checkState(boolean z) {
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T checkStateNotNull(T t) {
    }

    @Pure
    public static void checkArgument(boolean z, Object obj) {
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T checkNotNull(T t, Object obj) {
    }

    @Pure
    public static void checkState(boolean z, Object obj) {
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T checkStateNotNull(T t, Object obj) {
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static String checkNotEmpty(String str, Object obj) {
    }
}
