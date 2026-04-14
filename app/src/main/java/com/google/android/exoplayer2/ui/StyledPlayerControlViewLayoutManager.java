package com.google.android.exoplayer2.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class StyledPlayerControlViewLayoutManager {
    private static final long ANIMATION_INTERVAL_MS = 2000;
    private static final long DURATION_FOR_HIDING_ANIMATION_MS = 250;
    private static final long DURATION_FOR_SHOWING_ANIMATION_MS = 250;
    private static final int UX_STATE_ALL_VISIBLE = 0;
    private static final int UX_STATE_ANIMATING_HIDE = 3;
    private static final int UX_STATE_ANIMATING_SHOW = 4;
    private static final int UX_STATE_NONE_VISIBLE = 2;
    private static final int UX_STATE_ONLY_PROGRESS_VISIBLE = 1;
    private boolean animationEnabled;
    private final ViewGroup basicControls;
    private final ViewGroup bottomBar;
    private final ViewGroup centerControls;
    private final View controlsBackground;
    private final ViewGroup extraControls;
    private final ViewGroup extraControlsScrollView;
    private final AnimatorSet hideAllBarsAnimator;
    private final Runnable hideAllBarsRunnable;
    private final Runnable hideControllerRunnable;
    private final AnimatorSet hideMainBarAnimator;
    private final Runnable hideMainBarRunnable;
    private final AnimatorSet hideProgressBarAnimator;
    private final Runnable hideProgressBarRunnable;
    private boolean isMinimalMode;
    private final ViewGroup minimalControls;
    private boolean needToShowBars;
    private final View.OnLayoutChangeListener onLayoutChangeListener;
    private final ValueAnimator overflowHideAnimator;
    private final ValueAnimator overflowShowAnimator;
    private final View overflowShowButton;
    private final StyledPlayerControlView playerControlView;
    private final AnimatorSet showAllBarsAnimator;
    private final Runnable showAllBarsRunnable;
    private final AnimatorSet showMainBarAnimator;
    private final List<View> shownButtons;
    private final View timeBar;
    private final ViewGroup timeView;
    private int uxState;

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$1 */
    class C02121 extends AnimatorListenerAdapter {
        final /* synthetic */ StyledPlayerControlViewLayoutManager this$0;

        C02121(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$2 */
    class C02132 extends AnimatorListenerAdapter {
        final /* synthetic */ StyledPlayerControlViewLayoutManager this$0;

        C02132(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$3 */
    class C02143 extends AnimatorListenerAdapter {
        final /* synthetic */ StyledPlayerControlViewLayoutManager this$0;
        final /* synthetic */ StyledPlayerControlView val$playerControlView;

        C02143(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager, StyledPlayerControlView styledPlayerControlView) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$4 */
    class C02154 extends AnimatorListenerAdapter {
        final /* synthetic */ StyledPlayerControlViewLayoutManager this$0;
        final /* synthetic */ StyledPlayerControlView val$playerControlView;

        C02154(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager, StyledPlayerControlView styledPlayerControlView) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$5 */
    class C02165 extends AnimatorListenerAdapter {
        final /* synthetic */ StyledPlayerControlViewLayoutManager this$0;
        final /* synthetic */ StyledPlayerControlView val$playerControlView;

        C02165(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager, StyledPlayerControlView styledPlayerControlView) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$6 */
    class C02176 extends AnimatorListenerAdapter {
        final /* synthetic */ StyledPlayerControlViewLayoutManager this$0;

        C02176(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$7 */
    class C02187 extends AnimatorListenerAdapter {
        final /* synthetic */ StyledPlayerControlViewLayoutManager this$0;

        C02187(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$8 */
    class C02198 extends AnimatorListenerAdapter {
        final /* synthetic */ StyledPlayerControlViewLayoutManager this$0;

        C02198(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$9 */
    class C02209 extends AnimatorListenerAdapter {
        final /* synthetic */ StyledPlayerControlViewLayoutManager this$0;

        C02209(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public StyledPlayerControlViewLayoutManager(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ View access$000(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    static /* synthetic */ boolean access$100(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    static /* synthetic */ View access$200(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    static /* synthetic */ ViewGroup access$300(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    static /* synthetic */ ViewGroup access$400(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    static /* synthetic */ void access$500(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager, int i) {
    }

    static /* synthetic */ boolean access$600(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    static /* synthetic */ boolean access$602(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager, boolean z) {
    }

    static /* synthetic */ Runnable access$700(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    static /* synthetic */ ViewGroup access$800(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    static /* synthetic */ ViewGroup access$900(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    private void animateOverflow(float f) {
    }

    public static /* synthetic */ void bpdqqiQNVROMLC1ll1l1l11(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    public static /* synthetic */ void dbppbdqpeLmcbs11l11(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager, View view) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    public static /* synthetic */ void ddbbbeXHXx111ll(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    public static /* synthetic */ void ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    public static /* synthetic */ void dpbdpqRKAscW1lll1l(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    public static /* synthetic */ void dqpdbEevAufTOvPphbjykClll1l11(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager, ValueAnimator valueAnimator) {
    }

    public static /* synthetic */ void dqpqqqbqQyjyB11111l1(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager, ValueAnimator valueAnimator) {
    }

    public static /* synthetic */ void dqqppqiKzJi1l1lll1l(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager, ValueAnimator valueAnimator) {
    }

    private static int getHeightWithMargins(View view) {
    }

    private static int getWidthWithMargins(View view) {
    }

    private void hideAllBars() {
    }

    private void hideController() {
    }

    private void hideMainBar() {
    }

    private void hideProgressBar() {
    }

    private /* synthetic */ void lambda$new$0(ValueAnimator valueAnimator) {
    }

    private /* synthetic */ void lambda$new$1(ValueAnimator valueAnimator) {
    }

    private /* synthetic */ void lambda$new$2(ValueAnimator valueAnimator) {
    }

    private /* synthetic */ void lambda$new$3(ValueAnimator valueAnimator) {
    }

    private static ObjectAnimator ofTranslationY(float f, float f2, View view) {
    }

    private void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
    }

    private void onLayoutWidthChanged() {
    }

    private void onOverflowButtonClick(View view) {
    }

    public static /* synthetic */ void pbppbpqbamJRy11l1l1(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    private void postDelayedRunnable(Runnable runnable, long j) {
    }

    public static /* synthetic */ void ppbdpwWWljzmXXdHNabfWhgjl111l11(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
    }

    public static /* synthetic */ void qbdpqpstJKhhKkXrsOGvbWw1l1llll(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager, ValueAnimator valueAnimator) {
    }

    private void setUxState(int i) {
    }

    private boolean shouldHideInMinimalMode(View view) {
    }

    private void showAllBars() {
    }

    private void updateLayoutForSizeChange() {
    }

    private boolean useMinimalMode() {
    }

    public boolean getShowButton(View view) {
    }

    public void hide() {
    }

    public void hideImmediately() {
    }

    public boolean isAnimationEnabled() {
    }

    public boolean isFullyVisible() {
    }

    public void onAttachedToWindow() {
    }

    public void onDetachedFromWindow() {
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void removeHideCallbacks() {
    }

    public void resetHideCallbacks() {
    }

    public void setAnimationEnabled(boolean z) {
    }

    public void setShowButton(View view, boolean z) {
    }

    public void show() {
    }
}
