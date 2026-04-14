package com.google.android.exoplayer2.text.ttml;

import com.google.common.collect.ImmutableSet;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class TextEmphasis {
    private static final ImmutableSet<String> MARK_FILL_VALUES = null;
    public static final int MARK_SHAPE_AUTO = -1;
    private static final ImmutableSet<String> MARK_SHAPE_VALUES = null;
    public static final int POSITION_OUTSIDE = -2;
    private static final ImmutableSet<String> POSITION_VALUES = null;
    private static final ImmutableSet<String> SINGLE_STYLE_VALUES = null;
    private static final Pattern WHITESPACE_PATTERN = null;
    public final int markFill;
    public final int markShape;
    public final int position;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Position {
    }

    private TextEmphasis(int i, int i2, int i3) {
    }

    public static TextEmphasis parse(String str) {
    }

    private static TextEmphasis parseWords(ImmutableSet<String> immutableSet) {
    }
}
