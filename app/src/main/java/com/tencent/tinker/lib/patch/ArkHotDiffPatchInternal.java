package com.tencent.tinker.lib.patch;

import android.content.Context;
import com.tencent.tinker.lib.tinker.Tinker;
import com.tencent.tinker.loader.shareutil.ShareArkHotDiffPatchInfo;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;
import java.io.File;
import java.util.ArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ArkHotDiffPatchInternal extends BasePatchInternal {
    private static final String TAG = "Tinker.ArkHotDiffPatchInternal";
    private static ArrayList<ShareArkHotDiffPatchInfo> arkPatchList;

    private static boolean extractArkHotLibrary(Context context, String str, File file, int i) {
    }

    private static boolean patchArkHotLibraryExtract(Context context, String str, String str2, File file) {
    }

    protected static boolean tryRecoverArkHotLibrary(Tinker tinker, ShareSecurityCheck shareSecurityCheck, Context context, String str, File file) {
    }
}
