package p000;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.magicmagnet.data.bean.FtnData;
import com.magicmagnet.data.bean.IData;
import com.magicmagnet.data.bean.MagnetData;
import com.magicmagnet.data.db.Favorite;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p000.uv1;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class h52 extends qqqqdpdZawTcmNbkDCA11ll11l1<ms> implements hs, ar, tq, xr<MagnetData>, qp {
    public static final dbpqdHhmDSIHIJiwc1ll1l1 bpppqdQjfPiCT111111111 = null;
    private RecyclerView.LayoutManager bbdbbpdOJSuInlll111l;
    private SwipeRefreshLayout bdddqmITkkeGpsxVXHR1l1llll;
    private String bpbbpOxqjGWQAsycX11ll1l1;
    private final y40 bppbpdbCeZVhQNTixBml1lll11l;
    private final y40 bpppdpppqFAXRSTHUAmVJLvH11lllll1l;
    public Map<Integer, View> bpqbbqTOKdRXac1ll1l1lll;
    private String bpqdqbqpviKiORjqgp1l111l11;
    private uv1 dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
    private final y40 dbbpdqqpdVUhpQ1ll11;
    private String dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1;
    private RecyclerView dbppbdqpeLmcbs11l11;
    private String dddbpbpNqzZZJmSG1111l;
    private ArrayList<Parcelable> ddddbbdqIccDnEitQc1l1l1l;
    private TextView ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private View dqdqbpQposEBDyDxIyyz1ll11;
    private View pbppbpqbamJRy11l1l1;
    private final y40 pdpqbmApOBCmNMwnn1ll111;
    private BottomSheetLayout qbddqbdJBkudFfhX1ll1l111;
    private View qbdpqpstJKhhKkXrsOGvbWw1l1llll;
    private final y40 qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;
    private ms qdqdpyALEmZFGGaahRTIU1ll11;
    private boolean qppqdpppIauLKaAtRkB11111l;

    @Metadata
    static final class bdddqmITkkeGpsxVXHR1l1llll extends v40 implements qh<mv1> {
        final /* synthetic */ View bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ h52 dpbdpqRKAscW1lll1l;

        bdddqmITkkeGpsxVXHR1l1llll(h52 h52Var, View view) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ mv1 invoke() {
        }
    }

    @Metadata
    static final class bpdqqiQNVROMLC1ll1l1l11 extends v40 implements qh<lc> {
        final /* synthetic */ h52 dpbdpqRKAscW1lll1l;

        bpdqqiQNVROMLC1ll1l1l11(h52 h52Var) {
        }

        public final lc dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ lc invoke() {
        }
    }

    @Metadata
    static final class dbppbdqpeLmcbs11l11 extends v40 implements qh<hq0> {
        final /* synthetic */ h52 dpbdpqRKAscW1lll1l;

        dbppbdqpeLmcbs11l11(h52 h52Var) {
        }

        public final hq0 dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ hq0 invoke() {
        }
    }

    @Metadata
    public static final class dbpqdHhmDSIHIJiwc1ll1l1 {
        private dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public final h52 dbpqdHhmDSIHIJiwc1ll1l1(String str, String str2, String str3, boolean z, boolean z2) {
        }
    }

    @Metadata
    static final class ddbbbeXHXx111ll extends v40 implements gi<DialogInterface, Integer, mv1> {
        final /* synthetic */ FtnData bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ h52 dpbdpqRKAscW1lll1l;

        ddbbbeXHXx111ll(h52 h52Var, FtnData ftnData) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(DialogInterface dialogInterface, int i) {
        }

        @Override // p000.gi
        public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(DialogInterface dialogInterface, Integer num) {
        }
    }

    @Metadata
    static final class ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll extends v40 implements qh<Boolean> {
        final /* synthetic */ h52 dpbdpqRKAscW1lll1l;

        ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(h52 h52Var) {
        }

        public final Boolean dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ Boolean invoke() {
        }
    }

    @Metadata
    static final class dpbdbdpbLwkLpObyKsq1lll1 extends v40 implements qh<qbbqpzukjahUWUWfxIll11lll1> {
        final /* synthetic */ h52 dpbdpqRKAscW1lll1l;

        dpbdbdpbLwkLpObyKsq1lll1(h52 h52Var) {
        }

        public final qbbqpzukjahUWUWfxIll11lll1 dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ qbbqpzukjahUWUWfxIll11lll1 invoke() {
        }
    }

    @Metadata
    static final class dpbdpqRKAscW1lll1l extends v40 implements qh<i3> {
        final /* synthetic */ h52 dpbdpqRKAscW1lll1l;

        dpbdpqRKAscW1lll1l(h52 h52Var) {
        }

        public final i3 dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ i3 invoke() {
        }
    }

    @bqbpqpbdbJKmwXJCVFIIpXqwGcll1111(m0c = "com.magicmagnet.main.view.XFragment$showParseResultSheet$5", m1f = "XFragment.kt", m2l = {311}, m3m = "invokeSuspend")
    @Metadata
    static final class dqdqbpQposEBDyDxIyyz1ll11 extends bp1 implements gi<qqbqbpbFgzQbllll1ll, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super mv1>, Object> {
        final /* synthetic */ FtnData dbppbdqpeLmcbs11l11;
        int ddbbbeXHXx111ll;
        final /* synthetic */ h52 dqpdbEevAufTOvPphbjykClll1l11;

        dqdqbpQposEBDyDxIyyz1ll11(h52 h52Var, FtnData ftnData, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super dqdqbpQposEBDyDxIyyz1ll11> qpdqpbkgvdbreputwwyxml1ll1111l1) {
        }

        @Override // p000.bdddpqqFMztFnPuTGZhbpNN1ll11
        public final qpdqpbkgVDbrePuTwWYxml1ll1111l1<mv1> bdddqmITkkeGpsxVXHR1l1llll(Object obj, qpdqpbkgVDbrePuTwWYxml1ll1111l1<?> qpdqpbkgvdbreputwwyxml1ll1111l1) {
        }

        public final Object dbbpdqqpdVUhpQ1ll11(qqbqbpbFgzQbllll1ll qqbqbpbfgzqbllll1ll, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super mv1> qpdqpbkgvdbreputwwyxml1ll1111l1) {
        }

        @Override // p000.gi
        public /* bridge */ /* synthetic */ Object ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(qqbqbpbFgzQbllll1ll qqbqbpbfgzqbllll1ll, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super mv1> qpdqpbkgvdbreputwwyxml1ll1111l1) {
        }

        @Override // p000.bdddpqqFMztFnPuTGZhbpNN1ll11
        public final Object qbddqbdJBkudFfhX1ll1l111(Object obj) {
        }
    }

    @Metadata
    static final class dqpdbEevAufTOvPphbjykClll1l11 extends v40 implements gi<DialogInterface, Integer, mv1> {
        final /* synthetic */ FtnData bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ h52 dpbdpqRKAscW1lll1l;

        dqpdbEevAufTOvPphbjykClll1l11(h52 h52Var, FtnData ftnData) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(DialogInterface dialogInterface, int i) {
        }

        @Override // p000.gi
        public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(DialogInterface dialogInterface, Integer num) {
        }
    }

    @Metadata
    public static final class dqpqqqbqQyjyB11111l1 implements uv1.ppbdpwWWljzmXXdHNabfWhgjl111l11 {
        final /* synthetic */ h52 dbpqdHhmDSIHIJiwc1ll1l1;

        @Metadata
        static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements sh<String, mv1> {
            final /* synthetic */ h52 dpbdpqRKAscW1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(h52 h52Var) {
            }

            public final void dbpqdHhmDSIHIJiwc1ll1l1(String str) {
            }

            @Override // p000.sh
            public /* bridge */ /* synthetic */ mv1 invoke(String str) {
            }
        }

        dqpqqqbqQyjyB11111l1(h52 h52Var) {
        }

        @Override // uv1.ppbdpwWWljzmXXdHNabfWhgjl111l11
        public void bpdqqiQNVROMLC1ll1l1l11(int i, IData iData) {
        }

        @Override // uv1.ppbdpwWWljzmXXdHNabfWhgjl111l11
        public void dbpqdHhmDSIHIJiwc1ll1l1(int i, Object obj) {
        }

        @Override // uv1.ppbdpwWWljzmXXdHNabfWhgjl111l11
        public void dpbdbdpbLwkLpObyKsq1lll1(int i, Object obj) {
        }

        @Override // uv1.ppbdpwWWljzmXXdHNabfWhgjl111l11
        public void dpbdpqRKAscW1lll1l(int i, Object obj) {
        }

        @Override // uv1.ppbdpwWWljzmXXdHNabfWhgjl111l11
        public void dqqppqiKzJi1l1lll1l(int i, IData iData) {
        }
    }

    @Metadata
    static final class dqqppqiKzJi1l1lll1l extends v40 implements qh<i60<MagnetData>> {
        final /* synthetic */ h52 dpbdpqRKAscW1lll1l;

        dqqppqiKzJi1l1lll1l(h52 h52Var) {
        }

        public final i60<MagnetData> dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ i60<MagnetData> invoke() {
        }
    }

    @Metadata
    static final class pbppbpqbamJRy11l1l1 extends v40 implements qh<mv1> {
        final /* synthetic */ h52 dpbdpqRKAscW1lll1l;

        pbppbpqbamJRy11l1l1(h52 h52Var) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ mv1 invoke() {
        }
    }

    @xc0
    static final class ppbdpwWWljzmXXdHNabfWhgjl111l11 extends v40 implements qh<Object> {
        public static final ppbdpwWWljzmXXdHNabfWhgjl111l11 dpbdpqRKAscW1lll1l = null;

        ppbdpwWWljzmXXdHNabfWhgjl111l11() {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @Metadata
    public static final class qbdpqpstJKhhKkXrsOGvbWw1l1llll implements vn0 {
        final /* synthetic */ h52 dbpqdHhmDSIHIJiwc1ll1l1;

        qbdpqpstJKhhKkXrsOGvbWw1l1llll(h52 h52Var) {
        }

        @Override // p000.vn0
        public void dbpqdHhmDSIHIJiwc1ll1l1(BottomSheetLayout bottomSheetLayout) {
        }
    }

    public static final /* synthetic */ View bbbddbppbHkZyStOxwRl1lll1(h52 h52Var) {
    }

    public static final /* synthetic */ ms bbpqddpdpMWPNcLVjpAOBLtzBwll1l1(h52 h52Var) {
    }

    public static final /* synthetic */ hq0 bdpbpsDcyJTPrj1lll11(h52 h52Var) {
    }

    private final pp bdpqbmWvwOSl1111() {
    }

    private static final void bqdbqqAlarZsSbAl1ll1l(h52 h52Var, List list) {
    }

    private final wr bqpqdNBFMzNEiipaXQPl11l11ll() {
    }

    private static final void bqpqpdRGoNS1ll1111l1(h52 h52Var) {
    }

    private static final void dpddppbpssQkdaWsxnuFll1l1(h52 h52Var, View view) {
    }

    public static /* synthetic */ void dqbbbarhSjFxjxEEl1ll11(h52 h52Var) {
    }

    public static /* synthetic */ void dqbbdbpqbvChgeruisCbWCnl11lllll(h52 h52Var, View view) {
    }

    private final zq pbpqqqqFBwYCJOfRsCpOLdMl11l11l11() {
    }

    public static final /* synthetic */ BottomSheetLayout pbqbdpDzmUH1l1ll(h52 h52Var) {
    }

    private final sq pbqdbbLIoUwreKSxbxAll11ll() {
    }

    private final hq0 pbqddddDusqnIBFOMWnENLpll1111() {
    }

    public static final /* synthetic */ sq qbqddbqpnPHFHyPasib1l1ll11ll(h52 h52Var) {
    }

    private final void qbqqdqdboCzbEGhywRrZi1lll1l1l(boolean z) {
    }

    private final boolean qdbbdhsmdYJSqeHT1111ll1l(FtnData ftnData) {
    }

    public static final /* synthetic */ zq qpdpdszwYFiQbkll1ll(h52 h52Var) {
    }

    private final void qqpbbbpElrBCTDfMihU11111(boolean z, FtnData ftnData) {
    }

    public static /* synthetic */ void qqqdbddwLHHSrqKnVcHujUhU1llll(h52 h52Var, List list) {
    }

    @Override // p000.ns
    public void bdqpqbqbgFttbl1ll1l(FtnData ftnData) {
    }

    @Override // p000.ns
    public void bpbbpbppqsLrtEPjeDMEnOv1l1l1(String str) {
    }

    @Override // p000.tq
    public void bpbqbqdqqjASPQfJSXuVkkgll1lll1ll(FtnData ftnData) {
    }

    @Override // p000.ar
    public void bpdqqiQNVROMLC1ll1l1l11(String str) {
    }

    @Override // p000.tq
    public void bppbpdbCeZVhQNTixBml1lll11l(String str) {
    }

    @Override // p000.hs
    public void bpqdqbqpviKiORjqgp1l111l11(int i) {
    }

    @Override // p000.tq
    public void bqbpbxbDWbYusagGEGEkKZ1ll1l1() {
    }

    @Override // p000.tq
    public void bqdppdGFpODiqhzhhiaXKl11l1(String str) {
    }

    public void bqppbbbqLsCdM1llll() {
    }

    @Override // p000.tq
    public void dbbpdqqpdVUhpQ1ll11() {
    }

    @Override // p000.xr
    public void ddbbbeXHXx111ll(ArrayList<MagnetData> arrayList) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1, p000.sp, p000.ds
    public void dpbdpqRKAscW1lll1l() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    public /* bridge */ /* synthetic */ ms dpbqpXiNmkuFJMoGemM1llll1ll1() {
    }

    @Override // p000.tq
    public void dpdqpXgfqpODrtwusppe1l1l1l1ll() {
    }

    @Override // p000.tq
    public void dqbbdddqpLERmaRLiHiDpL1l1l1l() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected void dqbpbqXLoKDkRdCKHlKfl11llll1l() {
    }

    protected ms dqdbdbddbsXTuiebVrav1l11111l1() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected up[] dqpqbdWhIsNIidXUell11l111() {
    }

    @Override // p000.ar
    public void dqqppqiKzJi1l1lll1l(String str) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1, p000.sp, p000.ds
    public void loading() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1, androidx.fragment.app.Fragment
    public void onDestroy() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected void pbbbqppqTbuPhHQEDqbrOKDl11ll1(View view) {
    }

    @Override // p000.tq
    public void pbpbpmdJpqmdGNwEepmjpVlll11l1(String str) {
    }

    @Override // p000.ns
    public void pbppbpqbamJRy11l1l1(List<? extends IData> list) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected int pddpddbdIotonl1ll1l11() {
    }

    @Override // p000.hs
    public void pdpqbmApOBCmNMwnn1ll111(int i) {
    }

    @Override // p000.ar
    public void pdpqbuMsiTd1ll1l1(List<? extends Favorite> list) {
    }

    @Override // p000.qp
    public void ppdqdfATjLvOVDRgppcqyifll1l1lll() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected void qbdpbdotUKqbANmgeJETNyAM1l111() {
    }

    @Override // p000.tq
    public void qbqdqqqqdvTduGNll111l1(FtnData ftnData) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected vp[] qddqpzYVacW1llllll() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected void qdppdqpdjZLhPwmBZxlfll11l1(Bundle bundle) {
    }

    @Override // p000.hs
    public void qpbqqbpqdbZmlLPGCGeflll11l(int i) {
    }

    @Override // p000.ar
    public void qpdbbbbbmKdyKHlllllll1(String str) {
    }

    @Override // p000.ns
    @SuppressLint({"ShowToast"})
    public void qqdbbfmUWwoYYpfYHJZdaUO1111llll(String str) {
    }

    @eo1
    public final void registerPro(v51 v51Var) {
    }

    @eo1
    public final void stop(tm1 tm1Var) {
    }

    @eo1
    public final void userLogined(dy1 dy1Var) {
    }
}
