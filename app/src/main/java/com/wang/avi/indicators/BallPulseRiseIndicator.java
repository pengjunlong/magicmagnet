package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class BallPulseRiseIndicator extends Indicator {
    private float degress;
    private Camera mCamera;
    private Matrix mMatrix;

    /* renamed from: com.wang.avi.indicators.BallPulseRiseIndicator$1 */
    class C16761 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallPulseRiseIndicator this$0;

        C16761(BallPulseRiseIndicator ballPulseRiseIndicator) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    static /* synthetic */ float access$002(BallPulseRiseIndicator ballPulseRiseIndicator, float f) {
    }

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
    }
}
