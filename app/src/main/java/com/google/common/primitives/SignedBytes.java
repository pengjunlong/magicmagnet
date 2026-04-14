package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class SignedBytes {
    public static final byte MAX_POWER_OF_TWO = 64;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static final class LexicographicalComparator implements Comparator<byte[]> {
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
        public /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
        }

        @Override // java.lang.Enum
        public String toString() {
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(byte[] bArr, byte[] bArr2) {
        }
    }

    private SignedBytes() {
    }

    public static byte checkedCast(long j) {
    }

    public static int compare(byte b, byte b2) {
    }

    public static String join(String str, byte... bArr) {
    }

    public static Comparator<byte[]> lexicographicalComparator() {
    }

    public static byte max(byte... bArr) {
    }

    public static byte min(byte... bArr) {
    }

    public static byte saturatedCast(long j) {
    }

    public static void sortDescending(byte[] bArr) {
    }

    public static void sortDescending(byte[] bArr, int i, int i2) {
    }
}
