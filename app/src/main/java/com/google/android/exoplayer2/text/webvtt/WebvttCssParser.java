package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class WebvttCssParser {
    private static final Pattern FONT_SIZE_PATTERN = null;
    private static final String PROPERTY_BGCOLOR = "background-color";
    private static final String PROPERTY_COLOR = "color";
    private static final String PROPERTY_FONT_FAMILY = "font-family";
    private static final String PROPERTY_FONT_SIZE = "font-size";
    private static final String PROPERTY_FONT_STYLE = "font-style";
    private static final String PROPERTY_FONT_WEIGHT = "font-weight";
    private static final String PROPERTY_RUBY_POSITION = "ruby-position";
    private static final String PROPERTY_TEXT_COMBINE_UPRIGHT = "text-combine-upright";
    private static final String PROPERTY_TEXT_DECORATION = "text-decoration";
    private static final String RULE_END = "}";
    private static final String RULE_START = "{";
    private static final String TAG = "WebvttCssParser";
    private static final String VALUE_ALL = "all";
    private static final String VALUE_BOLD = "bold";
    private static final String VALUE_DIGITS = "digits";
    private static final String VALUE_ITALIC = "italic";
    private static final String VALUE_OVER = "over";
    private static final String VALUE_UNDER = "under";
    private static final String VALUE_UNDERLINE = "underline";
    private static final Pattern VOICE_NAME_PATTERN = null;
    private final StringBuilder stringBuilder;
    private final ParsableByteArray styleInput;

    private void applySelectorToStyle(WebvttCssStyle webvttCssStyle, String str) {
    }

    private static boolean maybeSkipComment(ParsableByteArray parsableByteArray) {
    }

    private static boolean maybeSkipWhitespace(ParsableByteArray parsableByteArray) {
    }

    private static void parseFontSize(String str, WebvttCssStyle webvttCssStyle) {
    }

    private static String parseIdentifier(ParsableByteArray parsableByteArray, StringBuilder sb) {
    }

    static String parseNextToken(ParsableByteArray parsableByteArray, StringBuilder sb) {
    }

    private static String parsePropertyValue(ParsableByteArray parsableByteArray, StringBuilder sb) {
    }

    private static String parseSelector(ParsableByteArray parsableByteArray, StringBuilder sb) {
    }

    private static void parseStyleDeclaration(ParsableByteArray parsableByteArray, WebvttCssStyle webvttCssStyle, StringBuilder sb) {
    }

    private static char peekCharAtPosition(ParsableByteArray parsableByteArray, int i) {
    }

    private static String readCueTarget(ParsableByteArray parsableByteArray) {
    }

    static void skipStyleBlock(ParsableByteArray parsableByteArray) {
    }

    static void skipWhitespaceAndComments(ParsableByteArray parsableByteArray) {
    }

    public List<WebvttCssStyle> parseBlock(ParsableByteArray parsableByteArray) {
    }
}
