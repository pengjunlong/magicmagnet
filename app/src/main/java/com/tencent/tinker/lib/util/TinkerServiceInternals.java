package com.tencent.tinker.lib.util;

import android.app.Service;
import android.content.Context;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class TinkerServiceInternals extends ShareTinkerInternals {
    private static final String TAG = "Tinker.ServiceInternals";
    private static String patchServiceProcessName;

    private static String getServiceProcessName(Context context, Class<? extends Service> cls) {
    }

    public static String getTinkerPatchServiceName(Context context) {
    }

    public static boolean isInTinkerPatchServiceProcess(Context context) {
    }

    public static boolean isTinkerPatchServiceRunning(Context context) {
    }

    public static void killTinkerPatchServiceProcess(Context context) {
    }
}
