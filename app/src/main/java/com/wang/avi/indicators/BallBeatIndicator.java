package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class BallBeatIndicator extends Indicator {
    public static final int ALPHA = 255;
    public static final float SCALE = 1.0f;
    int[] alphas;
    private float[] scaleFloats;

    /* renamed from: com.wang.avi.indicators.BallBeatIndicator$1 */
    class C16631 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallBeatIndicator this$0;
        final /* synthetic */ int val$index;

        C16631(BallBeatIndicator ballBeatIndicator, int i) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.wang.avi.indicators.BallBeatIndicator$2 */
    class C16642 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallBeatIndicator this$0;
        final /* synthetic */ int val$index;

        C16642(BallBeatIndicator ballBeatIndicator, int i) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    static /* synthetic */ float[] access$000(BallBeatIndicator ballBeatIndicator) {
    }

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
    }
}
