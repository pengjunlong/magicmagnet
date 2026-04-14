package com.tencent.tinker.loader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
class TinkerResourcePatcher {
    private static final String TAG = "Tinker.ResourcePatcher";
    private static final String TEST_ASSETS_VALUE = "only_use_to_test_tinker_resource.txt";
    private static Method addAssetPathAsSharedLibraryMethod;
    private static Method addAssetPathMethod;
    private static Field assetsFiled;
    private static Object currentActivityThread;
    private static Method ensureStringBlocksMethod;
    private static AssetManager newAssetManager;
    private static Field packagesFiled;
    private static Field publicSourceDirField;
    private static Collection<WeakReference<Resources>> references;
    private static Field resDir;
    private static Field resourcePackagesFiled;
    private static Field resourcesImplFiled;
    private static Field stringBlocksField;

    TinkerResourcePatcher() {
    }

    private static boolean checkResUpdate(Context context) {
    }

    private static void clearPreloadTypedArrayIssue(Resources resources) {
    }

    public static void isResourceCanPatch(Context context) throws Throwable {
    }

    public static void monkeyPatchExistingResources(Context context, String str) throws Throwable {
    }

    private static boolean shouldAddSharedLibraryAssets(ApplicationInfo applicationInfo) {
    }
}
