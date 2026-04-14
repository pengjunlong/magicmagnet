package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class PacmanIndicator extends Indicator {
    private int alpha;
    private float degrees1;
    private float degrees2;
    private float translateX;

    /* renamed from: com.wang.avi.indicators.PacmanIndicator$1 */
    class C17041 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ PacmanIndicator this$0;

        C17041(PacmanIndicator pacmanIndicator) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.wang.avi.indicators.PacmanIndicator$2 */
    class C17052 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ PacmanIndicator this$0;

        C17052(PacmanIndicator pacmanIndicator) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.wang.avi.indicators.PacmanIndicator$3 */
    class C17063 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ PacmanIndicator this$0;

        C17063(PacmanIndicator pacmanIndicator) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.wang.avi.indicators.PacmanIndicator$4 */
    class C17074 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ PacmanIndicator this$0;

        C17074(PacmanIndicator pacmanIndicator) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    static /* synthetic */ float access$002(PacmanIndicator pacmanIndicator, float f) {
    }

    static /* synthetic */ int access$102(PacmanIndicator pacmanIndicator, int i) {
    }

    static /* synthetic */ float access$202(PacmanIndicator pacmanIndicator, float f) {
    }

    static /* synthetic */ float access$302(PacmanIndicator pacmanIndicator, float f) {
    }

    private void drawCircle(Canvas canvas, Paint paint) {
    }

    private void drawPacman(Canvas canvas, Paint paint) {
    }

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
    }
}
