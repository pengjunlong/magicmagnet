package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11;
import androidx.appcompat.view.menu.pbppbpqbamJRy11l1l1;
import androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class NavigationBarView extends FrameLayout {
    public static final int LABEL_VISIBILITY_AUTO = -1;
    public static final int LABEL_VISIBILITY_LABELED = 1;
    public static final int LABEL_VISIBILITY_SELECTED = 0;
    public static final int LABEL_VISIBILITY_UNLABELED = 2;
    private static final int MENU_PRESENTER_ID = 1;
    private final NavigationBarMenu menu;
    private MenuInflater menuInflater;
    private final NavigationBarMenuView menuView;
    private final NavigationBarPresenter presenter;
    private OnItemReselectedListener reselectedListener;
    private OnItemSelectedListener selectedListener;

    /* renamed from: com.google.android.material.navigation.NavigationBarView$1 */
    class C03951 implements bpdqqiQNVROMLC1ll1l1l11.dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ NavigationBarView this$0;

        C03951(NavigationBarView navigationBarView) {
        }

        @Override // androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11.dbpqdHhmDSIHIJiwc1ll1l1
        public boolean onMenuItemSelected(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, MenuItem menuItem) {
        }

        @Override // androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11.dbpqdHhmDSIHIJiwc1ll1l1
        public void onMenuModeChange(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LabelVisibility {
    }

    public interface OnItemReselectedListener {
        void onNavigationItemReselected(MenuItem menuItem);
    }

    public interface OnItemSelectedListener {
        boolean onNavigationItemSelected(MenuItem menuItem);
    }

    static class SavedState extends dbpqdHhmDSIHIJiwc1ll1l1 {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        Bundle menuPresenterState;

        /* renamed from: com.google.android.material.navigation.NavigationBarView$SavedState$1 */
        class C03961 implements Parcelable.ClassLoaderCreator<SavedState> {
            C03961() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
            }
        }

        public SavedState(Parcelable parcelable) {
        }

        private void readFromParcel(Parcel parcel, ClassLoader classLoader) {
        }

        @Override // androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
        }
    }

    public NavigationBarView(Context context, AttributeSet attributeSet, int i, int i2) {
    }

    static /* synthetic */ OnItemReselectedListener access$000(NavigationBarView navigationBarView) {
    }

    static /* synthetic */ OnItemSelectedListener access$100(NavigationBarView navigationBarView) {
    }

    private MaterialShapeDrawable createMaterialShapeDrawableBackground(Context context) {
    }

    private MenuInflater getMenuInflater() {
    }

    protected abstract NavigationBarMenuView createNavigationBarMenuView(Context context);

    public BadgeDrawable getBadge(int i) {
    }

    public ColorStateList getItemActiveIndicatorColor() {
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
    public int getItemBackgroundResource() {
    }

    public int getItemIconSize() {
    }

    public ColorStateList getItemIconTintList() {
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

    public abstract int getMaxItemCount();

    public Menu getMenu() {
    }

    public pbppbpqbamJRy11l1l1 getMenuView() {
    }

    public BadgeDrawable getOrCreateBadge(int i) {
    }

    public NavigationBarPresenter getPresenter() {
    }

    public int getSelectedItemId() {
    }

    public void inflateMenu(int i) {
    }

    public boolean isItemActiveIndicatorEnabled() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
    }

    public void removeBadge(int i) {
    }

    @Override // android.view.View
    public void setElevation(float f) {
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
    }

    public void setItemActiveIndicatorHeight(int i) {
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
    }

    public void setItemActiveIndicatorShapeAppearance(ShapeAppearanceModel shapeAppearanceModel) {
    }

    public void setItemActiveIndicatorWidth(int i) {
    }

    public void setItemBackground(Drawable drawable) {
    }

    public void setItemBackgroundResource(int i) {
    }

    public void setItemIconSize(int i) {
    }

    public void setItemIconSizeRes(int i) {
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
    }

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

    public void setOnItemReselectedListener(OnItemReselectedListener onItemReselectedListener) {
    }

    public void setOnItemSelectedListener(OnItemSelectedListener onItemSelectedListener) {
    }

    public void setSelectedItemId(int i) {
    }
}
