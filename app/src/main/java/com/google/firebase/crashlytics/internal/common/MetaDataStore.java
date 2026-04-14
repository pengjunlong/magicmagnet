package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.nio.charset.Charset;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class MetaDataStore {
    private static final String INTERNAL_KEYDATA_SUFFIX = "internal-keys";
    private static final String KEYDATA_SUFFIX = "keys";
    private static final String KEY_USER_ID = "userId";
    private static final String METADATA_EXT = ".meta";
    private static final String USERDATA_SUFFIX = "user";
    private static final Charset UTF_8 = null;
    private final File filesDir;

    /* renamed from: com.google.firebase.crashlytics.internal.common.MetaDataStore$1 */
    class C11141 extends JSONObject {
        final /* synthetic */ UserMetadata val$userData;

        C11141(UserMetadata userMetadata) throws JSONException {
        }
    }

    public MetaDataStore(File file) {
    }

    private static Map<String, String> jsonToKeysData(String str) throws JSONException {
    }

    private static UserMetadata jsonToUserData(String str) throws JSONException {
    }

    private static String keysDataToJson(Map<String, String> map) throws JSONException {
    }

    private static String userDataToJson(UserMetadata userMetadata) throws JSONException {
    }

    private static String valueOrNull(JSONObject jSONObject, String str) {
    }

    public File getInternalKeysFileForSession(String str) {
    }

    public File getKeysFileForSession(String str) {
    }

    public File getUserDataFileForSession(String str) {
    }

    public Map<String, String> readKeyData(String str) {
    }

    public UserMetadata readUserData(String str) {
    }

    public void writeKeyData(String str, Map<String, String> map) {
    }

    public void writeUserData(String str, UserMetadata userMetadata) {
    }

    Map<String, String> readKeyData(String str, boolean z) {
    }

    void writeKeyData(String str, Map<String, String> map, boolean z) {
    }
}
