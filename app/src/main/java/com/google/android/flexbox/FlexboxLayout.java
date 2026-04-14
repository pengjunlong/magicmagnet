package com.google.android.flexbox;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.flexbox.FlexboxHelper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class FlexboxLayout extends ViewGroup implements FlexContainer {
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    private int mAlignContent;
    private int mAlignItems;
    private Drawable mDividerDrawableHorizontal;
    private Drawable mDividerDrawableVertical;
    private int mDividerHorizontalHeight;
    private int mDividerVerticalWidth;
    private int mFlexDirection;
    private List<FlexLine> mFlexLines;
    private FlexboxHelper.FlexLinesResult mFlexLinesResult;
    private int mFlexWrap;
    private FlexboxHelper mFlexboxHelper;
    private int mJustifyContent;
    private int mMaxLine;
    private SparseIntArray mOrderCache;
    private int[] mReorderedIndices;
    private int mShowDividerHorizontal;
    private int mShowDividerVertical;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    public FlexboxLayout(Context context) {
    }

    private boolean allFlexLinesAreDummyBefore(int i) {
    }

    private boolean allViewsAreGoneBefore(int i, int i2) {
    }

    private void drawDividersHorizontal(Canvas canvas, boolean z, boolean z2) {
    }

    private void drawDividersVertical(Canvas canvas, boolean z, boolean z2) {
    }

    private void drawHorizontalDivider(Canvas canvas, int i, int i2, int i3) {
    }

    private void drawVerticalDivider(Canvas canvas, int i, int i2, int i3) {
    }

    private boolean hasDividerBeforeChildAtAlongMainAxis(int i, int i2) {
    }

    private boolean hasDividerBeforeFlexLine(int i) {
    }

    private boolean hasEndDividerAfterFlexLine(int i) {
    }

    private void layoutHorizontal(boolean z, int i, int i2, int i3, int i4) {
    }

    private void layoutVertical(boolean z, boolean z2, int i, int i2, int i3, int i4) {
    }

    private void measureHorizontal(int i, int i2) {
    }

    private void measureVertical(int i, int i2) {
    }

    private void setMeasuredDimensionForFlex(int i, int i2, int i3, int i4) {
    }

    private void setWillNotDrawFlag() {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getAlignContent() {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getAlignItems() {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getChildHeightMeasureSpec(int i, int i2, int i3) {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getChildWidthMeasureSpec(int i, int i2, int i3) {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getDecorationLengthCrossAxis(View view) {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getDecorationLengthMainAxis(View view, int i, int i2) {
    }

    public Drawable getDividerDrawableHorizontal() {
    }

    public Drawable getDividerDrawableVertical() {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexDirection() {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public View getFlexItemAt(int i) {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexItemCount() {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public List<FlexLine> getFlexLines() {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public List<FlexLine> getFlexLinesInternal() {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexWrap() {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getJustifyContent() {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getLargestMainSize() {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getMaxLine() {
    }

    public View getReorderedChildAt(int i) {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public View getReorderedFlexItemAt(int i) {
    }

    public int getShowDividerHorizontal() {
    }

    public int getShowDividerVertical() {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getSumOfCrossSize() {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public boolean isMainAxisDirectionHorizontal() {
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void onNewFlexItemAdded(View view, int i, int i2, FlexLine flexLine) {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void onNewFlexLineAdded(FlexLine flexLine) {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setAlignContent(int i) {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setAlignItems(int i) {
    }

    public void setDividerDrawable(Drawable drawable) {
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
    }

    public void setDividerDrawableVertical(Drawable drawable) {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexDirection(int i) {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexLines(List<FlexLine> list) {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexWrap(int i) {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setJustifyContent(int i) {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setMaxLine(int i) {
    }

    public void setShowDivider(int i) {
    }

    public void setShowDividerHorizontal(int i) {
    }

    public void setShowDividerVertical(int i) {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void updateViewCache(int i, View view) {
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = null;
        private int mAlignSelf;
        private float mFlexBasisPercent;
        private float mFlexGrow;
        private float mFlexShrink;
        private int mMaxHeight;
        private int mMaxWidth;
        private int mMinHeight;
        private int mMinWidth;
        private int mOrder;
        private boolean mWrapBefore;

        /* renamed from: com.google.android.flexbox.FlexboxLayout$LayoutParams$1 */
        class C02401 implements Parcelable.Creator<LayoutParams> {
            C02401() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ LayoutParams createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ LayoutParams[] newArray(int i) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LayoutParams createFromParcel(Parcel parcel) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LayoutParams[] newArray(int i) {
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getAlignSelf() {
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexBasisPercent() {
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexGrow() {
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexShrink() {
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginBottom() {
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginLeft() {
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginRight() {
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginTop() {
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxHeight() {
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxWidth() {
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMinHeight() {
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMinWidth() {
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean isWrapBefore() {
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setAlignSelf(int i) {
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexBasisPercent(float f) {
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexGrow(float f) {
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexShrink(float f) {
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setHeight(int i) {
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMaxHeight(int i) {
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMaxWidth(int i) {
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMinHeight(int i) {
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMinWidth(int i) {
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setOrder(int i) {
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setWidth(int i) {
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setWrapBefore(boolean z) {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        public LayoutParams(LayoutParams layoutParams) {
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
        }

        public LayoutParams(int i, int i2) {
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
        }

        protected LayoutParams(Parcel parcel) {
        }
    }
}
