package com.google.zxing.client.result;

import java.util.regex.Pattern;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class URIParsedResult extends ParsedResult {
    private static final Pattern USER_IN_HOST = null;
    private final String title;
    private final String uri;

    public URIParsedResult(String str, String str2) {
    }

    private static boolean isColonFollowedByPortNumber(String str, int i) {
    }

    private static String massageURI(String str) {
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
    }

    public String getTitle() {
    }

    public String getURI() {
    }

    public boolean isPossiblyMaliciousURI() {
    }
}
