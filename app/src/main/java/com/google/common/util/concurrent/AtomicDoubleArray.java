package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongArray;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class AtomicDoubleArray implements Serializable {
    private static final long serialVersionUID = 0;
    private transient AtomicLongArray longs;

    public AtomicDoubleArray(int i) {
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    @CanIgnoreReturnValue
    public double addAndGet(int i, double d) {
    }

    public final boolean compareAndSet(int i, double d, double d2) {
    }

    public final double get(int i) {
    }

    @CanIgnoreReturnValue
    public final double getAndAdd(int i, double d) {
    }

    public final double getAndSet(int i, double d) {
    }

    public final void lazySet(int i, double d) {
    }

    public final int length() {
    }

    public final void set(int i, double d) {
    }

    public String toString() {
    }

    public final boolean weakCompareAndSet(int i, double d, double d2) {
    }

    public AtomicDoubleArray(double[] dArr) {
    }
}
