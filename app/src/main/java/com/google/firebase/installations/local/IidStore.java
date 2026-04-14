package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import com.google.firebase.FirebaseApp;
import java.security.PublicKey;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class IidStore {
    private static final String[] ALLOWABLE_SCOPES = null;
    private static final String IID_SHARED_PREFS_NAME = "com.google.android.gms.appid";
    private static final String JSON_ENCODED_PREFIX = "{";
    private static final String JSON_TOKEN_KEY = "token";
    private static final String STORE_KEY_ID = "|S|id";
    private static final String STORE_KEY_PUB = "|S||P|";
    private static final String STORE_KEY_SEPARATOR = "|";
    private static final String STORE_KEY_TOKEN = "|T|";
    private final String defaultSenderId;
    private final SharedPreferences iidPrefs;

    public IidStore(FirebaseApp firebaseApp) {
    }

    private String createTokenKey(String str, String str2) {
    }

    private static String getDefaultSenderId(FirebaseApp firebaseApp) {
    }

    private static String getIdFromPublicKey(PublicKey publicKey) {
    }

    private String parseIidTokenFromJson(String str) {
    }

    private PublicKey parseKey(String str) {
    }

    private String readInstanceIdFromLocalStorage() {
    }

    private String readPublicKeyFromLocalStorageAndCalculateInstanceId() {
    }

    public String readIid() {
    }

    public String readToken() {
    }

    public IidStore(SharedPreferences sharedPreferences, String str) {
    }
}
