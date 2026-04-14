package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = null;
    private int hashCode;
    public final int schemeDataCount;
    private final SchemeData[] schemeDatas;
    public final String schemeType;

    /* renamed from: com.google.android.exoplayer2.drm.DrmInitData$1 */
    class C00981 implements Parcelable.Creator<DrmInitData> {
        C00981() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DrmInitData createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DrmInitData[] newArray(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DrmInitData createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DrmInitData[] newArray(int i) {
        }
    }

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = null;
        public final byte[] data;
        private int hashCode;
        public final String licenseServerUrl;
        public final String mimeType;
        public final UUID uuid;

        /* renamed from: com.google.android.exoplayer2.drm.DrmInitData$SchemeData$1 */
        class C00991 implements Parcelable.Creator<SchemeData> {
            C00991() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SchemeData createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SchemeData[] newArray(int i) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SchemeData createFromParcel(Parcel parcel) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SchemeData[] newArray(int i) {
            }
        }

        public SchemeData(UUID uuid, String str, byte[] bArr) {
        }

        public boolean canReplace(SchemeData schemeData) {
        }

        public SchemeData copyWithData(byte[] bArr) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        public boolean equals(Object obj) {
        }

        public boolean hasData() {
        }

        public int hashCode() {
        }

        public boolean matches(UUID uuid) {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
        }

        SchemeData(Parcel parcel) {
        }
    }

    public DrmInitData(List<SchemeData> list) {
    }

    private static boolean containsSchemeDataWithUuid(ArrayList<SchemeData> arrayList, int i, UUID uuid) {
    }

    public static DrmInitData createSessionCreationData(DrmInitData drmInitData, DrmInitData drmInitData2) {
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(SchemeData schemeData, SchemeData schemeData2) {
    }

    public DrmInitData copyWithSchemeType(String str) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
    }

    public SchemeData get(int i) {
    }

    public int hashCode() {
    }

    public DrmInitData merge(DrmInitData drmInitData) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    public DrmInitData(String str, List<SchemeData> list) {
    }

    /* renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(SchemeData schemeData, SchemeData schemeData2) {
    }

    public DrmInitData(SchemeData... schemeDataArr) {
    }

    public DrmInitData(String str, SchemeData... schemeDataArr) {
    }

    private DrmInitData(String str, boolean z, SchemeData... schemeDataArr) {
    }

    DrmInitData(Parcel parcel) {
    }
}
