package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class LineScalePartyIndicator extends Indicator {
    public static final float SCALE = 1.0f;
    float[] scaleFloats;

    /* renamed from: com.wang.avi.indicators.LineScalePartyIndicator$1 */
    class C17011 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ LineScalePartyIndicator this$0;
        final /* synthetic */ int val$index;

        C17011(LineScalePartyIndicator lineScalePartyIndicator, int i) {
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
