package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class WebvttParserUtil {
    private static final Pattern COMMENT = null;
    private static final String WEBVTT_HEADER = "WEBVTT";

    private WebvttParserUtil() {
    }

    public static Matcher findNextCueHeader(ParsableByteArray parsableByteArray) {
    }

    public static boolean isWebvttHeaderLine(ParsableByteArray parsableByteArray) {
    }

    public static float parsePercentage(String str) throws NumberFormatException {
    }

    public static long parseTimestampUs(String str) throws NumberFormatException {
    }

    public static void validateWebvttHeaderLine(ParsableByteArray parsableByteArray) throws ParserException {
    }
}
