package androidx.customview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.customview.widget.dpbdbdpbLwkLpObyKsq1lll1;
import java.util.List;
import p000.dqqpbqaYiRPLeqRCYteXfDW1l111l11l;
import p000.jl1;
import p000.qqpbppebHUxqEmlGoAJWl1lll;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class dbpqdHhmDSIHIJiwc1ll1l1 extends androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1 {
    private static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final Rect INVALID_PARENT_BOUNDS = null;
    private static final dpbdbdpbLwkLpObyKsq1lll1.dbpqdHhmDSIHIJiwc1ll1l1<dqqpbqaYiRPLeqRCYteXfDW1l111l11l> NODE_ADAPTER = null;
    private static final dpbdbdpbLwkLpObyKsq1lll1.InterfaceC1950dpbdbdpbLwkLpObyKsq1lll1<jl1<dqqpbqaYiRPLeqRCYteXfDW1l111l11l>, dqqpbqaYiRPLeqRCYteXfDW1l111l11l> SPARSE_VALUES_ADAPTER = null;
    int mAccessibilityFocusedVirtualViewId;
    private final View mHost;
    private int mHoveredVirtualViewId;
    int mKeyboardFocusedVirtualViewId;
    private final AccessibilityManager mManager;
    private dqqppqiKzJi1l1lll1l mNodeProvider;
    private final int[] mTempGlobalRect;
    private final Rect mTempParentRect;
    private final Rect mTempScreenRect;
    private final Rect mTempVisibleRect;

    /* renamed from: androidx.customview.widget.dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1, reason: collision with other inner class name */
    class C1949dbpqdHhmDSIHIJiwc1ll1l1 implements dpbdbdpbLwkLpObyKsq1lll1.dbpqdHhmDSIHIJiwc1ll1l1<dqqpbqaYiRPLeqRCYteXfDW1l111l11l> {
        C1949dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // androidx.customview.widget.dpbdbdpbLwkLpObyKsq1lll1.dbpqdHhmDSIHIJiwc1ll1l1
        public /* bridge */ /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l, Rect rect) {
        }

        public void dpbdbdpbLwkLpObyKsq1lll1(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l, Rect rect) {
        }
    }

    class dpbdbdpbLwkLpObyKsq1lll1 implements dpbdbdpbLwkLpObyKsq1lll1.InterfaceC1950dpbdbdpbLwkLpObyKsq1lll1<jl1<dqqpbqaYiRPLeqRCYteXfDW1l111l11l>, dqqpbqaYiRPLeqRCYteXfDW1l111l11l> {
        dpbdbdpbLwkLpObyKsq1lll1() {
        }

        @Override // androidx.customview.widget.dpbdbdpbLwkLpObyKsq1lll1.InterfaceC1950dpbdbdpbLwkLpObyKsq1lll1
        public /* bridge */ /* synthetic */ dqqpbqaYiRPLeqRCYteXfDW1l111l11l dbpqdHhmDSIHIJiwc1ll1l1(jl1<dqqpbqaYiRPLeqRCYteXfDW1l111l11l> jl1Var, int i) {
        }

        @Override // androidx.customview.widget.dpbdbdpbLwkLpObyKsq1lll1.InterfaceC1950dpbdbdpbLwkLpObyKsq1lll1
        public /* bridge */ /* synthetic */ int dpbdbdpbLwkLpObyKsq1lll1(jl1<dqqpbqaYiRPLeqRCYteXfDW1l111l11l> jl1Var) {
        }

        public int dpbdpqRKAscW1lll1l(jl1<dqqpbqaYiRPLeqRCYteXfDW1l111l11l> jl1Var) {
        }

        public dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqppqiKzJi1l1lll1l(jl1<dqqpbqaYiRPLeqRCYteXfDW1l111l11l> jl1Var, int i) {
        }
    }

    private class dqqppqiKzJi1l1lll1l extends qqpbppebHUxqEmlGoAJWl1lll {
        final /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 dpbdbdpbLwkLpObyKsq1lll1;

        dqqppqiKzJi1l1lll1l(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }

        @Override // p000.qqpbppebHUxqEmlGoAJWl1lll
        public dqqpbqaYiRPLeqRCYteXfDW1l111l11l dpbdbdpbLwkLpObyKsq1lll1(int i) {
        }

        @Override // p000.qqpbppebHUxqEmlGoAJWl1lll
        public dqqpbqaYiRPLeqRCYteXfDW1l111l11l dpbdpqRKAscW1lll1l(int i) {
        }

        @Override // p000.qqpbppebHUxqEmlGoAJWl1lll
        public boolean ppbdpwWWljzmXXdHNabfWhgjl111l11(int i, int i2, Bundle bundle) {
        }
    }

    public dbpqdHhmDSIHIJiwc1ll1l1(View view) {
    }

    private boolean clearAccessibilityFocus(int i) {
    }

    private boolean clickKeyboardFocusedVirtualView() {
    }

    private AccessibilityEvent createEvent(int i, int i2) {
    }

    private AccessibilityEvent createEventForChild(int i, int i2) {
    }

    private AccessibilityEvent createEventForHost(int i) {
    }

    private dqqpbqaYiRPLeqRCYteXfDW1l111l11l createNodeForChild(int i) {
    }

    private dqqpbqaYiRPLeqRCYteXfDW1l111l11l createNodeForHost() {
    }

    private jl1<dqqpbqaYiRPLeqRCYteXfDW1l111l11l> getAllNodes() {
    }

    private void getBoundsInParent(int i, Rect rect) {
    }

    private static Rect guessPreviouslyFocusedRect(View view, int i, Rect rect) {
    }

    private boolean isVisibleToUser(Rect rect) {
    }

    private static int keyToDirection(int i) {
    }

    private boolean moveFocus(int i, Rect rect) {
    }

    private boolean performActionForChild(int i, int i2, Bundle bundle) {
    }

    private boolean performActionForHost(int i, Bundle bundle) {
    }

    private boolean requestAccessibilityFocus(int i) {
    }

    private void updateHoveredVirtualView(int i) {
    }

    public final boolean clearKeyboardFocusForVirtualView(int i) {
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
    }

    public final int getAccessibilityFocusedVirtualViewId() {
    }

    @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
    public qqpbppebHUxqEmlGoAJWl1lll getAccessibilityNodeProvider(View view) {
    }

    @Deprecated
    public int getFocusedVirtualView() {
    }

    public final int getKeyboardFocusedVirtualViewId() {
    }

    protected abstract int getVirtualViewAt(float f, float f2);

    protected abstract void getVisibleVirtualViews(List<Integer> list);

    public final void invalidateRoot() {
    }

    public final void invalidateVirtualView(int i) {
    }

    dqqpbqaYiRPLeqRCYteXfDW1l111l11l obtainAccessibilityNodeInfo(int i) {
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
    }

    @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
    }

    @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
    public void onInitializeAccessibilityNodeInfo(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
    }

    protected abstract boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle);

    protected void onPopulateEventForHost(AccessibilityEvent accessibilityEvent) {
    }

    protected void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
    }

    protected void onPopulateNodeForHost(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
    }

    protected abstract void onPopulateNodeForVirtualView(int i, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l);

    protected void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
    }

    boolean performAction(int i, int i2, Bundle bundle) {
    }

    public final boolean requestKeyboardFocusForVirtualView(int i) {
    }

    public final boolean sendEventForVirtualView(int i, int i2) {
    }

    public final void invalidateVirtualView(int i, int i2) {
    }
}
