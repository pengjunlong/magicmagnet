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
public final class Ints extends IntsMethodsForWeb {
    public static final int BYTES = 4;
    public static final int MAX_POWER_OF_TWO = 1073741824;

    @GwtCompatible
    private static class IntArrayAsList extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final int[] array;
        final int end;
        final int start;

        IntArrayAsList(int[] iArr) {
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
        public List<Integer> subList(int i, int i2) {
        }

        int[] toIntArray() {
        }

        @Override // java.util.AbstractCollection
        public String toString() {
        }

        IntArrayAsList(int[] iArr, int i, int i2) {
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer get(int i) {
        }

        public Integer set(int i, Integer num) {
        }
    }

    private static final class IntConverter extends Converter<String, Integer> implements Serializable {
        static final IntConverter INSTANCE = null;
        private static final long serialVersionUID = 1;

        private IntConverter() {
        }

        private Object readResolve() {
        }

        @Override // com.google.common.base.Converter
        protected /* bridge */ /* synthetic */ String doBackward(Integer num) {
        }

        @Override // com.google.common.base.Converter
        protected /* bridge */ /* synthetic */ Integer doForward(String str) {
        }

        public String toString() {
        }

        /* renamed from: doBackward, reason: avoid collision after fix types in other method */
        protected String doBackward2(Integer num) {
        }

        /* renamed from: doForward, reason: avoid collision after fix types in other method */
        protected Integer doForward2(String str) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static final class LexicographicalComparator implements Comparator<int[]> {
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
        public /* bridge */ /* synthetic */ int compare(int[] iArr, int[] iArr2) {
        }

        @Override // java.lang.Enum
        public String toString() {
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(int[] iArr, int[] iArr2) {
        }
    }

    private Ints() {
    }

    static /* synthetic */ int access$000(int[] iArr, int i, int i2, int i3) {
    }

    static /* synthetic */ int access$100(int[] iArr, int i, int i2, int i3) {
    }

    public static List<Integer> asList(int... iArr) {
    }

    public static int checkedCast(long j) {
    }

    public static int compare(int i, int i2) {
    }

    public static int[] concat(int[]... iArr) {
    }

    @Beta
    public static int constrainToRange(int i, int i2, int i3) {
    }

    public static boolean contains(int[] iArr, int i) {
    }

    public static int[] ensureCapacity(int[] iArr, int i, int i2) {
    }

    public static int fromByteArray(byte[] bArr) {
    }

    public static int fromBytes(byte b, byte b2, byte b3, byte b4) {
    }

    public static int hashCode(int i) {
    }

    public static int indexOf(int[] iArr, int i) {
    }

    public static String join(String str, int... iArr) {
    }

    public static int lastIndexOf(int[] iArr, int i) {
    }

    public static Comparator<int[]> lexicographicalComparator() {
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static int max(int... iArr) {
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static int min(int... iArr) {
    }

    public static void reverse(int[] iArr) {
    }

    public static int saturatedCast(long j) {
    }

    public static void sortDescending(int[] iArr) {
    }

    @Beta
    public static Converter<String, Integer> stringConverter() {
    }

    public static int[] toArray(Collection<? extends Number> collection) {
    }

    public static byte[] toByteArray(int i) {
    }

    @Beta
    public static Integer tryParse(String str) {
    }

    private static int indexOf(int[] iArr, int i, int i2, int i3) {
    }

    private static int lastIndexOf(int[] iArr, int i, int i2, int i3) {
    }

    @Beta
    public static Integer tryParse(String str, int i) {
    }

    public static int indexOf(int[] iArr, int[] iArr2) {
    }

    public static void reverse(int[] iArr, int i, int i2) {
    }

    public static void sortDescending(int[] iArr, int i, int i2) {
    }
}
