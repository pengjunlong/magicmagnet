package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class BallScaleRippleMultipleIndicator extends BallScaleMultipleIndicator {

    /* renamed from: com.wang.avi.indicators.BallScaleRippleMultipleIndicator$1 */
    class C16861 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallScaleRippleMultipleIndicator this$0;
        final /* synthetic */ int val$index;

        C16861(BallScaleRippleMultipleIndicator ballScaleRippleMultipleIndicator, int i) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.wang.avi.indicators.BallScaleRippleMultipleIndicator$2 */
    class C16872 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallScaleRippleMultipleIndicator this$0;
        final /* synthetic */ int val$index;

        C16872(BallScaleRippleMultipleIndicator ballScaleRippleMultipleIndicator, int i) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    @Override // com.wang.avi.indicators.BallScaleMultipleIndicator, com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
    }

    @Override // com.wang.avi.indicators.BallScaleMultipleIndicator, com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
    }
}
