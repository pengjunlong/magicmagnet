package com.iflytek.voiceads;

import com.iflytek.voiceads.listener.DialogConfirmListener;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public interface IFLYAdListener extends DialogConfirmListener {
    void onAdClick();

    void onAdClose();

    void onAdExposure();

    void onAdFailed(AdError adError);

    void onAdReceive();
}
