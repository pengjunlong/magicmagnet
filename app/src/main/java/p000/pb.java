package p000;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.magicmagnet.data.bean.FtnData;
import com.magicmagnet.data.bean.IData;
import com.magicmagnet.data.db.Favorite;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p000.yj;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class pb extends qqqqdpdZawTcmNbkDCA11ll11l1<zq> implements ar, tq, ss {
    private BottomSheetLayout bdddqmITkkeGpsxVXHR1l1llll;
    private final y40 dbppbdqpeLmcbs11l11;
    private RecyclerView ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    public Map<Integer, View> dqdqbpQposEBDyDxIyyz1ll11;
    private final y40 pbppbpqbamJRy11l1l1;
    private View qbdpqpstJKhhKkXrsOGvbWw1l1llll;

    @xc0
    static final class bpdqqiQNVROMLC1ll1l1l11 extends v40 implements qh<List<? extends Object>> {
        final /* synthetic */ pb dpbdpqRKAscW1lll1l;

        bpdqqiQNVROMLC1ll1l1l11(pb pbVar) {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ List<? extends Object> invoke() {
        }

        @Override // p000.qh
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<? extends Object> invoke2() {
        }
    }

    @Metadata
    static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements qh<uf0> {
        public static final dbpqdHhmDSIHIJiwc1ll1l1 dpbdpqRKAscW1lll1l = null;

        dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public final uf0 dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ uf0 invoke() {
        }
    }

    @Metadata
    static final class ddbbbeXHXx111ll extends v40 implements gi<DialogInterface, Integer, mv1> {
        final /* synthetic */ pb dpbdpqRKAscW1lll1l;

        ddbbbeXHXx111ll(pb pbVar) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(DialogInterface dialogInterface, int i) {
        }

        @Override // p000.gi
        public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(DialogInterface dialogInterface, Integer num) {
        }
    }

    @Metadata
    static final class dpbdbdpbLwkLpObyKsq1lll1 extends v40 implements qh<i3> {
        final /* synthetic */ pb dpbdpqRKAscW1lll1l;

        dpbdbdpbLwkLpObyKsq1lll1(pb pbVar) {
        }

        public final i3 dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ i3 invoke() {
        }
    }

    @Metadata
    public static final class dpbdpqRKAscW1lll1l extends la0 {
        dpbdpqRKAscW1lll1l(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
        }

        @Override // p000.la0
        public Rect dpbdpqRKAscW1lll1l(int i, Object obj) {
        }
    }

    @Metadata
    static final class dqpqqqbqQyjyB11111l1 extends v40 implements gi<DialogInterface, Integer, mv1> {
        final /* synthetic */ FtnData bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ pb dpbdpqRKAscW1lll1l;

        dqpqqqbqQyjyB11111l1(pb pbVar, FtnData ftnData) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(DialogInterface dialogInterface, int i) {
        }

        @Override // p000.gi
        public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(DialogInterface dialogInterface, Integer num) {
        }
    }

    @Metadata
    public static final class dqqppqiKzJi1l1lll1l implements yj.ppbdpwWWljzmXXdHNabfWhgjl111l11 {
        final /* synthetic */ pb dbpqdHhmDSIHIJiwc1ll1l1;

        @Metadata
        static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements sh<String, mv1> {
            final /* synthetic */ Object bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ pb dpbdpqRKAscW1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(pb pbVar, Object obj) {
            }

            public final void dbpqdHhmDSIHIJiwc1ll1l1(String str) {
            }

            @Override // p000.sh
            public /* bridge */ /* synthetic */ mv1 invoke(String str) {
            }
        }

        @Metadata
        static final class dpbdbdpbLwkLpObyKsq1lll1 extends v40 implements qh<mv1> {
            final /* synthetic */ pb bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ IData dpbdpqRKAscW1lll1l;

            @Metadata
            static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements gi<DialogInterface, Integer, mv1> {
                final /* synthetic */ IData bpdqqiQNVROMLC1ll1l1l11;
                final /* synthetic */ View dpbdpqRKAscW1lll1l;
                final /* synthetic */ pb ppbdpwWWljzmXXdHNabfWhgjl111l11;

                @bqbpqpbdbJKmwXJCVFIIpXqwGcll1111(m0c = "com.magicmagnet.favorite.view.FavoriteFragment$initData$1$onMoreClick$1$1$1", m1f = "FavoriteFragment.kt", m2l = {107}, m3m = "invokeSuspend")
                @Metadata
                /* renamed from: pb$dqqppqiKzJi1l1lll1l$dpbdbdpbLwkLpObyKsq1lll1$dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1, reason: collision with other inner class name */
                static final class C2073dbpqdHhmDSIHIJiwc1ll1l1 extends bp1 implements gi<qqbqbpbFgzQbllll1ll, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super mv1>, Object> {
                    final /* synthetic */ IData dbppbdqpeLmcbs11l11;
                    int ddbbbeXHXx111ll;
                    final /* synthetic */ pb dqpdbEevAufTOvPphbjykClll1l11;
                    final /* synthetic */ String pbppbpqbamJRy11l1l1;

                    C2073dbpqdHhmDSIHIJiwc1ll1l1(pb pbVar, IData iData, String str, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super C2073dbpqdHhmDSIHIJiwc1ll1l1> qpdqpbkgvdbreputwwyxml1ll1111l1) {
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

                dbpqdHhmDSIHIJiwc1ll1l1(View view, IData iData, pb pbVar) {
                }

                public final void dbpqdHhmDSIHIJiwc1ll1l1(DialogInterface dialogInterface, int i) {
                }

                @Override // p000.gi
                public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(DialogInterface dialogInterface, Integer num) {
                }
            }

            dpbdbdpbLwkLpObyKsq1lll1(IData iData, pb pbVar) {
            }

            public final void dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // p000.qh
            public /* bridge */ /* synthetic */ mv1 invoke() {
            }
        }

        @Metadata
        /* renamed from: pb$dqqppqiKzJi1l1lll1l$dqqppqiKzJi1l1lll1l, reason: collision with other inner class name */
        static final class C2074dqqppqiKzJi1l1lll1l extends v40 implements qh<mv1> {
            final /* synthetic */ pb bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ IData dpbdpqRKAscW1lll1l;

            @Metadata
            /* renamed from: pb$dqqppqiKzJi1l1lll1l$dqqppqiKzJi1l1lll1l$dbpqdHhmDSIHIJiwc1ll1l1 */
            static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements gi<DialogInterface, Integer, mv1> {
                final /* synthetic */ IData bpdqqiQNVROMLC1ll1l1l11;
                final /* synthetic */ pb dpbdpqRKAscW1lll1l;

                dbpqdHhmDSIHIJiwc1ll1l1(pb pbVar, IData iData) {
                }

                public final void dbpqdHhmDSIHIJiwc1ll1l1(DialogInterface dialogInterface, int i) {
                }

                @Override // p000.gi
                public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(DialogInterface dialogInterface, Integer num) {
                }
            }

            C2074dqqppqiKzJi1l1lll1l(IData iData, pb pbVar) {
            }

            public final void dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // p000.qh
            public /* bridge */ /* synthetic */ mv1 invoke() {
            }
        }

        dqqppqiKzJi1l1lll1l(pb pbVar) {
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
    static final class ppbdpwWWljzmXXdHNabfWhgjl111l11 extends v40 implements gi<DialogInterface, Integer, mv1> {
        final /* synthetic */ FtnData bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ pb dpbdpqRKAscW1lll1l;

        ppbdpwWWljzmXXdHNabfWhgjl111l11(pb pbVar, FtnData ftnData) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(DialogInterface dialogInterface, int i) {
        }

        @Override // p000.gi
        public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(DialogInterface dialogInterface, Integer num) {
        }
    }

    public static final /* synthetic */ View bqppbbbqLsCdM1llll(pb pbVar) {
    }

    public static final /* synthetic */ uf0 dqbbbarhSjFxjxEEl1ll11(pb pbVar) {
    }

    public static final /* synthetic */ zq pbqbdpDzmUH1l1ll(pb pbVar) {
    }

    private final uf0 qbqddbqpnPHFHyPasib1l1ll11ll() {
    }

    private final sq qpdpdszwYFiQbkll1ll() {
    }

    public static final /* synthetic */ sq qqqdbddwLHHSrqKnVcHujUhU1llll(pb pbVar) {
    }

    protected zq bbbddbppbHkZyStOxwRl1lll1() {
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

    @Override // p000.tq
    public void bqbpbxbDWbYusagGEGEkKZ1ll1l1() {
    }

    @Override // p000.tq
    public void bqdppdGFpODiqhzhhiaXKl11l1(String str) {
    }

    @Override // p000.tq
    public void dbbpdqqpdVUhpQ1ll11() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    public /* bridge */ /* synthetic */ zq dpbqpXiNmkuFJMoGemM1llll1ll1() {
    }

    @Override // p000.tq
    public void dpdqpXgfqpODrtwusppe1l1l1l1ll() {
    }

    public void dqbbdbpqbvChgeruisCbWCnl11lllll() {
    }

    @Override // p000.tq
    public void dqbbdddqpLERmaRLiHiDpL1l1l1l() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected up[] dqpqbdWhIsNIidXUell11l111() {
    }

    @Override // p000.ar
    public void dqqppqiKzJi1l1lll1l(String str) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected void pbbbqppqTbuPhHQEDqbrOKDl11ll1(View view) {
    }

    @Override // p000.tq
    public void pbpbpmdJpqmdGNwEepmjpVlll11l1(String str) {
    }

    @Override // p000.ss
    public void pbpqpdqpDkfTMiEll11l11l() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected int pddpddbdIotonl1ll1l11() {
    }

    @Override // p000.ar
    public void pdpqbuMsiTd1ll1l1(List<? extends Favorite> list) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected void qbdpbdotUKqbANmgeJETNyAM1l111() {
    }

    @Override // p000.tq
    public void qbqdqqqqdvTduGNll111l1(FtnData ftnData) {
    }

    @Override // p000.ar
    public void qpdbbbbbmKdyKHlllllll1(String str) {
    }
}
