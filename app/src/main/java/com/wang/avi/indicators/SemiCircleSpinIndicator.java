package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class SemiCircleSpinIndicator extends Indicator {
    private float degress;

    /* renamed from: com.wang.avi.indicators.SemiCircleSpinIndicator$1 */
    class C17081 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ SemiCircleSpinIndicator this$0;

        C17081(SemiCircleSpinIndicator semiCircleSpinIndicator) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    static /* synthetic */ float access$002(SemiCircleSpinIndicator semiCircleSpinIndicator, float f) {
    }

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
    }
}
