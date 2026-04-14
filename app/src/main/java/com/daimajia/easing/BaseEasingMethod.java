package com.daimajia.easing;

import android.animation.TypeEvaluator;
import java.util.ArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class BaseEasingMethod implements TypeEvaluator<Number> {
    protected float mDuration;
    private ArrayList<EasingListener> mListeners;

    public interface EasingListener {
        void on(float f, float f2, float f3, float f4, float f5);
    }

    public BaseEasingMethod(float f) {
    }

    public void addEasingListener(EasingListener easingListener) {
    }

    public void addEasingListeners(EasingListener... easingListenerArr) {
    }

    public abstract Float calculate(float f, float f2, float f3, float f4);

    public void clearEasingListeners() {
    }

    @Override // android.animation.TypeEvaluator
    public /* bridge */ /* synthetic */ Number evaluate(float f, Number number, Number number2) {
    }

    public void removeEasingListener(EasingListener easingListener) {
    }

    public void setDuration(float f) {
    }

    /* renamed from: evaluate, reason: avoid collision after fix types in other method */
    public final Float evaluate2(float f, Number number, Number number2) {
    }
}
