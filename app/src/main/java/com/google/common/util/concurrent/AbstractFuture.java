package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.j2objc.annotations.ReflectionSupport;
import java.security.PrivilegedExceptionAction;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Logger;
import sun.misc.Unsafe;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
@ReflectionSupport(ReflectionSupport.Level.FULL)
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class AbstractFuture<V> extends InternalFutureFailureAccess implements ListenableFuture<V> {
    private static final AtomicHelper ATOMIC_HELPER = null;
    private static final boolean GENERATE_CANCELLATION_CAUSES = false;
    private static final Object NULL = null;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    private static final Logger log = null;
    private volatile Listener listeners;
    private volatile Object value;
    private volatile Waiter waiters;

    private static abstract class AtomicHelper {
        private AtomicHelper() {
        }

        abstract boolean casListeners(AbstractFuture<?> abstractFuture, Listener listener, Listener listener2);

        abstract boolean casValue(AbstractFuture<?> abstractFuture, Object obj, Object obj2);

        abstract boolean casWaiters(AbstractFuture<?> abstractFuture, Waiter waiter, Waiter waiter2);

        abstract void putNext(Waiter waiter, Waiter waiter2);

        abstract void putThread(Waiter waiter, Thread thread);

        /* synthetic */ AtomicHelper(C09951 c09951) {
        }
    }

    private static final class Cancellation {
        static final Cancellation CAUSELESS_CANCELLED = null;
        static final Cancellation CAUSELESS_INTERRUPTED = null;
        final Throwable cause;
        final boolean wasInterrupted;

        Cancellation(boolean z, Throwable th) {
        }
    }

    private static final class Failure {
        static final Failure FALLBACK_INSTANCE = null;
        final Throwable exception;

        /* renamed from: com.google.common.util.concurrent.AbstractFuture$Failure$1 */
        class C09961 extends Throwable {
            C09961(String str) {
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
            }
        }

        Failure(Throwable th) {
        }
    }

    private static final class SafeAtomicHelper extends AtomicHelper {
        final AtomicReferenceFieldUpdater<AbstractFuture, Listener> listenersUpdater;
        final AtomicReferenceFieldUpdater<AbstractFuture, Object> valueUpdater;
        final AtomicReferenceFieldUpdater<Waiter, Waiter> waiterNextUpdater;
        final AtomicReferenceFieldUpdater<Waiter, Thread> waiterThreadUpdater;
        final AtomicReferenceFieldUpdater<AbstractFuture, Waiter> waitersUpdater;

        SafeAtomicHelper(AtomicReferenceFieldUpdater<Waiter, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<Waiter, Waiter> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, Waiter> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, Listener> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater5) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casListeners(AbstractFuture<?> abstractFuture, Listener listener, Listener listener2) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casValue(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casWaiters(AbstractFuture<?> abstractFuture, Waiter waiter, Waiter waiter2) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        void putNext(Waiter waiter, Waiter waiter2) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        void putThread(Waiter waiter, Thread thread) {
        }
    }

    private static final class SetFuture<V> implements Runnable {
        final ListenableFuture<? extends V> future;
        final AbstractFuture<V> owner;

        SetFuture(AbstractFuture<V> abstractFuture, ListenableFuture<? extends V> listenableFuture) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private static final class SynchronizedHelper extends AtomicHelper {
        private SynchronizedHelper() {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casListeners(AbstractFuture<?> abstractFuture, Listener listener, Listener listener2) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casValue(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casWaiters(AbstractFuture<?> abstractFuture, Waiter waiter, Waiter waiter2) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        void putNext(Waiter waiter, Waiter waiter2) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        void putThread(Waiter waiter, Thread thread) {
        }

        /* synthetic */ SynchronizedHelper(C09951 c09951) {
        }
    }

    interface Trusted<V> extends ListenableFuture<V> {
    }

    static abstract class TrustedFuture<V> extends AbstractFuture<V> implements Trusted<V> {
        TrustedFuture() {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.ListenableFuture
        public void addListener(Runnable runnable, Executor executor) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @CanIgnoreReturnValue
        public boolean cancel(boolean z) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @CanIgnoreReturnValue
        @ParametricNullness
        public final V get() throws InterruptedException, ExecutionException {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public boolean isCancelled() {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isDone() {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @CanIgnoreReturnValue
        @ParametricNullness
        public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        }
    }

    private static final class UnsafeAtomicHelper extends AtomicHelper {
        static final long LISTENERS_OFFSET = 0;
        static final Unsafe UNSAFE = null;
        static final long VALUE_OFFSET = 0;
        static final long WAITERS_OFFSET = 0;
        static final long WAITER_NEXT_OFFSET = 0;
        static final long WAITER_THREAD_OFFSET = 0;

        /* renamed from: com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper$1 */
        class C09971 implements PrivilegedExceptionAction<Unsafe> {
            C09971() {
            }

            @Override // java.security.PrivilegedExceptionAction
            public /* bridge */ /* synthetic */ Unsafe run() throws Exception {
            }

            @Override // java.security.PrivilegedExceptionAction
            /* renamed from: run, reason: avoid collision after fix types in other method */
            public Unsafe run2() throws Exception {
            }
        }

        private UnsafeAtomicHelper() {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casListeners(AbstractFuture<?> abstractFuture, Listener listener, Listener listener2) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casValue(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casWaiters(AbstractFuture<?> abstractFuture, Waiter waiter, Waiter waiter2) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        void putNext(Waiter waiter, Waiter waiter2) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        void putThread(Waiter waiter, Thread thread) {
        }

        /* synthetic */ UnsafeAtomicHelper(C09951 c09951) {
        }
    }

    private static final class Waiter {
        static final Waiter TOMBSTONE = null;
        volatile Waiter next;
        volatile Thread thread;

        Waiter(boolean z) {
        }

        void setNext(Waiter waiter) {
        }

        void unpark() {
        }

        Waiter() {
        }
    }

    protected AbstractFuture() {
    }

    static /* synthetic */ AtomicHelper access$200() {
    }

    static /* synthetic */ boolean access$300() {
    }

    static /* synthetic */ Object access$400(AbstractFuture abstractFuture) {
    }

    static /* synthetic */ Object access$402(AbstractFuture abstractFuture, Object obj) {
    }

    static /* synthetic */ Object access$500(ListenableFuture listenableFuture) {
    }

    static /* synthetic */ void access$600(AbstractFuture abstractFuture) {
    }

    static /* synthetic */ Waiter access$800(AbstractFuture abstractFuture) {
    }

    static /* synthetic */ Waiter access$802(AbstractFuture abstractFuture, Waiter waiter) {
    }

    static /* synthetic */ Listener access$900(AbstractFuture abstractFuture) {
    }

    static /* synthetic */ Listener access$902(AbstractFuture abstractFuture, Listener listener) {
    }

    private void addDoneString(StringBuilder sb) {
    }

    private void addPendingString(StringBuilder sb) {
    }

    private void appendResultObject(StringBuilder sb, Object obj) {
    }

    private void appendUserObject(StringBuilder sb, Object obj) {
    }

    private static CancellationException cancellationExceptionWithCause(String str, Throwable th) {
    }

    private Listener clearListeners(Listener listener) {
    }

    private static void complete(AbstractFuture<?> abstractFuture) {
    }

    private static void executeListener(Runnable runnable, Executor executor) {
    }

    @ParametricNullness
    private V getDoneValue(Object obj) throws ExecutionException {
    }

    private static Object getFutureValue(ListenableFuture<?> listenableFuture) {
    }

    @ParametricNullness
    private static <V> V getUninterruptibly(Future<V> future) throws ExecutionException {
    }

    private void releaseWaiters() {
    }

    private void removeWaiter(Waiter waiter) {
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
    }

    @Beta
    @ForOverride
    protected void afterDone() {
    }

    @Override // java.util.concurrent.Future
    @CanIgnoreReturnValue
    public boolean cancel(boolean z) {
    }

    @Override // java.util.concurrent.Future
    @CanIgnoreReturnValue
    @ParametricNullness
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
    }

    protected void interruptTask() {
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
    }

    final void maybePropagateCancellationTo(Future<?> future) {
    }

    protected String pendingToString() {
    }

    @CanIgnoreReturnValue
    protected boolean set(@ParametricNullness V v) {
    }

    @CanIgnoreReturnValue
    protected boolean setException(Throwable th) {
    }

    @CanIgnoreReturnValue
    protected boolean setFuture(ListenableFuture<? extends V> listenableFuture) {
    }

    public String toString() {
    }

    @Override // com.google.common.util.concurrent.internal.InternalFutureFailureAccess
    protected final Throwable tryInternalFastPathGetFailure() {
    }

    protected final boolean wasInterrupted() {
    }

    private static final class Listener {
        static final Listener TOMBSTONE = null;
        final Executor executor;
        Listener next;
        final Runnable task;

        Listener(Runnable runnable, Executor executor) {
        }

        Listener() {
        }
    }

    @Override // java.util.concurrent.Future
    @CanIgnoreReturnValue
    @ParametricNullness
    public V get() throws InterruptedException, ExecutionException {
    }
}
