package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class HeartBeatInfoStorage {
    private static final SimpleDateFormat FORMATTER = null;
    private static final String GLOBAL = "fire-global";
    private static final int HEART_BEAT_COUNT_LIMIT = 200;
    private static final String HEART_BEAT_COUNT_TAG = "fire-count";
    private static final String PREFERENCES_NAME = "FirebaseAppHeartBeat";
    private static final String STORAGE_PREFERENCES_NAME = "FirebaseAppHeartBeatStorage";
    private static HeartBeatInfoStorage instance;
    private final SharedPreferences heartBeatSharedPreferences;
    private final SharedPreferences sharedPreferences;

    private HeartBeatInfoStorage(Context context) {
    }

    private synchronized void cleanUpStoredHeartBeats() {
    }

    static synchronized HeartBeatInfoStorage getInstance(Context context) {
    }

    static boolean isSameDateUtc(long j, long j2) {
    }

    synchronized void clearStoredHeartBeats() {
    }

    int getHeartBeatCount() {
    }

    synchronized long getLastGlobalHeartBeat() {
    }

    synchronized List<SdkHeartBeatResult> getStoredHeartBeats(boolean z) {
    }

    synchronized boolean shouldSendGlobalHeartBeat(long j) {
    }

    synchronized boolean shouldSendSdkHeartBeat(String str, long j) {
    }

    synchronized void storeHeartBeatInformation(String str, long j) {
    }

    synchronized void updateGlobalHeartBeat(long j) {
    }

    HeartBeatInfoStorage(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
    }
}
