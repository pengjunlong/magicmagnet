package com.google.android.exoplayer2.trackselection;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class TrackSelectionOverride implements Bundleable {
    public static final Bundleable.Creator<TrackSelectionOverride> CREATOR = null;
    private static final String FIELD_TRACKS = null;
    private static final String FIELD_TRACK_GROUP = null;
    public final TrackGroup mediaTrackGroup;
    public final ImmutableList<Integer> trackIndices;

    public TrackSelectionOverride(TrackGroup trackGroup, int i) {
    }

    public static /* synthetic */ TrackSelectionOverride dbpqdHhmDSIHIJiwc1ll1l1(Bundle bundle) {
    }

    private static /* synthetic */ TrackSelectionOverride lambda$static$0(Bundle bundle) {
    }

    public boolean equals(Object obj) {
    }

    public int getType() {
    }

    public int hashCode() {
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
    }

    public TrackSelectionOverride(TrackGroup trackGroup, List<Integer> list) {
    }
}
