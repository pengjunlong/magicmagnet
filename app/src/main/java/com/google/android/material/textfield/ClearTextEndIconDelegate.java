package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class ClearTextEndIconDelegate extends EndIconDelegate {
    private static final float ANIMATION_SCALE_FROM_VALUE = 0.8f;
    private static final int DEFAULT_ANIMATION_FADE_DURATION = 100;
    private static final int DEFAULT_ANIMATION_SCALE_DURATION = 150;
    private final int animationFadeDuration;
    private final TimeInterpolator animationFadeInterpolator;
    private final int animationScaleDuration;
    private final TimeInterpolator animationScaleInterpolator;
    private EditText editText;
    private AnimatorSet iconInAnim;
    private ValueAnimator iconOutAnim;
    private final View.OnFocusChangeListener onFocusChangeListener;
    private final View.OnClickListener onIconClickListener;

    /* renamed from: com.google.android.material.textfield.ClearTextEndIconDelegate$1 */
    class C04651 extends AnimatorListenerAdapter {
        final /* synthetic */ ClearTextEndIconDelegate this$0;

        C04651(ClearTextEndIconDelegate clearTextEndIconDelegate) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.textfield.ClearTextEndIconDelegate$2 */
    class C04662 extends AnimatorListenerAdapter {
        final /* synthetic */ ClearTextEndIconDelegate this$0;

        C04662(ClearTextEndIconDelegate clearTextEndIconDelegate) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    ClearTextEndIconDelegate(EndCompoundLayout endCompoundLayout) {
    }

    private void animateIcon(boolean z) {
    }

    public static /* synthetic */ void bpdqqiQNVROMLC1ll1l1l11(ClearTextEndIconDelegate clearTextEndIconDelegate) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(ClearTextEndIconDelegate clearTextEndIconDelegate, ValueAnimator valueAnimator) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(ClearTextEndIconDelegate clearTextEndIconDelegate, View view) {
    }

    public static /* synthetic */ void dpbdpqRKAscW1lll1l(ClearTextEndIconDelegate clearTextEndIconDelegate, View view, boolean z) {
    }

    public static /* synthetic */ void dqqppqiKzJi1l1lll1l(ClearTextEndIconDelegate clearTextEndIconDelegate, ValueAnimator valueAnimator) {
    }

    private ValueAnimator getAlphaAnimator(float... fArr) {
    }

    private ValueAnimator getScaleAnimator() {
    }

    private void initAnimators() {
    }

    private /* synthetic */ void lambda$getAlphaAnimator$3(ValueAnimator valueAnimator) {
    }

    private /* synthetic */ void lambda$getScaleAnimator$4(ValueAnimator valueAnimator) {
    }

    private /* synthetic */ void lambda$new$0(View view) {
    }

    private /* synthetic */ void lambda$new$1(View view, boolean z) {
    }

    private /* synthetic */ void lambda$tearDown$2() {
    }

    private boolean shouldBeVisible() {
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void afterEditTextChanged(Editable editable) {
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    int getIconContentDescriptionResId() {
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    int getIconDrawableResId() {
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    View.OnClickListener getOnIconClickListener() {
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    View.OnFocusChangeListener getOnIconViewFocusChangeListener() {
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onEditTextAttached(EditText editText) {
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void onSuffixVisibilityChanged(boolean z) {
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void setUp() {
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void tearDown() {
    }
}
