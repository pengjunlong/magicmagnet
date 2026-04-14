package com.google.android.material.navigation;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.dqpqqqbqQyjyB11111l1;
import androidx.appcompat.view.menu.pbppbpqbamJRy11l1l1;
import com.google.android.material.badge.BadgeDrawable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class NavigationBarItemView extends FrameLayout implements pbppbpqbamJRy11l1l1.dbpqdHhmDSIHIJiwc1ll1l1 {
    private static final ActiveIndicatorTransform ACTIVE_INDICATOR_LABELED_TRANSFORM = null;
    private static final ActiveIndicatorTransform ACTIVE_INDICATOR_UNLABELED_TRANSFORM = null;
    private static final int[] CHECKED_STATE_SET = null;
    private static final int INVALID_ITEM_POSITION = -1;
    private ValueAnimator activeIndicatorAnimator;
    private int activeIndicatorDesiredHeight;
    private int activeIndicatorDesiredWidth;
    private boolean activeIndicatorEnabled;
    private int activeIndicatorMarginHorizontal;
    private float activeIndicatorProgress;
    private boolean activeIndicatorResizeable;
    private ActiveIndicatorTransform activeIndicatorTransform;
    private final View activeIndicatorView;
    private BadgeDrawable badgeDrawable;
    private final ImageView icon;
    private final FrameLayout iconContainer;
    private ColorStateList iconTint;
    private boolean initialized;
    private boolean isShifting;
    Drawable itemBackground;
    private dqpqqqbqQyjyB11111l1 itemData;
    private int itemPaddingBottom;
    private int itemPaddingTop;
    private int itemPosition;
    private ColorStateList itemRippleColor;
    private final ViewGroup labelGroup;
    private int labelVisibilityMode;
    private final TextView largeLabel;
    private Drawable originalIconDrawable;
    private float scaleDownFactor;
    private float scaleUpFactor;
    private float shiftAmount;
    private final TextView smallLabel;
    private Drawable wrappedIconDrawable;

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$1 */
    class ViewOnLayoutChangeListenerC03901 implements View.OnLayoutChangeListener {
        final /* synthetic */ NavigationBarItemView this$0;

        ViewOnLayoutChangeListenerC03901(NavigationBarItemView navigationBarItemView) {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$2 */
    class RunnableC03912 implements Runnable {
        final /* synthetic */ NavigationBarItemView this$0;
        final /* synthetic */ int val$width;

        RunnableC03912(NavigationBarItemView navigationBarItemView, int i) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$3 */
    class C03923 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ NavigationBarItemView this$0;
        final /* synthetic */ float val$newProgress;

        C03923(NavigationBarItemView navigationBarItemView, float f) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    private static class ActiveIndicatorTransform {
        private static final float ALPHA_FRACTION = 0.2f;
        private static final float SCALE_X_HIDDEN = 0.4f;
        private static final float SCALE_X_SHOWN = 1.0f;

        private ActiveIndicatorTransform() {
        }

        protected float calculateAlpha(float f, float f2) {
        }

        protected float calculateScaleX(float f, float f2) {
        }

        protected float calculateScaleY(float f, float f2) {
        }

        public void updateForProgress(float f, float f2, View view) {
        }

        /* synthetic */ ActiveIndicatorTransform(ViewOnLayoutChangeListenerC03901 viewOnLayoutChangeListenerC03901) {
        }
    }

    private static class ActiveIndicatorUnlabeledTransform extends ActiveIndicatorTransform {
        private ActiveIndicatorUnlabeledTransform() {
        }

        @Override // com.google.android.material.navigation.NavigationBarItemView.ActiveIndicatorTransform
        protected float calculateScaleY(float f, float f2) {
        }

        /* synthetic */ ActiveIndicatorUnlabeledTransform(ViewOnLayoutChangeListenerC03901 viewOnLayoutChangeListenerC03901) {
        }
    }

    public NavigationBarItemView(Context context) {
    }

    static /* synthetic */ ImageView access$200(NavigationBarItemView navigationBarItemView) {
    }

    static /* synthetic */ void access$300(NavigationBarItemView navigationBarItemView, View view) {
    }

    static /* synthetic */ void access$400(NavigationBarItemView navigationBarItemView, int i) {
    }

    static /* synthetic */ void access$500(NavigationBarItemView navigationBarItemView, float f, float f2) {
    }

    private void calculateTextScaleFactors(float f, float f2) {
    }

    private static Drawable createItemBackgroundCompat(ColorStateList colorStateList) {
    }

    private FrameLayout getCustomParentForBadge(View view) {
    }

    private View getIconOrContainer() {
    }

    private int getItemVisiblePosition() {
    }

    private int getSuggestedIconHeight() {
    }

    private int getSuggestedIconWidth() {
    }

    private boolean hasBadge() {
    }

    private boolean isActiveIndicatorResizeableAndUnlabeled() {
    }

    private void maybeAnimateActiveIndicatorToProgress(float f) {
    }

    private void refreshChecked() {
    }

    private void refreshItemBackground() {
    }

    private void setActiveIndicatorProgress(float f, float f2) {
    }

    private static void setTextAppearanceWithoutFontScaling(TextView textView, int i) {
    }

    private static void setViewScaleValues(View view, float f, float f2, int i) {
    }

    private static void setViewTopMarginAndGravity(View view, int i, int i2) {
    }

    private void tryAttachBadgeToAnchor(View view) {
    }

    private void tryRemoveBadgeFromAnchor(View view) {
    }

    private void tryUpdateBadgeBounds(View view) {
    }

    private void updateActiveIndicatorLayoutParams(int i) {
    }

    private void updateActiveIndicatorTransform() {
    }

    private static void updateViewPaddingBottom(View view, int i) {
    }

    void clear() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
    }

    public Drawable getActiveIndicatorDrawable() {
    }

    public BadgeDrawable getBadge() {
    }

    protected int getItemBackgroundResId() {
    }

    @Override // androidx.appcompat.view.menu.pbppbpqbamJRy11l1l1.dbpqdHhmDSIHIJiwc1ll1l1
    public dqpqqqbqQyjyB11111l1 getItemData() {
    }

    protected int getItemDefaultMarginResId() {
    }

    protected abstract int getItemLayoutResId();

    public int getItemPosition() {
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
    }

    @Override // androidx.appcompat.view.menu.pbppbpqbamJRy11l1l1.dbpqdHhmDSIHIJiwc1ll1l1
    public void initialize(dqpqqqbqQyjyB11111l1 dqpqqqbqqyjyb11111l1, int i) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
    }

    @Override // androidx.appcompat.view.menu.pbppbpqbamJRy11l1l1.dbpqdHhmDSIHIJiwc1ll1l1
    public boolean prefersCondensedTitle() {
    }

    void removeBadge() {
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
    }

    public void setActiveIndicatorEnabled(boolean z) {
    }

    public void setActiveIndicatorHeight(int i) {
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
    }

    public void setActiveIndicatorResizeable(boolean z) {
    }

    public void setActiveIndicatorWidth(int i) {
    }

    void setBadge(BadgeDrawable badgeDrawable) {
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setIconSize(int i) {
    }

    public void setIconTintList(ColorStateList colorStateList) {
    }

    public void setItemBackground(int i) {
    }

    public void setItemPaddingBottom(int i) {
    }

    public void setItemPaddingTop(int i) {
    }

    public void setItemPosition(int i) {
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
    }

    public void setLabelVisibilityMode(int i) {
    }

    public void setShifting(boolean z) {
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearanceActive(int i) {
    }

    public void setTextAppearanceInactive(int i) {
    }

    public void setTextColor(ColorStateList colorStateList) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public boolean showsIcon() {
    }

    public void setItemBackground(Drawable drawable) {
    }
}
