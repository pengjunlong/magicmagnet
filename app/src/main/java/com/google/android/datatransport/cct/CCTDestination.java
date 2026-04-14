package com.google.android.datatransport.cct;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedDestination;
import java.util.Set;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class CCTDestination implements EncodedDestination {
    private static final String DEFAULT_API_KEY = null;
    static final String DEFAULT_END_POINT = null;
    static final String DESTINATION_NAME = "cct";
    private static final String EXTRAS_DELIMITER = "\\";
    private static final String EXTRAS_VERSION_MARKER = "1$";
    public static final CCTDestination INSTANCE = null;
    static final String LEGACY_END_POINT = null;
    public static final CCTDestination LEGACY_INSTANCE = null;
    private static final Set<Encoding> SUPPORTED_ENCODINGS = null;
    private final String apiKey;
    private final String endPoint;

    public CCTDestination(String str, String str2) {
    }

    static String decodeExtras(byte[] bArr) {
    }

    static byte[] encodeString(String str) {
    }

    public static CCTDestination fromByteArray(byte[] bArr) {
    }

    public byte[] asByteArray() {
    }

    public String getAPIKey() {
    }

    public String getEndPoint() {
    }

    @Override // com.google.android.datatransport.runtime.Destination
    public byte[] getExtras() {
    }

    @Override // com.google.android.datatransport.runtime.Destination
    public String getName() {
    }

    @Override // com.google.android.datatransport.runtime.EncodedDestination
    public Set<Encoding> getSupportedEncodings() {
    }
}
