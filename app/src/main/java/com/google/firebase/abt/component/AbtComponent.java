package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class AbtComponent {
    private final Map<String, FirebaseABTesting> abtOriginInstances;
    private final Provider<AnalyticsConnector> analyticsConnector;
    private final Context appContext;

    protected AbtComponent(Context context, Provider<AnalyticsConnector> provider) {
    }

    protected FirebaseABTesting createAbtInstance(String str) {
    }

    public synchronized FirebaseABTesting get(String str) {
    }
}
