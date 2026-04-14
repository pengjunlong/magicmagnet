package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class Tracks implements Bundleable {
    public static final Bundleable.Creator<Tracks> CREATOR = null;
    public static final Tracks EMPTY = null;
    private static final String FIELD_TRACK_GROUPS = null;
    private final ImmutableList<Group> groups;

    public static final class Group implements Bundleable {
        public static final Bundleable.Creator<Group> CREATOR = null;
        private static final String FIELD_ADAPTIVE_SUPPORTED = null;
        private static final String FIELD_TRACK_GROUP = null;
        private static final String FIELD_TRACK_SELECTED = null;
        private static final String FIELD_TRACK_SUPPORT = null;
        private final boolean adaptiveSupported;
        public final int length;
        private final TrackGroup mediaTrackGroup;
        private final boolean[] trackSelected;
        private final int[] trackSupport;

        public Group(TrackGroup trackGroup, boolean z, int[] iArr, boolean[] zArr) {
        }

        public static /* synthetic */ Group dbpqdHhmDSIHIJiwc1ll1l1(Bundle bundle) {
        }

        private static /* synthetic */ Group lambda$static$0(Bundle bundle) {
        }

        public boolean equals(Object obj) {
        }

        public TrackGroup getMediaTrackGroup() {
        }

        public Format getTrackFormat(int i) {
        }

        public int getTrackSupport(int i) {
        }

        public int getType() {
        }

        public int hashCode() {
        }

        public boolean isAdaptiveSupported() {
        }

        public boolean isSelected() {
        }

        public boolean isSupported() {
        }

        public boolean isTrackSelected(int i) {
        }

        public boolean isTrackSupported(int i) {
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
        }

        public boolean isSupported(boolean z) {
        }

        public boolean isTrackSupported(int i, boolean z) {
        }
    }

    public Tracks(List<Group> list) {
    }

    public static /* synthetic */ Tracks dbpqdHhmDSIHIJiwc1ll1l1(Bundle bundle) {
    }

    private static /* synthetic */ Tracks lambda$static$0(Bundle bundle) {
    }

    public boolean containsType(int i) {
    }

    public boolean equals(Object obj) {
    }

    public ImmutableList<Group> getGroups() {
    }

    public int hashCode() {
    }

    public boolean isEmpty() {
    }

    public boolean isTypeSelected(int i) {
    }

    public boolean isTypeSupported(int i) {
    }

    @Deprecated
    public boolean isTypeSupportedOrEmpty(int i) {
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
    }

    public boolean isTypeSupported(int i, boolean z) {
    }

    @Deprecated
    public boolean isTypeSupportedOrEmpty(int i, boolean z) {
    }
}
