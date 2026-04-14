package com.magicmagnet.data.bean;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class YSubFileList {
    private final String hash;
    private final ArrayList<File> subfile_list;

    @xc0
    public static final class File {

        @SerializedName(FirebaseAnalytics.Param.INDEX)
        private final String encryptIndex;
        private final String name;
        private final String size;

        public File(String str, String str2, String str3) {
        }

        public static /* synthetic */ File copy$default(File file, String str, String str2, String str3, int i, Object obj) {
        }

        public final String component1() {
        }

        public final String component2() {
        }

        public final String component3() {
        }

        public final File copy(String str, String str2, String str3) {
        }

        public boolean equals(Object obj) {
        }

        public final String getEncryptIndex() {
        }

        public final String getName() {
        }

        public final String getSize() {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    public YSubFileList(String str, ArrayList<File> arrayList) {
    }

    public static /* synthetic */ YSubFileList copy$default(YSubFileList ySubFileList, String str, ArrayList arrayList, int i, Object obj) {
    }

    public final String component1() {
    }

    public final ArrayList<File> component2() {
    }

    public final YSubFileList copy(String str, ArrayList<File> arrayList) {
    }

    public boolean equals(Object obj) {
    }

    public final String getHash() {
    }

    public final ArrayList<File> getSubfile_list() {
    }

    public int hashCode() {
    }

    public String toString() {
    }
}
