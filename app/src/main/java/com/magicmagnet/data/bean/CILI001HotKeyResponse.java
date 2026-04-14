package com.magicmagnet.data.bean;

import java.util.List;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class CILI001HotKeyResponse {
    private Data data;
    private String info;
    private int status;

    @xc0
    public static final class Data {
        private List<BtClass> bt_class;
        private List<String> hotkey;
        private int is_login;

        @xc0
        public static final class BtClass {
            private int cid;
            private String class_name;

            public BtClass(int i, String str) {
            }

            public static /* synthetic */ BtClass copy$default(BtClass btClass, int i, String str, int i2, Object obj) {
            }

            public final int component1() {
            }

            public final String component2() {
            }

            public final BtClass copy(int i, String str) {
            }

            public boolean equals(Object obj) {
            }

            public final int getCid() {
            }

            public final String getClass_name() {
            }

            public int hashCode() {
            }

            public final void setCid(int i) {
            }

            public final void setClass_name(String str) {
            }

            public String toString() {
            }
        }

        public Data(int i, List<BtClass> list, List<String> list2) {
        }

        public static /* synthetic */ Data copy$default(Data data, int i, List list, List list2, int i2, Object obj) {
        }

        public final int component1() {
        }

        public final List<BtClass> component2() {
        }

        public final List<String> component3() {
        }

        public final Data copy(int i, List<BtClass> list, List<String> list2) {
        }

        public boolean equals(Object obj) {
        }

        public final List<BtClass> getBt_class() {
        }

        public final List<String> getHotkey() {
        }

        public int hashCode() {
        }

        public final int is_login() {
        }

        public final void setBt_class(List<BtClass> list) {
        }

        public final void setHotkey(List<String> list) {
        }

        public final void set_login(int i) {
        }

        public String toString() {
        }
    }

    public CILI001HotKeyResponse(Data data, String str, int i) {
    }

    public static /* synthetic */ CILI001HotKeyResponse copy$default(CILI001HotKeyResponse cILI001HotKeyResponse, Data data, String str, int i, int i2, Object obj) {
    }

    public final Data component1() {
    }

    public final String component2() {
    }

    public final int component3() {
    }

    public final CILI001HotKeyResponse copy(Data data, String str, int i) {
    }

    public boolean equals(Object obj) {
    }

    public final Data getData() {
    }

    public final String getInfo() {
    }

    public final int getStatus() {
    }

    public int hashCode() {
    }

    public final void setData(Data data) {
    }

    public final void setInfo(String str) {
    }

    public final void setStatus(int i) {
    }

    public String toString() {
    }
}
