package com.flipboard.bottomsheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.util.concurrent.CopyOnWriteArraySet;
import p000.bqpbdqddSuZmTIoBbduBmNmllll1ll;
import p000.vn0;
import p000.y22;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class BottomSheetLayout extends FrameLayout {
    private static final Property<BottomSheetLayout, Float> qqbqbddiRRgLpniPxlUfQzP1l1l1l = null;
    private boolean bbdbbpdOJSuInlll111l;
    private float bdddqmITkkeGpsxVXHR1l1llll;
    private float bdpdqYMMfHmzHyUIbllllll1;
    private int bpbbpOxqjGWQAsycX11ll1l1;
    private Rect bpdqqiQNVROMLC1ll1l1l11;
    private CopyOnWriteArraySet<vn0> bppbpdbCeZVhQNTixBml1lll11l;
    private View.OnLayoutChangeListener bpppdpppqFAXRSTHUAmVJLvH11lllll1l;
    private int bpppqdQjfPiCT111111111;
    private final int bpqbbqTOKdRXac1ll1l1lll;
    private float bpqdqbqpviKiORjqgp1l111l11;
    private boolean dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
    private Animator dbbpdqqpdVUhpQ1ll11;
    private float dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1;
    private boolean dbppbdqpeLmcbs11l11;
    private TimeInterpolator ddbbbeXHXx111ll;
    private boolean dddbpbpNqzZZJmSG1111l;
    private int ddddbbdqIccDnEitQc1l1l1l;
    private VelocityTracker ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private Runnable dpbdpqRKAscW1lll1l;
    private y22 dqdqbpQposEBDyDxIyyz1ll11;
    public boolean dqpdbEevAufTOvPphbjykClll1l11;
    private boolean dqpqqqbqQyjyB11111l1;
    private float dqqpbqaYiRPLeqRCYteXfDW1l111l11l;
    private float pbppbpqbamJRy11l1l1;
    private final boolean pdpqbmApOBCmNMwnn1ll111;
    private pbppbpqbamJRy11l1l1 ppbdpwWWljzmXXdHNabfWhgjl111l11;
    private pbppbpqbamJRy11l1l1 ppdqqzXJzQiU11ll11;
    private y22 qbddqbdJBkudFfhX1ll1l111;
    private float qbdpqpstJKhhKkXrsOGvbWw1l1llll;
    private CopyOnWriteArraySet<dbppbdqpeLmcbs11l11> qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;
    private int qbpbddbpyaPAbpThgWCvm11l11l1;
    private View qdqdpyALEmZFGGaahRTIU1ll11;
    private boolean qppqdpppIauLKaAtRkB11111l;
    private float qqpbppebHUxqEmlGoAJWl1lll;

    class bpdqqiQNVROMLC1ll1l1l11 implements ViewTreeObserver.OnPreDrawListener {
        final /* synthetic */ BottomSheetLayout dpbdpqRKAscW1lll1l;

        class dbpqdHhmDSIHIJiwc1ll1l1 implements Runnable {
            final /* synthetic */ bpdqqiQNVROMLC1ll1l1l11 dpbdpqRKAscW1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        bpdqqiQNVROMLC1ll1l1l11(BottomSheetLayout bottomSheetLayout) {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
        }
    }

    public interface dbppbdqpeLmcbs11l11 {
        void dbpqdHhmDSIHIJiwc1ll1l1(pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1);
    }

    class dbpqdHhmDSIHIJiwc1ll1l1 extends Property<BottomSheetLayout, Float> {
        dbpqdHhmDSIHIJiwc1ll1l1(Class cls, String str) {
        }

        public Float dbpqdHhmDSIHIJiwc1ll1l1(BottomSheetLayout bottomSheetLayout) {
        }

        public void dpbdbdpbLwkLpObyKsq1lll1(BottomSheetLayout bottomSheetLayout, Float f) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ Float get(BottomSheetLayout bottomSheetLayout) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(BottomSheetLayout bottomSheetLayout, Float f) {
        }
    }

    private static class ddbbbeXHXx111ll extends AnimatorListenerAdapter {
        protected boolean dbpqdHhmDSIHIJiwc1ll1l1;

        private ddbbbeXHXx111ll() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        /* synthetic */ ddbbbeXHXx111ll(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }
    }

    class dpbdbdpbLwkLpObyKsq1lll1 extends ddbbbeXHXx111ll {
        final /* synthetic */ BottomSheetLayout dpbdbdpbLwkLpObyKsq1lll1;

        dpbdbdpbLwkLpObyKsq1lll1(BottomSheetLayout bottomSheetLayout) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    class dpbdpqRKAscW1lll1l implements Runnable {
        final /* synthetic */ y22 bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ View dpbdpqRKAscW1lll1l;
        final /* synthetic */ BottomSheetLayout ppbdpwWWljzmXXdHNabfWhgjl111l11;

        dpbdpqRKAscW1lll1l(BottomSheetLayout bottomSheetLayout, View view, y22 y22Var) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private static class dqpdbEevAufTOvPphbjykClll1l11 extends bqpbdqddSuZmTIoBbduBmNmllll1ll {
        private dqpdbEevAufTOvPphbjykClll1l11() {
        }

        @Override // p000.y22
        public void dpbdbdpbLwkLpObyKsq1lll1(float f, float f2, float f3, BottomSheetLayout bottomSheetLayout, View view) {
        }

        /* synthetic */ dqpdbEevAufTOvPphbjykClll1l11(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }
    }

    class dqpqqqbqQyjyB11111l1 extends ddbbbeXHXx111ll {
        final /* synthetic */ View dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ BottomSheetLayout dqqppqiKzJi1l1lll1l;

        dqpqqqbqQyjyB11111l1(BottomSheetLayout bottomSheetLayout, View view) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    class dqqppqiKzJi1l1lll1l extends ddbbbeXHXx111ll {
        final /* synthetic */ BottomSheetLayout dpbdbdpbLwkLpObyKsq1lll1;

        dqqppqiKzJi1l1lll1l(BottomSheetLayout bottomSheetLayout) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class pbppbpqbamJRy11l1l1 {
        public static final pbppbpqbamJRy11l1l1 bpdqqiQNVROMLC1ll1l1l11 = null;
        private static final /* synthetic */ pbppbpqbamJRy11l1l1[] ddbbbeXHXx111ll = null;
        public static final pbppbpqbamJRy11l1l1 dpbdpqRKAscW1lll1l = null;
        public static final pbppbpqbamJRy11l1l1 dqpqqqbqQyjyB11111l1 = null;
        public static final pbppbpqbamJRy11l1l1 ppbdpwWWljzmXXdHNabfWhgjl111l11 = null;

        private pbppbpqbamJRy11l1l1(String str, int i) {
        }

        private static /* synthetic */ pbppbpqbamJRy11l1l1[] dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public static pbppbpqbamJRy11l1l1 valueOf(String str) {
        }

        public static pbppbpqbamJRy11l1l1[] values() {
        }
    }

    class ppbdpwWWljzmXXdHNabfWhgjl111l11 implements View.OnLayoutChangeListener {
        final /* synthetic */ BottomSheetLayout dpbdpqRKAscW1lll1l;

        ppbdpwWWljzmXXdHNabfWhgjl111l11(BottomSheetLayout bottomSheetLayout) {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        }
    }

    public BottomSheetLayout(Context context, AttributeSet attributeSet) {
    }

    private void bbdbbpdOJSuInlll111l(Runnable runnable) {
    }

    private boolean bdddqmITkkeGpsxVXHR1l1llll(View view, float f, float f2) {
    }

    private boolean bpbbpOxqjGWQAsycX11ll1l1() {
    }

    static /* synthetic */ Runnable bpdqqiQNVROMLC1ll1l1l11(BottomSheetLayout bottomSheetLayout, Runnable runnable) {
    }

    private float bppbpdbCeZVhQNTixBml1lll11l(float f) {
    }

    private boolean bpppdpppqFAXRSTHUAmVJLvH11lllll1l() {
    }

    private void bpppqdQjfPiCT111111111(float f) {
    }

    private boolean bpqdqbqpviKiORjqgp1l111l11(float f) {
    }

    static /* synthetic */ void dbppbdqpeLmcbs11l11(BottomSheetLayout bottomSheetLayout, pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1) {
    }

    static /* synthetic */ float dbpqdHhmDSIHIJiwc1ll1l1(BottomSheetLayout bottomSheetLayout) {
    }

    static /* synthetic */ int ddbbbeXHXx111ll(BottomSheetLayout bottomSheetLayout) {
    }

    static /* synthetic */ CopyOnWriteArraySet ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(BottomSheetLayout bottomSheetLayout) {
    }

    static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(BottomSheetLayout bottomSheetLayout, float f) {
    }

    static /* synthetic */ Runnable dpbdpqRKAscW1lll1l(BottomSheetLayout bottomSheetLayout) {
    }

    private void dqdqbpQposEBDyDxIyyz1ll11() {
    }

    static /* synthetic */ int dqpdbEevAufTOvPphbjykClll1l11(BottomSheetLayout bottomSheetLayout, int i) {
    }

    static /* synthetic */ pbppbpqbamJRy11l1l1 dqpqqqbqQyjyB11111l1(BottomSheetLayout bottomSheetLayout) {
    }

    static /* synthetic */ y22 dqqppqiKzJi1l1lll1l(BottomSheetLayout bottomSheetLayout, y22 y22Var) {
    }

    private float getDefaultPeekTranslation() {
    }

    static /* synthetic */ void pbppbpqbamJRy11l1l1(BottomSheetLayout bottomSheetLayout, int i) {
    }

    static /* synthetic */ Animator ppbdpwWWljzmXXdHNabfWhgjl111l11(BottomSheetLayout bottomSheetLayout, Animator animator) {
    }

    private static <T> T qbddqbdJBkudFfhX1ll1l111(T t, String str) {
    }

    private boolean qbdqqpbqpCWRpIKEKtzoceYOll1ll1l() {
    }

    private void qdqdpyALEmZFGGaahRTIU1ll11() {
    }

    private void qppqdpppIauLKaAtRkB11111l() {
    }

    private void setSheetLayerTypeIfEnabled(int i) {
    }

    private void setSheetTranslation(float f) {
    }

    private void setState(pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
    }

    public void bpqbbqTOKdRXac1ll1l1lll(View view, y22 y22Var) {
    }

    public void dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1() {
    }

    public void dbbpdqqpdVUhpQ1ll11() {
    }

    public void dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1() {
    }

    public boolean dddbpbpNqzZZJmSG1111l() {
    }

    public void ddddbbdqIccDnEitQc1l1l1l(vn0 vn0Var) {
    }

    public View getContentView() {
    }

    public boolean getInterceptContentTouch() {
    }

    public float getMaxSheetTranslation() {
    }

    public boolean getPeekOnDismiss() {
    }

    public float getPeekSheetTranslation() {
    }

    public View getSheetView() {
    }

    public pbppbpqbamJRy11l1l1 getState() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void pdpqbmApOBCmNMwnn1ll111(View view) {
    }

    public void qbdpqpstJKhhKkXrsOGvbWw1l1llll(vn0 vn0Var) {
    }

    public void setContentView(View view) {
    }

    public void setDefaultViewTransformer(y22 y22Var) {
    }

    public void setInterceptContentTouch(boolean z) {
    }

    public void setPeekOnDismiss(boolean z) {
    }

    public void setPeekSheetTranslation(float f) {
    }

    public void setShouldDimContentView(boolean z) {
    }

    public void setUseHardwareLayerWhileAnimating(boolean z) {
    }

    public BottomSheetLayout(Context context, AttributeSet attributeSet, int i) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, int i2) {
    }
}
