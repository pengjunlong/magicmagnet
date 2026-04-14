package com.magicmagnet.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.magicmagnet.common.view.IScrollable;
import java.util.Map;
import kotlin.Metadata;
import org.adblockplus.libadblockplus.android.webview.AdblockWebView;
import p000.mv1;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.qh;
import p000.sh;
import p000.v40;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class XAdBlockWebView extends AdblockWebView implements IScrollable {
    public static final dbpqdHhmDSIHIJiwc1ll1l1 Companion = null;
    public Map<Integer, View> _$_findViewCache;
    private IScrollable.IScrollListener onScrollListener;
    private sh<? super Boolean, mv1> onScrollToTopListener;

    @Metadata
    public static final class dbpqdHhmDSIHIJiwc1ll1l1 {
        private dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public static final /* synthetic */ Context dbpqdHhmDSIHIJiwc1ll1l1(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, Context context) {
        }

        private final Context dpbdbdpbLwkLpObyKsq1lll1(Context context) {
        }
    }

    @xc0
    static final class dpbdbdpbLwkLpObyKsq1lll1 extends v40 implements qh<Object> {
        public static final dpbdbdpbLwkLpObyKsq1lll1 dpbdpqRKAscW1lll1l = null;

        dpbdbdpbLwkLpObyKsq1lll1() {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @xc0
    static final class dqqppqiKzJi1l1lll1l extends v40 implements qh<Object> {
        public static final dqqppqiKzJi1l1lll1l dpbdpqRKAscW1lll1l = null;

        dqqppqiKzJi1l1lll1l() {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    public XAdBlockWebView(Context context) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(XAdBlockWebView xAdBlockWebView) {
    }

    /* renamed from: dispose$lambda-0, reason: not valid java name */
    private static final void m878dispose$lambda0(XAdBlockWebView xAdBlockWebView) {
    }

    public void _$_clearFindViewByIdCache() {
    }

    public View _$_findCachedViewById(int i) {
    }

    public final void dispose() {
    }

    public final IScrollable.IScrollListener getOnScrollListener() {
    }

    public final sh<Boolean, mv1> getOnScrollToTopListener() {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
    }

    @Override // com.magicmagnet.common.view.IScrollable
    public void setListener(IScrollable.IScrollListener iScrollListener) {
    }

    public final void setOnScrollListener(IScrollable.IScrollListener iScrollListener) {
    }

    public final void setOnScrollToTopListener(sh<? super Boolean, mv1> shVar) {
    }

    @Override // com.magicmagnet.common.view.IScrollable
    public void unsetListener() {
    }

    public XAdBlockWebView(Context context, AttributeSet attributeSet) {
    }

    public XAdBlockWebView(Context context, AttributeSet attributeSet, int i) {
    }
}
