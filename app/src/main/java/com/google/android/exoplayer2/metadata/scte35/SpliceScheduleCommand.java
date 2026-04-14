package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = null;
    public final List<Event> events;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$1 */
    class C01461 implements Parcelable.Creator<SpliceScheduleCommand> {
        C01461() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SpliceScheduleCommand createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SpliceScheduleCommand[] newArray(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceScheduleCommand createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceScheduleCommand[] newArray(int i) {
        }
    }

    public static final class ComponentSplice {
        public final int componentTag;
        public final long utcSpliceTime;

        /* synthetic */ ComponentSplice(int i, long j, C01461 c01461) {
        }

        static /* synthetic */ ComponentSplice access$000(Parcel parcel) {
        }

        static /* synthetic */ void access$200(ComponentSplice componentSplice, Parcel parcel) {
        }

        private static ComponentSplice createFromParcel(Parcel parcel) {
        }

        private void writeToParcel(Parcel parcel) {
        }

        private ComponentSplice(int i, long j) {
        }
    }

    /* synthetic */ SpliceScheduleCommand(Parcel parcel, C01461 c01461) {
    }

    static SpliceScheduleCommand parseFromSection(ParsableByteArray parsableByteArray) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    private SpliceScheduleCommand(List<Event> list) {
    }

    private SpliceScheduleCommand(Parcel parcel) {
    }

    public static final class Event {
        public final boolean autoReturn;
        public final int availNum;
        public final int availsExpected;
        public final long breakDurationUs;
        public final List<ComponentSplice> componentSpliceList;
        public final boolean outOfNetworkIndicator;
        public final boolean programSpliceFlag;
        public final boolean spliceEventCancelIndicator;
        public final long spliceEventId;
        public final int uniqueProgramId;
        public final long utcSpliceTime;

        private Event(long j, boolean z, boolean z2, boolean z3, List<ComponentSplice> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
        }

        static /* synthetic */ Event access$300(Parcel parcel) {
        }

        static /* synthetic */ Event access$400(ParsableByteArray parsableByteArray) {
        }

        static /* synthetic */ void access$500(Event event, Parcel parcel) {
        }

        private static Event createFromParcel(Parcel parcel) {
        }

        private static Event parseFromSection(ParsableByteArray parsableByteArray) {
        }

        private void writeToParcel(Parcel parcel) {
        }

        private Event(Parcel parcel) {
        }
    }
}
