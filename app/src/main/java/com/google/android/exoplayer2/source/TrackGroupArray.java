package com.google.android.exoplayer2.source;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.common.collect.ImmutableList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class TrackGroupArray implements Bundleable {
    public static final Bundleable.Creator<TrackGroupArray> CREATOR = null;
    public static final TrackGroupArray EMPTY = null;
    private static final String FIELD_TRACK_GROUPS = null;
    private static final String TAG = "TrackGroupArray";
    private int hashCode;
    public final int length;
    private final ImmutableList<TrackGroup> trackGroups;

    public TrackGroupArray(TrackGroup... trackGroupArr) {
    }

    public static /* synthetic */ TrackGroupArray dbpqdHhmDSIHIJiwc1ll1l1(Bundle bundle) {
    }

    private static /* synthetic */ TrackGroupArray lambda$static$0(Bundle bundle) {
    }

    private void verifyCorrectness() {
    }

    public boolean equals(Object obj) {
    }

    public TrackGroup get(int i) {
    }

    public int hashCode() {
    }

    public int indexOf(TrackGroup trackGroup) {
    }

    public boolean isEmpty() {
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
    }
}
