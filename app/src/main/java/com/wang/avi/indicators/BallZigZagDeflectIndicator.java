package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import java.util.ArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class BallZigZagDeflectIndicator extends BallZigZagIndicator {

    /* renamed from: com.wang.avi.indicators.BallZigZagDeflectIndicator$1 */
    class C16921 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallZigZagDeflectIndicator this$0;
        final /* synthetic */ int val$index;

        C16921(BallZigZagDeflectIndicator ballZigZagDeflectIndicator, int i) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.wang.avi.indicators.BallZigZagDeflectIndicator$2 */
    class C16932 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BallZigZagDeflectIndicator this$0;
        final /* synthetic */ int val$index;

        C16932(BallZigZagDeflectIndicator ballZigZagDeflectIndicator, int i) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    @Override // com.wang.avi.indicators.BallZigZagIndicator, com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
    }
}
