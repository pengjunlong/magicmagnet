package com.google.android.material.search;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.dpbdbdpbLwkLpObyKsq1lll1;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class SearchBar extends Toolbar {
    private static final int DEFAULT_SCROLL_FLAGS = 53;
    private static final int DEF_STYLE_RES = 0;
    private static final String NAMESPACE_APP = "http://schemas.android.com/apk/res-auto";
    private final AccessibilityManager accessibilityManager;
    private MaterialShapeDrawable backgroundShape;
    private View centerView;
    private final boolean defaultMarginsEnabled;
    private final Drawable defaultNavigationIcon;
    private boolean defaultScrollFlagsEnabled;
    private final boolean forceDefaultNavigationOnClickListener;
    private final boolean layoutInflated;
    private int menuResId;
    private Integer navigationIconTint;
    private Drawable originalNavigationIconBackground;
    private final SearchBarAnimationHelper searchBarAnimationHelper;
    private final TextView textView;
    private final boolean tintNavigationIcon;
    private final dpbdbdpbLwkLpObyKsq1lll1.InterfaceC1941dpbdbdpbLwkLpObyKsq1lll1 touchExplorationStateChangeListener;

    /* renamed from: com.google.android.material.search.SearchBar$1 */
    class ViewOnAttachStateChangeListenerC04211 implements View.OnAttachStateChangeListener {
        final /* synthetic */ SearchBar this$0;

        ViewOnAttachStateChangeListenerC04211(SearchBar searchBar) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static abstract class OnLoadAnimationCallback {
        public void onAnimationEnd() {
        }

        public void onAnimationStart() {
        }
    }

    static class SavedState extends androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1 {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        String text;

        /* renamed from: com.google.android.material.search.SearchBar$SavedState$1 */
        class C04221 implements Parcelable.ClassLoaderCreator<SavedState> {
            C04221() {
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

        public SavedState(Parcel parcel) {
        }

        @Override // androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
        }

        public SavedState(Parcelable parcelable) {
        }
    }

    public SearchBar(Context context) {
    }

    static /* synthetic */ AccessibilityManager access$000(SearchBar searchBar) {
    }

    static /* synthetic */ dpbdbdpbLwkLpObyKsq1lll1.InterfaceC1941dpbdbdpbLwkLpObyKsq1lll1 access$100(SearchBar searchBar) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(SearchBar searchBar, boolean z) {
    }

    private int defaultIfZero(int i, int i2) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(SearchBar searchBar) {
    }

    private ColorStateList getCompatBackgroundColorStateList(int i, int i2) {
    }

    private void initBackground(ShapeAppearanceModel shapeAppearanceModel, float f, float f2, int i) {
    }

    private void initNavigationIcon() {
    }

    private void initTextView(int i, String str, String str2) {
    }

    private /* synthetic */ void lambda$new$0(boolean z) {
    }

    private /* synthetic */ void lambda$startOnLoadAnimation$1() {
    }

    private void layoutCenterView() {
    }

    private void layoutChild(View view, int i, int i2, int i3, int i4) {
    }

    private Drawable maybeTintNavigationIcon(Drawable drawable) {
    }

    private void measureCenterView(int i, int i2) {
    }

    private void setDefaultMargins() {
    }

    private void setNavigationIconDecorative(boolean z) {
    }

    private void setOrClearDefaultScrollFlags() {
    }

    private void setupTouchExplorationStateChangeListener() {
    }

    private void validateAttributes(AttributeSet attributeSet) {
    }

    public void addCollapseAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
    }

    public void addExpandAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
    }

    public void addOnLoadAnimationCallback(OnLoadAnimationCallback onLoadAnimationCallback) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
    }

    public void clearText() {
    }

    @CanIgnoreReturnValue
    public boolean collapse(View view) {
    }

    @CanIgnoreReturnValue
    public boolean expand(View view) {
    }

    public View getCenterView() {
    }

    float getCompatElevation() {
    }

    public float getCornerSize() {
    }

    public CharSequence getHint() {
    }

    int getMenuResId() {
    }

    public int getStrokeColor() {
    }

    public float getStrokeWidth() {
    }

    public CharSequence getText() {
    }

    public TextView getTextView() {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void inflateMenu(int i) {
    }

    public boolean isCollapsing() {
    }

    public boolean isDefaultScrollFlagsEnabled() {
    }

    public boolean isExpanding() {
    }

    public boolean isOnLoadAnimationFadeInEnabled() {
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onMeasure(int i, int i2) {
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected Parcelable onSaveInstanceState() {
    }

    public boolean removeCollapseAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
    }

    public boolean removeExpandAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
    }

    public boolean removeOnLoadAnimationCallback(OnLoadAnimationCallback onLoadAnimationCallback) {
    }

    public void setCenterView(View view) {
    }

    public void setDefaultScrollFlagsEnabled(boolean z) {
    }

    @Override // android.view.View
    public void setElevation(float f) {
    }

    public void setHint(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z) {
    }

    public void setStrokeColor(int i) {
    }

    public void setStrokeWidth(float f) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public void startOnLoadAnimation() {
    }

    public void stopOnLoadAnimation() {
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
        private boolean initialized;

        public ScrollingViewBehavior() {
        }

        private void setAppBarLayoutTransparent(AppBarLayout appBarLayout) {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        protected boolean shouldHeaderOverlapScrollingChild() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        }
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
    }

    @CanIgnoreReturnValue
    public boolean collapse(View view, AppBarLayout appBarLayout) {
    }

    @CanIgnoreReturnValue
    public boolean expand(View view, AppBarLayout appBarLayout) {
    }

    public void setHint(int i) {
    }

    public void setText(int i) {
    }

    public SearchBar(Context context, AttributeSet attributeSet, int i) {
    }

    @CanIgnoreReturnValue
    public boolean collapse(View view, AppBarLayout appBarLayout, boolean z) {
    }

    @CanIgnoreReturnValue
    public boolean expand(View view, AppBarLayout appBarLayout, boolean z) {
    }
}
