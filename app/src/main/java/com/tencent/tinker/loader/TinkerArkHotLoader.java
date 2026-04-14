package com.tencent.tinker.loader;

import android.annotation.TargetApi;
import android.content.Intent;
import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareArkHotDiffPatchInfo;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;
import java.util.HashSet;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class TinkerArkHotLoader {
    private static final String ARKHOT_PATH = "arkHot";
    private static final String ARK_MEAT_FILE = "assets/arkHot_meta.txt";
    private static final String TAG = "Tinker.TinkerArkHotLoader";
    private static HashSet<ShareArkHotDiffPatchInfo> arkHotApkInfo;
    private static boolean isArkHotRuning;

    private TinkerArkHotLoader() {
    }

    public static boolean checkComplete(String str, ShareSecurityCheck shareSecurityCheck, Intent intent) {
    }

    @TargetApi(14)
    public static boolean loadTinkerArkHot(TinkerApplication tinkerApplication, String str, Intent intent) {
    }
}
