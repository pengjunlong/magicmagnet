package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class BallClipRotatePulseIndicator extends Indicator {
    float degrees;
    float scaleFloat1;
    float scaleFloat2;

    /* renamed from: com.wang.avi.indicators.BallClipRotatePulseIndicator$1 */
    class C16691 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallClipRotatePulseIndicator this$0;

        C16691(BallClipRotatePulseIndicator ballClipRotatePulseIndicator) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.wang.avi.indicators.BallClipRotatePulseIndicator$2 */
    class C16702 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallClipRotatePulseIndicator this$0;

        C16702(BallClipRotatePulseIndicator ballClipRotatePulseIndicator) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.wang.avi.indicators.BallClipRotatePulseIndicator$3 */
    class C16713 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallClipRotatePulseIndicator this$0;

        C16713(BallClipRotatePulseIndicator ballClipRotatePulseIndicator) {
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
