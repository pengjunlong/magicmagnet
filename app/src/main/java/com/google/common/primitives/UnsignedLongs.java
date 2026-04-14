package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
@Beta
@GwtCompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class UnsignedLongs {
    public static final long MAX_VALUE = -1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    static final class LexicographicalComparator implements Comparator<long[]> {
        private static final /* synthetic */ LexicographicalComparator[] $VALUES = null;
        public static final LexicographicalComparator INSTANCE = null;

        private static /* synthetic */ LexicographicalComparator[] $values() {
        }

        private LexicographicalComparator(String str, int i) {
        }

        public static LexicographicalComparator valueOf(String str) {
        }

        public static LexicographicalComparator[] values() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(long[] jArr, long[] jArr2) {
        }

        @Override // java.lang.Enum
        public String toString() {
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(long[] jArr, long[] jArr2) {
        }
    }

    private static final class ParseOverflowDetection {
        static final int[] maxSafeDigits = null;
        static final long[] maxValueDivs = null;
        static final int[] maxValueMods = null;

        private ParseOverflowDetection() {
        }

        static boolean overflowInParse(long j, int i, int i2) {
        }
    }

    private UnsignedLongs() {
    }

    public static int compare(long j, long j2) {
    }

    @CanIgnoreReturnValue
    public static long decode(String str) {
    }

    public static long divide(long j, long j2) {
    }

    private static long flip(long j) {
    }

    public static String join(String str, long... jArr) {
    }

    public static Comparator<long[]> lexicographicalComparator() {
    }

    public static long max(long... jArr) {
    }

    public static long min(long... jArr) {
    }

    @CanIgnoreReturnValue
    public static long parseUnsignedLong(String str) {
    }

    public static long remainder(long j, long j2) {
    }

    public static void sort(long[] jArr) {
    }

    public static void sortDescending(long[] jArr) {
    }

    public static String toString(long j) {
    }

    @CanIgnoreReturnValue
    public static long parseUnsignedLong(String str, int i) {
    }

    public static String toString(long j, int i) {
    }

    public static void sort(long[] jArr, int i, int i2) {
    }

    public static void sortDescending(long[] jArr, int i, int i2) {
    }
}
