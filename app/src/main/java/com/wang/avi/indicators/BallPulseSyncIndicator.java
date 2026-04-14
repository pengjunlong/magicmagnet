package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class BallPulseSyncIndicator extends Indicator {
    float[] translateYFloats;

    /* renamed from: com.wang.avi.indicators.BallPulseSyncIndicator$1 */
    class C16771 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallPulseSyncIndicator this$0;
        final /* synthetic */ int val$index;

        C16771(BallPulseSyncIndicator ballPulseSyncIndicator, int i) {
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
