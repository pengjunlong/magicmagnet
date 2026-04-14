package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class MotionUtils {
    private static final String EASING_TYPE_CUBIC_BEZIER = "cubic-bezier";
    private static final String EASING_TYPE_FORMAT_END = ")";
    private static final String EASING_TYPE_FORMAT_START = "(";
    private static final String EASING_TYPE_PATH = "path";

    private MotionUtils() {
    }

    private static float getLegacyControlPoint(String[] strArr, int i) {
    }

    private static String getLegacyEasingContent(String str, String str2) {
    }

    private static TimeInterpolator getLegacyThemeInterpolator(String str) {
    }

    private static boolean isLegacyEasingAttribute(String str) {
    }

    private static boolean isLegacyEasingType(String str, String str2) {
    }

    public static int resolveThemeDuration(Context context, int i, int i2) {
    }

    public static TimeInterpolator resolveThemeInterpolator(Context context, int i, TimeInterpolator timeInterpolator) {
    }
}
