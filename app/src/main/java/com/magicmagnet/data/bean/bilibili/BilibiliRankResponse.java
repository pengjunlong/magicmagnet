package com.magicmagnet.data.bean.bilibili;

import java.util.List;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class BilibiliRankResponse {
    private final int code;
    private final String message;
    private final Result result;

    @xc0
    public static final class Result {
        private final List<Data> list;

        @xc0
        public static final class Data {
            private final String cover;
            private final NewEp new_ep;
            private final String title;

            @xc0
            public static final class NewEp {
                private final String index_show;

                public NewEp(String str) {
                }

                public static /* synthetic */ NewEp copy$default(NewEp newEp, String str, int i, Object obj) {
                }

                public final String component1() {
                }

                public final NewEp copy(String str) {
                }

                public boolean equals(Object obj) {
                }

                public final String getIndex_show() {
                }

                public int hashCode() {
                }

                public String toString() {
                }
            }

            public Data(String str, String str2, NewEp newEp) {
            }

            public static /* synthetic */ Data copy$default(Data data, String str, String str2, NewEp newEp, int i, Object obj) {
            }

            public final String component1() {
            }

            public final String component2() {
            }

            public final NewEp component3() {
            }

            public final Data copy(String str, String str2, NewEp newEp) {
            }

            public boolean equals(Object obj) {
            }

            public final String getCover() {
            }

            public final NewEp getNew_ep() {
            }

            public final String getTitle() {
            }

            public int hashCode() {
            }

            public String toString() {
            }
        }

        public Result(List<Data> list) {
        }

        public static /* synthetic */ Result copy$default(Result result, List list, int i, Object obj) {
        }

        public final List<Data> component1() {
        }

        public final Result copy(List<Data> list) {
        }

        public boolean equals(Object obj) {
        }

        public final List<Data> getList() {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    public BilibiliRankResponse(int i, String str, Result result) {
    }

    public static /* synthetic */ BilibiliRankResponse copy$default(BilibiliRankResponse bilibiliRankResponse, int i, String str, Result result, int i2, Object obj) {
    }

    public final int component1() {
    }

    public final String component2() {
    }

    public final Result component3() {
    }

    public final BilibiliRankResponse copy(int i, String str, Result result) {
    }

    public boolean equals(Object obj) {
    }

    public final int getCode() {
    }

    public final String getMessage() {
    }

    public final Result getResult() {
    }

    public int hashCode() {
    }

    public String toString() {
    }
}
