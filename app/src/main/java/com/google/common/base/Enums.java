package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Map;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Enums {

    @GwtIncompatible
    private static final Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> enumConstantCache = null;

    private static final class StringConverter<T extends Enum<T>> extends Converter<String, T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Class<T> enumClass;

        StringConverter(Class<T> cls) {
        }

        @Override // com.google.common.base.Converter
        protected /* bridge */ /* synthetic */ String doBackward(Object obj) {
        }

        @Override // com.google.common.base.Converter
        protected /* bridge */ /* synthetic */ Object doForward(String str) {
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        protected String doBackward(T t) {
        }

        /* renamed from: doForward, reason: avoid collision after fix types in other method */
        protected T doForward2(String str) {
        }
    }

    private Enums() {
    }

    @GwtIncompatible
    static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> getEnumConstants(Class<T> cls) {
    }

    @GwtIncompatible
    public static Field getField(Enum<?> r1) {
    }

    public static <T extends Enum<T>> Optional<T> getIfPresent(Class<T> cls, String str) {
    }

    @GwtIncompatible
    private static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> populateCache(Class<T> cls) {
    }

    public static <T extends Enum<T>> Converter<String, T> stringConverter(Class<T> cls) {
    }
}
