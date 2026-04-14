package p000;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.magicmagnet.data.bean.FtnData;
import com.magicmagnet.data.bean.IData;
import com.magicmagnet.data.bean.IMovieData;
import com.magicmagnet.data.bean.SearchResult;
import com.magicmagnet.data.db.Favorite;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p000.yj;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class ua1 extends qqqqdpdZawTcmNbkDCA11ll11l1<us> implements zs, ar, xr<SearchResult>, tq, mp {
    public static final dbpqdHhmDSIHIJiwc1ll1l1 pdpqbmApOBCmNMwnn1ll111 = null;
    private BottomSheetLayout bbdbbpdOJSuInlll111l;
    private LinearLayoutManager bdddqmITkkeGpsxVXHR1l1llll;
    private us bpbbpOxqjGWQAsycX11ll1l1;
    private String bppbpdbCeZVhQNTixBml1lll11l;
    private final y40 bpppdpppqFAXRSTHUAmVJLvH11lllll1l;
    private List<? extends IData> bpqdqbqpviKiORjqgp1l111l11;
    private TextView dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
    private String dbbpdqqpdVUhpQ1ll11;
    private String dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1;
    private RecyclerView dbppbdqpeLmcbs11l11;
    private dpbdbdpbLwkLpObyKsq1lll1 dddbpbpNqzZZJmSG1111l;
    public Map<Integer, View> ddddbbdqIccDnEitQc1l1l1l;
    private SwipeRefreshLayout ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private r60 dqdqbpQposEBDyDxIyyz1ll11;
    private View pbppbpqbamJRy11l1l1;
    private View qbddqbdJBkudFfhX1ll1l111;
    private ya1 qbdpqpstJKhhKkXrsOGvbWw1l1llll;
    private final y40 qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;
    private final y40 qdqdpyALEmZFGGaahRTIU1ll11;
    private final y40 qppqdpppIauLKaAtRkB11111l;

    @Metadata
    static final class bdddqmITkkeGpsxVXHR1l1llll extends v40 implements sh<View, mv1> {
        final /* synthetic */ ua1 dpbdpqRKAscW1lll1l;

        bdddqmITkkeGpsxVXHR1l1llll(ua1 ua1Var) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @Metadata
    static final class bpdqqiQNVROMLC1ll1l1l11 extends v40 implements qh<i3> {
        final /* synthetic */ ua1 dpbdpqRKAscW1lll1l;

        bpdqqiQNVROMLC1ll1l1l11(ua1 ua1Var) {
        }

        public final i3 dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ i3 invoke() {
        }
    }

    @Metadata
    static final class dbppbdqpeLmcbs11l11 extends v40 implements gi<Integer, IMovieData, mv1> {
        final /* synthetic */ ua1 dpbdpqRKAscW1lll1l;

        dbppbdqpeLmcbs11l11(ua1 ua1Var) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(int i, IMovieData iMovieData) {
        }

        @Override // p000.gi
        public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(Integer num, IMovieData iMovieData) {
        }
    }

    @Metadata
    public static final class dbpqdHhmDSIHIJiwc1ll1l1 {
        private dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public static /* synthetic */ ua1 dpbdpqRKAscW1lll1l(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, String str, int i, String str2, String str3, boolean z, int i2, Object obj) {
        }

        public static /* synthetic */ ua1 dqqppqiKzJi1l1lll1l(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, String str, int i, String str2, int i2, boolean z, int i3, Object obj) {
        }

        public final ua1 dbpqdHhmDSIHIJiwc1ll1l1(String str, int i, String str2, int i2, boolean z) {
        }

        public final ua1 dpbdbdpbLwkLpObyKsq1lll1(String str, int i, String str2, String str3, boolean z) {
        }
    }

    @Metadata
    public static final class ddbbbeXHXx111ll extends r60 {
        final /* synthetic */ ua1 pbppbpqbamJRy11l1l1;

        ddbbbeXHXx111ll(ua1 ua1Var, LinearLayoutManager linearLayoutManager) {
        }

        @Override // p000.r60
        public void dpbdbdpbLwkLpObyKsq1lll1(int i) {
        }
    }

    @Metadata
    public static final class ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll extends RecyclerView.dqdqbpQposEBDyDxIyyz1ll11 {
        ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.dqdqbpQposEBDyDxIyyz1ll11
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @Metadata
    private static final class dpbdbdpbLwkLpObyKsq1lll1 {
        public static final dpbdbdpbLwkLpObyKsq1lll1 bpdqqiQNVROMLC1ll1l1l11 = null;
        private static final /* synthetic */ dpbdbdpbLwkLpObyKsq1lll1[] ddbbbeXHXx111ll = null;
        public static final dpbdbdpbLwkLpObyKsq1lll1 dpbdpqRKAscW1lll1l = null;
        public static final dpbdbdpbLwkLpObyKsq1lll1 dqpqqqbqQyjyB11111l1 = null;
        public static final dpbdbdpbLwkLpObyKsq1lll1 ppbdpwWWljzmXXdHNabfWhgjl111l11 = null;

        private dpbdbdpbLwkLpObyKsq1lll1(String str, int i) {
        }

        private static final /* synthetic */ dpbdbdpbLwkLpObyKsq1lll1[] dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public static dpbdbdpbLwkLpObyKsq1lll1 valueOf(String str) {
        }

        public static dpbdbdpbLwkLpObyKsq1lll1[] values() {
        }
    }

    @Metadata
    static final class dpbdpqRKAscW1lll1l extends v40 implements qh<i60<SearchResult>> {
        final /* synthetic */ ua1 dpbdpqRKAscW1lll1l;

        dpbdpqRKAscW1lll1l(ua1 ua1Var) {
        }

        public final i60<SearchResult> dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ i60<SearchResult> invoke() {
        }
    }

    @Metadata
    static final class dqpdbEevAufTOvPphbjykClll1l11 extends v40 implements gi<Integer, IMovieData, mv1> {
        final /* synthetic */ ua1 dpbdpqRKAscW1lll1l;

        dqpdbEevAufTOvPphbjykClll1l11(ua1 ua1Var) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(int i, IMovieData iMovieData) {
        }

        @Override // p000.gi
        public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(Integer num, IMovieData iMovieData) {
        }
    }

    @xc0
    static final class dqpqqqbqQyjyB11111l1 extends v40 implements qh<Object> {
        public static final dqpqqqbqQyjyB11111l1 dpbdpqRKAscW1lll1l = null;

        dqpqqqbqQyjyB11111l1() {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @Metadata
    static final class dqqppqiKzJi1l1lll1l extends v40 implements qh<dqbdbtYbcXnOwavgobEX1111l> {
        final /* synthetic */ ua1 dpbdpqRKAscW1lll1l;

        dqqppqiKzJi1l1lll1l(ua1 ua1Var) {
        }

        public final dqbdbtYbcXnOwavgobEX1111l dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ dqbdbtYbcXnOwavgobEX1111l invoke() {
        }
    }

    @Metadata
    public static final class pbppbpqbamJRy11l1l1 implements yj.ppbdpwWWljzmXXdHNabfWhgjl111l11 {
        final /* synthetic */ ua1 dbpqdHhmDSIHIJiwc1ll1l1;

        @Metadata
        static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements sh<String, mv1> {
            final /* synthetic */ ua1 dpbdpqRKAscW1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(ua1 ua1Var) {
            }

            public final void dbpqdHhmDSIHIJiwc1ll1l1(String str) {
            }

            @Override // p000.sh
            public /* bridge */ /* synthetic */ mv1 invoke(String str) {
            }
        }

        pbppbpqbamJRy11l1l1(ua1 ua1Var) {
        }

        @Override // yj.ppbdpwWWljzmXXdHNabfWhgjl111l11
        public void bpdqqiQNVROMLC1ll1l1l11(int i, IData iData) {
        }

        @Override // yj.ppbdpwWWljzmXXdHNabfWhgjl111l11
        public void dbpqdHhmDSIHIJiwc1ll1l1(int i, Object obj) {
        }

        @Override // yj.ppbdpwWWljzmXXdHNabfWhgjl111l11
        public void dpbdbdpbLwkLpObyKsq1lll1(int i, Object obj) {
        }

        @Override // yj.ppbdpwWWljzmXXdHNabfWhgjl111l11
        public void dpbdpqRKAscW1lll1l(int i, Object obj) {
        }

        @Override // yj.ppbdpwWWljzmXXdHNabfWhgjl111l11
        public void dqqppqiKzJi1l1lll1l(int i, IData iData) {
        }
    }

    @Metadata
    static final class ppbdpwWWljzmXXdHNabfWhgjl111l11 extends v40 implements qh<lc> {
        final /* synthetic */ ua1 dpbdpqRKAscW1lll1l;

        ppbdpwWWljzmXXdHNabfWhgjl111l11(ua1 ua1Var) {
        }

        public final lc dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ lc invoke() {
        }
    }

    @xc0
    static final class qbdpqpstJKhhKkXrsOGvbWw1l1llll extends v40 implements qh<Object> {
        final /* synthetic */ ArrayList<SearchResult> dpbdpqRKAscW1lll1l;

        qbdpqpstJKhhKkXrsOGvbWw1l1llll(ArrayList<SearchResult> arrayList) {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    public static final /* synthetic */ String bbbddbppbHkZyStOxwRl1lll1(ua1 ua1Var) {
    }

    public static final /* synthetic */ View bbpqddpdpMWPNcLVjpAOBLtzBwll1l1(ua1 ua1Var) {
    }

    public static final /* synthetic */ BottomSheetLayout bdpbpsDcyJTPrj1lll11(ua1 ua1Var) {
    }

    public static final /* synthetic */ us bdpqbmWvwOSl1111(ua1 ua1Var) {
    }

    private final sq bqdbqqAlarZsSbAl1ll1l() {
    }

    public static final /* synthetic */ String bqpqdNBFMzNEiipaXQPl11l11ll(ua1 ua1Var) {
    }

    private final zq bqpqpdRGoNS1ll1111l1() {
    }

    private static final void dpddppbpssQkdaWsxnuFll1l1(ua1 ua1Var) {
    }

    public static /* synthetic */ void dqbbbarhSjFxjxEEl1ll11(ua1 ua1Var) {
    }

    public static /* synthetic */ void dqbbdbpqbvChgeruisCbWCnl11lllll(ua1 ua1Var) {
    }

    private static final void dqdbdbddbsXTuiebVrav1l11111l1(ua1 ua1Var) {
    }

    public static final /* synthetic */ lp pbqbdpDzmUH1l1ll(ua1 ua1Var) {
    }

    private final lp pbqdbbLIoUwreKSxbxAll11ll() {
    }

    private final wr pbqddddDusqnIBFOMWnENLpll1111() {
    }

    public static final /* synthetic */ sq qbqddbqpnPHFHyPasib1l1ll11ll(ua1 ua1Var) {
    }

    static /* synthetic */ void qbqqdoZvfpl1l111ll(ua1 ua1Var, boolean z, String str, int i, Object obj) {
    }

    private final void qbqqdqdboCzbEGhywRrZi1lll1l1l(boolean z, String str) {
    }

    private static final void qdbbdhsmdYJSqeHT1111ll1l(ua1 ua1Var) {
    }

    public static final /* synthetic */ zq qpdpdszwYFiQbkll1ll(ua1 ua1Var) {
    }

    public static /* synthetic */ void qqqdbddwLHHSrqKnVcHujUhU1llll(ua1 ua1Var) {
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

    @Override // p000.zs
    public void bpppqdQjfPiCT111111111(List<? extends IData> list) {
    }

    @Override // p000.zs
    public void bpqbdddbQzWMiIJFWdSJrGCER1l1l11ll(String str) {
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

    @Override // p000.zs
    public void dbppbdqpeLmcbs11l11() {
    }

    @Override // p000.xr
    public void ddbbbeXHXx111ll(ArrayList<SearchResult> arrayList) {
    }

    @Override // p000.zs
    public String dddbpbpNqzZZJmSG1111l() {
    }

    @Override // p000.zs
    public void ddpbddGpKmMvSPZaXEkLg11l11(List<? extends IData> list) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    public /* bridge */ /* synthetic */ us dpbqpXiNmkuFJMoGemM1llll1ll1() {
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

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected up[] dqpqbdWhIsNIidXUell11l111() {
    }

    @Override // p000.ar
    public void dqqppqiKzJi1l1lll1l(String str) {
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
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

    @Override // p000.zs
    public void pbdpdbqqdJtdUmQAgX1llll1() {
    }

    @Override // p000.tq
    public void pbpbpmdJpqmdGNwEepmjpVlll11l1(String str) {
    }

    public final List<IData> pbpqqqqFBwYCJOfRsCpOLdMl11l11l11() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected int pddpddbdIotonl1ll1l11() {
    }

    @Override // p000.zs
    public void pdpppduUgcghSRP11l11l(String str) {
    }

    @Override // p000.ar
    public void pdpqbuMsiTd1ll1l1(List<? extends Favorite> list) {
    }

    @Override // p000.mp
    public void ppbddpbbYwysRtaAnAwzNYP11l11111l(String str) {
    }

    @Override // p000.zs
    public void qbdbqqdbJdTsszXtJeXGasJIiGllll1l(String str) {
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

    @Override // p000.ar
    public void qpdbbbbbmKdyKHlllllll1(String str) {
    }

    protected us qqpbbbpElrBCTDfMihU11111() {
    }
}
