package com.google.android.material.textfield;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class CutoutDrawable extends MaterialShapeDrawable {
    protected final RectF cutoutBounds;

    private static class ImplApi14 extends CutoutDrawable {
        private Paint cutoutPaint;
        private int savedLayer;

        ImplApi14(ShapeAppearanceModel shapeAppearanceModel) {
        }

        private Paint getCutoutPaint() {
        }

        private void postDraw(Canvas canvas) {
        }

        private void preDraw(Canvas canvas) {
        }

        private void saveCanvasLayer(Canvas canvas) {
        }

        private boolean useHardwareLayer(Drawable.Callback callback) {
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable
        protected void drawStrokeShape(Canvas canvas) {
        }
    }

    @TargetApi(18)
    private static class ImplApi18 extends CutoutDrawable {
        ImplApi18(ShapeAppearanceModel shapeAppearanceModel) {
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable
        protected void drawStrokeShape(Canvas canvas) {
        }
    }

    /* synthetic */ CutoutDrawable(ShapeAppearanceModel shapeAppearanceModel, C04671 c04671) {
    }

    static CutoutDrawable create(ShapeAppearanceModel shapeAppearanceModel) {
    }

    boolean hasCutout() {
    }

    void removeCutout() {
    }

    void setCutout(float f, float f2, float f3, float f4) {
    }

    private CutoutDrawable(ShapeAppearanceModel shapeAppearanceModel) {
    }

    void setCutout(RectF rectF) {
    }
}
