package com.google.zxing.client.android;

import android.content.Intent;
import android.net.Uri;
import com.google.zxing.DecodeHintType;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class DecodeHintManager {
    private static final Pattern COMMA = null;
    private static final String TAG = "DecodeHintManager";

    private DecodeHintManager() {
    }

    static Map<DecodeHintType, ?> parseDecodeHints(Uri uri) {
    }

    private static Map<String, String> splitQuery(String str) {
    }

    public static Map<DecodeHintType, Object> parseDecodeHints(Intent intent) {
    }
}
