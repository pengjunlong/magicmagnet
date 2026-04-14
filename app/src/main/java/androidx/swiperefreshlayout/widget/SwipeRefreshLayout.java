package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import p000.ng0;
import p000.og0;
import p000.qbqbbqpqbkpoqzdeBgBtyq11ll1ll;
import p000.rg0;
import p000.sg0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class SwipeRefreshLayout extends ViewGroup implements rg0, ng0 {
    private static final String bdqbblVddTYAmqrWwacZmi111ll1 = null;
    private static final int[] bpqpbicsQtfVpOtr11l1l = null;
    private float bbdbbpdOJSuInlll111l;
    private boolean bdddqmITkkeGpsxVXHR1l1llll;
    private Animation bdpdqYMMfHmzHyUIbllllll1;
    private int bpbbpOxqjGWQAsycX11ll1l1;
    private Animation.AnimationListener bpdddqbpEtpkwNYukGjjNs1l111;
    dbppbdqpeLmcbs11l11 bpdqqiQNVROMLC1ll1l1l11;
    private int bppbpdbCeZVhQNTixBml1lll11l;
    private boolean bpppdpppqFAXRSTHUAmVJLvH11lllll1l;
    private Animation bpppqdQjfPiCT111111111;
    private final Animation bpqbbpqpqkDmeOUxxUylkHyYgWv11111;
    qbqbbqpqbkpoqzdeBgBtyq11ll1ll bpqbbqTOKdRXac1ll1l1lll;
    float bpqdqbqpviKiORjqgp1l111l11;
    private float dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
    private boolean dbbpdqqpdVUhpQ1ll11;
    protected int dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1;
    private final sg0 dbppbdqpeLmcbs11l11;
    private float ddbbbeXHXx111ll;
    protected int dddbpbpNqzZZJmSG1111l;
    int ddddbbdqIccDnEitQc1l1l1l;
    private final int[] ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private View dpbdpqRKAscW1lll1l;
    private dqpdbEevAufTOvPphbjykClll1l11 dpbdqAKWNZAIXLyehU1lll1lll1;
    private final Animation dqbbdddqpLERmaRLiHiDpL1l1l1l;
    private int dqdqbpQposEBDyDxIyyz1ll11;
    private float dqpdbEevAufTOvPphbjykClll1l11;
    private int dqpqqqbqQyjyB11111l1;
    private Animation dqqpbqaYiRPLeqRCYteXfDW1l111l11l;
    private final og0 pbppbpqbamJRy11l1l1;
    int pdpqbmApOBCmNMwnn1ll111;
    boolean ppbdpwWWljzmXXdHNabfWhgjl111l11;
    boolean ppdqqzXJzQiU11ll11;
    int qbddqbdJBkudFfhX1ll1l111;
    private final int[] qbdpqpstJKhhKkXrsOGvbWw1l1llll;
    boolean qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;
    private Animation qbpbddbpyaPAbpThgWCvm11l11l1;
    private final DecelerateInterpolator qdqdpyALEmZFGGaahRTIU1ll11;
    androidx.swiperefreshlayout.widget.dbpqdHhmDSIHIJiwc1ll1l1 qppqdpppIauLKaAtRkB11111l;
    private int qqbqbddiRRgLpniPxlUfQzP1l1l1l;
    boolean qqdbbfmUWwoYYpfYHJZdaUO1111llll;
    private Animation qqpbppebHUxqEmlGoAJWl1lll;

    class bpdqqiQNVROMLC1ll1l1l11 implements Animation.AnimationListener {
        final /* synthetic */ SwipeRefreshLayout dpbdpqRKAscW1lll1l;

        bpdqqiQNVROMLC1ll1l1l11(SwipeRefreshLayout swipeRefreshLayout) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public interface dbppbdqpeLmcbs11l11 {
        void dbpqdHhmDSIHIJiwc1ll1l1();
    }

    class dbpqdHhmDSIHIJiwc1ll1l1 implements Animation.AnimationListener {
        final /* synthetic */ SwipeRefreshLayout dpbdpqRKAscW1lll1l;

        dbpqdHhmDSIHIJiwc1ll1l1(SwipeRefreshLayout swipeRefreshLayout) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class ddbbbeXHXx111ll extends Animation {
        final /* synthetic */ SwipeRefreshLayout dpbdpqRKAscW1lll1l;

        ddbbbeXHXx111ll(SwipeRefreshLayout swipeRefreshLayout) {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
        }
    }

    class dpbdbdpbLwkLpObyKsq1lll1 extends Animation {
        final /* synthetic */ SwipeRefreshLayout dpbdpqRKAscW1lll1l;

        dpbdbdpbLwkLpObyKsq1lll1(SwipeRefreshLayout swipeRefreshLayout) {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
        }
    }

    class dpbdpqRKAscW1lll1l extends Animation {
        final /* synthetic */ int bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ int dpbdpqRKAscW1lll1l;
        final /* synthetic */ SwipeRefreshLayout ppbdpwWWljzmXXdHNabfWhgjl111l11;

        dpbdpqRKAscW1lll1l(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
        }
    }

    public interface dqpdbEevAufTOvPphbjykClll1l11 {
        boolean dbpqdHhmDSIHIJiwc1ll1l1(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    class dqpqqqbqQyjyB11111l1 extends Animation {
        final /* synthetic */ SwipeRefreshLayout dpbdpqRKAscW1lll1l;

        dqpqqqbqQyjyB11111l1(SwipeRefreshLayout swipeRefreshLayout) {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
        }
    }

    class dqqppqiKzJi1l1lll1l extends Animation {
        final /* synthetic */ SwipeRefreshLayout dpbdpqRKAscW1lll1l;

        dqqppqiKzJi1l1lll1l(SwipeRefreshLayout swipeRefreshLayout) {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
        }
    }

    class ppbdpwWWljzmXXdHNabfWhgjl111l11 extends Animation {
        final /* synthetic */ SwipeRefreshLayout dpbdpqRKAscW1lll1l;

        ppbdpwWWljzmXXdHNabfWhgjl111l11(SwipeRefreshLayout swipeRefreshLayout) {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
        }
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
    }

    private Animation bdddqmITkkeGpsxVXHR1l1llll(int i, int i2) {
    }

    private void bpdqqiQNVROMLC1ll1l1l11() {
    }

    private void bppbpdbCeZVhQNTixBml1lll11l(Animation.AnimationListener animationListener) {
    }

    private void dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1() {
    }

    private void dbbpdqqpdVUhpQ1ll11(int i, Animation.AnimationListener animationListener) {
    }

    private void dbpqdHhmDSIHIJiwc1ll1l1(int i, Animation.AnimationListener animationListener) {
    }

    private void dpbdbdpbLwkLpObyKsq1lll1(int i, Animation.AnimationListener animationListener) {
    }

    private void dpbdpqRKAscW1lll1l() {
    }

    private void dqdqbpQposEBDyDxIyyz1ll11(float f) {
    }

    private void dqpdbEevAufTOvPphbjykClll1l11(float f) {
    }

    private boolean dqpqqqbqQyjyB11111l1(Animation animation) {
    }

    private void pbppbpqbamJRy11l1l1(MotionEvent motionEvent) {
    }

    private void ppbdpwWWljzmXXdHNabfWhgjl111l11(float f) {
    }

    private void qbddqbdJBkudFfhX1ll1l111() {
    }

    private void qbdpqpstJKhhKkXrsOGvbWw1l1llll(boolean z, boolean z2) {
    }

    private void setColorViewAlpha(int i) {
    }

    void bbdbbpdOJSuInlll111l(Animation.AnimationListener animationListener) {
    }

    void dbppbdqpeLmcbs11l11(float f) {
    }

    public boolean ddbbbeXHXx111ll() {
    }

    void ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll() {
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
    }

    public boolean dqqppqiKzJi1l1lll1l() {
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
    }

    public int getProgressCircleDiameter() {
    }

    public int getProgressViewEndOffset() {
    }

    public int getProgressViewStartOffset() {
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
    }

    @Override // android.view.View, p000.ng0
    public boolean isNestedScrollingEnabled() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.rg0
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.rg0
    public boolean onNestedPreFling(View view, float f, float f2) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.rg0
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.rg0
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.rg0
    public void onNestedScrollAccepted(View view, View view2, int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.rg0
    public boolean onStartNestedScroll(View view, View view2, int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.rg0
    public void onStopNestedScroll(View view) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
    }

    void setAnimationProgress(float f) {
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
    }

    public void setColorSchemeColors(int... iArr) {
    }

    public void setColorSchemeResources(int... iArr) {
    }

    public void setDistanceToTriggerSync(int i) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
    }

    public void setOnChildScrollUpCallback(dqpdbEevAufTOvPphbjykClll1l11 dqpdbeevauftovpphbjykclll1l11) {
    }

    public void setOnRefreshListener(dbppbdqpeLmcbs11l11 dbppbdqpelmcbs11l11) {
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
    }

    public void setRefreshing(boolean z) {
    }

    public void setSize(int i) {
    }

    public void setSlingshotDistance(int i) {
    }

    void setTargetOffsetTopAndBottom(int i) {
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
    }

    @Override // android.view.View, p000.ng0
    public void stopNestedScroll() {
    }
}
