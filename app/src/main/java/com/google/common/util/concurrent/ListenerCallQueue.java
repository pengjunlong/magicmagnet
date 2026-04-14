package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class ListenerCallQueue<L> {
    private static final Logger logger = null;
    private final List<PerListenerQueue<L>> listeners;

    interface Event<L> {
        void call(L l);
    }

    private static final class PerListenerQueue<L> implements Runnable {
        final Executor executor;

        @GuardedBy("this")
        boolean isThreadScheduled;

        @GuardedBy("this")
        final Queue<Object> labelQueue;
        final L listener;

        @GuardedBy("this")
        final Queue<Event<L>> waitQueue;

        PerListenerQueue(L l, Executor executor) {
        }

        synchronized void add(Event<L> event, Object obj) {
        }

        void dispatch() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    ListenerCallQueue() {
    }

    static /* synthetic */ Logger access$000() {
    }

    private void enqueueHelper(Event<L> event, Object obj) {
    }

    public void addListener(L l, Executor executor) {
    }

    public void dispatch() {
    }

    public void enqueue(Event<L> event) {
    }

    public void enqueue(Event<L> event, String str) {
    }
}
