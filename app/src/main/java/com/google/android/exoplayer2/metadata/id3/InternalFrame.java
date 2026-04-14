package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = null;
    public static final String ID = "----";
    public final String description;
    public final String domain;
    public final String text;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.InternalFrame$1 */
    class C01331 implements Parcelable.Creator<InternalFrame> {
        C01331() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ InternalFrame createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ InternalFrame[] newArray(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InternalFrame createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InternalFrame[] newArray(int i) {
        }
    }

    public InternalFrame(String str, String str2, String str3) {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    InternalFrame(Parcel parcel) {
    }
}
