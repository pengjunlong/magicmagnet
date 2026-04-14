package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class StarRating extends Rating {
    public static final Bundleable.Creator<StarRating> CREATOR = null;
    private static final String FIELD_MAX_STARS = null;
    private static final String FIELD_STAR_RATING = null;
    private static final int MAX_STARS_DEFAULT = 5;
    private static final int TYPE = 2;
    private final int maxStars;
    private final float starRating;

    public StarRating(int i) {
    }

    public static /* synthetic */ StarRating dpbdbdpbLwkLpObyKsq1lll1(Bundle bundle) {
    }

    private static StarRating fromBundle(Bundle bundle) {
    }

    public boolean equals(Object obj) {
    }

    public int getMaxStars() {
    }

    public float getStarRating() {
    }

    public int hashCode() {
    }

    @Override // com.google.android.exoplayer2.Rating
    public boolean isRated() {
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
    }

    public StarRating(int i, float f) {
    }
}
