package com.google.common.util.concurrent;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class ForwardingCondition implements Condition {
    ForwardingCondition() {
    }

    @Override // java.util.concurrent.locks.Condition
    public void await() throws InterruptedException {
    }

    @Override // java.util.concurrent.locks.Condition
    public long awaitNanos(long j) throws InterruptedException {
    }

    @Override // java.util.concurrent.locks.Condition
    public void awaitUninterruptibly() {
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean awaitUntil(Date date) throws InterruptedException {
    }

    abstract Condition delegate();

    @Override // java.util.concurrent.locks.Condition
    public void signal() {
    }

    @Override // java.util.concurrent.locks.Condition
    public void signalAll() {
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean await(long j, TimeUnit timeUnit) throws InterruptedException {
    }
}
