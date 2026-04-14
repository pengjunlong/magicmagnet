package com.google.android.material.bottomsheet;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p000.qqqdbddwLHHSrqKnVcHujUhU1llll;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class BottomSheetDialogFragment extends qqqdbddwLHHSrqKnVcHujUhU1llll {
    private boolean waitingForDismissAllowingStateLoss;

    private class BottomSheetDismissCallback extends BottomSheetBehavior.BottomSheetCallback {
        final /* synthetic */ BottomSheetDialogFragment this$0;

        private BottomSheetDismissCallback(BottomSheetDialogFragment bottomSheetDialogFragment) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View view, int i) {
        }

        /* synthetic */ BottomSheetDismissCallback(BottomSheetDialogFragment bottomSheetDialogFragment, C02951 c02951) {
        }
    }

    public BottomSheetDialogFragment() {
    }

    static /* synthetic */ void access$100(BottomSheetDialogFragment bottomSheetDialogFragment) {
    }

    private void dismissAfterAnimation() {
    }

    private void dismissWithAnimation(BottomSheetBehavior<?> bottomSheetBehavior, boolean z) {
    }

    private boolean tryDismissWithAnimation(boolean z) {
    }

    @Override // androidx.fragment.app.bpdqqiQNVROMLC1ll1l1l11
    public void dismiss() {
    }

    @Override // androidx.fragment.app.bpdqqiQNVROMLC1ll1l1l11
    public void dismissAllowingStateLoss() {
    }

    @Override // p000.qqqdbddwLHHSrqKnVcHujUhU1llll, androidx.fragment.app.bpdqqiQNVROMLC1ll1l1l11
    public Dialog onCreateDialog(Bundle bundle) {
    }

    @SuppressLint({"ValidFragment"})
    public BottomSheetDialogFragment(int i) {
    }
}
