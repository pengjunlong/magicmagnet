package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.Immutable;
import java.util.Comparator;
import java.util.Map;

@Immutable
@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class ElementOrder<T> {
    private final Comparator<T> comparator;
    private final Type type;

    /* renamed from: com.google.common.graph.ElementOrder$1 */
    static /* synthetic */ class C08871 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$graph$ElementOrder$Type = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES = null;
        public static final Type INSERTION = null;
        public static final Type SORTED = null;
        public static final Type STABLE = null;
        public static final Type UNORDERED = null;

        private static /* synthetic */ Type[] $values() {
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
        }

        public static Type[] values() {
        }
    }

    private ElementOrder(Type type, Comparator<T> comparator) {
    }

    public static <S> ElementOrder<S> insertion() {
    }

    public static <S extends Comparable<? super S>> ElementOrder<S> natural() {
    }

    public static <S> ElementOrder<S> sorted(Comparator<S> comparator) {
    }

    public static <S> ElementOrder<S> stable() {
    }

    public static <S> ElementOrder<S> unordered() {
    }

    <T1 extends T> ElementOrder<T1> cast() {
    }

    public Comparator<T> comparator() {
    }

    <K extends T, V> Map<K, V> createMap(int i) {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    public Type type() {
    }
}
