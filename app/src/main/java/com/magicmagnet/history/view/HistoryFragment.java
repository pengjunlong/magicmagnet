package com.magicmagnet.history.view;

import android.app.AlertDialog;
import android.app.ProgressDialog;
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
import com.magicmagnet.data.db.History;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p000.dbqbbqpdqHtvJXil111l1ll;
import p000.gi;
import p000.i3;
import p000.mv1;
import p000.np;
import p000.nr;
import p000.ns;
import p000.op;
import p000.or;
import p000.pbqpdbqQooSybVyBWeljbbWu11llll1ll;
import p000.qh;
import p000.qqqqdpdZawTcmNbkDCA11ll11l1;
import p000.sh;
import p000.sq;
import p000.tq;
import p000.up;
import p000.v40;
import p000.y40;
import p000.yj;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class HistoryFragment extends qqqqdpdZawTcmNbkDCA11ll11l1<nr> implements or, ns, tq, op {
    private final y40 bbdbbpdOJSuInlll111l;
    private View bdddqmITkkeGpsxVXHR1l1llll;
    public Map<Integer, View> bppbpdbCeZVhQNTixBml1lll11l;
    private final y40 dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
    private final y40 dbbpdqqpdVUhpQ1ll11;
    private final y40 dbppbdqpeLmcbs11l11;
    private dbpqdHhmDSIHIJiwc1ll1l1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private View dqdqbpQposEBDyDxIyyz1ll11;
    private final y40 pbppbpqbamJRy11l1l1;
    public BottomSheetLayout qbddqbdJBkudFfhX1ll1l111;
    private RecyclerView qbdpqpstJKhhKkXrsOGvbWw1l1llll;

    @Metadata
    static final class bpdqqiQNVROMLC1ll1l1l11 extends v40 implements qh<dbqbbqpdqHtvJXil111l1ll> {
        final /* synthetic */ HistoryFragment dpbdpqRKAscW1lll1l;

        bpdqqiQNVROMLC1ll1l1l11(HistoryFragment historyFragment) {
        }

        public final dbqbbqpdqHtvJXil111l1ll dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ dbqbbqpdqHtvJXil111l1ll invoke() {
        }
    }

    @Metadata
    static final class dbppbdqpeLmcbs11l11 extends v40 implements qh<View> {
        final /* synthetic */ HistoryFragment dpbdpqRKAscW1lll1l;

        dbppbdqpeLmcbs11l11(HistoryFragment historyFragment) {
        }

        public final View dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ View invoke() {
        }
    }

    @Metadata
    public final class dbpqdHhmDSIHIJiwc1ll1l1 extends pbqpdbqQooSybVyBWeljbbWu11llll1ll<History> {
        final /* synthetic */ HistoryFragment dqqppqiKzJi1l1lll1l;

        @Metadata
        /* renamed from: com.magicmagnet.history.view.HistoryFragment$dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1, reason: collision with other inner class name */
        public final class C2015dbpqdHhmDSIHIJiwc1ll1l1 extends RecyclerView.bpqbbqTOKdRXac1ll1l1lll {
            final /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 dbpqdHhmDSIHIJiwc1ll1l1;

            @Metadata
            /* renamed from: com.magicmagnet.history.view.HistoryFragment$dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1, reason: collision with other inner class name */
            public static final class C2016dbpqdHhmDSIHIJiwc1ll1l1 implements yj.ppbdpwWWljzmXXdHNabfWhgjl111l11 {
                final /* synthetic */ HistoryFragment dbpqdHhmDSIHIJiwc1ll1l1;
                final /* synthetic */ yj dpbdbdpbLwkLpObyKsq1lll1;
                final /* synthetic */ C2015dbpqdHhmDSIHIJiwc1ll1l1 dpbdpqRKAscW1lll1l;
                final /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 dqqppqiKzJi1l1lll1l;

                @Metadata
                /* renamed from: com.magicmagnet.history.view.HistoryFragment$dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1, reason: collision with other inner class name */
                static final class C2017dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements sh<String, mv1> {
                    final /* synthetic */ HistoryFragment dpbdpqRKAscW1lll1l;

                    C2017dbpqdHhmDSIHIJiwc1ll1l1(HistoryFragment historyFragment) {
                    }

                    public final void dbpqdHhmDSIHIJiwc1ll1l1(String str) {
                    }

                    @Override // p000.sh
                    public /* bridge */ /* synthetic */ mv1 invoke(String str) {
                    }
                }

                C2016dbpqdHhmDSIHIJiwc1ll1l1(HistoryFragment historyFragment, yj yjVar, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, C2015dbpqdHhmDSIHIJiwc1ll1l1 c2015dbpqdHhmDSIHIJiwc1ll1l1) {
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

            public C2015dbpqdHhmDSIHIJiwc1ll1l1(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, yj yjVar) {
            }

            private static final void bpdqqiQNVROMLC1ll1l1l11(HistoryFragment historyFragment, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, C2015dbpqdHhmDSIHIJiwc1ll1l1 c2015dbpqdHhmDSIHIJiwc1ll1l1, DialogInterface dialogInterface, int i) {
            }

            public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(HistoryFragment historyFragment, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, C2015dbpqdHhmDSIHIJiwc1ll1l1 c2015dbpqdHhmDSIHIJiwc1ll1l1, DialogInterface dialogInterface, int i) {
            }

            public static /* synthetic */ boolean dpbdbdpbLwkLpObyKsq1lll1(HistoryFragment historyFragment, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, C2015dbpqdHhmDSIHIJiwc1ll1l1 c2015dbpqdHhmDSIHIJiwc1ll1l1, View view) {
            }

            private static final boolean dpbdpqRKAscW1lll1l(HistoryFragment historyFragment, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, C2015dbpqdHhmDSIHIJiwc1ll1l1 c2015dbpqdHhmDSIHIJiwc1ll1l1, View view) {
            }

            public static /* synthetic */ void dqqppqiKzJi1l1lll1l(DialogInterface dialogInterface, int i) {
            }

            private static final void ppbdpwWWljzmXXdHNabfWhgjl111l11(DialogInterface dialogInterface, int i) {
            }
        }

        public dbpqdHhmDSIHIJiwc1ll1l1(HistoryFragment historyFragment, List<? extends History> list) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public void onBindViewHolder(RecyclerView.bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public RecyclerView.bpqbbqTOKdRXac1ll1l1lll onCreateViewHolder(ViewGroup viewGroup, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public void onViewDetachedFromWindow(RecyclerView.bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll) {
        }
    }

    @Metadata
    static final class ddbbbeXHXx111ll extends v40 implements gi<DialogInterface, Integer, mv1> {
        final /* synthetic */ HistoryFragment dpbdpqRKAscW1lll1l;

        ddbbbeXHXx111ll(HistoryFragment historyFragment) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(DialogInterface dialogInterface, int i) {
        }

        @Override // p000.gi
        public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(DialogInterface dialogInterface, Integer num) {
        }
    }

    @Metadata
    public static final class dpbdbdpbLwkLpObyKsq1lll1 extends RecyclerView.dqdqbpQposEBDyDxIyyz1ll11 {
        @Override // androidx.recyclerview.widget.RecyclerView.dqdqbpQposEBDyDxIyyz1ll11
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
        }
    }

    @Metadata
    static final class dpbdpqRKAscW1lll1l extends v40 implements qh<i3> {
        final /* synthetic */ HistoryFragment dpbdpqRKAscW1lll1l;

        dpbdpqRKAscW1lll1l(HistoryFragment historyFragment) {
        }

        public final i3 dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ i3 invoke() {
        }
    }

    @Metadata
    static final class dqpdbEevAufTOvPphbjykClll1l11 extends v40 implements qh<ProgressDialog> {
        final /* synthetic */ HistoryFragment dpbdpqRKAscW1lll1l;

        dqpdbEevAufTOvPphbjykClll1l11(HistoryFragment historyFragment) {
        }

        public final ProgressDialog dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ ProgressDialog invoke() {
        }
    }

    @Metadata
    static final class dqpqqqbqQyjyB11111l1 extends v40 implements gi<DialogInterface, Integer, mv1> {
        final /* synthetic */ FtnData bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ HistoryFragment dpbdpqRKAscW1lll1l;

        dqpqqqbqQyjyB11111l1(HistoryFragment historyFragment, FtnData ftnData) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(DialogInterface dialogInterface, int i) {
        }

        @Override // p000.gi
        public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(DialogInterface dialogInterface, Integer num) {
        }
    }

    @Metadata
    static final class dqqppqiKzJi1l1lll1l extends v40 implements qh<AlertDialog> {
        final /* synthetic */ HistoryFragment dpbdpqRKAscW1lll1l;

        dqqppqiKzJi1l1lll1l(HistoryFragment historyFragment) {
        }

        public final AlertDialog dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ AlertDialog invoke() {
        }
    }

    @Metadata
    static final class ppbdpwWWljzmXXdHNabfWhgjl111l11 extends v40 implements gi<DialogInterface, Integer, mv1> {
        final /* synthetic */ FtnData bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ HistoryFragment dpbdpqRKAscW1lll1l;

        ppbdpwWWljzmXXdHNabfWhgjl111l11(HistoryFragment historyFragment, FtnData ftnData) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(DialogInterface dialogInterface, int i) {
        }

        @Override // p000.gi
        public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(DialogInterface dialogInterface, Integer num) {
        }
    }

    public static /* synthetic */ void dqbbbarhSjFxjxEEl1ll11(HistoryFragment historyFragment, FtnData ftnData, View view) {
    }

    public static /* synthetic */ void dqbbdbpqbvChgeruisCbWCnl11lllll(HistoryFragment historyFragment, FtnData ftnData, View view) {
    }

    private static final void pbpqqqqFBwYCJOfRsCpOLdMl11l11l11(HistoryFragment historyFragment, FtnData ftnData, View view) {
    }

    public static final /* synthetic */ nr pbqbdpDzmUH1l1ll(HistoryFragment historyFragment) {
    }

    private static final void pbqdbbLIoUwreKSxbxAll11ll(HistoryFragment historyFragment, FtnData ftnData, View view) {
    }

    private static final void pbqddddDusqnIBFOMWnENLpll1111(HistoryFragment historyFragment, FtnData ftnData, View view) {
    }

    public static /* synthetic */ void qqqdbddwLHHSrqKnVcHujUhU1llll(HistoryFragment historyFragment, FtnData ftnData, View view) {
    }

    public final np bbbddbppbHkZyStOxwRl1lll1() {
    }

    public final View bbpqddpdpMWPNcLVjpAOBLtzBwll1l1() {
    }

    public final BottomSheetLayout bdpbpsDcyJTPrj1lll11() {
    }

    public final ProgressDialog bdpqbmWvwOSl1111() {
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

    @Override // p000.op
    public void bpdqqiQNVROMLC1ll1l1l11(String str) {
    }

    @Override // p000.tq
    public void bppbpdbCeZVhQNTixBml1lll11l(String str) {
    }

    @Override // p000.tq
    public void bqbpbxbDWbYusagGEGEkKZ1ll1l1() {
    }

    public final void bqdbqqAlarZsSbAl1ll1l(BottomSheetLayout bottomSheetLayout) {
    }

    @Override // p000.tq
    public void bqdppdGFpODiqhzhhiaXKl11l1(String str) {
    }

    public void bqppbbbqLsCdM1llll() {
    }

    public final View bqpqdNBFMzNEiipaXQPl11l11ll() {
    }

    protected nr bqpqpdRGoNS1ll1111l1() {
    }

    @Override // p000.tq
    public void dbbpdqqpdVUhpQ1ll11() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1, p000.sp, p000.ds
    public void dpbdpqRKAscW1lll1l() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    public /* bridge */ /* synthetic */ nr dpbqpXiNmkuFJMoGemM1llll1ll1() {
    }

    @Override // p000.tq
    public void dpdqpXgfqpODrtwusppe1l1l1l1ll() {
    }

    @Override // p000.or
    public void dpppqdppqSnABbIYdrll1lll11ll(String str) {
    }

    @Override // p000.tq
    public void dqbbdddqpLERmaRLiHiDpL1l1l1l() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected up[] dqpqbdWhIsNIidXUell11l111() {
    }

    @Override // p000.op
    public void dqqppqiKzJi1l1lll1l(String str) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1, p000.sp, p000.ds
    public void loading() {
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

    @Override // p000.or
    public void pbddqdbpoVvTyZPOoYl1111(List<? extends History> list) {
    }

    @Override // p000.tq
    public void pbpbpmdJpqmdGNwEepmjpVlll11l1(String str) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected int pddpddbdIotonl1ll1l11() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1, p000.sp
    public void pdpqqbqbpFAaViLnU1l1ll11l1() {
    }

    @Override // p000.or
    public void qbbqpzukjahUWUWfxIll11lll1(String str) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected void qbdpbdotUKqbANmgeJETNyAM1l111() {
    }

    public final AlertDialog qbqddbqpnPHFHyPasib1l1ll11ll() {
    }

    @Override // p000.tq
    public void qbqdqqqqdvTduGNll111l1(FtnData ftnData) {
    }

    public final sq qpdpdszwYFiQbkll1ll() {
    }

    @Override // p000.ns
    public void qqdbbfmUWwoYYpfYHJZdaUO1111llll(String str) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1, p000.sp
    public void qqpbppebHUxqEmlGoAJWl1lll() {
    }
}
