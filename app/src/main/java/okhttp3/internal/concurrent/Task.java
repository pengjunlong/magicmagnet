package okhttp3.internal.concurrent;

import kotlin.Metadata;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class Task {
    private final boolean cancelable;
    private final String name;
    private long nextExecuteNanoTime;
    private TaskQueue queue;

    public Task(String str, boolean z) {
    }

    public final boolean getCancelable() {
    }

    public final String getName() {
    }

    public final long getNextExecuteNanoTime$okhttp() {
    }

    public final TaskQueue getQueue$okhttp() {
    }

    public final void initQueue$okhttp(TaskQueue taskQueue) {
    }

    public abstract long runOnce();

    public final void setNextExecuteNanoTime$okhttp(long j) {
    }

    public final void setQueue$okhttp(TaskQueue taskQueue) {
    }

    public String toString() {
    }

    public /* synthetic */ Task(String str, boolean z, int i, pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
    }
}
