package com.google.android.exoplayer2.offline;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = null;
    public final int groupIndex;
    public final int periodIndex;
    public final int streamIndex;

    @Deprecated
    public final int trackIndex;

    /* renamed from: com.google.android.exoplayer2.offline.StreamKey$1 */
    class C01571 implements Parcelable.Creator<StreamKey> {
        C01571() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ StreamKey createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ StreamKey[] newArray(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StreamKey createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StreamKey[] newArray(int i) {
        }
    }

    public StreamKey(int i, int i2) {
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(StreamKey streamKey) {
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

    public StreamKey(int i, int i2, int i3) {
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(StreamKey streamKey) {
    }

    StreamKey(Parcel parcel) {
    }
}
