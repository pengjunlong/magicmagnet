package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class BallRotateIndicator extends Indicator {
    float degress;
    private Matrix mMatrix;
    float scaleFloat;

    /* renamed from: com.wang.avi.indicators.BallRotateIndicator$1 */
    class C16781 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallRotateIndicator this$0;

        C16781(BallRotateIndicator ballRotateIndicator) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.wang.avi.indicators.BallRotateIndicator$2 */
    class C16792 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallRotateIndicator this$0;

        C16792(BallRotateIndicator ballRotateIndicator) {
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
