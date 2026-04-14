package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Supplier;
import java.util.concurrent.Callable;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Callables {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.util.concurrent.Callables$1 */
    class CallableC10171<T> implements Callable<T> {
        final /* synthetic */ Object val$value;

        CallableC10171(Object obj) {
        }

        @Override // java.util.concurrent.Callable
        @ParametricNullness
        public T call() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.util.concurrent.Callables$2 */
    class C10182<T> implements AsyncCallable<T> {
        final /* synthetic */ Callable val$callable;
        final /* synthetic */ ListeningExecutorService val$listeningExecutorService;

        C10182(ListeningExecutorService listeningExecutorService, Callable callable) {
        }

        @Override // com.google.common.util.concurrent.AsyncCallable
        public ListenableFuture<T> call() throws Exception {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.util.concurrent.Callables$3 */
    class CallableC10193<T> implements Callable<T> {
        final /* synthetic */ Callable val$callable;
        final /* synthetic */ Supplier val$nameSupplier;

        CallableC10193(Supplier supplier, Callable callable) {
        }

        @Override // java.util.concurrent.Callable
        @ParametricNullness
        public T call() throws Exception {
        }
    }

    /* renamed from: com.google.common.util.concurrent.Callables$4 */
    class RunnableC10204 implements Runnable {
        final /* synthetic */ Supplier val$nameSupplier;
        final /* synthetic */ Runnable val$task;

        RunnableC10204(Supplier supplier, Runnable runnable) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private Callables() {
    }

    static /* synthetic */ boolean access$000(String str, Thread thread) {
    }

    @Beta
    @GwtIncompatible
    public static <T> AsyncCallable<T> asAsyncCallable(Callable<T> callable, ListeningExecutorService listeningExecutorService) {
    }

    public static <T> Callable<T> returning(@ParametricNullness T t) {
    }

    @GwtIncompatible
    static <T> Callable<T> threadRenaming(Callable<T> callable, Supplier<String> supplier) {
    }

    @GwtIncompatible
    private static boolean trySetName(String str, Thread thread) {
    }

    @GwtIncompatible
    static Runnable threadRenaming(Runnable runnable, Supplier<String> supplier) {
    }
}
