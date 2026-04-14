package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.Map;

@Deprecated
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    private Map<View, Integer> importantForAccessibilityMap;

    public FabTransformationSheetBehavior() {
    }

    private void updateImportantForAccessibility(View view, boolean z) {
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    protected FabTransformationBehavior.FabTransformationSpec onCreateMotionSpec(Context context, boolean z) {
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    protected boolean onExpandedStateChange(View view, View view2, boolean z, boolean z2) {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
    }
}
