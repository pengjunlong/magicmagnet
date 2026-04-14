package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.Constructor;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class StaticLayoutBuilderCompat {
    static final int DEFAULT_HYPHENATION_FREQUENCY = 0;
    static final float DEFAULT_LINE_SPACING_ADD = 0.0f;
    static final float DEFAULT_LINE_SPACING_MULTIPLIER = 1.0f;
    private static final String TEXT_DIRS_CLASS = "android.text.TextDirectionHeuristics";
    private static final String TEXT_DIR_CLASS = "android.text.TextDirectionHeuristic";
    private static final String TEXT_DIR_CLASS_LTR = "LTR";
    private static final String TEXT_DIR_CLASS_RTL = "RTL";
    private static Constructor<StaticLayout> constructor;
    private static boolean initialized;
    private static Object textDirection;
    private Layout.Alignment alignment;
    private TextUtils.TruncateAt ellipsize;
    private int end;
    private int hyphenationFrequency;
    private boolean includePad;
    private boolean isRtl;
    private float lineSpacingAdd;
    private float lineSpacingMultiplier;
    private int maxLines;
    private final TextPaint paint;
    private CharSequence source;
    private int start;
    private StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer;
    private final int width;

    static class StaticLayoutBuilderCompatException extends Exception {
        StaticLayoutBuilderCompatException(Throwable th) {
        }
    }

    private StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i) {
    }

    private void createConstructorWithReflection() throws StaticLayoutBuilderCompatException {
    }

    public static StaticLayoutBuilderCompat obtain(CharSequence charSequence, TextPaint textPaint, int i) {
    }

    public StaticLayout build() throws StaticLayoutBuilderCompatException {
    }

    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setAlignment(Layout.Alignment alignment) {
    }

    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setEllipsize(TextUtils.TruncateAt truncateAt) {
    }

    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setEnd(int i) {
    }

    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setHyphenationFrequency(int i) {
    }

    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setIncludePad(boolean z) {
    }

    public StaticLayoutBuilderCompat setIsRtl(boolean z) {
    }

    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setLineSpacing(float f, float f2) {
    }

    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setMaxLines(int i) {
    }

    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setStart(int i) {
    }

    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setStaticLayoutBuilderConfigurer(StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
    }
}
