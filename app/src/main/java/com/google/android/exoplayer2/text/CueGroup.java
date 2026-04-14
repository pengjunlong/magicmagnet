package com.google.android.exoplayer2.text;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class CueGroup implements Bundleable {
    public static final Bundleable.Creator<CueGroup> CREATOR = null;
    public static final CueGroup EMPTY_TIME_ZERO = null;
    private static final String FIELD_CUES = null;
    private static final String FIELD_PRESENTATION_TIME_US = null;
    public final ImmutableList<Cue> cues;
    public final long presentationTimeUs;

    public CueGroup(List<Cue> list, long j) {
    }

    public static /* synthetic */ CueGroup dbpqdHhmDSIHIJiwc1ll1l1(Bundle bundle) {
    }

    private static ImmutableList<Cue> filterOutBitmapCues(List<Cue> list) {
    }

    private static final CueGroup fromBundle(Bundle bundle) {
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
    }
}
