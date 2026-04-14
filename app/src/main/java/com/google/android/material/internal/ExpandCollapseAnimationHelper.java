package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class ExpandCollapseAnimationHelper {
    private ValueAnimator.AnimatorUpdateListener additionalUpdateListener;
    private final View collapsedView;
    private int collapsedViewOffsetY;
    private long duration;
    private final List<View> endAnchoredViews;
    private final View expandedView;
    private int expandedViewOffsetY;
    private final List<AnimatorListenerAdapter> listeners;

    /* renamed from: com.google.android.material.internal.ExpandCollapseAnimationHelper$1 */
    class C03731 extends AnimatorListenerAdapter {
        final /* synthetic */ ExpandCollapseAnimationHelper this$0;

        C03731(ExpandCollapseAnimationHelper expandCollapseAnimationHelper) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.internal.ExpandCollapseAnimationHelper$2 */
    class C03742 extends AnimatorListenerAdapter {
        final /* synthetic */ ExpandCollapseAnimationHelper this$0;

        C03742(ExpandCollapseAnimationHelper expandCollapseAnimationHelper) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    public ExpandCollapseAnimationHelper(View view, View view2) {
    }

    static /* synthetic */ View access$000(ExpandCollapseAnimationHelper expandCollapseAnimationHelper) {
    }

    private void addListeners(Animator animator, List<AnimatorListenerAdapter> list) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(ExpandCollapseAnimationHelper expandCollapseAnimationHelper, Rect rect, ValueAnimator valueAnimator) {
    }

    private AnimatorSet getAnimatorSet(boolean z) {
    }

    private Animator getEndAnchoredViewsTranslateAnimator(boolean z) {
    }

    private Animator getExpandCollapseAnimator(boolean z) {
    }

    private Animator getExpandedViewChildrenAlphaAnimator(boolean z) {
    }

    private /* synthetic */ void lambda$getExpandCollapseAnimator$0(Rect rect, ValueAnimator valueAnimator) {
    }

    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper addEndAnchoredViews(View... viewArr) {
    }

    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper addListener(AnimatorListenerAdapter animatorListenerAdapter) {
    }

    public Animator getCollapseAnimator() {
    }

    public Animator getExpandAnimator() {
    }

    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper setAdditionalUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
    }

    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper setCollapsedViewOffsetY(int i) {
    }

    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper setDuration(long j) {
    }

    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper setExpandedViewOffsetY(int i) {
    }

    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper addEndAnchoredViews(Collection<View> collection) {
    }
}
