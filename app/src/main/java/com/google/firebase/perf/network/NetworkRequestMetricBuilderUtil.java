package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import java.util.regex.Pattern;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class NetworkRequestMetricBuilderUtil {
    private static final Pattern FLG_USER_AGENT_PATTERN = null;

    private NetworkRequestMetricBuilderUtil() {
    }

    public static Long getApacheHttpMessageContentLength(HttpMessage httpMessage) {
    }

    public static String getApacheHttpResponseContentType(HttpResponse httpResponse) {
    }

    public static boolean isAllowedUserAgent(String str) {
    }

    public static void logError(NetworkRequestMetricBuilder networkRequestMetricBuilder) {
    }
}
