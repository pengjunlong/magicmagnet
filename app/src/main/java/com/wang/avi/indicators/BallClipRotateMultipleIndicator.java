package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class BallClipRotateMultipleIndicator extends Indicator {
    float degrees;
    float scaleFloat;

    /* renamed from: com.wang.avi.indicators.BallClipRotateMultipleIndicator$1 */
    class C16671 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallClipRotateMultipleIndicator this$0;

        C16671(BallClipRotateMultipleIndicator ballClipRotateMultipleIndicator) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.wang.avi.indicators.BallClipRotateMultipleIndicator$2 */
    class C16682 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallClipRotateMultipleIndicator this$0;

        C16682(BallClipRotateMultipleIndicator ballClipRotateMultipleIndicator) {
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
