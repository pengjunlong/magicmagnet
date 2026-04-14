package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class BallZigZagIndicator extends Indicator {
    float[] translateX;
    float[] translateY;

    /* renamed from: com.wang.avi.indicators.BallZigZagIndicator$1 */
    class C16941 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallZigZagIndicator this$0;
        final /* synthetic */ int val$index;

        C16941(BallZigZagIndicator ballZigZagIndicator, int i) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.wang.avi.indicators.BallZigZagIndicator$2 */
    class C16952 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallZigZagIndicator this$0;
        final /* synthetic */ int val$index;

        C16952(BallZigZagIndicator ballZigZagIndicator, int i) {
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
