package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class ExecutionSequencer {
    private ThreadConfinedTaskQueue latestTaskQueue;
    private final AtomicReference<ListenableFuture<Void>> ref;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.util.concurrent.ExecutionSequencer$1 */
    class C10451<T> implements AsyncCallable<T> {
        final /* synthetic */ Callable val$callable;

        C10451(ExecutionSequencer executionSequencer, Callable callable) {
        }

        @Override // com.google.common.util.concurrent.AsyncCallable
        public ListenableFuture<T> call() throws Exception {
        }

        public String toString() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.util.concurrent.ExecutionSequencer$2 */
    class C10462<T> implements AsyncCallable<T> {
        final /* synthetic */ AsyncCallable val$callable;
        final /* synthetic */ TaskNonReentrantExecutor val$taskExecutor;

        C10462(ExecutionSequencer executionSequencer, TaskNonReentrantExecutor taskNonReentrantExecutor, AsyncCallable asyncCallable) {
        }

        @Override // com.google.common.util.concurrent.AsyncCallable
        public ListenableFuture<T> call() throws Exception {
        }

        public String toString() {
        }
    }

    /* renamed from: com.google.common.util.concurrent.ExecutionSequencer$3 */
    class RunnableC10473 implements Runnable {
        final /* synthetic */ SettableFuture val$newFuture;
        final /* synthetic */ ListenableFuture val$oldFuture;
        final /* synthetic */ ListenableFuture val$outputFuture;
        final /* synthetic */ TaskNonReentrantExecutor val$taskExecutor;
        final /* synthetic */ TrustedListenableFutureTask val$taskFuture;

        RunnableC10473(ExecutionSequencer executionSequencer, TrustedListenableFutureTask trustedListenableFutureTask, SettableFuture settableFuture, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, TaskNonReentrantExecutor taskNonReentrantExecutor) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    static final class RunningState {
        private static final /* synthetic */ RunningState[] $VALUES = null;
        public static final RunningState CANCELLED = null;
        public static final RunningState NOT_RUN = null;
        public static final RunningState STARTED = null;

        private static /* synthetic */ RunningState[] $values() {
        }

        private RunningState(String str, int i) {
        }

        public static RunningState valueOf(String str) {
        }

        public static RunningState[] values() {
        }
    }

    private static final class TaskNonReentrantExecutor extends AtomicReference<RunningState> implements Executor, Runnable {
        Executor delegate;
        ExecutionSequencer sequencer;
        Thread submitting;
        Runnable task;

        /* synthetic */ TaskNonReentrantExecutor(Executor executor, ExecutionSequencer executionSequencer, C10451 c10451) {
        }

        static /* synthetic */ boolean access$200(TaskNonReentrantExecutor taskNonReentrantExecutor) {
        }

        static /* synthetic */ boolean access$300(TaskNonReentrantExecutor taskNonReentrantExecutor) {
        }

        private boolean trySetCancelled() {
        }

        private boolean trySetStarted() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        private TaskNonReentrantExecutor(Executor executor, ExecutionSequencer executionSequencer) {
        }
    }

    private static final class ThreadConfinedTaskQueue {
        Executor nextExecutor;
        Runnable nextTask;
        Thread thread;

        private ThreadConfinedTaskQueue() {
        }

        /* synthetic */ ThreadConfinedTaskQueue(C10451 c10451) {
        }
    }

    private ExecutionSequencer() {
    }

    static /* synthetic */ ThreadConfinedTaskQueue access$400(ExecutionSequencer executionSequencer) {
    }

    static /* synthetic */ ThreadConfinedTaskQueue access$402(ExecutionSequencer executionSequencer, ThreadConfinedTaskQueue threadConfinedTaskQueue) {
    }

    public static ExecutionSequencer create() {
    }

    public <T> ListenableFuture<T> submit(Callable<T> callable, Executor executor) {
    }

    public <T> ListenableFuture<T> submitAsync(AsyncCallable<T> asyncCallable, Executor executor) {
    }
}
