package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Property;
import com.google.android.material.animation.MotionSpec;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
abstract class BaseMotionStrategy implements MotionStrategy {
    private final Context context;
    private MotionSpec defaultMotionSpec;
    private final ExtendedFloatingActionButton fab;
    private final ArrayList<Animator.AnimatorListener> listeners;
    private MotionSpec motionSpec;
    private final AnimatorTracker tracker;

    /* renamed from: com.google.android.material.floatingactionbutton.BaseMotionStrategy$1 */
    class C03501 extends Property<ExtendedFloatingActionButton, Float> {
        final /* synthetic */ BaseMotionStrategy this$0;

        C03501(BaseMotionStrategy baseMotionStrategy, Class cls, String str) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
        }

        /* renamed from: get, reason: avoid collision after fix types in other method */
        public Float get2(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        /* renamed from: set, reason: avoid collision after fix types in other method */
        public void set2(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
        }
    }

    BaseMotionStrategy(ExtendedFloatingActionButton extendedFloatingActionButton, AnimatorTracker animatorTracker) {
    }

    static /* synthetic */ ExtendedFloatingActionButton access$000(BaseMotionStrategy baseMotionStrategy) {
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final void addAnimationListener(Animator.AnimatorListener animatorListener) {
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public AnimatorSet createAnimator() {
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final MotionSpec getCurrentMotionSpec() {
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final List<Animator.AnimatorListener> getListeners() {
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public MotionSpec getMotionSpec() {
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public void onAnimationCancel() {
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public void onAnimationEnd() {
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public void onAnimationStart(Animator animator) {
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final void removeAnimationListener(Animator.AnimatorListener animatorListener) {
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final void setMotionSpec(MotionSpec motionSpec) {
    }

    AnimatorSet createAnimator(MotionSpec motionSpec) {
    }
}
