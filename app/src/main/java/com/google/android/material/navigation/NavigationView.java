package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11;
import androidx.appcompat.widget.qqdbbfmUWwoYYpfYHJZdaUO1111llll;
import androidx.core.view.bdddqmITkkeGpsxVXHR1l1llll;
import androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.ScrimInsetsFrameLayout;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class NavigationView extends ScrimInsetsFrameLayout {
    private static final int[] CHECKED_STATE_SET = null;
    private static final int DEF_STYLE_RES = 0;
    private static final int[] DISABLED_STATE_SET = null;
    private static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    private boolean bottomInsetScrimEnabled;
    private int drawerLayoutCornerSize;
    private int layoutGravity;
    OnNavigationItemSelectedListener listener;
    private final int maxWidth;
    private final NavigationMenu menu;
    private MenuInflater menuInflater;
    private ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private final NavigationMenuPresenter presenter;
    private final RectF shapeClipBounds;
    private Path shapeClipPath;
    private final int[] tmpLocation;
    private boolean topInsetScrimEnabled;

    /* renamed from: com.google.android.material.navigation.NavigationView$1 */
    class C03971 implements bpdqqiQNVROMLC1ll1l1l11.dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ NavigationView this$0;

        C03971(NavigationView navigationView) {
        }

        @Override // androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11.dbpqdHhmDSIHIJiwc1ll1l1
        public boolean onMenuItemSelected(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, MenuItem menuItem) {
        }

        @Override // androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11.dbpqdHhmDSIHIJiwc1ll1l1
        public void onMenuModeChange(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$2 */
    class ViewTreeObserverOnGlobalLayoutListenerC03982 implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ NavigationView this$0;

        ViewTreeObserverOnGlobalLayoutListenerC03982(NavigationView navigationView) {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(MenuItem menuItem);
    }

    public NavigationView(Context context) {
    }

    static /* synthetic */ int[] access$000(NavigationView navigationView) {
    }

    static /* synthetic */ NavigationMenuPresenter access$100(NavigationView navigationView) {
    }

    private ColorStateList createDefaultColorStateList(int i) {
    }

    private Drawable createDefaultItemBackground(qqdbbfmUWwoYYpfYHJZdaUO1111llll qqdbbfmuwwoyypfyhjzdauo1111llll) {
    }

    private Drawable createDefaultItemDrawable(qqdbbfmUWwoYYpfYHJZdaUO1111llll qqdbbfmuwwoyypfyhjzdauo1111llll, ColorStateList colorStateList) {
    }

    private MenuInflater getMenuInflater() {
    }

    private boolean hasShapeAppearance(qqdbbfmUWwoYYpfYHJZdaUO1111llll qqdbbfmuwwoyypfyhjzdauo1111llll) {
    }

    private void maybeUpdateCornerSizeForDrawerLayout(int i, int i2) {
    }

    private void setupInsetScrimsListener() {
    }

    public void addHeaderView(View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    public MenuItem getCheckedItem() {
    }

    public int getDividerInsetEnd() {
    }

    public int getDividerInsetStart() {
    }

    public int getHeaderCount() {
    }

    public View getHeaderView(int i) {
    }

    public Drawable getItemBackground() {
    }

    public int getItemHorizontalPadding() {
    }

    public int getItemIconPadding() {
    }

    public ColorStateList getItemIconTintList() {
    }

    public int getItemMaxLines() {
    }

    public ColorStateList getItemTextColor() {
    }

    public int getItemVerticalPadding() {
    }

    public Menu getMenu() {
    }

    public int getSubheaderInsetEnd() {
    }

    public int getSubheaderInsetStart() {
    }

    public View inflateHeaderView(int i) {
    }

    public void inflateMenu(int i) {
    }

    public boolean isBottomInsetScrimEnabled() {
    }

    public boolean isTopInsetScrimEnabled() {
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    protected void onInsetsChanged(bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll) {
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
    }

    public void removeHeaderView(View view) {
    }

    public void setBottomInsetScrimEnabled(boolean z) {
    }

    public void setCheckedItem(int i) {
    }

    public void setDividerInsetEnd(int i) {
    }

    public void setDividerInsetStart(int i) {
    }

    @Override // android.view.View
    public void setElevation(float f) {
    }

    public void setItemBackground(Drawable drawable) {
    }

    public void setItemBackgroundResource(int i) {
    }

    public void setItemHorizontalPadding(int i) {
    }

    public void setItemHorizontalPaddingResource(int i) {
    }

    public void setItemIconPadding(int i) {
    }

    public void setItemIconPaddingResource(int i) {
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

    public void setItemVerticalPaddingResource(int i) {
    }

    public void setNavigationItemSelectedListener(OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
    }

    public void setSubheaderInsetEnd(int i) {
    }

    public void setSubheaderInsetStart(int i) {
    }

    public void setTopInsetScrimEnabled(boolean z) {
    }

    public static class SavedState extends dbpqdHhmDSIHIJiwc1ll1l1 {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        public Bundle menuState;

        /* renamed from: com.google.android.material.navigation.NavigationView$SavedState$1 */
        class C03991 implements Parcelable.ClassLoaderCreator<SavedState> {
            C03991() {
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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
        }

        @Override // androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        public SavedState(Parcelable parcelable) {
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i) {
    }

    public void setCheckedItem(MenuItem menuItem) {
    }
}
