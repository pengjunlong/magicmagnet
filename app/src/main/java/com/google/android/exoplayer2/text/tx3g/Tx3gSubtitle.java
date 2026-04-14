package com.google.android.exoplayer2.text.tx3g;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class Tx3gSubtitle implements Subtitle {
    public static final Tx3gSubtitle EMPTY = null;
    private final List<Cue> cues;

    public Tx3gSubtitle(Cue cue) {
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public List<Cue> getCues(long j) {
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public long getEventTime(int i) {
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long j) {
    }

    private Tx3gSubtitle() {
    }
}
