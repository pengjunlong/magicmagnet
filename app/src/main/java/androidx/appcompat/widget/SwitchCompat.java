package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.bpdqqiQNVROMLC1ll1l1l11;
import java.lang.ref.Reference;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class SwitchCompat extends CompoundButton {
    private static final String ACCESSIBILITY_EVENT_CLASS_NAME = "android.widget.Switch";
    private static final int[] CHECKED_STATE_SET = null;
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int THUMB_ANIMATION_DURATION = 250;
    private static final Property<SwitchCompat, Float> THUMB_POS = null;
    private static final int TOUCH_MODE_DOWN = 1;
    private static final int TOUCH_MODE_DRAGGING = 2;
    private static final int TOUCH_MODE_IDLE = 0;
    private ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll mAppCompatEmojiTextHelper;
    private dqqppqiKzJi1l1lll1l mEmojiCompatInitCallback;
    private boolean mEnforceSwitchWidth;
    private boolean mHasThumbTint;
    private boolean mHasThumbTintMode;
    private boolean mHasTrackTint;
    private boolean mHasTrackTintMode;
    private int mMinFlingVelocity;
    private Layout mOffLayout;
    private Layout mOnLayout;
    ObjectAnimator mPositionAnimator;
    private boolean mShowText;
    private boolean mSplitTrack;
    private int mSwitchBottom;
    private int mSwitchHeight;
    private int mSwitchLeft;
    private int mSwitchMinWidth;
    private int mSwitchPadding;
    private int mSwitchRight;
    private int mSwitchTop;
    private TransformationMethod mSwitchTransformationMethod;
    private int mSwitchWidth;
    private final Rect mTempRect;
    private ColorStateList mTextColors;
    private final qbdqqpbqpCWRpIKEKtzoceYOll1ll1l mTextHelper;
    private CharSequence mTextOff;
    private CharSequence mTextOffTransformed;
    private CharSequence mTextOn;
    private CharSequence mTextOnTransformed;
    private final TextPaint mTextPaint;
    private Drawable mThumbDrawable;
    float mThumbPosition;
    private int mThumbTextPadding;
    private ColorStateList mThumbTintList;
    private PorterDuff.Mode mThumbTintMode;
    private int mThumbWidth;
    private int mTouchMode;
    private int mTouchSlop;
    private float mTouchX;
    private float mTouchY;
    private Drawable mTrackDrawable;
    private ColorStateList mTrackTintList;
    private PorterDuff.Mode mTrackTintMode;
    private VelocityTracker mVelocityTracker;

    class dbpqdHhmDSIHIJiwc1ll1l1 extends Property<SwitchCompat, Float> {
        dbpqdHhmDSIHIJiwc1ll1l1(Class cls, String str) {
        }

        public Float dbpqdHhmDSIHIJiwc1ll1l1(SwitchCompat switchCompat) {
        }

        public void dpbdbdpbLwkLpObyKsq1lll1(SwitchCompat switchCompat, Float f) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ Float get(SwitchCompat switchCompat) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(SwitchCompat switchCompat, Float f) {
        }
    }

    static class dpbdbdpbLwkLpObyKsq1lll1 {
        static void dbpqdHhmDSIHIJiwc1ll1l1(ObjectAnimator objectAnimator, boolean z) {
        }
    }

    static class dqqppqiKzJi1l1lll1l extends bpdqqiQNVROMLC1ll1l1l11.AbstractC1952bpdqqiQNVROMLC1ll1l1l11 {
        private final Reference<SwitchCompat> dbpqdHhmDSIHIJiwc1ll1l1;

        dqqppqiKzJi1l1lll1l(SwitchCompat switchCompat) {
        }

        @Override // androidx.emoji2.text.bpdqqiQNVROMLC1ll1l1l11.AbstractC1952bpdqqiQNVROMLC1ll1l1l11
        public void dbpqdHhmDSIHIJiwc1ll1l1(Throwable th) {
        }

        @Override // androidx.emoji2.text.bpdqqiQNVROMLC1ll1l1l11.AbstractC1952bpdqqiQNVROMLC1ll1l1l11
        public void dpbdbdpbLwkLpObyKsq1lll1() {
        }
    }

    public SwitchCompat(Context context) {
    }

    private void animateThumbToCheckedState(boolean z) {
    }

    private void applyThumbTint() {
    }

    private void applyTrackTint() {
    }

    private void cancelPositionAnimator() {
    }

    private void cancelSuperTouch(MotionEvent motionEvent) {
    }

    private static float constrain(float f, float f2, float f3) {
    }

    private CharSequence doTransformForOnOffText(CharSequence charSequence) {
    }

    private ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll getEmojiTextViewHelper() {
    }

    private boolean getTargetCheckedState() {
    }

    private int getThumbOffset() {
    }

    private int getThumbScrollRange() {
    }

    private boolean hitThumb(float f, float f2) {
    }

    private Layout makeLayout(CharSequence charSequence) {
    }

    private void setOffStateDescriptionOnRAndAbove() {
    }

    private void setOnStateDescriptionOnRAndAbove() {
    }

    private void setSwitchTypefaceByIndex(int i, int i2) {
    }

    private void setTextOffInternal(CharSequence charSequence) {
    }

    private void setTextOnInternal(CharSequence charSequence) {
    }

    private void setupEmojiCompatLoadCallback() {
    }

    private void stopDrag(MotionEvent motionEvent) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
    }

    public boolean getShowText() {
    }

    public boolean getSplitTrack() {
    }

    public int getSwitchMinWidth() {
    }

    public int getSwitchPadding() {
    }

    public CharSequence getTextOff() {
    }

    public CharSequence getTextOn() {
    }

    public Drawable getThumbDrawable() {
    }

    protected final float getThumbPosition() {
    }

    public int getThumbTextPadding() {
    }

    public ColorStateList getThumbTintList() {
    }

    public PorterDuff.Mode getThumbTintMode() {
    }

    public Drawable getTrackDrawable() {
    }

    public ColorStateList getTrackTintList() {
    }

    public PorterDuff.Mode getTrackTintMode() {
    }

    public boolean isEmojiCompatEnabled() {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
    }

    void onEmojiCompatInitializedForSwitchText() {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
    }

    public void setEmojiCompatEnabled(boolean z) {
    }

    protected final void setEnforceSwitchWidth(boolean z) {
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
    }

    public void setShowText(boolean z) {
    }

    public void setSplitTrack(boolean z) {
    }

    public void setSwitchMinWidth(int i) {
    }

    public void setSwitchPadding(int i) {
    }

    public void setSwitchTextAppearance(Context context, int i) {
    }

    public void setSwitchTypeface(Typeface typeface, int i) {
    }

    public void setTextOff(CharSequence charSequence) {
    }

    public void setTextOn(CharSequence charSequence) {
    }

    public void setThumbDrawable(Drawable drawable) {
    }

    void setThumbPosition(float f) {
    }

    public void setThumbResource(int i) {
    }

    public void setThumbTextPadding(int i) {
    }

    public void setThumbTintList(ColorStateList colorStateList) {
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
    }

    public void setTrackDrawable(Drawable drawable) {
    }

    public void setTrackResource(int i) {
    }

    public void setTrackTintList(ColorStateList colorStateList) {
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
    }

    public void setSwitchTypeface(Typeface typeface) {
    }
}
