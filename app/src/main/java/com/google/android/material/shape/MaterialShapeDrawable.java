package com.google.android.material.shape;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.shadow.ShadowRenderer;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.shape.ShapePath;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;
import p000.ks1;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class MaterialShapeDrawable extends Drawable implements ks1, Shapeable {
    public static final int SHADOW_COMPAT_MODE_ALWAYS = 2;
    public static final int SHADOW_COMPAT_MODE_DEFAULT = 0;
    public static final int SHADOW_COMPAT_MODE_NEVER = 1;
    private static final float SHADOW_OFFSET_MULTIPLIER = 0.25f;
    private static final float SHADOW_RADIUS_MULTIPLIER = 0.75f;
    private static final String TAG = null;
    private static final Paint clearPaint = null;
    private final BitSet containsIncompatibleShadowOp;
    private final ShapePath.ShadowCompatOperation[] cornerShadowOperation;
    private MaterialShapeDrawableState drawableState;
    private final ShapePath.ShadowCompatOperation[] edgeShadowOperation;
    private final Paint fillPaint;
    private final RectF insetRectF;
    private final Matrix matrix;
    private final Path path;
    private final RectF pathBounds;
    private boolean pathDirty;
    private final Path pathInsetByStroke;
    private final ShapeAppearancePathProvider pathProvider;
    private final ShapeAppearancePathProvider.PathListener pathShadowListener;
    private final RectF rectF;
    private int resolvedTintColor;
    private final Region scratchRegion;
    private boolean shadowBitmapDrawingEnable;
    private final ShadowRenderer shadowRenderer;
    private final Paint strokePaint;
    private ShapeAppearanceModel strokeShapeAppearance;
    private PorterDuffColorFilter strokeTintFilter;
    private PorterDuffColorFilter tintFilter;
    private final Region transparentRegion;

    /* renamed from: com.google.android.material.shape.MaterialShapeDrawable$1 */
    class C04371 implements ShapeAppearancePathProvider.PathListener {
        final /* synthetic */ MaterialShapeDrawable this$0;

        C04371(MaterialShapeDrawable materialShapeDrawable) {
        }

        @Override // com.google.android.material.shape.ShapeAppearancePathProvider.PathListener
        public void onCornerPathCreated(ShapePath shapePath, Matrix matrix, int i) {
        }

        @Override // com.google.android.material.shape.ShapeAppearancePathProvider.PathListener
        public void onEdgePathCreated(ShapePath shapePath, Matrix matrix, int i) {
        }
    }

    /* renamed from: com.google.android.material.shape.MaterialShapeDrawable$2 */
    class C04382 implements ShapeAppearanceModel.CornerSizeUnaryOperator {
        final /* synthetic */ MaterialShapeDrawable this$0;
        final /* synthetic */ float val$strokeInsetLength;

        C04382(MaterialShapeDrawable materialShapeDrawable, float f) {
        }

        @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
        public CornerSize apply(CornerSize cornerSize) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface CompatibilityShadowMode {
    }

    /* synthetic */ MaterialShapeDrawable(MaterialShapeDrawableState materialShapeDrawableState, C04371 c04371) {
    }

    static /* synthetic */ BitSet access$000(MaterialShapeDrawable materialShapeDrawable) {
    }

    static /* synthetic */ ShapePath.ShadowCompatOperation[] access$100(MaterialShapeDrawable materialShapeDrawable) {
    }

    static /* synthetic */ ShapePath.ShadowCompatOperation[] access$200(MaterialShapeDrawable materialShapeDrawable) {
    }

    static /* synthetic */ boolean access$402(MaterialShapeDrawable materialShapeDrawable, boolean z) {
    }

    private PorterDuffColorFilter calculatePaintColorTintFilter(Paint paint, boolean z) {
    }

    private void calculatePath(RectF rectF, Path path) {
    }

    private void calculateStrokePath() {
    }

    private PorterDuffColorFilter calculateTintColorTintFilter(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
    }

    private PorterDuffColorFilter calculateTintFilter(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
    }

    public static MaterialShapeDrawable createWithElevationOverlay(Context context) {
    }

    private void drawCompatShadow(Canvas canvas) {
    }

    private void drawFillShape(Canvas canvas) {
    }

    private RectF getBoundsInsetByStroke() {
    }

    private float getStrokeInsetLength() {
    }

    private boolean hasCompatShadow() {
    }

    private boolean hasFill() {
    }

    private boolean hasStroke() {
    }

    private void invalidateSelfIgnoreShape() {
    }

    private void maybeDrawCompatShadow(Canvas canvas) {
    }

    private static int modulateAlpha(int i, int i2) {
    }

    private void prepareCanvasForShadow(Canvas canvas) {
    }

    private boolean updateColorsForState(int[] iArr) {
    }

    private boolean updateTintFilter() {
    }

    private void updateZ() {
    }

    protected final void calculatePathForSize(RectF rectF, Path path) {
    }

    protected int compositeElevationOverlayIfNeeded(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    protected void drawShape(Canvas canvas, Paint paint, Path path, RectF rectF) {
    }

    protected void drawStrokeShape(Canvas canvas) {
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
    }

    public float getBottomLeftCornerResolvedSize() {
    }

    public float getBottomRightCornerResolvedSize() {
    }

    protected RectF getBoundsAsRectF() {
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
    }

    public float getElevation() {
    }

    public ColorStateList getFillColor() {
    }

    public float getInterpolation() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
    }

    public Paint.Style getPaintStyle() {
    }

    public float getParentAbsoluteElevation() {
    }

    @Deprecated
    public void getPathForSize(int i, int i2, Path path) {
    }

    public int getResolvedTintColor() {
    }

    public float getScale() {
    }

    public int getShadowCompatRotation() {
    }

    public int getShadowCompatibilityMode() {
    }

    @Deprecated
    public int getShadowElevation() {
    }

    public int getShadowOffsetX() {
    }

    public int getShadowOffsetY() {
    }

    public int getShadowRadius() {
    }

    public int getShadowVerticalOffset() {
    }

    @Override // com.google.android.material.shape.Shapeable
    public ShapeAppearanceModel getShapeAppearanceModel() {
    }

    @Deprecated
    public ShapePathModel getShapedViewModel() {
    }

    public ColorStateList getStrokeColor() {
    }

    public ColorStateList getStrokeTintList() {
    }

    public float getStrokeWidth() {
    }

    public ColorStateList getTintList() {
    }

    public float getTopLeftCornerResolvedSize() {
    }

    public float getTopRightCornerResolvedSize() {
    }

    public float getTranslationZ() {
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
    }

    public float getZ() {
    }

    public void initializeElevationOverlay(Context context) {
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
    }

    public boolean isElevationOverlayEnabled() {
    }

    public boolean isElevationOverlayInitialized() {
    }

    public boolean isPointInTransparentRegion(int i, int i2) {
    }

    public boolean isRoundRect() {
    }

    @Deprecated
    public boolean isShadowEnabled() {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    protected boolean onStateChange(int[] iArr) {
    }

    public boolean requiresCompatShadow() {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setCornerSize(float f) {
    }

    public void setEdgeIntersectionCheckEnable(boolean z) {
    }

    public void setElevation(float f) {
    }

    public void setFillColor(ColorStateList colorStateList) {
    }

    public void setInterpolation(float f) {
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaintStyle(Paint.Style style) {
    }

    public void setParentAbsoluteElevation(float f) {
    }

    public void setScale(float f) {
    }

    public void setShadowBitmapDrawingEnable(boolean z) {
    }

    public void setShadowColor(int i) {
    }

    public void setShadowCompatRotation(int i) {
    }

    public void setShadowCompatibilityMode(int i) {
    }

    @Deprecated
    public void setShadowElevation(int i) {
    }

    @Deprecated
    public void setShadowEnabled(boolean z) {
    }

    @Deprecated
    public void setShadowRadius(int i) {
    }

    public void setShadowVerticalOffset(int i) {
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
    }

    @Deprecated
    public void setShapedViewModel(ShapePathModel shapePathModel) {
    }

    public void setStroke(float f, int i) {
    }

    public void setStrokeColor(ColorStateList colorStateList) {
    }

    public void setStrokeTint(ColorStateList colorStateList) {
    }

    public void setStrokeWidth(float f) {
    }

    @Override // android.graphics.drawable.Drawable, p000.ks1
    public void setTint(int i) {
    }

    @Override // android.graphics.drawable.Drawable, p000.ks1
    public void setTintList(ColorStateList colorStateList) {
    }

    @Override // android.graphics.drawable.Drawable, p000.ks1
    public void setTintMode(PorterDuff.Mode mode) {
    }

    public void setTranslationZ(float f) {
    }

    public void setUseTintColorForShadow(boolean z) {
    }

    public void setZ(float f) {
    }

    public MaterialShapeDrawable() {
    }

    public static MaterialShapeDrawable createWithElevationOverlay(Context context, float f) {
    }

    private void drawShape(Canvas canvas, Paint paint, Path path, ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
    }

    public void setCornerSize(CornerSize cornerSize) {
    }

    public MaterialShapeDrawable(Context context, AttributeSet attributeSet, int i, int i2) {
    }

    public void setStroke(float f, ColorStateList colorStateList) {
    }

    @Deprecated
    public MaterialShapeDrawable(ShapePathModel shapePathModel) {
    }

    public void setStrokeTint(int i) {
    }

    public MaterialShapeDrawable(ShapeAppearanceModel shapeAppearanceModel) {
    }

    private MaterialShapeDrawable(MaterialShapeDrawableState materialShapeDrawableState) {
    }

    static final class MaterialShapeDrawableState extends Drawable.ConstantState {
        public int alpha;
        public ColorFilter colorFilter;
        public float elevation;
        public ElevationOverlayProvider elevationOverlayProvider;
        public ColorStateList fillColor;
        public float interpolation;
        public Rect padding;
        public Paint.Style paintStyle;
        public float parentAbsoluteElevation;
        public float scale;
        public int shadowCompatMode;
        public int shadowCompatOffset;
        public int shadowCompatRadius;
        public int shadowCompatRotation;
        public ShapeAppearanceModel shapeAppearanceModel;
        public ColorStateList strokeColor;
        public ColorStateList strokeTintList;
        public float strokeWidth;
        public ColorStateList tintList;
        public PorterDuff.Mode tintMode;
        public float translationZ;
        public boolean useTintColorForShadow;

        public MaterialShapeDrawableState(ShapeAppearanceModel shapeAppearanceModel, ElevationOverlayProvider elevationOverlayProvider) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
        }

        public MaterialShapeDrawableState(MaterialShapeDrawableState materialShapeDrawableState) {
        }
    }
}
