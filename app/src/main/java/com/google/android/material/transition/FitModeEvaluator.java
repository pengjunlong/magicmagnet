package com.google.android.material.transition;

import android.graphics.RectF;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
interface FitModeEvaluator {
    void applyMask(RectF rectF, float f, FitModeResult fitModeResult);

    FitModeResult evaluate(float f, float f2, float f3, float f4, float f5, float f6, float f7);

    boolean shouldMaskStartBounds(FitModeResult fitModeResult);
}
