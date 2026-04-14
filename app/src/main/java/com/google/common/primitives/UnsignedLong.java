package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.BigInteger;

@ElementTypesAreNonnullByDefault
@GwtCompatible(serializable = true)
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class UnsignedLong extends Number implements Comparable<UnsignedLong> {
    public static final UnsignedLong MAX_VALUE = null;
    public static final UnsignedLong ONE = null;
    private static final long UNSIGNED_MASK = Long.MAX_VALUE;
    public static final UnsignedLong ZERO = null;
    private final long value;

    private UnsignedLong(long j) {
    }

    public static UnsignedLong fromLongBits(long j) {
    }

    @CanIgnoreReturnValue
    public static UnsignedLong valueOf(long j) {
    }

    public BigInteger bigIntegerValue() {
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UnsignedLong unsignedLong) {
    }

    public UnsignedLong dividedBy(UnsignedLong unsignedLong) {
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

    public UnsignedLong minus(UnsignedLong unsignedLong) {
    }

    public UnsignedLong mod(UnsignedLong unsignedLong) {
    }

    public UnsignedLong plus(UnsignedLong unsignedLong) {
    }

    public UnsignedLong times(UnsignedLong unsignedLong) {
    }

    public String toString() {
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(UnsignedLong unsignedLong) {
    }

    public String toString(int i) {
    }

    @CanIgnoreReturnValue
    public static UnsignedLong valueOf(BigInteger bigInteger) {
    }

    @CanIgnoreReturnValue
    public static UnsignedLong valueOf(String str) {
    }

    @CanIgnoreReturnValue
    public static UnsignedLong valueOf(String str, int i) {
    }
}
