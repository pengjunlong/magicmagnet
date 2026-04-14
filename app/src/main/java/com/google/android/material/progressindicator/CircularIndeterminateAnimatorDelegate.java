package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.dpbdbdpbLwkLpObyKsq1lll1;
import p000.lb;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class CircularIndeterminateAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {
    private static final Property<CircularIndeterminateAnimatorDelegate, Float> ANIMATION_FRACTION = null;
    private static final Property<CircularIndeterminateAnimatorDelegate, Float> COMPLETE_END_FRACTION = null;
    private static final int CONSTANT_ROTATION_DEGREES = 1520;
    private static final int[] DELAY_TO_COLLAPSE_IN_MS = null;
    private static final int[] DELAY_TO_EXPAND_IN_MS = null;
    private static final int[] DELAY_TO_FADE_IN_MS = null;
    private static final int DURATION_TO_COLLAPSE_IN_MS = 667;
    private static final int DURATION_TO_COMPLETE_END_IN_MS = 333;
    private static final int DURATION_TO_EXPAND_IN_MS = 667;
    private static final int DURATION_TO_FADE_IN_MS = 333;
    private static final int EXTRA_DEGREES_PER_CYCLE = 250;
    private static final int TAIL_DEGREES_OFFSET = -20;
    private static final int TOTAL_CYCLES = 4;
    private static final int TOTAL_DURATION_IN_MS = 5400;
    private float animationFraction;
    private ObjectAnimator animator;
    dpbdbdpbLwkLpObyKsq1lll1 animatorCompleteCallback;
    private final BaseProgressIndicatorSpec baseSpec;
    private ObjectAnimator completeEndAnimator;
    private float completeEndFraction;
    private int indicatorColorIndexOffset;
    private final lb interpolator;

    /* renamed from: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$1 */
    class C04051 extends AnimatorListenerAdapter {
        final /* synthetic */ CircularIndeterminateAnimatorDelegate this$0;

        C04051(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$2 */
    class C04062 extends AnimatorListenerAdapter {
        final /* synthetic */ CircularIndeterminateAnimatorDelegate this$0;

        C04062(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$3 */
    class C04073 extends Property<CircularIndeterminateAnimatorDelegate, Float> {
        C04073(Class cls, String str) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ Float get(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, Float f) {
        }

        /* renamed from: get, reason: avoid collision after fix types in other method */
        public Float get2(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
        }

        /* renamed from: set, reason: avoid collision after fix types in other method */
        public void set2(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, Float f) {
        }
    }

    /* renamed from: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$4 */
    class C04084 extends Property<CircularIndeterminateAnimatorDelegate, Float> {
        C04084(Class cls, String str) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ Float get(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, Float f) {
        }

        /* renamed from: get, reason: avoid collision after fix types in other method */
        public Float get2(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
        }

        /* renamed from: set, reason: avoid collision after fix types in other method */
        public void set2(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, Float f) {
        }
    }

    public CircularIndeterminateAnimatorDelegate(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
    }

    static /* synthetic */ int access$000(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
    }

    static /* synthetic */ int access$002(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, int i) {
    }

    static /* synthetic */ BaseProgressIndicatorSpec access$100(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
    }

    static /* synthetic */ float access$200(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
    }

    static /* synthetic */ float access$300(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
    }

    static /* synthetic */ void access$400(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, float f) {
    }

    private float getAnimationFraction() {
    }

    private float getCompleteEndFraction() {
    }

    private void maybeInitializeAnimators() {
    }

    private void maybeUpdateSegmentColors(int i) {
    }

    private void setCompleteEndFraction(float f) {
    }

    private void updateSegmentPositions(int i) {
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    void cancelAnimatorImmediately() {
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void invalidateSpecValues() {
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void registerAnimatorsCompleteCallback(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    void requestCancelAnimatorAfterCurrentCycle() {
    }

    void resetPropertiesForNewStart() {
    }

    void setAnimationFraction(float f) {
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    void startAnimator() {
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void unregisterAnimatorsCompleteCallback() {
    }
}
