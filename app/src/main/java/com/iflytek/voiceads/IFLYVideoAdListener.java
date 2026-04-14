package com.iflytek.voiceads;

import com.iflytek.voiceads.listener.DialogConfirmListener;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public interface IFLYVideoAdListener extends DialogConfirmListener {
    void onAdClick();

    void onAdFailed(AdError adError);

    void onAdLoaded(List<VideoADDataRef> list);

    void onAdPlayComplete();

    void onAdPlayError();

    void onAdSkip();

    void onAdStartPlay();
}
