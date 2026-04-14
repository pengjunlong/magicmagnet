package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class ConfigCacheClient {
    private static final Executor DIRECT_EXECUTOR = null;
    static final long DISK_READ_TIMEOUT_IN_SECONDS = 5;
    private static final Map<String, ConfigCacheClient> clientInstances = null;
    private Task<ConfigContainer> cachedContainerTask;
    private final ExecutorService executorService;
    private final ConfigStorageClient storageClient;

    private static class AwaitListener<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {
        private final CountDownLatch latch;

        private AwaitListener() {
        }

        public void await() throws InterruptedException {
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public void onCanceled() {
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(Exception exc) {
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public void onSuccess(TResult tresult) {
        }

        public boolean await(long j, TimeUnit timeUnit) throws InterruptedException {
        }

        /* synthetic */ AwaitListener(C12031 c12031) {
        }
    }

    private ConfigCacheClient(ExecutorService executorService, ConfigStorageClient configStorageClient) {
    }

    private static <TResult> TResult await(Task<TResult> task, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
    }

    public static synchronized void clearInstancesForTest() {
    }

    public static /* synthetic */ Void dbpqdHhmDSIHIJiwc1ll1l1(ConfigCacheClient configCacheClient, ConfigContainer configContainer) {
    }

    public static /* synthetic */ Task dpbdbdpbLwkLpObyKsq1lll1(ConfigCacheClient configCacheClient, boolean z, ConfigContainer configContainer, Void r3) {
    }

    public static synchronized ConfigCacheClient getInstance(ExecutorService executorService, ConfigStorageClient configStorageClient) {
    }

    private /* synthetic */ Void lambda$put$0(ConfigContainer configContainer) throws Exception {
    }

    private /* synthetic */ Task lambda$put$1(boolean z, ConfigContainer configContainer, Void r3) throws Exception {
    }

    private synchronized void updateInMemoryConfigContainer(ConfigContainer configContainer) {
    }

    public void clear() {
    }

    public synchronized Task<ConfigContainer> get() {
    }

    public ConfigContainer getBlocking() {
    }

    synchronized Task<ConfigContainer> getCachedContainerTask() {
    }

    public Task<ConfigContainer> put(ConfigContainer configContainer) {
    }

    ConfigContainer getBlocking(long j) {
    }

    public Task<ConfigContainer> put(ConfigContainer configContainer, boolean z) {
    }
}
