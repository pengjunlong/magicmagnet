package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.regex.Pattern;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class VINResultParser extends ResultParser {
    private static final Pattern AZ09 = null;
    private static final Pattern IOQ = null;

    private static char checkChar(int i) {
    }

    private static boolean checkChecksum(CharSequence charSequence) {
    }

    private static String countryCode(CharSequence charSequence) {
    }

    private static int modelYear(char c) {
    }

    private static int vinCharValue(char c) {
    }

    private static int vinPositionWeight(int i) {
    }

    @Override // com.google.zxing.client.result.ResultParser
    public /* bridge */ /* synthetic */ ParsedResult parse(Result result) {
    }

    @Override // com.google.zxing.client.result.ResultParser
    public VINParsedResult parse(Result result) {
    }
}
