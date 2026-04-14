package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import java.util.Collection;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class MultiViewUpdateListener implements ValueAnimator.AnimatorUpdateListener {
    private final Listener listener;
    private final View[] views;

    interface Listener {
        void onAnimationUpdate(ValueAnimator valueAnimator, View view);
    }

    @SuppressLint({"LambdaLast"})
    public MultiViewUpdateListener(Listener listener, View... viewArr) {
    }

    public static MultiViewUpdateListener alphaListener(View... viewArr) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(ValueAnimator valueAnimator, View view) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(ValueAnimator valueAnimator, View view) {
    }

    public static /* synthetic */ void dpbdpqRKAscW1lll1l(ValueAnimator valueAnimator, View view) {
    }

    public static /* synthetic */ void dqqppqiKzJi1l1lll1l(ValueAnimator valueAnimator, View view) {
    }

    public static MultiViewUpdateListener scaleListener(View... viewArr) {
    }

    private static void setAlpha(ValueAnimator valueAnimator, View view) {
    }

    private static void setScale(ValueAnimator valueAnimator, View view) {
    }

    private static void setTranslationX(ValueAnimator valueAnimator, View view) {
    }

    private static void setTranslationY(ValueAnimator valueAnimator, View view) {
    }

    public static MultiViewUpdateListener translationXListener(View... viewArr) {
    }

    public static MultiViewUpdateListener translationYListener(View... viewArr) {
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
    }

    public static MultiViewUpdateListener alphaListener(Collection<View> collection) {
    }

    public static MultiViewUpdateListener scaleListener(Collection<View> collection) {
    }

    public static MultiViewUpdateListener translationXListener(Collection<View> collection) {
    }

    public static MultiViewUpdateListener translationYListener(Collection<View> collection) {
    }

    @SuppressLint({"LambdaLast"})
    public MultiViewUpdateListener(Listener listener, Collection<View> collection) {
    }
}
