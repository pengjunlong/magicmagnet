package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.dbpqdHhmDSIHIJiwc1ll1l1;
import androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11;
import androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11;
import androidx.appcompat.widget.ActionMenuView;
import androidx.lifecycle.dqpqqqbqQyjyB11111l1;
import java.util.ArrayList;
import java.util.List;
import p000.dbbbpqvUTKVDNyPZHLllll111l;
import p000.lc0;
import p000.oc0;
import p000.r50;
import p000.sc0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class Toolbar extends ViewGroup implements lc0 {
    private static final String TAG = "Toolbar";
    private dbppbdqpeLmcbs11l11.dbpqdHhmDSIHIJiwc1ll1l1 mActionMenuPresenterCallback;
    private OnBackInvokedCallback mBackInvokedCallback;
    private boolean mBackInvokedCallbackEnabled;
    private OnBackInvokedDispatcher mBackInvokedDispatcher;
    int mButtonGravity;
    ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    private boolean mCollapsible;
    private int mContentInsetEndWithActions;
    private int mContentInsetStartWithNavigation;
    private bpppqdQjfPiCT111111111 mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    View mExpandedActionView;
    private ppbdpwWWljzmXXdHNabfWhgjl111l11 mExpandedMenuPresenter;
    private int mGravity;
    private final ArrayList<View> mHiddenViews;
    private ImageView mLogoView;
    private int mMaxButtonHeight;
    bpdqqiQNVROMLC1ll1l1l11.dbpqdHhmDSIHIJiwc1ll1l1 mMenuBuilderCallback;
    final oc0 mMenuHostHelper;
    ActionMenuView mMenuView;
    private final ActionMenuView.bpdqqiQNVROMLC1ll1l1l11 mMenuViewItemClickListener;
    private ImageButton mNavButtonView;
    ddbbbeXHXx111ll mOnMenuItemClickListener;
    private androidx.appcompat.widget.dqqppqiKzJi1l1lll1l mOuterActionMenuPresenter;
    private Context mPopupContext;
    private int mPopupTheme;
    private ArrayList<MenuItem> mProvidedMenuItems;
    private final Runnable mShowOverflowMenuRunnable;
    private CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private ColorStateList mSubtitleTextColor;
    private TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final ArrayList<View> mTempViews;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private ColorStateList mTitleTextColor;
    private TextView mTitleTextView;
    private dpbdqAKWNZAIXLyehU1lll1lll1 mWrapper;

    static class bpdqqiQNVROMLC1ll1l1l11 {
        static OnBackInvokedDispatcher dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        static OnBackInvokedCallback dpbdbdpbLwkLpObyKsq1lll1(Runnable runnable) {
        }

        static void dpbdpqRKAscW1lll1l(Object obj, Object obj2) {
        }

        static void dqqppqiKzJi1l1lll1l(Object obj, Object obj2) {
        }
    }

    class dbpqdHhmDSIHIJiwc1ll1l1 implements ActionMenuView.bpdqqiQNVROMLC1ll1l1l11 {
        final /* synthetic */ Toolbar dbpqdHhmDSIHIJiwc1ll1l1;

        dbpqdHhmDSIHIJiwc1ll1l1(Toolbar toolbar) {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.bpdqqiQNVROMLC1ll1l1l11
        public boolean onMenuItemClick(MenuItem menuItem) {
        }
    }

    public interface ddbbbeXHXx111ll {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    class dpbdbdpbLwkLpObyKsq1lll1 implements Runnable {
        final /* synthetic */ Toolbar dpbdpqRKAscW1lll1l;

        dpbdbdpbLwkLpObyKsq1lll1(Toolbar toolbar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    class dpbdpqRKAscW1lll1l implements View.OnClickListener {
        final /* synthetic */ Toolbar dpbdpqRKAscW1lll1l;

        dpbdpqRKAscW1lll1l(Toolbar toolbar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    class dqqppqiKzJi1l1lll1l implements bpdqqiQNVROMLC1ll1l1l11.dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ Toolbar dpbdpqRKAscW1lll1l;

        dqqppqiKzJi1l1lll1l(Toolbar toolbar) {
        }

        @Override // androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11.dbpqdHhmDSIHIJiwc1ll1l1
        public boolean onMenuItemSelected(androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, MenuItem menuItem) {
        }

        @Override // androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11.dbpqdHhmDSIHIJiwc1ll1l1
        public void onMenuModeChange(androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
        }
    }

    private class ppbdpwWWljzmXXdHNabfWhgjl111l11 implements androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11 {
        androidx.appcompat.view.menu.dqpqqqbqQyjyB11111l1 bpdqqiQNVROMLC1ll1l1l11;
        androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11 dpbdpqRKAscW1lll1l;
        final /* synthetic */ Toolbar ppbdpwWWljzmXXdHNabfWhgjl111l11;

        ppbdpwWWljzmXXdHNabfWhgjl111l11(Toolbar toolbar) {
        }

        @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
        public boolean collapseItemActionView(androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, androidx.appcompat.view.menu.dqpqqqbqQyjyB11111l1 dqpqqqbqqyjyb11111l1) {
        }

        @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
        public boolean expandItemActionView(androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, androidx.appcompat.view.menu.dqpqqqbqQyjyB11111l1 dqpqqqbqqyjyb11111l1) {
        }

        @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
        public boolean flagActionItems() {
        }

        @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
        public int getId() {
        }

        @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
        public void initForMenu(Context context, androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
        }

        @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
        public void onCloseMenu(androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
        public Parcelable onSaveInstanceState() {
        }

        @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
        public boolean onSubMenuSelected(androidx.appcompat.view.menu.qbdpqpstJKhhKkXrsOGvbWw1l1llll qbdpqpstjkhhkkxrsogvbww1l1llll) {
        }

        @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
        public void updateMenuView(boolean z) {
        }
    }

    public Toolbar(Context context) {
    }

    private void addCustomViewsWithGravity(List<View> list, int i) {
    }

    private void addSystemView(View view, boolean z) {
    }

    private void ensureContentInsets() {
    }

    private void ensureLogoView() {
    }

    private void ensureMenu() {
    }

    private void ensureMenuView() {
    }

    private void ensureNavButtonView() {
    }

    private int getChildHorizontalGravity(int i) {
    }

    private int getChildTop(View view, int i) {
    }

    private int getChildVerticalGravity(int i) {
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
    }

    private int getHorizontalMargins(View view) {
    }

    private MenuInflater getMenuInflater() {
    }

    private int getVerticalMargins(View view) {
    }

    private int getViewListMeasuredWidth(List<View> list, int[] iArr) {
    }

    private boolean isChildOrHidden(View view) {
    }

    private int layoutChildLeft(View view, int i, int[] iArr, int i2) {
    }

    private int layoutChildRight(View view, int i, int[] iArr, int i2) {
    }

    private int measureChildCollapseMargins(View view, int i, int i2, int i3, int i4, int[] iArr) {
    }

    private void measureChildConstrained(View view, int i, int i2, int i3, int i4, int i5) {
    }

    private void onCreateMenu() {
    }

    private void postShowOverflowMenu() {
    }

    private boolean shouldCollapse() {
    }

    private boolean shouldLayout(View view) {
    }

    void addChildrenForExpandedActionView() {
    }

    @Override // p000.lc0
    public void addMenuProvider(sc0 sc0Var) {
    }

    public boolean canShowOverflowMenu() {
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public void collapseActionView() {
    }

    public void dismissPopupMenus() {
    }

    void ensureCollapseButtonView() {
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    public CharSequence getCollapseContentDescription() {
    }

    public Drawable getCollapseIcon() {
    }

    public int getContentInsetEnd() {
    }

    public int getContentInsetEndWithActions() {
    }

    public int getContentInsetLeft() {
    }

    public int getContentInsetRight() {
    }

    public int getContentInsetStart() {
    }

    public int getContentInsetStartWithNavigation() {
    }

    public int getCurrentContentInsetEnd() {
    }

    public int getCurrentContentInsetLeft() {
    }

    public int getCurrentContentInsetRight() {
    }

    public int getCurrentContentInsetStart() {
    }

    public Drawable getLogo() {
    }

    public CharSequence getLogoDescription() {
    }

    public Menu getMenu() {
    }

    View getNavButtonView() {
    }

    public CharSequence getNavigationContentDescription() {
    }

    public Drawable getNavigationIcon() {
    }

    androidx.appcompat.widget.dqqppqiKzJi1l1lll1l getOuterActionMenuPresenter() {
    }

    public Drawable getOverflowIcon() {
    }

    Context getPopupContext() {
    }

    public int getPopupTheme() {
    }

    public CharSequence getSubtitle() {
    }

    final TextView getSubtitleTextView() {
    }

    public CharSequence getTitle() {
    }

    public int getTitleMarginBottom() {
    }

    public int getTitleMarginEnd() {
    }

    public int getTitleMarginStart() {
    }

    public int getTitleMarginTop() {
    }

    final TextView getTitleTextView() {
    }

    public dbbbpqvUTKVDNyPZHLllll111l getWrapper() {
    }

    public boolean hasExpandedActionView() {
    }

    public boolean hideOverflowMenu() {
    }

    public void inflateMenu(int i) {
    }

    public void invalidateMenu() {
    }

    public boolean isBackInvokedCallbackEnabled() {
    }

    public boolean isOverflowMenuShowPending() {
    }

    public boolean isOverflowMenuShowing() {
    }

    public boolean isTitleTruncated() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    void removeChildrenForExpandedActionView() {
    }

    @Override // p000.lc0
    public void removeMenuProvider(sc0 sc0Var) {
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
    }

    public void setCollapseContentDescription(int i) {
    }

    public void setCollapseIcon(int i) {
    }

    public void setCollapsible(boolean z) {
    }

    public void setContentInsetEndWithActions(int i) {
    }

    public void setContentInsetStartWithNavigation(int i) {
    }

    public void setContentInsetsAbsolute(int i, int i2) {
    }

    public void setContentInsetsRelative(int i, int i2) {
    }

    public void setLogo(int i) {
    }

    public void setLogoDescription(int i) {
    }

    public void setMenu(androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, androidx.appcompat.widget.dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l) {
    }

    public void setMenuCallbacks(dbppbdqpeLmcbs11l11.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, bpdqqiQNVROMLC1ll1l1l11.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l12) {
    }

    public void setNavigationContentDescription(int i) {
    }

    public void setNavigationIcon(int i) {
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
    }

    public void setOnMenuItemClickListener(ddbbbeXHXx111ll ddbbbexhxx111ll) {
    }

    public void setOverflowIcon(Drawable drawable) {
    }

    public void setPopupTheme(int i) {
    }

    public void setSubtitle(int i) {
    }

    public void setSubtitleTextAppearance(Context context, int i) {
    }

    public void setSubtitleTextColor(int i) {
    }

    public void setTitle(int i) {
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
    }

    public void setTitleMarginBottom(int i) {
    }

    public void setTitleMarginEnd(int i) {
    }

    public void setTitleMarginStart(int i) {
    }

    public void setTitleMarginTop(int i) {
    }

    public void setTitleTextAppearance(Context context, int i) {
    }

    public void setTitleTextColor(int i) {
    }

    public boolean showOverflowMenu() {
    }

    void updateBackInvokedCallbackState() {
    }

    public static class dqpqqqbqQyjyB11111l1 extends dbpqdHhmDSIHIJiwc1ll1l1.C1909dbpqdHhmDSIHIJiwc1ll1l1 {
        int dpbdbdpbLwkLpObyKsq1lll1;

        public dqpqqqbqQyjyB11111l1(Context context, AttributeSet attributeSet) {
        }

        void dbpqdHhmDSIHIJiwc1ll1l1(ViewGroup.MarginLayoutParams marginLayoutParams) {
        }

        public dqpqqqbqQyjyB11111l1(int i, int i2) {
        }

        public dqpqqqbqQyjyB11111l1(dqpqqqbqQyjyB11111l1 dqpqqqbqqyjyb11111l1) {
        }

        public dqpqqqbqQyjyB11111l1(dbpqdHhmDSIHIJiwc1ll1l1.C1909dbpqdHhmDSIHIJiwc1ll1l1 c1909dbpqdHhmDSIHIJiwc1ll1l1) {
        }

        public dqpqqqbqQyjyB11111l1(ViewGroup.MarginLayoutParams marginLayoutParams) {
        }

        public dqpqqqbqQyjyB11111l1(ViewGroup.LayoutParams layoutParams) {
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
    }

    public void addMenuProvider(sc0 sc0Var, r50 r50Var) {
    }

    @Override // android.view.ViewGroup
    protected dqpqqqbqQyjyB11111l1 generateDefaultLayoutParams() {
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
    }

    public void setCollapseIcon(Drawable drawable) {
    }

    public void setLogo(Drawable drawable) {
    }

    public void setLogoDescription(CharSequence charSequence) {
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
    }

    public void setNavigationIcon(Drawable drawable) {
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
    }

    public static class dqpdbEevAufTOvPphbjykClll1l11 extends androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1 {
        public static final Parcelable.Creator<dqpdbEevAufTOvPphbjykClll1l11> CREATOR = null;
        boolean bpdqqiQNVROMLC1ll1l1l11;
        int dpbdpqRKAscW1lll1l;

        class dbpqdHhmDSIHIJiwc1ll1l1 implements Parcelable.ClassLoaderCreator<dqpdbEevAufTOvPphbjykClll1l11> {
            dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            }

            public dqpdbEevAufTOvPphbjykClll1l11 dbpqdHhmDSIHIJiwc1ll1l1(Parcel parcel) {
            }

            public dqpdbEevAufTOvPphbjykClll1l11 dpbdbdpbLwkLpObyKsq1lll1(Parcel parcel, ClassLoader classLoader) {
            }

            public dqpdbEevAufTOvPphbjykClll1l11[] dqqppqiKzJi1l1lll1l(int i) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ dqpdbEevAufTOvPphbjykClll1l11 createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }
        }

        public dqpdbEevAufTOvPphbjykClll1l11(Parcel parcel, ClassLoader classLoader) {
        }

        @Override // androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        public dqpdbEevAufTOvPphbjykClll1l11(Parcelable parcelable) {
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(sc0 sc0Var, r50 r50Var, dqpqqqbqQyjyB11111l1.dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l) {
    }

    @Override // android.view.ViewGroup
    public dqpqqqbqQyjyB11111l1 generateLayoutParams(AttributeSet attributeSet) {
    }

    @Override // android.view.ViewGroup
    protected dqpqqqbqQyjyB11111l1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }
}
