package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.common.util.BiConsumer;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class ConfigGetParameterHandler {
    static final Pattern FALSE_REGEX = null;
    public static final Charset FRC_BYTE_ARRAY_ENCODING = null;
    static final Pattern TRUE_REGEX = null;
    private final ConfigCacheClient activatedConfigsCache;
    private final ConfigCacheClient defaultConfigsCache;
    private final Executor executor;
    private final Set<BiConsumer<String, ConfigContainer>> listeners;

    public ConfigGetParameterHandler(Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
    }

    private void callListeners(String str, ConfigContainer configContainer) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(BiConsumer biConsumer, String str, ConfigContainer configContainer) {
    }

    private static ConfigContainer getConfigsFromCache(ConfigCacheClient configCacheClient) {
    }

    private static Double getDoubleFromCache(ConfigCacheClient configCacheClient, String str) {
    }

    private static Set<String> getKeySetFromCache(ConfigCacheClient configCacheClient) {
    }

    private static Long getLongFromCache(ConfigCacheClient configCacheClient, String str) {
    }

    private static String getStringFromCache(ConfigCacheClient configCacheClient, String str) {
    }

    private static /* synthetic */ void lambda$callListeners$0(BiConsumer biConsumer, String str, ConfigContainer configContainer) {
    }

    private static void logParameterValueDoesNotExist(String str, String str2) {
    }

    public void addListener(BiConsumer<String, ConfigContainer> biConsumer) {
    }

    public Map<String, FirebaseRemoteConfigValue> getAll() {
    }

    public boolean getBoolean(String str) {
    }

    public byte[] getByteArray(String str) {
    }

    public double getDouble(String str) {
    }

    public Set<String> getKeysByPrefix(String str) {
    }

    public long getLong(String str) {
    }

    public String getString(String str) {
    }

    public FirebaseRemoteConfigValue getValue(String str) {
    }

    private static TreeSet<String> getKeysByPrefix(String str, ConfigContainer configContainer) {
    }
}
