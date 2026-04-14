package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigMetadataClient;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class ConfigFetchHandler {
    static final int[] BACKOFF_TIME_DURATIONS_IN_MINUTES = null;
    public static final long DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS = 0;
    static final int HTTP_TOO_MANY_REQUESTS = 429;
    private final Provider<AnalyticsConnector> analyticsConnector;
    private final Clock clock;
    private final Map<String, String> customHttpHeaders;
    private final Executor executor;
    private final ConfigCacheClient fetchedConfigsCache;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final ConfigFetchHttpClient frcBackendApiClient;
    private final ConfigMetadataClient frcMetadata;
    private final Random randomGenerator;

    public static class FetchResponse {
        private final Date fetchTime;
        private final ConfigContainer fetchedConfigs;
        private final String lastFetchETag;
        private final int status;

        @Retention(RetentionPolicy.SOURCE)
        public @interface Status {
            public static final int BACKEND_HAS_NO_UPDATES = 1;
            public static final int BACKEND_UPDATES_FETCHED = 0;
            public static final int LOCAL_STORAGE_USED = 2;
        }

        private FetchResponse(Date date, int i, ConfigContainer configContainer, String str) {
        }

        public static FetchResponse forBackendHasNoUpdates(Date date) {
        }

        public static FetchResponse forBackendUpdatesFetched(ConfigContainer configContainer, String str) {
        }

        public static FetchResponse forLocalStorageUsed(Date date) {
        }

        Date getFetchTime() {
        }

        public ConfigContainer getFetchedConfigs() {
        }

        String getLastFetchETag() {
        }

        int getStatus() {
        }
    }

    public ConfigFetchHandler(FirebaseInstallationsApi firebaseInstallationsApi, Provider<AnalyticsConnector> provider, Executor executor, Clock clock, Random random, ConfigCacheClient configCacheClient, ConfigFetchHttpClient configFetchHttpClient, ConfigMetadataClient configMetadataClient, Map<String, String> map) {
    }

    private boolean areCachedFetchConfigsValid(long j, Date date) {
    }

    private FirebaseRemoteConfigServerException createExceptionWithGenericMessage(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) throws FirebaseRemoteConfigClientException {
    }

    private String createThrottledMessage(long j) {
    }

    public static /* synthetic */ Task dbpqdHhmDSIHIJiwc1ll1l1(ConfigFetchHandler configFetchHandler, Task task, Task task2, Date date, Task task3) {
    }

    public static /* synthetic */ Task dpbdbdpbLwkLpObyKsq1lll1(ConfigFetchHandler configFetchHandler, long j, Task task) {
    }

    public static /* synthetic */ Task dpbdpqRKAscW1lll1l(FetchResponse fetchResponse, ConfigContainer configContainer) {
    }

    public static /* synthetic */ Task dqqppqiKzJi1l1lll1l(ConfigFetchHandler configFetchHandler, Date date, Task task) {
    }

    private FetchResponse fetchFromBackend(String str, String str2, Date date) throws FirebaseRemoteConfigException {
    }

    private Task<FetchResponse> fetchFromBackendAndCacheResponse(String str, String str2, Date date) {
    }

    private Task<FetchResponse> fetchIfCacheExpiredAndNotThrottled(Task<ConfigContainer> task, long j) {
    }

    private Date getBackoffEndTimeInMillis(Date date) {
    }

    private long getRandomizedBackoffDurationInMillis(int i) {
    }

    private Map<String, String> getUserProperties() {
    }

    private boolean isThrottleableServerError(int i) {
    }

    private /* synthetic */ Task lambda$fetch$0(long j, Task task) throws Exception {
    }

    private static /* synthetic */ Task lambda$fetchFromBackendAndCacheResponse$3(FetchResponse fetchResponse, ConfigContainer configContainer) throws Exception {
    }

    private /* synthetic */ Task lambda$fetchIfCacheExpiredAndNotThrottled$1(Task task, Task task2, Date date, Task task3) throws Exception {
    }

    private /* synthetic */ Task lambda$fetchIfCacheExpiredAndNotThrottled$2(Date date, Task task) throws Exception {
    }

    private boolean shouldThrottle(ConfigMetadataClient.BackoffMetadata backoffMetadata, int i) {
    }

    private ConfigMetadataClient.BackoffMetadata updateAndReturnBackoffMetadata(int i, Date date) {
    }

    private void updateBackoffMetadataWithLastFailedFetchTime(Date date) {
    }

    private void updateLastFetchStatusAndTime(Task<FetchResponse> task, Date date) {
    }

    public Task<FetchResponse> fetch() {
    }

    public Provider<AnalyticsConnector> getAnalyticsConnector() {
    }

    public Task<FetchResponse> fetch(long j) {
    }
}
