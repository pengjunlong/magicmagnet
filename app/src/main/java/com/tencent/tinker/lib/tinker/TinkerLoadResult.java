package com.tencent.tinker.lib.tinker;

import android.content.Context;
import android.content.Intent;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import java.io.File;
import java.util.HashMap;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class TinkerLoadResult {
    private static final String TAG = "Tinker.TinkerLoadResult";
    public long costTime;
    public String currentVersion;
    public File dexDirectory;
    public HashMap<String, String> dexes;
    public File libraryDirectory;
    public HashMap<String, String> libs;
    public int loadCode;
    public String oatDir;
    public HashMap<String, String> packageConfig;
    public SharePatchInfo patchInfo;
    public File patchVersionDirectory;
    public File patchVersionFile;
    public File resourceDirectory;
    public File resourceFile;
    public boolean systemOTA;
    public boolean useInterpretMode;
    public boolean versionChanged;

    public String getPackageConfigByName(String str) {
    }

    public boolean parseTinkerResult(Context context, Intent intent) {
    }
}
