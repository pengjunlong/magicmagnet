package com.google.android.flexbox;

import android.view.View;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class FlexLine {
    boolean mAnyItemsHaveFlexGrow;
    boolean mAnyItemsHaveFlexShrink;
    int mBottom;
    int mCrossSize;
    int mDividerLengthInMainSize;
    int mFirstIndex;
    int mGoneItemCount;
    List<Integer> mIndicesAlignSelfStretch;
    int mItemCount;
    int mLastIndex;
    int mLeft;
    int mMainSize;
    int mMaxBaseline;
    int mRight;
    int mSumCrossSizeBefore;
    int mTop;
    float mTotalFlexGrow;
    float mTotalFlexShrink;

    FlexLine() {
    }

    public int getCrossSize() {
    }

    public int getFirstIndex() {
    }

    public int getItemCount() {
    }

    public int getItemCountNotGone() {
    }

    public int getMainSize() {
    }

    public float getTotalFlexGrow() {
    }

    public float getTotalFlexShrink() {
    }

    void updatePositionFromView(View view, int i, int i2, int i3, int i4) {
    }
}
