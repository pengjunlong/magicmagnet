package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.MotionTiming;
import com.google.android.material.animation.Positioning;
import com.google.android.material.circularreveal.CircularRevealWidget;
import java.util.List;

@Deprecated
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    private float dependencyOriginalTranslationX;
    private float dependencyOriginalTranslationY;
    private final int[] tmpArray;
    private final Rect tmpRect;
    private final RectF tmpRectF1;
    private final RectF tmpRectF2;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$1 */
    class C05011 extends AnimatorListenerAdapter {
        final /* synthetic */ FabTransformationBehavior this$0;
        final /* synthetic */ View val$child;
        final /* synthetic */ View val$dependency;
        final /* synthetic */ boolean val$expanded;

        C05011(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$2 */
    class C05022 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ FabTransformationBehavior this$0;
        final /* synthetic */ View val$child;

        C05022(FabTransformationBehavior fabTransformationBehavior, View view) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$3 */
    class C05033 extends AnimatorListenerAdapter {
        final /* synthetic */ FabTransformationBehavior this$0;
        final /* synthetic */ CircularRevealWidget val$circularRevealChild;
        final /* synthetic */ Drawable val$icon;

        C05033(FabTransformationBehavior fabTransformationBehavior, CircularRevealWidget circularRevealWidget, Drawable drawable) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$4 */
    class C05044 extends AnimatorListenerAdapter {
        final /* synthetic */ FabTransformationBehavior this$0;
        final /* synthetic */ CircularRevealWidget val$circularRevealChild;

        C05044(FabTransformationBehavior fabTransformationBehavior, CircularRevealWidget circularRevealWidget) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    protected static class FabTransformationSpec {
        public Positioning positioning;
        public MotionSpec timings;

        protected FabTransformationSpec() {
        }
    }

    public FabTransformationBehavior() {
    }

    private ViewGroup calculateChildContentContainer(View view) {
    }

    private void calculateChildVisibleBoundsAtEndOfExpansion(View view, FabTransformationSpec fabTransformationSpec, MotionTiming motionTiming, MotionTiming motionTiming2, float f, float f2, float f3, float f4, RectF rectF) {
    }

    private void calculateDependencyWindowBounds(View view, RectF rectF) {
    }

    private Pair<MotionTiming, MotionTiming> calculateMotionTiming(float f, float f2, boolean z, FabTransformationSpec fabTransformationSpec) {
    }

    private float calculateRevealCenterX(View view, View view2, Positioning positioning) {
    }

    private float calculateRevealCenterY(View view, View view2, Positioning positioning) {
    }

    private float calculateTranslationX(View view, View view2, Positioning positioning) {
    }

    private float calculateTranslationY(View view, View view2, Positioning positioning) {
    }

    private float calculateValueOfAnimationAtEndOfExpansion(FabTransformationSpec fabTransformationSpec, MotionTiming motionTiming, float f, float f2) {
    }

    private void calculateWindowBounds(View view, RectF rectF) {
    }

    private void createChildrenFadeAnimation(View view, View view2, boolean z, boolean z2, FabTransformationSpec fabTransformationSpec, List<Animator> list, List<Animator.AnimatorListener> list2) {
    }

    private void createColorAnimation(View view, View view2, boolean z, boolean z2, FabTransformationSpec fabTransformationSpec, List<Animator> list, List<Animator.AnimatorListener> list2) {
    }

    private void createDependencyTranslationAnimation(View view, View view2, boolean z, FabTransformationSpec fabTransformationSpec, List<Animator> list) {
    }

    @TargetApi(21)
    private void createElevationAnimation(View view, View view2, boolean z, boolean z2, FabTransformationSpec fabTransformationSpec, List<Animator> list, List<Animator.AnimatorListener> list2) {
    }

    private void createExpansionAnimation(View view, View view2, boolean z, boolean z2, FabTransformationSpec fabTransformationSpec, float f, float f2, List<Animator> list, List<Animator.AnimatorListener> list2) {
    }

    private void createIconFadeAnimation(View view, View view2, boolean z, boolean z2, FabTransformationSpec fabTransformationSpec, List<Animator> list, List<Animator.AnimatorListener> list2) {
    }

    private void createPostFillRadialExpansion(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
    }

    private void createPreFillRadialExpansion(View view, long j, int i, int i2, float f, List<Animator> list) {
    }

    private void createTranslationAnimation(View view, View view2, boolean z, boolean z2, FabTransformationSpec fabTransformationSpec, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
    }

    private int getBackgroundTint(View view) {
    }

    private ViewGroup toViewGroupOrNull(View view) {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public void onAttachedToLayoutParams(CoordinatorLayout.ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11) {
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected AnimatorSet onCreateExpandedStateChangeAnimation(View view, View view2, boolean z, boolean z2) {
    }

    protected abstract FabTransformationSpec onCreateMotionSpec(Context context, boolean z);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
    }
}
