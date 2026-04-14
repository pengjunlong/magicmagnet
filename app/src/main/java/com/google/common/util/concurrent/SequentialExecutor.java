package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.RetainedWith;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class SequentialExecutor implements Executor {
    private static final Logger log = null;
    private final Executor executor;

    @GuardedBy("queue")
    private final Deque<Runnable> queue;

    @RetainedWith
    private final QueueWorker worker;

    @GuardedBy("queue")
    private long workerRunCount;

    @GuardedBy("queue")
    private WorkerRunningState workerRunningState;

    /* renamed from: com.google.common.util.concurrent.SequentialExecutor$1 */
    class RunnableC10631 implements Runnable {
        final /* synthetic */ Runnable val$task;

        RunnableC10631(SequentialExecutor sequentialExecutor, Runnable runnable) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
        }
    }

    private final class QueueWorker implements Runnable {
        Runnable task;
        final /* synthetic */ SequentialExecutor this$0;

        private QueueWorker(SequentialExecutor sequentialExecutor) {
        }

        private void workOnQueue() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
        }

        /* synthetic */ QueueWorker(SequentialExecutor sequentialExecutor, RunnableC10631 runnableC10631) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    static final class WorkerRunningState {
        private static final /* synthetic */ WorkerRunningState[] $VALUES = null;
        public static final WorkerRunningState IDLE = null;
        public static final WorkerRunningState QUEUED = null;
        public static final WorkerRunningState QUEUING = null;
        public static final WorkerRunningState RUNNING = null;

        private static /* synthetic */ WorkerRunningState[] $values() {
        }

        private WorkerRunningState(String str, int i) {
        }

        public static WorkerRunningState valueOf(String str) {
        }

        public static WorkerRunningState[] values() {
        }
    }

    SequentialExecutor(Executor executor) {
    }

    static /* synthetic */ Deque access$100(SequentialExecutor sequentialExecutor) {
    }

    static /* synthetic */ WorkerRunningState access$200(SequentialExecutor sequentialExecutor) {
    }

    static /* synthetic */ WorkerRunningState access$202(SequentialExecutor sequentialExecutor, WorkerRunningState workerRunningState) {
    }

    static /* synthetic */ long access$308(SequentialExecutor sequentialExecutor) {
    }

    static /* synthetic */ Logger access$400() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
    }

    public String toString() {
    }
}
