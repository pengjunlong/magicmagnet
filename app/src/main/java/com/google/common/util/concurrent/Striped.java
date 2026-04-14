package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Supplier;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;

@Beta
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class Striped<L> {
    private static final int ALL_SET = -1;
    private static final int LARGE_LAZY_CUTOFF = 1024;
    private static final Supplier<ReadWriteLock> READ_WRITE_LOCK_SUPPLIER = null;
    private static final Supplier<ReadWriteLock> WEAK_SAFE_READ_WRITE_LOCK_SUPPLIER = null;

    /* renamed from: com.google.common.util.concurrent.Striped$1 */
    class C10701 implements Supplier<Lock> {
        C10701() {
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ Lock get() {
        }

        @Override // com.google.common.base.Supplier
        /* renamed from: get, reason: avoid collision after fix types in other method */
        public Lock get2() {
        }
    }

    /* renamed from: com.google.common.util.concurrent.Striped$2 */
    class C10712 implements Supplier<Lock> {
        C10712() {
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ Lock get() {
        }

        @Override // com.google.common.base.Supplier
        /* renamed from: get, reason: avoid collision after fix types in other method */
        public Lock get2() {
        }
    }

    /* renamed from: com.google.common.util.concurrent.Striped$3 */
    class C10723 implements Supplier<Semaphore> {
        final /* synthetic */ int val$permits;

        C10723(int i) {
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ Semaphore get() {
        }

        @Override // com.google.common.base.Supplier
        /* renamed from: get, reason: avoid collision after fix types in other method */
        public Semaphore get2() {
        }
    }

    /* renamed from: com.google.common.util.concurrent.Striped$4 */
    class C10734 implements Supplier<Semaphore> {
        final /* synthetic */ int val$permits;

        C10734(int i) {
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ Semaphore get() {
        }

        @Override // com.google.common.base.Supplier
        /* renamed from: get, reason: avoid collision after fix types in other method */
        public Semaphore get2() {
        }
    }

    /* renamed from: com.google.common.util.concurrent.Striped$5 */
    class C10745 implements Supplier<ReadWriteLock> {
        C10745() {
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ ReadWriteLock get() {
        }

        @Override // com.google.common.base.Supplier
        /* renamed from: get, reason: avoid collision after fix types in other method */
        public ReadWriteLock get2() {
        }
    }

    /* renamed from: com.google.common.util.concurrent.Striped$6 */
    class C10756 implements Supplier<ReadWriteLock> {
        C10756() {
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ ReadWriteLock get() {
        }

        @Override // com.google.common.base.Supplier
        /* renamed from: get, reason: avoid collision after fix types in other method */
        public ReadWriteLock get2() {
        }
    }

    private static class CompactStriped<L> extends PowerOfTwoStriped<L> {
        private final Object[] array;

        /* synthetic */ CompactStriped(int i, Supplier supplier, C10701 c10701) {
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i) {
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
        }

        private CompactStriped(int i, Supplier<L> supplier) {
        }
    }

    @VisibleForTesting
    static class LargeLazyStriped<L> extends PowerOfTwoStriped<L> {
        final ConcurrentMap<Integer, L> locks;
        final int size;
        final Supplier<L> supplier;

        LargeLazyStriped(int i, Supplier<L> supplier) {
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i) {
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
        }
    }

    private static class PaddedLock extends ReentrantLock {
        long unused1;
        long unused2;
        long unused3;

        PaddedLock() {
        }
    }

    private static class PaddedSemaphore extends Semaphore {
        long unused1;
        long unused2;
        long unused3;

        PaddedSemaphore(int i) {
        }
    }

    private static abstract class PowerOfTwoStriped<L> extends Striped<L> {
        final int mask;

        PowerOfTwoStriped(int i) {
        }

        @Override // com.google.common.util.concurrent.Striped
        public final L get(Object obj) {
        }

        @Override // com.google.common.util.concurrent.Striped
        final int indexFor(Object obj) {
        }
    }

    @VisibleForTesting
    static class SmallLazyStriped<L> extends PowerOfTwoStriped<L> {
        final AtomicReferenceArray<ArrayReference<? extends L>> locks;
        final ReferenceQueue<L> queue;
        final int size;
        final Supplier<L> supplier;

        private static final class ArrayReference<L> extends WeakReference<L> {
            final int index;

            ArrayReference(L l, int i, ReferenceQueue<L> referenceQueue) {
            }
        }

        SmallLazyStriped(int i, Supplier<L> supplier) {
        }

        private void drainQueue() {
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i) {
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
        }
    }

    private static final class WeakSafeCondition extends ForwardingCondition {
        private final Condition delegate;
        private final WeakSafeReadWriteLock strongReference;

        WeakSafeCondition(Condition condition, WeakSafeReadWriteLock weakSafeReadWriteLock) {
        }

        @Override // com.google.common.util.concurrent.ForwardingCondition
        Condition delegate() {
        }
    }

    private static final class WeakSafeLock extends ForwardingLock {
        private final Lock delegate;
        private final WeakSafeReadWriteLock strongReference;

        WeakSafeLock(Lock lock, WeakSafeReadWriteLock weakSafeReadWriteLock) {
        }

        @Override // com.google.common.util.concurrent.ForwardingLock
        Lock delegate() {
        }

        @Override // com.google.common.util.concurrent.ForwardingLock, java.util.concurrent.locks.Lock
        public Condition newCondition() {
        }
    }

    private static final class WeakSafeReadWriteLock implements ReadWriteLock {
        private final ReadWriteLock delegate;

        WeakSafeReadWriteLock() {
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock readLock() {
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock writeLock() {
        }
    }

    /* synthetic */ Striped(C10701 c10701) {
    }

    static /* synthetic */ int access$200(int i) {
    }

    static /* synthetic */ int access$300(int i) {
    }

    private static int ceilToPowerOfTwo(int i) {
    }

    static <L> Striped<L> custom(int i, Supplier<L> supplier) {
    }

    private static <L> Striped<L> lazy(int i, Supplier<L> supplier) {
    }

    public static Striped<Lock> lazyWeakLock(int i) {
    }

    public static Striped<ReadWriteLock> lazyWeakReadWriteLock(int i) {
    }

    public static Striped<Semaphore> lazyWeakSemaphore(int i, int i2) {
    }

    public static Striped<Lock> lock(int i) {
    }

    public static Striped<ReadWriteLock> readWriteLock(int i) {
    }

    public static Striped<Semaphore> semaphore(int i, int i2) {
    }

    private static int smear(int i) {
    }

    public Iterable<L> bulkGet(Iterable<? extends Object> iterable) {
    }

    public abstract L get(Object obj);

    public abstract L getAt(int i);

    abstract int indexFor(Object obj);

    public abstract int size();

    private Striped() {
    }
}
