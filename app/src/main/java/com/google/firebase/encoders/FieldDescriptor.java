package com.google.firebase.encoders;

import java.lang.annotation.Annotation;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class FieldDescriptor {
    private final String name;
    private final Map<Class<?>, Object> properties;

    public static final class Builder {
        private final String name;
        private Map<Class<?>, Object> properties;

        Builder(String str) {
        }

        public FieldDescriptor build() {
        }

        public <T extends Annotation> Builder withProperty(T t) {
        }
    }

    /* synthetic */ FieldDescriptor(String str, Map map, C11481 c11481) {
    }

    public static Builder builder(String str) {
    }

    public static FieldDescriptor of(String str) {
    }

    public boolean equals(Object obj) {
    }

    public String getName() {
    }

    public <T extends Annotation> T getProperty(Class<T> cls) {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    private FieldDescriptor(String str, Map<Class<?>, Object> map) {
    }
}
