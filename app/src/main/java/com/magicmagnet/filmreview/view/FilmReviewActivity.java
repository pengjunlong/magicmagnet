package com.magicmagnet.filmreview.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.magicmagnet.common.base.BaseUActivity;
import com.magicmagnet.data.bean.IData;
import com.magicmagnet.data.bean.newxlbanner.IFilmReviewComment;
import com.magicmagnet.data.bean.newxlbanner.IMediaInfo;
import com.magicmagnet.data.bean.newxlbanner.IParsedFilmReview;
import de.hdodenhof.circleimageview.CircleImageView;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p000.er;
import p000.hr;
import p000.js;
import p000.ks;
import p000.mv1;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.qh;
import p000.sh;
import p000.up;
import p000.v40;
import p000.wf;
import p000.y40;
import p000.yd;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class FilmReviewActivity extends BaseUActivity<js> implements ks, er {
    public static final dqqppqiKzJi1l1lll1l bdddqmITkkeGpsxVXHR1l1llll = null;
    private static final int dqdqbpQposEBDyDxIyyz1ll11 = 0;
    private static final int qbddqbdJBkudFfhX1ll1l111 = 0;
    private IData dbppbdqpeLmcbs11l11;
    private dbpqdHhmDSIHIJiwc1ll1l1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private IParsedFilmReview dqpdbEevAufTOvPphbjykClll1l11;
    private final y40 pbppbpqbamJRy11l1l1;
    public Map<Integer, View> qbdpqpstJKhhKkXrsOGvbWw1l1llll;

    @Metadata
    static final class bpdqqiQNVROMLC1ll1l1l11 extends v40 implements qh<yd> {
        final /* synthetic */ FilmReviewActivity dpbdpqRKAscW1lll1l;

        bpdqqiQNVROMLC1ll1l1l11(FilmReviewActivity filmReviewActivity) {
        }

        public final yd dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ yd invoke() {
        }
    }

    @Metadata
    public static final class dbppbdqpeLmcbs11l11 extends com.zhy.view.flowlayout.dbpqdHhmDSIHIJiwc1ll1l1<String> {
        final /* synthetic */ FilmReviewActivity dpbdpqRKAscW1lll1l;

        dbppbdqpeLmcbs11l11(FilmReviewActivity filmReviewActivity, List<String> list) {
        }

        @Override // com.zhy.view.flowlayout.dbpqdHhmDSIHIJiwc1ll1l1
        public /* bridge */ /* synthetic */ View dpbdpqRKAscW1lll1l(wf wfVar, int i, String str) {
        }

        public View dqpqqqbqQyjyB11111l1(wf wfVar, int i, String str) {
        }
    }

    @Metadata
    private static final class dbpqdHhmDSIHIJiwc1ll1l1 extends RecyclerView.ddbbbeXHXx111ll<dpbdbdpbLwkLpObyKsq1lll1> {
        private List<? extends IFilmReviewComment> dbpqdHhmDSIHIJiwc1ll1l1;

        public dbpqdHhmDSIHIJiwc1ll1l1(List<? extends IFilmReviewComment> list) {
        }

        public dpbdbdpbLwkLpObyKsq1lll1 ddbbbeXHXx111ll(ViewGroup viewGroup, int i) {
        }

        public final void dqpdbEevAufTOvPphbjykClll1l11(List<? extends IFilmReviewComment> list) {
        }

        public void dqpqqqbqQyjyB11111l1(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public int getItemCount() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public /* bridge */ /* synthetic */ void onBindViewHolder(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public /* bridge */ /* synthetic */ dpbdbdpbLwkLpObyKsq1lll1 onCreateViewHolder(ViewGroup viewGroup, int i) {
        }
    }

    @Metadata
    public static final class ddbbbeXHXx111ll extends WebChromeClient {
        final /* synthetic */ FilmReviewActivity dbpqdHhmDSIHIJiwc1ll1l1;

        ddbbbeXHXx111ll(FilmReviewActivity filmReviewActivity) {
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        }
    }

    @Metadata
    private static final class dpbdbdpbLwkLpObyKsq1lll1 extends RecyclerView.bpqbbqTOKdRXac1ll1l1lll {
        private final CircleImageView dbpqdHhmDSIHIJiwc1ll1l1;
        private final TextView dpbdbdpbLwkLpObyKsq1lll1;
        private final TextView dpbdpqRKAscW1lll1l;
        private final TextView dqqppqiKzJi1l1lll1l;

        public dpbdbdpbLwkLpObyKsq1lll1(View view) {
        }

        public final CircleImageView dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public final TextView dpbdbdpbLwkLpObyKsq1lll1() {
        }

        public final TextView dpbdpqRKAscW1lll1l() {
        }

        public final TextView dqqppqiKzJi1l1lll1l() {
        }
    }

    @Metadata
    public final class dpbdpqRKAscW1lll1l {
        final /* synthetic */ FilmReviewActivity dbpqdHhmDSIHIJiwc1ll1l1;

        public dpbdpqRKAscW1lll1l(FilmReviewActivity filmReviewActivity) {
        }

        @JavascriptInterface
        public final void image(String str) {
        }

        @JavascriptInterface
        public final void onReady() {
        }

        @JavascriptInterface
        public final void play(String str) {
        }

        @JavascriptInterface
        public final void search(String str) {
        }
    }

    @Metadata
    static final class dqpdbEevAufTOvPphbjykClll1l11 extends v40 implements sh<View, mv1> {
        final /* synthetic */ IParsedFilmReview bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ FilmReviewActivity dpbdpqRKAscW1lll1l;

        dqpdbEevAufTOvPphbjykClll1l11(FilmReviewActivity filmReviewActivity, IParsedFilmReview iParsedFilmReview) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @Metadata
    static final class dqpqqqbqQyjyB11111l1 extends v40 implements sh<View, mv1> {
        final /* synthetic */ FilmReviewActivity dpbdpqRKAscW1lll1l;

        dqpqqqbqQyjyB11111l1(FilmReviewActivity filmReviewActivity) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @Metadata
    public static final class dqqppqiKzJi1l1lll1l {
        private dqqppqiKzJi1l1lll1l() {
        }

        public /* synthetic */ dqqppqiKzJi1l1lll1l(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public final int dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public final int dpbdbdpbLwkLpObyKsq1lll1() {
        }

        public final void dqqppqiKzJi1l1lll1l(Context context, IData iData, int i) {
        }
    }

    @Metadata
    static final class pbppbpqbamJRy11l1l1 extends v40 implements sh<View, mv1> {
        final /* synthetic */ IMediaInfo bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ FilmReviewActivity dpbdpqRKAscW1lll1l;

        pbppbpqbamJRy11l1l1(FilmReviewActivity filmReviewActivity, IMediaInfo iMediaInfo) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @Metadata
    static final class ppbdpwWWljzmXXdHNabfWhgjl111l11 extends v40 implements sh<View, mv1> {
        final /* synthetic */ FilmReviewActivity dpbdpqRKAscW1lll1l;

        ppbdpwWWljzmXXdHNabfWhgjl111l11(FilmReviewActivity filmReviewActivity) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    public static final /* synthetic */ void bbbddbppbHkZyStOxwRl1lll1(FilmReviewActivity filmReviewActivity) {
    }

    public static final /* synthetic */ js bbpqddpdpMWPNcLVjpAOBLtzBwll1l1(FilmReviewActivity filmReviewActivity) {
    }

    public static final /* synthetic */ void bdpbpsDcyJTPrj1lll11(FilmReviewActivity filmReviewActivity, View view) {
    }

    public static final /* synthetic */ IData bdpqbmWvwOSl1111(FilmReviewActivity filmReviewActivity) {
    }

    private final hr bqdbqqAlarZsSbAl1ll1l() {
    }

    public static final /* synthetic */ IParsedFilmReview bqpqdNBFMzNEiipaXQPl11l11ll(FilmReviewActivity filmReviewActivity) {
    }

    @SuppressLint({"InlinedApi"})
    private final void dpddppbpssQkdaWsxnuFll1l1(boolean z) {
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private final void dqdbdbddbsXTuiebVrav1l11111l1() {
    }

    private final void fullscreen(View view) {
    }

    public static final /* synthetic */ int pbpqqqqFBwYCJOfRsCpOLdMl11l11l11() {
    }

    public static final /* synthetic */ int pbqdbbLIoUwreKSxbxAll11ll() {
    }

    private final void pbqddddDusqnIBFOMWnENLpll1111() {
    }

    private final void pddpddbdIotonl1ll1l11() {
    }

    public static /* synthetic */ boolean qbqddbqpnPHFHyPasib1l1ll11ll(FilmReviewActivity filmReviewActivity, dbppbdqpeLmcbs11l11 dbppbdqpelmcbs11l11, View view, int i, wf wfVar) {
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private final void qdbbdhsmdYJSqeHT1111ll1l() {
    }

    private static final boolean qqpbbbpElrBCTDfMihU11111(FilmReviewActivity filmReviewActivity, dbppbdqpeLmcbs11l11 dbppbdqpelmcbs11l11, View view, int i, wf wfVar) {
    }

    @Override // p000.ks
    @SuppressLint({"SetTextI18n"})
    public void bpqpbicsQtfVpOtr11l1l(IMediaInfo iMediaInfo) {
    }

    @Override // p000.ks
    public void bqpqpbCjWyZxLLtQbYeCDl1l11(List<? extends IFilmReviewComment> list) {
    }

    protected js bqpqpdRGoNS1ll1111l1() {
    }

    @Override // p000.er
    public void bqqqqKuUKQfBoZwqWsGJYYlll111(String str) {
    }

    @Override // p000.ks
    public void dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1() {
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

    @Override // com.magicmagnet.common.base.mvp.BaseActivity, p000.sp, p000.ds
    public void loading() {
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

    @Override // com.magicmagnet.common.base.BaseUActivity, com.magicmagnet.common.base.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
    }

    @Override // com.magicmagnet.common.base.BaseUActivity, com.magicmagnet.common.base.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
    }

    @Override // com.magicmagnet.common.base.BaseUActivity, com.magicmagnet.common.base.mvp.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
    }

    @Override // com.magicmagnet.common.base.BaseUActivity, com.magicmagnet.common.base.mvp.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
    }

    @Override // com.magicmagnet.common.base.mvp.BaseActivity
    public /* bridge */ /* synthetic */ up pbpqbdqbgDbTEaTebvZl111l1l1l() {
    }

    @Override // p000.ks
    public void ppdqqzXJzQiU11ll11(IParsedFilmReview iParsedFilmReview) {
    }

    @Override // com.magicmagnet.common.base.mvp.BaseActivity
    protected void qddqpzYVacW1llllll() {
    }

    @Override // com.magicmagnet.common.base.mvp.BaseActivity
    protected void qdpbqymSOslll11l() {
    }

    public View qpdpdszwYFiQbkll1ll(int i) {
    }

    @Override // com.magicmagnet.common.base.mvp.BaseActivity
    @SuppressLint({"SetJavaScriptEnabled"})
    protected void qpqqbbppqEgWHdoNWoll11l1l1l() {
    }
}
