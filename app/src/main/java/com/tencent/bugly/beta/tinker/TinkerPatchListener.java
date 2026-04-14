package com.tencent.bugly.beta.tinker;

import android.content.Context;
import com.tencent.tinker.lib.listener.DefaultPatchListener;
import com.tencent.tinker.lib.listener.PatchListener;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class TinkerPatchListener extends DefaultPatchListener {
    protected static final long NEW_PATCH_RESTRICTION_SPACE_SIZE_MIN = 62914560;
    private static final String TAG = "Tinker.TinkerPatchListener";
    private final int maxMemory;
    private final PatchListener userPatchListener;

    public TinkerPatchListener(Context context) {
    }

    @Override // com.tencent.tinker.lib.listener.DefaultPatchListener
    public int patchCheck(String str, String str2) {
    }
}
