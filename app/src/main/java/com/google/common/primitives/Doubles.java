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
import java.util.regex.Pattern;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Doubles extends DoublesMethodsForWeb {
    public static final int BYTES = 8;

    @GwtIncompatible
    static final Pattern FLOATING_POINT_PATTERN = null;

    @GwtCompatible
    private static class DoubleArrayAsList extends AbstractList<Double> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final double[] array;
        final int end;
        final int start;

        DoubleArrayAsList(double[] dArr) {
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
        public List<Double> subList(int i, int i2) {
        }

        double[] toDoubleArray() {
        }

        @Override // java.util.AbstractCollection
        public String toString() {
        }

        DoubleArrayAsList(double[] dArr, int i, int i2) {
        }

        @Override // java.util.AbstractList, java.util.List
        public Double get(int i) {
        }

        public Double set(int i, Double d) {
        }
    }

    private static final class DoubleConverter extends Converter<String, Double> implements Serializable {
        static final DoubleConverter INSTANCE = null;
        private static final long serialVersionUID = 1;

        private DoubleConverter() {
        }

        private Object readResolve() {
        }

        @Override // com.google.common.base.Converter
        protected /* bridge */ /* synthetic */ String doBackward(Double d) {
        }

        @Override // com.google.common.base.Converter
        protected /* bridge */ /* synthetic */ Double doForward(String str) {
        }

        public String toString() {
        }

        /* renamed from: doBackward, reason: avoid collision after fix types in other method */
        protected String doBackward2(Double d) {
        }

        /* renamed from: doForward, reason: avoid collision after fix types in other method */
        protected Double doForward2(String str) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static final class LexicographicalComparator implements Comparator<double[]> {
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
        public /* bridge */ /* synthetic */ int compare(double[] dArr, double[] dArr2) {
        }

        @Override // java.lang.Enum
        public String toString() {
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(double[] dArr, double[] dArr2) {
        }
    }

    private Doubles() {
    }

    static /* synthetic */ int access$000(double[] dArr, double d, int i, int i2) {
    }

    static /* synthetic */ int access$100(double[] dArr, double d, int i, int i2) {
    }

    public static List<Double> asList(double... dArr) {
    }

    public static int compare(double d, double d2) {
    }

    public static double[] concat(double[]... dArr) {
    }

    @Beta
    public static double constrainToRange(double d, double d2, double d3) {
    }

    public static boolean contains(double[] dArr, double d) {
    }

    public static double[] ensureCapacity(double[] dArr, int i, int i2) {
    }

    @GwtIncompatible
    private static Pattern fpPattern() {
    }

    public static int hashCode(double d) {
    }

    public static int indexOf(double[] dArr, double d) {
    }

    public static boolean isFinite(double d) {
    }

    public static String join(String str, double... dArr) {
    }

    public static int lastIndexOf(double[] dArr, double d) {
    }

    public static Comparator<double[]> lexicographicalComparator() {
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static double max(double... dArr) {
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static double min(double... dArr) {
    }

    public static void reverse(double[] dArr) {
    }

    public static void sortDescending(double[] dArr) {
    }

    @Beta
    public static Converter<String, Double> stringConverter() {
    }

    public static double[] toArray(Collection<? extends Number> collection) {
    }

    @Beta
    @GwtIncompatible
    public static Double tryParse(String str) {
    }

    private static int indexOf(double[] dArr, double d, int i, int i2) {
    }

    private static int lastIndexOf(double[] dArr, double d, int i, int i2) {
    }

    public static int indexOf(double[] dArr, double[] dArr2) {
    }

    public static void reverse(double[] dArr, int i, int i2) {
    }

    public static void sortDescending(double[] dArr, int i, int i2) {
    }
}
