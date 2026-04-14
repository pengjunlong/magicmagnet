package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import p000.bddbdqIqNdVDXltIiTQXQdz11111l1;
import p000.ddbqpXSyHHg1l111111l;
import p000.ddqdddqGeQECbqiXMfho11l11;
import p000.ed0;
import p000.pbdqqdqbqFnXFMYhwLzl111111l;
import p000.qbdbdqqnRRxPUvoJUDIlI11l11;
import p000.tf1;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.1.4";
    private static tf1 sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<androidx.constraintlayout.widget.dpbdbdpbLwkLpObyKsq1lll1> mConstraintHelpers;
    protected androidx.constraintlayout.widget.dqqppqiKzJi1l1lll1l mConstraintLayoutSpec;
    private dpbdpqRKAscW1lll1l mConstraintSet;
    private int mConstraintSetId;
    private pbdqqdqbqFnXFMYhwLzl111111l mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected qbdbdqqnRRxPUvoJUDIlI11l11 mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    dqqppqiKzJi1l1lll1l mMeasurer;
    private ed0 mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<ddbqpXSyHHg1l111111l> mTempMapIdToWidget;

    static /* synthetic */ class dbpqdHhmDSIHIJiwc1ll1l1 {
        static final /* synthetic */ int[] dbpqdHhmDSIHIJiwc1ll1l1 = null;
    }

    class dqqppqiKzJi1l1lll1l implements ddqdddqGeQECbqiXMfho11l11.dpbdbdpbLwkLpObyKsq1lll1 {
        int bpdqqiQNVROMLC1ll1l1l11;
        ConstraintLayout dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ ConstraintLayout ddbbbeXHXx111ll;
        int dpbdbdpbLwkLpObyKsq1lll1;
        int dpbdpqRKAscW1lll1l;
        int dqpqqqbqQyjyB11111l1;
        int dqqppqiKzJi1l1lll1l;
        int ppbdpwWWljzmXXdHNabfWhgjl111l11;

        public dqqppqiKzJi1l1lll1l(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        }

        private boolean dpbdpqRKAscW1lll1l(int i, int i2, int i3) {
        }

        @Override // ddqdddqGeQECbqiXMfho11l11.dpbdbdpbLwkLpObyKsq1lll1
        public final void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // ddqdddqGeQECbqiXMfho11l11.dpbdbdpbLwkLpObyKsq1lll1
        @SuppressLint({"WrongCall"})
        public final void dpbdbdpbLwkLpObyKsq1lll1(ddbqpXSyHHg1l111111l ddbqpxsyhhg1l111111l, ddqdddqGeQECbqiXMfho11l11.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }

        public void dqqppqiKzJi1l1lll1l(int i, int i2, int i3, int i4, int i5, int i6) {
        }
    }

    public ConstraintLayout(Context context) {
    }

    static /* synthetic */ int access$000(ConstraintLayout constraintLayout) {
    }

    static /* synthetic */ ArrayList access$100(ConstraintLayout constraintLayout) {
    }

    private int getPaddingWidth() {
    }

    public static tf1 getSharedValues() {
    }

    private final ddbqpXSyHHg1l111111l getTargetWidget(int i) {
    }

    private void init(AttributeSet attributeSet, int i, int i2) {
    }

    private void markHierarchyDirty() {
    }

    private void setChildrenConstraints() {
    }

    private void setWidgetBaseline(ddbqpXSyHHg1l111111l ddbqpxsyhhg1l111111l, dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, SparseArray<ddbqpXSyHHg1l111111l> sparseArray, int i, bddbdqIqNdVDXltIiTQXQdz11111l1.dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll12) {
    }

    private boolean updateHierarchy() {
    }

    protected void applyConstraintsFromLayoutParams(boolean z, View view, ddbqpXSyHHg1l111111l ddbqpxsyhhg1l111111l, dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, SparseArray<ddbqpXSyHHg1l111111l> sparseArray) {
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    public void fillMetrics(ed0 ed0Var) {
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    public Object getDesignInformation(int i, Object obj) {
    }

    public int getMaxHeight() {
    }

    public int getMaxWidth() {
    }

    public int getMinHeight() {
    }

    public int getMinWidth() {
    }

    public int getOptimizationLevel() {
    }

    public String getSceneString() {
    }

    public View getViewById(int i) {
    }

    public final ddbqpXSyHHg1l111111l getViewWidget(View view) {
    }

    protected boolean isRtl() {
    }

    public void loadLayoutDescription(int i) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
    }

    protected void parseLayoutDescription(int i) {
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    protected void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
    }

    protected void resolveSystem(qbdbdqqnRRxPUvoJUDIlI11l11 qbdbdqqnrrxpuvojudili11l11, int i, int i2, int i3) {
    }

    public void setConstraintSet(dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l) {
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
    }

    @Override // android.view.View
    public void setId(int i) {
    }

    public void setMaxHeight(int i) {
    }

    public void setMaxWidth(int i) {
    }

    public void setMinHeight(int i) {
    }

    public void setMinWidth(int i) {
    }

    public void setOnConstraintsChanged(pbdqqdqbqFnXFMYhwLzl111111l pbdqqdqbqfnxfmyhwlzl111111l) {
    }

    public void setOptimizationLevel(int i) {
    }

    protected void setSelfDimensionBehaviour(qbdbdqqnRRxPUvoJUDIlI11l11 qbdbdqqnrrxpuvojudili11l11, int i, int i2, int i3, int i4) {
    }

    public void setState(int i, int i2, int i3) {
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
    }

    @Override // android.view.ViewGroup
    protected dpbdbdpbLwkLpObyKsq1lll1 generateDefaultLayoutParams() {
    }

    @Override // android.view.ViewGroup
    public dpbdbdpbLwkLpObyKsq1lll1 generateLayoutParams(AttributeSet attributeSet) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
    }

    @TargetApi(21)
    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
    }

    public static class dpbdbdpbLwkLpObyKsq1lll1 extends ViewGroup.MarginLayoutParams {
        public float bbdbbpdOJSuInlll111l;
        public int bddbppbdHQMVgPvQSDhmnXZYkDh1ll111;
        public int bdddqmITkkeGpsxVXHR1l1llll;
        float bdpdqYMMfHmzHyUIbllllll1;
        public int bdqbblVddTYAmqrWwacZmi111ll1;
        boolean bdqpqbqbgFttbl1ll1l;
        public int bpbbpOxqjGWQAsycX11ll1l1;
        public boolean bpbbpbppqsLrtEPjeDMEnOv1l1l1;
        public int bpbqbqdqqjASPQfJSXuVkkgll1lll1ll;
        public int bpdddqbpEtpkwNYukGjjNs1l111;
        public int bpdqqiQNVROMLC1ll1l1l11;
        public int bppbpdbCeZVhQNTixBml1lll11l;
        public int bpppdpppqFAXRSTHUAmVJLvH11lllll1l;
        boolean bpppqdQjfPiCT111111111;
        int bppqdpqbpvFfYvVMQwal1l1l1;
        public int bpqbbpqpqkDmeOUxxUylkHyYgWv11111;
        boolean bpqbbqTOKdRXac1ll1l1lll;
        public int bpqdqbqpviKiORjqgp1l111l11;
        public int bpqpbicsQtfVpOtr11l1l;
        public boolean bqdbpBvxFUC1lll11;
        boolean bqdppdGFpODiqhzhhiaXKl11l1;
        public int dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
        public int dbbpdqqpdVUhpQ1ll11;
        public boolean dbdpqdqbxaVJPXHgWAxfdYMEQF1111l;
        public int dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1;
        public int dbppbdqpeLmcbs11l11;
        int dbppbpzxVnfullll1;
        public int dbpqdHhmDSIHIJiwc1ll1l1;
        public int ddbbbeXHXx111ll;
        public int dddbpbpNqzZZJmSG1111l;
        public int ddddbbdqIccDnEitQc1l1l1l;
        float ddpbddGpKmMvSPZaXEkLg11l11;
        boolean ddppqbqqbIhInevqvPYIBnGmBIE111lll;
        public int ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
        public int dpbdbdpbLwkLpObyKsq1lll1;
        ddbqpXSyHHg1l111111l dpbdppqbVlmCUMWETyfoYOI1l11l1l;
        public boolean dpbdpqRKAscW1lll1l;
        public int dpbdqAKWNZAIXLyehU1lll1lll1;
        boolean dpbqbddbqzdZeRSfMQrmeYoaTpk11l11lll1;
        float dpdqqbdppwRMsRSyLKfcWKCxeblll11ll11;
        public int dqbbdddqpLERmaRLiHiDpL1l1l1l;
        public int dqdqbpQposEBDyDxIyyz1ll11;
        public int dqpdbEevAufTOvPphbjykClll1l11;
        public int dqpqqqbqQyjyB11111l1;
        public float dqqpbqaYiRPLeqRCYteXfDW1l111l11l;
        public float dqqppqiKzJi1l1lll1l;
        public int pbdbqZLBIrMLYk1l11l1ll1;
        public float pbddqdbpoVvTyZPOoYl1111;
        int pbpbpmdJpqmdGNwEepmjpVlll11l1;
        public int pbppbpqbamJRy11l1l1;
        public int pdpqbmApOBCmNMwnn1ll111;
        boolean pdpqqbqbpFAaViLnU1l1ll11l1;
        int pdqbbpCQzQWOl111l1;
        public int pdqdddDNpMbeVT11ll11;
        int ppbddpbbYwysRtaAnAwzNYP11l11111l;
        public int ppbdpwWWljzmXXdHNabfWhgjl111l11;
        int ppdqqzXJzQiU11ll11;
        public float ppppqdfPOyVswFHMTylxLClll1l1111;
        public String pqqbbpbdGewtfncEzUzUgwaxnAl11lll1l;
        int pqqqddFCECdWHkSTrqHcll111111l;
        boolean qbdbqqdbJdTsszXtJeXGasJIiGllll1l;
        public int qbddqbdJBkudFfhX1ll1l111;
        public int qbdpqpstJKhhKkXrsOGvbWw1l1llll;
        public int qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;
        public int qbpbbZWTnlDkwOgZlllll;
        public float qbpbddbpyaPAbpThgWCvm11l11l1;
        boolean qbqdqqqqdvTduGNll111l1;
        public int qddbbpxsbNjqxvn111ll;
        public int qdqdpyALEmZFGGaahRTIU1ll11;
        int qpbqqHZCUeoATyA11ll1l1;
        int qpdbbbbbmKdyKHlllllll1;
        public int qppqdpppIauLKaAtRkB11111l;
        public float qqbqbddiRRgLpniPxlUfQzP1l1l1l;
        public float qqdbbfmUWwoYYpfYHJZdaUO1111llll;
        public String qqpbppebHUxqEmlGoAJWl1lll;

        private static class dbpqdHhmDSIHIJiwc1ll1l1 {
            public static final SparseIntArray dbpqdHhmDSIHIJiwc1ll1l1 = null;
        }

        public dpbdbdpbLwkLpObyKsq1lll1(Context context, AttributeSet attributeSet) {
        }

        public String dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public void dpbdbdpbLwkLpObyKsq1lll1() {
        }

        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @TargetApi(17)
        public void resolveLayoutDirection(int i) {
        }

        public dpbdbdpbLwkLpObyKsq1lll1(int i, int i2) {
        }

        public dpbdbdpbLwkLpObyKsq1lll1(ViewGroup.LayoutParams layoutParams) {
        }
    }
}
