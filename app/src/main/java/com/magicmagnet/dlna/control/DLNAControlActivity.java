package com.magicmagnet.dlna.control;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import com.magicmagnet.common.base.BaseUActivity;
import com.magicmagnet.data.bean.DLNADevice;
import com.magicmagnet.data.bean.FtnData;
import java.util.Map;
import kotlin.Metadata;
import p000.eo1;
import p000.fq;
import p000.gi;
import p000.gq;
import p000.mv1;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.qh;
import p000.rm1;
import p000.sh;
import p000.up;
import p000.v40;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class DLNAControlActivity extends BaseUActivity<fq> implements gq {
    private static final int bbdbbpdOJSuInlll111l = 0;
    private static final int dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 = 0;
    public static final dbpqdHhmDSIHIJiwc1ll1l1 qbddqbdJBkudFfhX1ll1l111 = null;
    private ServiceConnection bdddqmITkkeGpsxVXHR1l1llll;
    private boolean dbppbdqpeLmcbs11l11;
    private boolean ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    public Map<Integer, View> dqdqbpQposEBDyDxIyyz1ll11;
    private int dqpdbEevAufTOvPphbjykClll1l11;
    private boolean pbppbpqbamJRy11l1l1;
    private FtnData qbdpqpstJKhhKkXrsOGvbWw1l1llll;

    @Metadata
    static final class bpdqqiQNVROMLC1ll1l1l11 extends v40 implements sh<View, mv1> {
        final /* synthetic */ DLNAControlActivity dpbdpqRKAscW1lll1l;

        bpdqqiQNVROMLC1ll1l1l11(DLNAControlActivity dLNAControlActivity) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @Metadata
    static final class dbppbdqpeLmcbs11l11 extends v40 implements sh<Integer, mv1> {
        final /* synthetic */ DLNAControlActivity dpbdpqRKAscW1lll1l;

        dbppbdqpeLmcbs11l11(DLNAControlActivity dLNAControlActivity) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(int i) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(Integer num) {
        }
    }

    @Metadata
    public static final class dbpqdHhmDSIHIJiwc1ll1l1 {
        private dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public static /* synthetic */ void dpbdpqRKAscW1lll1l(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, Context context, FtnData ftnData, DLNADevice dLNADevice, int i, int i2, Object obj) {
        }

        public final Intent dbpqdHhmDSIHIJiwc1ll1l1(Context context, FtnData ftnData, DLNADevice dLNADevice, int i) {
        }

        public final int dpbdbdpbLwkLpObyKsq1lll1() {
        }

        public final void dqqppqiKzJi1l1lll1l(Context context, FtnData ftnData, DLNADevice dLNADevice, int i) {
        }
    }

    @Metadata
    static final class ddbbbeXHXx111ll extends v40 implements sh<View, mv1> {
        final /* synthetic */ DLNAControlActivity dpbdpqRKAscW1lll1l;

        ddbbbeXHXx111ll(DLNAControlActivity dLNAControlActivity) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @Metadata
    static final class ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll extends v40 implements gi<DialogInterface, Integer, mv1> {
        final /* synthetic */ DLNAControlActivity dpbdpqRKAscW1lll1l;

        ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(DLNAControlActivity dLNAControlActivity) {
        }

        private static final void bpdqqiQNVROMLC1ll1l1l11(DLNAControlActivity dLNAControlActivity, String str, Activity activity, Uri uri) {
        }

        public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(DLNAControlActivity dLNAControlActivity, String str, Activity activity, Uri uri) {
        }

        @Override // p000.gi
        public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(DialogInterface dialogInterface, Integer num) {
        }

        public final void dqqppqiKzJi1l1lll1l(DialogInterface dialogInterface, int i) {
        }
    }

    @Metadata
    static final class dpbdbdpbLwkLpObyKsq1lll1 extends v40 implements gi<DialogInterface, Integer, mv1> {
        final /* synthetic */ DLNAControlActivity dpbdpqRKAscW1lll1l;

        dpbdbdpbLwkLpObyKsq1lll1(DLNAControlActivity dLNAControlActivity) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(DialogInterface dialogInterface, int i) {
        }

        @Override // p000.gi
        public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(DialogInterface dialogInterface, Integer num) {
        }
    }

    @Metadata
    static final class dpbdpqRKAscW1lll1l extends v40 implements sh<View, mv1> {
        final /* synthetic */ DLNAControlActivity dpbdpqRKAscW1lll1l;

        dpbdpqRKAscW1lll1l(DLNAControlActivity dLNAControlActivity) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @Metadata
    static final class dqpdbEevAufTOvPphbjykClll1l11 extends v40 implements sh<View, mv1> {
        final /* synthetic */ DLNAControlActivity dpbdpqRKAscW1lll1l;

        dqpdbEevAufTOvPphbjykClll1l11(DLNAControlActivity dLNAControlActivity) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @Metadata
    public static final class dqpqqqbqQyjyB11111l1 implements SeekBar.OnSeekBarChangeListener {
        final /* synthetic */ DLNAControlActivity dpbdpqRKAscW1lll1l;

        dqpqqqbqQyjyB11111l1(DLNAControlActivity dLNAControlActivity) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    @Metadata
    static final class dqqppqiKzJi1l1lll1l extends v40 implements sh<View, mv1> {
        final /* synthetic */ DLNAControlActivity dpbdpqRKAscW1lll1l;

        dqqppqiKzJi1l1lll1l(DLNAControlActivity dLNAControlActivity) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @Metadata
    public static final class pbppbpqbamJRy11l1l1 implements ServiceConnection {
        final /* synthetic */ DLNADevice bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ DLNAControlActivity dpbdpqRKAscW1lll1l;

        @xc0
        static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements qh<Object> {
            public static final dbpqdHhmDSIHIJiwc1ll1l1 dpbdpqRKAscW1lll1l = null;

            dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // p000.qh
            public final Object invoke() {
            }
        }

        pbppbpqbamJRy11l1l1(DLNAControlActivity dLNAControlActivity, DLNADevice dLNADevice) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    @Metadata
    static final class ppbdpwWWljzmXXdHNabfWhgjl111l11 extends v40 implements sh<View, mv1> {
        final /* synthetic */ DLNAControlActivity dpbdpqRKAscW1lll1l;

        ppbdpwWWljzmXXdHNabfWhgjl111l11(DLNAControlActivity dLNAControlActivity) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    private static final void bbbbqbqdppWJqwUrzOvzCyynHqslll1l(DLNAControlActivity dLNAControlActivity, int i) {
    }

    public static /* synthetic */ void bbbddbppbHkZyStOxwRl1lll1(DLNAControlActivity dLNAControlActivity, int i) {
    }

    public static /* synthetic */ void bbpqddpdpMWPNcLVjpAOBLtzBwll1l1(DLNAControlActivity dLNAControlActivity) {
    }

    public static /* synthetic */ void bdpbpsDcyJTPrj1lll11(DLNAControlActivity dLNAControlActivity, View view) {
    }

    public static /* synthetic */ void bdpqbmWvwOSl1111(DLNAControlActivity dLNAControlActivity, boolean z) {
    }

    private final String bdqddpbdHdAXdLWTdGIMpzClllll11(int i) {
    }

    private static final void bpdbpdqbSDCYKyFxRFDrXOojll111(DLNAControlActivity dLNAControlActivity, View view) {
    }

    public static final /* synthetic */ int bqdbqqAlarZsSbAl1ll1l(DLNAControlActivity dLNAControlActivity) {
    }

    private static final void bqdbqqpbqTPejjypqgplll1ll1l1(DLNAControlActivity dLNAControlActivity, String str, Activity activity, Uri uri) {
    }

    public static /* synthetic */ void bqpqdNBFMzNEiipaXQPl11l11ll(DLNAControlActivity dLNAControlActivity, String str) {
    }

    public static final /* synthetic */ FtnData bqpqpdRGoNS1ll1111l1(DLNAControlActivity dLNAControlActivity) {
    }

    private final String bqqqdboFHPLTwaMWMSXnDNNlll11l1(int i) {
    }

    public static final /* synthetic */ int dpddppbpssQkdaWsxnuFll1l1() {
    }

    public static final /* synthetic */ boolean dqdbdbddbsXTuiebVrav1l11111l1(DLNAControlActivity dLNAControlActivity) {
    }

    public static final /* synthetic */ int pbpqqqqFBwYCJOfRsCpOLdMl11l11l11(DLNAControlActivity dLNAControlActivity, int i) {
    }

    public static final /* synthetic */ fq pbqddddDusqnIBFOMWnENLpll1111(DLNAControlActivity dLNAControlActivity) {
    }

    private final void pdpdqqdusMOjculBX1111l11() {
    }

    private static final void qbbqppqqFyNGaQFr1l1l11(DLNAControlActivity dLNAControlActivity, int i) {
    }

    public static /* synthetic */ void qbqddbqpnPHFHyPasib1l1ll11ll(DLNAControlActivity dLNAControlActivity, String str, Activity activity, Uri uri) {
    }

    private final int qbqqdoZvfpl1l111ll(int i) {
    }

    private static final void qbqqdqdboCzbEGhywRrZi1lll1l1l(DLNAControlActivity dLNAControlActivity, boolean z) {
    }

    public static final /* synthetic */ void qdbbdhsmdYJSqeHT1111ll1l(DLNAControlActivity dLNAControlActivity, boolean z) {
    }

    private static final void qdqddftZvRmltIahaEHKjU1l11ll1l1(DLNAControlActivity dLNAControlActivity) {
    }

    public static /* synthetic */ void qpdpdszwYFiQbkll1ll(DLNAControlActivity dLNAControlActivity, int i) {
    }

    public static final /* synthetic */ void qqpbbbpElrBCTDfMihU11111(DLNAControlActivity dLNAControlActivity, boolean z) {
    }

    private static final void qqqbbqRaDWEaifHrXcEBrw1ll1l1(DLNAControlActivity dLNAControlActivity, String str) {
    }

    @Override // p000.gq
    public void dbdpqdqbxaVJPXHgWAxfdYMEQF1111l(int i) {
    }

    @Override // com.magicmagnet.common.base.mvp.BaseActivity
    protected int dpbqpXiNmkuFJMoGemM1llll1ll1() {
    }

    protected fq dpqqpqonhvzMuzONUGiUa111l11l11() {
    }

    @Override // com.magicmagnet.common.base.mvp.BaseActivity
    protected up[] dqbbdbpqbvChgeruisCbWCnl11lllll() {
    }

    @Override // com.magicmagnet.common.base.BaseUActivity, com.magicmagnet.common.base.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
    }

    @Override // com.magicmagnet.common.base.BaseUActivity, com.magicmagnet.common.base.mvp.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
    }

    @Override // com.magicmagnet.common.base.mvp.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
    }

    @Override // com.magicmagnet.common.base.mvp.BaseActivity
    public /* bridge */ /* synthetic */ up pbpqbdqbgDbTEaTebvZl111l1l1l() {
    }

    public View pbqdbbLIoUwreKSxbxAll11ll(int i) {
    }

    @Override // p000.gq
    public void pdqdddDNpMbeVT11ll11(String str) {
    }

    @Override // p000.gq
    public void qbdqqpbqpCWRpIKEKtzoceYOll1ll1l() {
    }

    @Override // p000.gq
    public void qddbbpxsbNjqxvn111ll(int i) {
    }

    @Override // com.magicmagnet.common.base.mvp.BaseActivity
    protected void qdpbqymSOslll11l() {
    }

    @Override // com.magicmagnet.common.base.mvp.BaseActivity
    protected void qpqqbbppqEgWHdoNWoll11l1l1l() {
    }

    @Override // p000.gq
    public void qqqpbbqdUOEcdwaGGHQOKYwGi1l1l1l1l1(boolean z) {
    }

    @eo1
    public final void stopDLNA(rm1 rm1Var) {
    }
}
