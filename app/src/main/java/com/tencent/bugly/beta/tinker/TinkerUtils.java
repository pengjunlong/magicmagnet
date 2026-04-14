package com.tencent.bugly.beta.tinker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class TinkerUtils {
    public static final int ERROR_PATCH_CONDITION_NOT_SATISFIED = -24;
    public static final int ERROR_PATCH_CRASH_LIMIT = -23;
    public static final int ERROR_PATCH_GOOGLEPLAY_CHANNEL = -20;
    public static final int ERROR_PATCH_MEMORY_LIMIT = -22;
    public static final int ERROR_PATCH_ROM_SPACE = -21;
    public static final int MIN_MEMORY_HEAP_SIZE = 45;
    public static final String PLATFORM = "platform";
    private static final String TAG = "Tinker.TinkerUtils";
    private static boolean background = false;

    public static class ScreenState {

        /* renamed from: com.tencent.bugly.beta.tinker.TinkerUtils$ScreenState$1 */
        class C15191 extends BroadcastReceiver {
            final /* synthetic */ ScreenState this$0;
            final /* synthetic */ IOnScreenOff val$onScreenOffInterface;

            C15191(ScreenState screenState, IOnScreenOff iOnScreenOff) {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
            }
        }

        interface IOnScreenOff {
            void onScreenOff();
        }

        ScreenState(Context context, IOnScreenOff iOnScreenOff) {
        }
    }

    public static String bytesToHexString(byte[] bArr, boolean z) {
    }

    public static int checkForPatchRecover(long j, int i) {
    }

    @Deprecated
    public static boolean checkRomSpaceEnough(long j) {
    }

    public static boolean copy(File file, File file2) throws IOException {
    }

    public static String getExceptionCauseString(Throwable th) {
    }

    public static String getSignature(Context context) {
    }

    public static boolean isBackground() {
    }

    public static boolean isGooglePlay() {
    }

    public static boolean isXposedExists(Throwable th) {
    }

    public static byte[] readBytes(InputStream inputStream) {
    }

    public static byte[] readJarEntry(File file, String str) {
    }

    public static void rollbackPatch(Context context) {
    }

    public static void setBackground(boolean z) {
    }

    private static String toVisualString(String str) {
    }

    public static byte[] readJarEntry(JarFile jarFile, String str) {
    }

    public static byte[] readJarEntry(JarFile jarFile, JarEntry jarEntry) {
    }
}
