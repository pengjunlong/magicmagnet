package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.shape.Shapeable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class ShapeableImageView extends AppCompatImageView implements Shapeable {
    private static final int DEF_STYLE_RES = 0;
    private static final int UNDEFINED_PADDING = Integer.MIN_VALUE;
    private final Paint borderPaint;
    private int bottomContentPadding;
    private final Paint clearPaint;
    private final RectF destination;
    private int endContentPadding;
    private boolean hasAdjustedPaddingAfterLayoutDirectionResolved;
    private int leftContentPadding;
    private Path maskPath;
    private final RectF maskRect;
    private final Path path;
    private final ShapeAppearancePathProvider pathProvider;
    private int rightContentPadding;
    private MaterialShapeDrawable shadowDrawable;
    private ShapeAppearanceModel shapeAppearanceModel;
    private int startContentPadding;
    private ColorStateList strokeColor;
    private float strokeWidth;
    private int topContentPadding;

    @TargetApi(21)
    class OutlineProvider extends ViewOutlineProvider {
        private final Rect rect;
        final /* synthetic */ ShapeableImageView this$0;

        OutlineProvider(ShapeableImageView shapeableImageView) {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
        }
    }

    public ShapeableImageView(Context context) {
    }

    static /* synthetic */ ShapeAppearanceModel access$000(ShapeableImageView shapeableImageView) {
    }

    static /* synthetic */ MaterialShapeDrawable access$100(ShapeableImageView shapeableImageView) {
    }

    static /* synthetic */ MaterialShapeDrawable access$102(ShapeableImageView shapeableImageView, MaterialShapeDrawable materialShapeDrawable) {
    }

    static /* synthetic */ RectF access$200(ShapeableImageView shapeableImageView) {
    }

    private void drawStroke(Canvas canvas) {
    }

    private boolean isContentPaddingRelative() {
    }

    private boolean isRtl() {
    }

    private void updateShapeMask(int i, int i2) {
    }

    public int getContentPaddingBottom() {
    }

    public final int getContentPaddingEnd() {
    }

    public int getContentPaddingLeft() {
    }

    public int getContentPaddingRight() {
    }

    public final int getContentPaddingStart() {
    }

    public int getContentPaddingTop() {
    }

    @Override // android.view.View
    public int getPaddingBottom() {
    }

    @Override // android.view.View
    public int getPaddingEnd() {
    }

    @Override // android.view.View
    public int getPaddingLeft() {
    }

    @Override // android.view.View
    public int getPaddingRight() {
    }

    @Override // android.view.View
    public int getPaddingStart() {
    }

    @Override // android.view.View
    public int getPaddingTop() {
    }

    @Override // com.google.android.material.shape.Shapeable
    public ShapeAppearanceModel getShapeAppearanceModel() {
    }

    public ColorStateList getStrokeColor() {
    }

    public float getStrokeWidth() {
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
    }

    public void setContentPaddingRelative(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
    }

    public void setStrokeColor(ColorStateList colorStateList) {
    }

    public void setStrokeColorResource(int i) {
    }

    public void setStrokeWidth(float f) {
    }

    public void setStrokeWidthResource(int i) {
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet, int i) {
    }
}
