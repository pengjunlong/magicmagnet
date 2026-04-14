package com.magicmagnet.main.view;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.magicmagnet.common.base.BaseUActivity;
import com.magicmagnet.common.clipboard.LinkDetectViewModel;
import com.magicmagnet.data.bean.IData;
import com.magicmagnet.data.user.BaseResponse;
import com.magicmagnet.mserver.view.UserFragment;
import com.tencent.tinker.android.dx.instruction.Opcodes;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import org.greenrobot.eventbus.ThreadMode;
import p000.ae;
import p000.bbdpbdddpEHdQATMBKgTl1l11ll1;
import p000.bp1;
import p000.bqbpdpbpLcfFlhKGmaRfHCMl111l111l;
import p000.bqbpqpbdbJKmwXJCVFIIpXqwGcll1111;
import p000.ddpbbqdlcZCOAjblz11lllll;
import p000.eo1;
import p000.g80;
import p000.gi;
import p000.mv1;
import p000.pdqqdTXBHmTyaatKceTpTGOulll1ll1;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.qh;
import p000.qpdqpbkgVDbrePuTwWYxml1ll1111l1;
import p000.qqbqbpbFgzQbllll1ll;
import p000.s51;
import p000.sa0;
import p000.sh;
import p000.tp0;
import p000.up;
import p000.us;
import p000.ut;
import p000.uw1;
import p000.v40;
import p000.vc1;
import p000.vt;
import p000.w00;
import p000.xa1;
import p000.xc0;
import p000.xp;
import p000.xs0;
import p000.y40;
import p000.y62;
import p000.yj0;
import p000.z90;
import p000.zs;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class MainActivity extends BaseUActivity<us> implements zs, xp, vt {
    private static final String bpqbbqTOKdRXac1ll1l1lll = null;
    public static final dbpqdHhmDSIHIJiwc1ll1l1 bpqdqbqpviKiORjqgp1l111l11 = null;
    private static final String dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1 = null;
    private static final String ddddbbdqIccDnEitQc1l1l1l = null;
    private static boolean pdpqbmApOBCmNMwnn1ll111;
    private final y40 bbdbbpdOJSuInlll111l;
    private long bdddqmITkkeGpsxVXHR1l1llll;
    private Timer bpbbpOxqjGWQAsycX11ll1l1;
    private final y40 bppbpdbCeZVhQNTixBml1lll11l;
    private vc1 bpppdpppqFAXRSTHUAmVJLvH11lllll1l;
    private final y40 dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
    private final y40 dbbpdqqpdVUhpQ1ll11;
    private final y40 dbppbdqpeLmcbs11l11;
    public Map<Integer, View> dddbpbpNqzZZJmSG1111l;
    private final int ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private final y40 dqdqbpQposEBDyDxIyyz1ll11;
    private final y40 dqpdbEevAufTOvPphbjykClll1l11;
    private final y40 pbppbpqbamJRy11l1l1;
    private final y40 qbddqbdJBkudFfhX1ll1l111;
    private final int qbdpqpstJKhhKkXrsOGvbWw1l1llll;
    private final y40 qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;
    private xs0 qdqdpyALEmZFGGaahRTIU1ll11;
    private pdqqdTXBHmTyaatKceTpTGOulll1ll1 qppqdpppIauLKaAtRkB11111l;

    @Metadata
    static final class bbdbbpdOJSuInlll111l extends v40 implements qh<xa1> {
        final /* synthetic */ MainActivity dpbdpqRKAscW1lll1l;

        bbdbbpdOJSuInlll111l(MainActivity mainActivity) {
        }

        public final xa1 dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ xa1 invoke() {
        }
    }

    @xc0
    static final class bdddqmITkkeGpsxVXHR1l1llll extends v40 implements qh<Object> {
        public static final bdddqmITkkeGpsxVXHR1l1llll dpbdpqRKAscW1lll1l = null;

        bdddqmITkkeGpsxVXHR1l1llll() {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @Metadata
    static final class bpdqqiQNVROMLC1ll1l1l11 extends v40 implements sh<sa0, mv1> {
        public static final bpdqqiQNVROMLC1ll1l1l11 dpbdpqRKAscW1lll1l = null;

        bpdqqiQNVROMLC1ll1l1l11() {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(sa0 sa0Var) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(sa0 sa0Var) {
        }
    }

    @Metadata
    static final class bppbpdbCeZVhQNTixBml1lll11l extends v40 implements gi<DialogInterface, Integer, mv1> {
        final /* synthetic */ MainActivity dpbdpqRKAscW1lll1l;

        bppbpdbCeZVhQNTixBml1lll11l(MainActivity mainActivity) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(DialogInterface dialogInterface, int i) {
        }

        @Override // p000.gi
        public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(DialogInterface dialogInterface, Integer num) {
        }
    }

    @Metadata
    static final class bpppdpppqFAXRSTHUAmVJLvH11lllll1l extends v40 implements qh<UserFragment> {
        public static final bpppdpppqFAXRSTHUAmVJLvH11lllll1l dpbdpqRKAscW1lll1l = null;

        bpppdpppqFAXRSTHUAmVJLvH11lllll1l() {
        }

        public final UserFragment dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ UserFragment invoke() {
        }
    }

    @Metadata
    static final class dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 extends v40 implements gi<Exception, String, mv1> {
        final /* synthetic */ MainActivity dpbdpqRKAscW1lll1l;

        dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1(MainActivity mainActivity) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(Exception exc, String str) {
        }

        @Override // p000.gi
        public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(Exception exc, String str) {
        }
    }

    @Metadata
    static final class dbbpdqqpdVUhpQ1ll11 extends v40 implements qh<zs> {
        final /* synthetic */ MainActivity dpbdpqRKAscW1lll1l;

        dbbpdqqpdVUhpQ1ll11(MainActivity mainActivity) {
        }

        public final zs dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ zs invoke() {
        }
    }

    @Metadata
    static final class dbppbdqpeLmcbs11l11 extends v40 implements qh<mv1> {
        public static final dbppbdqpeLmcbs11l11 dpbdpqRKAscW1lll1l = null;

        dbppbdqpeLmcbs11l11() {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ mv1 invoke() {
        }
    }

    @Metadata
    public static final class dbpqdHhmDSIHIJiwc1ll1l1 {
        private dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(String str, Context context) {
        }
    }

    @Metadata
    static final class ddbbbeXHXx111ll extends v40 implements qh<g80> {
        final /* synthetic */ MainActivity dpbdpqRKAscW1lll1l;

        ddbbbeXHXx111ll(MainActivity mainActivity) {
        }

        public final g80 dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ g80 invoke() {
        }
    }

    @Metadata
    static final class ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll extends v40 implements gi<DialogInterface, Integer, mv1> {
        final /* synthetic */ File bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ MainActivity dpbdpqRKAscW1lll1l;

        ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(MainActivity mainActivity, File file) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(DialogInterface dialogInterface, int i) {
        }

        @Override // p000.gi
        public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(DialogInterface dialogInterface, Integer num) {
        }
    }

    @Metadata
    static final class dpbdbdpbLwkLpObyKsq1lll1 extends v40 implements qh<LinkDetectViewModel> {
        final /* synthetic */ MainActivity dpbdpqRKAscW1lll1l;

        dpbdbdpbLwkLpObyKsq1lll1(MainActivity mainActivity) {
        }

        public final LinkDetectViewModel dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ LinkDetectViewModel invoke() {
        }
    }

    @Metadata
    static final class dpbdpqRKAscW1lll1l extends v40 implements qh<ae> {
        public static final dpbdpqRKAscW1lll1l dpbdpqRKAscW1lll1l = null;

        dpbdpqRKAscW1lll1l() {
        }

        public final ae dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ ae invoke() {
        }
    }

    @Metadata
    static final class dqdqbpQposEBDyDxIyyz1ll11 extends v40 implements qh<ProgressDialog> {
        final /* synthetic */ MainActivity dpbdpqRKAscW1lll1l;

        dqdqbpQposEBDyDxIyyz1ll11(MainActivity mainActivity) {
        }

        public final ProgressDialog dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ ProgressDialog invoke() {
        }
    }

    @Metadata
    static final class dqpdbEevAufTOvPphbjykClll1l11 extends v40 implements qh<z90> {
        public static final dqpdbEevAufTOvPphbjykClll1l11 dpbdpqRKAscW1lll1l = null;

        dqpdbEevAufTOvPphbjykClll1l11() {
        }

        public final z90 dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ z90 invoke() {
        }
    }

    @Metadata
    static final class dqpqqqbqQyjyB11111l1 extends v40 implements qh<w00> {
        public static final dqpqqqbqQyjyB11111l1 dpbdpqRKAscW1lll1l = null;

        dqpqqqbqQyjyB11111l1() {
        }

        public final w00 dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ w00 invoke() {
        }
    }

    @Metadata
    static final class dqqppqiKzJi1l1lll1l extends v40 implements qh<bqbpdpbpLcfFlhKGmaRfHCMl111l111l> {
        public static final dqqppqiKzJi1l1lll1l dpbdpqRKAscW1lll1l = null;

        dqqppqiKzJi1l1lll1l() {
        }

        public final bqbpdpbpLcfFlhKGmaRfHCMl111l111l dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ bqbpdpbpLcfFlhKGmaRfHCMl111l111l invoke() {
        }
    }

    @xc0
    static final class pbppbpqbamJRy11l1l1 extends v40 implements qh<Object> {
        final /* synthetic */ int[] dpbdpqRKAscW1lll1l;

        pbppbpqbamJRy11l1l1(int[] iArr) {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @Metadata
    static final class ppbdpwWWljzmXXdHNabfWhgjl111l11 extends v40 implements sh<sa0, mv1> {
        final /* synthetic */ MainActivity dpbdpqRKAscW1lll1l;

        ppbdpwWWljzmXXdHNabfWhgjl111l11(MainActivity mainActivity) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(sa0 sa0Var) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(sa0 sa0Var) {
        }
    }

    @Metadata
    static final class qbddqbdJBkudFfhX1ll1l111 extends v40 implements qh<mv1> {
        final /* synthetic */ MainActivity dpbdpqRKAscW1lll1l;

        qbddqbdJBkudFfhX1ll1l111(MainActivity mainActivity) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ mv1 invoke() {
        }
    }

    @Metadata
    static final class qbdpqpstJKhhKkXrsOGvbWw1l1llll extends v40 implements gi<DialogInterface, Integer, mv1> {
        final /* synthetic */ File bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ MainActivity dpbdpqRKAscW1lll1l;

        qbdpqpstJKhhKkXrsOGvbWw1l1llll(MainActivity mainActivity, File file) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(DialogInterface dialogInterface, int i) {
        }

        @Override // p000.gi
        public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(DialogInterface dialogInterface, Integer num) {
        }
    }

    @Metadata
    public static final class qbdqqpbqpCWRpIKEKtzoceYOll1ll1l extends TimerTask {
        final /* synthetic */ MainActivity dpbdpqRKAscW1lll1l;

        @Metadata
        public static final class dbpqdHhmDSIHIJiwc1ll1l1 extends p000.qbdpqpstJKhhKkXrsOGvbWw1l1llll implements bbdpbdddpEHdQATMBKgTl1l11ll1 {
            final /* synthetic */ MainActivity bpdqqiQNVROMLC1ll1l1l11;

            public dbpqdHhmDSIHIJiwc1ll1l1(bbdpbdddpEHdQATMBKgTl1l11ll1.dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, MainActivity mainActivity) {
            }

            @Override // p000.bbdpbdddpEHdQATMBKgTl1l11ll1
            public void bpqbbqTOKdRXac1ll1l1lll(ddpbbqdlcZCOAjblz11lllll ddpbbqdlczcoajblz11lllll, Throwable th) {
            }
        }

        @bqbpqpbdbJKmwXJCVFIIpXqwGcll1111(m0c = "com.magicmagnet.main.view.MainActivity$updateTimer$1$run$1", m1f = "MainActivity.kt", m2l = {Opcodes.ADD_INT_LIT8, Opcodes.RSUB_INT_LIT8}, m3m = "invokeSuspend")
        @Metadata
        static final class dpbdbdpbLwkLpObyKsq1lll1 extends bp1 implements gi<qqbqbpbFgzQbllll1ll, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super mv1>, Object> {
            int ddbbbeXHXx111ll;
            final /* synthetic */ MainActivity dqpdbEevAufTOvPphbjykClll1l11;

            dpbdbdpbLwkLpObyKsq1lll1(MainActivity mainActivity, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super dpbdbdpbLwkLpObyKsq1lll1> qpdqpbkgvdbreputwwyxml1ll1111l1) {
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

        qbdqqpbqpCWRpIKEKtzoceYOll1ll1l(MainActivity mainActivity) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    private final us bbbbqbqdppWJqwUrzOvzCyynHqslll1l() {
    }

    public static /* synthetic */ void bbbddbppbHkZyStOxwRl1lll1(MainActivity mainActivity, String str) {
    }

    private final void bbbpbdqpbcaiJFLILHVgrofkL1l1l1l(File file, boolean z) {
    }

    public static /* synthetic */ void bbpqddpdpMWPNcLVjpAOBLtzBwll1l1(MainActivity mainActivity, tp0 tp0Var) {
    }

    private final UserFragment bbqpqppQWI1llllll1l() {
    }

    public static /* synthetic */ void bdpbpsDcyJTPrj1lll11(MainActivity mainActivity, Activity activity, Uri uri) {
    }

    public static /* synthetic */ void bdpqbmWvwOSl1111(MainActivity mainActivity, String str, View view) {
    }

    private final zs bdqddpbdHdAXdLWTdGIMpzClllll11() {
    }

    private final void bpbpqbqdpJnMXABHXnGl1ll11lll() {
    }

    private final void bpdbdpbdbSgOKZVkhOgPfvUtl11l1l11(Intent intent) {
    }

    private final LinkDetectViewModel bpdbpdqbSDCYKyFxRFDrXOojll111() {
    }

    private final void bpdddqdbdIHjDsl1ll1ll() {
    }

    private static final void bppqppdMchpThwHisjikcod1ll11(MainActivity mainActivity) {
    }

    private final void bqdbqqAlarZsSbAl1ll1l() {
    }

    private final Fragment bqdbqqpbqTPejjypqgplll1ll1l1() {
    }

    private final void bqpqpdRGoNS1ll1111l1() {
    }

    private final ut bqqqdboFHPLTwaMWMSXnDNNlll11l1() {
    }

    private static final void dbqpqqqDeeyyCuJnUmGLGcbvl11l11(MainActivity mainActivity, tp0 tp0Var) {
    }

    private final void dpddppbpssQkdaWsxnuFll1l1() {
    }

    private final ProgressDialog dpqqpqonhvzMuzONUGiUa111l11l11() {
    }

    private final void dqbqdqdpdDjmBPUzEkoOlll1l1llll() {
    }

    private final void dqdbdbddbsXTuiebVrav1l11111l1() {
    }

    private static final void dqqdbdpbqDDIkmksEKxFufZKgZ1l1l11lll(MainActivity mainActivity, String str) {
    }

    public static final /* synthetic */ Fragment pbpqqqqFBwYCJOfRsCpOLdMl11l11l11(MainActivity mainActivity) {
    }

    public static final /* synthetic */ String pbqdbbLIoUwreKSxbxAll11ll() {
    }

    public static final /* synthetic */ void pbqddddDusqnIBFOMWnENLpll1111(MainActivity mainActivity, File file, boolean z) {
    }

    private final void pddqdpdfpNEYjzViyCS111ll(Intent intent) {
    }

    private final void qbbpqRDtzbBqlll1l() {
    }

    private final Fragment qbbqppqqFyNGaQFr1l1l11() {
    }

    public static /* synthetic */ void qbqddbqpnPHFHyPasib1l1ll11ll(String str, String str2, MainActivity mainActivity, View view) {
    }

    private static final void qbqqdoZvfpl1l111ll(String str, String str2, MainActivity mainActivity, View view) {
    }

    private final void qdbbdhsmdYJSqeHT1111ll1l() {
    }

    private final w00 qdqddftZvRmltIahaEHKjU1l11ll1l1() {
    }

    private final void qpbdqjmuGiXlll1lll11() {
    }

    public static /* synthetic */ void qpdpdszwYFiQbkll1ll(MainActivity mainActivity) {
    }

    private static final void qqpbbbpElrBCTDfMihU11111(MainActivity mainActivity, Activity activity, Uri uri) {
    }

    private static final void qqqbbqRaDWEaifHrXcEBrw1ll1l1(MainActivity mainActivity, String str, View view) {
    }

    @Override // p000.vt
    public void bbdbbpdOJSuInlll111l(String str) {
    }

    @Override // p000.ot
    public void bdpqbqqdpVtpTLhDYl11ll1l(BaseResponse.Msg msg) {
    }

    protected us bdqqdqDqtua11l11l1() {
    }

    @Override // p000.ot
    public void bpppdpppqFAXRSTHUAmVJLvH11lllll1l(String str) {
    }

    @Override // p000.zs
    public void bpppqdQjfPiCT111111111(List<? extends IData> list) {
    }

    @Override // p000.zs
    public void bpqbdddbQzWMiIJFWdSJrGCER1l1l11ll(String str) {
    }

    public View bqpqdNBFMzNEiipaXQPl11l11ll(int i) {
    }

    @Override // p000.vt
    public void dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1(BaseResponse.Msg msg) {
    }

    @Override // p000.zs
    public void dbppbdqpeLmcbs11l11() {
    }

    @Override // p000.zs
    public String dddbpbpNqzZZJmSG1111l() {
    }

    @Override // p000.ot
    public void dddqbpqXicmakzZohTSxll11l(Throwable th) {
    }

    @Override // p000.zs
    public void ddpbddGpKmMvSPZaXEkLg11l11(List<? extends IData> list) {
    }

    @Override // com.magicmagnet.common.base.mvp.BaseActivity, p000.sp, p000.ds
    public void dpbdpqRKAscW1lll1l() {
    }

    @Override // com.magicmagnet.common.base.mvp.BaseActivity
    protected int dpbqpXiNmkuFJMoGemM1llll1ll1() {
    }

    @Override // com.magicmagnet.common.base.mvp.BaseActivity
    protected up[] dqbbdbpqbvChgeruisCbWCnl11lllll() {
    }

    @eo1(priority = 0, sticky = true, threadMode = ThreadMode.MAIN)
    public final void foundNewVersion(yj0 yj0Var) {
    }

    @Override // com.magicmagnet.common.base.mvp.BaseActivity, p000.sp, p000.ds
    public void loading() {
    }

    @Override // com.magicmagnet.common.base.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.magicmagnet.common.base.BaseUActivity, com.magicmagnet.common.base.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
    }

    @Override // com.magicmagnet.common.base.BaseUActivity, com.magicmagnet.common.base.mvp.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    @eo1(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onXLInitFinish(y62 y62Var) {
    }

    @Override // p000.zs
    public void pbdpdbqqdJtdUmQAgX1llll1() {
    }

    @Override // com.magicmagnet.common.base.mvp.BaseActivity
    public /* bridge */ /* synthetic */ up pbpqbdqbgDbTEaTebvZl111l1l1l() {
    }

    @Override // com.magicmagnet.common.base.BaseUActivity
    public boolean pbqbdpDzmUH1l1ll() {
    }

    public void pdpdqqdusMOjculBX1111l11(String str) {
    }

    @Override // p000.zs
    public void pdpppduUgcghSRP11l11l(String str) {
    }

    @Override // p000.zs
    public void qbdbqqdbJdTsszXtJeXGasJIiGllll1l(String str) {
    }

    @Override // p000.vt
    public void qbpbbZWTnlDkwOgZlllll(BaseResponse.Msg msg) {
    }

    public void qbqqdqdboCzbEGhywRrZi1lll1l1l(String str, String str2) {
    }

    @Override // com.magicmagnet.common.base.mvp.BaseActivity
    protected void qddqpzYVacW1llllll() {
    }

    @Override // com.magicmagnet.common.base.mvp.BaseActivity
    protected void qdpbqymSOslll11l() {
    }

    @Override // p000.vt
    public void qdqdpyALEmZFGGaahRTIU1ll11(BaseResponse.Msg msg) {
    }

    @Override // com.magicmagnet.common.base.mvp.BaseActivity
    protected void qpqqbbppqEgWHdoNWoll11l1l1l() {
    }

    @eo1
    public final void switchNightMode(uw1 uw1Var) {
    }

    @eo1(threadMode = ThreadMode.MAIN)
    public final void userInitFinish(s51 s51Var) {
    }
}
