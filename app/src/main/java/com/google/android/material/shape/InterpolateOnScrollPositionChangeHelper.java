package com.google.android.material.shape;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class InterpolateOnScrollPositionChangeHelper {
    private final int[] containerLocation;
    private ScrollView containingScrollView;
    private MaterialShapeDrawable materialShapeDrawable;
    private final ViewTreeObserver.OnScrollChangedListener scrollChangedListener;
    private final int[] scrollLocation;
    private View shapedView;

    /* renamed from: com.google.android.material.shape.InterpolateOnScrollPositionChangeHelper$1 */
    class ViewTreeObserverOnScrollChangedListenerC04361 implements ViewTreeObserver.OnScrollChangedListener {
        final /* synthetic */ InterpolateOnScrollPositionChangeHelper this$0;

        ViewTreeObserverOnScrollChangedListenerC04361(InterpolateOnScrollPositionChangeHelper interpolateOnScrollPositionChangeHelper) {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
        }
    }

    public InterpolateOnScrollPositionChangeHelper(View view, MaterialShapeDrawable materialShapeDrawable, ScrollView scrollView) {
    }

    public void setContainingScrollView(ScrollView scrollView) {
    }

    public void setMaterialShapeDrawable(MaterialShapeDrawable materialShapeDrawable) {
    }

    public void startListeningForScrollChanges(ViewTreeObserver viewTreeObserver) {
    }

    public void stopListeningForScrollChanges(ViewTreeObserver viewTreeObserver) {
    }

    public void updateInterpolationForScreenPosition() {
    }
}
