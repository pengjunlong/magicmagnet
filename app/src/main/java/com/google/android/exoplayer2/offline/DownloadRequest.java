package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.MediaItem;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = null;
    public final String customCacheKey;
    public final byte[] data;
    public final String id;
    public final byte[] keySetId;
    public final String mimeType;
    public final List<StreamKey> streamKeys;
    public final Uri uri;

    /* renamed from: com.google.android.exoplayer2.offline.DownloadRequest$1 */
    class C01531 implements Parcelable.Creator<DownloadRequest> {
        C01531() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DownloadRequest createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DownloadRequest[] newArray(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DownloadRequest createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DownloadRequest[] newArray(int i) {
        }
    }

    public static class Builder {
        private String customCacheKey;
        private byte[] data;
        private final String id;
        private byte[] keySetId;
        private String mimeType;
        private List<StreamKey> streamKeys;
        private final Uri uri;

        public Builder(String str, Uri uri) {
        }

        public DownloadRequest build() {
        }

        @CanIgnoreReturnValue
        public Builder setCustomCacheKey(String str) {
        }

        @CanIgnoreReturnValue
        public Builder setData(byte[] bArr) {
        }

        @CanIgnoreReturnValue
        public Builder setKeySetId(byte[] bArr) {
        }

        @CanIgnoreReturnValue
        public Builder setMimeType(String str) {
        }

        @CanIgnoreReturnValue
        public Builder setStreamKeys(List<StreamKey> list) {
        }
    }

    public static class UnsupportedRequestException extends IOException {
    }

    /* synthetic */ DownloadRequest(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2, C01531 c01531) {
    }

    public DownloadRequest copyWithId(String str) {
    }

    public DownloadRequest copyWithKeySetId(byte[] bArr) {
    }

    public DownloadRequest copyWithMergedRequest(DownloadRequest downloadRequest) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final int hashCode() {
    }

    public MediaItem toMediaItem() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    private DownloadRequest(String str, Uri uri, String str2, List<StreamKey> list, byte[] bArr, String str3, byte[] bArr2) {
    }

    DownloadRequest(Parcel parcel) {
    }
}
