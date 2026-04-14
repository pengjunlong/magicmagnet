package com.google.android.exoplayer2;

import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class ParserException extends IOException {
    public final boolean contentIsMalformed;
    public final int dataType;

    protected ParserException(String str, Throwable th, boolean z, int i) {
    }

    public static ParserException createForMalformedContainer(String str, Throwable th) {
    }

    public static ParserException createForMalformedDataOfUnknownType(String str, Throwable th) {
    }

    public static ParserException createForMalformedManifest(String str, Throwable th) {
    }

    public static ParserException createForManifestWithUnsupportedFeature(String str, Throwable th) {
    }

    public static ParserException createForUnsupportedContainerFeature(String str) {
    }
}
