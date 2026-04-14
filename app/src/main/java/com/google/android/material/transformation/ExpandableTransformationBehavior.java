package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    private AnimatorSet currentAnimation;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$1 */
    class C05001 extends AnimatorListenerAdapter {
        final /* synthetic */ ExpandableTransformationBehavior this$0;

        C05001(ExpandableTransformationBehavior expandableTransformationBehavior) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    public ExpandableTransformationBehavior() {
    }

    static /* synthetic */ AnimatorSet access$002(ExpandableTransformationBehavior expandableTransformationBehavior, AnimatorSet animatorSet) {
    }

    protected abstract AnimatorSet onCreateExpandedStateChangeAnimation(View view, View view2, boolean z, boolean z2);

    @Override // com.google.android.material.transformation.ExpandableBehavior
    protected boolean onExpandedStateChange(View view, View view2, boolean z, boolean z2) {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
    }
}
