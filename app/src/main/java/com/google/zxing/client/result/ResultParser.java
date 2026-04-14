package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class ResultParser {
    private static final Pattern AMPERSAND = null;
    private static final String BYTE_ORDER_MARK = "\ufeff";
    private static final Pattern DIGITS = null;
    private static final Pattern EQUALS = null;
    private static final ResultParser[] PARSERS = null;

    private static void appendKeyValue(CharSequence charSequence, Map<String, String> map) {
    }

    private static int countPrecedingBackslashes(CharSequence charSequence, int i) {
    }

    protected static String getMassagedText(Result result) {
    }

    protected static boolean isStringOfDigits(CharSequence charSequence, int i) {
    }

    protected static boolean isSubstringOfDigits(CharSequence charSequence, int i, int i2) {
    }

    static String[] matchPrefixedField(String str, String str2, char c, boolean z) {
    }

    static String matchSinglePrefixedField(String str, String str2, char c, boolean z) {
    }

    protected static void maybeAppend(String str, StringBuilder sb) {
    }

    protected static String[] maybeWrap(String str) {
    }

    protected static int parseHexDigit(char c) {
    }

    static Map<String, String> parseNameValuePairs(String str) {
    }

    public static ParsedResult parseResult(Result result) {
    }

    protected static String unescapeBackslash(String str) {
    }

    static String urlDecode(String str) {
    }

    public abstract ParsedResult parse(Result result);

    protected static void maybeAppend(String[] strArr, StringBuilder sb) {
    }
}
