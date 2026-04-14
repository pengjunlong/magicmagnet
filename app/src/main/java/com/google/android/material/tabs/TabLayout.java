package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.dbpqdHhmDSIHIJiwc1ll1l1;
import com.google.android.material.badge.BadgeDrawable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p000.ev0;

@ViewPager.bpdqqiQNVROMLC1ll1l1l11
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class TabLayout extends HorizontalScrollView {
    private static final int ANIMATION_DURATION = 300;
    static final int DEFAULT_GAP_TEXT_ICON = 8;
    private static final int DEFAULT_HEIGHT = 48;
    private static final int DEFAULT_HEIGHT_WITH_TEXT_ICON = 72;
    private static final int DEF_STYLE_RES = 0;
    static final int FIXED_WRAP_GUTTER_MIN = 16;
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    public static final int GRAVITY_START = 2;
    public static final int INDICATOR_ANIMATION_MODE_ELASTIC = 1;
    public static final int INDICATOR_ANIMATION_MODE_FADE = 2;
    public static final int INDICATOR_ANIMATION_MODE_LINEAR = 0;
    public static final int INDICATOR_GRAVITY_BOTTOM = 0;
    public static final int INDICATOR_GRAVITY_CENTER = 1;
    public static final int INDICATOR_GRAVITY_STRETCH = 3;
    public static final int INDICATOR_GRAVITY_TOP = 2;
    private static final int INVALID_WIDTH = -1;
    private static final String LOG_TAG = "TabLayout";
    public static final int MODE_AUTO = 2;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    private static final int SELECTED_INDICATOR_HEIGHT_DEFAULT = -1;
    public static final int TAB_LABEL_VISIBILITY_LABELED = 1;
    public static final int TAB_LABEL_VISIBILITY_UNLABELED = 0;
    private static final int TAB_MIN_WIDTH_MARGIN = 56;
    private static final ev0<Tab> tabPool = null;
    private AdapterChangeListener adapterChangeListener;
    private int contentInsetStart;
    private BaseOnTabSelectedListener currentVpSelectedListener;
    private final int defaultTabTextAppearance;
    int indicatorPosition;
    boolean inlineLabel;
    int mode;
    private TabLayoutOnPageChangeListener pageChangeListener;
    private dbpqdHhmDSIHIJiwc1ll1l1 pagerAdapter;
    private DataSetObserver pagerAdapterObserver;
    private final int requestedTabMaxWidth;
    private final int requestedTabMinWidth;
    private ValueAnimator scrollAnimator;
    private final int scrollableTabMinWidth;
    private BaseOnTabSelectedListener selectedListener;
    private final ArrayList<BaseOnTabSelectedListener> selectedListeners;
    private Tab selectedTab;
    private int selectedTabTextAppearance;
    float selectedTabTextSize;
    private boolean setupViewPagerImplicitly;
    final SlidingTabIndicator slidingTabIndicator;
    final int tabBackgroundResId;
    int tabGravity;
    ColorStateList tabIconTint;
    PorterDuff.Mode tabIconTintMode;
    int tabIndicatorAnimationDuration;
    int tabIndicatorAnimationMode;
    boolean tabIndicatorFullWidth;
    int tabIndicatorGravity;
    int tabIndicatorHeight;
    private TabIndicatorInterpolator tabIndicatorInterpolator;
    private final TimeInterpolator tabIndicatorTimeInterpolator;
    int tabMaxWidth;
    int tabPaddingBottom;
    int tabPaddingEnd;
    int tabPaddingStart;
    int tabPaddingTop;
    ColorStateList tabRippleColorStateList;
    Drawable tabSelectedIndicator;
    private int tabSelectedIndicatorColor;
    private final int tabTextAppearance;
    ColorStateList tabTextColors;
    float tabTextMultiLineSize;
    float tabTextSize;
    private final ev0<TabView> tabViewPool;
    private final ArrayList<Tab> tabs;
    boolean unboundedRipple;
    ViewPager viewPager;
    private int viewPagerScrollState;

    /* renamed from: com.google.android.material.tabs.TabLayout$1 */
    class C04621 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ TabLayout this$0;

        C04621(TabLayout tabLayout) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    private class AdapterChangeListener implements ViewPager.dqpdbEevAufTOvPphbjykClll1l11 {
        private boolean autoRefresh;
        final /* synthetic */ TabLayout this$0;

        AdapterChangeListener(TabLayout tabLayout) {
        }

        @Override // androidx.viewpager.widget.ViewPager.dqpdbEevAufTOvPphbjykClll1l11
        public void onAdapterChanged(ViewPager viewPager, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l12) {
        }

        void setAutoRefresh(boolean z) {
        }
    }

    @Deprecated
    public interface BaseOnTabSelectedListener<T extends Tab> {
        void onTabReselected(T t);

        void onTabSelected(T t);

        void onTabUnselected(T t);
    }

    public @interface LabelVisibility {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public interface OnTabSelectedListener extends BaseOnTabSelectedListener<Tab> {
    }

    private class PagerAdapterObserver extends DataSetObserver {
        final /* synthetic */ TabLayout this$0;

        PagerAdapterObserver(TabLayout tabLayout) {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
        }
    }

    class SlidingTabIndicator extends LinearLayout {
        ValueAnimator indicatorAnimator;
        private int layoutDirection;
        final /* synthetic */ TabLayout this$0;

        /* renamed from: com.google.android.material.tabs.TabLayout$SlidingTabIndicator$1 */
        class C04631 implements ValueAnimator.AnimatorUpdateListener {
            final /* synthetic */ SlidingTabIndicator this$1;
            final /* synthetic */ View val$currentView;
            final /* synthetic */ View val$targetView;

            C04631(SlidingTabIndicator slidingTabIndicator, View view, View view2) {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
            }
        }

        SlidingTabIndicator(TabLayout tabLayout, Context context) {
        }

        static /* synthetic */ void access$100(SlidingTabIndicator slidingTabIndicator) {
        }

        static /* synthetic */ void access$1800(SlidingTabIndicator slidingTabIndicator, View view, View view2, float f) {
        }

        private void jumpIndicatorToIndicatorPosition() {
        }

        private void jumpIndicatorToPosition(int i) {
        }

        private void jumpIndicatorToSelectedPosition() {
        }

        private void tweenIndicatorPosition(View view, View view2, float f) {
        }

        private void updateOrRecreateIndicatorAnimation(boolean z, int i, int i2) {
        }

        void animateIndicatorToPosition(int i, int i2) {
        }

        boolean childrenNeedLayout() {
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i, int i2) {
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i) {
        }

        void setIndicatorPositionFromTabPosition(int i, float f) {
        }

        void setSelectedIndicatorHeight(int i) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TabGravity {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TabIndicatorAnimationMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TabIndicatorGravity {
    }

    public static class TabLayoutOnPageChangeListener implements ViewPager.dbppbdqpeLmcbs11l11 {
        private int previousScrollState;
        private int scrollState;
        private final WeakReference<TabLayout> tabLayoutRef;

        public TabLayoutOnPageChangeListener(TabLayout tabLayout) {
        }

        @Override // androidx.viewpager.widget.ViewPager.dbppbdqpeLmcbs11l11
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.dbppbdqpeLmcbs11l11
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.dbppbdqpeLmcbs11l11
        public void onPageSelected(int i) {
        }

        void reset() {
        }
    }

    public final class TabView extends LinearLayout {
        private View badgeAnchorView;
        private BadgeDrawable badgeDrawable;
        private Drawable baseBackgroundDrawable;
        private ImageView customIconView;
        private TextView customTextView;
        private View customView;
        private int defaultMaxLines;
        private ImageView iconView;
        private Tab tab;
        private TextView textView;
        final /* synthetic */ TabLayout this$0;

        /* renamed from: com.google.android.material.tabs.TabLayout$TabView$1 */
        class ViewOnLayoutChangeListenerC04641 implements View.OnLayoutChangeListener {
            final /* synthetic */ TabView this$1;
            final /* synthetic */ View val$view;

            ViewOnLayoutChangeListenerC04641(TabView tabView, View view) {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            }
        }

        public TabView(TabLayout tabLayout, Context context) {
        }

        static /* synthetic */ BadgeDrawable access$1000(TabView tabView) {
        }

        static /* synthetic */ void access$1400(TabView tabView, View view) {
        }

        static /* synthetic */ void access$200(TabView tabView, Context context) {
        }

        static /* synthetic */ void access$500(TabView tabView, Canvas canvas) {
        }

        static /* synthetic */ boolean access$600(TabView tabView) {
        }

        static /* synthetic */ BadgeDrawable access$700(TabView tabView) {
        }

        static /* synthetic */ BadgeDrawable access$800(TabView tabView) {
        }

        static /* synthetic */ void access$900(TabView tabView) {
        }

        private void addOnLayoutChangeListener(View view) {
        }

        private float approximateLineWidth(Layout layout, int i, float f) {
        }

        private void clipViewToPaddingForBadge(boolean z) {
        }

        private FrameLayout createPreApi18BadgeAnchorRoot() {
        }

        private void drawBackground(Canvas canvas) {
        }

        private BadgeDrawable getBadge() {
        }

        private FrameLayout getCustomParentForBadge(View view) {
        }

        private BadgeDrawable getOrCreateBadge() {
        }

        private boolean hasBadgeDrawable() {
        }

        private void inflateAndAddDefaultIconView() {
        }

        private void inflateAndAddDefaultTextView() {
        }

        private void removeBadge() {
        }

        private void tryAttachBadgeToAnchor(View view) {
        }

        private void tryRemoveBadgeFromAnchor() {
        }

        private void tryUpdateBadgeAnchor() {
        }

        private void tryUpdateBadgeDrawableBounds(View view) {
        }

        private void updateBackgroundDrawable(Context context) {
        }

        private void updateTextAndIcon(TextView textView, ImageView imageView, boolean z) {
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
        }

        int getContentHeight() {
        }

        int getContentWidth() {
        }

        public Tab getTab() {
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
        }

        @Override // android.view.View
        public boolean performClick() {
        }

        void reset() {
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
        }

        void setTab(Tab tab) {
        }

        final void update() {
        }

        final void updateOrientation() {
        }

        final void updateTab() {
        }
    }

    public static class ViewPagerOnTabSelectedListener implements OnTabSelectedListener {
        private final ViewPager viewPager;

        public ViewPagerOnTabSelectedListener(ViewPager viewPager) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(Tab tab) {
        }
    }

    public TabLayout(Context context) {
    }

    static /* synthetic */ int access$1100(TabLayout tabLayout) {
    }

    static /* synthetic */ int access$1200(TabLayout tabLayout) {
    }

    static /* synthetic */ int access$1300(TabLayout tabLayout) {
    }

    static /* synthetic */ int access$1600(TabLayout tabLayout) {
    }

    static /* synthetic */ TabIndicatorInterpolator access$1700(TabLayout tabLayout) {
    }

    static /* synthetic */ TimeInterpolator access$1900(TabLayout tabLayout) {
    }

    private void addTabFromItemView(TabItem tabItem) {
    }

    private void addTabView(Tab tab) {
    }

    private void addViewInternal(View view) {
    }

    private void animateToTab(int i) {
    }

    private void applyGravityForModeScrollable(int i) {
    }

    private void applyModeAndGravity() {
    }

    private int calculateScrollXForTab(int i, float f) {
    }

    private void configureTab(Tab tab, int i) {
    }

    private static ColorStateList createColorStateList(int i, int i2) {
    }

    private LinearLayout.LayoutParams createLayoutParamsForTabs() {
    }

    private TabView createTabView(Tab tab) {
    }

    private void dispatchTabReselected(Tab tab) {
    }

    private void dispatchTabSelected(Tab tab) {
    }

    private void dispatchTabUnselected(Tab tab) {
    }

    private void ensureScrollAnimator() {
    }

    private int getDefaultHeight() {
    }

    private int getTabMinWidth() {
    }

    private int getTabScrollRange() {
    }

    private boolean isScrollingEnabled() {
    }

    private void removeTabViewAt(int i) {
    }

    private void setSelectedTabView(int i) {
    }

    private void updateAllTabs() {
    }

    private void updateTabViewLayoutParams(LinearLayout.LayoutParams layoutParams) {
    }

    public void addOnTabSelectedListener(OnTabSelectedListener onTabSelectedListener) {
    }

    public void addTab(Tab tab) {
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
    }

    public void clearOnTabSelectedListeners() {
    }

    protected Tab createTabFromPool() {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    public int getSelectedTabPosition() {
    }

    public Tab getTabAt(int i) {
    }

    public int getTabCount() {
    }

    public int getTabGravity() {
    }

    public ColorStateList getTabIconTint() {
    }

    public int getTabIndicatorAnimationMode() {
    }

    public int getTabIndicatorGravity() {
    }

    int getTabMaxWidth() {
    }

    public int getTabMode() {
    }

    public ColorStateList getTabRippleColor() {
    }

    public Drawable getTabSelectedIndicator() {
    }

    public ColorStateList getTabTextColors() {
    }

    public boolean hasUnboundedRipple() {
    }

    public boolean isInlineLabel() {
    }

    public boolean isTabIndicatorFullWidth() {
    }

    public Tab newTab() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    void populateFromPagerAdapter() {
    }

    protected boolean releaseFromTabPool(Tab tab) {
    }

    public void removeAllTabs() {
    }

    public void removeOnTabSelectedListener(OnTabSelectedListener onTabSelectedListener) {
    }

    public void removeTab(Tab tab) {
    }

    public void removeTabAt(int i) {
    }

    public void selectTab(Tab tab) {
    }

    @Override // android.view.View
    public void setElevation(float f) {
    }

    public void setInlineLabel(boolean z) {
    }

    public void setInlineLabelResource(int i) {
    }

    @Deprecated
    public void setOnTabSelectedListener(OnTabSelectedListener onTabSelectedListener) {
    }

    void setPagerAdapter(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, boolean z) {
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
    }

    public void setScrollPosition(int i, float f, boolean z) {
    }

    public void setSelectedTabIndicator(Drawable drawable) {
    }

    public void setSelectedTabIndicatorColor(int i) {
    }

    public void setSelectedTabIndicatorGravity(int i) {
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
    }

    public void setTabGravity(int i) {
    }

    public void setTabIconTint(ColorStateList colorStateList) {
    }

    public void setTabIconTintResource(int i) {
    }

    public void setTabIndicatorAnimationMode(int i) {
    }

    public void setTabIndicatorFullWidth(boolean z) {
    }

    public void setTabMode(int i) {
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
    }

    public void setTabRippleColorResource(int i) {
    }

    public void setTabTextColors(ColorStateList colorStateList) {
    }

    @Deprecated
    public void setTabsFromPagerAdapter(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    public void setUnboundedRipple(boolean z) {
    }

    public void setUnboundedRippleResource(int i) {
    }

    public void setupWithViewPager(ViewPager viewPager) {
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
    }

    void updateTabViews(boolean z) {
    }

    void updateViewPagerScrollState(int i) {
    }

    public static class Tab {
        public static final int INVALID_POSITION = -1;
        private CharSequence contentDesc;
        private View customView;
        private Drawable icon;
        private int id;

        @LabelVisibility
        private int labelVisibilityMode;
        public TabLayout parent;
        private int position;
        private Object tag;
        private CharSequence text;
        public TabView view;

        static /* synthetic */ int access$000(Tab tab) {
        }

        static /* synthetic */ int access$1500(Tab tab) {
        }

        static /* synthetic */ CharSequence access$300(Tab tab) {
        }

        static /* synthetic */ CharSequence access$400(Tab tab) {
        }

        public BadgeDrawable getBadge() {
        }

        public CharSequence getContentDescription() {
        }

        public View getCustomView() {
        }

        public Drawable getIcon() {
        }

        public int getId() {
        }

        public BadgeDrawable getOrCreateBadge() {
        }

        public int getPosition() {
        }

        @LabelVisibility
        public int getTabLabelVisibility() {
        }

        public Object getTag() {
        }

        public CharSequence getText() {
        }

        public boolean isSelected() {
        }

        public void removeBadge() {
        }

        void reset() {
        }

        public void select() {
        }

        @CanIgnoreReturnValue
        public Tab setContentDescription(int i) {
        }

        @CanIgnoreReturnValue
        public Tab setCustomView(View view) {
        }

        @CanIgnoreReturnValue
        public Tab setIcon(Drawable drawable) {
        }

        @CanIgnoreReturnValue
        public Tab setId(int i) {
        }

        void setPosition(int i) {
        }

        @CanIgnoreReturnValue
        public Tab setTabLabelVisibility(@LabelVisibility int i) {
        }

        @CanIgnoreReturnValue
        public Tab setTag(Object obj) {
        }

        @CanIgnoreReturnValue
        public Tab setText(CharSequence charSequence) {
        }

        void updateView() {
        }

        @CanIgnoreReturnValue
        public Tab setCustomView(int i) {
        }

        @CanIgnoreReturnValue
        public Tab setContentDescription(CharSequence charSequence) {
        }

        @CanIgnoreReturnValue
        public Tab setText(int i) {
        }

        @CanIgnoreReturnValue
        public Tab setIcon(int i) {
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
    }

    @Deprecated
    public void addOnTabSelectedListener(BaseOnTabSelectedListener baseOnTabSelectedListener) {
    }

    public void addTab(Tab tab, int i) {
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    @Deprecated
    public void removeOnTabSelectedListener(BaseOnTabSelectedListener baseOnTabSelectedListener) {
    }

    public void selectTab(Tab tab, boolean z) {
    }

    @Deprecated
    public void setOnTabSelectedListener(BaseOnTabSelectedListener baseOnTabSelectedListener) {
    }

    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
    }

    public void setupWithViewPager(ViewPager viewPager, boolean z) {
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i) {
    }

    private void setupWithViewPager(ViewPager viewPager, boolean z, boolean z2) {
    }

    public void addTab(Tab tab, boolean z) {
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
    }

    public void addTab(Tab tab, int i, boolean z) {
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
    }

    public void setTabTextColors(int i, int i2) {
    }

    public void setSelectedTabIndicator(int i) {
    }
}
