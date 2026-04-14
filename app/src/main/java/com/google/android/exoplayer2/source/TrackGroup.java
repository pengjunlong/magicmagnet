package com.google.android.exoplayer2.source;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Format;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class TrackGroup implements Bundleable {
    public static final Bundleable.Creator<TrackGroup> CREATOR = null;
    private static final String FIELD_FORMATS = null;
    private static final String FIELD_ID = null;
    private static final String TAG = "TrackGroup";
    private final Format[] formats;
    private int hashCode;
    public final String id;
    public final int length;
    public final int type;

    public TrackGroup(Format... formatArr) {
    }

    public static /* synthetic */ TrackGroup dbpqdHhmDSIHIJiwc1ll1l1(Bundle bundle) {
    }

    private static /* synthetic */ TrackGroup lambda$static$0(Bundle bundle) {
    }

    private static void logErrorMessage(String str, String str2, String str3, int i) {
    }

    private static String normalizeLanguage(String str) {
    }

    private static int normalizeRoleFlags(int i) {
    }

    private void verifyCorrectness() {
    }

    public TrackGroup copyWithId(String str) {
    }

    public boolean equals(Object obj) {
    }

    public Format getFormat(int i) {
    }

    public int hashCode() {
    }

    public int indexOf(Format format) {
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
    }

    public TrackGroup(String str, Format... formatArr) {
    }
}
