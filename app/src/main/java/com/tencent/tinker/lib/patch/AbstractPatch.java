package com.tencent.tinker.lib.patch;

import android.content.Context;
import com.tencent.tinker.lib.service.PatchResult;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class AbstractPatch {
    public abstract boolean tryPatch(Context context, String str, PatchResult patchResult);
}
