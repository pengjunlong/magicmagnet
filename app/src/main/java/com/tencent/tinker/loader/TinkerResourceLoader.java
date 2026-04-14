package com.tencent.tinker.loader;

import android.content.Context;
import android.content.Intent;
import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareResPatchInfo;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class TinkerResourceLoader {
    protected static final String RESOURCE_FILE = "resources.apk";
    protected static final String RESOURCE_META_FILE = "assets/res_meta.txt";
    protected static final String RESOURCE_PATH = "res";
    private static final String TAG = "Tinker.ResourceLoader";
    private static ShareResPatchInfo resPatchInfo;

    private TinkerResourceLoader() {
    }

    public static boolean checkComplete(Context context, String str, ShareSecurityCheck shareSecurityCheck, Intent intent) {
    }

    public static boolean loadTinkerResources(TinkerApplication tinkerApplication, String str, Intent intent) {
    }
}
