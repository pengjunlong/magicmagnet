package com.google.firebase.crashlytics.internal.network;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class HttpGetRequest {
    private static final int DEFAULT_TIMEOUT_MS = 10000;
    private static final String METHOD_GET = "GET";
    private static final int READ_BUFFER_SIZE = 8192;
    private final Map<String, String> headers;
    private final Map<String, String> queryParams;
    private final String url;

    public HttpGetRequest(String str, Map<String, String> map) {
    }

    private String createParamsString(Map<String, String> map) {
    }

    private String createUrlWithParams(String str, Map<String, String> map) {
    }

    private String readStream(InputStream inputStream) throws IOException {
    }

    public HttpResponse execute() throws IOException {
    }

    public HttpGetRequest header(String str, String str2) {
    }

    public HttpGetRequest header(Map.Entry<String, String> entry) {
    }
}
