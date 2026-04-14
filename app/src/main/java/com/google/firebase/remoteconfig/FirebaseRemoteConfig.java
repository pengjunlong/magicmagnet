package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.internal.ConfigMetadataClient;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class FirebaseRemoteConfig {
    public static final boolean DEFAULT_VALUE_FOR_BOOLEAN = false;
    public static final byte[] DEFAULT_VALUE_FOR_BYTE_ARRAY = null;
    public static final double DEFAULT_VALUE_FOR_DOUBLE = 0.0d;
    public static final long DEFAULT_VALUE_FOR_LONG = 0;
    public static final String DEFAULT_VALUE_FOR_STRING = "";
    public static final int LAST_FETCH_STATUS_FAILURE = 1;
    public static final int LAST_FETCH_STATUS_NO_FETCH_YET = 0;
    public static final int LAST_FETCH_STATUS_SUCCESS = -1;
    public static final int LAST_FETCH_STATUS_THROTTLED = 2;
    public static final String TAG = "FirebaseRemoteConfig";
    public static final int VALUE_SOURCE_DEFAULT = 1;
    public static final int VALUE_SOURCE_REMOTE = 2;
    public static final int VALUE_SOURCE_STATIC = 0;
    private final ConfigCacheClient activatedConfigsCache;
    private final Context context;
    private final ConfigCacheClient defaultConfigsCache;
    private final Executor executor;
    private final ConfigFetchHandler fetchHandler;
    private final ConfigCacheClient fetchedConfigsCache;
    private final FirebaseABTesting firebaseAbt;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final ConfigMetadataClient frcMetadata;
    private final ConfigGetParameterHandler getHandler;

    FirebaseRemoteConfig(Context context, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2, ConfigCacheClient configCacheClient3, ConfigFetchHandler configFetchHandler, ConfigGetParameterHandler configGetParameterHandler, ConfigMetadataClient configMetadataClient) {
    }

    public static /* synthetic */ Task bpdqqiQNVROMLC1ll1l1l11(ConfigContainer configContainer) {
    }

    public static /* synthetic */ Task dbpqdHhmDSIHIJiwc1ll1l1(ConfigFetchHandler.FetchResponse fetchResponse) {
    }

    public static /* synthetic */ FirebaseRemoteConfigInfo ddbbbeXHXx111ll(Task task, Task task2) {
    }

    public static /* synthetic */ Void dpbdbdpbLwkLpObyKsq1lll1(FirebaseRemoteConfig firebaseRemoteConfig, FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
    }

    public static /* synthetic */ Void dpbdpqRKAscW1lll1l(FirebaseRemoteConfig firebaseRemoteConfig) {
    }

    public static /* synthetic */ boolean dqpdbEevAufTOvPphbjykClll1l11(FirebaseRemoteConfig firebaseRemoteConfig, Task task) {
    }

    public static /* synthetic */ Task dqpqqqbqQyjyB11111l1(FirebaseRemoteConfig firebaseRemoteConfig, Task task, Task task2, Task task3) {
    }

    public static /* synthetic */ Task dqqppqiKzJi1l1lll1l(ConfigFetchHandler.FetchResponse fetchResponse) {
    }

    public static FirebaseRemoteConfig getInstance() {
    }

    private static boolean isFetchedFresh(ConfigContainer configContainer, ConfigContainer configContainer2) {
    }

    private /* synthetic */ Task lambda$activate$2(Task task, Task task2, Task task3) throws Exception {
    }

    private static /* synthetic */ FirebaseRemoteConfigInfo lambda$ensureInitialized$0(Task task, Task task2) throws Exception {
    }

    private static /* synthetic */ Task lambda$fetch$3(ConfigFetchHandler.FetchResponse fetchResponse) throws Exception {
    }

    private static /* synthetic */ Task lambda$fetch$4(ConfigFetchHandler.FetchResponse fetchResponse) throws Exception {
    }

    private /* synthetic */ Task lambda$fetchAndActivate$1(Void r1) throws Exception {
    }

    private /* synthetic */ Void lambda$reset$6() throws Exception {
    }

    private /* synthetic */ Void lambda$setConfigSettingsAsync$5(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) throws Exception {
    }

    private static /* synthetic */ Task lambda$setDefaultsWithStringsMapAsync$7(ConfigContainer configContainer) throws Exception {
    }

    public static /* synthetic */ Task ppbdpwWWljzmXXdHNabfWhgjl111l11(FirebaseRemoteConfig firebaseRemoteConfig, Void r1) {
    }

    private boolean processActivatePutTask(Task<ConfigContainer> task) {
    }

    private Task<Void> setDefaultsWithStringsMapAsync(Map<String, String> map) {
    }

    static List<Map<String, String>> toExperimentInfoMaps(JSONArray jSONArray) throws JSONException {
    }

    public Task<Boolean> activate() {
    }

    public Task<FirebaseRemoteConfigInfo> ensureInitialized() {
    }

    public Task<Void> fetch() {
    }

    public Task<Boolean> fetchAndActivate() {
    }

    public Map<String, FirebaseRemoteConfigValue> getAll() {
    }

    public boolean getBoolean(String str) {
    }

    public double getDouble(String str) {
    }

    public FirebaseRemoteConfigInfo getInfo() {
    }

    public Set<String> getKeysByPrefix(String str) {
    }

    public long getLong(String str) {
    }

    public String getString(String str) {
    }

    public FirebaseRemoteConfigValue getValue(String str) {
    }

    public Task<Void> reset() {
    }

    public Task<Void> setConfigSettingsAsync(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
    }

    public Task<Void> setDefaultsAsync(Map<String, Object> map) {
    }

    void startLoadingConfigsFromDisk() {
    }

    void updateAbtWithActivatedExperiments(JSONArray jSONArray) {
    }

    public static FirebaseRemoteConfig getInstance(FirebaseApp firebaseApp) {
    }

    public Task<Void> fetch(long j) {
    }

    public Task<Void> setDefaultsAsync(int i) {
    }
}
