package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.qbddqbdJBkudFfhX1ll1l111;
import androidx.transition.qbpbddbpyaPAbpThgWCvm11l11l1;
import com.google.android.material.transition.VisibilityAnimatorProvider;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
abstract class MaterialVisibility<P extends VisibilityAnimatorProvider> extends qbpbddbpyaPAbpThgWCvm11l11l1 {
    private final List<VisibilityAnimatorProvider> additionalAnimatorProviders;
    private final P primaryAnimatorProvider;
    private VisibilityAnimatorProvider secondaryAnimatorProvider;

    protected MaterialVisibility(P p, VisibilityAnimatorProvider visibilityAnimatorProvider) {
    }

    private static void addAnimatorIfNeeded(List<Animator> list, VisibilityAnimatorProvider visibilityAnimatorProvider, ViewGroup viewGroup, View view, boolean z) {
    }

    private Animator createAnimator(ViewGroup viewGroup, View view, boolean z) {
    }

    private void maybeApplyThemeValues(Context context, boolean z) {
    }

    public void addAdditionalAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
    }

    public void clearAdditionalAnimatorProvider() {
    }

    TimeInterpolator getDefaultEasingInterpolator(boolean z) {
    }

    int getDurationThemeAttrResId(boolean z) {
    }

    int getEasingThemeAttrResId(boolean z) {
    }

    public P getPrimaryAnimatorProvider() {
    }

    public VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
    }

    @Override // androidx.transition.qbpbddbpyaPAbpThgWCvm11l11l1
    public Animator onAppear(ViewGroup viewGroup, View view, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l1112) {
    }

    @Override // androidx.transition.qbpbddbpyaPAbpThgWCvm11l11l1
    public Animator onDisappear(ViewGroup viewGroup, View view, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l1112) {
    }

    public boolean removeAdditionalAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
    }

    public void setSecondaryAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
    }
}
