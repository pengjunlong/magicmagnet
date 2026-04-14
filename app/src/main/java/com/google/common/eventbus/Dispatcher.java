package com.google.common.eventbus;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class Dispatcher {

    private static final class ImmediateDispatcher extends Dispatcher {
        private static final ImmediateDispatcher INSTANCE = null;

        private ImmediateDispatcher() {
        }

        static /* synthetic */ ImmediateDispatcher access$200() {
        }

        @Override // com.google.common.eventbus.Dispatcher
        void dispatch(Object obj, Iterator<Subscriber> it) {
        }
    }

    Dispatcher() {
    }

    static Dispatcher immediate() {
    }

    static Dispatcher legacyAsync() {
    }

    static Dispatcher perThreadDispatchQueue() {
    }

    abstract void dispatch(Object obj, Iterator<Subscriber> it);

    private static final class LegacyAsyncDispatcher extends Dispatcher {
        private final ConcurrentLinkedQueue<EventWithSubscriber> queue;

        private static final class EventWithSubscriber {
            private final Object event;
            private final Subscriber subscriber;

            /* synthetic */ EventWithSubscriber(Object obj, Subscriber subscriber, C08641 c08641) {
            }

            static /* synthetic */ Object access$700(EventWithSubscriber eventWithSubscriber) {
            }

            static /* synthetic */ Subscriber access$800(EventWithSubscriber eventWithSubscriber) {
            }

            private EventWithSubscriber(Object obj, Subscriber subscriber) {
            }
        }

        private LegacyAsyncDispatcher() {
        }

        @Override // com.google.common.eventbus.Dispatcher
        void dispatch(Object obj, Iterator<Subscriber> it) {
        }

        /* synthetic */ LegacyAsyncDispatcher(C08641 c08641) {
        }
    }

    private static final class PerThreadQueuedDispatcher extends Dispatcher {
        private final ThreadLocal<Boolean> dispatching;
        private final ThreadLocal<Queue<Event>> queue;

        /* renamed from: com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher$1 */
        class C08651 extends ThreadLocal<Queue<Event>> {
            C08651(PerThreadQueuedDispatcher perThreadQueuedDispatcher) {
            }

            @Override // java.lang.ThreadLocal
            protected /* bridge */ /* synthetic */ Queue<Event> initialValue() {
            }

            @Override // java.lang.ThreadLocal
            /* renamed from: initialValue, reason: avoid collision after fix types in other method */
            protected Queue<Event> initialValue2() {
            }
        }

        /* renamed from: com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher$2 */
        class C08662 extends ThreadLocal<Boolean> {
            C08662(PerThreadQueuedDispatcher perThreadQueuedDispatcher) {
            }

            @Override // java.lang.ThreadLocal
            protected /* bridge */ /* synthetic */ Boolean initialValue() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.lang.ThreadLocal
            protected Boolean initialValue() {
            }
        }

        private static final class Event {
            private final Object event;
            private final Iterator<Subscriber> subscribers;

            /* synthetic */ Event(Object obj, Iterator it, C08641 c08641) {
            }

            static /* synthetic */ Iterator access$400(Event event) {
            }

            static /* synthetic */ Object access$500(Event event) {
            }

            private Event(Object obj, Iterator<Subscriber> it) {
            }
        }

        private PerThreadQueuedDispatcher() {
        }

        @Override // com.google.common.eventbus.Dispatcher
        void dispatch(Object obj, Iterator<Subscriber> it) {
        }

        /* synthetic */ PerThreadQueuedDispatcher(C08641 c08641) {
        }
    }
}
