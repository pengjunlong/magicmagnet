package okhttp3.internal.concurrent;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import p000.mv1;
import p000.qh;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class TaskQueue {
    private Task activeTask;
    private boolean cancelActiveTask;
    private final List<Task> futureTasks;
    private final String name;
    private boolean shutdown;
    private final TaskRunner taskRunner;

    @xc0
    private static final class AwaitIdleTask extends Task {
        private final CountDownLatch latch;

        public final CountDownLatch getLatch() {
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
        }
    }

    public TaskQueue(TaskRunner taskRunner, String str) {
    }

    public static /* synthetic */ void execute$default(TaskQueue taskQueue, String str, long j, boolean z, qh qhVar, int i, Object obj) {
    }

    public static /* synthetic */ void schedule$default(TaskQueue taskQueue, Task task, long j, int i, Object obj) {
    }

    public final void cancelAll() {
    }

    public final boolean cancelAllAndDecide$okhttp() {
    }

    public final void execute(String str, long j, boolean z, qh<mv1> qhVar) {
    }

    public final Task getActiveTask$okhttp() {
    }

    public final boolean getCancelActiveTask$okhttp() {
    }

    public final List<Task> getFutureTasks$okhttp() {
    }

    public final String getName$okhttp() {
    }

    public final List<Task> getScheduledTasks() {
    }

    public final boolean getShutdown$okhttp() {
    }

    public final TaskRunner getTaskRunner$okhttp() {
    }

    public final CountDownLatch idleLatch() {
    }

    public final void schedule(Task task, long j) {
    }

    public final boolean scheduleAndDecide$okhttp(Task task, long j, boolean z) {
    }

    public final void setActiveTask$okhttp(Task task) {
    }

    public final void setCancelActiveTask$okhttp(boolean z) {
    }

    public final void setShutdown$okhttp(boolean z) {
    }

    public final void shutdown() {
    }

    public String toString() {
    }

    public static /* synthetic */ void schedule$default(TaskQueue taskQueue, String str, long j, qh qhVar, int i, Object obj) {
    }

    public final void schedule(String str, long j, qh<Long> qhVar) {
    }
}
