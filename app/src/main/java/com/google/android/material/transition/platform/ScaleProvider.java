package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class ScaleProvider implements VisibilityAnimatorProvider {
    private boolean growing;
    private float incomingEndScale;
    private float incomingStartScale;
    private float outgoingEndScale;
    private float outgoingStartScale;
    private boolean scaleOnDisappear;

    /* renamed from: com.google.android.material.transition.platform.ScaleProvider$1 */
    class C05411 extends AnimatorListenerAdapter {
        final /* synthetic */ float val$originalScaleX;
        final /* synthetic */ float val$originalScaleY;
        final /* synthetic */ View val$view;

        C05411(View view, float f, float f2) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    public ScaleProvider() {
    }

    private static Animator createScaleAnimator(View view, float f, float f2) {
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    public Animator createAppear(ViewGroup viewGroup, View view) {
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    public Animator createDisappear(ViewGroup viewGroup, View view) {
    }

    public float getIncomingEndScale() {
    }

    public float getIncomingStartScale() {
    }

    public float getOutgoingEndScale() {
    }

    public float getOutgoingStartScale() {
    }

    public boolean isGrowing() {
    }

    public boolean isScaleOnDisappear() {
    }

    public void setGrowing(boolean z) {
    }

    public void setIncomingEndScale(float f) {
    }

    public void setIncomingStartScale(float f) {
    }

    public void setOutgoingEndScale(float f) {
    }

    public void setOutgoingStartScale(float f) {
    }

    public void setScaleOnDisappear(boolean z) {
    }

    public ScaleProvider(boolean z) {
    }
}
