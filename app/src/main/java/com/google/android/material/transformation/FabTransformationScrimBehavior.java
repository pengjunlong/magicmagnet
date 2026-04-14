package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.MotionTiming;
import java.util.List;

@Deprecated
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    public static final long COLLAPSE_DELAY = 0;
    public static final long COLLAPSE_DURATION = 150;
    public static final long EXPAND_DELAY = 75;
    public static final long EXPAND_DURATION = 150;
    private final MotionTiming collapseTiming;
    private final MotionTiming expandTiming;

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$1 */
    class C05051 extends AnimatorListenerAdapter {
        final /* synthetic */ FabTransformationScrimBehavior this$0;
        final /* synthetic */ View val$child;
        final /* synthetic */ boolean val$expanded;

        C05051(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z, View view) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public FabTransformationScrimBehavior() {
    }

    private void createScrimAnimation(View view, boolean z, boolean z2, List<Animator> list, List<Animator.AnimatorListener> list2) {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected AnimatorSet onCreateExpandedStateChangeAnimation(View view, View view2, boolean z, boolean z2) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
    }
}
