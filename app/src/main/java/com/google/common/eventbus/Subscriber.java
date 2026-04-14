package com.google.common.eventbus;

import com.google.common.annotations.VisibleForTesting;
import com.google.j2objc.annotations.Weak;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class Subscriber {

    @Weak
    private EventBus bus;
    private final Executor executor;
    private final Method method;

    @VisibleForTesting
    final Object target;

    /* renamed from: com.google.common.eventbus.Subscriber$1 */
    class RunnableC08671 implements Runnable {
        final /* synthetic */ Subscriber this$0;
        final /* synthetic */ Object val$event;

        RunnableC08671(Subscriber subscriber, Object obj) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    @VisibleForTesting
    static final class SynchronizedSubscriber extends Subscriber {
        /* synthetic */ SynchronizedSubscriber(EventBus eventBus, Object obj, Method method, RunnableC08671 runnableC08671) {
        }

        @Override // com.google.common.eventbus.Subscriber
        void invokeSubscriberMethod(Object obj) throws InvocationTargetException {
        }

        private SynchronizedSubscriber(EventBus eventBus, Object obj, Method method) {
        }
    }

    /* synthetic */ Subscriber(EventBus eventBus, Object obj, Method method, RunnableC08671 runnableC08671) {
    }

    static /* synthetic */ SubscriberExceptionContext access$100(Subscriber subscriber, Object obj) {
    }

    static /* synthetic */ EventBus access$200(Subscriber subscriber) {
    }

    private SubscriberExceptionContext context(Object obj) {
    }

    static Subscriber create(EventBus eventBus, Object obj, Method method) {
    }

    private static boolean isDeclaredThreadSafe(Method method) {
    }

    final void dispatchEvent(Object obj) {
    }

    public final boolean equals(Object obj) {
    }

    public final int hashCode() {
    }

    @VisibleForTesting
    void invokeSubscriberMethod(Object obj) throws InvocationTargetException {
    }

    private Subscriber(EventBus eventBus, Object obj, Method method) {
    }
}
