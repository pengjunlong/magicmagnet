package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.dbpqdHhmDSIHIJiwc1ll1l1;
import androidx.transition.pbppbpqbamJRy11l1l1;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class qbpbddbpyaPAbpThgWCvm11l11l1 extends pbppbpqbamJRy11l1l1 {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    private static final String PROPNAME_PARENT = "android:visibility:parent";
    private static final String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
    private static final String[] sTransitionProperties = null;
    private int mMode;

    class dbpqdHhmDSIHIJiwc1ll1l1 extends ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll {
        final /* synthetic */ ViewGroup dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ View dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ qbpbddbpyaPAbpThgWCvm11l11l1 dpbdpqRKAscW1lll1l;
        final /* synthetic */ View dqqppqiKzJi1l1lll1l;

        dbpqdHhmDSIHIJiwc1ll1l1(qbpbddbpyaPAbpThgWCvm11l11l1 qbpbddbpyapabpthgwcvm11l11l1, ViewGroup viewGroup, View view, View view2) {
        }

        @Override // androidx.transition.pbppbpqbamJRy11l1l1.dqpqqqbqQyjyB11111l1
        public void onTransitionEnd(pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1) {
        }

        @Override // androidx.transition.ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll, androidx.transition.pbppbpqbamJRy11l1l1.dqpqqqbqQyjyB11111l1
        public void onTransitionPause(pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1) {
        }

        @Override // androidx.transition.ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll, androidx.transition.pbppbpqbamJRy11l1l1.dqpqqqbqQyjyB11111l1
        public void onTransitionResume(pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1) {
        }
    }

    private static class dpbdbdpbLwkLpObyKsq1lll1 extends AnimatorListenerAdapter implements pbppbpqbamJRy11l1l1.dqpqqqbqQyjyB11111l1, dbpqdHhmDSIHIJiwc1ll1l1.InterfaceC1974dbpqdHhmDSIHIJiwc1ll1l1 {
        private boolean bpdqqiQNVROMLC1ll1l1l11;
        private final View dbpqdHhmDSIHIJiwc1ll1l1;
        private final int dpbdbdpbLwkLpObyKsq1lll1;
        private final boolean dpbdpqRKAscW1lll1l;
        private final ViewGroup dqqppqiKzJi1l1lll1l;
        boolean ppbdpwWWljzmXXdHNabfWhgjl111l11;

        dpbdbdpbLwkLpObyKsq1lll1(View view, int i, boolean z) {
        }

        private void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        private void dpbdbdpbLwkLpObyKsq1lll1(boolean z) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.dbpqdHhmDSIHIJiwc1ll1l1.InterfaceC1974dbpqdHhmDSIHIJiwc1ll1l1
        public void onAnimationPause(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.dbpqdHhmDSIHIJiwc1ll1l1.InterfaceC1974dbpqdHhmDSIHIJiwc1ll1l1
        public void onAnimationResume(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // androidx.transition.pbppbpqbamJRy11l1l1.dqpqqqbqQyjyB11111l1
        public void onTransitionCancel(pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1) {
        }

        @Override // androidx.transition.pbppbpqbamJRy11l1l1.dqpqqqbqQyjyB11111l1
        public void onTransitionEnd(pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1) {
        }

        @Override // androidx.transition.pbppbpqbamJRy11l1l1.dqpqqqbqQyjyB11111l1
        public void onTransitionPause(pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1) {
        }

        @Override // androidx.transition.pbppbpqbamJRy11l1l1.dqpqqqbqQyjyB11111l1
        public void onTransitionResume(pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1) {
        }

        @Override // androidx.transition.pbppbpqbamJRy11l1l1.dqpqqqbqQyjyB11111l1
        public void onTransitionStart(pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1) {
        }
    }

    private static class dqqppqiKzJi1l1lll1l {
        ViewGroup bpdqqiQNVROMLC1ll1l1l11;
        boolean dbpqdHhmDSIHIJiwc1ll1l1;
        boolean dpbdbdpbLwkLpObyKsq1lll1;
        int dpbdpqRKAscW1lll1l;
        int dqqppqiKzJi1l1lll1l;
        ViewGroup ppbdpwWWljzmXXdHNabfWhgjl111l11;

        dqqppqiKzJi1l1lll1l() {
        }
    }

    public qbpbddbpyaPAbpThgWCvm11l11l1() {
    }

    private void captureValues(qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111) {
    }

    private dqqppqiKzJi1l1lll1l getVisibilityChangeInfo(qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l1112) {
    }

    @Override // androidx.transition.pbppbpqbamJRy11l1l1
    public void captureEndValues(qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111) {
    }

    @Override // androidx.transition.pbppbpqbamJRy11l1l1
    public void captureStartValues(qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111) {
    }

    @Override // androidx.transition.pbppbpqbamJRy11l1l1
    public Animator createAnimator(ViewGroup viewGroup, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l1112) {
    }

    public int getMode() {
    }

    @Override // androidx.transition.pbppbpqbamJRy11l1l1
    public String[] getTransitionProperties() {
    }

    @Override // androidx.transition.pbppbpqbamJRy11l1l1
    public boolean isTransitionRequired(qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l1112) {
    }

    public boolean isVisible(qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111) {
    }

    public Animator onAppear(ViewGroup viewGroup, View view, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l1112) {
    }

    public Animator onAppear(ViewGroup viewGroup, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111, int i, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l1112, int i2) {
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l1112) {
    }

    public Animator onDisappear(ViewGroup viewGroup, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111, int i, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l1112, int i2) {
    }

    public void setMode(int i) {
    }

    @SuppressLint({"RestrictedApi"})
    public qbpbddbpyaPAbpThgWCvm11l11l1(Context context, AttributeSet attributeSet) {
    }
}
