package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class Rating implements Bundleable {
    public static final Bundleable.Creator<Rating> CREATOR = null;
    static final String FIELD_RATING_TYPE = null;
    static final int RATING_TYPE_HEART = 0;
    static final int RATING_TYPE_PERCENTAGE = 1;
    static final int RATING_TYPE_STAR = 2;
    static final int RATING_TYPE_THUMB = 3;
    static final int RATING_TYPE_UNSET = -1;
    static final float RATING_UNSET = -1.0f;

    Rating() {
    }

    public static /* synthetic */ Rating dbpqdHhmDSIHIJiwc1ll1l1(Bundle bundle) {
    }

    private static Rating fromBundle(Bundle bundle) {
    }

    public abstract boolean isRated();
}
