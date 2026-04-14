package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import java.util.ArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class LineScalePulseOutIndicator extends LineScaleIndicator {

    /* renamed from: com.wang.avi.indicators.LineScalePulseOutIndicator$1 */
    class C17021 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ LineScalePulseOutIndicator this$0;
        final /* synthetic */ int val$index;

        C17021(LineScalePulseOutIndicator lineScalePulseOutIndicator, int i) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    @Override // com.wang.avi.indicators.LineScaleIndicator, com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
    }
}
