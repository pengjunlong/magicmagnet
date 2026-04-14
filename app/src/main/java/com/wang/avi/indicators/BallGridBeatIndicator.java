package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class BallGridBeatIndicator extends Indicator {
    public static final int ALPHA = 255;
    int[] alphas;

    /* renamed from: com.wang.avi.indicators.BallGridBeatIndicator$1 */
    class C16721 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallGridBeatIndicator this$0;
        final /* synthetic */ int val$index;

        C16721(BallGridBeatIndicator ballGridBeatIndicator, int i) {
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
