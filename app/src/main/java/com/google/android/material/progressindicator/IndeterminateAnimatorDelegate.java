package com.google.android.material.progressindicator;

import android.animation.Animator;
import androidx.vectordrawable.graphics.drawable.dpbdbdpbLwkLpObyKsq1lll1;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
abstract class IndeterminateAnimatorDelegate<T extends Animator> {
    protected IndeterminateDrawable drawable;
    protected final int[] segmentColors;
    protected final float[] segmentPositions;

    protected IndeterminateAnimatorDelegate(int i) {
    }

    abstract void cancelAnimatorImmediately();

    protected float getFractionInRange(int i, int i2, int i3) {
    }

    public abstract void invalidateSpecValues();

    public abstract void registerAnimatorsCompleteCallback(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1);

    protected void registerDrawable(IndeterminateDrawable indeterminateDrawable) {
    }

    abstract void requestCancelAnimatorAfterCurrentCycle();

    abstract void startAnimator();

    public abstract void unregisterAnimatorsCompleteCallback();
}
