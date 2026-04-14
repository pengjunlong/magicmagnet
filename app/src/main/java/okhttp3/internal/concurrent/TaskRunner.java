package okhttp3.internal.concurrent;

import java.util.List;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import kotlin.Metadata;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class TaskRunner {
    public static final Companion Companion = null;
    public static final TaskRunner INSTANCE = null;
    private static final Logger logger = null;
    private final Backend backend;
    private final List<TaskQueue> busyQueues;
    private boolean coordinatorWaiting;
    private long coordinatorWakeUpAt;
    private int nextQueueName;
    private final List<TaskQueue> readyQueues;
    private final Runnable runnable;

    @Metadata
    public interface Backend {
        void beforeTask(TaskRunner taskRunner);

        void coordinatorNotify(TaskRunner taskRunner);

        void coordinatorWait(TaskRunner taskRunner, long j);

        void execute(Runnable runnable);

        long nanoTime();
    }

    @xc0
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public final Logger getLogger() {
        }
    }

    @Metadata
    public static final class RealBackend implements Backend {
        private final ThreadPoolExecutor executor;

        public RealBackend(ThreadFactory threadFactory) {
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void beforeTask(TaskRunner taskRunner) {
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorNotify(TaskRunner taskRunner) {
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorWait(TaskRunner taskRunner, long j) throws InterruptedException {
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void execute(Runnable runnable) {
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public long nanoTime() {
        }

        public final void shutdown() {
        }
    }

    public TaskRunner(Backend backend) {
    }

    public static final /* synthetic */ Logger access$getLogger$cp() {
    }

    public static final /* synthetic */ void access$runTask(TaskRunner taskRunner, Task task) {
    }

    private final void afterRun(Task task, long j) {
    }

    private final void beforeRun(Task task) {
    }

    private final void runTask(Task task) {
    }

    public final List<TaskQueue> activeQueues() {
    }

    public final Task awaitTaskToRun() {
    }

    public final void cancelAll() {
    }

    public final Backend getBackend() {
    }

    public final void kickCoordinator$okhttp(TaskQueue taskQueue) {
    }

    public final TaskQueue newQueue() {
    }
}
