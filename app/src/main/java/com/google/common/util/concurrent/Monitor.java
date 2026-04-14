package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.Weak;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

@Beta
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Monitor {

    @GuardedBy("lock")
    private Guard activeGuards;
    private final boolean fair;
    private final ReentrantLock lock;

    @Beta
    public static abstract class Guard {
        final Condition condition;

        @Weak
        final Monitor monitor;

        @GuardedBy("monitor.lock")
        Guard next;

        @GuardedBy("monitor.lock")
        int waiterCount;

        protected Guard(Monitor monitor) {
        }

        public abstract boolean isSatisfied();
    }

    public Monitor() {
    }

    static /* synthetic */ ReentrantLock access$000(Monitor monitor) {
    }

    @GuardedBy("lock")
    private void await(Guard guard, boolean z) throws InterruptedException {
    }

    @GuardedBy("lock")
    private boolean awaitNanos(Guard guard, long j, boolean z) throws InterruptedException {
    }

    @GuardedBy("lock")
    private void awaitUninterruptibly(Guard guard, boolean z) {
    }

    @GuardedBy("lock")
    private void beginWaitingFor(Guard guard) {
    }

    @GuardedBy("lock")
    private void endWaitingFor(Guard guard) {
    }

    private static long initNanoTime(long j) {
    }

    @GuardedBy("lock")
    private boolean isSatisfied(Guard guard) {
    }

    private static long remainingNanos(long j, long j2) {
    }

    @GuardedBy("lock")
    private void signalAllWaiters() {
    }

    @GuardedBy("lock")
    private void signalNextWaiter() {
    }

    private static long toSafeNanos(long j, TimeUnit timeUnit) {
    }

    public void enter() {
    }

    public boolean enterIf(Guard guard) {
    }

    public boolean enterIfInterruptibly(Guard guard) throws InterruptedException {
    }

    public void enterInterruptibly() throws InterruptedException {
    }

    public void enterWhen(Guard guard) throws InterruptedException {
    }

    public void enterWhenUninterruptibly(Guard guard) {
    }

    public int getOccupiedDepth() {
    }

    public int getQueueLength() {
    }

    public int getWaitQueueLength(Guard guard) {
    }

    public boolean hasQueuedThread(Thread thread) {
    }

    public boolean hasQueuedThreads() {
    }

    public boolean hasWaiters(Guard guard) {
    }

    public boolean isFair() {
    }

    public boolean isOccupied() {
    }

    public boolean isOccupiedByCurrentThread() {
    }

    public void leave() {
    }

    public boolean tryEnter() {
    }

    public boolean tryEnterIf(Guard guard) {
    }

    public void waitFor(Guard guard) throws InterruptedException {
    }

    public void waitForUninterruptibly(Guard guard) {
    }

    public Monitor(boolean z) {
    }

    public boolean enter(long j, TimeUnit timeUnit) {
    }

    public boolean enterInterruptibly(long j, TimeUnit timeUnit) throws InterruptedException {
    }

    public boolean waitFor(Guard guard, long j, TimeUnit timeUnit) throws InterruptedException {
    }

    public boolean waitForUninterruptibly(Guard guard, long j, TimeUnit timeUnit) {
    }

    public boolean enterIf(Guard guard, long j, TimeUnit timeUnit) {
    }

    public boolean enterIfInterruptibly(Guard guard, long j, TimeUnit timeUnit) throws InterruptedException {
    }

    public boolean enterWhen(Guard guard, long j, TimeUnit timeUnit) throws InterruptedException {
    }

    public boolean enterWhenUninterruptibly(Guard guard, long j, TimeUnit timeUnit) {
    }
}
