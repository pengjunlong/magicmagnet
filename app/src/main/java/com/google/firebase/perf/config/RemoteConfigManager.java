package com.google.firebase.perf.config;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.inject.Provider;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Optional;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

@Keep
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = 0;
    private static final RemoteConfigManager instance = null;
    private static final AndroidLogger logger = null;
    private final ConcurrentHashMap<String, FirebaseRemoteConfigValue> allRcConfigMap;
    private final Executor executor;
    private FirebaseRemoteConfig firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private Provider<RemoteConfigComponent> firebaseRemoteConfigProvider;

    private RemoteConfigManager() {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(RemoteConfigManager remoteConfigManager, Boolean bool) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(RemoteConfigManager remoteConfigManager, Exception exc) {
    }

    public static RemoteConfigManager getInstance() {
    }

    private FirebaseRemoteConfigValue getRemoteConfigValue(String str) {
    }

    @VisibleForTesting
    public static int getVersionCode(Context context) {
    }

    /* renamed from: lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0 */
    private /* synthetic */ void m53xc904e813(Boolean bool) {
    }

    /* renamed from: lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1 */
    private /* synthetic */ void m54xc904e814(Exception exc) {
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
    }

    private void triggerRemoteConfigFetchIfNecessary() {
    }

    public Optional<Boolean> getBoolean(String str) {
    }

    @VisibleForTesting
    protected long getCurrentSystemTimeMillis() {
    }

    public Optional<Float> getFloat(String str) {
    }

    public Optional<Long> getLong(String str) {
    }

    public <T> T getRemoteConfigValueOrDefault(String str, T t) {
    }

    public Optional<String> getString(String str) {
    }

    public boolean isFirebaseRemoteConfigAvailable() {
    }

    public boolean isLastFetchFailed() {
    }

    public void setFirebaseRemoteConfigProvider(Provider<RemoteConfigComponent> provider) {
    }

    @VisibleForTesting
    protected void syncConfigValues(Map<String, FirebaseRemoteConfigValue> map) {
    }

    @VisibleForTesting
    RemoteConfigManager(Executor executor, FirebaseRemoteConfig firebaseRemoteConfig) {
    }
}
