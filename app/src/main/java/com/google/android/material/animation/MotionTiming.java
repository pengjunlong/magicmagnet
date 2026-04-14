package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class MotionTiming {
    private long delay;
    private long duration;
    private TimeInterpolator interpolator;
    private int repeatCount;
    private int repeatMode;

    public MotionTiming(long j, long j2) {
    }

    static MotionTiming createFromAnimator(ValueAnimator valueAnimator) {
    }

    private static TimeInterpolator getInterpolatorCompat(ValueAnimator valueAnimator) {
    }

    public void apply(Animator animator) {
    }

    public boolean equals(Object obj) {
    }

    public long getDelay() {
    }

    public long getDuration() {
    }

    public TimeInterpolator getInterpolator() {
    }

    public int getRepeatCount() {
    }

    public int getRepeatMode() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    public MotionTiming(long j, long j2, TimeInterpolator timeInterpolator) {
    }
}
