package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.resources.CancelableFontCallback;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class CollapsingTextHelper {
    private static final boolean DEBUG_DRAW = false;
    private static final Paint DEBUG_DRAW_PAINT = null;
    private static final String ELLIPSIS_NORMAL = "…";
    private static final float FADE_MODE_THRESHOLD_FRACTION_RELATIVE = 0.5f;
    private static final String TAG = "CollapsingTextHelper";
    private static final boolean USE_SCALING_TEXTURE = false;
    private boolean boundsChanged;
    private final Rect collapsedBounds;
    private float collapsedDrawX;
    private float collapsedDrawY;
    private CancelableFontCallback collapsedFontCallback;
    private float collapsedLetterSpacing;
    private ColorStateList collapsedShadowColor;
    private float collapsedShadowDx;
    private float collapsedShadowDy;
    private float collapsedShadowRadius;
    private float collapsedTextBlend;
    private ColorStateList collapsedTextColor;
    private int collapsedTextGravity;
    private float collapsedTextSize;
    private float collapsedTextWidth;
    private Typeface collapsedTypeface;
    private Typeface collapsedTypefaceBold;
    private Typeface collapsedTypefaceDefault;
    private final RectF currentBounds;
    private float currentDrawX;
    private float currentDrawY;
    private float currentLetterSpacing;
    private int currentOffsetY;
    private int currentShadowColor;
    private float currentShadowDx;
    private float currentShadowDy;
    private float currentShadowRadius;
    private float currentTextSize;
    private Typeface currentTypeface;
    private final Rect expandedBounds;
    private float expandedDrawX;
    private float expandedDrawY;
    private CancelableFontCallback expandedFontCallback;
    private float expandedFraction;
    private float expandedLetterSpacing;
    private int expandedLineCount;
    private ColorStateList expandedShadowColor;
    private float expandedShadowDx;
    private float expandedShadowDy;
    private float expandedShadowRadius;
    private float expandedTextBlend;
    private ColorStateList expandedTextColor;
    private int expandedTextGravity;
    private float expandedTextSize;
    private Bitmap expandedTitleTexture;
    private Typeface expandedTypeface;
    private Typeface expandedTypefaceBold;
    private Typeface expandedTypefaceDefault;
    private boolean fadeModeEnabled;
    private float fadeModeStartFraction;
    private float fadeModeThresholdFraction;
    private int hyphenationFrequency;
    private boolean isRtl;
    private boolean isRtlTextDirectionHeuristicsEnabled;
    private float lineSpacingAdd;
    private float lineSpacingMultiplier;
    private int maxLines;
    private TimeInterpolator positionInterpolator;
    private float scale;
    private int[] state;
    private StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer;
    private CharSequence text;
    private StaticLayout textLayout;
    private final TextPaint textPaint;
    private TimeInterpolator textSizeInterpolator;
    private CharSequence textToDraw;
    private CharSequence textToDrawCollapsed;
    private Paint texturePaint;
    private TextUtils.TruncateAt titleTextEllipsize;
    private final TextPaint tmpPaint;
    private boolean useTexture;
    private final View view;

    /* renamed from: com.google.android.material.internal.CollapsingTextHelper$1 */
    class C03711 implements CancelableFontCallback.ApplyFont {
        final /* synthetic */ CollapsingTextHelper this$0;

        C03711(CollapsingTextHelper collapsingTextHelper) {
        }

        @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
        public void apply(Typeface typeface) {
        }
    }

    /* renamed from: com.google.android.material.internal.CollapsingTextHelper$2 */
    class C03722 implements CancelableFontCallback.ApplyFont {
        final /* synthetic */ CollapsingTextHelper this$0;

        C03722(CollapsingTextHelper collapsingTextHelper) {
        }

        @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
        public void apply(Typeface typeface) {
        }
    }

    public CollapsingTextHelper(View view) {
    }

    private static int blendARGB(int i, int i2, float f) {
    }

    private void calculateBaseOffsets(boolean z) {
    }

    private void calculateCurrentOffsets() {
    }

    private float calculateFadeModeTextAlpha(float f) {
    }

    private float calculateFadeModeThresholdFraction() {
    }

    private boolean calculateIsRtl(CharSequence charSequence) {
    }

    private void calculateOffsets(float f) {
    }

    private void calculateUsingTextSize(float f) {
    }

    private void clearTexture() {
    }

    private StaticLayout createStaticLayout(int i, float f, boolean z) {
    }

    private void drawMultilineTransition(Canvas canvas, float f, float f2) {
    }

    private void ensureExpandedTexture() {
    }

    private float getCollapsedTextLeftBound(int i, int i2) {
    }

    private float getCollapsedTextRightBound(RectF rectF, int i, int i2) {
    }

    private int getCurrentColor(ColorStateList colorStateList) {
    }

    private int getCurrentExpandedTextColor() {
    }

    private Layout.Alignment getMultilineTextLayoutAlignment() {
    }

    private void getTextPaintCollapsed(TextPaint textPaint) {
    }

    private void getTextPaintExpanded(TextPaint textPaint) {
    }

    private void interpolateBounds(float f) {
    }

    private static boolean isClose(float f, float f2) {
    }

    private boolean isDefaultIsRtl() {
    }

    private boolean isTextDirectionHeuristicsIsRtl(CharSequence charSequence, boolean z) {
    }

    private static float lerp(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
    }

    private float measureTextWidth(TextPaint textPaint, CharSequence charSequence) {
    }

    private static boolean rectEquals(Rect rect, int i, int i2, int i3, int i4) {
    }

    private void setCollapsedTextBlend(float f) {
    }

    private boolean setCollapsedTypefaceInternal(Typeface typeface) {
    }

    private void setExpandedTextBlend(float f) {
    }

    private boolean setExpandedTypefaceInternal(Typeface typeface) {
    }

    private void setInterpolatedTextSize(float f) {
    }

    private boolean shouldDrawMultiline() {
    }

    public void draw(Canvas canvas) {
    }

    public void getCollapsedTextActualBounds(RectF rectF, int i, int i2) {
    }

    public ColorStateList getCollapsedTextColor() {
    }

    public int getCollapsedTextGravity() {
    }

    public float getCollapsedTextHeight() {
    }

    public float getCollapsedTextSize() {
    }

    public Typeface getCollapsedTypeface() {
    }

    public int getCurrentCollapsedTextColor() {
    }

    public int getExpandedLineCount() {
    }

    public ColorStateList getExpandedTextColor() {
    }

    public float getExpandedTextFullHeight() {
    }

    public int getExpandedTextGravity() {
    }

    public float getExpandedTextHeight() {
    }

    public float getExpandedTextSize() {
    }

    public Typeface getExpandedTypeface() {
    }

    public float getExpansionFraction() {
    }

    public float getFadeModeThresholdFraction() {
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

    public TimeInterpolator getPositionInterpolator() {
    }

    public CharSequence getText() {
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
    }

    public boolean isRtlTextDirectionHeuristicsEnabled() {
    }

    public final boolean isStateful() {
    }

    public void maybeUpdateFontWeightAdjustment(Configuration configuration) {
    }

    public void recalculate() {
    }

    public void setCollapsedAndExpandedTextColor(ColorStateList colorStateList) {
    }

    public void setCollapsedBounds(int i, int i2, int i3, int i4) {
    }

    public void setCollapsedTextAppearance(int i) {
    }

    public void setCollapsedTextColor(ColorStateList colorStateList) {
    }

    public void setCollapsedTextGravity(int i) {
    }

    public void setCollapsedTextSize(float f) {
    }

    public void setCollapsedTypeface(Typeface typeface) {
    }

    public void setCurrentOffsetY(int i) {
    }

    public void setExpandedBounds(int i, int i2, int i3, int i4) {
    }

    public void setExpandedLetterSpacing(float f) {
    }

    public void setExpandedTextAppearance(int i) {
    }

    public void setExpandedTextColor(ColorStateList colorStateList) {
    }

    public void setExpandedTextGravity(int i) {
    }

    public void setExpandedTextSize(float f) {
    }

    public void setExpandedTypeface(Typeface typeface) {
    }

    public void setExpansionFraction(float f) {
    }

    public void setFadeModeEnabled(boolean z) {
    }

    public void setFadeModeStartFraction(float f) {
    }

    public void setHyphenationFrequency(int i) {
    }

    public void setLineSpacingAdd(float f) {
    }

    public void setLineSpacingMultiplier(float f) {
    }

    public void setMaxLines(int i) {
    }

    public void setPositionInterpolator(TimeInterpolator timeInterpolator) {
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
    }

    public final boolean setState(int[] iArr) {
    }

    public void setStaticLayoutBuilderConfigurer(StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
    }

    public void setText(CharSequence charSequence) {
    }

    public void setTextSizeInterpolator(TimeInterpolator timeInterpolator) {
    }

    public void setTitleTextEllipsize(TextUtils.TruncateAt truncateAt) {
    }

    public void setTypefaces(Typeface typeface) {
    }

    private void calculateUsingTextSize(float f, boolean z) {
    }

    public void recalculate(boolean z) {
    }

    public void setCollapsedBounds(Rect rect) {
    }

    public void setExpandedBounds(Rect rect) {
    }
}
