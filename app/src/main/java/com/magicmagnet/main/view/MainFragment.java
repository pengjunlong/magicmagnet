package com.magicmagnet.main.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import cn.bingoogolapple.bgabanner.BGABanner;
import com.google.gson.reflect.TypeToken;
import com.magicmagnet.data.bean.CustomAd;
import com.magicmagnet.data.bean.HotMovieResponse;
import com.magicmagnet.data.bean.IData;
import com.magicmagnet.data.bean.IKaiYanData;
import com.othershe.library.NiceImageView;
import com.zhy.view.flowlayout.TagFlowLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p000.dt;
import p000.dy1;
import p000.eo1;
import p000.et;
import p000.gi;
import p000.gn1;
import p000.mv1;
import p000.no;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.qh;
import p000.qqqqdpdZawTcmNbkDCA11ll11l1;
import p000.qr;
import p000.r60;
import p000.rr;
import p000.sh;
import p000.up;
import p000.us;
import p000.v40;
import p000.v51;
import p000.vp;
import p000.wf;
import p000.xa1;
import p000.xc0;
import p000.y40;
import p000.zs;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class MainFragment extends qqqqdpdZawTcmNbkDCA11ll11l1<qr> implements rr, et {
    public static final dbpqdHhmDSIHIJiwc1ll1l1 dqbbdddqpLERmaRLiHiDpL1l1l1l = null;
    public dpbdbdpbLwkLpObyKsq1lll1 bbdbbpdOJSuInlll111l;
    private TagFlowLayout bdddqmITkkeGpsxVXHR1l1llll;
    private final y40 bdpdqYMMfHmzHyUIbllllll1;
    private HotMovieResponse bpbbpOxqjGWQAsycX11ll1l1;
    private final y40 bpdddqbpEtpkwNYukGjjNs1l111;
    public dpbdbdpbLwkLpObyKsq1lll1 bppbpdbCeZVhQNTixBml1lll11l;
    public dpbdbdpbLwkLpObyKsq1lll1 bpppdpppqFAXRSTHUAmVJLvH11lllll1l;
    private final y40 bpppqdQjfPiCT111111111;
    public Map<Integer, View> bpqbbpqpqkDmeOUxxUylkHyYgWv11111;
    private final y40 bpqbbqTOKdRXac1ll1l1lll;
    private final y40 bpqdqbqpviKiORjqgp1l111l11;
    public RecyclerView dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
    public SwipeRefreshLayout dbbpdqqpdVUhpQ1ll11;
    private final y40 dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1;
    private zs dbppbdqpeLmcbs11l11;
    private final y40 dddbpbpNqzZZJmSG1111l;
    private final y40 ddddbbdqIccDnEitQc1l1l1l;
    private final y40 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private final y40 dpbdqAKWNZAIXLyehU1lll1lll1;
    private View dqdqbpQposEBDyDxIyyz1ll11;
    private final y40 dqqpbqaYiRPLeqRCYteXfDW1l111l11l;
    private final y40 pbppbpqbamJRy11l1l1;
    private final y40 pdpqbmApOBCmNMwnn1ll111;
    private final y40 ppdqqzXJzQiU11ll11;
    public View qbddqbdJBkudFfhX1ll1l111;
    private View qbdpqpstJKhhKkXrsOGvbWw1l1llll;
    public dpbdbdpbLwkLpObyKsq1lll1 qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;
    private final y40 qbpbddbpyaPAbpThgWCvm11l11l1;
    public dqqppqiKzJi1l1lll1l qdqdpyALEmZFGGaahRTIU1ll11;
    private HotMovieResponse qppqdpppIauLKaAtRkB11111l;
    private r60 qqbqbddiRRgLpniPxlUfQzP1l1l1l;
    private final y40 qqdbbfmUWwoYYpfYHJZdaUO1111llll;
    private final y40 qqpbppebHUxqEmlGoAJWl1lll;

    @Metadata
    static final class bbdbbpdOJSuInlll111l extends v40 implements qh<dbpqdHhmDSIHIJiwc1ll1l1> {
        final /* synthetic */ MainFragment dpbdpqRKAscW1lll1l;

        @Metadata
        public static final class dbpqdHhmDSIHIJiwc1ll1l1 implements zs {
            final /* synthetic */ MainFragment dpbdpqRKAscW1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(MainFragment mainFragment) {
            }

            @Override // p000.zs
            public void bpppqdQjfPiCT111111111(List<? extends IData> list) {
            }

            @Override // p000.zs
            public void bpqbdddbQzWMiIJFWdSJrGCER1l1l11ll(String str) {
            }

            @Override // p000.zs
            public void dbppbdqpeLmcbs11l11() {
            }

            @Override // p000.zs
            public String dddbpbpNqzZZJmSG1111l() {
            }

            @Override // p000.zs
            public void ddpbddGpKmMvSPZaXEkLg11l11(List<? extends IData> list) {
            }

            @Override // p000.zs
            public void pbdpdbqqdJtdUmQAgX1llll1() {
            }

            @Override // p000.zs
            public void pdpppduUgcghSRP11l11l(String str) {
            }

            @Override // p000.zs
            public void qbdbqqdbJdTsszXtJeXGasJIiGllll1l(String str) {
            }
        }

        bbdbbpdOJSuInlll111l(MainFragment mainFragment) {
        }

        public final dbpqdHhmDSIHIJiwc1ll1l1 dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 invoke() {
        }
    }

    @Metadata
    static final class bdddqmITkkeGpsxVXHR1l1llll extends v40 implements qh<no> {
        final /* synthetic */ MainFragment dpbdpqRKAscW1lll1l;

        bdddqmITkkeGpsxVXHR1l1llll(MainFragment mainFragment) {
        }

        public final no dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ no invoke() {
        }
    }

    @Metadata
    static final class bpbbpOxqjGWQAsycX11ll1l1 extends v40 implements qh<dbpqdHhmDSIHIJiwc1ll1l1> {
        final /* synthetic */ MainFragment dpbdpqRKAscW1lll1l;

        @Metadata
        public static final class dbpqdHhmDSIHIJiwc1ll1l1 implements rr {
            final /* synthetic */ MainFragment dpbdpqRKAscW1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(MainFragment mainFragment) {
            }

            @Override // p000.rr
            public void bddbppbdHQMVgPvQSDhmnXZYkDh1ll111(HotMovieResponse hotMovieResponse) {
            }

            @Override // p000.rr
            public void bpppbpdWDyOLaxxbWEl1lllll() {
            }

            @Override // p000.rr
            public void bpqbbqTOKdRXac1ll1l1lll() {
            }

            @Override // p000.rr
            public void dpbdqAKWNZAIXLyehU1lll1lll1() {
            }
        }

        bpbbpOxqjGWQAsycX11ll1l1(MainFragment mainFragment) {
        }

        public final dbpqdHhmDSIHIJiwc1ll1l1 dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 invoke() {
        }
    }

    @Metadata
    static final class bpdqqiQNVROMLC1ll1l1l11 extends v40 implements qh<dbpqdHhmDSIHIJiwc1ll1l1> {
        final /* synthetic */ MainFragment dpbdpqRKAscW1lll1l;

        @Metadata
        public static final class dbpqdHhmDSIHIJiwc1ll1l1 implements rr {
            final /* synthetic */ MainFragment dpbdpqRKAscW1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(MainFragment mainFragment) {
            }

            public static /* synthetic */ void ddbbbeXHXx111ll(ArrayList arrayList, MainFragment mainFragment, BGABanner bGABanner, View view, Object obj, int i) {
            }

            private static final void dpbdppqbVlmCUMWETyfoYOI1l11l1l(MainFragment mainFragment, BGABanner bGABanner, View view, Object obj, int i) {
            }

            public static /* synthetic */ void dqpdbEevAufTOvPphbjykClll1l11(MainFragment mainFragment, BGABanner bGABanner, View view, Object obj, int i) {
            }

            private static final void pbpqpdqpDkfTMiEll11l11l(ArrayList arrayList, MainFragment mainFragment, BGABanner bGABanner, View view, Object obj, int i) {
            }

            @Override // p000.rr
            public void bddbppbdHQMVgPvQSDhmnXZYkDh1ll111(HotMovieResponse hotMovieResponse) {
            }

            @Override // p000.rr
            public void bpppbpdWDyOLaxxbWEl1lllll() {
            }

            @Override // p000.rr
            public void bpqbbqTOKdRXac1ll1l1lll() {
            }

            @Override // p000.rr
            public void dpbdqAKWNZAIXLyehU1lll1lll1() {
            }
        }

        bpdqqiQNVROMLC1ll1l1l11(MainFragment mainFragment) {
        }

        public final dbpqdHhmDSIHIJiwc1ll1l1 dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 invoke() {
        }
    }

    @Metadata
    static final class bppbpdbCeZVhQNTixBml1lll11l extends v40 implements qh<ProgressDialog> {
        final /* synthetic */ MainFragment dpbdpqRKAscW1lll1l;

        bppbpdbCeZVhQNTixBml1lll11l(MainFragment mainFragment) {
        }

        public final ProgressDialog dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ ProgressDialog invoke() {
        }
    }

    @Metadata
    static final class bpppdpppqFAXRSTHUAmVJLvH11lllll1l extends v40 implements qh<gn1> {
        final /* synthetic */ MainFragment dpbdpqRKAscW1lll1l;

        bpppdpppqFAXRSTHUAmVJLvH11lllll1l(MainFragment mainFragment) {
        }

        public final gn1 dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ gn1 invoke() {
        }
    }

    @Metadata
    static final class dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 extends v40 implements qh<xa1> {
        final /* synthetic */ MainFragment dpbdpqRKAscW1lll1l;

        dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1(MainFragment mainFragment) {
        }

        public final xa1 dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ xa1 invoke() {
        }
    }

    @xc0
    static final class dbbpdqqpdVUhpQ1ll11 extends v40 implements qh<Object> {
        final /* synthetic */ List<String> dpbdpqRKAscW1lll1l;

        dbbpdqqpdVUhpQ1ll11(List<String> list) {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @Metadata
    static final class dbppbdqpeLmcbs11l11 extends v40 implements qh<no> {
        final /* synthetic */ MainFragment dpbdpqRKAscW1lll1l;

        dbppbdqpeLmcbs11l11(MainFragment mainFragment) {
        }

        public final no dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ no invoke() {
        }
    }

    @Metadata
    public static final class dbpqdHhmDSIHIJiwc1ll1l1 {
        private dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }
    }

    @Metadata
    static final class ddbbbeXHXx111ll extends v40 implements sh<View, mv1> {
        final /* synthetic */ CustomAd bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ MainFragment dpbdpqRKAscW1lll1l;

        @Metadata
        static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements qh<mv1> {
            final /* synthetic */ MainFragment bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ Uri dpbdpqRKAscW1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(Uri uri, MainFragment mainFragment) {
            }

            public final void dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // p000.qh
            public /* bridge */ /* synthetic */ mv1 invoke() {
            }
        }

        ddbbbeXHXx111ll(MainFragment mainFragment, CustomAd customAd) {
        }

        private static final void bpdqqiQNVROMLC1ll1l1l11(MainFragment mainFragment, Activity activity, Uri uri) {
        }

        public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(MainFragment mainFragment, Activity activity, Uri uri) {
        }

        public final void dqqppqiKzJi1l1lll1l(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @Metadata
    static final class ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll extends v40 implements qh<no> {
        final /* synthetic */ MainFragment dpbdpqRKAscW1lll1l;

        ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(MainFragment mainFragment) {
        }

        public final no dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ no invoke() {
        }
    }

    @Metadata
    static final class dpbdpqRKAscW1lll1l extends v40 implements qh<no> {
        final /* synthetic */ MainFragment dpbdpqRKAscW1lll1l;

        dpbdpqRKAscW1lll1l(MainFragment mainFragment) {
        }

        public final no dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ no invoke() {
        }
    }

    @Metadata
    static final class dqdqbpQposEBDyDxIyyz1ll11 extends v40 implements qh<no> {
        final /* synthetic */ MainFragment dpbdpqRKAscW1lll1l;

        dqdqbpQposEBDyDxIyyz1ll11(MainFragment mainFragment) {
        }

        public final no dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ no invoke() {
        }
    }

    @Metadata
    static final class dqpdbEevAufTOvPphbjykClll1l11 extends v40 implements qh<AlertDialog> {
        final /* synthetic */ MainFragment dpbdpqRKAscW1lll1l;

        dqpdbEevAufTOvPphbjykClll1l11(MainFragment mainFragment) {
        }

        public final AlertDialog dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ AlertDialog invoke() {
        }
    }

    @xc0
    static final class dqpqqqbqQyjyB11111l1 extends v40 implements qh<Object> {
        final /* synthetic */ CustomAd dpbdpqRKAscW1lll1l;

        dqpqqqbqQyjyB11111l1(CustomAd customAd) {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @Metadata
    public static final class dqqppqiKzJi1l1lll1l extends RecyclerView.ddbbbeXHXx111ll<dbpqdHhmDSIHIJiwc1ll1l1> {
        private final ArrayList<IData> dbpqdHhmDSIHIJiwc1ll1l1;

        @Metadata
        public final class dbpqdHhmDSIHIJiwc1ll1l1 extends RecyclerView.bpqbbqTOKdRXac1ll1l1lll {
            private final NiceImageView dbpqdHhmDSIHIJiwc1ll1l1;
            private final TextView dpbdbdpbLwkLpObyKsq1lll1;
            final /* synthetic */ dqqppqiKzJi1l1lll1l dqqppqiKzJi1l1lll1l;

            @Metadata
            /* renamed from: com.magicmagnet.main.view.MainFragment$dqqppqiKzJi1l1lll1l$dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1, reason: collision with other inner class name */
            static final class C2018dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements sh<View, mv1> {
                final /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 bpdqqiQNVROMLC1ll1l1l11;
                final /* synthetic */ dqqppqiKzJi1l1lll1l dpbdpqRKAscW1lll1l;
                final /* synthetic */ View ppbdpwWWljzmXXdHNabfWhgjl111l11;

                C2018dbpqdHhmDSIHIJiwc1ll1l1(dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, View view) {
                }

                public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
                }

                @Override // p000.sh
                public /* bridge */ /* synthetic */ mv1 invoke(View view) {
                }
            }

            @Metadata
            static final class dpbdbdpbLwkLpObyKsq1lll1 extends v40 implements sh<View, Boolean> {
                final /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 bpdqqiQNVROMLC1ll1l1l11;
                final /* synthetic */ dqqppqiKzJi1l1lll1l dpbdpqRKAscW1lll1l;
                final /* synthetic */ View ppbdpwWWljzmXXdHNabfWhgjl111l11;

                @xc0
                /* renamed from: com.magicmagnet.main.view.MainFragment$dqqppqiKzJi1l1lll1l$dbpqdHhmDSIHIJiwc1ll1l1$dpbdbdpbLwkLpObyKsq1lll1$dbpqdHhmDSIHIJiwc1ll1l1, reason: collision with other inner class name */
                static final class C2019dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements qh<Object> {
                    final /* synthetic */ IKaiYanData dpbdpqRKAscW1lll1l;

                    C2019dbpqdHhmDSIHIJiwc1ll1l1(IKaiYanData iKaiYanData) {
                    }

                    @Override // p000.qh
                    public final Object invoke() {
                    }
                }

                @xc0
                /* renamed from: com.magicmagnet.main.view.MainFragment$dqqppqiKzJi1l1lll1l$dbpqdHhmDSIHIJiwc1ll1l1$dpbdbdpbLwkLpObyKsq1lll1$dpbdbdpbLwkLpObyKsq1lll1, reason: collision with other inner class name */
                static final class C2020dpbdbdpbLwkLpObyKsq1lll1 extends v40 implements qh<Object> {
                    final /* synthetic */ IKaiYanData dpbdpqRKAscW1lll1l;

                    C2020dpbdbdpbLwkLpObyKsq1lll1(IKaiYanData iKaiYanData) {
                    }

                    @Override // p000.qh
                    public final Object invoke() {
                    }
                }

                @xc0
                /* renamed from: com.magicmagnet.main.view.MainFragment$dqqppqiKzJi1l1lll1l$dbpqdHhmDSIHIJiwc1ll1l1$dpbdbdpbLwkLpObyKsq1lll1$dqqppqiKzJi1l1lll1l, reason: collision with other inner class name */
                static final class C2021dqqppqiKzJi1l1lll1l extends v40 implements qh<Object> {
                    final /* synthetic */ IKaiYanData dpbdpqRKAscW1lll1l;

                    C2021dqqppqiKzJi1l1lll1l(IKaiYanData iKaiYanData) {
                    }

                    @Override // p000.qh
                    public final Object invoke() {
                    }
                }

                dpbdbdpbLwkLpObyKsq1lll1(dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, View view) {
                }

                private static final boolean bpdqqiQNVROMLC1ll1l1l11(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, IKaiYanData iKaiYanData, Context context, MenuItem menuItem) {
                }

                public static /* synthetic */ boolean dbpqdHhmDSIHIJiwc1ll1l1(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, IKaiYanData iKaiYanData, Context context, MenuItem menuItem) {
                }

                public final Boolean dqqppqiKzJi1l1lll1l(View view) {
                }

                @Override // p000.sh
                public /* bridge */ /* synthetic */ Boolean invoke(View view) {
                }
            }

            public dbpqdHhmDSIHIJiwc1ll1l1(dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l, View view) {
            }

            public final void dbpqdHhmDSIHIJiwc1ll1l1(String str, String str2) {
            }
        }

        public dqqppqiKzJi1l1lll1l(ArrayList<IData> arrayList) {
        }

        public final void dbppbdqpeLmcbs11l11(List<? extends IData> list) {
        }

        public void ddbbbeXHXx111ll(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, int i) {
        }

        public dbpqdHhmDSIHIJiwc1ll1l1 dqpdbEevAufTOvPphbjykClll1l11(ViewGroup viewGroup, int i) {
        }

        public final ArrayList<IData> dqpqqqbqQyjyB11111l1() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public int getItemCount() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public /* bridge */ /* synthetic */ void onBindViewHolder(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public /* bridge */ /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 onCreateViewHolder(ViewGroup viewGroup, int i) {
        }
    }

    @Metadata
    static final class pbppbpqbamJRy11l1l1 extends v40 implements qh<dbpqdHhmDSIHIJiwc1ll1l1> {
        final /* synthetic */ MainFragment dpbdpqRKAscW1lll1l;

        @Metadata
        public static final class dbpqdHhmDSIHIJiwc1ll1l1 implements rr {
            final /* synthetic */ MainFragment dpbdpqRKAscW1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(MainFragment mainFragment) {
            }

            @Override // p000.rr
            public void bddbppbdHQMVgPvQSDhmnXZYkDh1ll111(HotMovieResponse hotMovieResponse) {
            }

            @Override // p000.rr
            public void bpppbpdWDyOLaxxbWEl1lllll() {
            }

            @Override // p000.rr
            public void bpqbbqTOKdRXac1ll1l1lll() {
            }

            @Override // p000.rr
            public void dpbdqAKWNZAIXLyehU1lll1lll1() {
            }
        }

        pbppbpqbamJRy11l1l1(MainFragment mainFragment) {
        }

        public final dbpqdHhmDSIHIJiwc1ll1l1 dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 invoke() {
        }
    }

    @Metadata
    static final class ppbdpwWWljzmXXdHNabfWhgjl111l11 extends v40 implements qh<dbpqdHhmDSIHIJiwc1ll1l1> {
        final /* synthetic */ MainFragment dpbdpqRKAscW1lll1l;

        @Metadata
        public static final class dbpqdHhmDSIHIJiwc1ll1l1 implements rr {
            final /* synthetic */ MainFragment dpbdpqRKAscW1lll1l;

            @Metadata
            /* renamed from: com.magicmagnet.main.view.MainFragment$ppbdpwWWljzmXXdHNabfWhgjl111l11$dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1, reason: collision with other inner class name */
            public static final class C2022dbpqdHhmDSIHIJiwc1ll1l1 extends com.zhy.view.flowlayout.dbpqdHhmDSIHIJiwc1ll1l1<String> {
                final /* synthetic */ MainFragment bpdqqiQNVROMLC1ll1l1l11;
                final /* synthetic */ List<String> dpbdpqRKAscW1lll1l;

                C2022dbpqdHhmDSIHIJiwc1ll1l1(List<String> list, MainFragment mainFragment) {
                }

                @Override // com.zhy.view.flowlayout.dbpqdHhmDSIHIJiwc1ll1l1
                public /* bridge */ /* synthetic */ View dpbdpqRKAscW1lll1l(wf wfVar, int i, String str) {
                }

                public View dqpqqqbqQyjyB11111l1(wf wfVar, int i, String str) {
                }
            }

            dbpqdHhmDSIHIJiwc1ll1l1(MainFragment mainFragment) {
            }

            @Override // p000.rr
            public void bddbppbdHQMVgPvQSDhmnXZYkDh1ll111(HotMovieResponse hotMovieResponse) {
            }

            @Override // p000.rr
            public void bpppbpdWDyOLaxxbWEl1lllll() {
            }

            @Override // p000.rr
            public void bpqbbqTOKdRXac1ll1l1lll() {
            }

            @Override // p000.rr
            public void dpbdqAKWNZAIXLyehU1lll1lll1() {
            }
        }

        ppbdpwWWljzmXXdHNabfWhgjl111l11(MainFragment mainFragment) {
        }

        public final dbpqdHhmDSIHIJiwc1ll1l1 dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 invoke() {
        }
    }

    @Metadata
    static final class qbddqbdJBkudFfhX1ll1l111 extends v40 implements gi<View, HotMovieResponse.MovieDetail, mv1> {
        final /* synthetic */ MainFragment dpbdpqRKAscW1lll1l;

        qbddqbdJBkudFfhX1ll1l111(MainFragment mainFragment) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view, HotMovieResponse.MovieDetail movieDetail) {
        }

        @Override // p000.gi
        public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(View view, HotMovieResponse.MovieDetail movieDetail) {
        }
    }

    @Metadata
    static final class qbdpqpstJKhhKkXrsOGvbWw1l1llll extends v40 implements qh<dbpqdHhmDSIHIJiwc1ll1l1> {
        final /* synthetic */ MainFragment dpbdpqRKAscW1lll1l;

        @Metadata
        public static final class dbpqdHhmDSIHIJiwc1ll1l1 implements rr {
            final /* synthetic */ MainFragment dpbdpqRKAscW1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(MainFragment mainFragment) {
            }

            @Override // p000.rr
            public void bddbppbdHQMVgPvQSDhmnXZYkDh1ll111(HotMovieResponse hotMovieResponse) {
            }

            @Override // p000.rr
            public void bpppbpdWDyOLaxxbWEl1lllll() {
            }

            @Override // p000.rr
            public void bpqbbqTOKdRXac1ll1l1lll() {
            }

            @Override // p000.rr
            public void dpbdqAKWNZAIXLyehU1lll1lll1() {
            }
        }

        qbdpqpstJKhhKkXrsOGvbWw1l1llll(MainFragment mainFragment) {
        }

        public final dbpqdHhmDSIHIJiwc1ll1l1 dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 invoke() {
        }
    }

    @Metadata
    public static final class qbdqqpbqpCWRpIKEKtzoceYOll1ll1l extends TypeToken<List<? extends CustomAd>> {
        qbdqqpbqpCWRpIKEKtzoceYOll1ll1l() {
        }
    }

    @Metadata
    static final class qdqdpyALEmZFGGaahRTIU1ll11 extends v40 implements qh<View> {
        final /* synthetic */ MainFragment dpbdpqRKAscW1lll1l;

        qdqdpyALEmZFGGaahRTIU1ll11(MainFragment mainFragment) {
        }

        public final View dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ View invoke() {
        }
    }

    @Metadata
    static final class qppqdpppIauLKaAtRkB11111l extends v40 implements qh<no> {
        final /* synthetic */ MainFragment dpbdpqRKAscW1lll1l;

        qppqdpppIauLKaAtRkB11111l(MainFragment mainFragment) {
        }

        public final no dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ no invoke() {
        }
    }

    public static final /* synthetic */ rr bbbddbppbHkZyStOxwRl1lll1(MainFragment mainFragment) {
    }

    public static final /* synthetic */ View bbpqddpdpMWPNcLVjpAOBLtzBwll1l1(MainFragment mainFragment) {
    }

    public static final /* synthetic */ zs bdpbpsDcyJTPrj1lll11(MainFragment mainFragment) {
    }

    public static final /* synthetic */ rr bdpqbmWvwOSl1111(MainFragment mainFragment) {
    }

    private final void bppqpqdImdXYlgl111l11l(boolean z) {
    }

    private final us bqdbqqpbqTPejjypqgplll1ll1l1() {
    }

    private final void bqpqdNBFMzNEiipaXQPl11l11ll(CustomAd customAd) {
    }

    private final qr bqpqpdRGoNS1ll1111l1() {
    }

    private static final boolean dbqpqqqDeeyyCuJnUmGLGcbvl11l11(MainFragment mainFragment, View view, int i, wf wfVar) {
    }

    private final rr dpddppbpssQkdaWsxnuFll1l1() {
    }

    public static /* synthetic */ void dqbbbarhSjFxjxEEl1ll11(MainFragment mainFragment) {
    }

    public static /* synthetic */ boolean dqbbdbpqbvChgeruisCbWCnl11lllll(MainFragment mainFragment, View view, int i, wf wfVar) {
    }

    private final qr dqbqdqdpdDjmBPUzEkoOlll1l1llll() {
    }

    private final qr dqdbdbddbsXTuiebVrav1l11111l1() {
    }

    private static final void dqqdbdpbqDDIkmksEKxFufZKgZ1l1l11lll(MainFragment mainFragment) {
    }

    private final rr pbpqqqqFBwYCJOfRsCpOLdMl11l11l11() {
    }

    public static final /* synthetic */ rr pbqbdpDzmUH1l1ll(MainFragment mainFragment) {
    }

    private final qr pbqdbbLIoUwreKSxbxAll11ll() {
    }

    private final rr pbqddddDusqnIBFOMWnENLpll1111() {
    }

    private final qr pdpdqqdusMOjculBX1111l11() {
    }

    static /* synthetic */ void pqdpbdbMIFQJSTVxZl11ll111l(MainFragment mainFragment, boolean z, int i, Object obj) {
    }

    private final rr qbbpqRDtzbBqlll1l() {
    }

    public static final /* synthetic */ rr qbqddbqpnPHFHyPasib1l1ll11ll(MainFragment mainFragment) {
    }

    private final rr qdbbdhsmdYJSqeHT1111ll1l() {
    }

    private final zs qdqddftZvRmltIahaEHKjU1l11ll1l1() {
    }

    public static final /* synthetic */ rr qpdpdszwYFiQbkll1ll(MainFragment mainFragment) {
    }

    public final TagFlowLayout bbbbqbqdppWJqwUrzOvzCyynHqslll1l() {
    }

    public final void bbbpbdqpbcaiJFLILHVgrofkL1l1l1l(View view) {
    }

    public final View bbqpqppQWI1llllll1l() {
    }

    @Override // p000.rr
    public void bddbppbdHQMVgPvQSDhmnXZYkDh1ll111(HotMovieResponse hotMovieResponse) {
    }

    public final dt bdqddpbdHdAXdLWTdGIMpzClllll11() {
    }

    public final void bdqqdqDqtua11l11l1(SwipeRefreshLayout swipeRefreshLayout) {
    }

    protected qr bpbpqbqdpJnMXABHXnGl1ll11lll() {
    }

    public final void bpdbdpbdbSgOKZVkhOgPfvUtl11l1l11(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
    }

    public final dqqppqiKzJi1l1lll1l bpdbpdqbSDCYKyFxRFDrXOojll111() {
    }

    public final void bpdddqdbdIHjDsl1ll1ll(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
    }

    @Override // p000.rr
    public void bpppbpdWDyOLaxxbWEl1lllll() {
    }

    public final void bppqppdMchpThwHisjikcod1ll11(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
    }

    @Override // p000.rr
    public void bpqbbqTOKdRXac1ll1l1lll() {
    }

    public final dpbdbdpbLwkLpObyKsq1lll1 bqdbqqAlarZsSbAl1ll1l() {
    }

    public View bqppbbbqLsCdM1llll(int i) {
    }

    public final View bqqqdboFHPLTwaMWMSXnDNNlll11l1() {
    }

    @Override // p000.et
    public void dpbdppqbVlmCUMWETyfoYOI1l11l1l(List<String> list) {
    }

    @Override // p000.rr
    public void dpbdqAKWNZAIXLyehU1lll1lll1() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    public /* bridge */ /* synthetic */ qr dpbqpXiNmkuFJMoGemM1llll1ll1() {
    }

    public final RecyclerView dpqqpqonhvzMuzONUGiUa111l11l11() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected void dqbpbqXLoKDkRdCKHlKfl11llll1l() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected up[] dqpqbdWhIsNIidXUell11l111() {
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"MissingSuperCall"})
    public void onAttach(Context context) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1, androidx.fragment.app.Fragment
    public void onDestroy() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1, androidx.fragment.app.Fragment
    public void onPause() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1, androidx.fragment.app.Fragment
    public void onResume() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected void pbbbqppqTbuPhHQEDqbrOKDl11ll1(View view) {
    }

    public final void pdddbdppbXDXrwiTFfril111ll1(HotMovieResponse hotMovieResponse) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected int pddpddbdIotonl1ll1l11() {
    }

    public final void pddqdpdfpNEYjzViyCS111ll(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
    }

    public final SwipeRefreshLayout qbbqppqqFyNGaQFr1l1l11() {
    }

    public final qr qbqqdoZvfpl1l111ll() {
    }

    public final dpbdbdpbLwkLpObyKsq1lll1 qbqqdqdboCzbEGhywRrZi1lll1l1l() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected vp[] qddqpzYVacW1llllll() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected void qdppdqpdjZLhPwmBZxlfll11l1(Bundle bundle) {
    }

    public final void qpbbdddeJUjFZrllll11ll(RecyclerView recyclerView) {
    }

    public final void qpbdqjmuGiXlll1lll11(dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l) {
    }

    public final dpbdbdpbLwkLpObyKsq1lll1 qqpbbbpElrBCTDfMihU11111() {
    }

    public final dpbdbdpbLwkLpObyKsq1lll1 qqqbbqRaDWEaifHrXcEBrw1ll1l1() {
    }

    public void qqqdbddwLHHSrqKnVcHujUhU1llll() {
    }

    @eo1
    public final void registProEvent(v51 v51Var) {
    }

    @eo1
    public final void userLogined(dy1 dy1Var) {
    }

    @Metadata
    public final class dpbdbdpbLwkLpObyKsq1lll1 extends RecyclerView.ddbbbeXHXx111ll<dbpqdHhmDSIHIJiwc1ll1l1> {
        private HotMovieResponse dbpqdHhmDSIHIJiwc1ll1l1;
        private final LinearLayoutManager dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ MainFragment dpbdpqRKAscW1lll1l;
        private gi<? super View, ? super HotMovieResponse.MovieDetail, mv1> dqqppqiKzJi1l1lll1l;

        @Metadata
        public final class dbpqdHhmDSIHIJiwc1ll1l1 extends RecyclerView.bpqbbqTOKdRXac1ll1l1lll {
            private TextView dbpqdHhmDSIHIJiwc1ll1l1;
            private ImageView dpbdbdpbLwkLpObyKsq1lll1;
            final /* synthetic */ dpbdbdpbLwkLpObyKsq1lll1 dpbdpqRKAscW1lll1l;
            private TextView dqqppqiKzJi1l1lll1l;

            public dbpqdHhmDSIHIJiwc1ll1l1(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, View view) {
            }

            public final ImageView dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            public final TextView dpbdbdpbLwkLpObyKsq1lll1() {
            }

            public final TextView dqqppqiKzJi1l1lll1l() {
            }
        }

        public dpbdbdpbLwkLpObyKsq1lll1(MainFragment mainFragment, HotMovieResponse hotMovieResponse, LinearLayoutManager linearLayoutManager) {
        }

        private static final void dbppbdqpeLmcbs11l11(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, MainFragment mainFragment, int i, View view) {
        }

        public static /* synthetic */ void dqpqqqbqQyjyB11111l1(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, MainFragment mainFragment, int i, View view) {
        }

        public final HotMovieResponse ddbbbeXHXx111ll() {
        }

        public final void ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(HotMovieResponse hotMovieResponse) {
        }

        public void dqpdbEevAufTOvPphbjykClll1l11(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public int getItemCount() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public /* bridge */ /* synthetic */ void onBindViewHolder(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public /* bridge */ /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 onCreateViewHolder(ViewGroup viewGroup, int i) {
        }

        public dbpqdHhmDSIHIJiwc1ll1l1 pbppbpqbamJRy11l1l1(ViewGroup viewGroup, int i) {
        }

        public final void qbdpqpstJKhhKkXrsOGvbWw1l1llll(gi<? super View, ? super HotMovieResponse.MovieDetail, mv1> giVar) {
        }

        public /* synthetic */ dpbdbdpbLwkLpObyKsq1lll1(MainFragment mainFragment, HotMovieResponse hotMovieResponse, LinearLayoutManager linearLayoutManager, int i, pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }
    }
}
