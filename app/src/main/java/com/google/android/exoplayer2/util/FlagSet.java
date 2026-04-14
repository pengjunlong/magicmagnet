package com.google.android.exoplayer2.util;

import android.util.SparseBooleanArray;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class FlagSet {
    private final SparseBooleanArray flags;

    /* synthetic */ FlagSet(SparseBooleanArray sparseBooleanArray, C02331 c02331) {
    }

    public boolean contains(int i) {
    }

    public boolean containsAny(int... iArr) {
    }

    public boolean equals(Object obj) {
    }

    public int get(int i) {
    }

    public int hashCode() {
    }

    public int size() {
    }

    public static final class Builder {
        private boolean buildCalled;
        private final SparseBooleanArray flags;

        @CanIgnoreReturnValue
        public Builder add(int i) {
        }

        @CanIgnoreReturnValue
        public Builder addAll(int... iArr) {
        }

        @CanIgnoreReturnValue
        public Builder addIf(int i, boolean z) {
        }

        public FlagSet build() {
        }

        @CanIgnoreReturnValue
        public Builder remove(int i) {
        }

        @CanIgnoreReturnValue
        public Builder removeAll(int... iArr) {
        }

        @CanIgnoreReturnValue
        public Builder removeIf(int i, boolean z) {
        }

        @CanIgnoreReturnValue
        public Builder addAll(FlagSet flagSet) {
        }
    }

    private FlagSet(SparseBooleanArray sparseBooleanArray) {
    }
}
