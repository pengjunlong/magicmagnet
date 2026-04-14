package com.magicmagnet.search.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.magicmagnet.common.view.IScrollable;
import com.magicmagnet.data.db.Bookmark;
import com.tencent.tinker.android.dx.instruction.Opcodes;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import p000.bp1;
import p000.bqbpqpbdbJKmwXJCVFIIpXqwGcll1111;
import p000.gi;
import p000.jp;
import p000.kp;
import p000.mv1;
import p000.pbpqppprkRIgKPllll1l111;
import p000.pdpppduUgcghSRP11l11l;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.qh;
import p000.qpdqpbkgVDbrePuTwWYxml1ll1111l1;
import p000.qqbqbpbFgzQbllll1ll;
import p000.qqqqdpdZawTcmNbkDCA11ll11l1;
import p000.v40;
import p000.xc0;
import p000.y40;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class WebViewFragment extends qqqqdpdZawTcmNbkDCA11ll11l1<jp> implements pbpqppprkRIgKPllll1l111, kp {
    private static final String bpbbpOxqjGWQAsycX11ll1l1 = null;
    private static final int bpqbbqTOKdRXac1ll1l1lll = 0;
    private static final String bpqdqbqpviKiORjqgp1l111l11 = null;
    private static final String dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1 = null;
    private static final String dddbpbpNqzZZJmSG1111l = null;
    private static final String ddddbbdqIccDnEitQc1l1l1l = null;
    private static final int pdpqbmApOBCmNMwnn1ll111 = 0;
    public static final dbpqdHhmDSIHIJiwc1ll1l1 qppqdpppIauLKaAtRkB11111l = null;
    private boolean bbdbbpdOJSuInlll111l;
    private final y40 bdddqmITkkeGpsxVXHR1l1llll;
    private final y40 bppbpdbCeZVhQNTixBml1lll11l;
    private final IScrollable.IScrollListener bpppdpppqFAXRSTHUAmVJLvH11lllll1l;
    private qh<mv1> dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
    private final y40 dbbpdqqpdVUhpQ1ll11;
    private WebView dbppbdqpeLmcbs11l11;
    private boolean ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private final HashMap<String, String> dqdqbpQposEBDyDxIyyz1ll11;
    private SwipeRefreshLayout pbppbpqbamJRy11l1l1;
    private boolean qbddqbdJBkudFfhX1ll1l111;
    private String qbdpqpstJKhhKkXrsOGvbWw1l1llll;
    private boolean qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;
    public Map<Integer, View> qdqdpyALEmZFGGaahRTIU1ll11;

    @Metadata
    static final class dbppbdqpeLmcbs11l11 extends v40 implements qh<String> {
        public static final dbppbdqpeLmcbs11l11 dpbdpqRKAscW1lll1l = null;

        dbppbdqpeLmcbs11l11() {
        }

        public final String dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ String invoke() {
        }
    }

    @Metadata
    public static final class dbpqdHhmDSIHIJiwc1ll1l1 {
        private dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public static /* synthetic */ WebViewFragment bpdqqiQNVROMLC1ll1l1l11(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, String str, int i, boolean z, int i2, Object obj) {
        }

        public static /* synthetic */ WebViewFragment dqpqqqbqQyjyB11111l1(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, String str, byte[] bArr, int i, int i2, Object obj) {
        }

        public static /* synthetic */ WebViewFragment ppbdpwWWljzmXXdHNabfWhgjl111l11(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, String str, String str2, int i, int i2, Object obj) {
        }

        public final String dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public final WebViewFragment dpbdbdpbLwkLpObyKsq1lll1(String str, int i, boolean z) {
        }

        public final WebViewFragment dpbdpqRKAscW1lll1l(String str, byte[] bArr, int i) {
        }

        public final WebViewFragment dqqppqiKzJi1l1lll1l(String str, String str2, int i) {
        }
    }

    @xc0
    static final class ddbbbeXHXx111ll extends v40 implements qh<Object> {
        public static final ddbbbeXHXx111ll dpbdpqRKAscW1lll1l = null;

        ddbbbeXHXx111ll() {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @xc0
    static final class ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll extends v40 implements qh<Object> {
        final /* synthetic */ boolean dpbdpqRKAscW1lll1l;

        ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(boolean z) {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @Metadata
    public final class dpbdbdpbLwkLpObyKsq1lll1 {
        final /* synthetic */ WebViewFragment dbpqdHhmDSIHIJiwc1ll1l1;

        @Metadata
        static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements qh<mv1> {
            final /* synthetic */ WebViewFragment dpbdpqRKAscW1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(WebViewFragment webViewFragment) {
            }

            private static final void bpdqqiQNVROMLC1ll1l1l11(WebViewFragment webViewFragment, View view) {
            }

            public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(WebViewFragment webViewFragment, View view) {
            }

            public final void dqqppqiKzJi1l1lll1l() {
            }

            @Override // p000.qh
            public /* bridge */ /* synthetic */ mv1 invoke() {
            }
        }

        public dpbdbdpbLwkLpObyKsq1lll1(WebViewFragment webViewFragment) {
        }

        @JavascriptInterface
        public final void processHTML(String str, boolean z) {
        }
    }

    @Metadata
    public static final class dpbdpqRKAscW1lll1l<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
        }
    }

    @bqbpqpbdbJKmwXJCVFIIpXqwGcll1111(m0c = "com.magicmagnet.search.view.WebViewFragment$loadUrl$2", m1f = "WebViewFragment.kt", m2l = {Opcodes.OR_LONG}, m3m = "invokeSuspend")
    @Metadata
    static final class dqpdbEevAufTOvPphbjykClll1l11 extends bp1 implements gi<qqbqbpbFgzQbllll1ll, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super mv1>, Object> {
        int ddbbbeXHXx111ll;
        final /* synthetic */ WebViewFragment dqpdbEevAufTOvPphbjykClll1l11;

        dqpdbEevAufTOvPphbjykClll1l11(WebViewFragment webViewFragment, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super dqpdbEevAufTOvPphbjykClll1l11> qpdqpbkgvdbreputwwyxml1ll1111l1) {
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
    static final class dqpqqqbqQyjyB11111l1 extends v40 implements qh<mv1> {
        final /* synthetic */ WebViewFragment dpbdpqRKAscW1lll1l;

        dqpqqqbqQyjyB11111l1(WebViewFragment webViewFragment) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ mv1 invoke() {
        }
    }

    @Metadata
    static final class dqqppqiKzJi1l1lll1l extends v40 implements qh<String> {
        public static final dqqppqiKzJi1l1lll1l dpbdpqRKAscW1lll1l = null;

        dqqppqiKzJi1l1lll1l() {
        }

        public final String dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ String invoke() {
        }
    }

    @Metadata
    static final class pbppbpqbamJRy11l1l1 extends v40 implements qh<pdpppduUgcghSRP11l11l> {
        final /* synthetic */ WebViewFragment dpbdpqRKAscW1lll1l;

        pbppbpqbamJRy11l1l1(WebViewFragment webViewFragment) {
        }

        public final pdpppduUgcghSRP11l11l dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ pdpppduUgcghSRP11l11l invoke() {
        }
    }

    @Metadata
    public static final class ppbdpwWWljzmXXdHNabfWhgjl111l11 extends WebChromeClient {
        final /* synthetic */ WebViewFragment dbpqdHhmDSIHIJiwc1ll1l1;

        ppbdpwWWljzmXXdHNabfWhgjl111l11(WebViewFragment webViewFragment) {
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        }
    }

    @Metadata
    static final class qbdpqpstJKhhKkXrsOGvbWw1l1llll extends v40 implements qh<mv1> {
        final /* synthetic */ WebViewFragment dpbdpqRKAscW1lll1l;

        @xc0
        static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements qh<Object> {
            final /* synthetic */ WebViewFragment dpbdpqRKAscW1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(WebViewFragment webViewFragment) {
            }

            @Override // p000.qh
            public final Object invoke() {
            }
        }

        qbdpqpstJKhhKkXrsOGvbWw1l1llll(WebViewFragment webViewFragment) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ mv1 invoke() {
        }
    }

    public static /* synthetic */ void bbbddbppbHkZyStOxwRl1lll1(WebViewFragment webViewFragment, View view) {
    }

    private final jp bbbpbdqpbcaiJFLILHVgrofkL1l1l1l() {
    }

    public static /* synthetic */ void bbpqddpdpMWPNcLVjpAOBLtzBwll1l1(WebViewFragment webViewFragment, View view) {
    }

    private static final void bbqpqppQWI1llllll1l(WebViewFragment webViewFragment, Boolean bool) {
    }

    private final void bdbddpbwjddaHll1l1(String str) {
    }

    public static /* synthetic */ void bdpbpsDcyJTPrj1lll11(WebViewFragment webViewFragment) {
    }

    private static final void bdqddpbdHdAXdLWTdGIMpzClllll11(WebViewFragment webViewFragment, DialogInterface dialogInterface, int i) {
    }

    private final void bdqqdqDqtua11l11l1() {
    }

    private static final void bpbpqbqdpJnMXABHXnGl1ll11lll(WebViewFragment webViewFragment) {
    }

    public static final /* synthetic */ void bpdbpdqbSDCYKyFxRFDrXOojll111(WebViewFragment webViewFragment) {
    }

    private final String bpdddqdbdIHjDsl1ll1ll() {
    }

    private static final void bppqpqdImdXYlgl111l11l(WebViewFragment webViewFragment, View view) {
    }

    public static final /* synthetic */ String bqdbqqAlarZsSbAl1ll1l() {
    }

    public static final /* synthetic */ void bqdbqqpbqTPejjypqgplll1ll1l1(WebViewFragment webViewFragment, qh qhVar) {
    }

    public static /* synthetic */ void bqppbbbqLsCdM1llll(DialogInterface dialogInterface, int i) {
    }

    public static final /* synthetic */ void bqpqdNBFMzNEiipaXQPl11l11ll(WebViewFragment webViewFragment, boolean z) {
    }

    public static final /* synthetic */ View bqpqpdRGoNS1ll1111l1(WebViewFragment webViewFragment) {
    }

    public static final /* synthetic */ void bqqqdboFHPLTwaMWMSXnDNNlll11l1(WebViewFragment webViewFragment, int i) {
    }

    private static final void ddbppbpdbjhGMwFHhQLuACGxTll1ll11l(WebViewFragment webViewFragment) {
    }

    public static final /* synthetic */ boolean dpddppbpssQkdaWsxnuFll1l1(WebViewFragment webViewFragment) {
    }

    public static /* synthetic */ void dqbbbarhSjFxjxEEl1ll11(WebViewFragment webViewFragment, View view) {
    }

    public static /* synthetic */ void dqbbdbpqbvChgeruisCbWCnl11lllll(WebViewFragment webViewFragment, DialogInterface dialogInterface, int i) {
    }

    private static final void dqbqdqdpdDjmBPUzEkoOlll1l1llll(DialogInterface dialogInterface, int i) {
    }

    public static final /* synthetic */ String dqdbdbddbsXTuiebVrav1l11111l1(WebViewFragment webViewFragment) {
    }

    private final void dqqdbdpbqDDIkmksEKxFufZKgZ1l1l11lll() {
    }

    private static final void pbdqqlSueJKUgejs11lllll1l(WebViewFragment webViewFragment, View view) {
    }

    private final void pbpbbdbDgqWVllll11l() {
    }

    public static final /* synthetic */ String pbpqqqqFBwYCJOfRsCpOLdMl11l11l11() {
    }

    public static /* synthetic */ void pbqbdpDzmUH1l1ll(WebViewFragment webViewFragment, Boolean bool) {
    }

    public static final /* synthetic */ void pbqdbbLIoUwreKSxbxAll11ll(WebViewFragment webViewFragment) {
    }

    public static final /* synthetic */ String pbqddddDusqnIBFOMWnENLpll1111() {
    }

    private static final void pdddbdppbXDXrwiTFfril111ll1(WebViewFragment webViewFragment, View view) {
    }

    public static final /* synthetic */ WebView pdpdqqdusMOjculBX1111l11(WebViewFragment webViewFragment) {
    }

    private static final void pqdpbdbMIFQJSTVxZl11ll111l(WebViewFragment webViewFragment, View view) {
    }

    private final void qbbpqRDtzbBqlll1l(boolean z) {
    }

    public static /* synthetic */ void qbqddbqpnPHFHyPasib1l1ll11ll(WebViewFragment webViewFragment, View view) {
    }

    public static final /* synthetic */ int qbqqdoZvfpl1l111ll() {
    }

    public static final /* synthetic */ int qbqqdqdboCzbEGhywRrZi1lll1l1l() {
    }

    public static final /* synthetic */ HashMap qdbbdhsmdYJSqeHT1111ll1l(WebViewFragment webViewFragment) {
    }

    private final void qdpqqddfnOtUxPENkGSNa1111ll1l1() {
    }

    public static final /* synthetic */ void qdqddftZvRmltIahaEHKjU1l11ll1l1(WebViewFragment webViewFragment, String str) {
    }

    private static final void qpbbdddeJUjFZrllll11ll(WebViewFragment webViewFragment, View view) {
    }

    private final String qpbdqjmuGiXlll1lll11() {
    }

    public static /* synthetic */ void qpdpdszwYFiQbkll1ll(WebViewFragment webViewFragment, View view) {
    }

    private final void qqbqbpsKECLkNpMSYTJWTcuk11l11(int i) {
    }

    public static final /* synthetic */ qh qqpbbbpElrBCTDfMihU11111(WebViewFragment webViewFragment) {
    }

    public static final /* synthetic */ void qqqbbqRaDWEaifHrXcEBrw1ll1l1(WebViewFragment webViewFragment) {
    }

    public static /* synthetic */ void qqqdbddwLHHSrqKnVcHujUhU1llll(WebViewFragment webViewFragment) {
    }

    public final void bbbbqbqdppWJqwUrzOvzCyynHqslll1l() {
    }

    public final void bbpbppdbyWAgVaIRmPOgsLl1ll1111l() {
    }

    public void bdpqbmWvwOSl1111() {
    }

    public final String bpdbdpbdbSgOKZVkhOgPfvUtl11l1l11() {
    }

    public final byte[] bppqppdMchpThwHisjikcod1ll11() {
    }

    @Override // p000.rp
    public void dbpqdHhmDSIHIJiwc1ll1l1(String str) {
    }

    public final void dbqpqqqDeeyyCuJnUmGLGcbvl11l11() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    public /* bridge */ /* synthetic */ jp dpbqpXiNmkuFJMoGemM1llll1ll1() {
    }

    public final boolean dpqqpqonhvzMuzONUGiUa111l11l11() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    @SuppressLint({"AddJavascriptInterface"})
    protected void dqbpbqXLoKDkRdCKHlKfl11llll1l() {
    }

    @Override // p000.pbpqppprkRIgKPllll1l111
    public boolean dqpdbEevAufTOvPphbjykClll1l11() {
    }

    @Override // p000.kp
    public void dqqpbqaYiRPLeqRCYteXfDW1l111l11l(Bookmark bookmark) {
    }

    protected jp dqqpdbqqRQNrLXyCEsRll1111l() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1, androidx.fragment.app.Fragment
    public void onDestroy() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1, androidx.fragment.app.Fragment
    public void onDetach() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1, androidx.fragment.app.Fragment
    public void onResume() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    @SuppressLint({"SetJavaScriptEnabled"})
    protected void pbbbqppqTbuPhHQEDqbrOKDl11ll1(View view) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected int pddpddbdIotonl1ll1l11() {
    }

    public final String pddqdpdfpNEYjzViyCS111ll() {
    }

    public final void pdqpdddqVdiDmDB1ll1ll(boolean z) {
    }

    public final void qbbqppqqFyNGaQFr1l1l11(boolean z) {
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
    }

    @Metadata
    public static final class bpdqqiQNVROMLC1ll1l1l11 extends WebViewClient {
        final /* synthetic */ WebViewFragment dbpqdHhmDSIHIJiwc1ll1l1;

        @xc0
        static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements qh<Object> {
            final /* synthetic */ String dpbdpqRKAscW1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(String str) {
            }

            @Override // p000.qh
            public final Object invoke() {
            }
        }

        @xc0
        static final class dpbdbdpbLwkLpObyKsq1lll1 extends v40 implements qh<Object> {
            final /* synthetic */ String dpbdpqRKAscW1lll1l;

            dpbdbdpbLwkLpObyKsq1lll1(String str) {
            }

            @Override // p000.qh
            public final Object invoke() {
            }
        }

        bpdqqiQNVROMLC1ll1l1l11(WebViewFragment webViewFragment) {
        }

        public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(WebViewFragment webViewFragment, String str, View view) {
        }

        private static final void dpbdbdpbLwkLpObyKsq1lll1(WebViewFragment webViewFragment, String str, View view) {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        }
    }
}
