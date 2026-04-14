package com.google.android.exoplayer2.util;

import java.io.IOException;
import java.util.PriorityQueue;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class PriorityTaskManager {
    private int highestPriority;
    private final Object lock;
    private final PriorityQueue<Integer> queue;

    public static class PriorityTooLowException extends IOException {
        public PriorityTooLowException(int i, int i2) {
        }
    }

    public void add(int i) {
    }

    public void proceed(int i) throws InterruptedException {
    }

    public boolean proceedNonBlocking(int i) {
    }

    public void proceedOrThrow(int i) throws PriorityTooLowException {
    }

    public void remove(int i) {
    }
}
