package com.tencent.tinker.lib.service;

import android.app.IntentService;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.tinker.lib.patch.AbstractPatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class TinkerPatchService extends IntentService {
    private static final String PATCH_PATH_EXTRA = "patch_path_extra";
    private static final String RESULT_CLASS_EXTRA = "patch_result_class";
    private static final String TAG = "Tinker.TinkerPatchService";
    private static int notificationId = -1119860829;
    private static Class<? extends AbstractResultService> resultServiceClass;
    private static AtomicBoolean sIsPatchApplying;
    private static AbstractPatch upgradePatchProcessor;

    public static class InnerService extends Service {
        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
        }

        @Override // android.app.Service
        public void onCreate() {
        }

        @Override // android.app.Service
        public void onDestroy() {
        }
    }

    static /* synthetic */ int access$000() {
    }

    private static void doApplyPatch(Context context, Intent intent) {
    }

    public static String getPatchPathExtra(Intent intent) {
    }

    public static String getPatchResultExtra(Intent intent) {
    }

    private void increasingPriority() {
    }

    public static void runPatchService(Context context, String str) {
    }

    public static void setPatchProcessor(AbstractPatch abstractPatch, Class<? extends AbstractResultService> cls) {
    }

    public static void setTinkerNotificationId(int i) {
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
    }
}
