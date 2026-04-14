package com.tencent.tinker.lib.service;

import java.io.Serializable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class PatchResult implements Serializable {
    public long costTime;
    public long dexoptTriggerTime;

    /* renamed from: e */
    public Throwable f1149e;
    public boolean isOatGenerated;
    public boolean isSuccess;
    public String patchVersion;
    public String rawPatchFilePath;

    public String toString() {
    }
}
