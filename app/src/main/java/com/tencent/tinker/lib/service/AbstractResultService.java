package com.tencent.tinker.lib.service;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class AbstractResultService extends IntentService {
    private static final String RESULT_EXTRA = "result_extra";
    private static final String TAG = "Tinker.AbstractResultService";

    public static void runResultService(Context context, PatchResult patchResult, String str) {
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
    }

    public abstract void onPatchResult(PatchResult patchResult);
}
