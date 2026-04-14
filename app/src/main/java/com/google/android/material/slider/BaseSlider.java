package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.customview.widget.dbpqdHhmDSIHIJiwc1ll1l1;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.slider.BaseOnChangeListener;
import com.google.android.material.slider.BaseOnSliderTouchListener;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.tooltip.TooltipDrawable;
import java.util.ArrayList;
import java.util.List;
import p000.dqqpbqaYiRPLeqRCYteXfDW1l111l11l;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends BaseOnChangeListener<S>, T extends BaseOnSliderTouchListener<S>> extends View {
    private static final int DEFAULT_LABEL_ANIMATION_ENTER_DURATION = 83;
    private static final int DEFAULT_LABEL_ANIMATION_EXIT_DURATION = 117;
    static final int DEF_STYLE_RES = 0;
    private static final String EXCEPTION_ILLEGAL_DISCRETE_VALUE = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION = "minSeparation(%s) must be greater or equal to 0";
    private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE = "minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE_UNIT = "minSeparation(%s) cannot be set as a dimension when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_STEP_SIZE = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";
    private static final String EXCEPTION_ILLEGAL_VALUE = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";
    private static final String EXCEPTION_ILLEGAL_VALUE_FROM = "valueFrom(%s) must be smaller than valueTo(%s)";
    private static final String EXCEPTION_ILLEGAL_VALUE_TO = "valueTo(%s) must be greater than valueFrom(%s)";
    private static final int HALO_ALPHA = 63;
    private static final int LABEL_ANIMATION_ENTER_DURATION_ATTR = 0;
    private static final int LABEL_ANIMATION_ENTER_EASING_ATTR = 0;
    private static final int LABEL_ANIMATION_EXIT_DURATION_ATTR = 0;
    private static final int LABEL_ANIMATION_EXIT_EASING_ATTR = 0;
    private static final int MIN_TOUCH_TARGET_DP = 48;
    private static final String TAG = null;
    private static final double THRESHOLD = 1.0E-4d;
    private static final int TIMEOUT_SEND_ACCESSIBILITY_EVENT = 200;
    static final int UNIT_PX = 0;
    static final int UNIT_VALUE = 1;
    private static final String WARNING_FLOATING_POINT_ERROR = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.";
    private BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender;
    private final AccessibilityHelper accessibilityHelper;
    private final AccessibilityManager accessibilityManager;
    private int activeThumbIdx;
    private final Paint activeTicksPaint;
    private final Paint activeTrackPaint;
    private final List<L> changeListeners;
    private Drawable customThumbDrawable;
    private List<Drawable> customThumbDrawablesForValues;
    private final MaterialShapeDrawable defaultThumbDrawable;
    private int defaultThumbRadius;
    private int defaultTrackHeight;
    private boolean dirtyConfig;
    private int focusedThumbIdx;
    private boolean forceDrawCompatHalo;
    private LabelFormatter formatter;
    private ColorStateList haloColor;
    private final Paint haloPaint;
    private int haloRadius;
    private final Paint inactiveTicksPaint;
    private final Paint inactiveTrackPaint;
    private boolean isLongPress;
    private int labelBehavior;
    private int labelPadding;
    private int labelStyle;
    private final List<TooltipDrawable> labels;
    private boolean labelsAreAnimatedIn;
    private ValueAnimator labelsInAnimator;
    private ValueAnimator labelsOutAnimator;
    private MotionEvent lastEvent;
    private int minTouchTargetSize;
    private int minTrackSidePadding;
    private int minWidgetHeight;
    private final int scaledTouchSlop;
    private int separationUnit;
    private float stepSize;
    private boolean thumbIsPressed;
    private final Paint thumbPaint;
    private int thumbRadius;
    private ColorStateList tickColorActive;
    private ColorStateList tickColorInactive;
    private boolean tickVisible;
    private float[] ticksCoordinates;
    private float touchDownX;
    private final List<T> touchListeners;
    private float touchPosition;
    private ColorStateList trackColorActive;
    private ColorStateList trackColorInactive;
    private int trackHeight;
    private int trackSidePadding;
    private int trackWidth;
    private float valueFrom;
    private float valueTo;
    private ArrayList<Float> values;
    private int widgetHeight;

    /* renamed from: com.google.android.material.slider.BaseSlider$1 */
    class C04451 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BaseSlider this$0;

        C04451(BaseSlider baseSlider) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$2 */
    class C04462 extends AnimatorListenerAdapter {
        final /* synthetic */ BaseSlider this$0;

        C04462(BaseSlider baseSlider) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    private static class AccessibilityHelper extends dbpqdHhmDSIHIJiwc1ll1l1 {
        private final BaseSlider<?, ?, ?> slider;
        final Rect virtualViewBounds;

        AccessibilityHelper(BaseSlider<?, ?, ?> baseSlider) {
        }

        private String startOrEndDescription(int i) {
        }

        @Override // androidx.customview.widget.dbpqdHhmDSIHIJiwc1ll1l1
        protected int getVirtualViewAt(float f, float f2) {
        }

        @Override // androidx.customview.widget.dbpqdHhmDSIHIJiwc1ll1l1
        protected void getVisibleVirtualViews(List<Integer> list) {
        }

        @Override // androidx.customview.widget.dbpqdHhmDSIHIJiwc1ll1l1
        protected boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
        }

        @Override // androidx.customview.widget.dbpqdHhmDSIHIJiwc1ll1l1
        protected void onPopulateNodeForVirtualView(int i, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }
    }

    static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = null;
        boolean hasFocus;
        float stepSize;
        float valueFrom;
        float valueTo;
        ArrayList<Float> values;

        /* renamed from: com.google.android.material.slider.BaseSlider$SliderState$1 */
        class C04471 implements Parcelable.Creator<SliderState> {
            C04471() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SliderState createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SliderState[] newArray(int i) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SliderState createFromParcel(Parcel parcel) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SliderState[] newArray(int i) {
            }
        }

        /* synthetic */ SliderState(Parcel parcel, C04451 c04451) {
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        SliderState(Parcelable parcelable) {
        }

        private SliderState(Parcel parcel) {
        }
    }

    public BaseSlider(Context context) {
    }

    static /* synthetic */ List access$000(BaseSlider baseSlider) {
    }

    static /* synthetic */ AccessibilityHelper access$200(BaseSlider baseSlider) {
    }

    static /* synthetic */ String access$400(BaseSlider baseSlider, float f) {
    }

    static /* synthetic */ boolean access$500(BaseSlider baseSlider, int i, float f) {
    }

    static /* synthetic */ void access$600(BaseSlider baseSlider) {
    }

    static /* synthetic */ float access$700(BaseSlider baseSlider, int i) {
    }

    private void adjustCustomThumbDrawableBounds(Drawable drawable) {
    }

    private void attachLabelToContentView(TooltipDrawable tooltipDrawable) {
    }

    private Float calculateIncrementForKey(int i) {
    }

    private float calculateStepIncrement() {
    }

    private int calculateTrackCenter() {
    }

    private ValueAnimator createLabelAnimator(boolean z) {
    }

    private void createLabelPool() {
    }

    private void detachLabelFromContentView(TooltipDrawable tooltipDrawable) {
    }

    private float dimenToValue(float f) {
    }

    private void dispatchOnChangedFromUser(int i) {
    }

    private void dispatchOnChangedProgrammatically() {
    }

    private void drawActiveTrack(Canvas canvas, int i, int i2) {
    }

    private void drawInactiveTrack(Canvas canvas, int i, int i2) {
    }

    private void drawThumbDrawable(Canvas canvas, int i, int i2, float f, Drawable drawable) {
    }

    private void drawThumbs(Canvas canvas, int i, int i2) {
    }

    private void ensureLabelsAdded() {
    }

    private void ensureLabelsRemoved() {
    }

    private void focusThumbOnFocusGained(int i) {
    }

    private String formatValue(float f) {
    }

    private float[] getActiveRange() {
    }

    private static float getAnimatorCurrentValueOrDefault(ValueAnimator valueAnimator, float f) {
    }

    private float getClampedValue(int i, float f) {
    }

    private int getColorForState(ColorStateList colorStateList) {
    }

    private float getValueOfTouchPosition() {
    }

    private float getValueOfTouchPositionAbsolute() {
    }

    private Drawable initializeCustomThumbDrawable(Drawable drawable) {
    }

    private void invalidateTrack() {
    }

    private boolean isInVerticalScrollingContainer() {
    }

    private boolean isMultipleOfStepSize(float f) {
    }

    private void loadResources(Resources resources) {
    }

    private void maybeCalculateTicksCoordinates() {
    }

    private void maybeDrawCompatHalo(Canvas canvas, int i, int i2) {
    }

    private void maybeDrawTicks(Canvas canvas) {
    }

    private boolean maybeIncreaseTrackSidePadding() {
    }

    private boolean maybeIncreaseWidgetHeight() {
    }

    private boolean moveFocus(int i) {
    }

    private boolean moveFocusInAbsoluteDirection(int i) {
    }

    private float normalizeValue(float f) {
    }

    private Boolean onKeyDownNoActiveThumb(int i, KeyEvent keyEvent) {
    }

    private void onStartTrackingTouch() {
    }

    private void onStopTrackingTouch() {
    }

    private static int pivotIndex(float[] fArr, float f) {
    }

    private void processAttributes(Context context, AttributeSet attributeSet, int i) {
    }

    private void scheduleAccessibilityEventSender(int i) {
    }

    private void setValueForLabel(TooltipDrawable tooltipDrawable, float f) {
    }

    private void setValuesInternal(ArrayList<Float> arrayList) {
    }

    private boolean shouldAlwaysShowLabel() {
    }

    private boolean shouldDrawCompatHalo() {
    }

    private boolean snapActiveThumbToValue(float f) {
    }

    private double snapPosition(float f) {
    }

    private boolean snapThumbToValue(int i, float f) {
    }

    private boolean snapTouchPosition() {
    }

    private void updateHaloHotspot() {
    }

    private void updateTrackWidth(int i) {
    }

    private void updateWidgetLayout() {
    }

    private void validateConfigurationIfDirty() {
    }

    private void validateMinSeparation() {
    }

    private void validateStepSize() {
    }

    private void validateValueFrom() {
    }

    private void validateValueTo() {
    }

    private void validateValues() {
    }

    private boolean valueLandsOnTick(float f) {
    }

    private float valueToX(float f) {
    }

    private void warnAboutFloatingPointError() {
    }

    public void addOnChangeListener(L l) {
    }

    public void addOnSliderTouchListener(T t) {
    }

    public void clearOnChangeListeners() {
    }

    public void clearOnSliderTouchListeners() {
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
    }

    void forceDrawCompatHalo(boolean z) {
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
    }

    final int getAccessibilityFocusedVirtualViewId() {
    }

    public int getActiveThumbIndex() {
    }

    public int getFocusedThumbIndex() {
    }

    public int getHaloRadius() {
    }

    public ColorStateList getHaloTintList() {
    }

    public int getLabelBehavior() {
    }

    protected float getMinSeparation() {
    }

    public float getStepSize() {
    }

    public float getThumbElevation() {
    }

    public int getThumbRadius() {
    }

    public ColorStateList getThumbStrokeColor() {
    }

    public float getThumbStrokeWidth() {
    }

    public ColorStateList getThumbTintList() {
    }

    public ColorStateList getTickActiveTintList() {
    }

    public ColorStateList getTickInactiveTintList() {
    }

    public ColorStateList getTickTintList() {
    }

    public ColorStateList getTrackActiveTintList() {
    }

    public int getTrackHeight() {
    }

    public ColorStateList getTrackInactiveTintList() {
    }

    public int getTrackSidePadding() {
    }

    public ColorStateList getTrackTintList() {
    }

    public int getTrackWidth() {
    }

    public float getValueFrom() {
    }

    public float getValueTo() {
    }

    List<Float> getValues() {
    }

    public boolean hasLabelFormatter() {
    }

    final boolean isRtl() {
    }

    public boolean isTickVisible() {
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
    }

    protected boolean pickActiveThumb() {
    }

    public void removeOnChangeListener(L l) {
    }

    public void removeOnSliderTouchListener(T t) {
    }

    protected void setActiveThumbIndex(int i) {
    }

    void setCustomThumbDrawable(int i) {
    }

    void setCustomThumbDrawablesForValues(int... iArr) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
    }

    public void setFocusedThumbIndex(int i) {
    }

    public void setHaloRadius(int i) {
    }

    public void setHaloRadiusResource(int i) {
    }

    public void setHaloTintList(ColorStateList colorStateList) {
    }

    public void setLabelBehavior(int i) {
    }

    public void setLabelFormatter(LabelFormatter labelFormatter) {
    }

    protected void setSeparationUnit(int i) {
    }

    public void setStepSize(float f) {
    }

    public void setThumbElevation(float f) {
    }

    public void setThumbElevationResource(int i) {
    }

    public void setThumbRadius(int i) {
    }

    public void setThumbRadiusResource(int i) {
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
    }

    public void setThumbStrokeColorResource(int i) {
    }

    public void setThumbStrokeWidth(float f) {
    }

    public void setThumbStrokeWidthResource(int i) {
    }

    public void setThumbTintList(ColorStateList colorStateList) {
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
    }

    public void setTickTintList(ColorStateList colorStateList) {
    }

    public void setTickVisible(boolean z) {
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
    }

    public void setTrackHeight(int i) {
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
    }

    public void setTrackTintList(ColorStateList colorStateList) {
    }

    public void setValueFrom(float f) {
    }

    public void setValueTo(float f) {
    }

    void setValues(Float... fArr) {
    }

    void updateBoundsForVirtualViewId(int i, Rect rect) {
    }

    private class AccessibilityEventSender implements Runnable {
        final /* synthetic */ BaseSlider this$0;
        int virtualViewId;

        private AccessibilityEventSender(BaseSlider baseSlider) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        void setVirtualViewId(int i) {
        }

        /* synthetic */ AccessibilityEventSender(BaseSlider baseSlider, C04451 c04451) {
        }
    }

    public BaseSlider(Context context, AttributeSet attributeSet) {
    }

    private float calculateStepIncrement(int i) {
    }

    void setCustomThumbDrawable(Drawable drawable) {
    }

    public BaseSlider(Context context, AttributeSet attributeSet, int i) {
    }

    void setValues(List<Float> list) {
    }

    void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
    }
}
