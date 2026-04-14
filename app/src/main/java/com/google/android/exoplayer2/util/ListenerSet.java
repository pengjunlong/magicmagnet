package com.google.android.exoplayer2.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.util.FlagSet;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class ListenerSet<T> {
    private static final int MSG_ITERATION_FINISHED = 0;
    private final Clock clock;
    private final ArrayDeque<Runnable> flushingEvents;
    private final HandlerWrapper handler;
    private final IterationFinishedEvent<T> iterationFinishedEvent;
    private final CopyOnWriteArraySet<ListenerHolder<T>> listeners;
    private final ArrayDeque<Runnable> queuedEvents;
    private boolean released;
    private final Object releasedLock;
    private boolean throwsWhenUsingWrongThread;

    public interface Event<T> {
        void invoke(T t);
    }

    public interface IterationFinishedEvent<T> {
        void invoke(T t, FlagSet flagSet);
    }

    private static final class ListenerHolder<T> {
        private FlagSet.Builder flagsBuilder;
        public final T listener;
        private boolean needsIterationFinishedEvent;
        private boolean released;

        public ListenerHolder(T t) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public void invoke(int i, Event<T> event) {
        }

        public void iterationFinished(IterationFinishedEvent<T> iterationFinishedEvent) {
        }

        public void release(IterationFinishedEvent<T> iterationFinishedEvent) {
        }
    }

    public ListenerSet(Looper looper, Clock clock, IterationFinishedEvent<T> iterationFinishedEvent) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(CopyOnWriteArraySet copyOnWriteArraySet, int i, Event event) {
    }

    public static /* synthetic */ boolean dpbdbdpbLwkLpObyKsq1lll1(ListenerSet listenerSet, Message message) {
    }

    private boolean handleMessage(Message message) {
    }

    private static /* synthetic */ void lambda$queueEvent$0(CopyOnWriteArraySet copyOnWriteArraySet, int i, Event event) {
    }

    private void verifyCurrentThread() {
    }

    public void add(T t) {
    }

    public void clear() {
    }

    public ListenerSet<T> copy(Looper looper, IterationFinishedEvent<T> iterationFinishedEvent) {
    }

    public void flushEvents() {
    }

    public void queueEvent(int i, Event<T> event) {
    }

    public void release() {
    }

    public void remove(T t) {
    }

    public void sendEvent(int i, Event<T> event) {
    }

    @Deprecated
    public void setThrowsWhenUsingWrongThread(boolean z) {
    }

    public int size() {
    }

    private ListenerSet(CopyOnWriteArraySet<ListenerHolder<T>> copyOnWriteArraySet, Looper looper, Clock clock, IterationFinishedEvent<T> iterationFinishedEvent) {
    }

    public ListenerSet<T> copy(Looper looper, Clock clock, IterationFinishedEvent<T> iterationFinishedEvent) {
    }
}
