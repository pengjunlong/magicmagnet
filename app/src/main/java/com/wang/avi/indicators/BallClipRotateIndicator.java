package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class BallClipRotateIndicator extends Indicator {
    float degrees;
    float scaleFloat;

    /* renamed from: com.wang.avi.indicators.BallClipRotateIndicator$1 */
    class C16651 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallClipRotateIndicator this$0;

        C16651(BallClipRotateIndicator ballClipRotateIndicator) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.wang.avi.indicators.BallClipRotateIndicator$2 */
    class C16662 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallClipRotateIndicator this$0;

        C16662(BallClipRotateIndicator ballClipRotateIndicator) {
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
