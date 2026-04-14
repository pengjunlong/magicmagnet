package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class BallGridPulseIndicator extends Indicator {
    public static final int ALPHA = 255;
    public static final float SCALE = 1.0f;
    int[] alphas;
    float[] scaleFloats;

    /* renamed from: com.wang.avi.indicators.BallGridPulseIndicator$1 */
    class C16731 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallGridPulseIndicator this$0;
        final /* synthetic */ int val$index;

        C16731(BallGridPulseIndicator ballGridPulseIndicator, int i) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.wang.avi.indicators.BallGridPulseIndicator$2 */
    class C16742 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallGridPulseIndicator this$0;
        final /* synthetic */ int val$index;

        C16742(BallGridPulseIndicator ballGridPulseIndicator, int i) {
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
