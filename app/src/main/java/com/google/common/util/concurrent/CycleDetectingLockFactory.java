package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.Weak;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Logger;

@Beta
@ElementTypesAreNonnullByDefault
@GwtIncompatible
@CanIgnoreReturnValue
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class CycleDetectingLockFactory {
    private static final ThreadLocal<ArrayList<LockGraphNode>> acquiredLocks = null;
    private static final ConcurrentMap<Class<? extends Enum<?>>, Map<? extends Enum<?>, LockGraphNode>> lockGraphNodesPerType = null;
    private static final Logger logger = null;
    final Policy policy;

    /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$1 */
    class C10411 extends ThreadLocal<ArrayList<LockGraphNode>> {
        C10411() {
        }

        @Override // java.lang.ThreadLocal
        protected /* bridge */ /* synthetic */ ArrayList<LockGraphNode> initialValue() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: initialValue, reason: avoid collision after fix types in other method */
        protected ArrayList<LockGraphNode> initialValue2() {
        }
    }

    private interface CycleDetectingLock {
        LockGraphNode getLockGraphNode();

        boolean isAcquiredByCurrentThread();
    }

    final class CycleDetectingReentrantLock extends ReentrantLock implements CycleDetectingLock {
        private final LockGraphNode lockGraphNode;
        final /* synthetic */ CycleDetectingLockFactory this$0;

        /* synthetic */ CycleDetectingReentrantLock(CycleDetectingLockFactory cycleDetectingLockFactory, LockGraphNode lockGraphNode, boolean z, C10411 c10411) {
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock
        public LockGraphNode getLockGraphNode() {
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock
        public boolean isAcquiredByCurrentThread() {
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void unlock() {
        }

        private CycleDetectingReentrantLock(CycleDetectingLockFactory cycleDetectingLockFactory, LockGraphNode lockGraphNode, boolean z) {
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
        }
    }

    final class CycleDetectingReentrantReadWriteLock extends ReentrantReadWriteLock implements CycleDetectingLock {
        private final LockGraphNode lockGraphNode;
        private final CycleDetectingReentrantReadLock readLock;
        private final CycleDetectingReentrantWriteLock writeLock;

        /* synthetic */ CycleDetectingReentrantReadWriteLock(CycleDetectingLockFactory cycleDetectingLockFactory, LockGraphNode lockGraphNode, boolean z, C10411 c10411) {
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock
        public LockGraphNode getLockGraphNode() {
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock
        public boolean isAcquiredByCurrentThread() {
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public /* bridge */ /* synthetic */ Lock readLock() {
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public /* bridge */ /* synthetic */ Lock writeLock() {
        }

        private CycleDetectingReentrantReadWriteLock(CycleDetectingLockFactory cycleDetectingLockFactory, LockGraphNode lockGraphNode, boolean z) {
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public ReentrantReadWriteLock.ReadLock readLock() {
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public ReentrantReadWriteLock.WriteLock writeLock() {
        }
    }

    private static class ExampleStackTrace extends IllegalStateException {
        static final StackTraceElement[] EMPTY_STACK_TRACE = null;
        static final ImmutableSet<String> EXCLUDED_CLASS_NAMES = null;

        ExampleStackTrace(LockGraphNode lockGraphNode, LockGraphNode lockGraphNode2) {
        }
    }

    private static class LockGraphNode {
        final Map<LockGraphNode, ExampleStackTrace> allowedPriorLocks;
        final Map<LockGraphNode, PotentialDeadlockException> disallowedPriorLocks;
        final String lockName;

        LockGraphNode(String str) {
        }

        private ExampleStackTrace findPathTo(LockGraphNode lockGraphNode, Set<LockGraphNode> set) {
        }

        void checkAcquiredLock(Policy policy, LockGraphNode lockGraphNode) {
        }

        void checkAcquiredLocks(Policy policy, List<LockGraphNode> list) {
        }

        String getLockName() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @Beta
    public static abstract class Policies implements Policy {
        private static final /* synthetic */ Policies[] $VALUES = null;
        public static final Policies DISABLED = null;
        public static final Policies THROW = null;
        public static final Policies WARN = null;

        /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$Policies$1 */
        enum C10421 extends Policies {
            C10421(String str, int i) {
            }

            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policy
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
            }
        }

        /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$Policies$2 */
        enum C10432 extends Policies {
            C10432(String str, int i) {
            }

            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policy
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
            }
        }

        /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$Policies$3 */
        enum C10443 extends Policies {
            C10443(String str, int i) {
            }

            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policy
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
            }
        }

        private static /* synthetic */ Policies[] $values() {
        }

        private Policies(String str, int i) {
        }

        public static Policies valueOf(String str) {
        }

        public static Policies[] values() {
        }

        /* synthetic */ Policies(String str, int i, C10411 c10411) {
        }
    }

    @Beta
    public interface Policy {
        void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException);
    }

    @Beta
    public static final class PotentialDeadlockException extends ExampleStackTrace {
        private final ExampleStackTrace conflictingStackTrace;

        /* synthetic */ PotentialDeadlockException(LockGraphNode lockGraphNode, LockGraphNode lockGraphNode2, ExampleStackTrace exampleStackTrace, C10411 c10411) {
        }

        public ExampleStackTrace getConflictingStackTrace() {
        }

        @Override // java.lang.Throwable
        public String getMessage() {
        }

        private PotentialDeadlockException(LockGraphNode lockGraphNode, LockGraphNode lockGraphNode2, ExampleStackTrace exampleStackTrace) {
        }
    }

    @Beta
    public static final class WithExplicitOrdering<E extends Enum<E>> extends CycleDetectingLockFactory {
        private final Map<E, LockGraphNode> lockGraphNodes;

        @VisibleForTesting
        WithExplicitOrdering(Policy policy, Map<E, LockGraphNode> map) {
        }

        public ReentrantLock newReentrantLock(E e) {
        }

        public ReentrantReadWriteLock newReentrantReadWriteLock(E e) {
        }

        public ReentrantLock newReentrantLock(E e, boolean z) {
        }

        public ReentrantReadWriteLock newReentrantReadWriteLock(E e, boolean z) {
        }
    }

    /* synthetic */ CycleDetectingLockFactory(Policy policy, C10411 c10411) {
    }

    private void aboutToAcquire(CycleDetectingLock cycleDetectingLock) {
    }

    static /* synthetic */ Logger access$100() {
    }

    static /* synthetic */ void access$600(CycleDetectingLockFactory cycleDetectingLockFactory, CycleDetectingLock cycleDetectingLock) {
    }

    static /* synthetic */ void access$700(CycleDetectingLock cycleDetectingLock) {
    }

    @VisibleForTesting
    static <E extends Enum<E>> Map<E, LockGraphNode> createNodes(Class<E> cls) {
    }

    private static String getLockName(Enum<?> r3) {
    }

    private static <E extends Enum<E>> Map<? extends E, LockGraphNode> getOrCreateNodes(Class<E> cls) {
    }

    private static void lockStateChanged(CycleDetectingLock cycleDetectingLock) {
    }

    public static CycleDetectingLockFactory newInstance(Policy policy) {
    }

    public static <E extends Enum<E>> WithExplicitOrdering<E> newInstanceWithExplicitOrdering(Class<E> cls, Policy policy) {
    }

    public ReentrantLock newReentrantLock(String str) {
    }

    public ReentrantReadWriteLock newReentrantReadWriteLock(String str) {
    }

    private CycleDetectingLockFactory(Policy policy) {
    }

    public ReentrantLock newReentrantLock(String str, boolean z) {
    }

    public ReentrantReadWriteLock newReentrantReadWriteLock(String str, boolean z) {
    }

    private class CycleDetectingReentrantReadLock extends ReentrantReadWriteLock.ReadLock {

        @Weak
        final CycleDetectingReentrantReadWriteLock readWriteLock;
        final /* synthetic */ CycleDetectingLockFactory this$0;

        CycleDetectingReentrantReadLock(CycleDetectingLockFactory cycleDetectingLockFactory, CycleDetectingReentrantReadWriteLock cycleDetectingReentrantReadWriteLock) {
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void unlock() {
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
        }
    }

    private class CycleDetectingReentrantWriteLock extends ReentrantReadWriteLock.WriteLock {

        @Weak
        final CycleDetectingReentrantReadWriteLock readWriteLock;
        final /* synthetic */ CycleDetectingLockFactory this$0;

        CycleDetectingReentrantWriteLock(CycleDetectingLockFactory cycleDetectingLockFactory, CycleDetectingReentrantReadWriteLock cycleDetectingReentrantReadWriteLock) {
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void unlock() {
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
        }
    }
}
