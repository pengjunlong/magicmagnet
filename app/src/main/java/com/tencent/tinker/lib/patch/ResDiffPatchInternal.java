package com.tencent.tinker.lib.patch;

import android.content.Context;
import com.tencent.tinker.lib.tinker.Tinker;
import com.tencent.tinker.loader.shareutil.ShareResPatchInfo;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;
import java.io.File;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ResDiffPatchInternal extends BasePatchInternal {
    protected static final String TAG = "Tinker.ResDiffPatchInternal";

    private static boolean checkAndExtractResourceLargeFile(Context context, String str, File file, File file2, File file3, ShareResPatchInfo shareResPatchInfo, int i) {
    }

    private static boolean extractResourceDiffInternals(Context context, String str, String str2, File file, int i) {
    }

    private static boolean patchResourceExtractViaResourceDiff(Context context, String str, String str2, File file) {
    }

    protected static boolean tryRecoverResourceFiles(Tinker tinker, ShareSecurityCheck shareSecurityCheck, Context context, String str, File file) {
    }
}
