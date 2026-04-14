package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class LinearLayoutCompat extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    public static class dbpqdHhmDSIHIJiwc1ll1l1 extends LinearLayout.LayoutParams {
        public dbpqdHhmDSIHIJiwc1ll1l1(Context context, AttributeSet attributeSet) {
        }

        public dbpqdHhmDSIHIJiwc1ll1l1(int i, int i2) {
        }

        public dbpqdHhmDSIHIJiwc1ll1l1(ViewGroup.LayoutParams layoutParams) {
        }
    }

    public LinearLayoutCompat(Context context) {
    }

    private void forceUniformHeight(int i, int i2) {
    }

    private void forceUniformWidth(int i, int i2) {
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    void drawDividersHorizontal(Canvas canvas) {
    }

    void drawDividersVertical(Canvas canvas) {
    }

    void drawHorizontalDivider(Canvas canvas, int i) {
    }

    void drawVerticalDivider(Canvas canvas, int i) {
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    @Override // android.view.View
    public int getBaseline() {
    }

    public int getBaselineAlignedChildIndex() {
    }

    int getChildrenSkipCount(View view, int i) {
    }

    public Drawable getDividerDrawable() {
    }

    public int getDividerPadding() {
    }

    public int getDividerWidth() {
    }

    public int getGravity() {
    }

    int getLocationOffset(View view) {
    }

    int getNextLocationOffset(View view) {
    }

    public int getOrientation() {
    }

    public int getShowDividers() {
    }

    View getVirtualChildAt(int i) {
    }

    int getVirtualChildCount() {
    }

    public float getWeightSum() {
    }

    protected boolean hasDividerBeforeChildAt(int i) {
    }

    public boolean isBaselineAligned() {
    }

    public boolean isMeasureWithLargestChildEnabled() {
    }

    void layoutHorizontal(int i, int i2, int i3, int i4) {
    }

    void layoutVertical(int i, int i2, int i3, int i4) {
    }

    void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
    }

    void measureHorizontal(int i, int i2) {
    }

    int measureNullChild(int i) {
    }

    void measureVertical(int i, int i2) {
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
    }

    public void setBaselineAligned(boolean z) {
    }

    public void setBaselineAlignedChildIndex(int i) {
    }

    public void setDividerDrawable(Drawable drawable) {
    }

    public void setDividerPadding(int i) {
    }

    public void setGravity(int i) {
    }

    public void setHorizontalGravity(int i) {
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
    }

    public void setOrientation(int i) {
    }

    public void setShowDividers(int i) {
    }

    public void setVerticalGravity(int i) {
    }

    public void setWeightSum(float f) {
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
    }

    @Override // android.view.ViewGroup
    protected dbpqdHhmDSIHIJiwc1ll1l1 generateDefaultLayoutParams() {
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
    }

    @Override // android.view.ViewGroup
    public dbpqdHhmDSIHIJiwc1ll1l1 generateLayoutParams(AttributeSet attributeSet) {
    }

    @Override // android.view.ViewGroup
    protected dbpqdHhmDSIHIJiwc1ll1l1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }
}
