package okhttp3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import okhttp3.internal.connection.RealCall;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class Dispatcher {
    private ExecutorService executorServiceOrNull;
    private Runnable idleCallback;
    private int maxRequests;
    private int maxRequestsPerHost;
    private final ArrayDeque<RealCall.AsyncCall> readyAsyncCalls;
    private final ArrayDeque<RealCall.AsyncCall> runningAsyncCalls;
    private final ArrayDeque<RealCall> runningSyncCalls;

    public Dispatcher() {
    }

    private final RealCall.AsyncCall findExistingCallWithHost(String str) {
    }

    private final <T> void finished(Deque<T> deque, T t) {
    }

    private final boolean promoteAndExecute() {
    }

    /* renamed from: -deprecated_executorService, reason: not valid java name */
    public final ExecutorService m925deprecated_executorService() {
    }

    public final synchronized void cancelAll() {
    }

    public final void enqueue$okhttp(RealCall.AsyncCall asyncCall) {
    }

    public final synchronized void executed$okhttp(RealCall realCall) {
    }

    public final synchronized ExecutorService executorService() {
    }

    public final void finished$okhttp(RealCall.AsyncCall asyncCall) {
    }

    public final synchronized Runnable getIdleCallback() {
    }

    public final synchronized int getMaxRequests() {
    }

    public final synchronized int getMaxRequestsPerHost() {
    }

    public final synchronized List<Call> queuedCalls() {
    }

    public final synchronized int queuedCallsCount() {
    }

    public final synchronized List<Call> runningCalls() {
    }

    public final synchronized int runningCallsCount() {
    }

    public final synchronized void setIdleCallback(Runnable runnable) {
    }

    public final void setMaxRequests(int i) {
    }

    public final void setMaxRequestsPerHost(int i) {
    }

    public final void finished$okhttp(RealCall realCall) {
    }

    public Dispatcher(ExecutorService executorService) {
    }
}
