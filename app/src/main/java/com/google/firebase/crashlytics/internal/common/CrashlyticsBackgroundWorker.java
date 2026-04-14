package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class CrashlyticsBackgroundWorker {
    private final Executor executor;
    private final ThreadLocal<Boolean> isExecutorThread;
    private Task<Void> tail;
    private final Object tailLock;

    /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsBackgroundWorker$1 */
    class RunnableC10951 implements Runnable {
        final /* synthetic */ CrashlyticsBackgroundWorker this$0;

        RunnableC10951(CrashlyticsBackgroundWorker crashlyticsBackgroundWorker) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsBackgroundWorker$2 */
    class CallableC10962 implements Callable<Void> {
        final /* synthetic */ CrashlyticsBackgroundWorker this$0;
        final /* synthetic */ Runnable val$runnable;

        CallableC10962(CrashlyticsBackgroundWorker crashlyticsBackgroundWorker, Runnable runnable) {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Void call() throws Exception {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: call, reason: avoid collision after fix types in other method */
        public Void call2() throws Exception {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsBackgroundWorker$3 */
    class C10973<T> implements Continuation<Void, T> {
        final /* synthetic */ CrashlyticsBackgroundWorker this$0;
        final /* synthetic */ Callable val$callable;

        C10973(CrashlyticsBackgroundWorker crashlyticsBackgroundWorker, Callable callable) {
        }

        @Override // com.google.android.gms.tasks.Continuation
        public T then(Task<Void> task) throws Exception {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsBackgroundWorker$4 */
    class C10984<T> implements Continuation<T, Void> {
        final /* synthetic */ CrashlyticsBackgroundWorker this$0;

        C10984(CrashlyticsBackgroundWorker crashlyticsBackgroundWorker) {
        }

        @Override // com.google.android.gms.tasks.Continuation
        public /* bridge */ /* synthetic */ Void then(Task task) throws Exception {
        }

        @Override // com.google.android.gms.tasks.Continuation
        /* renamed from: then, reason: avoid collision after fix types in other method */
        public Void then2(Task<T> task) throws Exception {
        }
    }

    public CrashlyticsBackgroundWorker(Executor executor) {
    }

    static /* synthetic */ ThreadLocal access$000(CrashlyticsBackgroundWorker crashlyticsBackgroundWorker) {
    }

    private <T> Task<Void> ignoreResult(Task<T> task) {
    }

    private boolean isRunningOnThread() {
    }

    private <T> Continuation<Void, T> newContinuation(Callable<T> callable) {
    }

    public void checkRunningOnThread() {
    }

    public Executor getExecutor() {
    }

    Task<Void> submit(Runnable runnable) {
    }

    public <T> Task<T> submitTask(Callable<Task<T>> callable) {
    }

    public <T> Task<T> submit(Callable<T> callable) {
    }
}
