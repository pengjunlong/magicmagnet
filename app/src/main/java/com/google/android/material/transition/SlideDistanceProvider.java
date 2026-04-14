package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class SlideDistanceProvider implements VisibilityAnimatorProvider {
    private static final int DEFAULT_DISTANCE = -1;
    private int slideDistance;
    private int slideEdge;

    /* renamed from: com.google.android.material.transition.SlideDistanceProvider$1 */
    class C05211 extends AnimatorListenerAdapter {
        final /* synthetic */ float val$originalTranslation;
        final /* synthetic */ View val$view;

        C05211(View view, float f) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.transition.SlideDistanceProvider$2 */
    class C05222 extends AnimatorListenerAdapter {
        final /* synthetic */ float val$originalTranslation;
        final /* synthetic */ View val$view;

        C05222(View view, float f) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface GravityFlag {
    }

    public SlideDistanceProvider(int i) {
    }

    private static Animator createTranslationAppearAnimator(View view, View view2, int i, int i2) {
    }

    private static Animator createTranslationDisappearAnimator(View view, View view2, int i, int i2) {
    }

    private static Animator createTranslationXAnimator(View view, float f, float f2, float f3) {
    }

    private static Animator createTranslationYAnimator(View view, float f, float f2, float f3) {
    }

    private int getSlideDistanceOrDefault(Context context) {
    }

    private static boolean isRtl(View view) {
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    public Animator createAppear(ViewGroup viewGroup, View view) {
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    public Animator createDisappear(ViewGroup viewGroup, View view) {
    }

    public int getSlideDistance() {
    }

    public int getSlideEdge() {
    }

    public void setSlideDistance(int i) {
    }

    public void setSlideEdge(int i) {
    }
}
