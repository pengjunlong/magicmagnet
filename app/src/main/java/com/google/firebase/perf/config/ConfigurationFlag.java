package com.google.firebase.perf.config;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class ConfigurationFlag<T> {
    ConfigurationFlag() {
    }

    protected abstract T getDefault();

    String getDeviceCacheFlag() {
    }

    String getMetadataFlag() {
    }

    String getRemoteConfigFlag() {
    }
}
