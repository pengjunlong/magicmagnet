package com.google.android.material.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11;
import androidx.appcompat.view.menu.pbppbpqbamJRy11l1l1;
import androidx.transition.bdddqmITkkeGpsxVXHR1l1llll;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import p000.ev0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class NavigationBarMenuView extends ViewGroup implements pbppbpqbamJRy11l1l1 {
    private static final int[] CHECKED_STATE_SET = null;
    private static final int[] DISABLED_STATE_SET = null;
    private static final int ITEM_POOL_SIZE = 5;
    private static final int NO_PADDING = -1;
    private final SparseArray<BadgeDrawable> badgeDrawables;
    private NavigationBarItemView[] buttons;
    private ColorStateList itemActiveIndicatorColor;
    private boolean itemActiveIndicatorEnabled;
    private int itemActiveIndicatorHeight;
    private int itemActiveIndicatorMarginHorizontal;
    private boolean itemActiveIndicatorResizeable;
    private ShapeAppearanceModel itemActiveIndicatorShapeAppearance;
    private int itemActiveIndicatorWidth;
    private Drawable itemBackground;
    private int itemBackgroundRes;
    private int itemIconSize;
    private ColorStateList itemIconTint;
    private int itemPaddingBottom;
    private int itemPaddingTop;
    private final ev0<NavigationBarItemView> itemPool;
    private ColorStateList itemRippleColor;
    private int itemTextAppearanceActive;
    private int itemTextAppearanceInactive;
    private final ColorStateList itemTextColorDefault;
    private ColorStateList itemTextColorFromUser;
    private int labelVisibilityMode;
    private bpdqqiQNVROMLC1ll1l1l11 menu;
    private final View.OnClickListener onClickListener;
    private final SparseArray<View.OnTouchListener> onTouchListeners;
    private NavigationBarPresenter presenter;
    private int selectedItemId;
    private int selectedItemPosition;
    private final bdddqmITkkeGpsxVXHR1l1llll set;

    /* renamed from: com.google.android.material.navigation.NavigationBarMenuView$1 */
    class ViewOnClickListenerC03931 implements View.OnClickListener {
        final /* synthetic */ NavigationBarMenuView this$0;

        ViewOnClickListenerC03931(NavigationBarMenuView navigationBarMenuView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public NavigationBarMenuView(Context context) {
    }

    static /* synthetic */ NavigationBarPresenter access$000(NavigationBarMenuView navigationBarMenuView) {
    }

    static /* synthetic */ bpdqqiQNVROMLC1ll1l1l11 access$100(NavigationBarMenuView navigationBarMenuView) {
    }

    private Drawable createItemActiveIndicatorDrawable() {
    }

    private NavigationBarItemView getNewItem() {
    }

    private boolean isValidId(int i) {
    }

    private void removeUnusedBadges() {
    }

    private void setBadgeIfNeeded(NavigationBarItemView navigationBarItemView) {
    }

    private void validateMenuItemId(int i) {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void buildMenuView() {
    }

    public ColorStateList createDefaultColorStateList(int i) {
    }

    protected abstract NavigationBarItemView createNavigationBarItemView(Context context);

    public NavigationBarItemView findItemView(int i) {
    }

    public BadgeDrawable getBadge(int i) {
    }

    SparseArray<BadgeDrawable> getBadgeDrawables() {
    }

    public ColorStateList getIconTintList() {
    }

    public ColorStateList getItemActiveIndicatorColor() {
    }

    public boolean getItemActiveIndicatorEnabled() {
    }

    public int getItemActiveIndicatorHeight() {
    }

    public int getItemActiveIndicatorMarginHorizontal() {
    }

    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
    }

    public int getItemActiveIndicatorWidth() {
    }

    public Drawable getItemBackground() {
    }

    @Deprecated
    public int getItemBackgroundRes() {
    }

    public int getItemIconSize() {
    }

    public int getItemPaddingBottom() {
    }

    public int getItemPaddingTop() {
    }

    public ColorStateList getItemRippleColor() {
    }

    public int getItemTextAppearanceActive() {
    }

    public int getItemTextAppearanceInactive() {
    }

    public ColorStateList getItemTextColor() {
    }

    public int getLabelVisibilityMode() {
    }

    protected bpdqqiQNVROMLC1ll1l1l11 getMenu() {
    }

    BadgeDrawable getOrCreateBadge(int i) {
    }

    public int getSelectedItemId() {
    }

    protected int getSelectedItemPosition() {
    }

    public int getWindowAnimations() {
    }

    @Override // androidx.appcompat.view.menu.pbppbpqbamJRy11l1l1
    public void initialize(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
    }

    protected boolean isItemActiveIndicatorResizeable() {
    }

    protected boolean isShifting(int i, int i2) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    void removeBadge(int i) {
    }

    void restoreBadgeDrawables(SparseArray<BadgeDrawable> sparseArray) {
    }

    public void setIconTintList(ColorStateList colorStateList) {
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
    }

    public void setItemActiveIndicatorHeight(int i) {
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
    }

    protected void setItemActiveIndicatorResizeable(boolean z) {
    }

    public void setItemActiveIndicatorShapeAppearance(ShapeAppearanceModel shapeAppearanceModel) {
    }

    public void setItemActiveIndicatorWidth(int i) {
    }

    public void setItemBackground(Drawable drawable) {
    }

    public void setItemBackgroundRes(int i) {
    }

    public void setItemIconSize(int i) {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setItemOnTouchListener(int i, View.OnTouchListener onTouchListener) {
    }

    public void setItemPaddingBottom(int i) {
    }

    public void setItemPaddingTop(int i) {
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
    }

    public void setItemTextAppearanceActive(int i) {
    }

    public void setItemTextAppearanceInactive(int i) {
    }

    public void setItemTextColor(ColorStateList colorStateList) {
    }

    public void setLabelVisibilityMode(int i) {
    }

    public void setPresenter(NavigationBarPresenter navigationBarPresenter) {
    }

    void tryRestoreSelectedItemId(int i) {
    }

    public void updateMenuView() {
    }
}
