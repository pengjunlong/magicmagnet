package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.pbppbpqbamJRy11l1l1;
import androidx.transition.qbddqbdJBkudFfhX1ll1l111;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.transition.TransitionUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000.ns0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class MaterialContainerTransform extends pbppbpqbamJRy11l1l1 {
    private static final ProgressThresholdsGroup DEFAULT_ENTER_THRESHOLDS = null;
    private static final ProgressThresholdsGroup DEFAULT_ENTER_THRESHOLDS_ARC = null;
    private static final ProgressThresholdsGroup DEFAULT_RETURN_THRESHOLDS = null;
    private static final ProgressThresholdsGroup DEFAULT_RETURN_THRESHOLDS_ARC = null;
    private static final float ELEVATION_NOT_SET = -1.0f;
    public static final int FADE_MODE_CROSS = 2;
    public static final int FADE_MODE_IN = 0;
    public static final int FADE_MODE_OUT = 1;
    public static final int FADE_MODE_THROUGH = 3;
    public static final int FIT_MODE_AUTO = 0;
    public static final int FIT_MODE_HEIGHT = 2;
    public static final int FIT_MODE_WIDTH = 1;
    private static final String PROP_BOUNDS = "materialContainerTransition:bounds";
    private static final String PROP_SHAPE_APPEARANCE = "materialContainerTransition:shapeAppearance";
    private static final String TAG = null;
    public static final int TRANSITION_DIRECTION_AUTO = 0;
    public static final int TRANSITION_DIRECTION_ENTER = 1;
    public static final int TRANSITION_DIRECTION_RETURN = 2;
    private static final String[] TRANSITION_PROPS = null;
    private boolean appliedThemeValues;
    private int containerColor;
    private boolean drawDebugEnabled;
    private int drawingViewId;
    private boolean elevationShadowEnabled;
    private int endContainerColor;
    private float endElevation;
    private ShapeAppearanceModel endShapeAppearanceModel;
    private View endView;
    private int endViewId;
    private int fadeMode;
    private ProgressThresholds fadeProgressThresholds;
    private int fitMode;
    private boolean holdAtEndEnabled;
    private boolean pathMotionCustom;
    private ProgressThresholds scaleMaskProgressThresholds;
    private ProgressThresholds scaleProgressThresholds;
    private int scrimColor;
    private ProgressThresholds shapeMaskProgressThresholds;
    private int startContainerColor;
    private float startElevation;
    private ShapeAppearanceModel startShapeAppearanceModel;
    private View startView;
    private int startViewId;
    private int transitionDirection;

    /* renamed from: com.google.android.material.transition.MaterialContainerTransform$1 */
    class C05161 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ MaterialContainerTransform this$0;
        final /* synthetic */ TransitionDrawable val$transitionDrawable;

        C05161(MaterialContainerTransform materialContainerTransform, TransitionDrawable transitionDrawable) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.google.android.material.transition.MaterialContainerTransform$2 */
    class C05172 extends TransitionListenerAdapter {
        final /* synthetic */ MaterialContainerTransform this$0;
        final /* synthetic */ View val$drawingView;
        final /* synthetic */ View val$endView;
        final /* synthetic */ View val$startView;
        final /* synthetic */ TransitionDrawable val$transitionDrawable;

        C05172(MaterialContainerTransform materialContainerTransform, View view, TransitionDrawable transitionDrawable, View view2, View view3) {
        }

        @Override // com.google.android.material.transition.TransitionListenerAdapter, androidx.transition.pbppbpqbamJRy11l1l1.dqpqqqbqQyjyB11111l1
        public void onTransitionEnd(pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1) {
        }

        @Override // com.google.android.material.transition.TransitionListenerAdapter, androidx.transition.pbppbpqbamJRy11l1l1.dqpqqqbqQyjyB11111l1
        public void onTransitionStart(pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FadeMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FitMode {
    }

    public static class ProgressThresholds {
        private final float end;
        private final float start;

        public ProgressThresholds(float f, float f2) {
        }

        static /* synthetic */ float access$1000(ProgressThresholds progressThresholds) {
        }

        static /* synthetic */ float access$1100(ProgressThresholds progressThresholds) {
        }

        public float getEnd() {
        }

        public float getStart() {
        }
    }

    private static class ProgressThresholdsGroup {
        private final ProgressThresholds fade;
        private final ProgressThresholds scale;
        private final ProgressThresholds scaleMask;
        private final ProgressThresholds shapeMask;

        /* synthetic */ ProgressThresholdsGroup(ProgressThresholds progressThresholds, ProgressThresholds progressThresholds2, ProgressThresholds progressThresholds3, ProgressThresholds progressThresholds4, C05161 c05161) {
        }

        static /* synthetic */ ProgressThresholds access$400(ProgressThresholdsGroup progressThresholdsGroup) {
        }

        static /* synthetic */ ProgressThresholds access$500(ProgressThresholdsGroup progressThresholdsGroup) {
        }

        static /* synthetic */ ProgressThresholds access$600(ProgressThresholdsGroup progressThresholdsGroup) {
        }

        static /* synthetic */ ProgressThresholds access$700(ProgressThresholdsGroup progressThresholdsGroup) {
        }

        private ProgressThresholdsGroup(ProgressThresholds progressThresholds, ProgressThresholds progressThresholds2, ProgressThresholds progressThresholds3, ProgressThresholds progressThresholds4) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TransitionDirection {
    }

    private static final class TransitionDrawable extends Drawable {
        private static final int COMPAT_SHADOW_COLOR = -7829368;
        private static final int SHADOW_COLOR = 754974720;
        private static final float SHADOW_DX_MULTIPLIER_ADJUSTMENT = 0.3f;
        private static final float SHADOW_DY_MULTIPLIER_ADJUSTMENT = 1.5f;
        private final MaterialShapeDrawable compatShadowDrawable;
        private final Paint containerPaint;
        private float currentElevation;
        private float currentElevationDy;
        private final RectF currentEndBounds;
        private final RectF currentEndBoundsMasked;
        private RectF currentMaskBounds;
        private final RectF currentStartBounds;
        private final RectF currentStartBoundsMasked;
        private final Paint debugPaint;
        private final Path debugPath;
        private final float displayHeight;
        private final float displayWidth;
        private final boolean drawDebugEnabled;
        private final boolean elevationShadowEnabled;
        private final RectF endBounds;
        private final Paint endContainerPaint;
        private final float endElevation;
        private final ShapeAppearanceModel endShapeAppearanceModel;
        private final View endView;
        private final boolean entering;
        private final FadeModeEvaluator fadeModeEvaluator;
        private FadeModeResult fadeModeResult;
        private final FitModeEvaluator fitModeEvaluator;
        private FitModeResult fitModeResult;
        private final MaskEvaluator maskEvaluator;
        private final float motionPathLength;
        private final PathMeasure motionPathMeasure;
        private final float[] motionPathPosition;
        private float progress;
        private final ProgressThresholdsGroup progressThresholds;
        private final Paint scrimPaint;
        private final Paint shadowPaint;
        private final RectF startBounds;
        private final Paint startContainerPaint;
        private final float startElevation;
        private final ShapeAppearanceModel startShapeAppearanceModel;
        private final View startView;

        /* renamed from: com.google.android.material.transition.MaterialContainerTransform$TransitionDrawable$1 */
        class C05181 implements TransitionUtils.CanvasOperation {
            final /* synthetic */ TransitionDrawable this$0;

            C05181(TransitionDrawable transitionDrawable) {
            }

            @Override // com.google.android.material.transition.TransitionUtils.CanvasOperation
            public void run(Canvas canvas) {
            }
        }

        /* renamed from: com.google.android.material.transition.MaterialContainerTransform$TransitionDrawable$2 */
        class C05192 implements TransitionUtils.CanvasOperation {
            final /* synthetic */ TransitionDrawable this$0;

            C05192(TransitionDrawable transitionDrawable) {
            }

            @Override // com.google.android.material.transition.TransitionUtils.CanvasOperation
            public void run(Canvas canvas) {
            }
        }

        /* synthetic */ TransitionDrawable(ns0 ns0Var, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, FadeModeEvaluator fadeModeEvaluator, FitModeEvaluator fitModeEvaluator, ProgressThresholdsGroup progressThresholdsGroup, boolean z3, C05161 c05161) {
        }

        static /* synthetic */ void access$200(TransitionDrawable transitionDrawable, float f) {
        }

        static /* synthetic */ View access$800(TransitionDrawable transitionDrawable) {
        }

        static /* synthetic */ View access$900(TransitionDrawable transitionDrawable) {
        }

        private static float calculateElevationDxMultiplier(RectF rectF, float f) {
        }

        private static float calculateElevationDyMultiplier(RectF rectF, float f) {
        }

        private void drawDebugCumulativePath(Canvas canvas, RectF rectF, Path path, int i) {
        }

        private void drawDebugRect(Canvas canvas, RectF rectF, int i) {
        }

        private void drawElevationShadow(Canvas canvas) {
        }

        private void drawElevationShadowWithMaterialShapeDrawable(Canvas canvas) {
        }

        private void drawElevationShadowWithPaintShadowLayer(Canvas canvas) {
        }

        private void drawEndView(Canvas canvas) {
        }

        private void drawStartView(Canvas canvas) {
        }

        private static PointF getMotionPathPoint(RectF rectF) {
        }

        private void maybeDrawContainerColor(Canvas canvas, Paint paint) {
        }

        private void setProgress(float f) {
        }

        private void updateProgress(float f) {
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }

        private TransitionDrawable(ns0 ns0Var, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, FadeModeEvaluator fadeModeEvaluator, FitModeEvaluator fitModeEvaluator, ProgressThresholdsGroup progressThresholdsGroup, boolean z3) {
        }
    }

    public MaterialContainerTransform() {
    }

    static /* synthetic */ boolean access$300(MaterialContainerTransform materialContainerTransform) {
    }

    private ProgressThresholdsGroup buildThresholdsGroup(boolean z) {
    }

    private static RectF calculateDrawableBounds(View view, View view2, float f, float f2) {
    }

    private static ShapeAppearanceModel captureShapeAppearance(View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel) {
    }

    private static void captureValues(qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111, View view, int i, ShapeAppearanceModel shapeAppearanceModel) {
    }

    private static float getElevationOrDefault(float f, View view) {
    }

    private static ShapeAppearanceModel getShapeAppearance(View view, ShapeAppearanceModel shapeAppearanceModel) {
    }

    private ProgressThresholdsGroup getThresholdsOrDefault(boolean z, ProgressThresholdsGroup progressThresholdsGroup, ProgressThresholdsGroup progressThresholdsGroup2) {
    }

    private static int getTransitionShapeAppearanceResId(Context context) {
    }

    private boolean isEntering(RectF rectF, RectF rectF2) {
    }

    private void maybeApplyThemeValues(Context context, boolean z) {
    }

    @Override // androidx.transition.pbppbpqbamJRy11l1l1
    public void captureEndValues(qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111) {
    }

    @Override // androidx.transition.pbppbpqbamJRy11l1l1
    public void captureStartValues(qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111) {
    }

    @Override // androidx.transition.pbppbpqbamJRy11l1l1
    public Animator createAnimator(ViewGroup viewGroup, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l1112) {
    }

    public int getContainerColor() {
    }

    public int getDrawingViewId() {
    }

    public int getEndContainerColor() {
    }

    public float getEndElevation() {
    }

    public ShapeAppearanceModel getEndShapeAppearanceModel() {
    }

    public View getEndView() {
    }

    public int getEndViewId() {
    }

    public int getFadeMode() {
    }

    public ProgressThresholds getFadeProgressThresholds() {
    }

    public int getFitMode() {
    }

    public ProgressThresholds getScaleMaskProgressThresholds() {
    }

    public ProgressThresholds getScaleProgressThresholds() {
    }

    public int getScrimColor() {
    }

    public ProgressThresholds getShapeMaskProgressThresholds() {
    }

    public int getStartContainerColor() {
    }

    public float getStartElevation() {
    }

    public ShapeAppearanceModel getStartShapeAppearanceModel() {
    }

    public View getStartView() {
    }

    public int getStartViewId() {
    }

    public int getTransitionDirection() {
    }

    @Override // androidx.transition.pbppbpqbamJRy11l1l1
    public String[] getTransitionProperties() {
    }

    public boolean isDrawDebugEnabled() {
    }

    public boolean isElevationShadowEnabled() {
    }

    public boolean isHoldAtEndEnabled() {
    }

    public void setAllContainerColors(int i) {
    }

    public void setContainerColor(int i) {
    }

    public void setDrawDebugEnabled(boolean z) {
    }

    public void setDrawingViewId(int i) {
    }

    public void setElevationShadowEnabled(boolean z) {
    }

    public void setEndContainerColor(int i) {
    }

    public void setEndElevation(float f) {
    }

    public void setEndShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
    }

    public void setEndView(View view) {
    }

    public void setEndViewId(int i) {
    }

    public void setFadeMode(int i) {
    }

    public void setFadeProgressThresholds(ProgressThresholds progressThresholds) {
    }

    public void setFitMode(int i) {
    }

    public void setHoldAtEndEnabled(boolean z) {
    }

    @Override // androidx.transition.pbppbpqbamJRy11l1l1
    public void setPathMotion(ns0 ns0Var) {
    }

    public void setScaleMaskProgressThresholds(ProgressThresholds progressThresholds) {
    }

    public void setScaleProgressThresholds(ProgressThresholds progressThresholds) {
    }

    public void setScrimColor(int i) {
    }

    public void setShapeMaskProgressThresholds(ProgressThresholds progressThresholds) {
    }

    public void setStartContainerColor(int i) {
    }

    public void setStartElevation(float f) {
    }

    public void setStartShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
    }

    public void setStartView(View view) {
    }

    public void setStartViewId(int i) {
    }

    public void setTransitionDirection(int i) {
    }

    public MaterialContainerTransform(Context context, boolean z) {
    }
}
