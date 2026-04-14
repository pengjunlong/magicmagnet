package com.google.common.util.concurrent;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.atomic.AtomicLong;

@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class AtomicDouble extends Number {
    private static final long serialVersionUID = 0;
    private transient AtomicLong value;

    public AtomicDouble(double d) {
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    @CanIgnoreReturnValue
    public final double addAndGet(double d) {
    }

    public final boolean compareAndSet(double d, double d2) {
    }

    @Override // java.lang.Number
    public double doubleValue() {
    }

    @Override // java.lang.Number
    public float floatValue() {
    }

    public final double get() {
    }

    @CanIgnoreReturnValue
    public final double getAndAdd(double d) {
    }

    public final double getAndSet(double d) {
    }

    @Override // java.lang.Number
    public int intValue() {
    }

    public final void lazySet(double d) {
    }

    @Override // java.lang.Number
    public long longValue() {
    }

    public final void set(double d) {
    }

    public String toString() {
    }

    public final boolean weakCompareAndSet(double d, double d2) {
    }

    public AtomicDouble() {
    }
}
