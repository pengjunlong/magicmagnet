package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.bdddqmITkkeGpsxVXHR1l1llll;
import java.util.List;
import p000.bn0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class ViewUtils {
    public static final int EDGE_TO_EDGE_FLAGS = 768;

    /* renamed from: com.google.android.material.internal.ViewUtils$1 */
    class RunnableC03861 implements Runnable {
        final /* synthetic */ View val$view;

        RunnableC03861(View view) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.google.android.material.internal.ViewUtils$2 */
    class C03872 implements OnApplyWindowInsetsListener {
        final /* synthetic */ OnApplyWindowInsetsListener val$listener;
        final /* synthetic */ boolean val$paddingBottomSystemWindowInsets;
        final /* synthetic */ boolean val$paddingLeftSystemWindowInsets;
        final /* synthetic */ boolean val$paddingRightSystemWindowInsets;

        C03872(boolean z, boolean z2, boolean z3, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        }

        @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
        public bdddqmITkkeGpsxVXHR1l1llll onApplyWindowInsets(View view, bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll, RelativePadding relativePadding) {
        }
    }

    /* renamed from: com.google.android.material.internal.ViewUtils$3 */
    class C03883 implements bn0 {
        final /* synthetic */ RelativePadding val$initialPadding;
        final /* synthetic */ OnApplyWindowInsetsListener val$listener;

        C03883(OnApplyWindowInsetsListener onApplyWindowInsetsListener, RelativePadding relativePadding) {
        }

        @Override // p000.bn0
        public bdddqmITkkeGpsxVXHR1l1llll onApplyWindowInsets(View view, bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll) {
        }
    }

    /* renamed from: com.google.android.material.internal.ViewUtils$4 */
    class ViewOnAttachStateChangeListenerC03894 implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC03894() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface OnApplyWindowInsetsListener {
        bdddqmITkkeGpsxVXHR1l1llll onApplyWindowInsets(View view, bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll, RelativePadding relativePadding);
    }

    private ViewUtils() {
    }

    public static void addOnGlobalLayoutListener(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
    }

    public static Rect calculateRectFromBounds(View view) {
    }

    public static void doOnApplyWindowInsets(View view, AttributeSet attributeSet, int i, int i2) {
    }

    public static float dpToPx(Context context, int i) {
    }

    public static Integer getBackgroundColor(View view) {
    }

    public static List<View> getChildren(View view) {
    }

    public static ViewGroup getContentView(View view) {
    }

    public static ViewOverlayImpl getContentViewOverlay(View view) {
    }

    private static InputMethodManager getInputMethodManager(View view) {
    }

    public static ViewOverlayImpl getOverlay(View view) {
    }

    public static float getParentAbsoluteElevation(View view) {
    }

    public static void hideKeyboard(View view) {
    }

    public static boolean isLayoutRtl(View view) {
    }

    public static PorterDuff.Mode parseTintMode(int i, PorterDuff.Mode mode) {
    }

    public static void removeOnGlobalLayoutListener(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
    }

    public static void requestApplyInsetsWhenAttached(View view) {
    }

    public static void requestFocusAndShowKeyboard(View view) {
    }

    public static void setBoundsFromRect(View view, Rect rect) {
    }

    public static void showKeyboard(View view) {
    }

    public static Rect calculateRectFromBounds(View view, int i) {
    }

    public static void doOnApplyWindowInsets(View view, AttributeSet attributeSet, int i, int i2, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
    }

    public static void hideKeyboard(View view, boolean z) {
    }

    public static void removeOnGlobalLayoutListener(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
    }

    public static void showKeyboard(View view, boolean z) {
    }

    public static class RelativePadding {
        public int bottom;
        public int end;
        public int start;
        public int top;

        public RelativePadding(int i, int i2, int i3, int i4) {
        }

        public void applyToView(View view) {
        }

        public RelativePadding(RelativePadding relativePadding) {
        }
    }

    public static void doOnApplyWindowInsets(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
    }
}
