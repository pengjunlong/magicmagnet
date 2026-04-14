package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import androidx.core.view.accessibility.dpbdbdpbLwkLpObyKsq1lll1;
import p000.dqqpbqaYiRPLeqRCYteXfDW1l111l11l;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class DropdownMenuEndIconDelegate extends EndIconDelegate {
    private static final int DEFAULT_ANIMATION_FADE_IN_DURATION = 67;
    private static final int DEFAULT_ANIMATION_FADE_OUT_DURATION = 50;
    private static final boolean IS_LOLLIPOP = false;
    private AccessibilityManager accessibilityManager;
    private final int animationFadeInDuration;
    private final TimeInterpolator animationFadeInterpolator;
    private final int animationFadeOutDuration;
    private AutoCompleteTextView autoCompleteTextView;
    private long dropdownPopupActivatedAt;
    private boolean dropdownPopupDirty;
    private boolean editTextHasFocus;
    private ValueAnimator fadeInAnim;
    private ValueAnimator fadeOutAnim;
    private boolean isEndIconChecked;
    private final View.OnFocusChangeListener onEditTextFocusChangeListener;
    private final View.OnClickListener onIconClickListener;
    private final dpbdbdpbLwkLpObyKsq1lll1.InterfaceC1941dpbdbdpbLwkLpObyKsq1lll1 touchExplorationStateChangeListener;

    /* renamed from: com.google.android.material.textfield.DropdownMenuEndIconDelegate$1 */
    class C04681 extends AnimatorListenerAdapter {
        final /* synthetic */ DropdownMenuEndIconDelegate this$0;

        C04681(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    DropdownMenuEndIconDelegate(EndCompoundLayout endCompoundLayout) {
    }

    static /* synthetic */ ValueAnimator access$000(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
    }

    public static /* synthetic */ void bpdqqiQNVROMLC1ll1l1l11(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
    }

    private static AutoCompleteTextView castAutoCompleteTextViewOrThrow(EditText editText) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate, ValueAnimator valueAnimator) {
    }

    public static /* synthetic */ boolean dpbdbdpbLwkLpObyKsq1lll1(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate, View view, MotionEvent motionEvent) {
    }

    public static /* synthetic */ void dpbdpqRKAscW1lll1l(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate, View view) {
    }

    public static /* synthetic */ void dqpqqqbqQyjyB11111l1(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate, View view, boolean z) {
    }

    public static /* synthetic */ void dqqppqiKzJi1l1lll1l(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate, boolean z) {
    }

    private ValueAnimator getAlphaAnimator(int i, float... fArr) {
    }

    private void initAnimators() {
    }

    private boolean isDropdownPopupActive() {
    }

    private /* synthetic */ void lambda$afterEditTextChanged$3() {
    }

    private /* synthetic */ void lambda$getAlphaAnimator$6(ValueAnimator valueAnimator) {
    }

    private /* synthetic */ void lambda$new$0(View view) {
    }

    private /* synthetic */ void lambda$new$1(View view, boolean z) {
    }

    private /* synthetic */ void lambda$new$2(boolean z) {
    }

    private /* synthetic */ boolean lambda$setUpDropdownShowHideBehavior$4(View view, MotionEvent motionEvent) {
    }

    private /* synthetic */ void lambda$setUpDropdownShowHideBehavior$5() {
    }

    public static /* synthetic */ void ppbdpwWWljzmXXdHNabfWhgjl111l11(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
    }

    private void setEndIconChecked(boolean z) {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setUpDropdownShowHideBehavior() {
    }

    private void showHideDropdown() {
    }

    private void updateDropdownPopupDirty() {
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void afterEditTextChanged(Editable editable) {
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
    public dpbdbdpbLwkLpObyKsq1lll1.InterfaceC1941dpbdbdpbLwkLpObyKsq1lll1 getTouchExplorationStateChangeListener() {
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean isBoxBackgroundModeSupported(int i) {
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean isIconActivable() {
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean isIconActivated() {
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean isIconCheckable() {
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean isIconChecked() {
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onEditTextAttached(EditText editText) {
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onInitializeAccessibilityNodeInfo(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void setUp() {
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean shouldTintIconOnError() {
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    @SuppressLint({"ClickableViewAccessibility"})
    void tearDown() {
    }
}
