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
public final class Floats extends FloatsMethodsForWeb {
    public static final int BYTES = 4;

    @GwtCompatible
    private static class FloatArrayAsList extends AbstractList<Float> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final float[] array;
        final int end;
        final int start;

        FloatArrayAsList(float[] fArr) {
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
        public List<Float> subList(int i, int i2) {
        }

        float[] toFloatArray() {
        }

        @Override // java.util.AbstractCollection
        public String toString() {
        }

        FloatArrayAsList(float[] fArr, int i, int i2) {
        }

        @Override // java.util.AbstractList, java.util.List
        public Float get(int i) {
        }

        public Float set(int i, Float f) {
        }
    }

    private static final class FloatConverter extends Converter<String, Float> implements Serializable {
        static final FloatConverter INSTANCE = null;
        private static final long serialVersionUID = 1;

        private FloatConverter() {
        }

        private Object readResolve() {
        }

        @Override // com.google.common.base.Converter
        protected /* bridge */ /* synthetic */ String doBackward(Float f) {
        }

        @Override // com.google.common.base.Converter
        protected /* bridge */ /* synthetic */ Float doForward(String str) {
        }

        public String toString() {
        }

        /* renamed from: doBackward, reason: avoid collision after fix types in other method */
        protected String doBackward2(Float f) {
        }

        /* renamed from: doForward, reason: avoid collision after fix types in other method */
        protected Float doForward2(String str) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static final class LexicographicalComparator implements Comparator<float[]> {
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
        public /* bridge */ /* synthetic */ int compare(float[] fArr, float[] fArr2) {
        }

        @Override // java.lang.Enum
        public String toString() {
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(float[] fArr, float[] fArr2) {
        }
    }

    private Floats() {
    }

    static /* synthetic */ int access$000(float[] fArr, float f, int i, int i2) {
    }

    static /* synthetic */ int access$100(float[] fArr, float f, int i, int i2) {
    }

    public static List<Float> asList(float... fArr) {
    }

    public static int compare(float f, float f2) {
    }

    public static float[] concat(float[]... fArr) {
    }

    @Beta
    public static float constrainToRange(float f, float f2, float f3) {
    }

    public static boolean contains(float[] fArr, float f) {
    }

    public static float[] ensureCapacity(float[] fArr, int i, int i2) {
    }

    public static int hashCode(float f) {
    }

    public static int indexOf(float[] fArr, float f) {
    }

    public static boolean isFinite(float f) {
    }

    public static String join(String str, float... fArr) {
    }

    public static int lastIndexOf(float[] fArr, float f) {
    }

    public static Comparator<float[]> lexicographicalComparator() {
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static float max(float... fArr) {
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static float min(float... fArr) {
    }

    public static void reverse(float[] fArr) {
    }

    public static void sortDescending(float[] fArr) {
    }

    @Beta
    public static Converter<String, Float> stringConverter() {
    }

    public static float[] toArray(Collection<? extends Number> collection) {
    }

    @Beta
    @GwtIncompatible
    public static Float tryParse(String str) {
    }

    private static int indexOf(float[] fArr, float f, int i, int i2) {
    }

    private static int lastIndexOf(float[] fArr, float f, int i, int i2) {
    }

    public static int indexOf(float[] fArr, float[] fArr2) {
    }

    public static void reverse(float[] fArr, int i, int i2) {
    }

    public static void sortDescending(float[] fArr, int i, int i2) {
    }
}
