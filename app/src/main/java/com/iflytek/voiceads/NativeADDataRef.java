package com.iflytek.voiceads;

import android.view.View;
import java.util.ArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class NativeADDataRef {
    public static final String AD_DOWNLOAD = "download";
    public static final String AD_REDIRECT = "redirect";

    public abstract String getAdSourceMark();

    public abstract String getAdtype();

    public abstract String getExplain();

    public abstract String getIcon();

    public abstract String getImage();

    public abstract ArrayList<String> getImgUrls();

    public abstract String getSubTitle();

    public abstract String getTitle();

    public abstract boolean isExposured();

    public abstract boolean onClicked(View view);

    public abstract boolean onExposured(View view);
}
