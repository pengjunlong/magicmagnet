package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.security.PrivilegedExceptionAction;
import java.util.Comparator;
import sun.misc.Unsafe;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class UnsignedBytes {
    public static final byte MAX_POWER_OF_TWO = Byte.MIN_VALUE;
    public static final byte MAX_VALUE = -1;
    private static final int UNSIGNED_MASK = 255;

    @VisibleForTesting
    static class LexicographicalComparatorHolder {
        static final Comparator<byte[]> BEST_COMPARATOR = null;
        static final String UNSAFE_COMPARATOR_NAME = null;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unexpected branching in enum static init block */
        static final class PureJavaComparator implements Comparator<byte[]> {
            private static final /* synthetic */ PureJavaComparator[] $VALUES = null;
            public static final PureJavaComparator INSTANCE = null;

            private static /* synthetic */ PureJavaComparator[] $values() {
            }

            private PureJavaComparator(String str, int i) {
            }

            public static PureJavaComparator valueOf(String str) {
            }

            public static PureJavaComparator[] values() {
            }

            @Override // java.util.Comparator
            public /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
            }

            @Override // java.lang.Enum
            public String toString() {
            }

            /* renamed from: compare, reason: avoid collision after fix types in other method */
            public int compare2(byte[] bArr, byte[] bArr2) {
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unexpected branching in enum static init block */
        @VisibleForTesting
        static final class UnsafeComparator implements Comparator<byte[]> {
            private static final /* synthetic */ UnsafeComparator[] $VALUES = null;
            static final boolean BIG_ENDIAN = false;
            static final int BYTE_ARRAY_BASE_OFFSET = 0;
            public static final UnsafeComparator INSTANCE = null;
            static final Unsafe theUnsafe = null;

            /* renamed from: com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator$1 */
            class C09621 implements PrivilegedExceptionAction<Unsafe> {
                C09621() {
                }

                @Override // java.security.PrivilegedExceptionAction
                public /* bridge */ /* synthetic */ Unsafe run() throws Exception {
                }

                @Override // java.security.PrivilegedExceptionAction
                /* renamed from: run, reason: avoid collision after fix types in other method */
                public Unsafe run2() throws Exception {
                }
            }

            private static /* synthetic */ UnsafeComparator[] $values() {
            }

            private UnsafeComparator(String str, int i) {
            }

            private static Unsafe getUnsafe() {
            }

            public static UnsafeComparator valueOf(String str) {
            }

            public static UnsafeComparator[] values() {
            }

            @Override // java.util.Comparator
            public /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
            }

            @Override // java.lang.Enum
            public String toString() {
            }

            /* renamed from: compare, reason: avoid collision after fix types in other method */
            public int compare2(byte[] bArr, byte[] bArr2) {
            }
        }

        LexicographicalComparatorHolder() {
        }

        static Comparator<byte[]> getBestComparator() {
        }
    }

    private UnsignedBytes() {
    }

    @CanIgnoreReturnValue
    public static byte checkedCast(long j) {
    }

    public static int compare(byte b, byte b2) {
    }

    private static byte flip(byte b) {
    }

    public static String join(String str, byte... bArr) {
    }

    public static Comparator<byte[]> lexicographicalComparator() {
    }

    @VisibleForTesting
    static Comparator<byte[]> lexicographicalComparatorJavaImpl() {
    }

    public static byte max(byte... bArr) {
    }

    public static byte min(byte... bArr) {
    }

    @CanIgnoreReturnValue
    @Beta
    public static byte parseUnsignedByte(String str) {
    }

    public static byte saturatedCast(long j) {
    }

    public static void sort(byte[] bArr) {
    }

    public static void sortDescending(byte[] bArr) {
    }

    public static int toInt(byte b) {
    }

    @Beta
    public static String toString(byte b) {
    }

    @CanIgnoreReturnValue
    @Beta
    public static byte parseUnsignedByte(String str, int i) {
    }

    @Beta
    public static String toString(byte b, int i) {
    }

    public static void sort(byte[] bArr, int i, int i2) {
    }

    public static void sortDescending(byte[] bArr, int i, int i2) {
    }
}
