package com.tencent.tinker.loader;

import android.content.Intent;
import com.tencent.tinker.loader.TinkerDexOptimizer;
import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class TinkerDexLoader {
    private static final String DEFAULT_DEX_OPTIMIZE_PATH = "odex";
    private static final String DEX_MEAT_FILE = "assets/dex_meta.txt";
    private static final String DEX_PATH = "dex";
    private static final String INTERPRET_DEX_OPTIMIZE_PATH = "interpet";
    private static final ArrayList<ShareDexDiffPatchInfo> LOAD_DEX_LIST = null;
    private static final String TAG = "Tinker.TinkerDexLoader";
    private static HashSet<ShareDexDiffPatchInfo> classNDexInfo;
    private static boolean isVmArt;

    /* renamed from: com.tencent.tinker.loader.TinkerDexLoader$1 */
    static class C16481 implements TinkerDexOptimizer.ResultCallback {
        long start;
        final /* synthetic */ boolean[] val$parallelOTAResult;
        final /* synthetic */ Throwable[] val$parallelOTAThrowable;

        C16481(boolean[] zArr, Throwable[] thArr) {
        }

        @Override // com.tencent.tinker.loader.TinkerDexOptimizer.ResultCallback
        public void onFailed(File file, File file2, Throwable th) {
        }

        @Override // com.tencent.tinker.loader.TinkerDexOptimizer.ResultCallback
        public void onStart(File file, File file2) {
        }

        @Override // com.tencent.tinker.loader.TinkerDexOptimizer.ResultCallback
        public void onSuccess(File file, File file2, File file3) {
        }
    }

    private TinkerDexLoader() {
    }

    public static boolean checkComplete(String str, ShareSecurityCheck shareSecurityCheck, String str2, Intent intent) {
    }

    private static void deleteOutOfDateOATFile(String str) {
    }

    private static String getInfoMd5(ShareDexDiffPatchInfo shareDexDiffPatchInfo) {
    }

    private static boolean isJustArtSupportDex(ShareDexDiffPatchInfo shareDexDiffPatchInfo) {
    }

    public static boolean loadTinkerJars(TinkerApplication tinkerApplication, String str, String str2, Intent intent, boolean z, boolean z2) {
    }
}
