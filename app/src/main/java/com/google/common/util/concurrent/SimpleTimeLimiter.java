package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Beta
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class SimpleTimeLimiter implements TimeLimiter {
    private final ExecutorService executor;

    /* renamed from: com.google.common.util.concurrent.SimpleTimeLimiter$1 */
    class C10681 implements InvocationHandler {
        final /* synthetic */ SimpleTimeLimiter this$0;
        final /* synthetic */ Set val$interruptibleMethods;
        final /* synthetic */ Object val$target;
        final /* synthetic */ long val$timeoutDuration;
        final /* synthetic */ TimeUnit val$timeoutUnit;

        /* renamed from: com.google.common.util.concurrent.SimpleTimeLimiter$1$1, reason: invalid class name */
        class AnonymousClass1 implements Callable<Object> {
            final /* synthetic */ C10681 this$1;
            final /* synthetic */ Object[] val$args;
            final /* synthetic */ Method val$method;

            AnonymousClass1(C10681 c10681, Method method, Object[] objArr) {
            }

            @Override // java.util.concurrent.Callable
            public Object call() throws Exception {
            }
        }

        C10681(SimpleTimeLimiter simpleTimeLimiter, Object obj, long j, TimeUnit timeUnit, Set set) {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        }
    }

    private SimpleTimeLimiter(ExecutorService executorService) {
    }

    static /* synthetic */ Exception access$000(Exception exc, boolean z) throws Exception {
    }

    static /* synthetic */ Object access$100(SimpleTimeLimiter simpleTimeLimiter, Callable callable, long j, TimeUnit timeUnit, boolean z) throws Exception {
    }

    private <T> T callWithTimeout(Callable<T> callable, long j, TimeUnit timeUnit, boolean z) throws Exception {
    }

    private static void checkPositiveTimeout(long j) {
    }

    public static SimpleTimeLimiter create(ExecutorService executorService) {
    }

    private static boolean declaresInterruptedEx(Method method) {
    }

    private static Set<Method> findInterruptibleMethods(Class<?> cls) {
    }

    private static Exception throwCause(Exception exc, boolean z) throws Exception {
    }

    private void wrapAndThrowExecutionExceptionOrError(Throwable th) throws ExecutionException {
    }

    private void wrapAndThrowRuntimeExecutionExceptionOrError(Throwable th) {
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    @CanIgnoreReturnValue
    public <T> T callUninterruptiblyWithTimeout(Callable<T> callable, long j, TimeUnit timeUnit) throws TimeoutException, ExecutionException {
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public <T> T newProxy(T t, Class<T> cls, long j, TimeUnit timeUnit) {
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runUninterruptiblyWithTimeout(Runnable runnable, long j, TimeUnit timeUnit) throws TimeoutException {
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runWithTimeout(Runnable runnable, long j, TimeUnit timeUnit) throws TimeoutException, InterruptedException {
    }

    private static <T> T newProxy(Class<T> cls, InvocationHandler invocationHandler) {
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    @CanIgnoreReturnValue
    public <T> T callWithTimeout(Callable<T> callable, long j, TimeUnit timeUnit) throws TimeoutException, InterruptedException, ExecutionException {
    }
}
