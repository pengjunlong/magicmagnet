package com.iflytek.voiceads;

import com.iflytek.voiceads.listener.DialogConfirmListener;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public interface IFLYNativeListener extends DialogConfirmListener {
    void onADLoaded(List<NativeADDataRef> list);

    void onAdFailed(AdError adError);
}
