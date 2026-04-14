package com.tencent.tinker.loader;

import android.content.Intent;
import com.tencent.tinker.loader.app.TinkerApplication;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class AbstractTinkerLoader {
    public abstract Intent tryLoad(TinkerApplication tinkerApplication);
}
