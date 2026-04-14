package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.ppbdpwWWljzmXXdHNabfWhgjl111l11;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.bdddqmITkkeGpsxVXHR1l1llll;
import androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p000.bn0;
import p000.dqqpbqaYiRPLeqRCYteXfDW1l111l11l;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class BottomSheetDialog extends ppbdpwWWljzmXXdHNabfWhgjl111l11 {
    private BottomSheetBehavior<FrameLayout> behavior;
    private FrameLayout bottomSheet;
    private BottomSheetBehavior.BottomSheetCallback bottomSheetCallback;
    boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    private FrameLayout container;
    private CoordinatorLayout coordinator;
    boolean dismissWithAnimation;
    private EdgeToEdgeCallback edgeToEdgeCallback;
    private boolean edgeToEdgeEnabled;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$1 */
    class C02901 implements bn0 {
        final /* synthetic */ BottomSheetDialog this$0;

        C02901(BottomSheetDialog bottomSheetDialog) {
        }

        @Override // p000.bn0
        public bdddqmITkkeGpsxVXHR1l1llll onApplyWindowInsets(View view, bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll) {
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$2 */
    class ViewOnClickListenerC02912 implements View.OnClickListener {
        final /* synthetic */ BottomSheetDialog this$0;

        ViewOnClickListenerC02912(BottomSheetDialog bottomSheetDialog) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$3 */
    class C02923 extends dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ BottomSheetDialog this$0;

        C02923(BottomSheetDialog bottomSheetDialog) {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public void onInitializeAccessibilityNodeInfo(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$4 */
    class ViewOnTouchListenerC02934 implements View.OnTouchListener {
        final /* synthetic */ BottomSheetDialog this$0;

        ViewOnTouchListenerC02934(BottomSheetDialog bottomSheetDialog) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$5 */
    class C02945 extends BottomSheetBehavior.BottomSheetCallback {
        final /* synthetic */ BottomSheetDialog this$0;

        C02945(BottomSheetDialog bottomSheetDialog) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View view, int i) {
        }
    }

    private static class EdgeToEdgeCallback extends BottomSheetBehavior.BottomSheetCallback {
        private final bdddqmITkkeGpsxVXHR1l1llll insetsCompat;
        private final Boolean lightBottomSheet;
        private boolean lightStatusBar;
        private Window window;

        /* synthetic */ EdgeToEdgeCallback(View view, bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll, C02901 c02901) {
        }

        private void setPaddingForPosition(View view) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        void onLayout(View view) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View view, int i) {
        }

        void setWindow(Window window) {
        }

        private EdgeToEdgeCallback(View view, bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll) {
        }
    }

    public BottomSheetDialog(Context context) {
    }

    static /* synthetic */ EdgeToEdgeCallback access$000(BottomSheetDialog bottomSheetDialog) {
    }

    static /* synthetic */ EdgeToEdgeCallback access$002(BottomSheetDialog bottomSheetDialog, EdgeToEdgeCallback edgeToEdgeCallback) {
    }

    static /* synthetic */ BottomSheetBehavior access$100(BottomSheetDialog bottomSheetDialog) {
    }

    static /* synthetic */ FrameLayout access$200(BottomSheetDialog bottomSheetDialog) {
    }

    private FrameLayout ensureContainerAndBehavior() {
    }

    private static int getThemeResId(Context context, int i) {
    }

    @Deprecated
    public static void setLightStatusBar(View view, boolean z) {
    }

    private View wrapInBottomSheet(int i, View view, ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    public BottomSheetBehavior<FrameLayout> getBehavior() {
    }

    public boolean getDismissWithAnimation() {
    }

    public boolean getEdgeToEdgeEnabled() {
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
    }

    @Override // androidx.appcompat.app.ppbdpwWWljzmXXdHNabfWhgjl111l11, androidx.activity.dpbdbdpbLwkLpObyKsq1lll1, android.app.Dialog
    protected void onCreate(Bundle bundle) {
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
    }

    @Override // androidx.activity.dpbdbdpbLwkLpObyKsq1lll1, android.app.Dialog
    protected void onStart() {
    }

    void removeDefaultCallback() {
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
    }

    @Override // androidx.appcompat.app.ppbdpwWWljzmXXdHNabfWhgjl111l11, androidx.activity.dpbdbdpbLwkLpObyKsq1lll1, android.app.Dialog
    public void setContentView(int i) {
    }

    public void setDismissWithAnimation(boolean z) {
    }

    boolean shouldWindowCloseOnTouchOutside() {
    }

    @Override // androidx.appcompat.app.ppbdpwWWljzmXXdHNabfWhgjl111l11, androidx.activity.dpbdbdpbLwkLpObyKsq1lll1, android.app.Dialog
    public void setContentView(View view) {
    }

    @Override // androidx.appcompat.app.ppbdpwWWljzmXXdHNabfWhgjl111l11, androidx.activity.dpbdbdpbLwkLpObyKsq1lll1, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
    }

    public BottomSheetDialog(Context context, int i) {
    }

    protected BottomSheetDialog(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
    }
}
