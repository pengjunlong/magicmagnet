package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class TriangleSkewSpinIndicator extends Indicator {
    private Camera mCamera;
    private Matrix mMatrix;
    private float rotateX;
    private float rotateY;

    /* renamed from: com.wang.avi.indicators.TriangleSkewSpinIndicator$1 */
    class C17111 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ TriangleSkewSpinIndicator this$0;

        C17111(TriangleSkewSpinIndicator triangleSkewSpinIndicator) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.wang.avi.indicators.TriangleSkewSpinIndicator$2 */
    class C17122 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ TriangleSkewSpinIndicator this$0;

        C17122(TriangleSkewSpinIndicator triangleSkewSpinIndicator) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    static /* synthetic */ float access$002(TriangleSkewSpinIndicator triangleSkewSpinIndicator, float f) {
    }

    static /* synthetic */ float access$102(TriangleSkewSpinIndicator triangleSkewSpinIndicator, float f) {
    }

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
    }
}
