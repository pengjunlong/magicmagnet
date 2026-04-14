package com.google.android.material.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p000.bdpdqYMMfHmzHyUIbllllll1;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {
    private static final int DEF_STYLE_RES = 0;
    private final AccessibilityManager accessibilityManager;
    private boolean accessibilityServiceEnabled;
    private BottomSheetBehavior<?> bottomSheetBehavior;
    private final BottomSheetBehavior.BottomSheetCallback bottomSheetCallback;
    private final String clickFeedback;
    private final String clickToCollapseActionLabel;
    private boolean clickToExpand;
    private final String clickToExpandActionLabel;
    private boolean interactable;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDragHandleView$1 */
    class C02961 extends BottomSheetBehavior.BottomSheetCallback {
        final /* synthetic */ BottomSheetDragHandleView this$0;

        C02961(BottomSheetDragHandleView bottomSheetDragHandleView) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View view, int i) {
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDragHandleView$2 */
    class C02972 extends dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ BottomSheetDragHandleView this$0;

        C02972(BottomSheetDragHandleView bottomSheetDragHandleView) {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        }
    }

    public BottomSheetDragHandleView(Context context) {
    }

    static /* synthetic */ void access$000(BottomSheetDragHandleView bottomSheetDragHandleView, int i) {
    }

    static /* synthetic */ boolean access$100(BottomSheetDragHandleView bottomSheetDragHandleView) {
    }

    private void announceAccessibilityEvent(String str) {
    }

    public static /* synthetic */ boolean dqqppqiKzJi1l1lll1l(BottomSheetDragHandleView bottomSheetDragHandleView, View view, bdpdqYMMfHmzHyUIbllllll1.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    private boolean expandOrCollapseBottomSheetIfPossible() {
    }

    private BottomSheetBehavior<?> findParentBottomSheetBehavior() {
    }

    private static View getParentView(View view) {
    }

    private /* synthetic */ boolean lambda$onBottomSheetStateChanged$0(View view, bdpdqYMMfHmzHyUIbllllll1.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    private void onBottomSheetStateChanged(int i) {
    }

    private void setBottomSheetBehavior(BottomSheetBehavior<?> bottomSheetBehavior) {
    }

    private void updateInteractableState() {
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z) {
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet) {
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet, int i) {
    }
}
