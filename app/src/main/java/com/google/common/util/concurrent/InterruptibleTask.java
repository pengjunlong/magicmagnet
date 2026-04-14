package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.j2objc.annotations.ReflectionSupport;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
@ReflectionSupport(ReflectionSupport.Level.FULL)
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class InterruptibleTask<T> extends AtomicReference<Runnable> implements Runnable {
    private static final Runnable DONE = null;
    private static final int MAX_BUSY_WAIT_SPINS = 1000;
    private static final Runnable PARKED = null;

    @VisibleForTesting
    static final class Blocker extends AbstractOwnableSynchronizer implements Runnable {
        private final InterruptibleTask<?> task;

        /* synthetic */ Blocker(InterruptibleTask interruptibleTask, C10531 c10531) {
        }

        static /* synthetic */ void access$200(Blocker blocker, Thread thread) {
        }

        private void setOwner(Thread thread) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
        }

        private Blocker(InterruptibleTask<?> interruptibleTask) {
        }
    }

    private static final class DoNothingRunnable implements Runnable {
        private DoNothingRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        /* synthetic */ DoNothingRunnable(C10531 c10531) {
        }
    }

    InterruptibleTask() {
    }

    private void waitForInterrupt(Thread thread) {
    }

    abstract void afterRanInterruptiblyFailure(Throwable th);

    abstract void afterRanInterruptiblySuccess(@ParametricNullness T t);

    final void interruptTask() {
    }

    abstract boolean isDone();

    @Override // java.lang.Runnable
    public final void run() {
    }

    @ParametricNullness
    abstract T runInterruptibly() throws Exception;

    abstract String toPendingString();

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
    }
}
