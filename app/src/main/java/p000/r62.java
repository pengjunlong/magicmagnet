package p000;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.abdularis.piv.VerticalScrollParallaxImageView;
import com.magicmagnet.data.bean.IData;
import com.magicmagnet.data.bean.xlFilmReview.FilmReview;
import com.magicmagnet.data.bean.xlFilmReview.index.IndexData;
import com.othershe.library.NiceImageView;
import de.hdodenhof.circleimageview.CircleImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class r62 extends qqqqdpdZawTcmNbkDCA11ll11l1<us> implements zs, xr<FilmReview> {
    public static final dpbdbdpbLwkLpObyKsq1lll1 dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 = null;
    private us bdddqmITkkeGpsxVXHR1l1llll;
    private dbpqdHhmDSIHIJiwc1ll1l1 dbppbdqpeLmcbs11l11;
    private r60 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private int dqdqbpQposEBDyDxIyyz1ll11;
    private LinearLayoutManager pbppbpqbamJRy11l1l1;
    public Map<Integer, View> qbddqbdJBkudFfhX1ll1l111;
    private wr qbdpqpstJKhhKkXrsOGvbWw1l1llll;

    @Metadata
    public static final class bpdqqiQNVROMLC1ll1l1l11 extends r60 {
        final /* synthetic */ r62 pbppbpqbamJRy11l1l1;

        bpdqqiQNVROMLC1ll1l1l11(r62 r62Var, LinearLayoutManager linearLayoutManager) {
        }

        @Override // p000.r60
        public void dpbdbdpbLwkLpObyKsq1lll1(int i) {
        }
    }

    @Metadata
    public static final class dbpqdHhmDSIHIJiwc1ll1l1 extends RecyclerView.ddbbbeXHXx111ll<RecyclerView.bpqbbqTOKdRXac1ll1l1lll> {
        private ArrayList<IData> dbpqdHhmDSIHIJiwc1ll1l1;
        private final int dpbdbdpbLwkLpObyKsq1lll1;
        private final int dpbdpqRKAscW1lll1l;
        private final int dqqppqiKzJi1l1lll1l;

        @Metadata
        /* renamed from: r62$dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1, reason: collision with other inner class name */
        static final class C2083dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements qh<mv1> {
            final /* synthetic */ int bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 dpbdpqRKAscW1lll1l;
            final /* synthetic */ RecyclerView.bpqbbqTOKdRXac1ll1l1lll ppbdpwWWljzmXXdHNabfWhgjl111l11;

            @Metadata
            /* renamed from: r62$dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1, reason: collision with other inner class name */
            static final class C2084dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements sh<View, mv1> {
                final /* synthetic */ IndexData bpdqqiQNVROMLC1ll1l1l11;
                final /* synthetic */ RecyclerView.bpqbbqTOKdRXac1ll1l1lll dpbdpqRKAscW1lll1l;

                C2084dbpqdHhmDSIHIJiwc1ll1l1(RecyclerView.bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll, IndexData indexData) {
                }

                public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
                }

                @Override // p000.sh
                public /* bridge */ /* synthetic */ mv1 invoke(View view) {
                }
            }

            @Metadata
            /* renamed from: r62$dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1$dpbdbdpbLwkLpObyKsq1lll1 */
            static final class dpbdbdpbLwkLpObyKsq1lll1 extends v40 implements sh<View, mv1> {
                final /* synthetic */ IndexData bpdqqiQNVROMLC1ll1l1l11;
                final /* synthetic */ RecyclerView.bpqbbqTOKdRXac1ll1l1lll dpbdpqRKAscW1lll1l;

                dpbdbdpbLwkLpObyKsq1lll1(RecyclerView.bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll, IndexData indexData) {
                }

                public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
                }

                @Override // p000.sh
                public /* bridge */ /* synthetic */ mv1 invoke(View view) {
                }
            }

            @Metadata
            /* renamed from: r62$dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1$dqqppqiKzJi1l1lll1l */
            static final class dqqppqiKzJi1l1lll1l extends v40 implements sh<View, mv1> {
                final /* synthetic */ IndexData bpdqqiQNVROMLC1ll1l1l11;
                final /* synthetic */ RecyclerView.bpqbbqTOKdRXac1ll1l1lll dpbdpqRKAscW1lll1l;

                dqqppqiKzJi1l1lll1l(RecyclerView.bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll, IndexData indexData) {
                }

                public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
                }

                @Override // p000.sh
                public /* bridge */ /* synthetic */ mv1 invoke(View view) {
                }
            }

            C2083dbpqdHhmDSIHIJiwc1ll1l1(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, int i, RecyclerView.bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll) {
            }

            public final void dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // p000.qh
            public /* bridge */ /* synthetic */ mv1 invoke() {
            }
        }

        public dbpqdHhmDSIHIJiwc1ll1l1(ArrayList<IData> arrayList) {
        }

        public static final /* synthetic */ int ddbbbeXHXx111ll(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }

        public static final /* synthetic */ int dqpqqqbqQyjyB11111l1(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }

        public final ArrayList<IData> dbppbdqpeLmcbs11l11() {
        }

        public final void dqpdbEevAufTOvPphbjykClll1l11(List<? extends IData> list) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public int getItemCount() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public int getItemViewType(int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public void onBindViewHolder(RecyclerView.bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public RecyclerView.bpqbbqTOKdRXac1ll1l1lll onCreateViewHolder(ViewGroup viewGroup, int i) {
        }

        public final void pbppbpqbamJRy11l1l1(List<? extends IData> list) {
        }
    }

    @Metadata
    public static final class dpbdbdpbLwkLpObyKsq1lll1 {
        private dpbdbdpbLwkLpObyKsq1lll1() {
        }

        public /* synthetic */ dpbdbdpbLwkLpObyKsq1lll1(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public final r62 dbpqdHhmDSIHIJiwc1ll1l1() {
        }
    }

    @Metadata
    public static final class dpbdpqRKAscW1lll1l extends RecyclerView.bpqbbqTOKdRXac1ll1l1lll {
        private final TextView bpdqqiQNVROMLC1ll1l1l11;
        private final NiceImageView dbpqdHhmDSIHIJiwc1ll1l1;
        private final CircleImageView dpbdbdpbLwkLpObyKsq1lll1;
        private final TextView dpbdpqRKAscW1lll1l;
        private final TextView dqqppqiKzJi1l1lll1l;
        private final TextView ppbdpwWWljzmXXdHNabfWhgjl111l11;

        public dpbdpqRKAscW1lll1l(View view) {
        }

        public final TextView bpdqqiQNVROMLC1ll1l1l11() {
        }

        public final NiceImageView dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public final CircleImageView dpbdbdpbLwkLpObyKsq1lll1() {
        }

        public final TextView dpbdpqRKAscW1lll1l() {
        }

        public final TextView dqqppqiKzJi1l1lll1l() {
        }

        public final TextView ppbdpwWWljzmXXdHNabfWhgjl111l11() {
        }
    }

    @Metadata
    public static final class dqqppqiKzJi1l1lll1l extends RecyclerView.bpqbbqTOKdRXac1ll1l1lll {
        private final AppCompatTextView bpdqqiQNVROMLC1ll1l1l11;
        private final VerticalScrollParallaxImageView dbpqdHhmDSIHIJiwc1ll1l1;
        private final TextView dpbdbdpbLwkLpObyKsq1lll1;
        private final CircleImageView dpbdpqRKAscW1lll1l;
        private final TextView dqpqqqbqQyjyB11111l1;
        private final TextView dqqppqiKzJi1l1lll1l;
        private final LinearLayout ppbdpwWWljzmXXdHNabfWhgjl111l11;

        public dqqppqiKzJi1l1lll1l(View view) {
        }

        public final TextView bpdqqiQNVROMLC1ll1l1l11() {
        }

        public final VerticalScrollParallaxImageView dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public final CircleImageView dpbdbdpbLwkLpObyKsq1lll1() {
        }

        public final TextView dpbdpqRKAscW1lll1l() {
        }

        public final AppCompatTextView dqqppqiKzJi1l1lll1l() {
        }

        public final TextView ppbdpwWWljzmXXdHNabfWhgjl111l11() {
        }
    }

    private static final void bbbddbppbHkZyStOxwRl1lll1(r62 r62Var) {
    }

    public static /* synthetic */ void dqbbbarhSjFxjxEEl1ll11(r62 r62Var) {
    }

    public static /* synthetic */ void dqbbdbpqbvChgeruisCbWCnl11lllll(r62 r62Var) {
    }

    public static final /* synthetic */ us pbqbdpDzmUH1l1ll(r62 r62Var) {
    }

    private static final void qbqddbqpnPHFHyPasib1l1ll11ll(r62 r62Var) {
    }

    private static final void qpdpdszwYFiQbkll1ll(r62 r62Var) {
    }

    public static /* synthetic */ void qqqdbddwLHHSrqKnVcHujUhU1llll(r62 r62Var) {
    }

    protected us bdpbpsDcyJTPrj1lll11() {
    }

    @Override // p000.zs
    public void bpppqdQjfPiCT111111111(List<? extends IData> list) {
    }

    @Override // p000.zs
    public void bpqbdddbQzWMiIJFWdSJrGCER1l1l11ll(String str) {
    }

    public void bqppbbbqLsCdM1llll() {
    }

    @Override // p000.zs
    public void dbppbdqpeLmcbs11l11() {
    }

    @Override // p000.xr
    public void ddbbbeXHXx111ll(ArrayList<FilmReview> arrayList) {
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

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected void dqbpbqXLoKDkRdCKHlKfl11llll1l() {
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

    public final void pbpqpdqpDkfTMiEll11l11l() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected int pddpddbdIotonl1ll1l11() {
    }

    @Override // p000.zs
    public void pdpppduUgcghSRP11l11l(String str) {
    }

    @Override // p000.zs
    public void qbdbqqdbJdTsszXtJeXGasJIiGllll1l(String str) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected void qbdpbdotUKqbANmgeJETNyAM1l111() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected vp[] qddqpzYVacW1llllll() {
    }
}
