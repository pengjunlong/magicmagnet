package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class HeartRating extends Rating {
    public static final Bundleable.Creator<HeartRating> CREATOR = null;
    private static final String FIELD_IS_HEART = null;
    private static final String FIELD_RATED = null;
    private static final int TYPE = 0;
    private final boolean isHeart;
    private final boolean rated;

    public HeartRating() {
    }

    public static /* synthetic */ HeartRating dpbdbdpbLwkLpObyKsq1lll1(Bundle bundle) {
    }

    private static HeartRating fromBundle(Bundle bundle) {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }

    public boolean isHeart() {
    }

    @Override // com.google.android.exoplayer2.Rating
    public boolean isRated() {
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
    }

    public HeartRating(boolean z) {
    }
}
