package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Utils {
    private static final ExecutorService TASK_CONTINUATION_EXECUTOR_SERVICE = null;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.firebase.crashlytics.internal.common.Utils$1 */
    class C11151<T> implements Continuation<T, Void> {
        final /* synthetic */ TaskCompletionSource val$result;

        C11151(TaskCompletionSource taskCompletionSource) {
        }

        @Override // com.google.android.gms.tasks.Continuation
        public /* bridge */ /* synthetic */ Void then(Task task) throws Exception {
        }

        @Override // com.google.android.gms.tasks.Continuation
        /* renamed from: then, reason: avoid collision after fix types in other method */
        public Void then2(Task<T> task) throws Exception {
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.Utils$2 */
    class RunnableC11162 implements Runnable {
        final /* synthetic */ Callable val$callable;
        final /* synthetic */ TaskCompletionSource val$tcs;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* renamed from: com.google.firebase.crashlytics.internal.common.Utils$2$1, reason: invalid class name */
        class AnonymousClass1<T> implements Continuation<T, Void> {
            final /* synthetic */ RunnableC11162 this$0;

            AnonymousClass1(RunnableC11162 runnableC11162) {
            }

            @Override // com.google.android.gms.tasks.Continuation
            public /* bridge */ /* synthetic */ Void then(Task task) throws Exception {
            }

            @Override // com.google.android.gms.tasks.Continuation
            /* renamed from: then, reason: avoid collision after fix types in other method */
            public Void then2(Task<T> task) throws Exception {
            }
        }

        RunnableC11162(Callable callable, TaskCompletionSource taskCompletionSource) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private Utils() {
    }

    public static <T> T awaitEvenIfOnMainThread(Task<T> task) throws InterruptedException, TimeoutException {
    }

    public static <T> Task<T> callTask(Executor executor, Callable<Task<T>> callable) {
    }

    public static /* synthetic */ Object dbpqdHhmDSIHIJiwc1ll1l1(CountDownLatch countDownLatch, Task task) {
    }

    private static /* synthetic */ Object lambda$awaitEvenIfOnMainThread$0(CountDownLatch countDownLatch, Task task) throws Exception {
    }

    public static <T> Task<T> race(Task<T> task, Task<T> task2) {
    }
}
