package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;
import java.lang.Thread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

@CanIgnoreReturnValue
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class ThreadFactoryBuilder {
    private ThreadFactory backingThreadFactory;
    private Boolean daemon;
    private String nameFormat;
    private Integer priority;
    private Thread.UncaughtExceptionHandler uncaughtExceptionHandler;

    /* renamed from: com.google.common.util.concurrent.ThreadFactoryBuilder$1 */
    class ThreadFactoryC10761 implements ThreadFactory {
        final /* synthetic */ ThreadFactory val$backingThreadFactory;
        final /* synthetic */ AtomicLong val$count;
        final /* synthetic */ Boolean val$daemon;
        final /* synthetic */ String val$nameFormat;
        final /* synthetic */ Integer val$priority;
        final /* synthetic */ Thread.UncaughtExceptionHandler val$uncaughtExceptionHandler;

        ThreadFactoryC10761(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
        }
    }

    static /* synthetic */ String access$000(String str, Object[] objArr) {
    }

    private static ThreadFactory doBuild(ThreadFactoryBuilder threadFactoryBuilder) {
    }

    private static String format(String str, Object... objArr) {
    }

    @CheckReturnValue
    public ThreadFactory build() {
    }

    public ThreadFactoryBuilder setDaemon(boolean z) {
    }

    public ThreadFactoryBuilder setNameFormat(String str) {
    }

    public ThreadFactoryBuilder setPriority(int i) {
    }

    public ThreadFactoryBuilder setThreadFactory(ThreadFactory threadFactory) {
    }

    public ThreadFactoryBuilder setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
    }
}
