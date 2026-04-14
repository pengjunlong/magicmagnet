package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.bdddqmITkkeGpsxVXHR1l1llll;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.CollapsingTextHelper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000.bn0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    private static final int DEFAULT_SCRIM_ANIMATION_DURATION = 600;
    private static final int DEF_STYLE_RES = 0;
    public static final int TITLE_COLLAPSE_MODE_FADE = 1;
    public static final int TITLE_COLLAPSE_MODE_SCALE = 0;
    final CollapsingTextHelper collapsingTextHelper;
    private boolean collapsingTitleEnabled;
    private Drawable contentScrim;
    int currentOffset;
    private boolean drawCollapsingTitle;
    private View dummyView;
    final ElevationOverlayProvider elevationOverlayProvider;
    private int expandedMarginBottom;
    private int expandedMarginEnd;
    private int expandedMarginStart;
    private int expandedMarginTop;
    private int extraMultilineHeight;
    private boolean extraMultilineHeightEnabled;
    private boolean forceApplySystemWindowInsetTop;
    bdddqmITkkeGpsxVXHR1l1llll lastInsets;
    private AppBarLayout.OnOffsetChangedListener onOffsetChangedListener;
    private boolean refreshToolbar;
    private int scrimAlpha;
    private long scrimAnimationDuration;
    private final TimeInterpolator scrimAnimationFadeInInterpolator;
    private final TimeInterpolator scrimAnimationFadeOutInterpolator;
    private ValueAnimator scrimAnimator;
    private int scrimVisibleHeightTrigger;
    private boolean scrimsAreShown;
    Drawable statusBarScrim;
    private int titleCollapseMode;
    private final Rect tmpRect;
    private ViewGroup toolbar;
    private View toolbarDirectChild;
    private int toolbarId;
    private int topInsetApplied;

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$1 */
    class C02601 implements bn0 {
        final /* synthetic */ CollapsingToolbarLayout this$0;

        C02601(CollapsingToolbarLayout collapsingToolbarLayout) {
        }

        @Override // p000.bn0
        public bdddqmITkkeGpsxVXHR1l1llll onApplyWindowInsets(View view, bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll) {
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$2 */
    class C02612 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ CollapsingToolbarLayout this$0;

        C02612(CollapsingToolbarLayout collapsingToolbarLayout) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    private class OffsetUpdateListener implements AppBarLayout.OnOffsetChangedListener {
        final /* synthetic */ CollapsingToolbarLayout this$0;

        OffsetUpdateListener(CollapsingToolbarLayout collapsingToolbarLayout) {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        }
    }

    public interface StaticLayoutBuilderConfigurer extends com.google.android.material.internal.StaticLayoutBuilderConfigurer {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TitleCollapseMode {
    }

    public CollapsingToolbarLayout(Context context) {
    }

    private void animateScrim(int i) {
    }

    private TextUtils.TruncateAt convertEllipsizeToTruncateAt(int i) {
    }

    private void disableLiftOnScrollIfNeeded(AppBarLayout appBarLayout) {
    }

    private void ensureToolbar() {
    }

    private View findDirectChild(View view) {
    }

    private static int getHeightWithMargins(View view) {
    }

    private static CharSequence getToolbarTitle(View view) {
    }

    static ViewOffsetHelper getViewOffsetHelper(View view) {
    }

    private boolean isTitleCollapseFadeMode() {
    }

    private static boolean isToolbar(View view) {
    }

    private boolean isToolbarChild(View view) {
    }

    private void updateCollapsedBounds(boolean z) {
    }

    private void updateContentDescriptionFromTitle() {
    }

    private void updateContentScrimBounds(Drawable drawable, int i, int i2) {
    }

    private void updateDummyView() {
    }

    private void updateTextBounds(int i, int i2, int i3, int i4, boolean z) {
    }

    private void updateTitleFromToolbarIfNeeded() {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    public int getCollapsedTitleGravity() {
    }

    public float getCollapsedTitleTextSize() {
    }

    public Typeface getCollapsedTitleTypeface() {
    }

    public Drawable getContentScrim() {
    }

    public int getExpandedTitleGravity() {
    }

    public int getExpandedTitleMarginBottom() {
    }

    public int getExpandedTitleMarginEnd() {
    }

    public int getExpandedTitleMarginStart() {
    }

    public int getExpandedTitleMarginTop() {
    }

    public float getExpandedTitleTextSize() {
    }

    public Typeface getExpandedTitleTypeface() {
    }

    public int getHyphenationFrequency() {
    }

    public int getLineCount() {
    }

    public float getLineSpacingAdd() {
    }

    public float getLineSpacingMultiplier() {
    }

    public int getMaxLines() {
    }

    final int getMaxOffsetForPinChild(View view) {
    }

    int getScrimAlpha() {
    }

    public long getScrimAnimationDuration() {
    }

    public int getScrimVisibleHeightTrigger() {
    }

    public Drawable getStatusBarScrim() {
    }

    public CharSequence getTitle() {
    }

    public int getTitleCollapseMode() {
    }

    public TimeInterpolator getTitlePositionInterpolator() {
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
    }

    public boolean isExtraMultilineHeightEnabled() {
    }

    public boolean isForceApplySystemWindowInsetTop() {
    }

    public boolean isRtlTextDirectionHeuristicsEnabled() {
    }

    public boolean isTitleEnabled() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
    }

    bdddqmITkkeGpsxVXHR1l1llll onWindowInsetChanged(bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll) {
    }

    public void setCollapsedTitleGravity(int i) {
    }

    public void setCollapsedTitleTextAppearance(int i) {
    }

    public void setCollapsedTitleTextColor(int i) {
    }

    public void setCollapsedTitleTextSize(float f) {
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
    }

    public void setContentScrim(Drawable drawable) {
    }

    public void setContentScrimColor(int i) {
    }

    public void setContentScrimResource(int i) {
    }

    public void setExpandedTitleColor(int i) {
    }

    public void setExpandedTitleGravity(int i) {
    }

    public void setExpandedTitleMargin(int i, int i2, int i3, int i4) {
    }

    public void setExpandedTitleMarginBottom(int i) {
    }

    public void setExpandedTitleMarginEnd(int i) {
    }

    public void setExpandedTitleMarginStart(int i) {
    }

    public void setExpandedTitleMarginTop(int i) {
    }

    public void setExpandedTitleTextAppearance(int i) {
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
    }

    public void setExpandedTitleTextSize(float f) {
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
    }

    public void setHyphenationFrequency(int i) {
    }

    public void setLineSpacingAdd(float f) {
    }

    public void setLineSpacingMultiplier(float f) {
    }

    public void setMaxLines(int i) {
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
    }

    void setScrimAlpha(int i) {
    }

    public void setScrimAnimationDuration(long j) {
    }

    public void setScrimVisibleHeightTrigger(int i) {
    }

    public void setScrimsShown(boolean z) {
    }

    public void setStaticLayoutBuilderConfigurer(StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
    }

    public void setStatusBarScrim(Drawable drawable) {
    }

    public void setStatusBarScrimColor(int i) {
    }

    public void setStatusBarScrimResource(int i) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public void setTitleCollapseMode(int i) {
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
    }

    public void setTitleEnabled(boolean z) {
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    final void updateScrimVisibility() {
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
    }

    private void updateContentScrimBounds(Drawable drawable, View view, int i, int i2) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ FrameLayout.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
    }

    public void setScrimsShown(boolean z, boolean z2) {
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {
        public static final int COLLAPSE_MODE_OFF = 0;
        public static final int COLLAPSE_MODE_PARALLAX = 2;
        public static final int COLLAPSE_MODE_PIN = 1;
        private static final float DEFAULT_PARALLAX_MULTIPLIER = 0.5f;
        int collapseMode;
        float parallaxMult;

        public LayoutParams(Context context, AttributeSet attributeSet) {
        }

        public int getCollapseMode() {
        }

        public float getParallaxMultiplier() {
        }

        public void setCollapseMode(int i) {
        }

        public void setParallaxMultiplier(float f) {
        }

        public LayoutParams(int i, int i2) {
        }

        public LayoutParams(int i, int i2, int i3) {
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
        }

        public LayoutParams(FrameLayout.LayoutParams layoutParams) {
        }

        public LayoutParams(LayoutParams layoutParams) {
        }
    }
}
