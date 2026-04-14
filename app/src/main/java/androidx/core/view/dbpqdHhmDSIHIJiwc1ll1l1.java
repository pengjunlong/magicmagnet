package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import p000.dqqpbqaYiRPLeqRCYteXfDW1l111l11l;
import p000.qqpbppebHUxqEmlGoAJWl1lll;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class dbpqdHhmDSIHIJiwc1ll1l1 {
    private static final View.AccessibilityDelegate DEFAULT_DELEGATE = null;
    private final View.AccessibilityDelegate mBridge;
    private final View.AccessibilityDelegate mOriginalDelegate;

    /* renamed from: androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1, reason: collision with other inner class name */
    static final class C1943dbpqdHhmDSIHIJiwc1ll1l1 extends View.AccessibilityDelegate {
        final dbpqdHhmDSIHIJiwc1ll1l1 dbpqdHhmDSIHIJiwc1ll1l1;

        C1943dbpqdHhmDSIHIJiwc1ll1l1(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        }
    }

    static class dpbdbdpbLwkLpObyKsq1lll1 {
        static AccessibilityNodeProvider dbpqdHhmDSIHIJiwc1ll1l1(View.AccessibilityDelegate accessibilityDelegate, View view) {
        }

        static boolean dpbdbdpbLwkLpObyKsq1lll1(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
        }
    }

    public dbpqdHhmDSIHIJiwc1ll1l1() {
    }

    static List<dqqpbqaYiRPLeqRCYteXfDW1l111l11l.dbpqdHhmDSIHIJiwc1ll1l1> getActionList(View view) {
    }

    private boolean isSpanStillValid(ClickableSpan clickableSpan, View view) {
    }

    private boolean performClickableSpanAction(int i, View view) {
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
    }

    public qqpbppebHUxqEmlGoAJWl1lll getAccessibilityNodeProvider(View view) {
    }

    View.AccessibilityDelegate getBridge() {
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
    }

    public void onInitializeAccessibilityNodeInfo(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
    }

    public void sendAccessibilityEvent(View view, int i) {
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
    }

    public dbpqdHhmDSIHIJiwc1ll1l1(View.AccessibilityDelegate accessibilityDelegate) {
    }
}
