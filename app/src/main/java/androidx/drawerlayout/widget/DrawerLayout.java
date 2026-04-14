package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;
import p000.bdpdqYMMfHmzHyUIbllllll1;
import p000.dqqpbqaYiRPLeqRCYteXfDW1l111l11l;
import p000.z12;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class DrawerLayout extends ViewGroup {
    private static final boolean bdqbblVddTYAmqrWwacZmi111ll1 = false;
    private static final int[] bpdddqbpEtpkwNYukGjjNs1l111 = null;
    static final int[] bpqbbpqpqkDmeOUxxUylkHyYgWv11111 = null;
    private static boolean bpqpbicsQtfVpOtr11l1l;
    static final boolean dqbbdddqpLERmaRLiHiDpL1l1l1l = false;
    private int bbdbbpdOJSuInlll111l;
    private int bdddqmITkkeGpsxVXHR1l1llll;
    private Drawable bdpdqYMMfHmzHyUIbllllll1;
    private float bpbbpOxqjGWQAsycX11ll1l1;
    private float bpdqqiQNVROMLC1ll1l1l11;
    private int bppbpdbCeZVhQNTixBml1lll11l;
    private bpdqqiQNVROMLC1ll1l1l11 bpppdpppqFAXRSTHUAmVJLvH11lllll1l;
    private boolean bpppqdQjfPiCT111111111;
    private Object bpqbbqTOKdRXac1ll1l1lll;
    private Drawable bpqdqbqpviKiORjqgp1l111l11;
    private int dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
    private int dbbpdqqpdVUhpQ1ll11;
    private Drawable dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1;
    private final z12 dbppbdqpeLmcbs11l11;
    private float ddbbbeXHXx111ll;
    private Drawable dddbpbpNqzZZJmSG1111l;
    private CharSequence ddddbbdqIccDnEitQc1l1l1l;
    private final ddbbbeXHXx111ll ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private final dpbdpqRKAscW1lll1l dpbdpqRKAscW1lll1l;
    private final bdpdqYMMfHmzHyUIbllllll1 dpbdqAKWNZAIXLyehU1lll1lll1;
    private boolean dqdqbpQposEBDyDxIyyz1ll11;
    private Paint dqpdbEevAufTOvPphbjykClll1l11;
    private int dqpqqqbqQyjyB11111l1;
    private Drawable dqqpbqaYiRPLeqRCYteXfDW1l111l11l;
    private final z12 pbppbpqbamJRy11l1l1;
    private CharSequence pdpqbmApOBCmNMwnn1ll111;
    private int ppbdpwWWljzmXXdHNabfWhgjl111l11;
    private final ArrayList<View> ppdqqzXJzQiU11ll11;
    private boolean qbddqbdJBkudFfhX1ll1l111;
    private final ddbbbeXHXx111ll qbdpqpstJKhhKkXrsOGvbWw1l1llll;
    private boolean qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;
    private Drawable qbpbddbpyaPAbpThgWCvm11l11l1;
    private List<bpdqqiQNVROMLC1ll1l1l11> qdqdpyALEmZFGGaahRTIU1ll11;
    private float qppqdpppIauLKaAtRkB11111l;
    private Rect qqbqbddiRRgLpniPxlUfQzP1l1l1l;
    private Matrix qqdbbfmUWwoYYpfYHJZdaUO1111llll;
    private Drawable qqpbppebHUxqEmlGoAJWl1lll;

    public interface bpdqqiQNVROMLC1ll1l1l11 {
        void dbpqdHhmDSIHIJiwc1ll1l1(View view);

        void dpbdbdpbLwkLpObyKsq1lll1(View view);

        void dpbdpqRKAscW1lll1l(View view, float f);

        void dqqppqiKzJi1l1lll1l(int i);
    }

    class dbpqdHhmDSIHIJiwc1ll1l1 implements bdpdqYMMfHmzHyUIbllllll1 {
        final /* synthetic */ DrawerLayout dbpqdHhmDSIHIJiwc1ll1l1;

        dbpqdHhmDSIHIJiwc1ll1l1(DrawerLayout drawerLayout) {
        }

        @Override // p000.bdpdqYMMfHmzHyUIbllllll1
        public boolean perform(View view, bdpdqYMMfHmzHyUIbllllll1.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }
    }

    private class ddbbbeXHXx111ll extends z12.dqqppqiKzJi1l1lll1l {
        private final int dbpqdHhmDSIHIJiwc1ll1l1;
        private z12 dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ DrawerLayout dpbdpqRKAscW1lll1l;
        private final Runnable dqqppqiKzJi1l1lll1l;

        class dbpqdHhmDSIHIJiwc1ll1l1 implements Runnable {
            final /* synthetic */ ddbbbeXHXx111ll dpbdpqRKAscW1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(ddbbbeXHXx111ll ddbbbexhxx111ll) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        ddbbbeXHXx111ll(DrawerLayout drawerLayout, int i) {
        }

        private void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // z12.dqqppqiKzJi1l1lll1l
        public int clampViewPositionHorizontal(View view, int i, int i2) {
        }

        @Override // z12.dqqppqiKzJi1l1lll1l
        public int clampViewPositionVertical(View view, int i, int i2) {
        }

        void dpbdbdpbLwkLpObyKsq1lll1() {
        }

        public void dpbdpqRKAscW1lll1l(z12 z12Var) {
        }

        public void dqqppqiKzJi1l1lll1l() {
        }

        @Override // z12.dqqppqiKzJi1l1lll1l
        public int getViewHorizontalDragRange(View view) {
        }

        @Override // z12.dqqppqiKzJi1l1lll1l
        public void onEdgeDragStarted(int i, int i2) {
        }

        @Override // z12.dqqppqiKzJi1l1lll1l
        public boolean onEdgeLock(int i) {
        }

        @Override // z12.dqqppqiKzJi1l1lll1l
        public void onEdgeTouched(int i, int i2) {
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

    class dpbdbdpbLwkLpObyKsq1lll1 implements View.OnApplyWindowInsetsListener {
        final /* synthetic */ DrawerLayout dbpqdHhmDSIHIJiwc1ll1l1;

        dpbdbdpbLwkLpObyKsq1lll1(DrawerLayout drawerLayout) {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        }
    }

    static final class dpbdpqRKAscW1lll1l extends androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1 {
        dpbdpqRKAscW1lll1l() {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public void onInitializeAccessibilityNodeInfo(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }
    }

    class dqqppqiKzJi1l1lll1l extends androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1 {
        private final Rect dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ DrawerLayout dpbdbdpbLwkLpObyKsq1lll1;

        dqqppqiKzJi1l1lll1l(DrawerLayout drawerLayout) {
        }

        private void dbpqdHhmDSIHIJiwc1ll1l1(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l, ViewGroup viewGroup) {
        }

        private void dpbdbdpbLwkLpObyKsq1lll1(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l2) {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public void onInitializeAccessibilityNodeInfo(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        }
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
    }

    private Drawable bdpdqYMMfHmzHyUIbllllll1() {
    }

    static boolean bpbbpOxqjGWQAsycX11ll1l1(View view) {
    }

    private MotionEvent bppbpdbCeZVhQNTixBml1lll11l(MotionEvent motionEvent, View view) {
    }

    private static boolean bpppdpppqFAXRSTHUAmVJLvH11lllll1l(View view) {
    }

    private void bpqbbpqpqkDmeOUxxUylkHyYgWv11111(View view) {
    }

    private void bpqbbqTOKdRXac1ll1l1lll(Drawable drawable, int i) {
    }

    private void dqbbdddqpLERmaRLiHiDpL1l1l1l(View view, boolean z) {
    }

    private boolean pbppbpqbamJRy11l1l1(MotionEvent motionEvent, View view) {
    }

    private boolean pdpqbmApOBCmNMwnn1ll111(float f, float f2, View view) {
    }

    private Drawable ppdqqzXJzQiU11ll11() {
    }

    static String qbdqqpbqpCWRpIKEKtzoceYOll1ll1l(int i) {
    }

    private boolean qdqdpyALEmZFGGaahRTIU1ll11() {
    }

    private boolean qppqdpppIauLKaAtRkB11111l() {
    }

    private void qqbqbddiRRgLpniPxlUfQzP1l1l1l() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
    }

    int bbdbbpdOJSuInlll111l(View view) {
    }

    View bdddqmITkkeGpsxVXHR1l1llll() {
    }

    void bdqbblVddTYAmqrWwacZmi111ll1(int i, View view) {
    }

    void bpdddqbpEtpkwNYukGjjNs1l111(View view, float f) {
    }

    public void bpdqqiQNVROMLC1ll1l1l11(View view, boolean z) {
    }

    void bpppqdQjfPiCT111111111(View view, float f) {
    }

    public boolean bpqdqbqpviKiORjqgp1l111l11(View view) {
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.view.View
    public void computeScroll() {
    }

    public CharSequence dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1(int i) {
    }

    float dbbpdqqpdVUhpQ1ll11(View view) {
    }

    boolean dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1(View view) {
    }

    void dbppbdqpeLmcbs11l11(View view, float f) {
    }

    public void dbpqdHhmDSIHIJiwc1ll1l1(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
    }

    void ddbbbeXHXx111ll(View view) {
    }

    boolean dddbpbpNqzZZJmSG1111l(View view) {
    }

    public boolean ddddbbdqIccDnEitQc1l1l1l(View view) {
    }

    View ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(int i) {
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
    }

    void dpbdbdpbLwkLpObyKsq1lll1() {
    }

    public void dpbdpqRKAscW1lll1l(View view) {
    }

    public void dpbdqAKWNZAIXLyehU1lll1lll1(int i, int i2) {
    }

    public int dqdqbpQposEBDyDxIyyz1ll11(int i) {
    }

    void dqpdbEevAufTOvPphbjykClll1l11(View view) {
    }

    void dqpqqqbqQyjyB11111l1(boolean z) {
    }

    public void dqqpbqaYiRPLeqRCYteXfDW1l111l11l(View view, boolean z) {
    }

    boolean dqqppqiKzJi1l1lll1l(View view, int i) {
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public float getDrawerElevation() {
    }

    public Drawable getStatusBarBackgroundDrawable() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    protected void onMeasure(int i, int i2) {
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void ppbdpwWWljzmXXdHNabfWhgjl111l11() {
    }

    public int qbddqbdJBkudFfhX1ll1l111(View view) {
    }

    View qbdpqpstJKhhKkXrsOGvbWw1l1llll() {
    }

    public void qbpbddbpyaPAbpThgWCvm11l11l1(View view) {
    }

    public void qqdbbfmUWwoYYpfYHJZdaUO1111llll(Object obj, boolean z) {
    }

    public void qqpbppebHUxqEmlGoAJWl1lll(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    public void setDrawerElevation(float f) {
    }

    @Deprecated
    public void setDrawerListener(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
    }

    public void setDrawerLockMode(int i) {
    }

    public void setScrimColor(int i) {
    }

    public void setStatusBarBackground(Drawable drawable) {
    }

    public void setStatusBarBackgroundColor(int i) {
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
    }

    public void setStatusBarBackground(int i) {
    }

    public static class ppbdpwWWljzmXXdHNabfWhgjl111l11 extends ViewGroup.MarginLayoutParams {
        public int dbpqdHhmDSIHIJiwc1ll1l1;
        float dpbdbdpbLwkLpObyKsq1lll1;
        int dpbdpqRKAscW1lll1l;
        boolean dqqppqiKzJi1l1lll1l;

        public ppbdpwWWljzmXXdHNabfWhgjl111l11(Context context, AttributeSet attributeSet) {
        }

        public ppbdpwWWljzmXXdHNabfWhgjl111l11(int i, int i2) {
        }

        public ppbdpwWWljzmXXdHNabfWhgjl111l11(ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11) {
        }

        public ppbdpwWWljzmXXdHNabfWhgjl111l11(ViewGroup.LayoutParams layoutParams) {
        }

        public ppbdpwWWljzmXXdHNabfWhgjl111l11(ViewGroup.MarginLayoutParams marginLayoutParams) {
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    protected static class dqpqqqbqQyjyB11111l1 extends androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1 {
        public static final Parcelable.Creator<dqpqqqbqQyjyB11111l1> CREATOR = null;
        int bpdqqiQNVROMLC1ll1l1l11;
        int ddbbbeXHXx111ll;
        int dpbdpqRKAscW1lll1l;
        int dqpqqqbqQyjyB11111l1;
        int ppbdpwWWljzmXXdHNabfWhgjl111l11;

        class dbpqdHhmDSIHIJiwc1ll1l1 implements Parcelable.ClassLoaderCreator<dqpqqqbqQyjyB11111l1> {
            dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            }

            public dqpqqqbqQyjyB11111l1 dbpqdHhmDSIHIJiwc1ll1l1(Parcel parcel) {
            }

            public dqpqqqbqQyjyB11111l1 dpbdbdpbLwkLpObyKsq1lll1(Parcel parcel, ClassLoader classLoader) {
            }

            public dqpqqqbqQyjyB11111l1[] dqqppqiKzJi1l1lll1l(int i) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ dqpqqqbqQyjyB11111l1 createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }
        }

        public dqpqqqbqQyjyB11111l1(Parcel parcel, ClassLoader classLoader) {
        }

        @Override // androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        public dqpqqqbqQyjyB11111l1(Parcelable parcelable) {
        }
    }
}
