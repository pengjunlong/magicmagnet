package com.magicmagnet.dlna.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.bpdqqiQNVROMLC1ll1l1l11;
import com.magicmagnet.data.bean.DLNADevice;
import com.magicmagnet.data.bean.FtnData;
import com.tencent.tinker.android.dx.instruction.Opcodes;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p000.bp1;
import p000.bqbpqpbdbJKmwXJCVFIIpXqwGcll1111;
import p000.gi;
import p000.hq;
import p000.ii;
import p000.iq;
import p000.mv1;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.qh;
import p000.qpdqpbkgVDbrePuTwWYxml1ll1111l1;
import p000.qqbqbpbFgzQbllll1ll;
import p000.qqqqdpdZawTcmNbkDCA11ll11l1;
import p000.sa0;
import p000.sh;
import p000.v40;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class DLNASearchDialogFragment extends qqqqdpdZawTcmNbkDCA11ll11l1<hq> implements iq {
    public static final dpbdbdpbLwkLpObyKsq1lll1 bdddqmITkkeGpsxVXHR1l1llll = null;
    private dbpqdHhmDSIHIJiwc1ll1l1 dbppbdqpeLmcbs11l11;
    private RecyclerView ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private FtnData pbppbpqbamJRy11l1l1;
    public Map<Integer, View> qbdpqpstJKhhKkXrsOGvbWw1l1llll;

    @Metadata
    private final class WifiStateReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    @Metadata
    static final class bpdqqiQNVROMLC1ll1l1l11 extends v40 implements sh<View, mv1> {
        final /* synthetic */ View bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ DLNASearchDialogFragment dpbdpqRKAscW1lll1l;

        @xc0
        static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements qh<Object> {
            public static final dbpqdHhmDSIHIJiwc1ll1l1 dpbdpqRKAscW1lll1l = null;

            dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // p000.qh
            public final Object invoke() {
            }
        }

        @Metadata
        static final class dpbdbdpbLwkLpObyKsq1lll1 extends v40 implements ii<sa0, Integer, CharSequence, mv1> {
            final /* synthetic */ DLNASearchDialogFragment bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ View dpbdpqRKAscW1lll1l;
            final /* synthetic */ FragmentActivity ppbdpwWWljzmXXdHNabfWhgjl111l11;

            @Metadata
            static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements sh<SharedPreferences.Editor, mv1> {
                final /* synthetic */ int bpdqqiQNVROMLC1ll1l1l11;
                final /* synthetic */ FragmentActivity dpbdpqRKAscW1lll1l;

                dbpqdHhmDSIHIJiwc1ll1l1(FragmentActivity fragmentActivity, int i) {
                }

                public final void dbpqdHhmDSIHIJiwc1ll1l1(SharedPreferences.Editor editor) {
                }

                @Override // p000.sh
                public /* bridge */ /* synthetic */ mv1 invoke(SharedPreferences.Editor editor) {
                }
            }

            dpbdbdpbLwkLpObyKsq1lll1(View view, DLNASearchDialogFragment dLNASearchDialogFragment, FragmentActivity fragmentActivity) {
            }

            public final void dbpqdHhmDSIHIJiwc1ll1l1(sa0 sa0Var, int i, CharSequence charSequence) {
            }

            @Override // p000.ii
            public /* bridge */ /* synthetic */ mv1 ppbdpwWWljzmXXdHNabfWhgjl111l11(sa0 sa0Var, Integer num, CharSequence charSequence) {
            }
        }

        bpdqqiQNVROMLC1ll1l1l11(DLNASearchDialogFragment dLNASearchDialogFragment, View view) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @Metadata
    private static final class dbpqdHhmDSIHIJiwc1ll1l1 extends RecyclerView.ddbbbeXHXx111ll<C2012dbpqdHhmDSIHIJiwc1ll1l1> {
        private final ArrayList<DLNADevice> dbpqdHhmDSIHIJiwc1ll1l1;
        private final gi<Integer, DLNADevice, mv1> dpbdbdpbLwkLpObyKsq1lll1;
        private FtnData dqqppqiKzJi1l1lll1l;

        @Metadata
        /* renamed from: com.magicmagnet.dlna.search.DLNASearchDialogFragment$dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1, reason: collision with other inner class name */
        public final class C2012dbpqdHhmDSIHIJiwc1ll1l1 extends RecyclerView.bpqbbqTOKdRXac1ll1l1lll {
            private final ImageView dbpqdHhmDSIHIJiwc1ll1l1;
            private final AppCompatTextView dpbdbdpbLwkLpObyKsq1lll1;
            final /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 dpbdpqRKAscW1lll1l;
            private final TextView dqqppqiKzJi1l1lll1l;

            @Metadata
            /* renamed from: com.magicmagnet.dlna.search.DLNASearchDialogFragment$dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1, reason: collision with other inner class name */
            static final class C2013dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements sh<View, mv1> {
                final /* synthetic */ C2012dbpqdHhmDSIHIJiwc1ll1l1 bpdqqiQNVROMLC1ll1l1l11;
                final /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 dpbdpqRKAscW1lll1l;
                final /* synthetic */ View ppbdpwWWljzmXXdHNabfWhgjl111l11;

                C2013dbpqdHhmDSIHIJiwc1ll1l1(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, C2012dbpqdHhmDSIHIJiwc1ll1l1 c2012dbpqdHhmDSIHIJiwc1ll1l1, View view) {
                }

                public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
                }

                @Override // p000.sh
                public /* bridge */ /* synthetic */ mv1 invoke(View view) {
                }
            }

            public C2012dbpqdHhmDSIHIJiwc1ll1l1(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, View view) {
            }

            public final ImageView dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            public final TextView dpbdbdpbLwkLpObyKsq1lll1() {
            }

            public final AppCompatTextView dqqppqiKzJi1l1lll1l() {
            }
        }

        @Metadata
        public static final class dpbdbdpbLwkLpObyKsq1lll1 extends bpdqqiQNVROMLC1ll1l1l11.dpbdbdpbLwkLpObyKsq1lll1 {
            final /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 dbpqdHhmDSIHIJiwc1ll1l1;
            final /* synthetic */ List<DLNADevice> dpbdbdpbLwkLpObyKsq1lll1;

            dpbdbdpbLwkLpObyKsq1lll1(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, List<DLNADevice> list) {
            }

            @Override // androidx.recyclerview.widget.bpdqqiQNVROMLC1ll1l1l11.dpbdbdpbLwkLpObyKsq1lll1
            public int bpdqqiQNVROMLC1ll1l1l11() {
            }

            @Override // androidx.recyclerview.widget.bpdqqiQNVROMLC1ll1l1l11.dpbdbdpbLwkLpObyKsq1lll1
            public boolean dbpqdHhmDSIHIJiwc1ll1l1(int i, int i2) {
            }

            @Override // androidx.recyclerview.widget.bpdqqiQNVROMLC1ll1l1l11.dpbdbdpbLwkLpObyKsq1lll1
            public boolean dpbdbdpbLwkLpObyKsq1lll1(int i, int i2) {
            }

            @Override // androidx.recyclerview.widget.bpdqqiQNVROMLC1ll1l1l11.dpbdbdpbLwkLpObyKsq1lll1
            public int dpbdpqRKAscW1lll1l() {
            }
        }

        public dbpqdHhmDSIHIJiwc1ll1l1(ArrayList<DLNADevice> arrayList, gi<? super Integer, ? super DLNADevice, mv1> giVar) {
        }

        public static final /* synthetic */ FtnData dqpqqqbqQyjyB11111l1(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }

        public void dbppbdqpeLmcbs11l11(C2012dbpqdHhmDSIHIJiwc1ll1l1 c2012dbpqdHhmDSIHIJiwc1ll1l1, int i) {
        }

        public final ArrayList<DLNADevice> ddbbbeXHXx111ll() {
        }

        public final void ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(FtnData ftnData) {
        }

        public final gi<Integer, DLNADevice, mv1> dqpdbEevAufTOvPphbjykClll1l11() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public int getItemCount() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public /* bridge */ /* synthetic */ void onBindViewHolder(C2012dbpqdHhmDSIHIJiwc1ll1l1 c2012dbpqdHhmDSIHIJiwc1ll1l1, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public /* bridge */ /* synthetic */ C2012dbpqdHhmDSIHIJiwc1ll1l1 onCreateViewHolder(ViewGroup viewGroup, int i) {
        }

        public C2012dbpqdHhmDSIHIJiwc1ll1l1 pbppbpqbamJRy11l1l1(ViewGroup viewGroup, int i) {
        }

        public final void qbdpqpstJKhhKkXrsOGvbWw1l1llll(List<DLNADevice> list) {
        }
    }

    @Metadata
    static final class ddbbbeXHXx111ll extends v40 implements gi<Integer, DLNADevice, mv1> {
        final /* synthetic */ DLNASearchDialogFragment dpbdpqRKAscW1lll1l;

        ddbbbeXHXx111ll(DLNASearchDialogFragment dLNASearchDialogFragment) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(int i, DLNADevice dLNADevice) {
        }

        @Override // p000.gi
        public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(Integer num, DLNADevice dLNADevice) {
        }
    }

    @Metadata
    public static final class dpbdbdpbLwkLpObyKsq1lll1 {
        private dpbdbdpbLwkLpObyKsq1lll1() {
        }

        public /* synthetic */ dpbdbdpbLwkLpObyKsq1lll1(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public final DLNASearchDialogFragment dbpqdHhmDSIHIJiwc1ll1l1(FtnData ftnData) {
        }
    }

    @Metadata
    static final class dpbdpqRKAscW1lll1l extends v40 implements sh<View, mv1> {
        final /* synthetic */ DLNASearchDialogFragment dpbdpqRKAscW1lll1l;

        @xc0
        static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements qh<Object> {
            public static final dbpqdHhmDSIHIJiwc1ll1l1 dpbdpqRKAscW1lll1l = null;

            dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // p000.qh
            public final Object invoke() {
            }
        }

        dpbdpqRKAscW1lll1l(DLNASearchDialogFragment dLNASearchDialogFragment) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @Metadata
    static final class dqpqqqbqQyjyB11111l1 extends v40 implements sh<View, mv1> {
        final /* synthetic */ DLNASearchDialogFragment dpbdpqRKAscW1lll1l;

        dqpqqqbqQyjyB11111l1(DLNASearchDialogFragment dLNASearchDialogFragment) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @Metadata
    static final class dqqppqiKzJi1l1lll1l extends v40 implements sh<View, mv1> {
        final /* synthetic */ String bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ DLNASearchDialogFragment dpbdpqRKAscW1lll1l;

        @xc0
        static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements qh<Object> {
            public static final dbpqdHhmDSIHIJiwc1ll1l1 dpbdpqRKAscW1lll1l = null;

            dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // p000.qh
            public final Object invoke() {
            }
        }

        dqqppqiKzJi1l1lll1l(DLNASearchDialogFragment dLNASearchDialogFragment, String str) {
        }

        private static final void bpdqqiQNVROMLC1ll1l1l11(DLNASearchDialogFragment dLNASearchDialogFragment, String str, Activity activity, Uri uri) {
        }

        public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(DLNASearchDialogFragment dLNASearchDialogFragment, String str, Activity activity, Uri uri) {
        }

        public final void dqqppqiKzJi1l1lll1l(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @Metadata
    static final class ppbdpwWWljzmXXdHNabfWhgjl111l11 extends v40 implements sh<View, mv1> {
        final /* synthetic */ View bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ DLNASearchDialogFragment dpbdpqRKAscW1lll1l;

        @bqbpqpbdbJKmwXJCVFIIpXqwGcll1111(m0c = "com.magicmagnet.dlna.search.DLNASearchDialogFragment$initView$6$1", m1f = "DLNASearchDialogFragment.kt", m2l = {Opcodes.SUB_INT}, m3m = "invokeSuspend")
        @Metadata
        static final class dbpqdHhmDSIHIJiwc1ll1l1 extends bp1 implements gi<qqbqbpbFgzQbllll1ll, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super mv1>, Object> {
            final /* synthetic */ View dbppbdqpeLmcbs11l11;
            int ddbbbeXHXx111ll;
            final /* synthetic */ DLNASearchDialogFragment dqpdbEevAufTOvPphbjykClll1l11;

            @bqbpqpbdbJKmwXJCVFIIpXqwGcll1111(m0c = "com.magicmagnet.dlna.search.DLNASearchDialogFragment$initView$6$1$1", m1f = "DLNASearchDialogFragment.kt", m2l = {}, m3m = "invokeSuspend")
            @Metadata
            /* renamed from: com.magicmagnet.dlna.search.DLNASearchDialogFragment$ppbdpwWWljzmXXdHNabfWhgjl111l11$dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1, reason: collision with other inner class name */
            static final class C2014dbpqdHhmDSIHIJiwc1ll1l1 extends bp1 implements gi<qqbqbpbFgzQbllll1ll, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super mv1>, Object> {
                final /* synthetic */ Bitmap dbppbdqpeLmcbs11l11;
                int ddbbbeXHXx111ll;
                final /* synthetic */ View dqpdbEevAufTOvPphbjykClll1l11;

                C2014dbpqdHhmDSIHIJiwc1ll1l1(View view, Bitmap bitmap, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super C2014dbpqdHhmDSIHIJiwc1ll1l1> qpdqpbkgvdbreputwwyxml1ll1111l1) {
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

            dbpqdHhmDSIHIJiwc1ll1l1(DLNASearchDialogFragment dLNASearchDialogFragment, View view, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super dbpqdHhmDSIHIJiwc1ll1l1> qpdqpbkgvdbreputwwyxml1ll1111l1) {
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

        ppbdpwWWljzmXXdHNabfWhgjl111l11(DLNASearchDialogFragment dLNASearchDialogFragment, View view) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    public static final /* synthetic */ hq bbbddbppbHkZyStOxwRl1lll1(DLNASearchDialogFragment dLNASearchDialogFragment) {
    }

    private final String bbpqddpdpMWPNcLVjpAOBLtzBwll1l1() {
    }

    private final String bdpbpsDcyJTPrj1lll11(FtnData ftnData) {
    }

    private static final void bdpqbmWvwOSl1111(DLNASearchDialogFragment dLNASearchDialogFragment) {
    }

    private static final void bqpqdNBFMzNEiipaXQPl11l11ll(DLNASearchDialogFragment dLNASearchDialogFragment, DialogInterface dialogInterface, int i) {
    }

    public static /* synthetic */ void dqbbbarhSjFxjxEEl1ll11(DLNASearchDialogFragment dLNASearchDialogFragment) {
    }

    public static /* synthetic */ void dqbbdbpqbvChgeruisCbWCnl11lllll(DLNASearchDialogFragment dLNASearchDialogFragment, List list) {
    }

    private static final void pbpqqqqFBwYCJOfRsCpOLdMl11l11l11(DLNASearchDialogFragment dLNASearchDialogFragment, List list) {
    }

    public static final /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 pbqbdpDzmUH1l1ll(DLNASearchDialogFragment dLNASearchDialogFragment) {
    }

    private final boolean pbqddddDusqnIBFOMWnENLpll1111() {
    }

    public static final /* synthetic */ FtnData qbqddbqpnPHFHyPasib1l1ll11ll(DLNASearchDialogFragment dLNASearchDialogFragment) {
    }

    public static final /* synthetic */ String qpdpdszwYFiQbkll1ll(DLNASearchDialogFragment dLNASearchDialogFragment, FtnData ftnData) {
    }

    public static /* synthetic */ void qqqdbddwLHHSrqKnVcHujUhU1llll(DLNASearchDialogFragment dLNASearchDialogFragment, DialogInterface dialogInterface, int i) {
    }

    public void bqppbbbqLsCdM1llll() {
    }

    @Override // p000.iq
    public void dbpqdHhmDSIHIJiwc1ll1l1(String str) {
    }

    @Override // p000.iq
    public void dpbdbdpbLwkLpObyKsq1lll1(List<DLNADevice> list) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    public /* bridge */ /* synthetic */ hq dpbqpXiNmkuFJMoGemM1llll1ll1() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    @SuppressLint({"CheckResult"})
    protected void pbbbqppqTbuPhHQEDqbrOKDl11ll1(View view) {
    }

    protected hq pbqdbbLIoUwreKSxbxAll11ll() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected int pddpddbdIotonl1ll1l11() {
    }
}
