package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {
    private static final int[] SNACKBAR_BUTTON_STYLE_ATTR = null;
    private static final int[] SNACKBAR_CONTENT_STYLE_ATTRS = null;
    private final AccessibilityManager accessibilityManager;
    private BaseTransientBottomBar.BaseCallback<Snackbar> callback;
    private boolean hasAction;

    public static class Callback extends BaseTransientBottomBar.BaseCallback<Snackbar> {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        /* renamed from: onDismissed, reason: avoid collision after fix types in other method */
        public void onDismissed2(Snackbar snackbar, int i) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public /* bridge */ /* synthetic */ void onDismissed(Snackbar snackbar, int i) {
        }

        /* renamed from: onShown, reason: avoid collision after fix types in other method */
        public void onShown2(Snackbar snackbar) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public /* bridge */ /* synthetic */ void onShown(Snackbar snackbar) {
        }
    }

    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        public SnackbarLayout(Context context) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
        }
    }

    private Snackbar(Context context, ViewGroup viewGroup, View view, ContentViewCallback contentViewCallback) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(Snackbar snackbar, View.OnClickListener onClickListener, View view) {
    }

    private static ViewGroup findSuitableParent(View view) {
    }

    private Button getActionView() {
    }

    private SnackbarContentLayout getContentLayout() {
    }

    private TextView getMessageView() {
    }

    @Deprecated
    protected static boolean hasSnackbarButtonStyleAttr(Context context) {
    }

    private static boolean hasSnackbarContentStyleAttrs(Context context) {
    }

    private /* synthetic */ void lambda$setAction$0(View.OnClickListener onClickListener, View view) {
    }

    public static Snackbar make(View view, CharSequence charSequence, int i) {
    }

    private static Snackbar makeInternal(Context context, View view, CharSequence charSequence, int i) {
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void dismiss() {
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int getDuration() {
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public boolean isShown() {
    }

    @CanIgnoreReturnValue
    public Snackbar setAction(int i, View.OnClickListener onClickListener) {
    }

    @CanIgnoreReturnValue
    public Snackbar setActionTextColor(ColorStateList colorStateList) {
    }

    @CanIgnoreReturnValue
    public Snackbar setBackgroundTint(int i) {
    }

    @CanIgnoreReturnValue
    public Snackbar setBackgroundTintList(ColorStateList colorStateList) {
    }

    @CanIgnoreReturnValue
    public Snackbar setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    @CanIgnoreReturnValue
    @Deprecated
    public Snackbar setCallback(Callback callback) {
    }

    @CanIgnoreReturnValue
    public Snackbar setMaxInlineActionWidth(int i) {
    }

    @CanIgnoreReturnValue
    public Snackbar setText(CharSequence charSequence) {
    }

    @CanIgnoreReturnValue
    public Snackbar setTextColor(ColorStateList colorStateList) {
    }

    @CanIgnoreReturnValue
    public Snackbar setTextMaxLines(int i) {
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void show() {
    }

    public static Snackbar make(Context context, View view, CharSequence charSequence, int i) {
    }

    @CanIgnoreReturnValue
    public Snackbar setAction(CharSequence charSequence, View.OnClickListener onClickListener) {
    }

    @CanIgnoreReturnValue
    public Snackbar setActionTextColor(int i) {
    }

    @CanIgnoreReturnValue
    public Snackbar setText(int i) {
    }

    @CanIgnoreReturnValue
    public Snackbar setTextColor(int i) {
    }

    public static Snackbar make(View view, int i, int i2) {
    }
}
