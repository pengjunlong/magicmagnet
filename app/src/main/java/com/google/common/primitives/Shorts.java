package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Converter;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Shorts extends ShortsMethodsForWeb {
    public static final int BYTES = 2;
    public static final short MAX_POWER_OF_TWO = 16384;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static final class LexicographicalComparator implements Comparator<short[]> {
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
        public /* bridge */ /* synthetic */ int compare(short[] sArr, short[] sArr2) {
        }

        @Override // java.lang.Enum
        public String toString() {
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(short[] sArr, short[] sArr2) {
        }
    }

    @GwtCompatible
    private static class ShortArrayAsList extends AbstractList<Short> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final short[] array;
        final int end;
        final int start;

        ShortArrayAsList(short[] sArr) {
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
        public List<Short> subList(int i, int i2) {
        }

        short[] toShortArray() {
        }

        @Override // java.util.AbstractCollection
        public String toString() {
        }

        ShortArrayAsList(short[] sArr, int i, int i2) {
        }

        @Override // java.util.AbstractList, java.util.List
        public Short get(int i) {
        }

        public Short set(int i, Short sh) {
        }
    }

    private static final class ShortConverter extends Converter<String, Short> implements Serializable {
        static final ShortConverter INSTANCE = null;
        private static final long serialVersionUID = 1;

        private ShortConverter() {
        }

        private Object readResolve() {
        }

        @Override // com.google.common.base.Converter
        protected /* bridge */ /* synthetic */ String doBackward(Short sh) {
        }

        @Override // com.google.common.base.Converter
        protected /* bridge */ /* synthetic */ Short doForward(String str) {
        }

        public String toString() {
        }

        /* renamed from: doBackward, reason: avoid collision after fix types in other method */
        protected String doBackward2(Short sh) {
        }

        /* renamed from: doForward, reason: avoid collision after fix types in other method */
        protected Short doForward2(String str) {
        }
    }

    private Shorts() {
    }

    static /* synthetic */ int access$000(short[] sArr, short s, int i, int i2) {
    }

    static /* synthetic */ int access$100(short[] sArr, short s, int i, int i2) {
    }

    public static List<Short> asList(short... sArr) {
    }

    public static short checkedCast(long j) {
    }

    public static int compare(short s, short s2) {
    }

    public static short[] concat(short[]... sArr) {
    }

    @Beta
    public static short constrainToRange(short s, short s2, short s3) {
    }

    public static boolean contains(short[] sArr, short s) {
    }

    public static short[] ensureCapacity(short[] sArr, int i, int i2) {
    }

    @GwtIncompatible
    public static short fromByteArray(byte[] bArr) {
    }

    @GwtIncompatible
    public static short fromBytes(byte b, byte b2) {
    }

    public static int hashCode(short s) {
    }

    public static int indexOf(short[] sArr, short s) {
    }

    public static String join(String str, short... sArr) {
    }

    public static int lastIndexOf(short[] sArr, short s) {
    }

    public static Comparator<short[]> lexicographicalComparator() {
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static short max(short... sArr) {
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static short min(short... sArr) {
    }

    public static void reverse(short[] sArr) {
    }

    public static short saturatedCast(long j) {
    }

    public static void sortDescending(short[] sArr) {
    }

    @Beta
    public static Converter<String, Short> stringConverter() {
    }

    public static short[] toArray(Collection<? extends Number> collection) {
    }

    @GwtIncompatible
    public static byte[] toByteArray(short s) {
    }

    private static int indexOf(short[] sArr, short s, int i, int i2) {
    }

    private static int lastIndexOf(short[] sArr, short s, int i, int i2) {
    }

    public static int indexOf(short[] sArr, short[] sArr2) {
    }

    public static void reverse(short[] sArr, int i, int i2) {
    }

    public static void sortDescending(short[] sArr, int i, int i2) {
    }
}
