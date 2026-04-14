package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.qbddqbdJBkudFfhX1ll1l111;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class MaterialSharedAxis extends MaterialVisibility<VisibilityAnimatorProvider> {
    private static final int DEFAULT_THEMED_DURATION_ATTR = 0;
    private static final int DEFAULT_THEMED_EASING_ATTR = 0;

    /* renamed from: X */
    public static final int f42X = 0;

    /* renamed from: Y */
    public static final int f43Y = 1;

    /* renamed from: Z */
    public static final int f44Z = 2;
    private final int axis;
    private final boolean forward;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Axis {
    }

    public MaterialSharedAxis(int i, boolean z) {
    }

    private static VisibilityAnimatorProvider createPrimaryAnimatorProvider(int i, boolean z) {
    }

    private static VisibilityAnimatorProvider createSecondaryAnimatorProvider() {
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
    }

    public int getAxis() {
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    int getDurationThemeAttrResId(boolean z) {
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    int getEasingThemeAttrResId(boolean z) {
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
    }

    public boolean isForward() {
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
