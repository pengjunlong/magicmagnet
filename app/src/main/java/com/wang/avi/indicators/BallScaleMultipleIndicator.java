package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class BallScaleMultipleIndicator extends Indicator {
    int[] alphaInts;
    float[] scaleFloats;

    /* renamed from: com.wang.avi.indicators.BallScaleMultipleIndicator$1 */
    class C16821 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallScaleMultipleIndicator this$0;
        final /* synthetic */ int val$index;

        C16821(BallScaleMultipleIndicator ballScaleMultipleIndicator, int i) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.wang.avi.indicators.BallScaleMultipleIndicator$2 */
    class C16832 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallScaleMultipleIndicator this$0;
        final /* synthetic */ int val$index;

        C16832(BallScaleMultipleIndicator ballScaleMultipleIndicator, int i) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
    }
}
