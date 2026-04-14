package com.google.android.material.ripple;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class RippleUtils {
    private static final int[] ENABLED_PRESSED_STATE_SET = null;
    private static final int[] FOCUSED_STATE_SET = null;
    private static final int[] HOVERED_FOCUSED_STATE_SET = null;
    private static final int[] HOVERED_STATE_SET = null;
    static final String LOG_TAG = null;
    private static final int[] PRESSED_STATE_SET = null;
    private static final int[] SELECTED_FOCUSED_STATE_SET = null;
    private static final int[] SELECTED_HOVERED_FOCUSED_STATE_SET = null;
    private static final int[] SELECTED_HOVERED_STATE_SET = null;
    private static final int[] SELECTED_PRESSED_STATE_SET = null;
    private static final int[] SELECTED_STATE_SET = null;
    static final String TRANSPARENT_DEFAULT_COLOR_WARNING = "Use a non-transparent color for the default color as it will be used to finish ripple animations.";
    public static final boolean USE_FRAMEWORK_RIPPLE = false;

    private static class RippleUtilsLollipop {
        private RippleUtilsLollipop() {
        }

        static /* synthetic */ Drawable access$000(Context context, int i) {
        }

        private static Drawable createOvalRipple(Context context, int i) {
        }
    }

    private RippleUtils() {
    }

    public static ColorStateList convertToRippleDrawableColor(ColorStateList colorStateList) {
    }

    public static Drawable createOvalRippleLollipop(Context context, int i) {
    }

    @TargetApi(21)
    private static int doubleAlpha(int i) {
    }

    private static int getColorForState(ColorStateList colorStateList, int[] iArr) {
    }

    public static ColorStateList sanitizeRippleDrawableColor(ColorStateList colorStateList) {
    }

    public static boolean shouldDrawRippleCompat(int[] iArr) {
    }
}
