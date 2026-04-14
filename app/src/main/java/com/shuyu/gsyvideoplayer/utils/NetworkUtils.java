package com.shuyu.gsyvideoplayer.utils;

import android.content.Context;
import android.net.NetworkInfo;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class NetworkUtils {
    public static final int NETWORK_2G = 2;
    public static final int NETWORK_3G = 3;
    public static final int NETWORK_4G = 4;
    public static final int NETWORK_NO = -1;
    private static final int NETWORK_TYPE_GSM = 16;
    private static final int NETWORK_TYPE_IWLAN = 18;
    private static final int NETWORK_TYPE_TD_SCDMA = 17;
    public static final int NETWORK_UNKNOWN = 5;
    public static final int NETWORK_WIFI = 1;

    private NetworkUtils() {
    }

    private static NetworkInfo getActiveNetworkInfo(Context context) {
    }

    public static int getNetWorkType(Context context) {
    }

    public static String getNetWorkTypeName(Context context) {
    }

    public static String getNetworkOperatorName(Context context) {
    }

    public static int getPhoneType(Context context) {
    }

    public static boolean is4G(Context context) {
    }

    public static boolean isAvailable(Context context) {
    }

    public static boolean isConnected(Context context) {
    }

    public static boolean isWifiConnected(Context context) {
    }

    public static void openWirelessSettings(Context context) {
    }
}
