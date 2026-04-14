package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class StateListAnimator {
    private final Animator.AnimatorListener animationListener;
    private Tuple lastMatch;
    ValueAnimator runningAnimator;
    private final ArrayList<Tuple> tuples;

    /* renamed from: com.google.android.material.internal.StateListAnimator$1 */
    class C03821 extends AnimatorListenerAdapter {
        final /* synthetic */ StateListAnimator this$0;

        C03821(StateListAnimator stateListAnimator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    static class Tuple {
        final ValueAnimator animator;
        final int[] specs;

        Tuple(int[] iArr, ValueAnimator valueAnimator) {
        }
    }

    private void cancel() {
    }

    private void start(Tuple tuple) {
    }

    public void addState(int[] iArr, ValueAnimator valueAnimator) {
    }

    public void jumpToCurrentState() {
    }

    public void setState(int[] iArr) {
    }
}
