package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p000.bdpdqYMMfHmzHyUIbllllll1;
import p000.z12;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.dqqppqiKzJi1l1lll1l<V> {
    private static final float DEFAULT_ALPHA_END_DISTANCE = 0.5f;
    private static final float DEFAULT_ALPHA_START_DISTANCE = 0.0f;
    private static final float DEFAULT_DRAG_DISMISS_THRESHOLD = 0.5f;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final int SWIPE_DIRECTION_ANY = 2;
    public static final int SWIPE_DIRECTION_END_TO_START = 1;
    public static final int SWIPE_DIRECTION_START_TO_END = 0;
    float alphaEndSwipeDistance;
    float alphaStartSwipeDistance;
    private final z12.dqqppqiKzJi1l1lll1l dragCallback;
    float dragDismissThreshold;
    private boolean interceptingEvents;
    OnDismissListener listener;
    private boolean requestingDisallowInterceptTouchEvent;
    private float sensitivity;
    private boolean sensitivitySet;
    int swipeDirection;
    z12 viewDragHelper;

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$1 */
    class C02691 extends z12.dqqppqiKzJi1l1lll1l {
        private static final int INVALID_POINTER_ID = -1;
        private int activePointerId;
        private int originalCapturedViewLeft;
        final /* synthetic */ SwipeDismissBehavior this$0;

        C02691(SwipeDismissBehavior swipeDismissBehavior) {
        }

        private boolean shouldDismiss(View view, float f) {
        }

        @Override // z12.dqqppqiKzJi1l1lll1l
        public int clampViewPositionHorizontal(View view, int i, int i2) {
        }

        @Override // z12.dqqppqiKzJi1l1lll1l
        public int clampViewPositionVertical(View view, int i, int i2) {
        }

        @Override // z12.dqqppqiKzJi1l1lll1l
        public int getViewHorizontalDragRange(View view) {
        }

        @Override // z12.dqqppqiKzJi1l1lll1l
        public void onViewCaptured(View view, int i) {
        }

        @Override // z12.dqqppqiKzJi1l1lll1l
        public void onViewDragStateChanged(int i) {
        }

        @Override // z12.dqqppqiKzJi1l1lll1l
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        }

        @Override // z12.dqqppqiKzJi1l1lll1l
        public void onViewReleased(View view, float f, float f2) {
        }

        @Override // z12.dqqppqiKzJi1l1lll1l
        public boolean tryCaptureView(View view, int i) {
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$2 */
    class C02702 implements bdpdqYMMfHmzHyUIbllllll1 {
        final /* synthetic */ SwipeDismissBehavior this$0;

        C02702(SwipeDismissBehavior swipeDismissBehavior) {
        }

        @Override // p000.bdpdqYMMfHmzHyUIbllllll1
        public boolean perform(View view, bdpdqYMMfHmzHyUIbllllll1.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }
    }

    public interface OnDismissListener {
        void onDismiss(View view);

        void onDragStateChanged(int i);
    }

    private class SettleRunnable implements Runnable {
        private final boolean dismiss;
        final /* synthetic */ SwipeDismissBehavior this$0;
        private final View view;

        SettleRunnable(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    static /* synthetic */ boolean access$002(SwipeDismissBehavior swipeDismissBehavior, boolean z) {
    }

    static float clamp(float f, float f2, float f3) {
    }

    private void ensureViewDragHelper(ViewGroup viewGroup) {
    }

    static float fraction(float f, float f2, float f3) {
    }

    private void updateAccessibilityActions(View view) {
    }

    public boolean canSwipeDismissView(View view) {
    }

    public int getDragState() {
    }

    public OnDismissListener getListener() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
    }

    public void setDragDismissDistance(float f) {
    }

    public void setEndAlphaSwipeDistance(float f) {
    }

    public void setListener(OnDismissListener onDismissListener) {
    }

    public void setSensitivity(float f) {
    }

    public void setStartAlphaSwipeDistance(float f) {
    }

    public void setSwipeDirection(int i) {
    }

    static int clamp(int i, int i2, int i3) {
    }
}
