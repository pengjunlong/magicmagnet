package com.xunlei.downloadlib;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
class XLUtil {
    private static final String TAG = "XLUtil";
    private static final int UUID_HASH_CLIP_LEN = 15;
    private static boolean isGetMAC = false;
    private static boolean isLoadAndParseFile = false;
    private static final String mIdentifyFileName = "Identify.txt";
    private static String mMAC;
    private static String mOSVersion;
    private static String mPeerId;
    private static String mUUID;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class GUID_TYPE {
        private static final /* synthetic */ GUID_TYPE[] $VALUES = null;
        public static final GUID_TYPE ALL = null;
        public static final GUID_TYPE DEFAULT = null;
        public static final GUID_TYPE JUST_IMEI = null;
        public static final GUID_TYPE JUST_MAC = null;
        public static final GUID_TYPE UUID = null;

        private GUID_TYPE(String str, int i) {
        }

        public static GUID_TYPE valueOf(String str) {
        }

        public static GUID_TYPE[] values() {
        }
    }

    public static class GuidInfo {
        public String mGuid;
        public GUID_TYPE mType;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class NetWorkCarrier {
        private static final /* synthetic */ NetWorkCarrier[] $VALUES = null;
        public static final NetWorkCarrier CMCC = null;
        public static final NetWorkCarrier CT = null;
        public static final NetWorkCarrier CU = null;
        public static final NetWorkCarrier UNKNOWN = null;

        private NetWorkCarrier(String str, int i) {
        }

        public static NetWorkCarrier valueOf(String str) {
        }

        public static NetWorkCarrier[] values() {
        }
    }

    XLUtil() {
    }

    private static String bytesToHex(byte[] bArr) {
    }

    public static void deleteFile(String str) {
    }

    public static String generateAppKey(String str, short s, byte b) {
    }

    public static GuidInfo generateGuid(Context context) {
    }

    private static String generatePeerid(Context context) {
    }

    public static String getAPNName(Context context) {
    }

    public static String getBSSID(Context context) {
    }

    public static long getCurrentUnixTime() {
    }

    public static String getIdentifyContent() {
    }

    public static String getMAC(Context context) {
    }

    public static String getMd5(String str) {
    }

    public static NetWorkCarrier getNetWorkCarrier(Context context) {
    }

    public static int getNetworkType(Context context) {
    }

    public static String getOSVersion(Context context) {
    }

    public static String getPeerid(Context context) {
    }

    public static String getSSID(Context context) {
    }

    private static String getUUID(Context context) {
    }

    private static String getUUIDHashClip(Context context) {
    }

    @SuppressLint({"NewApi"})
    private static String getWifiMacAddress() {
    }

    private static boolean isValidMacAddress(String str) {
    }

    public static void killProcess() {
    }

    private static void loadAndParseFile(Context context, String str) {
    }

    private static void parseIdentify(String str) {
    }

    public static Map<String, Object> parseJSONString(String str) {
    }

    public static String readFromFile(Context context, String str) {
    }

    public static String readStringFromFile(String str) {
    }

    private static void saveFile(Context context, String str) {
    }

    public static int writeStringToFile(String str, String str2) {
    }

    public static void writeToFile(Context context, String str, String str2) {
    }
}
