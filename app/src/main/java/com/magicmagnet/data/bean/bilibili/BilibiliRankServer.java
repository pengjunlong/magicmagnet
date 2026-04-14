package com.magicmagnet.data.bean.bilibili;

import kotlin.Metadata;
import p000.dy0;
import p000.jl0;
import p000.ui;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public interface BilibiliRankServer {

    @xc0
    public static final class DefaultImpls {
        public static /* synthetic */ jl0 getHotMovies$default(BilibiliRankServer bilibiliRankServer, int i, int i2, int i3, Object obj) {
        }
    }

    @ui("/pgc/web/rank/list")
    jl0<BilibiliRankResponse> getHotMovies(@dy0("day") int i, @dy0("season_type") int i2);
}
