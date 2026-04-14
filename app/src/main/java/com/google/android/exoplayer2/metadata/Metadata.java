package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaMetadata;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = null;
    private final Entry[] entries;
    public final long presentationTimeUs;

    /* renamed from: com.google.android.exoplayer2.metadata.Metadata$1 */
    class C01191 implements Parcelable.Creator<Metadata> {
        C01191() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Metadata createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Metadata[] newArray(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Metadata createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Metadata[] newArray(int i) {
        }
    }

    public interface Entry extends Parcelable {
        byte[] getWrappedMetadataBytes();

        Format getWrappedMetadataFormat();

        void populateMediaMetadata(MediaMetadata.Builder builder);
    }

    public Metadata(Entry... entryArr) {
    }

    public Metadata copyWithAppendedEntries(Entry... entryArr) {
    }

    public Metadata copyWithAppendedEntriesFrom(Metadata metadata) {
    }

    public Metadata copyWithPresentationTimeUs(long j) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public Entry get(int i) {
    }

    public int hashCode() {
    }

    public int length() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    public Metadata(long j, Entry... entryArr) {
    }

    public Metadata(List<? extends Entry> list) {
    }

    public Metadata(long j, List<? extends Entry> list) {
    }

    Metadata(Parcel parcel) {
    }
}
