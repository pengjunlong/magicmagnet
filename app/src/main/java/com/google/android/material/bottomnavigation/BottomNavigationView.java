package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.bdddqmITkkeGpsxVXHR1l1llll;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class BottomNavigationView extends NavigationBarView {
    private static final int MAX_ITEM_COUNT = 5;

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$1 */
    class C02821 implements ViewUtils.OnApplyWindowInsetsListener {
        final /* synthetic */ BottomNavigationView this$0;

        C02821(BottomNavigationView bottomNavigationView) {
        }

        @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
        public bdddqmITkkeGpsxVXHR1l1llll onApplyWindowInsets(View view, bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll, ViewUtils.RelativePadding relativePadding) {
        }
    }

    @Deprecated
    public interface OnNavigationItemReselectedListener extends NavigationBarView.OnItemReselectedListener {
    }

    @Deprecated
    public interface OnNavigationItemSelectedListener extends NavigationBarView.OnItemSelectedListener {
    }

    public BottomNavigationView(Context context) {
    }

    private void addCompatibilityTopDivider(Context context) {
    }

    private void applyWindowInsets() {
    }

    private int makeMinHeightSpec(int i) {
    }

    private boolean shouldDrawCompatibilityTopDivider() {
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    protected NavigationBarMenuView createNavigationBarMenuView(Context context) {
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
    }

    public boolean isItemHorizontalTranslationEnabled() {
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(OnNavigationItemReselectedListener onNavigationItemReselectedListener) {
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i, int i2) {
    }
}
