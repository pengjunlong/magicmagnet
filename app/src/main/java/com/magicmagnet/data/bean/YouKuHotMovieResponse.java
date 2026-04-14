package com.magicmagnet.data.bean;

import java.util.List;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class YouKuHotMovieResponse {
    private int cgi_cost_time;
    private int curpagesize;
    private String datejson;
    private Jsonvalue jsonvalue;
    private String msg;
    private int ret;
    private int total;

    @xc0
    public static final class Jsonvalue {
        private int costtime;
        private String errormsg;
        private int errorno;
        private int resptime;
        private List<Results> results;

        @xc0
        public static final class Results {
            private Fields fields;
            private String id;
            private int retcode;

            @xc0
            public static final class Fields {
                private Object average_score;
                private double c_hlw_score;
                private String c_title;
                private Object cartoon_aspect;
                private Object cartoon_genre;
                private Object column_info;
                private int cover_checkup_grade;
                private String cover_id;
                private String horizontal_pic_url;
                private String new_pic_hz;
                private String new_pic_vt;
                private String online_time;
                private double opinion_score;
                private Object pay_episodes;
                private Object pay_imgtag;
                private int pay_status;
                private Object pay_subscript;
                private List<String> playright;
                private String real_exclusive;
                private Score score;
                private String second_title;
                private String title;
                private String title_en;
                private int type;
                private String type_name;
                private String vertical_pic_url;
                private String web20_imgtag;

                @xc0
                public static final class Score {
                    private String c_mix_score;
                    private String hot;
                    private String score;

                    public Score(String str, String str2, String str3) {
                    }

                    public static /* synthetic */ Score copy$default(Score score, String str, String str2, String str3, int i, Object obj) {
                    }

                    public final String component1() {
                    }

                    public final String component2() {
                    }

                    public final String component3() {
                    }

                    public final Score copy(String str, String str2, String str3) {
                    }

                    public boolean equals(Object obj) {
                    }

                    public final String getC_mix_score() {
                    }

                    public final String getHot() {
                    }

                    public final String getScore() {
                    }

                    public int hashCode() {
                    }

                    public final void setC_mix_score(String str) {
                    }

                    public final void setHot(String str) {
                    }

                    public final void setScore(String str) {
                    }

                    public String toString() {
                    }
                }

                public Fields(Object obj, double d, String str, Object obj2, Object obj3, Object obj4, int i, String str2, String str3, String str4, String str5, String str6, double d2, Object obj5, Object obj6, int i2, Object obj7, String str7, Score score, String str8, String str9, String str10, int i3, String str11, String str12, String str13, List<String> list) {
                }

                public static /* synthetic */ Fields copy$default(Fields fields, Object obj, double d, String str, Object obj2, Object obj3, Object obj4, int i, String str2, String str3, String str4, String str5, String str6, double d2, Object obj5, Object obj6, int i2, Object obj7, String str7, Score score, String str8, String str9, String str10, int i3, String str11, String str12, String str13, List list, int i4, Object obj8) {
                }

                public final Object component1() {
                }

                public final String component10() {
                }

                public final String component11() {
                }

                public final String component12() {
                }

                public final double component13() {
                }

                public final Object component14() {
                }

                public final Object component15() {
                }

                public final int component16() {
                }

                public final Object component17() {
                }

                public final String component18() {
                }

                public final Score component19() {
                }

                public final double component2() {
                }

                public final String component20() {
                }

                public final String component21() {
                }

                public final String component22() {
                }

                public final int component23() {
                }

                public final String component24() {
                }

                public final String component25() {
                }

                public final String component26() {
                }

                public final List<String> component27() {
                }

                public final String component3() {
                }

                public final Object component4() {
                }

                public final Object component5() {
                }

                public final Object component6() {
                }

                public final int component7() {
                }

                public final String component8() {
                }

                public final String component9() {
                }

                public final Fields copy(Object obj, double d, String str, Object obj2, Object obj3, Object obj4, int i, String str2, String str3, String str4, String str5, String str6, double d2, Object obj5, Object obj6, int i2, Object obj7, String str7, Score score, String str8, String str9, String str10, int i3, String str11, String str12, String str13, List<String> list) {
                }

                public boolean equals(Object obj) {
                }

                public final Object getAverage_score() {
                }

                public final double getC_hlw_score() {
                }

                public final String getC_title() {
                }

                public final Object getCartoon_aspect() {
                }

                public final Object getCartoon_genre() {
                }

                public final Object getColumn_info() {
                }

                public final int getCover_checkup_grade() {
                }

                public final String getCover_id() {
                }

                public final String getHorizontal_pic_url() {
                }

                public final String getNew_pic_hz() {
                }

                public final String getNew_pic_vt() {
                }

                public final String getOnline_time() {
                }

                public final double getOpinion_score() {
                }

                public final Object getPay_episodes() {
                }

                public final Object getPay_imgtag() {
                }

                public final int getPay_status() {
                }

                public final Object getPay_subscript() {
                }

                public final List<String> getPlayright() {
                }

                public final String getReal_exclusive() {
                }

                public final Score getScore() {
                }

                public final String getSecond_title() {
                }

                public final String getTitle() {
                }

                public final String getTitle_en() {
                }

                public final int getType() {
                }

                public final String getType_name() {
                }

                public final String getVertical_pic_url() {
                }

                public final String getWeb20_imgtag() {
                }

                public int hashCode() {
                }

                public final void setAverage_score(Object obj) {
                }

                public final void setC_hlw_score(double d) {
                }

                public final void setC_title(String str) {
                }

                public final void setCartoon_aspect(Object obj) {
                }

                public final void setCartoon_genre(Object obj) {
                }

                public final void setColumn_info(Object obj) {
                }

                public final void setCover_checkup_grade(int i) {
                }

                public final void setCover_id(String str) {
                }

                public final void setHorizontal_pic_url(String str) {
                }

                public final void setNew_pic_hz(String str) {
                }

                public final void setNew_pic_vt(String str) {
                }

                public final void setOnline_time(String str) {
                }

                public final void setOpinion_score(double d) {
                }

                public final void setPay_episodes(Object obj) {
                }

                public final void setPay_imgtag(Object obj) {
                }

                public final void setPay_status(int i) {
                }

                public final void setPay_subscript(Object obj) {
                }

                public final void setPlayright(List<String> list) {
                }

                public final void setReal_exclusive(String str) {
                }

                public final void setScore(Score score) {
                }

                public final void setSecond_title(String str) {
                }

                public final void setTitle(String str) {
                }

                public final void setTitle_en(String str) {
                }

                public final void setType(int i) {
                }

                public final void setType_name(String str) {
                }

                public final void setVertical_pic_url(String str) {
                }

                public final void setWeb20_imgtag(String str) {
                }

                public String toString() {
                }
            }

            public Results(Fields fields, String str, int i) {
            }

            public static /* synthetic */ Results copy$default(Results results, Fields fields, String str, int i, int i2, Object obj) {
            }

            public final Fields component1() {
            }

            public final String component2() {
            }

            public final int component3() {
            }

            public final Results copy(Fields fields, String str, int i) {
            }

            public boolean equals(Object obj) {
            }

            public final Fields getFields() {
            }

            public final String getId() {
            }

            public final int getRetcode() {
            }

            public int hashCode() {
            }

            public final void setFields(Fields fields) {
            }

            public final void setId(String str) {
            }

            public final void setRetcode(int i) {
            }

            public String toString() {
            }
        }

        public Jsonvalue(int i, String str, int i2, int i3, List<Results> list) {
        }

        public static /* synthetic */ Jsonvalue copy$default(Jsonvalue jsonvalue, int i, String str, int i2, int i3, List list, int i4, Object obj) {
        }

        public final int component1() {
        }

        public final String component2() {
        }

        public final int component3() {
        }

        public final int component4() {
        }

        public final List<Results> component5() {
        }

        public final Jsonvalue copy(int i, String str, int i2, int i3, List<Results> list) {
        }

        public boolean equals(Object obj) {
        }

        public final int getCosttime() {
        }

        public final String getErrormsg() {
        }

        public final int getErrorno() {
        }

        public final int getResptime() {
        }

        public final List<Results> getResults() {
        }

        public int hashCode() {
        }

        public final void setCosttime(int i) {
        }

        public final void setErrormsg(String str) {
        }

        public final void setErrorno(int i) {
        }

        public final void setResptime(int i) {
        }

        public final void setResults(List<Results> list) {
        }

        public String toString() {
        }
    }

    public YouKuHotMovieResponse(int i, int i2, String str, Jsonvalue jsonvalue, String str2, int i3, int i4) {
    }

    public static /* synthetic */ YouKuHotMovieResponse copy$default(YouKuHotMovieResponse youKuHotMovieResponse, int i, int i2, String str, Jsonvalue jsonvalue, String str2, int i3, int i4, int i5, Object obj) {
    }

    public final int component1() {
    }

    public final int component2() {
    }

    public final String component3() {
    }

    public final Jsonvalue component4() {
    }

    public final String component5() {
    }

    public final int component6() {
    }

    public final int component7() {
    }

    public final YouKuHotMovieResponse copy(int i, int i2, String str, Jsonvalue jsonvalue, String str2, int i3, int i4) {
    }

    public boolean equals(Object obj) {
    }

    public final int getCgi_cost_time() {
    }

    public final int getCurpagesize() {
    }

    public final String getDatejson() {
    }

    public final Jsonvalue getJsonvalue() {
    }

    public final String getMsg() {
    }

    public final int getRet() {
    }

    public final int getTotal() {
    }

    public int hashCode() {
    }

    public final void setCgi_cost_time(int i) {
    }

    public final void setCurpagesize(int i) {
    }

    public final void setDatejson(String str) {
    }

    public final void setJsonvalue(Jsonvalue jsonvalue) {
    }

    public final void setMsg(String str) {
    }

    public final void setRet(int i) {
    }

    public final void setTotal(int i) {
    }

    public String toString() {
    }
}
