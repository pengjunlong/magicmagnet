package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = null;
    public final byte[] commandBytes;
    public final long identifier;
    public final long ptsAdjustment;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.PrivateCommand$1 */
    class C01431 implements Parcelable.Creator<PrivateCommand> {
        C01431() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PrivateCommand createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PrivateCommand[] newArray(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PrivateCommand createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PrivateCommand[] newArray(int i) {
        }
    }

    /* synthetic */ PrivateCommand(Parcel parcel, C01431 c01431) {
    }

    static PrivateCommand parseFromSection(ParsableByteArray parsableByteArray, int i, long j) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    private PrivateCommand(long j, byte[] bArr, long j2) {
    }

    private PrivateCommand(Parcel parcel) {
    }
}
