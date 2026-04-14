package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.dbpqdHhmDSIHIJiwc1ll1l1;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class TabLayoutMediator {
    private RecyclerView.ddbbbeXHXx111ll<?> adapter;
    private boolean attached;
    private final boolean autoRefresh;
    private TabLayoutOnPageChangeCallback onPageChangeCallback;
    private TabLayout.OnTabSelectedListener onTabSelectedListener;
    private RecyclerView.dbppbdqpeLmcbs11l11 pagerAdapterObserver;
    private final boolean smoothScroll;
    private final TabConfigurationStrategy tabConfigurationStrategy;
    private final TabLayout tabLayout;
    private final dbpqdHhmDSIHIJiwc1ll1l1 viewPager;

    private class PagerAdapterObserver extends RecyclerView.dbppbdqpeLmcbs11l11 {
        final /* synthetic */ TabLayoutMediator this$0;

        PagerAdapterObserver(TabLayoutMediator tabLayoutMediator) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.dbppbdqpeLmcbs11l11
        public void onChanged() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.dbppbdqpeLmcbs11l11
        public void onItemRangeChanged(int i, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.dbppbdqpeLmcbs11l11
        public void onItemRangeInserted(int i, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.dbppbdqpeLmcbs11l11
        public void onItemRangeMoved(int i, int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.dbppbdqpeLmcbs11l11
        public void onItemRangeRemoved(int i, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.dbppbdqpeLmcbs11l11
        public void onItemRangeChanged(int i, int i2, Object obj) {
        }
    }

    public interface TabConfigurationStrategy {
        void onConfigureTab(TabLayout.Tab tab, int i);
    }

    private static class TabLayoutOnPageChangeCallback extends dbpqdHhmDSIHIJiwc1ll1l1.AbstractC1980dbpqdHhmDSIHIJiwc1ll1l1 {
        private int previousScrollState;
        private int scrollState;
        private final WeakReference<TabLayout> tabLayoutRef;

        TabLayoutOnPageChangeCallback(TabLayout tabLayout) {
        }

        @Override // androidx.viewpager2.widget.dbpqdHhmDSIHIJiwc1ll1l1.AbstractC1980dbpqdHhmDSIHIJiwc1ll1l1
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager2.widget.dbpqdHhmDSIHIJiwc1ll1l1.AbstractC1980dbpqdHhmDSIHIJiwc1ll1l1
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager2.widget.dbpqdHhmDSIHIJiwc1ll1l1.AbstractC1980dbpqdHhmDSIHIJiwc1ll1l1
        public void onPageSelected(int i) {
        }

        void reset() {
        }
    }

    private static class ViewPagerOnTabSelectedListener implements TabLayout.OnTabSelectedListener {
        private final boolean smoothScroll;
        private final dbpqdHhmDSIHIJiwc1ll1l1 viewPager;

        ViewPagerOnTabSelectedListener(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, boolean z) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    public TabLayoutMediator(TabLayout tabLayout, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, TabConfigurationStrategy tabConfigurationStrategy) {
    }

    public void attach() {
    }

    public void detach() {
    }

    public boolean isAttached() {
    }

    void populateTabsFromPagerAdapter() {
    }

    public TabLayoutMediator(TabLayout tabLayout, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, boolean z, TabConfigurationStrategy tabConfigurationStrategy) {
    }

    public TabLayoutMediator(TabLayout tabLayout, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, boolean z, boolean z2, TabConfigurationStrategy tabConfigurationStrategy) {
    }
}
