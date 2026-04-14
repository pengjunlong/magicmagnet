package com.tencent.tinker.loader.shareutil;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.File;
import java.security.cert.Certificate;
import java.util.HashMap;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ShareSecurityCheck {
    private static final String TAG = "Tinker.SecurityCheck";
    private static String mPublicKeyMd5;
    private final Context mContext;
    private final HashMap<String, String> metaContentMap;
    private final HashMap<String, String> packageProperties;

    public ShareSecurityCheck(Context context) {
    }

    private boolean check(File file, Certificate[] certificateArr) {
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private void init(Context context) {
    }

    public HashMap<String, String> getMetaContentMap() {
    }

    public HashMap<String, String> getPackagePropertiesIfPresent() {
    }

    public boolean verifyPatchMetaSignature(File file) {
    }
}
