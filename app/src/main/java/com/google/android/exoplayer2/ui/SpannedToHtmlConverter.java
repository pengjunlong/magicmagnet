package com.google.android.exoplayer2.ui;

import android.text.Spanned;
import android.util.SparseArray;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class SpannedToHtmlConverter {
    private static final Pattern NEWLINE_PATTERN = null;

    public static class HtmlAndCss {
        public final Map<String, String> cssRuleSets;
        public final String html;

        /* synthetic */ HtmlAndCss(String str, Map map, C02101 c02101) {
        }

        private HtmlAndCss(String str, Map<String, String> map) {
        }
    }

    private static final class SpanInfo {
        private static final Comparator<SpanInfo> FOR_CLOSING_TAGS = null;
        private static final Comparator<SpanInfo> FOR_OPENING_TAGS = null;
        public final String closingTag;
        public final int end;
        public final String openingTag;
        public final int start;

        /* synthetic */ SpanInfo(int i, int i2, String str, String str2, C02101 c02101) {
        }

        static /* synthetic */ Comparator access$200() {
        }

        static /* synthetic */ Comparator access$400() {
        }

        public static /* synthetic */ int dbpqdHhmDSIHIJiwc1ll1l1(SpanInfo spanInfo, SpanInfo spanInfo2) {
        }

        public static /* synthetic */ int dpbdbdpbLwkLpObyKsq1lll1(SpanInfo spanInfo, SpanInfo spanInfo2) {
        }

        private static /* synthetic */ int lambda$static$0(SpanInfo spanInfo, SpanInfo spanInfo2) {
        }

        private static /* synthetic */ int lambda$static$1(SpanInfo spanInfo, SpanInfo spanInfo2) {
        }

        private SpanInfo(int i, int i2, String str, String str2) {
        }
    }

    private static final class Transition {
        private final List<SpanInfo> spansAdded;
        private final List<SpanInfo> spansRemoved;

        static /* synthetic */ List access$100(Transition transition) {
        }

        static /* synthetic */ List access$300(Transition transition) {
        }
    }

    private SpannedToHtmlConverter() {
    }

    public static HtmlAndCss convert(CharSequence charSequence, float f) {
    }

    private static String escapeHtml(CharSequence charSequence) {
    }

    private static SparseArray<Transition> findSpanTransitions(Spanned spanned, float f) {
    }

    private static String getClosingTag(Object obj) {
    }

    private static String getOpeningTag(Object obj, float f) {
    }

    private static Transition getOrCreate(SparseArray<Transition> sparseArray, int i) {
    }

    private static String getTextEmphasisPosition(int i) {
    }

    private static String getTextEmphasisStyle(int i, int i2) {
    }
}
