package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class CubeTransitionIndicator extends Indicator {
    float degrees;
    float scaleFloat;
    float[] translateX;
    float[] translateY;

    /* renamed from: com.wang.avi.indicators.CubeTransitionIndicator$1 */
    class C16961 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ CubeTransitionIndicator this$0;
        final /* synthetic */ int val$index;

        C16961(CubeTransitionIndicator cubeTransitionIndicator, int i) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.wang.avi.indicators.CubeTransitionIndicator$2 */
    class C16972 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ CubeTransitionIndicator this$0;
        final /* synthetic */ int val$index;

        C16972(CubeTransitionIndicator cubeTransitionIndicator, int i) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.wang.avi.indicators.CubeTransitionIndicator$3 */
    class C16983 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ CubeTransitionIndicator this$0;

        C16983(CubeTransitionIndicator cubeTransitionIndicator) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.wang.avi.indicators.CubeTransitionIndicator$4 */
    class C16994 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ CubeTransitionIndicator this$0;

        C16994(CubeTransitionIndicator cubeTransitionIndicator) {
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
