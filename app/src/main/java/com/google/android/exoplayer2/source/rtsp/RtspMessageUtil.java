package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class RtspMessageUtil {
    private static final Pattern CONTENT_LENGTH_HEADER_PATTERN = null;
    private static final String CRLF = null;
    public static final long DEFAULT_RTSP_TIMEOUT_MS = 60000;
    private static final String LF = null;
    private static final Pattern REQUEST_LINE_PATTERN = null;
    private static final String RTSP_VERSION = "RTSP/1.0";
    private static final Pattern SESSION_HEADER_PATTERN = null;
    private static final Pattern STATUS_LINE_PATTERN = null;
    private static final Pattern WWW_AUTHENTICATION_HEADER_BASIC_PATTERN = null;
    private static final Pattern WWW_AUTHENTICATION_HEADER_DIGEST_PATTERN = null;

    public static final class RtspAuthUserInfo {
        public final String password;
        public final String username;

        public RtspAuthUserInfo(String str, String str2) {
        }
    }

    public static final class RtspSessionHeader {
        public final String sessionId;
        public final long timeoutMs;

        public RtspSessionHeader(String str, long j) {
        }
    }

    private RtspMessageUtil() {
    }

    public static void checkManifestExpression(boolean z, String str) throws ParserException {
    }

    public static byte[] convertMessageToByteArray(List<String> list) {
    }

    private static String getRtspStatusReasonPhrase(int i) {
    }

    public static byte[] getStringBytes(String str) {
    }

    public static boolean isRtspResponse(List<String> list) {
    }

    public static boolean isRtspStartLine(String str) {
    }

    public static long parseContentLengthHeader(String str) throws ParserException {
    }

    public static int parseInt(String str) throws ParserException {
    }

    private static int parseMethodString(String str) {
    }

    public static ImmutableList<Integer> parsePublicHeader(String str) {
    }

    public static RtspRequest parseRequest(List<String> list) {
    }

    public static RtspResponse parseResponse(List<String> list) {
    }

    public static RtspSessionHeader parseSessionHeader(String str) throws ParserException {
    }

    public static RtspAuthUserInfo parseUserInfo(Uri uri) {
    }

    public static RtspAuthenticationInfo parseWwwAuthenticateHeader(String str) throws ParserException {
    }

    public static Uri removeUserInfo(Uri uri) {
    }

    public static ImmutableList<String> serializeRequest(RtspRequest rtspRequest) {
    }

    public static ImmutableList<String> serializeResponse(RtspResponse rtspResponse) {
    }

    public static String[] splitRtspMessageBody(String str) {
    }

    public static String toMethodString(int i) {
    }
}
