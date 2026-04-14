package com.oasisfeng.condom;

import androidx.annotation.Keep;
import java.util.List;

@Keep
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class CondomOptions {
    boolean mDryRun;
    boolean mExcludeBackgroundReceivers;
    boolean mExcludeBackgroundServices;
    List<CondomKit> mKits;
    OutboundJudge mOutboundJudge;

    public CondomOptions addKit(CondomKit condomKit) {
    }

    public CondomOptions preventBroadcastToBackgroundPackages(boolean z) {
    }

    public CondomOptions preventServiceInBackgroundPackages(boolean z) {
    }

    public CondomOptions setDryRun(boolean z) {
    }

    public CondomOptions setOutboundJudge(OutboundJudge outboundJudge) {
    }
}
