package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
import com.google.android.flexbox.FlexboxHelper;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class FlexboxLayoutManager extends RecyclerView.LayoutManager implements FlexContainer, RecyclerView.dddbpbpNqzZZJmSG1111l.dpbdbdpbLwkLpObyKsq1lll1 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean DEBUG = false;
    private static final String TAG = "FlexboxLayoutManager";
    private static final Rect TEMP_RECT = null;
    private int mAlignItems;
    private AnchorInfo mAnchorInfo;
    private final Context mContext;
    private int mDirtyPosition;
    private int mFlexDirection;
    private List<FlexLine> mFlexLines;
    private FlexboxHelper.FlexLinesResult mFlexLinesResult;
    private int mFlexWrap;
    private final FlexboxHelper mFlexboxHelper;
    private boolean mFromBottomToTop;
    private boolean mIsRtl;
    private int mJustifyContent;
    private int mLastHeight;
    private int mLastWidth;
    private LayoutState mLayoutState;
    private int mMaxLine;
    private ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll mOrientationHelper;
    private View mParent;
    private SavedState mPendingSavedState;
    private int mPendingScrollPosition;
    private int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l mRecycler;
    private RecyclerView.bpqdqbqpviKiORjqgp1l111l11 mState;
    private ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll mSubOrientationHelper;
    private SparseArray<View> mViewCache;

    private static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        private int mAnchorOffset;
        private int mAnchorPosition;

        /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$SavedState$1 */
        class C02431 implements Parcelable.Creator<SavedState> {
            C02431() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SavedState createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
            }
        }

        /* synthetic */ SavedState(Parcel parcel, C02411 c02411) {
        }

        static /* synthetic */ int access$200(SavedState savedState) {
        }

        static /* synthetic */ int access$202(SavedState savedState, int i) {
        }

        static /* synthetic */ int access$300(SavedState savedState) {
        }

        static /* synthetic */ int access$302(SavedState savedState, int i) {
        }

        static /* synthetic */ void access$400(SavedState savedState) {
        }

        static /* synthetic */ boolean access$600(SavedState savedState, int i) {
        }

        private boolean hasValidAnchor(int i) {
        }

        private void invalidateAnchor() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        public String toString() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        /* synthetic */ SavedState(SavedState savedState, C02411 c02411) {
        }

        SavedState() {
        }

        private SavedState(Parcel parcel) {
        }

        private SavedState(SavedState savedState) {
        }
    }

    public FlexboxLayoutManager(Context context) {
    }

    static /* synthetic */ int access$2800(FlexboxLayoutManager flexboxLayoutManager) {
    }

    static /* synthetic */ int access$2900(FlexboxLayoutManager flexboxLayoutManager) {
    }

    static /* synthetic */ boolean access$3000(FlexboxLayoutManager flexboxLayoutManager) {
    }

    static /* synthetic */ ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll access$3100(FlexboxLayoutManager flexboxLayoutManager) {
    }

    static /* synthetic */ ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll access$3200(FlexboxLayoutManager flexboxLayoutManager) {
    }

    static /* synthetic */ FlexboxHelper access$3300(FlexboxLayoutManager flexboxLayoutManager) {
    }

    static /* synthetic */ List access$3400(FlexboxLayoutManager flexboxLayoutManager) {
    }

    private boolean canViewBeRecycledFromEnd(View view, int i) {
    }

    private boolean canViewBeRecycledFromStart(View view, int i) {
    }

    private void clearFlexLines() {
    }

    private int computeScrollExtent(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    private int computeScrollOffset(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    private int computeScrollRange(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    private void ensureLayoutState() {
    }

    private void ensureOrientationHelper() {
    }

    private int fill(RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, LayoutState layoutState) {
    }

    private View findFirstReferenceChild(int i) {
    }

    private View findFirstReferenceViewInLine(View view, FlexLine flexLine) {
    }

    private View findLastReferenceChild(int i) {
    }

    private View findLastReferenceViewInLine(View view, FlexLine flexLine) {
    }

    private View findOneVisibleChild(int i, int i2, boolean z) {
    }

    private View findReferenceChild(int i, int i2, int i3) {
    }

    private int fixLayoutEndGap(int i, RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, boolean z) {
    }

    private int fixLayoutStartGap(int i, RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, boolean z) {
    }

    private int getChildBottom(View view) {
    }

    private View getChildClosestToStart() {
    }

    private int getChildLeft(View view) {
    }

    private int getChildRight(View view) {
    }

    private int getChildTop(View view) {
    }

    private int handleScrollingMainOrientation(int i, RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    private int handleScrollingSubOrientation(int i) {
    }

    private static boolean isMeasurementUpToDate(int i, int i2, int i3) {
    }

    private boolean isViewVisible(View view, boolean z) {
    }

    private int layoutFlexLine(FlexLine flexLine, LayoutState layoutState) {
    }

    private int layoutFlexLineMainAxisHorizontal(FlexLine flexLine, LayoutState layoutState) {
    }

    private int layoutFlexLineMainAxisVertical(FlexLine flexLine, LayoutState layoutState) {
    }

    private void recycleByLayoutState(RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, LayoutState layoutState) {
    }

    private void recycleChildren(RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, int i, int i2) {
    }

    private void recycleFlexLinesFromEnd(RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, LayoutState layoutState) {
    }

    private void recycleFlexLinesFromStart(RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, LayoutState layoutState) {
    }

    private void resolveInfiniteAmount() {
    }

    private void resolveLayoutDirection() {
    }

    private boolean shouldMeasureChild(View view, int i, int i2, RecyclerView.qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111) {
    }

    private boolean updateAnchorFromChildren(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, AnchorInfo anchorInfo) {
    }

    private boolean updateAnchorFromPendingState(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, AnchorInfo anchorInfo, SavedState savedState) {
    }

    private void updateAnchorInfoForLayout(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, AnchorInfo anchorInfo) {
    }

    private void updateDirtyPosition(int i) {
    }

    private void updateFlexLines(int i) {
    }

    private void updateLayoutState(int i, int i2) {
    }

    private void updateLayoutStateToFillEnd(AnchorInfo anchorInfo, boolean z, boolean z2) {
    }

    private void updateLayoutStateToFillStart(AnchorInfo anchorInfo, boolean z, boolean z2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.dddbpbpNqzZZJmSG1111l.dpbdbdpbLwkLpObyKsq1lll1
    public PointF computeScrollVectorForPosition(int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    public int findFirstCompletelyVisibleItemPosition() {
    }

    public int findFirstVisibleItemPosition() {
    }

    public int findLastCompletelyVisibleItemPosition() {
    }

    public int findLastVisibleItemPosition() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.qbddqbdJBkudFfhX1ll1l111 generateDefaultLayoutParams() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.qbddqbdJBkudFfhX1ll1l111 generateLayoutParams(Context context, AttributeSet attributeSet) {
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

    int getPositionToFlexLineIndex(int i) {
    }

    public boolean getRecycleChildrenOnDetach() {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public View getReorderedFlexItemAt(int i) {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getSumOfCrossSize() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
    }

    boolean isLayoutRtl() {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public boolean isMainAxisDirectionHorizontal() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.ddbbbeXHXx111ll ddbbbexhxx111ll, RecyclerView.ddbbbeXHXx111ll ddbbbexhxx111ll2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void onNewFlexItemAdded(View view, int i, int i2, FlexLine flexLine) {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void onNewFlexLineAdded(FlexLine flexLine) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setAlignContent(int i) {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setAlignItems(int i) {
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

    public void setRecycleChildrenOnDetach(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, int i) {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void updateViewCache(int i, View view) {
    }

    private class AnchorInfo {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private boolean mAssignedFromSavedState;
        private int mCoordinate;
        private int mFlexLinePosition;
        private boolean mLayoutFromEnd;
        private int mPerpendicularCoordinate;
        private int mPosition;
        private boolean mValid;
        final /* synthetic */ FlexboxLayoutManager this$0;

        private AnchorInfo(FlexboxLayoutManager flexboxLayoutManager) {
        }

        static /* synthetic */ int access$1300(AnchorInfo anchorInfo) {
        }

        static /* synthetic */ int access$1302(AnchorInfo anchorInfo, int i) {
        }

        static /* synthetic */ int access$1400(AnchorInfo anchorInfo) {
        }

        static /* synthetic */ int access$1402(AnchorInfo anchorInfo, int i) {
        }

        static /* synthetic */ void access$1600(AnchorInfo anchorInfo) {
        }

        static /* synthetic */ int access$1700(AnchorInfo anchorInfo) {
        }

        static /* synthetic */ int access$1702(AnchorInfo anchorInfo, int i) {
        }

        static /* synthetic */ boolean access$1802(AnchorInfo anchorInfo, boolean z) {
        }

        static /* synthetic */ void access$1900(AnchorInfo anchorInfo, View view) {
        }

        static /* synthetic */ int access$2400(AnchorInfo anchorInfo) {
        }

        static /* synthetic */ int access$2402(AnchorInfo anchorInfo, int i) {
        }

        static /* synthetic */ int access$2412(AnchorInfo anchorInfo, int i) {
        }

        static /* synthetic */ boolean access$700(AnchorInfo anchorInfo) {
        }

        static /* synthetic */ boolean access$702(AnchorInfo anchorInfo, boolean z) {
        }

        static /* synthetic */ void access$800(AnchorInfo anchorInfo) {
        }

        static /* synthetic */ boolean access$900(AnchorInfo anchorInfo) {
        }

        static /* synthetic */ boolean access$902(AnchorInfo anchorInfo, boolean z) {
        }

        private void assignCoordinateFromPadding() {
        }

        private void assignFromView(View view) {
        }

        private void reset() {
        }

        public String toString() {
        }

        /* synthetic */ AnchorInfo(FlexboxLayoutManager flexboxLayoutManager, C02411 c02411) {
        }
    }

    public FlexboxLayoutManager(Context context, int i) {
    }

    private static class LayoutState {
        private static final int ITEM_DIRECTION_TAIL = 1;
        private static final int LAYOUT_END = 1;
        private static final int LAYOUT_START = -1;
        private static final int SCROLLING_OFFSET_NaN = Integer.MIN_VALUE;
        private int mAvailable;
        private int mFlexLinePosition;
        private boolean mInfinite;
        private int mItemDirection;
        private int mLastScrollDelta;
        private int mLayoutDirection;
        private int mOffset;
        private int mPosition;
        private int mScrollingOffset;
        private boolean mShouldRecycle;

        private LayoutState() {
        }

        static /* synthetic */ int access$1000(LayoutState layoutState) {
        }

        static /* synthetic */ int access$1002(LayoutState layoutState, int i) {
        }

        static /* synthetic */ int access$1012(LayoutState layoutState, int i) {
        }

        static /* synthetic */ int access$1020(LayoutState layoutState, int i) {
        }

        static /* synthetic */ boolean access$1100(LayoutState layoutState) {
        }

        static /* synthetic */ boolean access$1102(LayoutState layoutState, boolean z) {
        }

        static /* synthetic */ int access$1200(LayoutState layoutState) {
        }

        static /* synthetic */ int access$1202(LayoutState layoutState, int i) {
        }

        static /* synthetic */ int access$1220(LayoutState layoutState, int i) {
        }

        static /* synthetic */ int access$1500(LayoutState layoutState) {
        }

        static /* synthetic */ int access$1502(LayoutState layoutState, int i) {
        }

        static /* synthetic */ int access$1508(LayoutState layoutState) {
        }

        static /* synthetic */ int access$1510(LayoutState layoutState) {
        }

        static /* synthetic */ int access$1512(LayoutState layoutState, int i) {
        }

        static /* synthetic */ int access$2000(LayoutState layoutState) {
        }

        static /* synthetic */ int access$2002(LayoutState layoutState, int i) {
        }

        static /* synthetic */ int access$2012(LayoutState layoutState, int i) {
        }

        static /* synthetic */ boolean access$2100(LayoutState layoutState, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, List list) {
        }

        static /* synthetic */ int access$2200(LayoutState layoutState) {
        }

        static /* synthetic */ int access$2202(LayoutState layoutState, int i) {
        }

        static /* synthetic */ int access$2212(LayoutState layoutState, int i) {
        }

        static /* synthetic */ int access$2220(LayoutState layoutState, int i) {
        }

        static /* synthetic */ int access$2300(LayoutState layoutState) {
        }

        static /* synthetic */ int access$2302(LayoutState layoutState, int i) {
        }

        static /* synthetic */ int access$2500(LayoutState layoutState) {
        }

        static /* synthetic */ int access$2502(LayoutState layoutState, int i) {
        }

        static /* synthetic */ int access$2702(LayoutState layoutState, int i) {
        }

        static /* synthetic */ boolean access$500(LayoutState layoutState) {
        }

        static /* synthetic */ boolean access$502(LayoutState layoutState, boolean z) {
        }

        private boolean hasMore(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, List<FlexLine> list) {
        }

        public String toString() {
        }

        /* synthetic */ LayoutState(C02411 c02411) {
        }
    }

    public FlexboxLayoutManager(Context context, int i, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
    }

    public static class LayoutParams extends RecyclerView.qbddqbdJBkudFfhX1ll1l111 implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = null;
        private int mAlignSelf;
        private float mFlexBasisPercent;
        private float mFlexGrow;
        private float mFlexShrink;
        private int mMaxHeight;
        private int mMaxWidth;
        private int mMinHeight;
        private int mMinWidth;
        private boolean mWrapBefore;

        /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$LayoutParams$1 */
        class C02421 implements Parcelable.Creator<LayoutParams> {
            C02421() {
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

        public LayoutParams(int i, int i2) {
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
        }

        public LayoutParams(RecyclerView.qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111) {
        }

        public LayoutParams(LayoutParams layoutParams) {
        }

        protected LayoutParams(Parcel parcel) {
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
    }
}
