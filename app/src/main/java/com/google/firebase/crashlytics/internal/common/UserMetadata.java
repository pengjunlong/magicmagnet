package com.google.firebase.crashlytics.internal.common;

import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class UserMetadata {
    static final int MAX_ATTRIBUTES = 64;
    static final int MAX_ATTRIBUTE_SIZE = 1024;
    static final int MAX_INTERNAL_KEY_SIZE = 8192;
    private final KeysMap customKeys;
    private final KeysMap internalKeys;
    private String userId;

    public Map<String, String> getCustomKeys() {
    }

    public Map<String, String> getInternalKeys() {
    }

    public String getUserId() {
    }

    public void setCustomKey(String str, String str2) {
    }

    public void setCustomKeys(Map<String, String> map) {
    }

    public void setInternalKey(String str, String str2) {
    }

    public void setUserId(String str) {
    }
}
