package com.google.zxing.client.result;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class ParsedResult {
    private final ParsedResultType type;

    protected ParsedResult(ParsedResultType parsedResultType) {
    }

    public static void maybeAppend(String str, StringBuilder sb) {
    }

    public abstract String getDisplayResult();

    public final ParsedResultType getType() {
    }

    public final String toString() {
    }

    public static void maybeAppend(String[] strArr, StringBuilder sb) {
    }
}
