package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class ThumbRating extends Rating {
    public static final Bundleable.Creator<ThumbRating> CREATOR = null;
    private static final String FIELD_IS_THUMBS_UP = null;
    private static final String FIELD_RATED = null;
    private static final int TYPE = 3;
    private final boolean isThumbsUp;
    private final boolean rated;

    public ThumbRating() {
    }

    public static /* synthetic */ ThumbRating dpbdbdpbLwkLpObyKsq1lll1(Bundle bundle) {
    }

    private static ThumbRating fromBundle(Bundle bundle) {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }

    @Override // com.google.android.exoplayer2.Rating
    public boolean isRated() {
    }

    public boolean isThumbsUp() {
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
    }

    public ThumbRating(boolean z) {
    }
}
