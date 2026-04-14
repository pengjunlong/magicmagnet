package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Converter;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Longs {
    public static final int BYTES = 8;
    public static final long MAX_POWER_OF_TWO = 4611686018427387904L;

    static final class AsciiDigits {
        private static final byte[] asciiDigits = null;

        private AsciiDigits() {
        }

        static int digit(char c) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static final class LexicographicalComparator implements Comparator<long[]> {
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

    @GwtCompatible
    private static class LongArrayAsList extends AbstractList<Long> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final long[] array;
        final int end;
        final int start;

        LongArrayAsList(long[] jArr) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i, int i2) {
        }

        long[] toLongArray() {
        }

        @Override // java.util.AbstractCollection
        public String toString() {
        }

        LongArrayAsList(long[] jArr, int i, int i2) {
        }

        @Override // java.util.AbstractList, java.util.List
        public Long get(int i) {
        }

        public Long set(int i, Long l) {
        }
    }

    private static final class LongConverter extends Converter<String, Long> implements Serializable {
        static final LongConverter INSTANCE = null;
        private static final long serialVersionUID = 1;

        private LongConverter() {
        }

        private Object readResolve() {
        }

        @Override // com.google.common.base.Converter
        protected /* bridge */ /* synthetic */ String doBackward(Long l) {
        }

        @Override // com.google.common.base.Converter
        protected /* bridge */ /* synthetic */ Long doForward(String str) {
        }

        public String toString() {
        }

        /* renamed from: doBackward, reason: avoid collision after fix types in other method */
        protected String doBackward2(Long l) {
        }

        /* renamed from: doForward, reason: avoid collision after fix types in other method */
        protected Long doForward2(String str) {
        }
    }

    private Longs() {
    }

    static /* synthetic */ int access$000(long[] jArr, long j, int i, int i2) {
    }

    static /* synthetic */ int access$100(long[] jArr, long j, int i, int i2) {
    }

    public static List<Long> asList(long... jArr) {
    }

    public static int compare(long j, long j2) {
    }

    public static long[] concat(long[]... jArr) {
    }

    @Beta
    public static long constrainToRange(long j, long j2, long j3) {
    }

    public static boolean contains(long[] jArr, long j) {
    }

    public static long[] ensureCapacity(long[] jArr, int i, int i2) {
    }

    public static long fromByteArray(byte[] bArr) {
    }

    public static long fromBytes(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
    }

    public static int hashCode(long j) {
    }

    public static int indexOf(long[] jArr, long j) {
    }

    public static String join(String str, long... jArr) {
    }

    public static int lastIndexOf(long[] jArr, long j) {
    }

    public static Comparator<long[]> lexicographicalComparator() {
    }

    public static long max(long... jArr) {
    }

    public static long min(long... jArr) {
    }

    public static void reverse(long[] jArr) {
    }

    public static void sortDescending(long[] jArr) {
    }

    @Beta
    public static Converter<String, Long> stringConverter() {
    }

    public static long[] toArray(Collection<? extends Number> collection) {
    }

    public static byte[] toByteArray(long j) {
    }

    @Beta
    public static Long tryParse(String str) {
    }

    private static int indexOf(long[] jArr, long j, int i, int i2) {
    }

    private static int lastIndexOf(long[] jArr, long j, int i, int i2) {
    }

    @Beta
    public static Long tryParse(String str, int i) {
    }

    public static int indexOf(long[] jArr, long[] jArr2) {
    }

    public static void reverse(long[] jArr, int i, int i2) {
    }

    public static void sortDescending(long[] jArr, int i, int i2) {
    }
}
