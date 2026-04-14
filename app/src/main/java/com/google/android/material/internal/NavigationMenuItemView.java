package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.dqpqqqbqQyjyB11111l1;
import androidx.appcompat.view.menu.pbppbpqbamJRy11l1l1;
import p000.dqqpbqaYiRPLeqRCYteXfDW1l111l11l;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements pbppbpqbamJRy11l1l1.dbpqdHhmDSIHIJiwc1ll1l1 {
    private static final int[] CHECKED_STATE_SET = null;
    private final androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1 accessibilityDelegate;
    private FrameLayout actionArea;
    boolean checkable;
    private Drawable emptyDrawable;
    private boolean hasIconTintList;
    private int iconSize;
    private ColorStateList iconTintList;
    private dqpqqqbqQyjyB11111l1 itemData;
    private boolean needsEmptyIcon;
    private final CheckedTextView textView;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$1 */
    class C03751 extends androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ NavigationMenuItemView this$0;

        C03751(NavigationMenuItemView navigationMenuItemView) {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public void onInitializeAccessibilityNodeInfo(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }
    }

    public NavigationMenuItemView(Context context) {
    }

    private void adjustAppearance() {
    }

    private StateListDrawable createDefaultBackground() {
    }

    private void setActionView(View view) {
    }

    private boolean shouldExpandActionArea() {
    }

    @Override // androidx.appcompat.view.menu.pbppbpqbamJRy11l1l1.dbpqdHhmDSIHIJiwc1ll1l1
    public dqpqqqbqQyjyB11111l1 getItemData() {
    }

    @Override // androidx.appcompat.view.menu.pbppbpqbamJRy11l1l1.dbpqdHhmDSIHIJiwc1ll1l1
    public void initialize(dqpqqqbqQyjyB11111l1 dqpqqqbqqyjyb11111l1, int i) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
    }

    @Override // androidx.appcompat.view.menu.pbppbpqbamJRy11l1l1.dbpqdHhmDSIHIJiwc1ll1l1
    public boolean prefersCondensedTitle() {
    }

    public void recycle() {
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setHorizontalPadding(int i) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setIconPadding(int i) {
    }

    public void setIconSize(int i) {
    }

    void setIconTintList(ColorStateList colorStateList) {
    }

    public void setMaxLines(int i) {
    }

    public void setNeedsEmptyIcon(boolean z) {
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearance(int i) {
    }

    public void setTextColor(ColorStateList colorStateList) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public boolean showsIcon() {
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
    }
}
