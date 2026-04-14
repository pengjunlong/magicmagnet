package org.adblockplus.libadblockplus.android.settings;

import android.content.Context;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class AdblockSettingsStorage {
    public static AdblockSettings getDefaultSettings(Context context) {
    }

    public abstract AdblockSettings load();

    public abstract void save(AdblockSettings adblockSettings);
}
