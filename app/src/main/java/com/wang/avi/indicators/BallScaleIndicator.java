package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class BallScaleIndicator extends Indicator {
    int alpha;
    float scale;

    /* renamed from: com.wang.avi.indicators.BallScaleIndicator$1 */
    class C16801 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallScaleIndicator this$0;

        C16801(BallScaleIndicator ballScaleIndicator) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.wang.avi.indicators.BallScaleIndicator$2 */
    class C16812 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallScaleIndicator this$0;

        C16812(BallScaleIndicator ballScaleIndicator) {
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
