package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11;
import androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11;
import androidx.appcompat.view.menu.dqpqqqbqQyjyB11111l1;
import androidx.appcompat.view.menu.pbppbpqbamJRy11l1l1;
import androidx.appcompat.view.menu.qbdpqpstJKhhKkXrsOGvbWw1l1llll;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.bdddqmITkkeGpsxVXHR1l1llll;
import java.util.ArrayList;
import p000.dqqpbqaYiRPLeqRCYteXfDW1l111l11l;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class NavigationMenuPresenter implements dbppbdqpeLmcbs11l11 {
    public static final int NO_TEXT_APPEARANCE_SET = 0;
    private static final String STATE_ADAPTER = "android:menu:adapter";
    private static final String STATE_HEADER = "android:menu:header";
    private static final String STATE_HIERARCHY = "android:menu:list";
    NavigationMenuAdapter adapter;
    private dbppbdqpeLmcbs11l11.dbpqdHhmDSIHIJiwc1ll1l1 callback;
    int dividerInsetEnd;
    int dividerInsetStart;
    boolean hasCustomItemIconSize;
    LinearLayout headerLayout;
    ColorStateList iconTintList;
    private int id;
    boolean isBehindStatusBar;
    Drawable itemBackground;
    RippleDrawable itemForeground;
    int itemHorizontalPadding;
    int itemIconPadding;
    int itemIconSize;
    private int itemMaxLines;
    int itemVerticalPadding;
    LayoutInflater layoutInflater;
    bpdqqiQNVROMLC1ll1l1l11 menu;
    private NavigationMenuView menuView;
    final View.OnClickListener onClickListener;
    private int overScrollMode;
    int paddingSeparator;
    private int paddingTopDefault;
    ColorStateList subheaderColor;
    int subheaderInsetEnd;
    int subheaderInsetStart;
    int subheaderTextAppearance;
    int textAppearance;
    ColorStateList textColor;

    /* renamed from: com.google.android.material.internal.NavigationMenuPresenter$1 */
    class ViewOnClickListenerC03761 implements View.OnClickListener {
        final /* synthetic */ NavigationMenuPresenter this$0;

        ViewOnClickListenerC03761(NavigationMenuPresenter navigationMenuPresenter) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    private static class HeaderViewHolder extends ViewHolder {
        public HeaderViewHolder(View view) {
        }
    }

    private class NavigationMenuAdapter extends RecyclerView.ddbbbeXHXx111ll<ViewHolder> {
        private static final String STATE_ACTION_VIEWS = "android:menu:action_views";
        private static final String STATE_CHECKED_ITEM = "android:menu:checked";
        private static final int VIEW_TYPE_HEADER = 3;
        private static final int VIEW_TYPE_NORMAL = 0;
        private static final int VIEW_TYPE_SEPARATOR = 2;
        private static final int VIEW_TYPE_SUBHEADER = 1;
        private dqpqqqbqQyjyB11111l1 checkedItem;
        private final ArrayList<NavigationMenuItem> items;
        final /* synthetic */ NavigationMenuPresenter this$0;
        private boolean updateSuspended;

        /* renamed from: com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuAdapter$1 */
        class C03771 extends androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1 {
            final /* synthetic */ NavigationMenuAdapter this$1;
            final /* synthetic */ boolean val$isHeader;
            final /* synthetic */ int val$position;

            C03771(NavigationMenuAdapter navigationMenuAdapter, int i, boolean z) {
            }

            @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
            public void onInitializeAccessibilityNodeInfo(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
            }
        }

        NavigationMenuAdapter(NavigationMenuPresenter navigationMenuPresenter) {
        }

        static /* synthetic */ int access$100(NavigationMenuAdapter navigationMenuAdapter, int i) {
        }

        private int adjustItemPositionForA11yDelegate(int i) {
        }

        private void appendTransparentIconIfMissing(int i, int i2) {
        }

        private void prepareMenuItems() {
        }

        private void setAccessibilityDelegate(View view, int i, boolean z) {
        }

        public Bundle createInstanceState() {
        }

        public dqpqqqbqQyjyB11111l1 getCheckedItem() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public int getItemCount() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public long getItemId(int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public int getItemViewType(int i) {
        }

        int getRowCount() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public /* bridge */ /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public /* bridge */ /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public /* bridge */ /* synthetic */ void onViewRecycled(ViewHolder viewHolder) {
        }

        public void restoreInstanceState(Bundle bundle) {
        }

        public void setCheckedItem(dqpqqqbqQyjyB11111l1 dqpqqqbqqyjyb11111l1) {
        }

        public void setUpdateSuspended(boolean z) {
        }

        public void update() {
        }

        /* renamed from: onBindViewHolder, reason: avoid collision after fix types in other method */
        public void onBindViewHolder2(ViewHolder viewHolder, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        /* renamed from: onCreateViewHolder, reason: avoid collision after fix types in other method */
        public ViewHolder onCreateViewHolder2(ViewGroup viewGroup, int i) {
        }

        /* renamed from: onViewRecycled, reason: avoid collision after fix types in other method */
        public void onViewRecycled2(ViewHolder viewHolder) {
        }
    }

    private static class NavigationMenuHeaderItem implements NavigationMenuItem {
        NavigationMenuHeaderItem() {
        }
    }

    private interface NavigationMenuItem {
    }

    private static class NavigationMenuSeparatorItem implements NavigationMenuItem {
        private final int paddingBottom;
        private final int paddingTop;

        public NavigationMenuSeparatorItem(int i, int i2) {
        }

        public int getPaddingBottom() {
        }

        public int getPaddingTop() {
        }
    }

    private static class NavigationMenuTextItem implements NavigationMenuItem {
        private final dqpqqqbqQyjyB11111l1 menuItem;
        boolean needsEmptyIcon;

        NavigationMenuTextItem(dqpqqqbqQyjyB11111l1 dqpqqqbqqyjyb11111l1) {
        }

        public dqpqqqbqQyjyB11111l1 getMenuItem() {
        }
    }

    private class NavigationMenuViewAccessibilityDelegate extends bdddqmITkkeGpsxVXHR1l1llll {
        final /* synthetic */ NavigationMenuPresenter this$0;

        NavigationMenuViewAccessibilityDelegate(NavigationMenuPresenter navigationMenuPresenter, RecyclerView recyclerView) {
        }

        @Override // androidx.recyclerview.widget.bdddqmITkkeGpsxVXHR1l1llll, androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public void onInitializeAccessibilityNodeInfo(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }
    }

    private static class NormalViewHolder extends ViewHolder {
        public NormalViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
        }
    }

    private static class SeparatorViewHolder extends ViewHolder {
        public SeparatorViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        }
    }

    private static class SubheaderViewHolder extends ViewHolder {
        public SubheaderViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        }
    }

    private static abstract class ViewHolder extends RecyclerView.bpqbbqTOKdRXac1ll1l1lll {
        public ViewHolder(View view) {
        }
    }

    static /* synthetic */ int access$000(NavigationMenuPresenter navigationMenuPresenter) {
    }

    private void updateTopPadding() {
    }

    public void addHeaderView(View view) {
    }

    @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
    public boolean collapseItemActionView(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, dqpqqqbqQyjyB11111l1 dqpqqqbqqyjyb11111l1) {
    }

    public void dispatchApplyWindowInsets(androidx.core.view.bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll) {
    }

    @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
    public boolean expandItemActionView(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, dqpqqqbqQyjyB11111l1 dqpqqqbqqyjyb11111l1) {
    }

    @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
    public boolean flagActionItems() {
    }

    public dqpqqqbqQyjyB11111l1 getCheckedItem() {
    }

    public int getDividerInsetEnd() {
    }

    public int getDividerInsetStart() {
    }

    public int getHeaderCount() {
    }

    public View getHeaderView(int i) {
    }

    @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
    public int getId() {
    }

    public Drawable getItemBackground() {
    }

    public int getItemHorizontalPadding() {
    }

    public int getItemIconPadding() {
    }

    public int getItemMaxLines() {
    }

    public ColorStateList getItemTextColor() {
    }

    public ColorStateList getItemTintList() {
    }

    public int getItemVerticalPadding() {
    }

    public pbppbpqbamJRy11l1l1 getMenuView(ViewGroup viewGroup) {
    }

    public int getSubheaderInsetEnd() {
    }

    public int getSubheaderInsetStart() {
    }

    public View inflateHeaderView(int i) {
    }

    @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
    public void initForMenu(Context context, bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
    }

    public boolean isBehindStatusBar() {
    }

    @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
    public void onCloseMenu(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
    public Parcelable onSaveInstanceState() {
    }

    @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
    public boolean onSubMenuSelected(qbdpqpstJKhhKkXrsOGvbWw1l1llll qbdpqpstjkhhkkxrsogvbww1l1llll) {
    }

    public void removeHeaderView(View view) {
    }

    public void setBehindStatusBar(boolean z) {
    }

    @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
    public void setCallback(dbppbdqpeLmcbs11l11.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    public void setCheckedItem(dqpqqqbqQyjyB11111l1 dqpqqqbqqyjyb11111l1) {
    }

    public void setDividerInsetEnd(int i) {
    }

    public void setDividerInsetStart(int i) {
    }

    public void setId(int i) {
    }

    public void setItemBackground(Drawable drawable) {
    }

    public void setItemForeground(RippleDrawable rippleDrawable) {
    }

    public void setItemHorizontalPadding(int i) {
    }

    public void setItemIconPadding(int i) {
    }

    public void setItemIconSize(int i) {
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
    }

    public void setItemMaxLines(int i) {
    }

    public void setItemTextAppearance(int i) {
    }

    public void setItemTextColor(ColorStateList colorStateList) {
    }

    public void setItemVerticalPadding(int i) {
    }

    public void setOverScrollMode(int i) {
    }

    public void setSubheaderColor(ColorStateList colorStateList) {
    }

    public void setSubheaderInsetEnd(int i) {
    }

    public void setSubheaderInsetStart(int i) {
    }

    public void setSubheaderTextAppearance(int i) {
    }

    public void setUpdateSuspended(boolean z) {
    }

    @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
    public void updateMenuView(boolean z) {
    }
}
