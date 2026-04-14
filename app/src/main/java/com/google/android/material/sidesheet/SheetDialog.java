package com.google.android.material.sidesheet;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.ppbdpwWWljzmXXdHNabfWhgjl111l11;
import com.google.android.material.sidesheet.SheetCallback;
import p000.dqqpbqaYiRPLeqRCYteXfDW1l111l11l;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
abstract class SheetDialog<C extends SheetCallback> extends ppbdpwWWljzmXXdHNabfWhgjl111l11 {
    private static final int COORDINATOR_LAYOUT_ID = 0;
    private static final int TOUCH_OUTSIDE_ID = 0;
    private Sheet<C> behavior;
    boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    private FrameLayout container;
    boolean dismissWithAnimation;
    private FrameLayout sheet;

    /* renamed from: com.google.android.material.sidesheet.SheetDialog$1 */
    class C04411 extends androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ SheetDialog this$0;

        C04411(SheetDialog sheetDialog) {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public void onInitializeAccessibilityNodeInfo(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        }
    }

    SheetDialog(Context context) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(SheetDialog sheetDialog, View view) {
    }

    private void ensureContainerAndBehavior() {
    }

    private FrameLayout getContainer() {
    }

    private FrameLayout getSheet() {
    }

    private static int getThemeResId(Context context, int i, int i2, int i3) {
    }

    private /* synthetic */ void lambda$wrapInSheet$0(View view) {
    }

    private boolean shouldWindowCloseOnTouchOutside() {
    }

    private View wrapInSheet(int i, View view, ViewGroup.LayoutParams layoutParams) {
    }

    abstract void addSheetCancelOnHideCallback(Sheet<C> sheet);

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    Sheet<C> getBehavior() {
    }

    abstract Sheet<C> getBehaviorFromSheet(FrameLayout frameLayout);

    abstract int getDialogId();

    abstract int getLayoutResId();

    abstract int getStateOnStart();

    public boolean isDismissWithSheetAnimationEnabled() {
    }

    @Override // androidx.appcompat.app.ppbdpwWWljzmXXdHNabfWhgjl111l11, androidx.activity.dpbdbdpbLwkLpObyKsq1lll1, android.app.Dialog
    protected void onCreate(Bundle bundle) {
    }

    @Override // androidx.activity.dpbdbdpbLwkLpObyKsq1lll1, android.app.Dialog
    protected void onStart() {
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

    public void setDismissWithSheetAnimationEnabled(boolean z) {
    }

    SheetDialog(Context context, int i, int i2, int i3) {
    }

    @Override // androidx.appcompat.app.ppbdpwWWljzmXXdHNabfWhgjl111l11, androidx.activity.dpbdbdpbLwkLpObyKsq1lll1, android.app.Dialog
    public void setContentView(View view) {
    }

    @Override // androidx.appcompat.app.ppbdpwWWljzmXXdHNabfWhgjl111l11, androidx.activity.dpbdbdpbLwkLpObyKsq1lll1, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
    }
}
