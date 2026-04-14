package com.google.firebase.perf.config;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Optional;
import java.util.concurrent.ExecutorService;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class DeviceCacheManager {
    private static final String PREFS_NAME = "FirebasePerfSharedPrefs";
    private static DeviceCacheManager instance;
    private static final AndroidLogger logger = null;
    private final ExecutorService serialExecutor;
    private volatile SharedPreferences sharedPref;

    public DeviceCacheManager(ExecutorService executorService) {
    }

    public static void clearInstance() {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(DeviceCacheManager deviceCacheManager, Context context) {
    }

    private Context getFirebaseApplicationContext() {
    }

    public static synchronized DeviceCacheManager getInstance() {
    }

    private /* synthetic */ void lambda$setContext$0(Context context) {
    }

    public void clear(String str) {
    }

    public boolean containsKey(String str) {
    }

    public Optional<Boolean> getBoolean(String str) {
    }

    public Optional<Float> getFloat(String str) {
    }

    public Optional<Long> getLong(String str) {
    }

    public Optional<String> getString(String str) {
    }

    public synchronized void setContext(Context context) {
    }

    public boolean setValue(String str, boolean z) {
    }

    public boolean setValue(String str, String str2) {
    }

    public boolean setValue(String str, float f) {
    }

    public boolean setValue(String str, long j) {
    }
}
