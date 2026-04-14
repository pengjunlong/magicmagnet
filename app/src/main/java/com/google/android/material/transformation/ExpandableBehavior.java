package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.expandable.ExpandableWidget;

@Deprecated
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.dqqppqiKzJi1l1lll1l<View> {
    private static final int STATE_COLLAPSED = 2;
    private static final int STATE_EXPANDED = 1;
    private static final int STATE_UNINITIALIZED = 0;
    private int currentState;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$1 */
    class ViewTreeObserverOnPreDrawListenerC04991 implements ViewTreeObserver.OnPreDrawListener {
        final /* synthetic */ ExpandableBehavior this$0;
        final /* synthetic */ View val$child;
        final /* synthetic */ ExpandableWidget val$dep;
        final /* synthetic */ int val$expectedState;

        ViewTreeObserverOnPreDrawListenerC04991(ExpandableBehavior expandableBehavior, View view, int i, ExpandableWidget expandableWidget) {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
        }
    }

    public ExpandableBehavior() {
    }

    static /* synthetic */ int access$000(ExpandableBehavior expandableBehavior) {
    }

    private boolean didStateChange(boolean z) {
    }

    public static <T extends ExpandableBehavior> T from(View view, Class<T> cls) {
    }

    protected ExpandableWidget findExpandableWidget(CoordinatorLayout coordinatorLayout, View view) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    protected abstract boolean onExpandedStateChange(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
