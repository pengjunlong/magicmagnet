package org.adblockplus.libadblockplus.android;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.adblockplus.libadblockplus.Filter;
import org.adblockplus.libadblockplus.FilterEngine;
import org.adblockplus.libadblockplus.HeaderEntry;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class Utils {
    private static final int BUFFER_SIZE = 8192;
    private static final int MAX_ARRAY_LEN = 2147483639;
    private static final int TO_BYTE_ARRAY_DEQUE_SIZE = 20;
    private static String U2028;
    private static String U2029;
    public static final Set<String> commaNotMergableHeaders = null;

    private Utils() {
    }

    public static byte[] byteBufferToByteArray(ByteBuffer byteBuffer) {
    }

    private static byte[] combineBuffers(Deque<byte[]> deque, int i) {
    }

    public static Map<String, String> convertHeaderEntriesToMap(List<HeaderEntry> list) {
    }

    public static List<HeaderEntry> convertMapToHeadersList(Map<String, String> map) {
    }

    public static Filter createDomainAllowlistingFilter(FilterEngine filterEngine, String str) {
    }

    public static String emulationSelectorListToJsonArray(List<FilterEngine.EmulationSelector> list) {
    }

    public static String escapeJavaScriptString(String str) {
    }

    public static String extractPathWithQuery(String str) throws MalformedURLException {
    }

    public static String getAbsoluteUrl(String str, String str2) throws MalformedURLException {
    }

    public static String getDomain(String str) {
    }

    public static String getOrigin(String str) throws MalformedURLException {
    }

    private static String getStringBeforeChar(String str, char c) {
    }

    public static String getTag(Class<?> cls) {
    }

    public static String getUrlWithoutFragment(String str) {
    }

    public static String getUrlWithoutParams(String str) {
    }

    public static boolean isAbsoluteUrl(String str) throws URISyntaxException {
    }

    public static boolean isFirstPartyCookie(String str, String str2, String str3) {
    }

    public static boolean isNullOrEmpty(Collection<?> collection) {
    }

    public static boolean isSubdomainOrDomain(String str, String str2) {
    }

    public static String readAssetAsString(Context context, String str, String str2) throws IOException {
    }

    public static ByteBuffer readFromInputStream(InputStream inputStream) throws IOException {
    }

    public static String stringListToJsonArray(List<String> list) {
    }

    public static ByteBuffer stringToByteBuffer(String str, Charset charset) {
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
    }

    private static byte[] toByteArrayInternal(InputStream inputStream, Deque<byte[]> deque, int i) throws IOException {
    }
}
