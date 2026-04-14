package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class MoreObjects {

    public static final class ToStringHelper {
        private final String className;
        private final ValueHolder holderHead;
        private ValueHolder holderTail;
        private boolean omitEmptyValues;
        private boolean omitNullValues;

        private static final class UnconditionalValueHolder extends ValueHolder {
            private UnconditionalValueHolder() {
            }

            /* synthetic */ UnconditionalValueHolder(C06171 c06171) {
            }
        }

        private static class ValueHolder {
            String name;
            ValueHolder next;
            Object value;

            private ValueHolder() {
            }

            /* synthetic */ ValueHolder(C06171 c06171) {
            }
        }

        /* synthetic */ ToStringHelper(String str, C06171 c06171) {
        }

        private ValueHolder addHolder() {
        }

        private UnconditionalValueHolder addUnconditionalHolder() {
        }

        private static boolean isEmpty(Object obj) {
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, Object obj) {
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(Object obj) {
        }

        @CanIgnoreReturnValue
        public ToStringHelper omitNullValues() {
        }

        public String toString() {
        }

        private ToStringHelper(String str) {
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, boolean z) {
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(boolean z) {
        }

        private ToStringHelper addHolder(Object obj) {
        }

        private ToStringHelper addUnconditionalHolder(Object obj) {
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, char c) {
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(char c) {
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, double d) {
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(double d) {
        }

        private ToStringHelper addHolder(String str, Object obj) {
        }

        private ToStringHelper addUnconditionalHolder(String str, Object obj) {
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, float f) {
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(float f) {
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, int i) {
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(int i) {
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, long j) {
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(long j) {
        }
    }

    private MoreObjects() {
    }

    public static <T> T firstNonNull(T t, T t2) {
    }

    public static ToStringHelper toStringHelper(Object obj) {
    }

    public static ToStringHelper toStringHelper(Class<?> cls) {
    }

    public static ToStringHelper toStringHelper(String str) {
    }
}
