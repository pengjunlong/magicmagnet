package com.tencent.tinker.lib.tinker;

import android.content.Context;
import com.tencent.tinker.entry.ApplicationLike;
import com.tencent.tinker.lib.listener.PatchListener;
import com.tencent.tinker.lib.patch.AbstractPatch;
import com.tencent.tinker.lib.reporter.LoadReporter;
import com.tencent.tinker.lib.reporter.PatchReporter;
import com.tencent.tinker.lib.service.AbstractResultService;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class TinkerInstaller {
    private static final String TAG = "Tinker.TinkerInstaller";

    public static void cleanPatch(Context context) {
    }

    public static Tinker install(ApplicationLike applicationLike) {
    }

    public static void onReceiveUpgradePatch(Context context, String str) {
    }

    public static void setLogIml(ShareTinkerLog.TinkerLogImp tinkerLogImp) {
    }

    public static Tinker install(ApplicationLike applicationLike, LoadReporter loadReporter, PatchReporter patchReporter, PatchListener patchListener, Class<? extends AbstractResultService> cls, AbstractPatch abstractPatch) {
    }
}
