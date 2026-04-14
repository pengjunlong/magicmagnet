package com.google.common.eventbus;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class EventBus {
    private static final Logger logger = null;
    private final Dispatcher dispatcher;
    private final SubscriberExceptionHandler exceptionHandler;
    private final Executor executor;
    private final String identifier;
    private final SubscriberRegistry subscribers;

    static final class LoggingHandler implements SubscriberExceptionHandler {
        static final LoggingHandler INSTANCE = null;

        LoggingHandler() {
        }

        private static Logger logger(SubscriberExceptionContext subscriberExceptionContext) {
        }

        private static String message(SubscriberExceptionContext subscriberExceptionContext) {
        }

        @Override // com.google.common.eventbus.SubscriberExceptionHandler
        public void handleException(Throwable th, SubscriberExceptionContext subscriberExceptionContext) {
        }
    }

    public EventBus() {
    }

    final Executor executor() {
    }

    void handleSubscriberException(Throwable th, SubscriberExceptionContext subscriberExceptionContext) {
    }

    public final String identifier() {
    }

    public void post(Object obj) {
    }

    public void register(Object obj) {
    }

    public String toString() {
    }

    public void unregister(Object obj) {
    }

    public EventBus(String str) {
    }

    public EventBus(SubscriberExceptionHandler subscriberExceptionHandler) {
    }

    EventBus(String str, Executor executor, Dispatcher dispatcher, SubscriberExceptionHandler subscriberExceptionHandler) {
    }
}
