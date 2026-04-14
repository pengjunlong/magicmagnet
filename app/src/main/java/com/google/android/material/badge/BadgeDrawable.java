package com.google.android.material.badge;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class BadgeDrawable extends Drawable implements TextDrawableHelper.TextDrawableDelegate {
    public static final int BOTTOM_END = 8388693;
    public static final int BOTTOM_START = 8388691;
    static final String DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX = "+";
    private static final int DEFAULT_STYLE = 0;
    private static final int DEFAULT_THEME_ATTR = 0;
    private static final int MAX_CIRCULAR_BADGE_NUMBER_COUNT = 9;
    public static final int TOP_END = 8388661;
    public static final int TOP_START = 8388659;
    private WeakReference<View> anchorViewRef;
    private final Rect badgeBounds;
    private float badgeCenterX;
    private float badgeCenterY;
    private final WeakReference<Context> contextRef;
    private float cornerRadius;
    private WeakReference<FrameLayout> customBadgeParentRef;
    private float halfBadgeHeight;
    private float halfBadgeWidth;
    private int maxBadgeNumber;
    private final MaterialShapeDrawable shapeDrawable;
    private final BadgeState state;
    private final TextDrawableHelper textDrawableHelper;

    /* renamed from: com.google.android.material.badge.BadgeDrawable$1 */
    class RunnableC02621 implements Runnable {
        final /* synthetic */ BadgeDrawable this$0;
        final /* synthetic */ View val$anchorView;
        final /* synthetic */ FrameLayout val$frameLayout;

        RunnableC02621(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BadgeGravity {
    }

    private BadgeDrawable(Context context, int i, int i2, int i3, BadgeState.State state) {
    }

    private void calculateCenterAndBounds(Context context, Rect rect, View view) {
    }

    public static BadgeDrawable create(Context context) {
    }

    public static BadgeDrawable createFromResource(Context context, int i) {
    }

    static BadgeDrawable createFromSavedState(Context context, BadgeState.State state) {
    }

    private void drawText(Canvas canvas) {
    }

    private String getBadgeText() {
    }

    private int getTotalHorizontalOffsetForState() {
    }

    private int getTotalVerticalOffsetForState() {
    }

    private void onAlphaUpdated() {
    }

    private void onBackgroundColorUpdated() {
    }

    private void onBadgeGravityUpdated() {
    }

    private void onBadgeTextColorUpdated() {
    }

    private void onMaxCharacterCountUpdated() {
    }

    private void onNumberUpdated() {
    }

    private void onVisibilityUpdated() {
    }

    private void restoreState() {
    }

    private void setTextAppearance(TextAppearance textAppearance) {
    }

    private void setTextAppearanceResource(int i) {
    }

    private void tryWrapAnchorInCompatParent(View view) {
    }

    private static void updateAnchorParentToNotClip(View view) {
    }

    private void updateCenterAndBounds() {
    }

    private void updateMaxBadgeNumber() {
    }

    public void clearNumber() {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    int getAdditionalHorizontalOffset() {
    }

    int getAdditionalVerticalOffset() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
    }

    public int getBackgroundColor() {
    }

    public int getBadgeGravity() {
    }

    public Locale getBadgeNumberLocale() {
    }

    public int getBadgeTextColor() {
    }

    public CharSequence getContentDescription() {
    }

    public FrameLayout getCustomBadgeParent() {
    }

    public int getHorizontalOffset() {
    }

    public int getHorizontalOffsetWithText() {
    }

    public int getHorizontalOffsetWithoutText() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
    }

    public int getMaxCharacterCount() {
    }

    public int getNumber() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
    }

    BadgeState.State getSavedState() {
    }

    public int getVerticalOffset() {
    }

    public int getVerticalOffsetWithText() {
    }

    public int getVerticalOffsetWithoutText() {
    }

    public boolean hasNumber() {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
    }

    void setAdditionalHorizontalOffset(int i) {
    }

    void setAdditionalVerticalOffset(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    public void setBackgroundColor(int i) {
    }

    public void setBadgeGravity(int i) {
    }

    public void setBadgeNumberLocale(Locale locale) {
    }

    public void setBadgeTextColor(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(int i) {
    }

    public void setContentDescriptionNumberless(CharSequence charSequence) {
    }

    public void setContentDescriptionQuantityStringsResource(int i) {
    }

    public void setHorizontalOffset(int i) {
    }

    public void setHorizontalOffsetWithText(int i) {
    }

    public void setHorizontalOffsetWithoutText(int i) {
    }

    public void setMaxCharacterCount(int i) {
    }

    public void setNumber(int i) {
    }

    public void setVerticalOffset(int i) {
    }

    public void setVerticalOffsetWithText(int i) {
    }

    public void setVerticalOffsetWithoutText(int i) {
    }

    public void setVisible(boolean z) {
    }

    @Deprecated
    public void updateBadgeCoordinates(View view, ViewGroup viewGroup) {
    }

    public void updateBadgeCoordinates(View view) {
    }

    public void updateBadgeCoordinates(View view, FrameLayout frameLayout) {
    }
}
