package com.google.android.material.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import androidx.transition.bdddqmITkkeGpsxVXHR1l1llll;
import androidx.transition.pbppbpqbamJRy11l1l1;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import p000.ns0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class TransitionUtils {
    static final int NO_ATTR_RES_ID = 0;
    static final int NO_DURATION = -1;
    private static final int PATH_TYPE_ARC = 1;
    private static final int PATH_TYPE_LINEAR = 0;
    private static final RectF transformAlphaRectF = null;

    /* renamed from: com.google.android.material.transition.TransitionUtils$1 */
    class C05231 implements CornerSizeBinaryOperator {
        final /* synthetic */ RectF val$endBounds;
        final /* synthetic */ float val$endFraction;
        final /* synthetic */ float val$fraction;
        final /* synthetic */ RectF val$startBounds;
        final /* synthetic */ float val$startFraction;

        C05231(RectF rectF, RectF rectF2, float f, float f2, float f3) {
        }

        @Override // com.google.android.material.transition.TransitionUtils.CornerSizeBinaryOperator
        public CornerSize apply(CornerSize cornerSize, CornerSize cornerSize2) {
        }
    }

    interface CanvasOperation {
        void run(Canvas canvas);
    }

    interface CornerSizeBinaryOperator {
        CornerSize apply(CornerSize cornerSize, CornerSize cornerSize2);
    }

    private TransitionUtils() {
    }

    static float calculateArea(RectF rectF) {
    }

    static ShapeAppearanceModel convertToRelativeCornerSizes(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
    }

    static Shader createColorShader(int i) {
    }

    public static /* synthetic */ CornerSize dbpqdHhmDSIHIJiwc1ll1l1(RectF rectF, CornerSize cornerSize) {
    }

    static <T> T defaultIfNull(T t, T t2) {
    }

    static View findAncestorById(View view, int i) {
    }

    static View findDescendantOrAncestorById(View view, int i) {
    }

    static RectF getLocationOnScreen(View view) {
    }

    static RectF getRelativeBounds(View view) {
    }

    static Rect getRelativeBoundsRect(View view) {
    }

    private static boolean isShapeAppearanceSignificant(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
    }

    private static /* synthetic */ CornerSize lambda$convertToRelativeCornerSizes$0(RectF rectF, CornerSize cornerSize) {
    }

    static float lerp(float f, float f2, float f3) {
    }

    static float lerp(float f, float f2, float f3, float f4, float f5) {
    }

    static void maybeAddTransition(bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll, pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1) {
    }

    static boolean maybeApplyThemeDuration(pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1, Context context, int i) {
    }

    static boolean maybeApplyThemeInterpolator(pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1, Context context, int i, TimeInterpolator timeInterpolator) {
    }

    static boolean maybeApplyThemePath(pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1, Context context, int i) {
    }

    static void maybeRemoveTransition(bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll, pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1) {
    }

    static ns0 resolveThemePath(Context context, int i) {
    }

    private static int saveLayerAlphaCompat(Canvas canvas, Rect rect, int i) {
    }

    static void transform(Canvas canvas, Rect rect, float f, float f2, float f3, int i, CanvasOperation canvasOperation) {
    }

    static ShapeAppearanceModel transformCornerSizes(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, CornerSizeBinaryOperator cornerSizeBinaryOperator) {
    }

    static float lerp(float f, float f2, float f3, float f4, float f5, boolean z) {
    }

    static int lerp(int i, int i2, float f, float f2, float f3) {
    }

    static ShapeAppearanceModel lerp(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, RectF rectF2, float f, float f2, float f3) {
    }
}
