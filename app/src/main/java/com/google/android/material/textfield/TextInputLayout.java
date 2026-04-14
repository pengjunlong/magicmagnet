package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.LinkedHashSet;
import p000.dqqpbqaYiRPLeqRCYteXfDW1l111l11l;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class TextInputLayout extends LinearLayout {
    public static final int BOX_BACKGROUND_FILLED = 1;
    public static final int BOX_BACKGROUND_NONE = 0;
    public static final int BOX_BACKGROUND_OUTLINE = 2;
    private static final int DEFAULT_PLACEHOLDER_FADE_DURATION = 87;
    private static final int DEF_STYLE_RES = 0;
    private static final int[][] EDIT_TEXT_BACKGROUND_RIPPLE_STATE = null;
    public static final int END_ICON_CLEAR_TEXT = 2;
    public static final int END_ICON_CUSTOM = -1;
    public static final int END_ICON_DROPDOWN_MENU = 3;
    public static final int END_ICON_NONE = 0;
    public static final int END_ICON_PASSWORD_TOGGLE = 1;
    private static final int INVALID_MAX_LENGTH = -1;
    private static final int LABEL_SCALE_ANIMATION_DURATION = 167;
    private static final String LOG_TAG = "TextInputLayout";
    private static final int NO_WIDTH = -1;
    private static final int PLACEHOLDER_START_DELAY = 67;
    private ValueAnimator animator;
    private boolean areCornerRadiiRtl;
    private MaterialShapeDrawable boxBackground;
    private boolean boxBackgroundApplied;
    private int boxBackgroundColor;
    private int boxBackgroundMode;
    private int boxCollapsedPaddingTopPx;
    private final int boxLabelCutoutPaddingPx;
    private int boxStrokeColor;
    private int boxStrokeWidthDefaultPx;
    private int boxStrokeWidthFocusedPx;
    private int boxStrokeWidthPx;
    private MaterialShapeDrawable boxUnderlineDefault;
    private MaterialShapeDrawable boxUnderlineFocused;
    final CollapsingTextHelper collapsingTextHelper;
    boolean counterEnabled;
    private int counterMaxLength;
    private int counterOverflowTextAppearance;
    private ColorStateList counterOverflowTextColor;
    private boolean counterOverflowed;
    private int counterTextAppearance;
    private ColorStateList counterTextColor;
    private TextView counterView;
    private int defaultFilledBackgroundColor;
    private ColorStateList defaultHintTextColor;
    private int defaultStrokeColor;
    private int disabledColor;
    private int disabledFilledBackgroundColor;
    EditText editText;
    private final LinkedHashSet<OnEditTextAttachedListener> editTextAttachedListeners;
    private Drawable endDummyDrawable;
    private int endDummyDrawableWidth;
    private final EndCompoundLayout endLayout;
    private boolean expandedHintEnabled;
    private StateListDrawable filledDropDownMenuBackground;
    private int focusedFilledBackgroundColor;
    private int focusedStrokeColor;
    private ColorStateList focusedTextColor;
    private CharSequence hint;
    private boolean hintAnimationEnabled;
    private boolean hintEnabled;
    private boolean hintExpanded;
    private int hoveredFilledBackgroundColor;
    private int hoveredStrokeColor;
    private boolean inDrawableStateChanged;
    private final IndicatorViewController indicatorViewController;
    private final FrameLayout inputFrame;
    private boolean isProvidingHint;
    private LengthCounter lengthCounter;
    private int maxEms;
    private int maxWidth;
    private int minEms;
    private int minWidth;
    private Drawable originalEditTextEndDrawable;
    private CharSequence originalHint;
    private MaterialShapeDrawable outlinedDropDownMenuBackground;
    private boolean placeholderEnabled;
    private androidx.transition.dqqppqiKzJi1l1lll1l placeholderFadeIn;
    private androidx.transition.dqqppqiKzJi1l1lll1l placeholderFadeOut;
    private CharSequence placeholderText;
    private int placeholderTextAppearance;
    private ColorStateList placeholderTextColor;
    private TextView placeholderTextView;
    private boolean restoringSavedState;
    private ShapeAppearanceModel shapeAppearanceModel;
    private Drawable startDummyDrawable;
    private int startDummyDrawableWidth;
    private final StartCompoundLayout startLayout;
    private ColorStateList strokeErrorColor;
    private final Rect tmpBoundsRect;
    private final Rect tmpRect;
    private final RectF tmpRectF;
    private Typeface typeface;

    /* renamed from: com.google.android.material.textfield.TextInputLayout$1 */
    class C04751 implements TextWatcher {
        final /* synthetic */ TextInputLayout this$0;

        C04751(TextInputLayout textInputLayout) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$2 */
    class RunnableC04762 implements Runnable {
        final /* synthetic */ TextInputLayout this$0;

        RunnableC04762(TextInputLayout textInputLayout) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$3 */
    class RunnableC04773 implements Runnable {
        final /* synthetic */ TextInputLayout this$0;

        RunnableC04773(TextInputLayout textInputLayout) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$4 */
    class C04784 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ TextInputLayout this$0;

        C04784(TextInputLayout textInputLayout) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    public static class AccessibilityDelegate extends androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1 {
        private final TextInputLayout layout;

        public AccessibilityDelegate(TextInputLayout textInputLayout) {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public void onInitializeAccessibilityNodeInfo(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BoxBackgroundMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface EndIconMode {
    }

    public interface LengthCounter {
        int countLength(Editable editable);
    }

    public interface OnEditTextAttachedListener {
        void onEditTextAttached(TextInputLayout textInputLayout);
    }

    public interface OnEndIconChangedListener {
        void onEndIconChanged(TextInputLayout textInputLayout, int i);
    }

    static class SavedState extends androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1 {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        CharSequence error;
        boolean isEndIconChecked;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$SavedState$1 */
        class C04791 implements Parcelable.ClassLoaderCreator<SavedState> {
            C04791() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
            }
        }

        SavedState(Parcelable parcelable) {
        }

        public String toString() {
        }

        @Override // androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
        }
    }

    public TextInputLayout(Context context) {
    }

    static /* synthetic */ boolean access$000(TextInputLayout textInputLayout) {
    }

    static /* synthetic */ boolean access$100(TextInputLayout textInputLayout) {
    }

    static /* synthetic */ void access$200(TextInputLayout textInputLayout, Editable editable) {
    }

    static /* synthetic */ EndCompoundLayout access$300(TextInputLayout textInputLayout) {
    }

    static /* synthetic */ StartCompoundLayout access$400(TextInputLayout textInputLayout) {
    }

    static /* synthetic */ IndicatorViewController access$500(TextInputLayout textInputLayout) {
    }

    private void addPlaceholderTextView() {
    }

    private void adjustFilledEditTextPaddingForLargeFont() {
    }

    private void applyBoxAttributes() {
    }

    private void applyBoxUnderlineAttributes() {
    }

    private void applyCutoutPadding(RectF rectF) {
    }

    private void assignBoxBackgroundByMode() {
    }

    private int calculateBoxBackgroundColor() {
    }

    private Rect calculateCollapsedTextBounds(Rect rect) {
    }

    private int calculateExpandedLabelBottom(Rect rect, Rect rect2, float f) {
    }

    private int calculateExpandedLabelTop(Rect rect, float f) {
    }

    private Rect calculateExpandedTextBounds(Rect rect) {
    }

    private int calculateLabelMarginTop() {
    }

    private boolean canDrawOutlineStroke() {
    }

    private boolean canDrawStroke() {
    }

    private void closeCutout() {
    }

    private void collapseHint(boolean z) {
    }

    private androidx.transition.dqqppqiKzJi1l1lll1l createPlaceholderFadeTransition() {
    }

    private boolean cutoutEnabled() {
    }

    public static /* synthetic */ int dbpqdHhmDSIHIJiwc1ll1l1(Editable editable) {
    }

    private void dispatchOnEditTextAttached() {
    }

    private void drawBoxUnderline(Canvas canvas) {
    }

    private void drawHint(Canvas canvas) {
    }

    private void expandHint(boolean z) {
    }

    private MaterialShapeDrawable getDropDownMaterialShapeDrawable(boolean z) {
    }

    private Drawable getEditTextBoxBackground() {
    }

    private static Drawable getFilledBoxBackgroundWithRipple(MaterialShapeDrawable materialShapeDrawable, int i, int i2, int[][] iArr) {
    }

    private int getLabelLeftBoundAlightWithPrefix(int i, boolean z) {
    }

    private int getLabelRightBoundAlignedWithSuffix(int i, boolean z) {
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
    }

    private static Drawable getOutlinedBoxBackgroundWithRipple(Context context, MaterialShapeDrawable materialShapeDrawable, int i, int[][] iArr) {
    }

    private void hidePlaceholderText() {
    }

    private boolean isSingleLineFilledTextField() {
    }

    private static /* synthetic */ int lambda$new$0(Editable editable) {
    }

    private void onApplyBoxBackgroundMode() {
    }

    private void openCutout() {
    }

    private void recalculateCutout() {
    }

    private static void recursiveSetEnabled(ViewGroup viewGroup, boolean z) {
    }

    private void removePlaceholderTextView() {
    }

    private void setDropDownMenuBackgroundIfNeeded() {
    }

    private void setEditText(EditText editText) {
    }

    private void setHintInternal(CharSequence charSequence) {
    }

    private void setPlaceholderTextEnabled(boolean z) {
    }

    private boolean shouldUpdateEndDummyDrawable() {
    }

    private boolean shouldUpdateStartDummyDrawable() {
    }

    private void showPlaceholderText() {
    }

    private void updateBoxCollapsedPaddingTop() {
    }

    private void updateBoxUnderlineBounds(Rect rect) {
    }

    private void updateCounter() {
    }

    private static void updateCounterContentDescription(Context context, TextView textView, int i, int i2, boolean z) {
    }

    private void updateCounterTextAppearanceAndColor() {
    }

    @TargetApi(29)
    private void updateCursorColor(boolean z) {
    }

    private boolean updateEditTextHeightBasedOnIcon() {
    }

    private void updateInputLayoutMargins() {
    }

    private void updatePlaceholderMeasurementsBasedOnEditText() {
    }

    private void updatePlaceholderText() {
    }

    private void updateStrokeErrorColor(boolean z, boolean z2) {
    }

    public void addOnEditTextAttachedListener(OnEditTextAttachedListener onEditTextAttachedListener) {
    }

    public void addOnEndIconChangedListener(OnEndIconChangedListener onEndIconChangedListener) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
    }

    void animateToExpansionFraction(float f) {
    }

    public void clearOnEditTextAttachedListeners() {
    }

    public void clearOnEndIconChangedListeners() {
    }

    boolean cutoutIsOpen() {
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
    }

    MaterialShapeDrawable getBoxBackground() {
    }

    public int getBoxBackgroundColor() {
    }

    public int getBoxBackgroundMode() {
    }

    public int getBoxCollapsedPaddingTop() {
    }

    public float getBoxCornerRadiusBottomEnd() {
    }

    public float getBoxCornerRadiusBottomStart() {
    }

    public float getBoxCornerRadiusTopEnd() {
    }

    public float getBoxCornerRadiusTopStart() {
    }

    public int getBoxStrokeColor() {
    }

    public ColorStateList getBoxStrokeErrorColor() {
    }

    public int getBoxStrokeWidth() {
    }

    public int getBoxStrokeWidthFocused() {
    }

    public int getCounterMaxLength() {
    }

    CharSequence getCounterOverflowDescription() {
    }

    public ColorStateList getCounterOverflowTextColor() {
    }

    public ColorStateList getCounterTextColor() {
    }

    public ColorStateList getDefaultHintTextColor() {
    }

    public EditText getEditText() {
    }

    public CharSequence getEndIconContentDescription() {
    }

    public Drawable getEndIconDrawable() {
    }

    public int getEndIconMinSize() {
    }

    public int getEndIconMode() {
    }

    public ImageView.ScaleType getEndIconScaleType() {
    }

    CheckableImageButton getEndIconView() {
    }

    public CharSequence getError() {
    }

    public int getErrorAccessibilityLiveRegion() {
    }

    public CharSequence getErrorContentDescription() {
    }

    public int getErrorCurrentTextColors() {
    }

    public Drawable getErrorIconDrawable() {
    }

    public CharSequence getHelperText() {
    }

    public int getHelperTextCurrentTextColor() {
    }

    public CharSequence getHint() {
    }

    final float getHintCollapsedTextHeight() {
    }

    final int getHintCurrentCollapsedTextColor() {
    }

    public ColorStateList getHintTextColor() {
    }

    public LengthCounter getLengthCounter() {
    }

    public int getMaxEms() {
    }

    public int getMaxWidth() {
    }

    public int getMinEms() {
    }

    public int getMinWidth() {
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
    }

    public CharSequence getPlaceholderText() {
    }

    public int getPlaceholderTextAppearance() {
    }

    public ColorStateList getPlaceholderTextColor() {
    }

    public CharSequence getPrefixText() {
    }

    public ColorStateList getPrefixTextColor() {
    }

    public TextView getPrefixTextView() {
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
    }

    public CharSequence getStartIconContentDescription() {
    }

    public Drawable getStartIconDrawable() {
    }

    public int getStartIconMinSize() {
    }

    public ImageView.ScaleType getStartIconScaleType() {
    }

    public CharSequence getSuffixText() {
    }

    public ColorStateList getSuffixTextColor() {
    }

    public TextView getSuffixTextView() {
    }

    public Typeface getTypeface() {
    }

    public boolean isCounterEnabled() {
    }

    public boolean isEndIconCheckable() {
    }

    public boolean isEndIconVisible() {
    }

    public boolean isErrorEnabled() {
    }

    public boolean isExpandedHintEnabled() {
    }

    final boolean isHelperTextDisplayed() {
    }

    public boolean isHelperTextEnabled() {
    }

    public boolean isHintAnimationEnabled() {
    }

    public boolean isHintEnabled() {
    }

    final boolean isHintExpanded() {
    }

    @Deprecated
    public boolean isPasswordVisibilityToggleEnabled() {
    }

    public boolean isProvidingHint() {
    }

    public boolean isStartIconCheckable() {
    }

    public boolean isStartIconVisible() {
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i) {
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
    }

    @Deprecated
    public void passwordVisibilityToggleRequested(boolean z) {
    }

    public void refreshEndIconDrawableState() {
    }

    public void refreshErrorIconDrawableState() {
    }

    public void refreshStartIconDrawableState() {
    }

    public void removeOnEditTextAttachedListener(OnEditTextAttachedListener onEditTextAttachedListener) {
    }

    public void removeOnEndIconChangedListener(OnEndIconChangedListener onEndIconChangedListener) {
    }

    public void setBoxBackgroundColor(int i) {
    }

    public void setBoxBackgroundColorResource(int i) {
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
    }

    public void setBoxBackgroundMode(int i) {
    }

    public void setBoxCollapsedPaddingTop(int i) {
    }

    public void setBoxCornerFamily(int i) {
    }

    public void setBoxCornerRadii(float f, float f2, float f3, float f4) {
    }

    public void setBoxCornerRadiiResources(int i, int i2, int i3, int i4) {
    }

    public void setBoxStrokeColor(int i) {
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
    }

    public void setBoxStrokeWidth(int i) {
    }

    public void setBoxStrokeWidthFocused(int i) {
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
    }

    public void setBoxStrokeWidthResource(int i) {
    }

    public void setCounterEnabled(boolean z) {
    }

    public void setCounterMaxLength(int i) {
    }

    public void setCounterOverflowTextAppearance(int i) {
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
    }

    public void setCounterTextAppearance(int i) {
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
    }

    public void setEndIconActivated(boolean z) {
    }

    public void setEndIconCheckable(boolean z) {
    }

    public void setEndIconContentDescription(int i) {
    }

    public void setEndIconDrawable(int i) {
    }

    public void setEndIconMinSize(int i) {
    }

    public void setEndIconMode(int i) {
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
    }

    public void setEndIconVisible(boolean z) {
    }

    public void setError(CharSequence charSequence) {
    }

    public void setErrorAccessibilityLiveRegion(int i) {
    }

    public void setErrorContentDescription(CharSequence charSequence) {
    }

    public void setErrorEnabled(boolean z) {
    }

    public void setErrorIconDrawable(int i) {
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
    }

    public void setErrorTextAppearance(int i) {
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
    }

    public void setExpandedHintEnabled(boolean z) {
    }

    public void setHelperText(CharSequence charSequence) {
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
    }

    public void setHelperTextEnabled(boolean z) {
    }

    public void setHelperTextTextAppearance(int i) {
    }

    public void setHint(CharSequence charSequence) {
    }

    public void setHintAnimationEnabled(boolean z) {
    }

    public void setHintEnabled(boolean z) {
    }

    public void setHintTextAppearance(int i) {
    }

    public void setHintTextColor(ColorStateList colorStateList) {
    }

    public void setLengthCounter(LengthCounter lengthCounter) {
    }

    public void setMaxEms(int i) {
    }

    public void setMaxWidth(int i) {
    }

    public void setMaxWidthResource(int i) {
    }

    public void setMinEms(int i) {
    }

    public void setMinWidth(int i) {
    }

    public void setMinWidthResource(int i) {
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
    }

    public void setPlaceholderText(CharSequence charSequence) {
    }

    public void setPlaceholderTextAppearance(int i) {
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
    }

    public void setPrefixText(CharSequence charSequence) {
    }

    public void setPrefixTextAppearance(int i) {
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
    }

    public void setStartIconCheckable(boolean z) {
    }

    public void setStartIconContentDescription(int i) {
    }

    public void setStartIconDrawable(int i) {
    }

    public void setStartIconMinSize(int i) {
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
    }

    public void setStartIconVisible(boolean z) {
    }

    public void setSuffixText(CharSequence charSequence) {
    }

    public void setSuffixTextAppearance(int i) {
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
    }

    void setTextAppearanceCompatWithErrorFallback(TextView textView, int i) {
    }

    public void setTextInputAccessibilityDelegate(AccessibilityDelegate accessibilityDelegate) {
    }

    public void setTypeface(Typeface typeface) {
    }

    boolean shouldShowError() {
    }

    boolean updateDummyDrawables() {
    }

    void updateEditTextBackground() {
    }

    void updateEditTextBoxBackgroundIfNeeded() {
    }

    void updateLabelState(boolean z) {
    }

    void updateTextInputBoxState() {
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
    }

    private void updateLabelState(boolean z, boolean z2) {
    }

    private void updatePlaceholderText(Editable editable) {
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
    }

    public void setEndIconDrawable(Drawable drawable) {
    }

    public void setErrorIconDrawable(Drawable drawable) {
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
    }

    public void setStartIconDrawable(Drawable drawable) {
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
    }

    void updateCounter(Editable editable) {
    }

    public void setHint(int i) {
    }
}
