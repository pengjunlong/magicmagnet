package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import java.util.Date;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class ConfigMetadataClient {
    private static final String BACKOFF_END_TIME_IN_MILLIS_KEY = "backoff_end_time_in_millis";
    private static final String FETCH_TIMEOUT_IN_SECONDS_KEY = "fetch_timeout_in_seconds";
    private static final String LAST_FETCH_ETAG_KEY = "last_fetch_etag";
    private static final String LAST_FETCH_STATUS_KEY = "last_fetch_status";
    public static final long LAST_FETCH_TIME_IN_MILLIS_NO_FETCH_YET = -1;
    static final Date LAST_FETCH_TIME_NO_FETCH_YET = null;
    private static final String LAST_SUCCESSFUL_FETCH_TIME_IN_MILLIS_KEY = "last_fetch_time_in_millis";
    private static final String MINIMUM_FETCH_INTERVAL_IN_SECONDS_KEY = "minimum_fetch_interval_in_seconds";
    static final Date NO_BACKOFF_TIME = null;
    private static final long NO_BACKOFF_TIME_IN_MILLIS = -1;
    static final int NO_FAILED_FETCHES = 0;
    private static final String NUM_FAILED_FETCHES_KEY = "num_failed_fetches";
    private final Object backoffMetadataLock;
    private final Object frcInfoLock;
    private final SharedPreferences frcMetadata;

    static class BackoffMetadata {
        private Date backoffEndTime;
        private int numFailedFetches;

        BackoffMetadata(int i, Date date) {
        }

        Date getBackoffEndTime() {
        }

        int getNumFailedFetches() {
        }
    }

    public ConfigMetadataClient(SharedPreferences sharedPreferences) {
    }

    public void clear() {
    }

    BackoffMetadata getBackoffMetadata() {
    }

    public long getFetchTimeoutInSeconds() {
    }

    public FirebaseRemoteConfigInfo getInfo() {
    }

    String getLastFetchETag() {
    }

    int getLastFetchStatus() {
    }

    Date getLastSuccessfulFetchTime() {
    }

    public long getMinimumFetchIntervalInSeconds() {
    }

    void resetBackoff() {
    }

    void setBackoffMetadata(int i, Date date) {
    }

    public void setConfigSettings(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
    }

    public void setConfigSettingsWithoutWaitingOnDiskWrite(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
    }

    void setLastFetchETag(String str) {
    }

    void updateLastFetchAsFailed() {
    }

    void updateLastFetchAsSuccessfulAt(Date date) {
    }

    void updateLastFetchAsThrottled() {
    }
}
