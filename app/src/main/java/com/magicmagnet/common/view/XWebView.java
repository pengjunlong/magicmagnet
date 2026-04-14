package com.magicmagnet.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import com.magicmagnet.common.view.IScrollable;
import java.util.Map;
import kotlin.Metadata;
import p000.mv1;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.sh;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class XWebView extends WebView implements IScrollable {
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

    public XWebView(Context context) {
    }

    public void _$_clearFindViewByIdCache() {
    }

    public View _$_findCachedViewById(int i) {
    }

    public final IScrollable.IScrollListener getOnScrollListener() {
    }

    public final sh<Boolean, mv1> getOnScrollToTopListener() {
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

    public XWebView(Context context, AttributeSet attributeSet) {
    }

    public XWebView(Context context, AttributeSet attributeSet, int i) {
    }
}
