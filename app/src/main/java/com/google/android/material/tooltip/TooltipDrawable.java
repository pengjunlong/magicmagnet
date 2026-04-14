package com.google.android.material.tooltip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class TooltipDrawable extends MaterialShapeDrawable implements TextDrawableHelper.TextDrawableDelegate {
    private static final int DEFAULT_STYLE = 0;
    private static final int DEFAULT_THEME_ATTR = 0;
    private int arrowSize;
    private final View.OnLayoutChangeListener attachedViewLayoutChangeListener;
    private final Context context;
    private final Rect displayFrame;
    private final Paint.FontMetrics fontMetrics;
    private float labelOpacity;
    private int layoutMargin;
    private int locationOnScreenX;
    private int minHeight;
    private int minWidth;
    private int padding;
    private CharSequence text;
    private final TextDrawableHelper textDrawableHelper;
    private final float tooltipPivotX;
    private float tooltipPivotY;
    private float tooltipScaleX;
    private float tooltipScaleY;

    /* renamed from: com.google.android.material.tooltip.TooltipDrawable$1 */
    class ViewOnLayoutChangeListenerC04981 implements View.OnLayoutChangeListener {
        final /* synthetic */ TooltipDrawable this$0;

        ViewOnLayoutChangeListenerC04981(TooltipDrawable tooltipDrawable) {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        }
    }

    private TooltipDrawable(Context context, AttributeSet attributeSet, int i, int i2) {
    }

    static /* synthetic */ void access$000(TooltipDrawable tooltipDrawable, View view) {
    }

    private float calculatePointerOffset() {
    }

    private float calculateTextCenterFromBaseline() {
    }

    private float calculateTextOriginAndAlignment(Rect rect) {
    }

    public static TooltipDrawable create(Context context) {
    }

    public static TooltipDrawable createFromAttributes(Context context, AttributeSet attributeSet, int i, int i2) {
    }

    private EdgeTreatment createMarkerEdge() {
    }

    private void drawText(Canvas canvas) {
    }

    private float getTextWidth() {
    }

    private void loadFromAttributes(AttributeSet attributeSet, int i, int i2) {
    }

    private void updateLocationOnScreen(View view) {
    }

    public void detachView(View view) {
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
    }

    public int getLayoutMargin() {
    }

    public int getMinHeight() {
    }

    public int getMinWidth() {
    }

    public CharSequence getText() {
    }

    public TextAppearance getTextAppearance() {
    }

    public int getTextPadding() {
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
    }

    public void setLayoutMargin(int i) {
    }

    public void setMinHeight(int i) {
    }

    public void setMinWidth(int i) {
    }

    public void setRelativeToView(View view) {
    }

    public void setRevealFraction(float f) {
    }

    public void setText(CharSequence charSequence) {
    }

    public void setTextAppearance(TextAppearance textAppearance) {
    }

    public void setTextAppearanceResource(int i) {
    }

    public void setTextPadding(int i) {
    }

    public void setTextResource(int i) {
    }

    public static TooltipDrawable createFromAttributes(Context context, AttributeSet attributeSet) {
    }
}
