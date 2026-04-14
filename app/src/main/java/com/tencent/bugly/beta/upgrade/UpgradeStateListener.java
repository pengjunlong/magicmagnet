package com.tencent.bugly.beta.upgrade;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface UpgradeStateListener {
    void onDownloadCompleted(boolean z);

    void onUpgradeFailed(boolean z);

    void onUpgradeNoVersion(boolean z);

    void onUpgradeSuccess(boolean z);

    void onUpgrading(boolean z);
}
