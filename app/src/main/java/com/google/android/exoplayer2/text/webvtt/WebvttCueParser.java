package com.google.android.exoplayer2.text.webvtt;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class WebvttCueParser {
    private static final char CHAR_AMPERSAND = '&';
    private static final char CHAR_GREATER_THAN = '>';
    private static final char CHAR_LESS_THAN = '<';
    private static final char CHAR_SEMI_COLON = ';';
    private static final char CHAR_SLASH = '/';
    private static final char CHAR_SPACE = ' ';
    public static final Pattern CUE_HEADER_PATTERN = null;
    private static final Pattern CUE_SETTING_PATTERN = null;
    private static final Map<String, Integer> DEFAULT_BACKGROUND_COLORS = null;
    static final float DEFAULT_POSITION = 0.5f;
    private static final Map<String, Integer> DEFAULT_TEXT_COLORS = null;
    private static final String ENTITY_AMPERSAND = "amp";
    private static final String ENTITY_GREATER_THAN = "gt";
    private static final String ENTITY_LESS_THAN = "lt";
    private static final String ENTITY_NON_BREAK_SPACE = "nbsp";
    private static final int STYLE_BOLD = 1;
    private static final int STYLE_ITALIC = 2;
    private static final String TAG = "WebvttCueParser";
    private static final String TAG_BOLD = "b";
    private static final String TAG_CLASS = "c";
    private static final String TAG_ITALIC = "i";
    private static final String TAG_LANG = "lang";
    private static final String TAG_RUBY = "ruby";
    private static final String TAG_RUBY_TEXT = "rt";
    private static final String TAG_UNDERLINE = "u";
    private static final String TAG_VOICE = "v";
    private static final int TEXT_ALIGNMENT_CENTER = 2;
    private static final int TEXT_ALIGNMENT_END = 3;
    private static final int TEXT_ALIGNMENT_LEFT = 4;
    private static final int TEXT_ALIGNMENT_RIGHT = 5;
    private static final int TEXT_ALIGNMENT_START = 1;

    private static class Element {
        private static final Comparator<Element> BY_START_POSITION_ASC = null;
        private final int endPosition;
        private final StartTag startTag;

        /* synthetic */ Element(StartTag startTag, int i, C02031 c02031) {
        }

        static /* synthetic */ Comparator access$100() {
        }

        static /* synthetic */ StartTag access$200(Element element) {
        }

        static /* synthetic */ int access$300(Element element) {
        }

        public static /* synthetic */ int dbpqdHhmDSIHIJiwc1ll1l1(Element element, Element element2) {
        }

        private static /* synthetic */ int lambda$static$0(Element element, Element element2) {
        }

        private Element(StartTag startTag, int i) {
        }
    }

    private static final class StartTag {
        public final Set<String> classes;
        public final String name;
        public final int position;
        public final String voice;

        private StartTag(String str, int i, String str2, Set<String> set) {
        }

        public static StartTag buildStartTag(String str, int i) {
        }

        public static StartTag buildWholeCueVirtualTag() {
        }
    }

    private static final class StyleMatch implements Comparable<StyleMatch> {
        public final int score;
        public final WebvttCssStyle style;

        public StyleMatch(int i, WebvttCssStyle webvttCssStyle) {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(StyleMatch styleMatch) {
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(StyleMatch styleMatch) {
        }
    }

    private static final class WebvttCueInfoBuilder {
        public long endTimeUs;
        public float line;
        public int lineAnchor;
        public int lineType;
        public float position;
        public int positionAnchor;
        public float size;
        public long startTimeUs;
        public CharSequence text;
        public int textAlignment;
        public int verticalType;

        private static float computeLine(float f, int i) {
        }

        private static Layout.Alignment convertTextAlignment(int i) {
        }

        private static float deriveMaxSize(int i, float f) {
        }

        private static float derivePosition(int i) {
        }

        private static int derivePositionAnchor(int i) {
        }

        public WebvttCueInfo build() {
        }

        public Cue.Builder toCueBuilder() {
        }
    }

    private static void applyDefaultColors(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i, int i2) {
    }

    private static void applyEntity(String str, SpannableStringBuilder spannableStringBuilder) {
    }

    private static void applyRubySpans(SpannableStringBuilder spannableStringBuilder, String str, StartTag startTag, List<Element> list, List<WebvttCssStyle> list2) {
    }

    private static void applySpansForTag(String str, StartTag startTag, List<Element> list, SpannableStringBuilder spannableStringBuilder, List<WebvttCssStyle> list2) {
    }

    private static void applyStyleToText(SpannableStringBuilder spannableStringBuilder, WebvttCssStyle webvttCssStyle, int i, int i2) {
    }

    private static int findEndOfTag(String str, int i) {
    }

    private static int firstKnownRubyPosition(int i, int i2, int i3) {
    }

    private static List<StyleMatch> getApplicableStyles(List<WebvttCssStyle> list, String str, StartTag startTag) {
    }

    private static int getRubyPosition(List<WebvttCssStyle> list, String str, StartTag startTag) {
    }

    private static String getTagName(String str) {
    }

    private static boolean isSupportedTag(String str) {
    }

    static Cue newCueForText(CharSequence charSequence) {
    }

    public static WebvttCueInfo parseCue(ParsableByteArray parsableByteArray, List<WebvttCssStyle> list) {
    }

    static Cue.Builder parseCueSettingsList(String str) {
    }

    static SpannedString parseCueText(String str, String str2, List<WebvttCssStyle> list) {
    }

    private static int parseLineAnchor(String str) {
    }

    private static void parseLineAttribute(String str, WebvttCueInfoBuilder webvttCueInfoBuilder) {
    }

    private static int parsePositionAnchor(String str) {
    }

    private static void parsePositionAttribute(String str, WebvttCueInfoBuilder webvttCueInfoBuilder) {
    }

    private static int parseTextAlignment(String str) {
    }

    private static int parseVerticalAttribute(String str) {
    }

    private static void parseCueSettingsList(String str, WebvttCueInfoBuilder webvttCueInfoBuilder) {
    }

    private static WebvttCueInfo parseCue(String str, Matcher matcher, ParsableByteArray parsableByteArray, List<WebvttCssStyle> list) {
    }
}
