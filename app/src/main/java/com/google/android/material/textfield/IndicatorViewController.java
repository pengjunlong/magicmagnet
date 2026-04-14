package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class IndicatorViewController {
    private static final int CAPTION_STATE_ERROR = 1;
    private static final int CAPTION_STATE_HELPER_TEXT = 2;
    private static final int CAPTION_STATE_NONE = 0;
    static final int COUNTER_INDEX = 2;
    private static final int DEFAULT_CAPTION_FADE_ANIMATION_DURATION = 167;
    private static final int DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION = 217;
    static final int ERROR_INDEX = 0;
    static final int HELPER_INDEX = 1;
    private Animator captionAnimator;
    private FrameLayout captionArea;
    private int captionDisplayed;
    private final int captionFadeInAnimationDuration;
    private final TimeInterpolator captionFadeInAnimationInterpolator;
    private final int captionFadeOutAnimationDuration;
    private final TimeInterpolator captionFadeOutAnimationInterpolator;
    private int captionToShow;
    private final int captionTranslationYAnimationDuration;
    private final TimeInterpolator captionTranslationYAnimationInterpolator;
    private final float captionTranslationYPx;
    private final Context context;
    private boolean errorEnabled;
    private CharSequence errorText;
    private int errorTextAppearance;
    private TextView errorView;
    private int errorViewAccessibilityLiveRegion;
    private CharSequence errorViewContentDescription;
    private ColorStateList errorViewTextColor;
    private CharSequence helperText;
    private boolean helperTextEnabled;
    private int helperTextTextAppearance;
    private TextView helperTextView;
    private ColorStateList helperTextViewTextColor;
    private LinearLayout indicatorArea;
    private int indicatorsAdded;
    private final TextInputLayout textInputView;
    private Typeface typeface;

    /* renamed from: com.google.android.material.textfield.IndicatorViewController$1 */
    class C04721 extends AnimatorListenerAdapter {
        final /* synthetic */ IndicatorViewController this$0;
        final /* synthetic */ int val$captionToHide;
        final /* synthetic */ int val$captionToShow;
        final /* synthetic */ TextView val$captionViewToHide;
        final /* synthetic */ TextView val$captionViewToShow;

        C04721(IndicatorViewController indicatorViewController, int i, TextView textView, int i2, TextView textView2) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.textfield.IndicatorViewController$2 */
    class C04732 extends View.AccessibilityDelegate {
        final /* synthetic */ IndicatorViewController this$0;

        C04732(IndicatorViewController indicatorViewController) {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        }
    }

    public IndicatorViewController(TextInputLayout textInputLayout) {
    }

    static /* synthetic */ int access$002(IndicatorViewController indicatorViewController, int i) {
    }

    static /* synthetic */ Animator access$102(IndicatorViewController indicatorViewController, Animator animator) {
    }

    static /* synthetic */ TextView access$200(IndicatorViewController indicatorViewController) {
    }

    static /* synthetic */ TextInputLayout access$300(IndicatorViewController indicatorViewController) {
    }

    private boolean canAdjustIndicatorPadding() {
    }

    private void createCaptionAnimators(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
    }

    private ObjectAnimator createCaptionOpacityAnimator(TextView textView, boolean z) {
    }

    private ObjectAnimator createCaptionTranslationYAnimator(TextView textView) {
    }

    private TextView getCaptionViewFromDisplayState(int i) {
    }

    private int getIndicatorPadding(boolean z, int i, int i2) {
    }

    private boolean isCaptionStateError(int i) {
    }

    private boolean isCaptionStateHelperText(int i) {
    }

    private void setCaptionViewVisibilities(int i, int i2) {
    }

    private void setTextViewTypeface(TextView textView, Typeface typeface) {
    }

    private void setViewGroupGoneIfEmpty(ViewGroup viewGroup, int i) {
    }

    private boolean shouldAnimateCaptionView(TextView textView, CharSequence charSequence) {
    }

    private void updateCaptionViewsVisibility(int i, int i2, boolean z) {
    }

    void addIndicator(TextView textView, int i) {
    }

    void adjustIndicatorPadding() {
    }

    void cancelCaptionAnimator() {
    }

    boolean errorIsDisplayed() {
    }

    boolean errorShouldBeShown() {
    }

    int getErrorAccessibilityLiveRegion() {
    }

    CharSequence getErrorContentDescription() {
    }

    CharSequence getErrorText() {
    }

    int getErrorViewCurrentTextColor() {
    }

    ColorStateList getErrorViewTextColors() {
    }

    CharSequence getHelperText() {
    }

    View getHelperTextView() {
    }

    ColorStateList getHelperTextViewColors() {
    }

    int getHelperTextViewCurrentTextColor() {
    }

    boolean helperTextIsDisplayed() {
    }

    boolean helperTextShouldBeShown() {
    }

    void hideError() {
    }

    void hideHelperText() {
    }

    boolean isCaptionView(int i) {
    }

    boolean isErrorEnabled() {
    }

    boolean isHelperTextEnabled() {
    }

    void removeIndicator(TextView textView, int i) {
    }

    void setErrorAccessibilityLiveRegion(int i) {
    }

    void setErrorContentDescription(CharSequence charSequence) {
    }

    void setErrorEnabled(boolean z) {
    }

    void setErrorTextAppearance(int i) {
    }

    void setErrorViewTextColor(ColorStateList colorStateList) {
    }

    void setHelperTextAppearance(int i) {
    }

    void setHelperTextEnabled(boolean z) {
    }

    void setHelperTextViewTextColor(ColorStateList colorStateList) {
    }

    void setTypefaces(Typeface typeface) {
    }

    void showError(CharSequence charSequence) {
    }

    void showHelper(CharSequence charSequence) {
    }
}
