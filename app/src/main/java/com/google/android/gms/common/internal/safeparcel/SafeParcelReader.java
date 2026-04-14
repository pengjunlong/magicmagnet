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
import java.util.ArrayList;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class SafeParcelReader {

    public static class ParseException extends RuntimeException {
        public ParseException(String str, Parcel parcel) {
        }
    }

    private SafeParcelReader() {
    }

    public static BigDecimal createBigDecimal(Parcel parcel, int i) {
    }

    public static BigDecimal[] createBigDecimalArray(Parcel parcel, int i) {
    }

    public static BigInteger createBigInteger(Parcel parcel, int i) {
    }

    public static BigInteger[] createBigIntegerArray(Parcel parcel, int i) {
    }

    public static boolean[] createBooleanArray(Parcel parcel, int i) {
    }

    public static ArrayList<Boolean> createBooleanList(Parcel parcel, int i) {
    }

    public static Bundle createBundle(Parcel parcel, int i) {
    }

    public static byte[] createByteArray(Parcel parcel, int i) {
    }

    public static byte[][] createByteArrayArray(Parcel parcel, int i) {
    }

    public static SparseArray<byte[]> createByteArraySparseArray(Parcel parcel, int i) {
    }

    public static char[] createCharArray(Parcel parcel, int i) {
    }

    public static double[] createDoubleArray(Parcel parcel, int i) {
    }

    public static ArrayList<Double> createDoubleList(Parcel parcel, int i) {
    }

    public static SparseArray<Double> createDoubleSparseArray(Parcel parcel, int i) {
    }

    public static float[] createFloatArray(Parcel parcel, int i) {
    }

    public static ArrayList<Float> createFloatList(Parcel parcel, int i) {
    }

    public static SparseArray<Float> createFloatSparseArray(Parcel parcel, int i) {
    }

    public static IBinder[] createIBinderArray(Parcel parcel, int i) {
    }

    public static ArrayList<IBinder> createIBinderList(Parcel parcel, int i) {
    }

    public static SparseArray<IBinder> createIBinderSparseArray(Parcel parcel, int i) {
    }

    public static int[] createIntArray(Parcel parcel, int i) {
    }

    public static ArrayList<Integer> createIntegerList(Parcel parcel, int i) {
    }

    public static long[] createLongArray(Parcel parcel, int i) {
    }

    public static ArrayList<Long> createLongList(Parcel parcel, int i) {
    }

    public static Parcel createParcel(Parcel parcel, int i) {
    }

    public static Parcel[] createParcelArray(Parcel parcel, int i) {
    }

    public static ArrayList<Parcel> createParcelList(Parcel parcel, int i) {
    }

    public static SparseArray<Parcel> createParcelSparseArray(Parcel parcel, int i) {
    }

    public static <T extends Parcelable> T createParcelable(Parcel parcel, int i, Parcelable.Creator<T> creator) {
    }

    public static SparseBooleanArray createSparseBooleanArray(Parcel parcel, int i) {
    }

    public static SparseIntArray createSparseIntArray(Parcel parcel, int i) {
    }

    public static SparseLongArray createSparseLongArray(Parcel parcel, int i) {
    }

    public static String createString(Parcel parcel, int i) {
    }

    public static String[] createStringArray(Parcel parcel, int i) {
    }

    public static ArrayList<String> createStringList(Parcel parcel, int i) {
    }

    public static SparseArray<String> createStringSparseArray(Parcel parcel, int i) {
    }

    public static <T> T[] createTypedArray(Parcel parcel, int i, Parcelable.Creator<T> creator) {
    }

    public static <T> ArrayList<T> createTypedList(Parcel parcel, int i, Parcelable.Creator<T> creator) {
    }

    public static <T> SparseArray<T> createTypedSparseArray(Parcel parcel, int i, Parcelable.Creator<T> creator) {
    }

    public static void ensureAtEnd(Parcel parcel, int i) {
    }

    public static int getFieldId(int i) {
    }

    public static boolean readBoolean(Parcel parcel, int i) {
    }

    public static Boolean readBooleanObject(Parcel parcel, int i) {
    }

    public static byte readByte(Parcel parcel, int i) {
    }

    public static char readChar(Parcel parcel, int i) {
    }

    public static double readDouble(Parcel parcel, int i) {
    }

    public static Double readDoubleObject(Parcel parcel, int i) {
    }

    public static float readFloat(Parcel parcel, int i) {
    }

    public static Float readFloatObject(Parcel parcel, int i) {
    }

    public static int readHeader(Parcel parcel) {
    }

    public static IBinder readIBinder(Parcel parcel, int i) {
    }

    public static int readInt(Parcel parcel, int i) {
    }

    public static Integer readIntegerObject(Parcel parcel, int i) {
    }

    public static void readList(Parcel parcel, int i, List list, ClassLoader classLoader) {
    }

    public static long readLong(Parcel parcel, int i) {
    }

    public static Long readLongObject(Parcel parcel, int i) {
    }

    public static short readShort(Parcel parcel, int i) {
    }

    public static int readSize(Parcel parcel, int i) {
    }

    public static void skipUnknownField(Parcel parcel, int i) {
    }

    public static int validateObjectHeader(Parcel parcel) {
    }

    private static void zza(Parcel parcel, int i, int i2) {
    }

    private static void zza(Parcel parcel, int i, int i2, int i3) {
    }
}
