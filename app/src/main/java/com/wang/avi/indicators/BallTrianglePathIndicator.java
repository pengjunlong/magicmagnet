package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class BallTrianglePathIndicator extends Indicator {
    float[] translateX;
    float[] translateY;

    /* renamed from: com.wang.avi.indicators.BallTrianglePathIndicator$1 */
    class C16901 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallTrianglePathIndicator this$0;
        final /* synthetic */ int val$index;

        C16901(BallTrianglePathIndicator ballTrianglePathIndicator, int i) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.wang.avi.indicators.BallTrianglePathIndicator$2 */
    class C16912 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallTrianglePathIndicator this$0;
        final /* synthetic */ int val$index;

        C16912(BallTrianglePathIndicator ballTrianglePathIndicator, int i) {
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
