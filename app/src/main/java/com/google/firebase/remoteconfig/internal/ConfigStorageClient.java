package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.io.IOException;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class ConfigStorageClient {
    private static final String JSON_STRING_ENCODING = "UTF-8";
    private static final Map<String, ConfigStorageClient> clientInstances = null;
    private final Context context;
    private final String fileName;

    private ConfigStorageClient(Context context, String str) {
    }

    public static synchronized void clearInstancesForTest() {
    }

    public static synchronized ConfigStorageClient getInstance(Context context, String str) {
    }

    public synchronized Void clear() {
    }

    String getFileName() {
    }

    public synchronized ConfigContainer read() throws IOException {
    }

    public synchronized Void write(ConfigContainer configContainer) throws IOException {
    }
}
