package com.google.android.material.sidesheet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class SideSheetDialog extends SheetDialog<SideSheetCallback> {
    private static final int SIDE_SHEET_DIALOG_DEFAULT_THEME_RES = 0;
    private static final int SIDE_SHEET_DIALOG_THEME_ATTR = 0;

    /* renamed from: com.google.android.material.sidesheet.SideSheetDialog$1 */
    class C04441 extends SideSheetCallback {
        final /* synthetic */ SideSheetDialog this$0;

        C04441(SideSheetDialog sideSheetDialog) {
        }

        @Override // com.google.android.material.sidesheet.SideSheetCallback, com.google.android.material.sidesheet.SheetCallback
        public void onSlide(View view, float f) {
        }

        @Override // com.google.android.material.sidesheet.SideSheetCallback, com.google.android.material.sidesheet.SheetCallback
        public void onStateChanged(View view, int i) {
        }
    }

    public SideSheetDialog(Context context) {
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    void addSheetCancelOnHideCallback(Sheet<SideSheetCallback> sheet) {
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog, android.content.DialogInterface
    public /* bridge */ /* synthetic */ void cancel() {
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ Sheet<SideSheetCallback> getBehavior() {
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    Sheet<SideSheetCallback> getBehaviorFromSheet(FrameLayout frameLayout) {
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    int getDialogId() {
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    int getLayoutResId() {
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    int getStateOnStart() {
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ boolean isDismissWithSheetAnimationEnabled() {
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCancelable(boolean z) {
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCanceledOnTouchOutside(boolean z) {
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, androidx.appcompat.app.ppbdpwWWljzmXXdHNabfWhgjl111l11, androidx.activity.dpbdbdpbLwkLpObyKsq1lll1, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(int i) {
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ void setDismissWithSheetAnimationEnabled(boolean z) {
    }

    public SideSheetDialog(Context context, int i) {
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    /* renamed from: getBehavior, reason: avoid collision after fix types in other method */
    public Sheet<SideSheetCallback> getBehavior2() {
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, androidx.appcompat.app.ppbdpwWWljzmXXdHNabfWhgjl111l11, androidx.activity.dpbdbdpbLwkLpObyKsq1lll1, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(View view) {
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, androidx.appcompat.app.ppbdpwWWljzmXXdHNabfWhgjl111l11, androidx.activity.dpbdbdpbLwkLpObyKsq1lll1, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
    }
}
