package com.daimajia.androidanimations.library;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.animation.Interpolator;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class BaseViewAnimator {
    public static final long DURATION = 1000;
    private AnimatorSet mAnimatorSet;
    private long mDuration;
    private int mRepeatMode;
    private int mRepeatTimes;

    public BaseViewAnimator addAnimatorListener(Animator.AnimatorListener animatorListener) {
    }

    public void animate() {
    }

    public void cancel() {
    }

    public AnimatorSet getAnimatorAgent() {
    }

    public long getDuration() {
    }

    public long getStartDelay() {
    }

    public boolean isRunning() {
    }

    public boolean isStarted() {
    }

    protected abstract void prepare(View view);

    public void removeAllListener() {
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
    }

    public void reset(View view) {
    }

    public void restart() {
    }

    public BaseViewAnimator setDuration(long j) {
    }

    public BaseViewAnimator setInterpolator(Interpolator interpolator) {
    }

    public BaseViewAnimator setRepeatMode(int i) {
    }

    public BaseViewAnimator setRepeatTimes(int i) {
    }

    public BaseViewAnimator setStartDelay(long j) {
    }

    public BaseViewAnimator setTarget(View view) {
    }

    public void start() {
    }
}
