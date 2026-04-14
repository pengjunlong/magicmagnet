package com.magicmagnet.data.bean;

import java.util.ArrayList;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class BFFile {
    private final int code;
    private final BFData data;
    private final String msg;

    @xc0
    public static final class BFData {
        private final ArrayList<BFFileData> file_data;
        private final String file_name;

        @xc0
        public static final class BFFileData {
            private final int index;
            private final String name;
            private final String size;
            private final String url;

            public BFFileData(String str, String str2, String str3, int i) {
            }

            public static /* synthetic */ BFFileData copy$default(BFFileData bFFileData, String str, String str2, String str3, int i, int i2, Object obj) {
            }

            public final String component1() {
            }

            public final String component2() {
            }

            public final String component3() {
            }

            public final int component4() {
            }

            public final BFFileData copy(String str, String str2, String str3, int i) {
            }

            public boolean equals(Object obj) {
            }

            public final int getIndex() {
            }

            public final String getName() {
            }

            public final String getSize() {
            }

            public final String getUrl() {
            }

            public int hashCode() {
            }

            public String toString() {
            }
        }

        public BFData(String str, ArrayList<BFFileData> arrayList) {
        }

        public static /* synthetic */ BFData copy$default(BFData bFData, String str, ArrayList arrayList, int i, Object obj) {
        }

        public final String component1() {
        }

        public final ArrayList<BFFileData> component2() {
        }

        public final BFData copy(String str, ArrayList<BFFileData> arrayList) {
        }

        public boolean equals(Object obj) {
        }

        public final ArrayList<BFFileData> getFile_data() {
        }

        public final String getFile_name() {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    public BFFile(int i, String str, BFData bFData) {
    }

    public static /* synthetic */ BFFile copy$default(BFFile bFFile, int i, String str, BFData bFData, int i2, Object obj) {
    }

    public final int component1() {
    }

    public final String component2() {
    }

    public final BFData component3() {
    }

    public final BFFile copy(int i, String str, BFData bFData) {
    }

    public boolean equals(Object obj) {
    }

    public final int getCode() {
    }

    public final BFData getData() {
    }

    public final String getMsg() {
    }

    public int hashCode() {
    }

    public String toString() {
    }
}
