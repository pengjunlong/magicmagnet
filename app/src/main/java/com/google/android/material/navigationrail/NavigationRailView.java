package com.google.android.material.navigationrail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.bdddqmITkkeGpsxVXHR1l1llll;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class NavigationRailView extends NavigationBarView {
    private static final int DEFAULT_HEADER_GRAVITY = 49;
    static final int DEFAULT_MENU_GRAVITY = 49;
    static final int MAX_ITEM_COUNT = 7;
    static final int NO_ITEM_MINIMUM_HEIGHT = -1;
    private View headerView;
    private Boolean paddingBottomSystemWindowInsets;
    private Boolean paddingTopSystemWindowInsets;
    private final int topMargin;

    /* renamed from: com.google.android.material.navigationrail.NavigationRailView$1 */
    class C04001 implements ViewUtils.OnApplyWindowInsetsListener {
        final /* synthetic */ NavigationRailView this$0;

        C04001(NavigationRailView navigationRailView) {
        }

        @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
        public bdddqmITkkeGpsxVXHR1l1llll onApplyWindowInsets(View view, bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll, ViewUtils.RelativePadding relativePadding) {
        }
    }

    public NavigationRailView(Context context) {
    }

    static /* synthetic */ Boolean access$000(NavigationRailView navigationRailView) {
    }

    static /* synthetic */ boolean access$100(NavigationRailView navigationRailView, Boolean bool) {
    }

    static /* synthetic */ Boolean access$200(NavigationRailView navigationRailView) {
    }

    private void applyWindowInsets() {
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
    }

    private boolean isHeaderViewVisible() {
    }

    private int makeMinWidthSpec(int i) {
    }

    private boolean shouldApplyWindowInsetPadding(Boolean bool) {
    }

    public void addHeaderView(int i) {
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    protected /* bridge */ /* synthetic */ NavigationBarMenuView createNavigationBarMenuView(Context context) {
    }

    public View getHeaderView() {
    }

    public int getItemMinimumHeight() {
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
    }

    public int getMenuGravity() {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
    }

    public void removeHeaderView() {
    }

    public void setItemMinimumHeight(int i) {
    }

    public void setMenuGravity(int i) {
    }

    public NavigationRailView(Context context, AttributeSet attributeSet) {
    }

    public void addHeaderView(View view) {
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    protected NavigationRailMenuView createNavigationBarMenuView(Context context) {
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i) {
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i, int i2) {
    }
}
