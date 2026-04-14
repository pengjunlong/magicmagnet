package com.google.firebase.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.events.Publisher;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class DataCollectionConfigStorage {
    public static final String DATA_COLLECTION_DEFAULT_ENABLED = "firebase_data_collection_default_enabled";
    private static final String FIREBASE_APP_PREFS = "com.google.firebase.common.prefs:";
    private boolean dataCollectionDefaultEnabled;
    private final Context deviceProtectedContext;
    private final Publisher publisher;
    private final SharedPreferences sharedPreferences;

    public DataCollectionConfigStorage(Context context, String str, Publisher publisher) {
    }

    private static Context directBootSafe(Context context) {
    }

    private boolean readAutoDataCollectionEnabled() {
    }

    private boolean readManifestDataCollectionEnabled() {
    }

    private synchronized void updateDataCollectionDefaultEnabled(boolean z) {
    }

    public synchronized boolean isEnabled() {
    }

    public synchronized void setEnabled(Boolean bool) {
    }
}
