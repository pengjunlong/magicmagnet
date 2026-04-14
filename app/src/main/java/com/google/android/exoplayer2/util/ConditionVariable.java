package com.google.android.exoplayer2.util;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class ConditionVariable {
    private final Clock clock;
    private boolean isOpen;

    public ConditionVariable() {
    }

    public synchronized void block() throws InterruptedException {
    }

    public synchronized void blockUninterruptible() {
    }

    public synchronized boolean close() {
    }

    public synchronized boolean isOpen() {
    }

    public synchronized boolean open() {
    }

    public ConditionVariable(Clock clock) {
    }

    public synchronized boolean block(long j) throws InterruptedException {
    }
}
