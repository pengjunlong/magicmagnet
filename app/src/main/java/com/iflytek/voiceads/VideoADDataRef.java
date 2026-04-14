package com.iflytek.voiceads;

import android.view.View;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class VideoADDataRef {
    public static final String AD_DOWNLOAD = "download";
    public static final String AD_REDIRECT = "redirect";

    public abstract String getAdSourceMark();

    public abstract String getAdType();

    public abstract int getDuration();

    public abstract int[] getMediaHeight();

    public abstract int[] getMediaWidth();

    public abstract String getSubTitle();

    public abstract String getTitle();

    public abstract boolean isExposured();

    public abstract boolean onClicked(View view, int i);

    public abstract boolean onExposured(View view);
}
