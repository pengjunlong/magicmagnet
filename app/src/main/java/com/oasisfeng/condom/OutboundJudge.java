package com.oasisfeng.condom;

import android.content.Intent;
import androidx.annotation.Keep;

@Keep
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public interface OutboundJudge {
    boolean shouldAllow(OutboundType outboundType, Intent intent, String str);
}
