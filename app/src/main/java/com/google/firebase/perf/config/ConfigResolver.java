package com.google.firebase.perf.config;

import android.content.Context;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.ImmutableBundle;
import com.google.firebase.perf.util.Optional;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class ConfigResolver {
    private static volatile ConfigResolver instance;
    private static final AndroidLogger logger = null;
    private DeviceCacheManager deviceCacheManager;
    private ImmutableBundle metadataBundle;
    private final RemoteConfigManager remoteConfigManager;

    public ConfigResolver(RemoteConfigManager remoteConfigManager, ImmutableBundle immutableBundle, DeviceCacheManager deviceCacheManager) {
    }

    public static void clearInstance() {
    }

    private Optional<Boolean> getDeviceCacheBoolean(ConfigurationFlag<Boolean> configurationFlag) {
    }

    private Optional<Float> getDeviceCacheFloat(ConfigurationFlag<Float> configurationFlag) {
    }

    private Optional<Long> getDeviceCacheLong(ConfigurationFlag<Long> configurationFlag) {
    }

    private Optional<String> getDeviceCacheString(ConfigurationFlag<String> configurationFlag) {
    }

    public static synchronized ConfigResolver getInstance() {
    }

    private boolean getIsSdkEnabled() {
    }

    private boolean getIsSdkVersionDisabled() {
    }

    private Optional<Boolean> getMetadataBoolean(ConfigurationFlag<Boolean> configurationFlag) {
    }

    private Optional<Float> getMetadataFloat(ConfigurationFlag<Float> configurationFlag) {
    }

    private Optional<Long> getMetadataLong(ConfigurationFlag<Long> configurationFlag) {
    }

    private Optional<Boolean> getRemoteConfigBoolean(ConfigurationFlag<Boolean> configurationFlag) {
    }

    private Optional<Float> getRemoteConfigFloat(ConfigurationFlag<Float> configurationFlag) {
    }

    private Optional<Long> getRemoteConfigLong(ConfigurationFlag<Long> configurationFlag) {
    }

    private Optional<String> getRemoteConfigString(ConfigurationFlag<String> configurationFlag) {
    }

    private Long getRemoteConfigValue(ConfigurationFlag<Long> configurationFlag) {
    }

    private boolean isEventCountValid(long j) {
    }

    private boolean isFireperfSdkVersionInList(String str) {
    }

    private boolean isGaugeCaptureFrequencyMsValid(long j) {
    }

    private boolean isSamplingRateValid(float f) {
    }

    private boolean isSessionsMaxDurationMinutesValid(long j) {
    }

    private boolean isTimeRangeSecValid(long j) {
    }

    public String getAndCacheLogSourceName() {
    }

    public Boolean getIsPerformanceCollectionDeactivated() {
    }

    public Boolean getIsPerformanceCollectionEnabled() {
    }

    public boolean getIsServiceCollectionEnabled() {
    }

    public long getNetworkEventCountBackground() {
    }

    public long getNetworkEventCountForeground() {
    }

    public float getNetworkRequestSamplingRate() {
    }

    public long getRateLimitSec() {
    }

    public long getSessionsCpuCaptureFrequencyBackgroundMs() {
    }

    public long getSessionsCpuCaptureFrequencyForegroundMs() {
    }

    public long getSessionsMaxDurationMinutes() {
    }

    public long getSessionsMemoryCaptureFrequencyBackgroundMs() {
    }

    public long getSessionsMemoryCaptureFrequencyForegroundMs() {
    }

    public float getSessionsSamplingRate() {
    }

    public long getTraceEventCountBackground() {
    }

    public long getTraceEventCountForeground() {
    }

    public float getTraceSamplingRate() {
    }

    public boolean isPerformanceMonitoringEnabled() {
    }

    public void setApplicationContext(Context context) {
    }

    public void setContentProviderContext(Context context) {
    }

    public void setDeviceCacheManager(DeviceCacheManager deviceCacheManager) {
    }

    public void setIsPerformanceCollectionEnabled(Boolean bool) {
    }

    public void setMetadataBundle(ImmutableBundle immutableBundle) {
    }
}
