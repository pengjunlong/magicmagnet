package com.tencent.tinker.lib.patch;

import android.content.Context;
import com.tencent.tinker.lib.service.PatchResult;
import com.tencent.tinker.lib.tinker.Tinker;
import com.tencent.tinker.loader.TinkerDexOptimizer;
import com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DexDiffPatchInternal extends BasePatchInternal {
    protected static final int MAX_WAIT_COUNT = 120;
    protected static final String TAG = "Tinker.DexDiffPatchInternal";
    protected static final int WAIT_ASYN_OAT_TIME = 10000;
    private static HashMap<ShareDexDiffPatchInfo, File> classNDexInfo;
    private static boolean isVmArt;
    private static ArrayList<File> optFiles;
    private static ArrayList<ShareDexDiffPatchInfo> patchList;

    /* renamed from: com.tencent.tinker.lib.patch.DexDiffPatchInternal$1 */
    static class C16431 implements TinkerDexOptimizer.ResultCallback {
        long startTime;
        final /* synthetic */ boolean[] val$anyOatNotGenerated;
        final /* synthetic */ List val$failOptDexFile;
        final /* synthetic */ Throwable[] val$throwable;

        C16431(boolean[] zArr, List list, Throwable[] thArr) {
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

    private static boolean checkAllDexOptFile(ArrayList<File> arrayList, int i) {
    }

    private static boolean checkClassNDexFiles(String str) {
    }

    private static boolean dexOptimizeDexFiles(Context context, List<File> list, String str, File file, PatchResult patchResult) {
    }

    private static boolean extractDexDiffInternals(Context context, String str, String str2, File file, int i) {
    }

    private static boolean extractDexFile(ZipFile zipFile, ZipEntry zipEntry, File file, ShareDexDiffPatchInfo shareDexDiffPatchInfo) throws IOException {
    }

    private static boolean extractDexToJar(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
    }

    private static ZipEntry makeStoredZipEntry(ZipEntry zipEntry, String str) {
    }

    private static boolean mergeClassNDexFiles(Context context, File file, String str) {
    }

    private static boolean patchDexExtractViaDexDiff(Context context, String str, String str2, File file, PatchResult patchResult) {
    }

    private static void patchDexFile(ZipFile zipFile, ZipFile zipFile2, ZipEntry zipEntry, ZipEntry zipEntry2, ShareDexDiffPatchInfo shareDexDiffPatchInfo, File file) throws IOException {
    }

    protected static boolean tryRecoverDexFiles(Tinker tinker, ShareSecurityCheck shareSecurityCheck, Context context, String str, File file, PatchResult patchResult) {
    }

    protected static boolean waitAndCheckDexOptFile(File file, Tinker tinker) {
    }
}
