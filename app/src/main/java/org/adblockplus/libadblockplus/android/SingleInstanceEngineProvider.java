package org.adblockplus.libadblockplus.android;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.adblockplus.libadblockplus.android.AdblockEngine;
import org.adblockplus.libadblockplus.android.AdblockEngineProvider;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class SingleInstanceEngineProvider implements AdblockEngineProvider {
    private List<AdblockEngineProvider.BeforeEngineDisposedListener> beforeEngineDisposedListeners;
    private List<AdblockEngineProvider.EngineCreatedListener> engineCreatedListeners;
    private List<AdblockEngineProvider.EngineDisposedListener> engineDisposedListeners;
    private AdblockEngine.Factory engineFactory;
    private final ReentrantReadWriteLock engineLock;
    private AtomicReference<AdblockEngine> engineReference;
    private final ExecutorService executorService;
    private AtomicInteger referenceCounter;
    private final ReentrantReadWriteLock referenceCounterLock;
    private final Runnable releaseTask;
    private final Runnable retainTask;
    private final Runnable waitForTheTasksTask;

    /* renamed from: org.adblockplus.libadblockplus.android.SingleInstanceEngineProvider$1 */
    class RunnableC17451 implements Runnable {
        final /* synthetic */ SingleInstanceEngineProvider this$0;

        RunnableC17451(SingleInstanceEngineProvider singleInstanceEngineProvider) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: org.adblockplus.libadblockplus.android.SingleInstanceEngineProvider$2 */
    class RunnableC17462 implements Runnable {
        final /* synthetic */ SingleInstanceEngineProvider this$0;

        RunnableC17462(SingleInstanceEngineProvider singleInstanceEngineProvider) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: org.adblockplus.libadblockplus.android.SingleInstanceEngineProvider$3 */
    class RunnableC17473 implements Runnable {
        final /* synthetic */ SingleInstanceEngineProvider this$0;

        RunnableC17473(SingleInstanceEngineProvider singleInstanceEngineProvider) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private static class ExecutorServiceShutdownHook extends Thread {
        private final ExecutorService executorService;

        /* synthetic */ ExecutorServiceShutdownHook(ExecutorService executorService, RunnableC17451 runnableC17451) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }

        private ExecutorServiceShutdownHook(ExecutorService executorService) {
        }
    }

    public SingleInstanceEngineProvider(AdblockEngine.Factory factory) {
    }

    static /* synthetic */ ReentrantReadWriteLock access$100(SingleInstanceEngineProvider singleInstanceEngineProvider) {
    }

    static /* synthetic */ void access$200(SingleInstanceEngineProvider singleInstanceEngineProvider) {
    }

    static /* synthetic */ void access$300(SingleInstanceEngineProvider singleInstanceEngineProvider) {
    }

    private void createAdblock() {
    }

    private void disposeAdblock() {
    }

    private Future scheduleTask(Runnable runnable) {
    }

    private void waitForTask(Future future) throws RuntimeException {
    }

    @Override // org.adblockplus.libadblockplus.android.AdblockEngineProvider
    public /* bridge */ /* synthetic */ AdblockEngineProvider addBeforeEngineDisposedListener(AdblockEngineProvider.BeforeEngineDisposedListener beforeEngineDisposedListener) {
    }

    @Override // org.adblockplus.libadblockplus.android.AdblockEngineProvider
    public /* bridge */ /* synthetic */ AdblockEngineProvider addEngineCreatedListener(AdblockEngineProvider.EngineCreatedListener engineCreatedListener) {
    }

    @Override // org.adblockplus.libadblockplus.android.AdblockEngineProvider
    public /* bridge */ /* synthetic */ AdblockEngineProvider addEngineDisposedListener(AdblockEngineProvider.EngineDisposedListener engineDisposedListener) {
    }

    @Override // org.adblockplus.libadblockplus.android.AdblockEngineProvider
    public void clearBeforeEngineDisposedListeners() {
    }

    @Override // org.adblockplus.libadblockplus.android.AdblockEngineProvider
    public void clearEngineCreatedListeners() {
    }

    @Override // org.adblockplus.libadblockplus.android.AdblockEngineProvider
    public void clearEngineDisposedListeners() {
    }

    protected ExecutorService createExecutorService() {
    }

    @Override // org.adblockplus.libadblockplus.android.AdblockEngineProvider
    public int getCounter() {
    }

    @Override // org.adblockplus.libadblockplus.android.AdblockEngineProvider
    public AdblockEngine getEngine() {
    }

    @Override // org.adblockplus.libadblockplus.android.AdblockEngineProvider
    public ReentrantReadWriteLock.ReadLock getReadEngineLock() {
    }

    @Override // org.adblockplus.libadblockplus.android.AdblockEngineProvider
    public boolean release() {
    }

    @Override // org.adblockplus.libadblockplus.android.AdblockEngineProvider
    public void removeBeforeEngineDisposedListener(AdblockEngineProvider.BeforeEngineDisposedListener beforeEngineDisposedListener) {
    }

    @Override // org.adblockplus.libadblockplus.android.AdblockEngineProvider
    public void removeEngineCreatedListener(AdblockEngineProvider.EngineCreatedListener engineCreatedListener) {
    }

    @Override // org.adblockplus.libadblockplus.android.AdblockEngineProvider
    public void removeEngineDisposedListener(AdblockEngineProvider.EngineDisposedListener engineDisposedListener) {
    }

    @Override // org.adblockplus.libadblockplus.android.AdblockEngineProvider
    public boolean retain(boolean z) {
    }

    @Override // org.adblockplus.libadblockplus.android.AdblockEngineProvider
    public void waitForReady() {
    }

    @Override // org.adblockplus.libadblockplus.android.AdblockEngineProvider
    public SingleInstanceEngineProvider addBeforeEngineDisposedListener(AdblockEngineProvider.BeforeEngineDisposedListener beforeEngineDisposedListener) {
    }

    @Override // org.adblockplus.libadblockplus.android.AdblockEngineProvider
    public SingleInstanceEngineProvider addEngineCreatedListener(AdblockEngineProvider.EngineCreatedListener engineCreatedListener) {
    }

    @Override // org.adblockplus.libadblockplus.android.AdblockEngineProvider
    public SingleInstanceEngineProvider addEngineDisposedListener(AdblockEngineProvider.EngineDisposedListener engineDisposedListener) {
    }
}
