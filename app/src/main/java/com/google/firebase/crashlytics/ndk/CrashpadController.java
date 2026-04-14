package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import java.io.File;
import java.nio.charset.Charset;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class CrashpadController {
    private static final String APP_METADATA_FILE = "app.json";
    private static final String DEVICE_METADATA_FILE = "device.json";
    private static final String OS_METADATA_FILE = "os.json";
    private static final String SESSION_METADATA_FILE = "session.json";
    private static final Charset UTF_8 = null;
    private final Context context;
    private final CrashFilesManager filesManager;
    private final NativeApi nativeApi;

    CrashpadController(Context context, NativeApi nativeApi, CrashFilesManager crashFilesManager) {
    }

    private static File getSingleFileWithExtension(File file, String str) {
    }

    private static void writeSessionJsonFile(CrashFilesManager crashFilesManager, String str, String str2, String str3) {
    }

    private static void writeTextFile(File file, String str) {
    }

    public boolean finalizeSession(String str) {
    }

    public SessionFiles getFilesForSession(String str) {
    }

    public boolean hasCrashDataForSession(String str) {
    }

    public boolean initialize(String str, String str2, long j, StaticSessionData staticSessionData) {
    }

    public void writeBeginSession(String str, String str2, long j) {
    }

    public void writeSessionApp(String str, StaticSessionData.AppData appData) {
    }

    public void writeSessionDevice(String str, StaticSessionData.DeviceData deviceData) {
    }

    public void writeSessionOs(String str, StaticSessionData.OsData osData) {
    }
}
