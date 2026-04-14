package com.google.android.flexbox;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class FlexboxHelper {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int INITIAL_CAPACITY = 10;
    private static final long MEASURE_SPEC_WIDTH_MASK = 4294967295L;
    private boolean[] mChildrenFrozen;
    private final FlexContainer mFlexContainer;
    int[] mIndexToFlexLine;
    long[] mMeasureSpecCache;
    private long[] mMeasuredSizeCache;

    static class FlexLinesResult {
        int mChildState;
        List<FlexLine> mFlexLines;

        FlexLinesResult() {
        }

        void reset() {
        }
    }

    private static class Order implements Comparable<Order> {
        int index;
        int order;

        private Order() {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Order order) {
        }

        public String toString() {
        }

        /* synthetic */ Order(C02391 c02391) {
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(Order order) {
        }
    }

    FlexboxHelper(FlexContainer flexContainer) {
    }

    private void addFlexLine(List<FlexLine> list, FlexLine flexLine, int i, int i2) {
    }

    private void checkSizeConstraints(View view, int i) {
    }

    private List<FlexLine> constructFlexLinesForAlignContentCenter(List<FlexLine> list, int i, int i2) {
    }

    private List<Order> createOrders(int i) {
    }

    private void ensureChildrenFrozen(int i) {
    }

    private void evaluateMinimumSizeForCompoundButton(CompoundButton compoundButton) {
    }

    private void expandFlexItems(int i, int i2, FlexLine flexLine, int i3, int i4, boolean z) {
    }

    private int getChildHeightMeasureSpecInternal(int i, FlexItem flexItem, int i2) {
    }

    private int getChildWidthMeasureSpecInternal(int i, FlexItem flexItem, int i2) {
    }

    private int getFlexItemMarginEndCross(FlexItem flexItem, boolean z) {
    }

    private int getFlexItemMarginEndMain(FlexItem flexItem, boolean z) {
    }

    private int getFlexItemMarginStartCross(FlexItem flexItem, boolean z) {
    }

    private int getFlexItemMarginStartMain(FlexItem flexItem, boolean z) {
    }

    private int getFlexItemSizeCross(FlexItem flexItem, boolean z) {
    }

    private int getFlexItemSizeMain(FlexItem flexItem, boolean z) {
    }

    private int getPaddingEndCross(boolean z) {
    }

    private int getPaddingEndMain(boolean z) {
    }

    private int getPaddingStartCross(boolean z) {
    }

    private int getPaddingStartMain(boolean z) {
    }

    private int getViewMeasuredSizeCross(View view, boolean z) {
    }

    private int getViewMeasuredSizeMain(View view, boolean z) {
    }

    private boolean isLastFlexItem(int i, int i2, FlexLine flexLine) {
    }

    private boolean isWrapRequired(View view, int i, int i2, int i3, int i4, FlexItem flexItem, int i5, int i6, int i7) {
    }

    private void shrinkFlexItems(int i, int i2, FlexLine flexLine, int i3, int i4, boolean z) {
    }

    private int[] sortOrdersIntoReorderedIndices(int i, List<Order> list, SparseIntArray sparseIntArray) {
    }

    private void stretchViewHorizontally(View view, int i, int i2) {
    }

    private void stretchViewVertically(View view, int i, int i2) {
    }

    private void updateMeasureCache(int i, int i2, int i3, View view) {
    }

    void calculateFlexLines(FlexLinesResult flexLinesResult, int i, int i2, int i3, int i4, int i5, List<FlexLine> list) {
    }

    void calculateHorizontalFlexLines(FlexLinesResult flexLinesResult, int i, int i2) {
    }

    void calculateHorizontalFlexLinesToIndex(FlexLinesResult flexLinesResult, int i, int i2, int i3, int i4, List<FlexLine> list) {
    }

    void calculateVerticalFlexLines(FlexLinesResult flexLinesResult, int i, int i2) {
    }

    void calculateVerticalFlexLinesToIndex(FlexLinesResult flexLinesResult, int i, int i2, int i3, int i4, List<FlexLine> list) {
    }

    void clearFlexLines(List<FlexLine> list, int i) {
    }

    int[] createReorderedIndices(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
    }

    void determineCrossSize(int i, int i2, int i3) {
    }

    void determineMainSize(int i, int i2) {
    }

    void ensureIndexToFlexLine(int i) {
    }

    void ensureMeasureSpecCache(int i) {
    }

    void ensureMeasuredSizeCache(int i) {
    }

    int extractHigherInt(long j) {
    }

    int extractLowerInt(long j) {
    }

    boolean isOrderChangedFromLastMeasurement(SparseIntArray sparseIntArray) {
    }

    void layoutSingleChildHorizontal(View view, FlexLine flexLine, int i, int i2, int i3, int i4) {
    }

    void layoutSingleChildVertical(View view, FlexLine flexLine, boolean z, int i, int i2, int i3, int i4) {
    }

    long makeCombinedLong(int i, int i2) {
    }

    void stretchViews() {
    }

    void calculateHorizontalFlexLines(FlexLinesResult flexLinesResult, int i, int i2, int i3, int i4, List<FlexLine> list) {
    }

    void calculateVerticalFlexLines(FlexLinesResult flexLinesResult, int i, int i2, int i3, int i4, List<FlexLine> list) {
    }

    void determineMainSize(int i, int i2, int i3) {
    }

    void stretchViews(int i) {
    }

    int[] createReorderedIndices(SparseIntArray sparseIntArray) {
    }
}
