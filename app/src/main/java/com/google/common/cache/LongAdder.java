package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class LongAdder extends Striped64 implements LongAddable {
    private static final long serialVersionUID = 7249069246863182397L;

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    @Override // com.google.common.cache.LongAddable
    public void add(long j) {
    }

    public void decrement() {
    }

    @Override // java.lang.Number
    public double doubleValue() {
    }

    @Override // java.lang.Number
    public float floatValue() {
    }

    @Override // com.google.common.cache.Striped64
    final long fn(long j, long j2) {
    }

    @Override // com.google.common.cache.LongAddable
    public void increment() {
    }

    @Override // java.lang.Number
    public int intValue() {
    }

    @Override // java.lang.Number
    public long longValue() {
    }

    public void reset() {
    }

    @Override // com.google.common.cache.LongAddable
    public long sum() {
    }

    public long sumThenReset() {
    }

    public String toString() {
    }
}
