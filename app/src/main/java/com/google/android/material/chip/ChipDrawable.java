package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.ref.WeakReference;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class ChipDrawable extends MaterialShapeDrawable implements Drawable.Callback, TextDrawableHelper.TextDrawableDelegate {
    private static final boolean DEBUG = false;
    private static final int[] DEFAULT_STATE = null;
    private static final int MAX_CHIP_ICON_HEIGHT = 24;
    private static final String NAMESPACE_APP = "http://schemas.android.com/apk/res-auto";
    private static final ShapeDrawable closeIconRippleMask = null;
    private int alpha;
    private boolean checkable;
    private Drawable checkedIcon;
    private ColorStateList checkedIconTint;
    private boolean checkedIconVisible;
    private ColorStateList chipBackgroundColor;
    private float chipCornerRadius;
    private float chipEndPadding;
    private Drawable chipIcon;
    private float chipIconSize;
    private ColorStateList chipIconTint;
    private boolean chipIconVisible;
    private float chipMinHeight;
    private final Paint chipPaint;
    private float chipStartPadding;
    private ColorStateList chipStrokeColor;
    private float chipStrokeWidth;
    private ColorStateList chipSurfaceColor;
    private Drawable closeIcon;
    private CharSequence closeIconContentDescription;
    private float closeIconEndPadding;
    private Drawable closeIconRipple;
    private float closeIconSize;
    private float closeIconStartPadding;
    private int[] closeIconStateSet;
    private ColorStateList closeIconTint;
    private boolean closeIconVisible;
    private ColorFilter colorFilter;
    private ColorStateList compatRippleColor;
    private final Context context;
    private boolean currentChecked;
    private int currentChipBackgroundColor;
    private int currentChipStrokeColor;
    private int currentChipSurfaceColor;
    private int currentCompatRippleColor;
    private int currentCompositeSurfaceBackgroundColor;
    private int currentTextColor;
    private int currentTint;
    private final Paint debugPaint;
    private WeakReference<Delegate> delegate;
    private final Paint.FontMetrics fontMetrics;
    private boolean hasChipIconTint;
    private MotionSpec hideMotionSpec;
    private float iconEndPadding;
    private float iconStartPadding;
    private boolean isShapeThemingEnabled;
    private int maxWidth;
    private final PointF pointF;
    private final RectF rectF;
    private ColorStateList rippleColor;
    private final Path shapePath;
    private boolean shouldDrawText;
    private MotionSpec showMotionSpec;
    private CharSequence text;
    private final TextDrawableHelper textDrawableHelper;
    private float textEndPadding;
    private float textStartPadding;
    private ColorStateList tint;
    private PorterDuffColorFilter tintFilter;
    private PorterDuff.Mode tintMode;
    private TextUtils.TruncateAt truncateAt;
    private boolean useCompatRipple;

    public interface Delegate {
        void onChipDrawableSizeChange();
    }

    private ChipDrawable(Context context, AttributeSet attributeSet, int i, int i2) {
    }

    private void applyChildDrawable(Drawable drawable) {
    }

    private void calculateChipIconBounds(Rect rect, RectF rectF) {
    }

    private void calculateChipTouchBounds(Rect rect, RectF rectF) {
    }

    private void calculateCloseIconBounds(Rect rect, RectF rectF) {
    }

    private void calculateCloseIconTouchBounds(Rect rect, RectF rectF) {
    }

    private void calculateTextBounds(Rect rect, RectF rectF) {
    }

    private float calculateTextCenterFromBaseline() {
    }

    private boolean canShowCheckedIcon() {
    }

    public static ChipDrawable createFromAttributes(Context context, AttributeSet attributeSet, int i, int i2) {
    }

    public static ChipDrawable createFromResource(Context context, int i) {
    }

    private void drawCheckedIcon(Canvas canvas, Rect rect) {
    }

    private void drawChipBackground(Canvas canvas, Rect rect) {
    }

    private void drawChipIcon(Canvas canvas, Rect rect) {
    }

    private void drawChipStroke(Canvas canvas, Rect rect) {
    }

    private void drawChipSurface(Canvas canvas, Rect rect) {
    }

    private void drawCloseIcon(Canvas canvas, Rect rect) {
    }

    private void drawCompatRipple(Canvas canvas, Rect rect) {
    }

    private void drawDebug(Canvas canvas, Rect rect) {
    }

    private void drawText(Canvas canvas, Rect rect) {
    }

    private float getCurrentChipIconHeight() {
    }

    private float getCurrentChipIconWidth() {
    }

    private ColorFilter getTintColorFilter() {
    }

    private static boolean hasState(int[] iArr, int i) {
    }

    private void loadFromAttributes(AttributeSet attributeSet, int i, int i2) {
    }

    private void setChipSurfaceColor(ColorStateList colorStateList) {
    }

    private boolean showsCheckedIcon() {
    }

    private boolean showsChipIcon() {
    }

    private boolean showsCloseIcon() {
    }

    private void unapplyChildDrawable(Drawable drawable) {
    }

    private void updateCompatRippleColor() {
    }

    @TargetApi(21)
    private void updateFrameworkCloseIconRipple() {
    }

    float calculateChipIconWidth() {
    }

    float calculateCloseIconWidth() {
    }

    Paint.Align calculateTextOriginAndAlignment(Rect rect, PointF pointF) {
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public int getAlpha() {
    }

    public Drawable getCheckedIcon() {
    }

    public ColorStateList getCheckedIconTint() {
    }

    public ColorStateList getChipBackgroundColor() {
    }

    public float getChipCornerRadius() {
    }

    public float getChipEndPadding() {
    }

    public Drawable getChipIcon() {
    }

    public float getChipIconSize() {
    }

    public ColorStateList getChipIconTint() {
    }

    public float getChipMinHeight() {
    }

    public float getChipStartPadding() {
    }

    public ColorStateList getChipStrokeColor() {
    }

    public float getChipStrokeWidth() {
    }

    public void getChipTouchBounds(RectF rectF) {
    }

    public Drawable getCloseIcon() {
    }

    public CharSequence getCloseIconContentDescription() {
    }

    public float getCloseIconEndPadding() {
    }

    public float getCloseIconSize() {
    }

    public float getCloseIconStartPadding() {
    }

    public int[] getCloseIconState() {
    }

    public ColorStateList getCloseIconTint() {
    }

    public void getCloseIconTouchBounds(RectF rectF) {
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
    }

    public TextUtils.TruncateAt getEllipsize() {
    }

    public MotionSpec getHideMotionSpec() {
    }

    public float getIconEndPadding() {
    }

    public float getIconStartPadding() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
    }

    public int getMaxWidth() {
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
    }

    public ColorStateList getRippleColor() {
    }

    public MotionSpec getShowMotionSpec() {
    }

    public CharSequence getText() {
    }

    public TextAppearance getTextAppearance() {
    }

    public float getTextEndPadding() {
    }

    public float getTextStartPadding() {
    }

    public boolean getUseCompatRipple() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
    }

    public boolean isCheckable() {
    }

    @Deprecated
    public boolean isCheckedIconEnabled() {
    }

    public boolean isCheckedIconVisible() {
    }

    @Deprecated
    public boolean isChipIconEnabled() {
    }

    public boolean isChipIconVisible() {
    }

    @Deprecated
    public boolean isCloseIconEnabled() {
    }

    public boolean isCloseIconStateful() {
    }

    public boolean isCloseIconVisible() {
    }

    boolean isShapeThemingEnabled() {
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public boolean isStateful() {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
    }

    protected void onSizeChange() {
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    public void setCheckable(boolean z) {
    }

    public void setCheckableResource(int i) {
    }

    public void setCheckedIcon(Drawable drawable) {
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
    }

    public void setCheckedIconResource(int i) {
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
    }

    public void setCheckedIconTintResource(int i) {
    }

    public void setCheckedIconVisible(int i) {
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
    }

    public void setChipBackgroundColorResource(int i) {
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
    }

    public void setChipEndPadding(float f) {
    }

    public void setChipEndPaddingResource(int i) {
    }

    public void setChipIcon(Drawable drawable) {
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
    }

    public void setChipIconResource(int i) {
    }

    public void setChipIconSize(float f) {
    }

    public void setChipIconSizeResource(int i) {
    }

    public void setChipIconTint(ColorStateList colorStateList) {
    }

    public void setChipIconTintResource(int i) {
    }

    public void setChipIconVisible(int i) {
    }

    public void setChipMinHeight(float f) {
    }

    public void setChipMinHeightResource(int i) {
    }

    public void setChipStartPadding(float f) {
    }

    public void setChipStartPaddingResource(int i) {
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
    }

    public void setChipStrokeColorResource(int i) {
    }

    public void setChipStrokeWidth(float f) {
    }

    public void setChipStrokeWidthResource(int i) {
    }

    public void setCloseIcon(Drawable drawable) {
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
    }

    public void setCloseIconEndPadding(float f) {
    }

    public void setCloseIconEndPaddingResource(int i) {
    }

    public void setCloseIconResource(int i) {
    }

    public void setCloseIconSize(float f) {
    }

    public void setCloseIconSizeResource(int i) {
    }

    public void setCloseIconStartPadding(float f) {
    }

    public void setCloseIconStartPaddingResource(int i) {
    }

    public boolean setCloseIconState(int[] iArr) {
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
    }

    public void setCloseIconTintResource(int i) {
    }

    public void setCloseIconVisible(int i) {
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setDelegate(Delegate delegate) {
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
    }

    public void setHideMotionSpec(MotionSpec motionSpec) {
    }

    public void setHideMotionSpecResource(int i) {
    }

    public void setIconEndPadding(float f) {
    }

    public void setIconEndPaddingResource(int i) {
    }

    public void setIconStartPadding(float f) {
    }

    public void setIconStartPaddingResource(int i) {
    }

    public void setMaxWidth(int i) {
    }

    public void setRippleColor(ColorStateList colorStateList) {
    }

    public void setRippleColorResource(int i) {
    }

    void setShouldDrawText(boolean z) {
    }

    public void setShowMotionSpec(MotionSpec motionSpec) {
    }

    public void setShowMotionSpecResource(int i) {
    }

    public void setText(CharSequence charSequence) {
    }

    public void setTextAppearance(TextAppearance textAppearance) {
    }

    public void setTextAppearanceResource(int i) {
    }

    public void setTextColor(int i) {
    }

    public void setTextEndPadding(float f) {
    }

    public void setTextEndPaddingResource(int i) {
    }

    public void setTextResource(int i) {
    }

    public void setTextSize(float f) {
    }

    public void setTextStartPadding(float f) {
    }

    public void setTextStartPaddingResource(int i) {
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, p000.ks1
    public void setTintList(ColorStateList colorStateList) {
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, p000.ks1
    public void setTintMode(PorterDuff.Mode mode) {
    }

    public void setUseCompatRipple(boolean z) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
    }

    boolean shouldDrawText() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public void setCheckedIconVisible(boolean z) {
    }

    public void setChipIconVisible(boolean z) {
    }

    public void setCloseIconVisible(boolean z) {
    }

    public void setTextColor(ColorStateList colorStateList) {
    }

    private boolean onStateChange(int[] iArr, int[] iArr2) {
    }

    private static boolean isStateful(ColorStateList colorStateList) {
    }

    private static boolean isStateful(Drawable drawable) {
    }

    private static boolean isStateful(TextAppearance textAppearance) {
    }
}
