package com.magicmagnet.data.bean.bilibili;

import kotlin.Metadata;
import p000.dy0;
import p000.jl0;
import p000.ui;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public interface BilibiliServer {

    @xc0
    public static final class DefaultImpls {
        public static /* synthetic */ jl0 getHotMovies$default(BilibiliServer bilibiliServer, String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, String str5, String str6, int i5, Object obj) {
        }
    }

    @ui("cate/search")
    jl0<BilibiliMovieResponse> getHotMovies(@dy0("main_ver") String str, @dy0("search_type") String str2, @dy0("view_type") String str3, @dy0("order") String str4, @dy0("copy_right") int i, @dy0("cate_id") int i2, @dy0("page") int i3, @dy0("pagesize") int i4, @dy0("time_from") String str5, @dy0("time_to") String str6);
}
