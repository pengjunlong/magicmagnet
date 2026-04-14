package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class LinearLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.dddbpbpNqzZZJmSG1111l.dpbdbdpbLwkLpObyKsq1lll1 {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final dbpqdHhmDSIHIJiwc1ll1l1 mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final dpbdbdpbLwkLpObyKsq1lll1 mLayoutChunkResult;
    private dqqppqiKzJi1l1lll1l mLayoutState;
    int mOrientation;
    ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll mOrientationHelper;
    dpbdpqRKAscW1lll1l mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    static class dbpqdHhmDSIHIJiwc1ll1l1 {
        boolean bpdqqiQNVROMLC1ll1l1l11;
        ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll dbpqdHhmDSIHIJiwc1ll1l1;
        int dpbdbdpbLwkLpObyKsq1lll1;
        boolean dpbdpqRKAscW1lll1l;
        int dqqppqiKzJi1l1lll1l;

        dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        void bpdqqiQNVROMLC1ll1l1l11() {
        }

        void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public void dpbdbdpbLwkLpObyKsq1lll1(View view, int i) {
        }

        boolean dpbdpqRKAscW1lll1l(View view, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
        }

        public void dqqppqiKzJi1l1lll1l(View view, int i) {
        }

        public String toString() {
        }
    }

    protected static class dpbdbdpbLwkLpObyKsq1lll1 {
        public int dbpqdHhmDSIHIJiwc1ll1l1;
        public boolean dpbdbdpbLwkLpObyKsq1lll1;
        public boolean dpbdpqRKAscW1lll1l;
        public boolean dqqppqiKzJi1l1lll1l;

        protected dpbdbdpbLwkLpObyKsq1lll1() {
        }

        void dbpqdHhmDSIHIJiwc1ll1l1() {
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class dpbdpqRKAscW1lll1l implements Parcelable {
        public static final Parcelable.Creator<dpbdpqRKAscW1lll1l> CREATOR = null;
        int bpdqqiQNVROMLC1ll1l1l11;
        int dpbdpqRKAscW1lll1l;
        boolean ppbdpwWWljzmXXdHNabfWhgjl111l11;

        class dbpqdHhmDSIHIJiwc1ll1l1 implements Parcelable.Creator<dpbdpqRKAscW1lll1l> {
            dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ dpbdpqRKAscW1lll1l createFromParcel(Parcel parcel) {
            }

            public dpbdpqRKAscW1lll1l dbpqdHhmDSIHIJiwc1ll1l1(Parcel parcel) {
            }

            public dpbdpqRKAscW1lll1l[] dpbdbdpbLwkLpObyKsq1lll1(int i) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ dpbdpqRKAscW1lll1l[] newArray(int i) {
            }
        }

        public dpbdpqRKAscW1lll1l() {
        }

        boolean dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        void dpbdbdpbLwkLpObyKsq1lll1() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        dpbdpqRKAscW1lll1l(Parcel parcel) {
        }

        @SuppressLint({"UnknownNullness"})
        public dpbdpqRKAscW1lll1l(dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l) {
        }
    }

    static class dqqppqiKzJi1l1lll1l {
        int bpdqqiQNVROMLC1ll1l1l11;
        boolean dbppbdqpeLmcbs11l11;
        boolean dbpqdHhmDSIHIJiwc1ll1l1;
        int ddbbbeXHXx111ll;
        List<RecyclerView.bpqbbqTOKdRXac1ll1l1lll> ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
        int dpbdbdpbLwkLpObyKsq1lll1;
        int dpbdpqRKAscW1lll1l;
        int dqpdbEevAufTOvPphbjykClll1l11;
        int dqpqqqbqQyjyB11111l1;
        int dqqppqiKzJi1l1lll1l;
        int pbppbpqbamJRy11l1l1;
        int ppbdpwWWljzmXXdHNabfWhgjl111l11;
        boolean qbdpqpstJKhhKkXrsOGvbWw1l1llll;

        dqqppqiKzJi1l1lll1l() {
        }

        private View bpdqqiQNVROMLC1ll1l1l11() {
        }

        public void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public void dpbdbdpbLwkLpObyKsq1lll1(View view) {
        }

        View dpbdpqRKAscW1lll1l(RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l) {
        }

        boolean dqqppqiKzJi1l1lll1l(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
        }

        public View ppbdpwWWljzmXXdHNabfWhgjl111l11(View view) {
        }
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context) {
    }

    private int computeScrollExtent(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    private int computeScrollOffset(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    private int computeScrollRange(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
    }

    private int fixLayoutEndGap(int i, RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, boolean z) {
    }

    private int fixLayoutStartGap(int i, RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, boolean z) {
    }

    private View getChildClosestToEnd() {
    }

    private View getChildClosestToStart() {
    }

    private void layoutForPredictiveAnimations(RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, int i, int i2) {
    }

    private void logChildren() {
    }

    private void recycleByLayoutState(RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l) {
    }

    private void recycleChildren(RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, int i, int i2) {
    }

    private void recycleViewsFromEnd(RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, int i, int i2) {
    }

    private void recycleViewsFromStart(RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, int i, int i2) {
    }

    private void resolveShouldLayoutReverse() {
    }

    private boolean updateAnchorFromChildren(RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    private boolean updateAnchorFromPendingData(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    private void updateAnchorInfoForLayout(RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    private void updateLayoutState(int i, int i2, boolean z, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    private void updateLayoutStateToFillEnd(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    private void updateLayoutStateToFillStart(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void assertNotInLayoutOrScroll(String str) {
    }

    protected void calculateExtraLayoutSpace(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, int[] iArr) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, RecyclerView.LayoutManager.dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void collectInitialPrefetchPositions(int i, RecyclerView.LayoutManager.dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l) {
    }

    void collectPrefetchPositionsForLayoutState(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l, RecyclerView.LayoutManager.dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollExtent(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollOffset(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollRange(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.dddbpbpNqzZZJmSG1111l.dpbdbdpbLwkLpObyKsq1lll1
    @SuppressLint({"UnknownNullness"})
    public PointF computeScrollVectorForPosition(int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollExtent(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollOffset(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollRange(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    int convertFocusDirectionToLayoutDirection(int i) {
    }

    dqqppqiKzJi1l1lll1l createLayoutState() {
    }

    void ensureLayoutState() {
    }

    int fill(RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, boolean z) {
    }

    public int findFirstCompletelyVisibleItemPosition() {
    }

    View findFirstVisibleChildClosestToEnd(boolean z, boolean z2) {
    }

    View findFirstVisibleChildClosestToStart(boolean z, boolean z2) {
    }

    public int findFirstVisibleItemPosition() {
    }

    public int findLastCompletelyVisibleItemPosition() {
    }

    public int findLastVisibleItemPosition() {
    }

    View findOnePartiallyOrCompletelyInvisibleChild(int i, int i2) {
    }

    View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
    }

    View findReferenceChild(RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, boolean z, boolean z2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public View findViewByPosition(int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.qbddqbdJBkudFfhX1ll1l111 generateDefaultLayoutParams() {
    }

    @Deprecated
    protected int getExtraLayoutSpace(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    public int getInitialPrefetchItemCount() {
    }

    public int getOrientation() {
    }

    public boolean getRecycleChildrenOnDetach() {
    }

    public boolean getReverseLayout() {
    }

    public boolean getStackFromEnd() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
    }

    protected boolean isLayoutRTL() {
    }

    public boolean isSmoothScrollbarEnabled() {
    }

    void layoutChunk(RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l, dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
    }

    void onAnchorReady(RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public View onFocusSearchFailed(View view, int i, RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onLayoutChildren(RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onLayoutCompleted(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public Parcelable onSaveInstanceState() {
    }

    public void prepareForDrop(View view, View view2, int i, int i2) {
    }

    boolean resolveIsInfinite() {
    }

    int scrollBy(int i, RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int scrollHorizontallyBy(int i, RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
    }

    public void scrollToPositionWithOffset(int i, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int scrollVerticallyBy(int i, RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    public void setInitialPrefetchItemCount(int i) {
    }

    public void setOrientation(int i) {
    }

    public void setRecycleChildrenOnDetach(boolean z) {
    }

    public void setReverseLayout(boolean z) {
    }

    public void setSmoothScrollbarEnabled(boolean z) {
    }

    public void setStackFromEnd(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    boolean shouldMeasureTwice() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
    }

    void validateChildOrder() {
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context, int i, boolean z) {
    }

    private void updateLayoutStateToFillEnd(int i, int i2) {
    }

    private void updateLayoutStateToFillStart(int i, int i2) {
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
    }
}
