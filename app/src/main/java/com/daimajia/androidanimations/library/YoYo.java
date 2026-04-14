package com.daimajia.androidanimations.library;

import android.animation.Animator;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class YoYo {
    public static final float CENTER_PIVOT = Float.MAX_VALUE;
    private static final long DURATION = 1000;
    public static final int INFINITE = -1;
    private static final long NO_DELAY = 0;
    private BaseViewAnimator animator;
    private List<Animator.AnimatorListener> callbacks;
    private long delay;
    private long duration;
    private Interpolator interpolator;
    private float pivotX;
    private float pivotY;
    private boolean repeat;
    private int repeatMode;
    private int repeatTimes;
    private View target;

    public static final class AnimationComposer {
        private BaseViewAnimator animator;
        private List<Animator.AnimatorListener> callbacks;
        private long delay;
        private long duration;
        private Interpolator interpolator;
        private float pivotX;
        private float pivotY;
        private boolean repeat;
        private int repeatMode;
        private int repeatTimes;
        private View target;

        /* renamed from: com.daimajia.androidanimations.library.YoYo$AnimationComposer$1 */
        class C00451 extends EmptyAnimatorListener {
            final /* synthetic */ AnimationComposer this$0;
            final /* synthetic */ AnimatorCallback val$callback;

            C00451(AnimationComposer animationComposer, AnimatorCallback animatorCallback) {
            }

            @Override // com.daimajia.androidanimations.library.YoYo.EmptyAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        }

        /* renamed from: com.daimajia.androidanimations.library.YoYo$AnimationComposer$2 */
        class C00462 extends EmptyAnimatorListener {
            final /* synthetic */ AnimationComposer this$0;
            final /* synthetic */ AnimatorCallback val$callback;

            C00462(AnimationComposer animationComposer, AnimatorCallback animatorCallback) {
            }

            @Override // com.daimajia.androidanimations.library.YoYo.EmptyAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }
        }

        /* renamed from: com.daimajia.androidanimations.library.YoYo$AnimationComposer$3 */
        class C00473 extends EmptyAnimatorListener {
            final /* synthetic */ AnimationComposer this$0;
            final /* synthetic */ AnimatorCallback val$callback;

            C00473(AnimationComposer animationComposer, AnimatorCallback animatorCallback) {
            }

            @Override // com.daimajia.androidanimations.library.YoYo.EmptyAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }
        }

        /* renamed from: com.daimajia.androidanimations.library.YoYo$AnimationComposer$4 */
        class C00484 extends EmptyAnimatorListener {
            final /* synthetic */ AnimationComposer this$0;
            final /* synthetic */ AnimatorCallback val$callback;

            C00484(AnimationComposer animationComposer, AnimatorCallback animatorCallback) {
            }

            @Override // com.daimajia.androidanimations.library.YoYo.EmptyAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }
        }

        /* synthetic */ AnimationComposer(BaseViewAnimator baseViewAnimator, C00441 c00441) {
        }

        static /* synthetic */ BaseViewAnimator access$000(AnimationComposer animationComposer) {
        }

        static /* synthetic */ long access$100(AnimationComposer animationComposer) {
        }

        static /* synthetic */ View access$1000(AnimationComposer animationComposer) {
        }

        static /* synthetic */ long access$200(AnimationComposer animationComposer) {
        }

        static /* synthetic */ boolean access$300(AnimationComposer animationComposer) {
        }

        static /* synthetic */ int access$400(AnimationComposer animationComposer) {
        }

        static /* synthetic */ int access$500(AnimationComposer animationComposer) {
        }

        static /* synthetic */ Interpolator access$600(AnimationComposer animationComposer) {
        }

        static /* synthetic */ float access$700(AnimationComposer animationComposer) {
        }

        static /* synthetic */ float access$800(AnimationComposer animationComposer) {
        }

        static /* synthetic */ List access$900(AnimationComposer animationComposer) {
        }

        public AnimationComposer delay(long j) {
        }

        public AnimationComposer duration(long j) {
        }

        public AnimationComposer interpolate(Interpolator interpolator) {
        }

        public AnimationComposer onCancel(AnimatorCallback animatorCallback) {
        }

        public AnimationComposer onEnd(AnimatorCallback animatorCallback) {
        }

        public AnimationComposer onRepeat(AnimatorCallback animatorCallback) {
        }

        public AnimationComposer onStart(AnimatorCallback animatorCallback) {
        }

        public AnimationComposer pivot(float f, float f2) {
        }

        public AnimationComposer pivotX(float f) {
        }

        public AnimationComposer pivotY(float f) {
        }

        public YoYoString playOn(View view) {
        }

        public AnimationComposer repeat(int i) {
        }

        public AnimationComposer repeatMode(int i) {
        }

        public AnimationComposer withListener(Animator.AnimatorListener animatorListener) {
        }

        /* synthetic */ AnimationComposer(Techniques techniques, C00441 c00441) {
        }

        private AnimationComposer(Techniques techniques) {
        }

        private AnimationComposer(BaseViewAnimator baseViewAnimator) {
        }
    }

    public interface AnimatorCallback {
        void call(Animator animator);
    }

    private static class EmptyAnimatorListener implements Animator.AnimatorListener {
        private EmptyAnimatorListener() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        /* synthetic */ EmptyAnimatorListener(C00441 c00441) {
        }
    }

    public static final class YoYoString {
        private BaseViewAnimator animator;
        private View target;

        /* synthetic */ YoYoString(BaseViewAnimator baseViewAnimator, View view, C00441 c00441) {
        }

        public boolean isRunning() {
        }

        public boolean isStarted() {
        }

        public void stop() {
        }

        private YoYoString(BaseViewAnimator baseViewAnimator, View view) {
        }

        public void stop(boolean z) {
        }
    }

    /* synthetic */ YoYo(AnimationComposer animationComposer, C00441 c00441) {
    }

    static /* synthetic */ BaseViewAnimator access$1500(YoYo yoYo) {
    }

    private BaseViewAnimator play() {
    }

    public static AnimationComposer with(Techniques techniques) {
    }

    private YoYo(AnimationComposer animationComposer) {
    }

    public static AnimationComposer with(BaseViewAnimator baseViewAnimator) {
    }
}
