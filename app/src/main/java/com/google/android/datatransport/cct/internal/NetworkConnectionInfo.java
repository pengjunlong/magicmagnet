package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class NetworkConnectionInfo {

    @AutoValue.Builder
    public static abstract class Builder {
        public abstract NetworkConnectionInfo build();

        public abstract Builder setMobileSubtype(MobileSubtype mobileSubtype);

        public abstract Builder setNetworkType(NetworkType networkType);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class MobileSubtype {
        private static final /* synthetic */ MobileSubtype[] $VALUES = null;
        public static final MobileSubtype CDMA = null;
        public static final MobileSubtype COMBINED = null;
        public static final MobileSubtype EDGE = null;
        public static final MobileSubtype EHRPD = null;
        public static final MobileSubtype EVDO_0 = null;
        public static final MobileSubtype EVDO_A = null;
        public static final MobileSubtype EVDO_B = null;
        public static final MobileSubtype GPRS = null;
        public static final MobileSubtype GSM = null;
        public static final MobileSubtype HSDPA = null;
        public static final MobileSubtype HSPA = null;
        public static final MobileSubtype HSPAP = null;
        public static final MobileSubtype HSUPA = null;
        public static final MobileSubtype IDEN = null;
        public static final MobileSubtype IWLAN = null;
        public static final MobileSubtype LTE = null;
        public static final MobileSubtype LTE_CA = null;
        public static final MobileSubtype RTT = null;
        public static final MobileSubtype TD_SCDMA = null;
        public static final MobileSubtype UMTS = null;
        public static final MobileSubtype UNKNOWN_MOBILE_SUBTYPE = null;
        private static final SparseArray<MobileSubtype> valueMap = null;
        private final int value;

        private MobileSubtype(String str, int i, int i2) {
        }

        public static MobileSubtype forNumber(int i) {
        }

        public static MobileSubtype valueOf(String str) {
        }

        public static MobileSubtype[] values() {
        }

        public int getValue() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class NetworkType {
        private static final /* synthetic */ NetworkType[] $VALUES = null;
        public static final NetworkType BLUETOOTH = null;
        public static final NetworkType DUMMY = null;
        public static final NetworkType ETHERNET = null;
        public static final NetworkType MOBILE = null;
        public static final NetworkType MOBILE_CBS = null;
        public static final NetworkType MOBILE_DUN = null;
        public static final NetworkType MOBILE_EMERGENCY = null;
        public static final NetworkType MOBILE_FOTA = null;
        public static final NetworkType MOBILE_HIPRI = null;
        public static final NetworkType MOBILE_IA = null;
        public static final NetworkType MOBILE_IMS = null;
        public static final NetworkType MOBILE_MMS = null;
        public static final NetworkType MOBILE_SUPL = null;
        public static final NetworkType NONE = null;
        public static final NetworkType PROXY = null;
        public static final NetworkType VPN = null;
        public static final NetworkType WIFI = null;
        public static final NetworkType WIFI_P2P = null;
        public static final NetworkType WIMAX = null;
        private static final SparseArray<NetworkType> valueMap = null;
        private final int value;

        private NetworkType(String str, int i, int i2) {
        }

        public static NetworkType forNumber(int i) {
        }

        public static NetworkType valueOf(String str) {
        }

        public static NetworkType[] values() {
        }

        public int getValue() {
        }
    }

    public static Builder builder() {
    }

    public abstract MobileSubtype getMobileSubtype();

    public abstract NetworkType getNetworkType();
}
