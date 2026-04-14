package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.ref.WeakReference;
import java.util.Set;
import p000.bdpdqYMMfHmzHyUIbllllll1;
import p000.dqqpbqaYiRPLeqRCYteXfDW1l111l11l;
import p000.z12;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.dqqppqiKzJi1l1lll1l<V> implements Sheet<SideSheetCallback> {
    private static final int DEFAULT_ACCESSIBILITY_PANE_TITLE = 0;
    private static final int DEF_STYLE_RES = 0;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int NO_MAX_SIZE = -1;
    static final int SIGNIFICANT_VEL_THRESHOLD = 500;
    private ColorStateList backgroundTint;
    private final Set<SideSheetCallback> callbacks;
    private int childWidth;
    private int coplanarSiblingViewId;
    private WeakReference<View> coplanarSiblingViewRef;
    private final z12.dqqppqiKzJi1l1lll1l dragCallback;
    private boolean draggable;
    private float elevation;
    private float hideFriction;
    private boolean ignoreEvents;
    private int initialX;
    private int lastStableState;
    private MaterialShapeDrawable materialShapeDrawable;
    private float maximumVelocity;
    private int parentWidth;
    private ShapeAppearanceModel shapeAppearanceModel;
    private SheetDelegate sheetDelegate;
    private int state;
    private final SideSheetBehavior<V>.StateSettlingTracker stateSettlingTracker;
    private VelocityTracker velocityTracker;
    private z12 viewDragHelper;
    private WeakReference<V> viewRef;

    /* renamed from: com.google.android.material.sidesheet.SideSheetBehavior$1 */
    class C04421 extends z12.dqqppqiKzJi1l1lll1l {
        final /* synthetic */ SideSheetBehavior this$0;

        C04421(SideSheetBehavior sideSheetBehavior) {
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

    protected static class SavedState extends androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1 {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        final int state;

        /* renamed from: com.google.android.material.sidesheet.SideSheetBehavior$SavedState$1 */
        class C04431 implements Parcelable.ClassLoaderCreator<SavedState> {
            C04431() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
            }
        }

        public SavedState(Parcel parcel) {
        }

        @Override // androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
        }

        public SavedState(Parcelable parcelable, SideSheetBehavior<?> sideSheetBehavior) {
        }
    }

    class StateSettlingTracker {
        private final Runnable continueSettlingRunnable;
        private boolean isContinueSettlingRunnablePosted;
        private int targetState;
        final /* synthetic */ SideSheetBehavior this$0;

        StateSettlingTracker(SideSheetBehavior sideSheetBehavior) {
        }

        public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(StateSettlingTracker stateSettlingTracker) {
        }

        private /* synthetic */ void lambda$new$0() {
        }

        void continueSettlingToState(int i) {
        }
    }

    public SideSheetBehavior() {
    }

    static /* synthetic */ int access$000(SideSheetBehavior sideSheetBehavior) {
    }

    static /* synthetic */ WeakReference access$100(SideSheetBehavior sideSheetBehavior) {
    }

    static /* synthetic */ SheetDelegate access$200(SideSheetBehavior sideSheetBehavior) {
    }

    static /* synthetic */ void access$300(SideSheetBehavior sideSheetBehavior, View view, int i) {
    }

    static /* synthetic */ boolean access$400(SideSheetBehavior sideSheetBehavior) {
    }

    static /* synthetic */ void access$500(SideSheetBehavior sideSheetBehavior, View view, int i, boolean z) {
    }

    static /* synthetic */ int access$600(SideSheetBehavior sideSheetBehavior) {
    }

    static /* synthetic */ z12 access$700(SideSheetBehavior sideSheetBehavior) {
    }

    private int calculateCurrentOffset(int i, V v) {
    }

    private float calculateDragDistance(float f, float f2) {
    }

    private void clearCoplanarSiblingView() {
    }

    private bdpdqYMMfHmzHyUIbllllll1 createAccessibilityViewCommandForState(int i) {
    }

    private void createMaterialShapeDrawableIfNeeded(Context context) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(SideSheetBehavior sideSheetBehavior, int i) {
    }

    private void dispatchOnSlide(View view, int i) {
    }

    public static /* synthetic */ boolean dpbdbdpbLwkLpObyKsq1lll1(SideSheetBehavior sideSheetBehavior, int i, View view, bdpdqYMMfHmzHyUIbllllll1.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    private void ensureAccessibilityPaneTitleIsSet(View view) {
    }

    public static <V extends View> SideSheetBehavior<V> from(V v) {
    }

    private int getChildMeasureSpec(int i, int i2, int i3, int i4) {
    }

    private int getDefaultSheetEdge() {
    }

    private boolean isDraggedFarEnough(MotionEvent motionEvent) {
    }

    private boolean isLayingOut(V v) {
    }

    private /* synthetic */ boolean lambda$createAccessibilityViewCommandForState$1(int i, View view, bdpdqYMMfHmzHyUIbllllll1.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    private /* synthetic */ void lambda$setState$0(int i) {
    }

    private void maybeAssignCoplanarSiblingViewBasedId(CoordinatorLayout coordinatorLayout) {
    }

    private void replaceAccessibilityActionForState(V v, dqqpbqaYiRPLeqRCYteXfDW1l111l11l.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, int i) {
    }

    private void resetVelocity() {
    }

    private void runAfterLayout(V v, Runnable runnable) {
    }

    private void setSheetEdge(int i) {
    }

    private boolean shouldHandleDraggingWithHelper() {
    }

    private boolean shouldInterceptTouchEvent(V v) {
    }

    private void startSettling(View view, int i, boolean z) {
    }

    private void updateAccessibilityActions() {
    }

    private void updateSheetVisibility(View view) {
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public /* bridge */ /* synthetic */ void addCallback(SideSheetCallback sideSheetCallback) {
    }

    public void expand() {
    }

    int getChildWidth() {
    }

    public View getCoplanarSiblingView() {
    }

    public int getExpandedOffset() {
    }

    public float getHideFriction() {
    }

    float getHideThreshold() {
    }

    public int getLastStableState() {
    }

    int getOutwardEdgeOffsetForState(int i) {
    }

    int getParentWidth() {
    }

    int getSignificantVelocityThreshold() {
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public int getState() {
    }

    z12 getViewDragHelper() {
    }

    float getXVelocity() {
    }

    public void hide() {
    }

    public boolean isDraggable() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public void onAttachedToLayoutParams(CoordinatorLayout.ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public void onDetachedFromLayoutParams() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public /* bridge */ /* synthetic */ void removeCallback(SideSheetCallback sideSheetCallback) {
    }

    public void setCoplanarSiblingView(View view) {
    }

    public void setCoplanarSiblingViewId(int i) {
    }

    public void setDraggable(boolean z) {
    }

    public void setHideFriction(float f) {
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void setState(int i) {
    }

    void setStateInternal(int i) {
    }

    boolean shouldHide(View view, float f) {
    }

    public boolean shouldSkipSmoothAnimation() {
    }

    /* renamed from: addCallback, reason: avoid collision after fix types in other method */
    public void addCallback2(SideSheetCallback sideSheetCallback) {
    }

    /* renamed from: removeCallback, reason: avoid collision after fix types in other method */
    public void removeCallback2(SideSheetCallback sideSheetCallback) {
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
    }
}
