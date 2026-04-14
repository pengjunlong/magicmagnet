package com.google.android.exoplayer2.util;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class TimedValueQueue<V> {
    private static final int INITIAL_BUFFER_SIZE = 10;
    private int first;
    private int size;
    private long[] timestamps;
    private V[] values;

    public TimedValueQueue() {
    }

    private void addUnchecked(long j, V v) {
    }

    private void clearBufferOnTimeDiscontinuity(long j) {
    }

    private void doubleCapacityIfFull() {
    }

    private static <V> V[] newArray(int i) {
    }

    private V popFirst() {
    }

    public synchronized void add(long j, V v) {
    }

    public synchronized void clear() {
    }

    public synchronized V poll(long j) {
    }

    public synchronized V pollFirst() {
    }

    public synchronized V pollFloor(long j) {
    }

    public synchronized int size() {
    }

    public TimedValueQueue(int i) {
    }

    private V poll(long j, boolean z) {
    }
}
