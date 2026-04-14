package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class BallSpinFadeLoaderIndicator extends Indicator {
    public static final int ALPHA = 255;
    public static final float SCALE = 1.0f;
    int[] alphas;
    float[] scaleFloats;

    /* renamed from: com.wang.avi.indicators.BallSpinFadeLoaderIndicator$1 */
    class C16881 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallSpinFadeLoaderIndicator this$0;
        final /* synthetic */ int val$index;

        C16881(BallSpinFadeLoaderIndicator ballSpinFadeLoaderIndicator, int i) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.wang.avi.indicators.BallSpinFadeLoaderIndicator$2 */
    class C16892 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallSpinFadeLoaderIndicator this$0;
        final /* synthetic */ int val$index;

        C16892(BallSpinFadeLoaderIndicator ballSpinFadeLoaderIndicator, int i) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    final class Point {
        final /* synthetic */ BallSpinFadeLoaderIndicator this$0;

        /* renamed from: x */
        public float f1151x;

        /* renamed from: y */
        public float f1152y;

        public Point(BallSpinFadeLoaderIndicator ballSpinFadeLoaderIndicator, float f, float f2) {
        }
    }

    Point circleAt(int i, int i2, float f, double d) {
    }

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
    }
}
