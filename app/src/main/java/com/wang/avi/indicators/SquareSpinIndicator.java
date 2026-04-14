package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class SquareSpinIndicator extends Indicator {
    private Camera mCamera;
    private Matrix mMatrix;
    private float rotateX;
    private float rotateY;

    /* renamed from: com.wang.avi.indicators.SquareSpinIndicator$1 */
    class C17091 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ SquareSpinIndicator this$0;

        C17091(SquareSpinIndicator squareSpinIndicator) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.wang.avi.indicators.SquareSpinIndicator$2 */
    class C17102 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ SquareSpinIndicator this$0;

        C17102(SquareSpinIndicator squareSpinIndicator) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    static /* synthetic */ float access$002(SquareSpinIndicator squareSpinIndicator, float f) {
    }

    static /* synthetic */ float access$102(SquareSpinIndicator squareSpinIndicator, float f) {
    }

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
    }
}
