package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    public static int beginObjectHeader(Parcel parcel) {
    }

    public static void finishObjectHeader(Parcel parcel, int i) {
    }

    public static void writeBigDecimal(Parcel parcel, int i, BigDecimal bigDecimal, boolean z) {
    }

    public static void writeBigDecimalArray(Parcel parcel, int i, BigDecimal[] bigDecimalArr, boolean z) {
    }

    public static void writeBigInteger(Parcel parcel, int i, BigInteger bigInteger, boolean z) {
    }

    public static void writeBigIntegerArray(Parcel parcel, int i, BigInteger[] bigIntegerArr, boolean z) {
    }

    public static void writeBoolean(Parcel parcel, int i, boolean z) {
    }

    public static void writeBooleanArray(Parcel parcel, int i, boolean[] zArr, boolean z) {
    }

    public static void writeBooleanList(Parcel parcel, int i, List<Boolean> list, boolean z) {
    }

    public static void writeBooleanObject(Parcel parcel, int i, Boolean bool, boolean z) {
    }

    public static void writeBundle(Parcel parcel, int i, Bundle bundle, boolean z) {
    }

    public static void writeByte(Parcel parcel, int i, byte b) {
    }

    public static void writeByteArray(Parcel parcel, int i, byte[] bArr, boolean z) {
    }

    public static void writeByteArrayArray(Parcel parcel, int i, byte[][] bArr, boolean z) {
    }

    public static void writeByteArraySparseArray(Parcel parcel, int i, SparseArray<byte[]> sparseArray, boolean z) {
    }

    public static void writeChar(Parcel parcel, int i, char c) {
    }

    public static void writeCharArray(Parcel parcel, int i, char[] cArr, boolean z) {
    }

    public static void writeDouble(Parcel parcel, int i, double d) {
    }

    public static void writeDoubleArray(Parcel parcel, int i, double[] dArr, boolean z) {
    }

    public static void writeDoubleList(Parcel parcel, int i, List<Double> list, boolean z) {
    }

    public static void writeDoubleObject(Parcel parcel, int i, Double d, boolean z) {
    }

    public static void writeDoubleSparseArray(Parcel parcel, int i, SparseArray<Double> sparseArray, boolean z) {
    }

    public static void writeFloat(Parcel parcel, int i, float f) {
    }

    public static void writeFloatArray(Parcel parcel, int i, float[] fArr, boolean z) {
    }

    public static void writeFloatList(Parcel parcel, int i, List<Float> list, boolean z) {
    }

    public static void writeFloatObject(Parcel parcel, int i, Float f, boolean z) {
    }

    public static void writeFloatSparseArray(Parcel parcel, int i, SparseArray<Float> sparseArray, boolean z) {
    }

    public static void writeIBinder(Parcel parcel, int i, IBinder iBinder, boolean z) {
    }

    public static void writeIBinderArray(Parcel parcel, int i, IBinder[] iBinderArr, boolean z) {
    }

    public static void writeIBinderList(Parcel parcel, int i, List<IBinder> list, boolean z) {
    }

    public static void writeIBinderSparseArray(Parcel parcel, int i, SparseArray<IBinder> sparseArray, boolean z) {
    }

    public static void writeInt(Parcel parcel, int i, int i2) {
    }

    public static void writeIntArray(Parcel parcel, int i, int[] iArr, boolean z) {
    }

    public static void writeIntegerList(Parcel parcel, int i, List<Integer> list, boolean z) {
    }

    public static void writeIntegerObject(Parcel parcel, int i, Integer num, boolean z) {
    }

    public static void writeList(Parcel parcel, int i, List list, boolean z) {
    }

    public static void writeLong(Parcel parcel, int i, long j) {
    }

    public static void writeLongArray(Parcel parcel, int i, long[] jArr, boolean z) {
    }

    public static void writeLongList(Parcel parcel, int i, List<Long> list, boolean z) {
    }

    public static void writeLongObject(Parcel parcel, int i, Long l, boolean z) {
    }

    public static void writeParcel(Parcel parcel, int i, Parcel parcel2, boolean z) {
    }

    public static void writeParcelArray(Parcel parcel, int i, Parcel[] parcelArr, boolean z) {
    }

    public static void writeParcelList(Parcel parcel, int i, List<Parcel> list, boolean z) {
    }

    public static void writeParcelSparseArray(Parcel parcel, int i, SparseArray<Parcel> sparseArray, boolean z) {
    }

    public static void writeParcelable(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
    }

    public static void writeShort(Parcel parcel, int i, short s) {
    }

    public static void writeSparseBooleanArray(Parcel parcel, int i, SparseBooleanArray sparseBooleanArray, boolean z) {
    }

    public static void writeSparseIntArray(Parcel parcel, int i, SparseIntArray sparseIntArray, boolean z) {
    }

    public static void writeSparseLongArray(Parcel parcel, int i, SparseLongArray sparseLongArray, boolean z) {
    }

    public static void writeString(Parcel parcel, int i, String str, boolean z) {
    }

    public static void writeStringArray(Parcel parcel, int i, String[] strArr, boolean z) {
    }

    public static void writeStringList(Parcel parcel, int i, List<String> list, boolean z) {
    }

    public static void writeStringSparseArray(Parcel parcel, int i, SparseArray<String> sparseArray, boolean z) {
    }

    public static <T extends Parcelable> void writeTypedArray(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
    }

    public static <T extends Parcelable> void writeTypedList(Parcel parcel, int i, List<T> list, boolean z) {
    }

    public static <T extends Parcelable> void writeTypedSparseArray(Parcel parcel, int i, SparseArray<T> sparseArray, boolean z) {
    }

    private static void zza(Parcel parcel, int i, int i2) {
    }

    private static void zzb(Parcel parcel, int i) {
    }

    private static int zza(Parcel parcel, int i) {
    }

    private static <T extends Parcelable> void zza(Parcel parcel, T t, int i) {
    }
}
