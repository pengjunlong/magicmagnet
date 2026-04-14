package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class BallPulseIndicator extends Indicator {
    public static final float SCALE = 1.0f;
    private float[] scaleFloats;

    /* renamed from: com.wang.avi.indicators.BallPulseIndicator$1 */
    class C16751 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallPulseIndicator this$0;
        final /* synthetic */ int val$index;

        C16751(BallPulseIndicator ballPulseIndicator, int i) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    static /* synthetic */ float[] access$000(BallPulseIndicator ballPulseIndicator) {
    }

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
    }
}
