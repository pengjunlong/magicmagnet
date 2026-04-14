package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.LinkedHashSet;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.dqqppqiKzJi1l1lll1l<V> {
    private static final int DEFAULT_ENTER_ANIMATION_DURATION_MS = 225;
    private static final int DEFAULT_EXIT_ANIMATION_DURATION_MS = 175;
    private static final int ENTER_ANIM_DURATION_ATTR = 0;
    private static final int ENTER_EXIT_ANIM_EASING_ATTR = 0;
    private static final int EXIT_ANIM_DURATION_ATTR = 0;
    public static final int STATE_SCROLLED_DOWN = 1;
    public static final int STATE_SCROLLED_UP = 2;
    private int additionalHiddenOffsetY;
    private ViewPropertyAnimator currentAnimator;

    @ScrollState
    private int currentState;
    private int enterAnimDuration;
    private TimeInterpolator enterAnimInterpolator;
    private int exitAnimDuration;
    private TimeInterpolator exitAnimInterpolator;
    private int height;
    private final LinkedHashSet<OnScrollStateChangedListener> onScrollStateChangedListeners;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$1 */
    class C02681 extends AnimatorListenerAdapter {
        final /* synthetic */ HideBottomViewOnScrollBehavior this$0;

        C02681(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    public interface OnScrollStateChangedListener {
        void onStateChanged(View view, @ScrollState int i);
    }

    public @interface ScrollState {
    }

    public HideBottomViewOnScrollBehavior() {
    }

    static /* synthetic */ ViewPropertyAnimator access$002(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior, ViewPropertyAnimator viewPropertyAnimator) {
    }

    private void animateChildTo(V v, int i, long j, TimeInterpolator timeInterpolator) {
    }

    private void updateCurrentState(V v, @ScrollState int i) {
    }

    public void addOnScrollStateChangedListener(OnScrollStateChangedListener onScrollStateChangedListener) {
    }

    public void clearOnScrollStateChangedListeners() {
    }

    public boolean isScrolledDown() {
    }

    public boolean isScrolledUp() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
    }

    public void removeOnScrollStateChangedListener(OnScrollStateChangedListener onScrollStateChangedListener) {
    }

    public void setAdditionalHiddenOffsetY(V v, int i) {
    }

    public void slideDown(V v) {
    }

    public void slideUp(V v) {
    }

    public void slideDown(V v, boolean z) {
    }

    public void slideUp(V v, boolean z) {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
