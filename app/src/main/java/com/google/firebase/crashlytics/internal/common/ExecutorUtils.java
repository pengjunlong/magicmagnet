package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class ExecutorUtils {
    private static final long DEFAULT_TERMINATION_TIMEOUT = 2;

    /* renamed from: com.google.firebase.crashlytics.internal.common.ExecutorUtils$1 */
    class ThreadFactoryC11121 implements ThreadFactory {
        final /* synthetic */ AtomicLong val$count;
        final /* synthetic */ String val$threadNameTemplate;

        /* renamed from: com.google.firebase.crashlytics.internal.common.ExecutorUtils$1$1, reason: invalid class name */
        class AnonymousClass1 extends BackgroundPriorityRunnable {
            final /* synthetic */ ThreadFactoryC11121 this$0;
            final /* synthetic */ Runnable val$runnable;

            AnonymousClass1(ThreadFactoryC11121 threadFactoryC11121, Runnable runnable) {
            }

            @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
            public void onRun() {
            }
        }

        ThreadFactoryC11121(String str, AtomicLong atomicLong) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.ExecutorUtils$2 */
    class C11132 extends BackgroundPriorityRunnable {
        final /* synthetic */ ExecutorService val$service;
        final /* synthetic */ String val$serviceName;
        final /* synthetic */ long val$terminationTimeout;
        final /* synthetic */ TimeUnit val$timeUnit;

        C11132(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        }

        @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
        public void onRun() {
        }
    }

    private ExecutorUtils() {
    }

    private static void addDelayedShutdownHook(String str, ExecutorService executorService) {
    }

    public static ExecutorService buildSingleThreadExecutorService(String str) {
    }

    public static ScheduledExecutorService buildSingleThreadScheduledExecutorService(String str) {
    }

    public static ThreadFactory getNamedThreadFactory(String str) {
    }

    private static ExecutorService newSingleThreadExecutor(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
    }

    private static void addDelayedShutdownHook(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
    }
}
