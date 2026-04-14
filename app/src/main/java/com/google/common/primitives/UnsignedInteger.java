package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.math.BigInteger;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class UnsignedInteger extends Number implements Comparable<UnsignedInteger> {
    public static final UnsignedInteger MAX_VALUE = null;
    public static final UnsignedInteger ONE = null;
    public static final UnsignedInteger ZERO = null;
    private final int value;

    private UnsignedInteger(int i) {
    }

    public static UnsignedInteger fromIntBits(int i) {
    }

    public static UnsignedInteger valueOf(long j) {
    }

    public BigInteger bigIntegerValue() {
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UnsignedInteger unsignedInteger) {
    }

    public UnsignedInteger dividedBy(UnsignedInteger unsignedInteger) {
    }

    @Override // java.lang.Number
    public double doubleValue() {
    }

    public boolean equals(Object obj) {
    }

    @Override // java.lang.Number
    public float floatValue() {
    }

    public int hashCode() {
    }

    @Override // java.lang.Number
    public int intValue() {
    }

    @Override // java.lang.Number
    public long longValue() {
    }

    public UnsignedInteger minus(UnsignedInteger unsignedInteger) {
    }

    public UnsignedInteger mod(UnsignedInteger unsignedInteger) {
    }

    public UnsignedInteger plus(UnsignedInteger unsignedInteger) {
    }

    @GwtIncompatible
    public UnsignedInteger times(UnsignedInteger unsignedInteger) {
    }

    public String toString() {
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(UnsignedInteger unsignedInteger) {
    }

    public String toString(int i) {
    }

    public static UnsignedInteger valueOf(BigInteger bigInteger) {
    }

    public static UnsignedInteger valueOf(String str) {
    }

    public static UnsignedInteger valueOf(String str, int i) {
    }
}
