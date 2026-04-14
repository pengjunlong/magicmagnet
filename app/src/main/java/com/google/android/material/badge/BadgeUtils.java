package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1;
import com.google.android.material.internal.ParcelableSparseArray;
import p000.dqqpbqaYiRPLeqRCYteXfDW1l111l11l;

@ExperimentalBadgeUtils
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class BadgeUtils {
    private static final String LOG_TAG = "BadgeUtils";
    public static final boolean USE_COMPAT_PARENT = false;

    /* renamed from: com.google.android.material.badge.BadgeUtils$1 */
    class RunnableC02641 implements Runnable {
        final /* synthetic */ BadgeDrawable val$badgeDrawable;
        final /* synthetic */ FrameLayout val$customBadgeParent;
        final /* synthetic */ int val$menuItemId;
        final /* synthetic */ Toolbar val$toolbar;

        RunnableC02641(Toolbar toolbar, int i, BadgeDrawable badgeDrawable, FrameLayout frameLayout) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.google.android.material.badge.BadgeUtils$2 */
    class C02652 extends dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ BadgeDrawable val$badgeDrawable;

        C02652(View.AccessibilityDelegate accessibilityDelegate, BadgeDrawable badgeDrawable) {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public void onInitializeAccessibilityNodeInfo(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }
    }

    /* renamed from: com.google.android.material.badge.BadgeUtils$3 */
    class C02663 extends dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ BadgeDrawable val$badgeDrawable;

        C02663(BadgeDrawable badgeDrawable) {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public void onInitializeAccessibilityNodeInfo(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }
    }

    /* renamed from: com.google.android.material.badge.BadgeUtils$4 */
    class C02674 extends dbpqdHhmDSIHIJiwc1ll1l1 {
        C02674(View.AccessibilityDelegate accessibilityDelegate) {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public void onInitializeAccessibilityNodeInfo(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }
    }

    private BadgeUtils() {
    }

    static /* synthetic */ void access$000(BadgeDrawable badgeDrawable, View view) {
    }

    private static void attachBadgeContentDescription(BadgeDrawable badgeDrawable, View view) {
    }

    public static void attachBadgeDrawable(BadgeDrawable badgeDrawable, View view) {
    }

    public static SparseArray<BadgeDrawable> createBadgeDrawablesFromSavedStates(Context context, ParcelableSparseArray parcelableSparseArray) {
    }

    public static ParcelableSparseArray createParcelableBadgeStates(SparseArray<BadgeDrawable> sparseArray) {
    }

    private static void detachBadgeContentDescription(View view) {
    }

    public static void detachBadgeDrawable(BadgeDrawable badgeDrawable, View view) {
    }

    static void removeToolbarOffset(BadgeDrawable badgeDrawable) {
    }

    public static void setBadgeDrawableBounds(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
    }

    static void setToolbarOffset(BadgeDrawable badgeDrawable, Resources resources) {
    }

    public static void updateBadgeBounds(Rect rect, float f, float f2, float f3, float f4) {
    }

    public static void attachBadgeDrawable(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
    }

    public static void detachBadgeDrawable(BadgeDrawable badgeDrawable, Toolbar toolbar, int i) {
    }

    public static void attachBadgeDrawable(BadgeDrawable badgeDrawable, Toolbar toolbar, int i) {
    }

    public static void attachBadgeDrawable(BadgeDrawable badgeDrawable, Toolbar toolbar, int i, FrameLayout frameLayout) {
    }
}
