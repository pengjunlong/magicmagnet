package com.magicmagnet.data.bean;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class BDMovieResourceResponse {
    private final Info downloadCategory;
    private final int id;
    private final String password;
    private final String url;

    @xc0
    public static final class Info {

        @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
        private final String name;

        public Info(String str) {
        }

        public static /* synthetic */ Info copy$default(Info info, String str, int i, Object obj) {
        }

        public final String component1() {
        }

        public final Info copy(String str) {
        }

        public boolean equals(Object obj) {
        }

        public final String getName() {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    public BDMovieResourceResponse(int i, String str, String str2, Info info) {
    }

    public static /* synthetic */ BDMovieResourceResponse copy$default(BDMovieResourceResponse bDMovieResourceResponse, int i, String str, String str2, Info info, int i2, Object obj) {
    }

    public final int component1() {
    }

    public final String component2() {
    }

    public final String component3() {
    }

    public final Info component4() {
    }

    public final BDMovieResourceResponse copy(int i, String str, String str2, Info info) {
    }

    public boolean equals(Object obj) {
    }

    public final Info getDownloadCategory() {
    }

    public final int getId() {
    }

    public final String getPassword() {
    }

    public final String getUrl() {
    }

    public int hashCode() {
    }

    public String toString() {
    }
}
