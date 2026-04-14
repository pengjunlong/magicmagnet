package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.qbddqbdJBkudFfhX1ll1l111;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class MaterialFade extends MaterialVisibility<FadeProvider> {
    private static final float DEFAULT_FADE_END_THRESHOLD_ENTER = 0.3f;
    private static final float DEFAULT_START_SCALE = 0.8f;
    private static final int DEFAULT_THEMED_INCOMING_DURATION_ATTR = 0;
    private static final int DEFAULT_THEMED_INCOMING_EASING_ATTR = 0;
    private static final int DEFAULT_THEMED_OUTGOING_DURATION_ATTR = 0;
    private static final int DEFAULT_THEMED_OUTGOING_EASING_ATTR = 0;

    private static FadeProvider createPrimaryAnimatorProvider() {
    }

    private static VisibilityAnimatorProvider createSecondaryAnimatorProvider() {
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    TimeInterpolator getDefaultEasingInterpolator(boolean z) {
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    int getDurationThemeAttrResId(boolean z) {
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    int getEasingThemeAttrResId(boolean z) {
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ FadeProvider getPrimaryAnimatorProvider() {
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
    }

    @Override // com.google.android.material.transition.MaterialVisibility, androidx.transition.qbpbddbpyaPAbpThgWCvm11l11l1
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l1112) {
    }

    @Override // com.google.android.material.transition.MaterialVisibility, androidx.transition.qbpbddbpyaPAbpThgWCvm11l11l1
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l1112) {
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
    }
}
