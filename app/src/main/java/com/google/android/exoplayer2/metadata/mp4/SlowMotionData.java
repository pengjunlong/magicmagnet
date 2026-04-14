package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Comparator;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = null;
    public final List<Segment> segments;

    /* renamed from: com.google.android.exoplayer2.metadata.mp4.SlowMotionData$1 */
    class C01401 implements Parcelable.Creator<SlowMotionData> {
        C01401() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SlowMotionData createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SlowMotionData[] newArray(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SlowMotionData createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SlowMotionData[] newArray(int i) {
        }
    }

    public static final class Segment implements Parcelable {
        public static final Comparator<Segment> BY_START_THEN_END_THEN_DIVISOR = null;
        public static final Parcelable.Creator<Segment> CREATOR = null;
        public final long endTimeMs;
        public final int speedDivisor;
        public final long startTimeMs;

        /* renamed from: com.google.android.exoplayer2.metadata.mp4.SlowMotionData$Segment$1 */
        class C01411 implements Parcelable.Creator<Segment> {
            C01411() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Segment createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Segment[] newArray(int i) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Segment createFromParcel(Parcel parcel) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Segment[] newArray(int i) {
            }
        }

        public Segment(long j, long j2, int i) {
        }

        public static /* synthetic */ int dbpqdHhmDSIHIJiwc1ll1l1(Segment segment, Segment segment2) {
        }

        private static /* synthetic */ int lambda$static$0(Segment segment, Segment segment2) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }
    }

    public SlowMotionData(List<Segment> list) {
    }

    private static boolean doSegmentsOverlap(List<Segment> list) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ Format getWrappedMetadataFormat() {
    }

    public int hashCode() {
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void populateMediaMetadata(MediaMetadata.Builder builder) {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
