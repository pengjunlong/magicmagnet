package com.magicmagnet.data.bean;

import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class ServerConfig {
    private final AnnouncementConfig announcement;
    private final ParseConfig parse;
    private final UrlConfig urls;

    @xc0
    public static final class AnnouncementConfig {
        private final String freeUser;
        private final String proUser;
        private final String unloginUser;

        public AnnouncementConfig(String str, String str2, String str3) {
        }

        public static /* synthetic */ AnnouncementConfig copy$default(AnnouncementConfig announcementConfig, String str, String str2, String str3, int i, Object obj) {
        }

        public final String component1() {
        }

        public final String component2() {
        }

        public final String component3() {
        }

        public final AnnouncementConfig copy(String str, String str2, String str3) {
        }

        public boolean equals(Object obj) {
        }

        public final String getFreeUser() {
        }

        public final String getProUser() {
        }

        public final String getUnloginUser() {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    @xc0
    public static final class JakConfig {
        private final String host;
        private final String path;
        private final String version;

        public JakConfig(String str, String str2, String str3) {
        }

        public static /* synthetic */ JakConfig copy$default(JakConfig jakConfig, String str, String str2, String str3, int i, Object obj) {
        }

        public final String component1() {
        }

        public final String component2() {
        }

        public final String component3() {
        }

        public final JakConfig copy(String str, String str2, String str3) {
        }

        public boolean equals(Object obj) {
        }

        public final String getHost() {
        }

        public final String getPath() {
        }

        public final String getVersion() {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    @xc0
    public static final class PageConfig {
        private final String freePages;
        private final String proPages;

        public PageConfig(String str, String str2) {
        }

        public static /* synthetic */ PageConfig copy$default(PageConfig pageConfig, String str, String str2, int i, Object obj) {
        }

        public final String component1() {
        }

        public final String component2() {
        }

        public final PageConfig copy(String str, String str2) {
        }

        public boolean equals(Object obj) {
        }

        public final String getFreePages() {
        }

        public final String getProPages() {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    @xc0
    public static final class ParseConfig {
        private final JakConfig jak;
        private final PageConfig pages;

        public ParseConfig(PageConfig pageConfig, JakConfig jakConfig) {
        }

        public static /* synthetic */ ParseConfig copy$default(ParseConfig parseConfig, PageConfig pageConfig, JakConfig jakConfig, int i, Object obj) {
        }

        public final PageConfig component1() {
        }

        public final JakConfig component2() {
        }

        public final ParseConfig copy(PageConfig pageConfig, JakConfig jakConfig) {
        }

        public boolean equals(Object obj) {
        }

        public final JakConfig getJak() {
        }

        public final PageConfig getPages() {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    @xc0
    public static final class UrlConfig {
        private final String btdy;
        private final String cili001;
        private final String dytt;
        private final String gaoqingfm;
        private final String hao6v;
        private final String mp4ba;

        public UrlConfig(String str, String str2, String str3, String str4, String str5, String str6) {
        }

        public static /* synthetic */ UrlConfig copy$default(UrlConfig urlConfig, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        }

        public final String component1() {
        }

        public final String component2() {
        }

        public final String component3() {
        }

        public final String component4() {
        }

        public final String component5() {
        }

        public final String component6() {
        }

        public final UrlConfig copy(String str, String str2, String str3, String str4, String str5, String str6) {
        }

        public boolean equals(Object obj) {
        }

        public final String getBtdy() {
        }

        public final String getCili001() {
        }

        public final String getDytt() {
        }

        public final String getGaoqingfm() {
        }

        public final String getHao6v() {
        }

        public final String getMp4ba() {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    public ServerConfig(UrlConfig urlConfig, ParseConfig parseConfig, AnnouncementConfig announcementConfig) {
    }

    public static /* synthetic */ ServerConfig copy$default(ServerConfig serverConfig, UrlConfig urlConfig, ParseConfig parseConfig, AnnouncementConfig announcementConfig, int i, Object obj) {
    }

    public final UrlConfig component1() {
    }

    public final ParseConfig component2() {
    }

    public final AnnouncementConfig component3() {
    }

    public final ServerConfig copy(UrlConfig urlConfig, ParseConfig parseConfig, AnnouncementConfig announcementConfig) {
    }

    public boolean equals(Object obj) {
    }

    public final AnnouncementConfig getAnnouncement() {
    }

    public final ParseConfig getParse() {
    }

    public final UrlConfig getUrls() {
    }

    public int hashCode() {
    }

    public String toString() {
    }
}
