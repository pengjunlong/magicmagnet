package okhttp3.internal;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;
import okhttp3.internal.io.FileSystem;
import p000.cl1;
import p000.dppbpdpFXDhtOnccosy1lll1l;
import p000.ep0;
import p000.mv1;
import p000.qbbbpbbbiFxIAmEwllll11;
import p000.qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll;
import p000.qh;
import p000.sh;
import p000.t51;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY = null;
    public static final Headers EMPTY_HEADERS = null;
    public static final RequestBody EMPTY_REQUEST = null;
    public static final ResponseBody EMPTY_RESPONSE = null;
    private static final ep0 UNICODE_BOMS = null;
    public static final TimeZone UTC = null;
    private static final t51 VERIFY_AS_IP_ADDRESS = null;
    public static final boolean assertionsEnabled = false;
    public static final String okHttpName = null;
    public static final String userAgent = "okhttp/4.10.0";

    public static final <E> void addIfAbsent(List<E> list, E e) {
    }

    public static final int and(byte b, int i) {
    }

    public static final int and(short s, int i) {
    }

    public static final long and(int i, long j) {
    }

    public static final EventListener.Factory asFactory(EventListener eventListener) {
    }

    /* renamed from: asFactory$lambda-8, reason: not valid java name */
    private static final EventListener m1020asFactory$lambda8(EventListener eventListener, Call call) {
    }

    public static final void assertThreadDoesntHoldLock(Object obj) {
    }

    public static final void assertThreadHoldsLock(Object obj) {
    }

    public static final boolean canParseAsIpAddress(String str) {
    }

    public static final boolean canReuseConnectionFor(HttpUrl httpUrl, HttpUrl httpUrl2) {
    }

    public static final int checkDuration(String str, long j, TimeUnit timeUnit) {
    }

    public static final void checkOffsetAndCount(long j, long j2, long j3) {
    }

    public static final void closeQuietly(Closeable closeable) {
    }

    public static final String[] concat(String[] strArr, String str) {
    }

    public static /* synthetic */ Thread dbpqdHhmDSIHIJiwc1ll1l1(String str, boolean z, Runnable runnable) {
    }

    public static final int delimiterOffset(String str, String str2, int i, int i2) {
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i, int i2, int i3, Object obj) {
    }

    public static final boolean discard(cl1 cl1Var, int i, TimeUnit timeUnit) {
    }

    public static /* synthetic */ EventListener dpbdbdpbLwkLpObyKsq1lll1(EventListener eventListener, Call call) {
    }

    public static final <T> List<T> filterList(Iterable<? extends T> iterable, sh<? super T, Boolean> shVar) {
    }

    public static final String format(String str, Object... objArr) {
    }

    public static final boolean hasIntersection(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
    }

    public static final long headersContentLength(Response response) {
    }

    public static final void ignoreIoExceptions(qh<mv1> qhVar) {
    }

    @SafeVarargs
    public static final <T> List<T> immutableListOf(T... tArr) {
    }

    public static final int indexOf(String[] strArr, String str, Comparator<String> comparator) {
    }

    public static final int indexOfControlOrNonAscii(String str) {
    }

    public static final int indexOfFirstNonAsciiWhitespace(String str, int i, int i2) {
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
    }

    public static final int indexOfLastNonAsciiWhitespace(String str, int i, int i2) {
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
    }

    public static final int indexOfNonWhitespace(String str, int i) {
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i, int i2, Object obj) {
    }

    public static final String[] intersect(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
    }

    public static final boolean isCivilized(FileSystem fileSystem, File file) {
    }

    public static final boolean isHealthy(Socket socket, qbbbpbbbiFxIAmEwllll11 qbbbpbbbifxiamewllll11) {
    }

    public static final boolean isSensitiveHeader(String str) {
    }

    public static final void notify(Object obj) {
    }

    public static final void notifyAll(Object obj) {
    }

    public static final int parseHexDigit(char c) {
    }

    public static final String peerName(Socket socket) {
    }

    public static final Charset readBomAsCharset(qbbbpbbbiFxIAmEwllll11 qbbbpbbbifxiamewllll11, Charset charset) throws IOException {
    }

    public static final <T> T readFieldOrNull(Object obj, Class<T> cls, String str) {
    }

    public static final int readMedium(qbbbpbbbiFxIAmEwllll11 qbbbpbbbifxiamewllll11) throws IOException {
    }

    public static final boolean skipAll(cl1 cl1Var, int i, TimeUnit timeUnit) throws IOException {
    }

    public static final ThreadFactory threadFactory(String str, boolean z) {
    }

    /* renamed from: threadFactory$lambda-1, reason: not valid java name */
    private static final Thread m1021threadFactory$lambda1(String str, boolean z, Runnable runnable) {
    }

    public static final void threadName(String str, qh<mv1> qhVar) {
    }

    public static final List<Header> toHeaderList(Headers headers) {
    }

    public static final Headers toHeaders(List<Header> list) {
    }

    public static final String toHexString(long j) {
    }

    public static final String toHostHeader(HttpUrl httpUrl, boolean z) {
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z, int i, Object obj) {
    }

    public static final <T> List<T> toImmutableList(List<? extends T> list) {
    }

    public static final <K, V> Map<K, V> toImmutableMap(Map<K, ? extends V> map) {
    }

    public static final long toLongOrDefault(String str, long j) {
    }

    public static final int toNonNegativeInt(String str, int i) {
    }

    public static final String trimSubstring(String str, int i, int i2) {
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i, int i2, int i3, Object obj) {
    }

    public static final void wait(Object obj) {
    }

    public static final Throwable withSuppressed(Exception exc, List<? extends Exception> list) {
    }

    public static final void writeMedium(qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll qbdbqdqbqtxlkiajciumulbqabnb11l111ll, int i) throws IOException {
    }

    public static final int delimiterOffset(String str, char c, int i, int i2) {
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c, int i, int i2, int i3, Object obj) {
    }

    public static final String toHexString(int i) {
    }

    public static final void closeQuietly(Socket socket) {
    }

    public static final void closeQuietly(ServerSocket serverSocket) {
    }

    public static final int skipAll(dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l, byte b) {
    }
}
