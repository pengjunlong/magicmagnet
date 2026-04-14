package org.adblockplus.libadblockplus.android;

import android.net.ConnectivityManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class ConnectionType {
    private static final /* synthetic */ ConnectionType[] $VALUES = null;
    public static final ConnectionType ANY = null;
    public static final ConnectionType WIFI = null;
    public static final ConnectionType WIFI_NON_METERED = null;
    private String value;

    /* renamed from: org.adblockplus.libadblockplus.android.ConnectionType$1 */
    enum C17421 extends ConnectionType {
        C17421(String str, int i, String str2) {
        }

        @Override // org.adblockplus.libadblockplus.android.ConnectionType
        public boolean isRequiredConnection(ConnectivityManager connectivityManager) {
        }
    }

    /* renamed from: org.adblockplus.libadblockplus.android.ConnectionType$2 */
    enum C17432 extends ConnectionType {
        C17432(String str, int i, String str2) {
        }

        @Override // org.adblockplus.libadblockplus.android.ConnectionType
        public boolean isRequiredConnection(ConnectivityManager connectivityManager) {
        }
    }

    /* renamed from: org.adblockplus.libadblockplus.android.ConnectionType$3 */
    enum C17443 extends ConnectionType {
        C17443(String str, int i, String str2) {
        }

        @Override // org.adblockplus.libadblockplus.android.ConnectionType
        public boolean isRequiredConnection(ConnectivityManager connectivityManager) {
        }
    }

    private static /* synthetic */ ConnectionType[] $values() {
    }

    /* synthetic */ ConnectionType(String str, int i, String str2, C17421 c17421) {
    }

    public static ConnectionType findByValue(String str) {
    }

    public static ConnectionType valueOf(String str) {
    }

    public static ConnectionType[] values() {
    }

    public String getValue() {
    }

    public abstract boolean isRequiredConnection(ConnectivityManager connectivityManager);

    private ConnectionType(String str, int i, String str2) {
    }
}
