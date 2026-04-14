package com.google.firebase.components;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Dependency {
    private final Class<?> anInterface;
    private final int injection;
    private final int type;

    private Dependency(Class<?> cls, int i, int i2) {
    }

    public static Dependency deferred(Class<?> cls) {
    }

    private static String describeInjection(int i) {
    }

    @Deprecated
    public static Dependency optional(Class<?> cls) {
    }

    public static Dependency optionalProvider(Class<?> cls) {
    }

    public static Dependency required(Class<?> cls) {
    }

    public static Dependency requiredProvider(Class<?> cls) {
    }

    public static Dependency setOf(Class<?> cls) {
    }

    public static Dependency setOfProvider(Class<?> cls) {
    }

    public boolean equals(Object obj) {
    }

    public Class<?> getInterface() {
    }

    public int hashCode() {
    }

    public boolean isDeferred() {
    }

    public boolean isDirectInjection() {
    }

    public boolean isRequired() {
    }

    public boolean isSet() {
    }

    public String toString() {
    }
}
