package com.google.android.exoplayer2.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.util.SparseLongArray;
import android.view.Display;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.Player;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;
import java.util.zip.Inflater;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class Util {
    private static final int[] CRC32_BYTES_MSBF = null;
    private static final int[] CRC8_BYTES_MSBF = null;
    public static final String DEVICE = null;
    public static final String DEVICE_DEBUG_INFO = null;
    public static final byte[] EMPTY_BYTE_ARRAY = null;
    private static final Pattern ESCAPED_CHARACTER_PATTERN = null;
    private static final String ISM_DASH_FORMAT_EXTENSION = "format=mpd-time-csf";
    private static final String ISM_HLS_FORMAT_EXTENSION = "format=m3u8-aapl";
    private static final Pattern ISM_PATH_PATTERN = null;
    public static final String MANUFACTURER = null;
    public static final String MODEL = null;
    public static final int SDK_INT = 0;
    private static final String TAG = "Util";
    private static final Pattern XS_DATE_TIME_PATTERN = null;
    private static final Pattern XS_DURATION_PATTERN = null;
    private static final String[] additionalIsoLanguageReplacements = null;
    private static final String[] isoLegacyTagReplacements = null;
    private static HashMap<String, String> languageTagReplacementMap;

    private static final class Api21 {
        private Api21() {
        }

        public static Drawable getDrawable(Context context, Resources resources, int i) {
        }
    }

    private Util() {
    }

    public static long addWithOverflowDefault(long j, long j2, long j3) {
    }

    public static boolean areEqual(Object obj, Object obj2) {
    }

    public static int binarySearchCeil(int[] iArr, int i, boolean z, boolean z2) {
    }

    public static int binarySearchFloor(int[] iArr, int i, boolean z, boolean z2) {
    }

    @EnsuresNonNull({"#1"})
    public static <T> T castNonNull(T t) {
    }

    @EnsuresNonNull({"#1"})
    public static <T> T[] castNonNullTypeArray(T[] tArr) {
    }

    public static int ceilDivide(int i, int i2) {
    }

    public static boolean checkCleartextTrafficPermitted(MediaItem... mediaItemArr) {
    }

    public static void closeQuietly(Closeable closeable) {
    }

    public static int compareLong(long j, long j2) {
    }

    public static int constrainValue(int i, int i2, int i3) {
    }

    public static boolean contains(Object[] objArr, Object obj) {
    }

    public static int crc32(byte[] bArr, int i, int i2, int i3) {
    }

    public static int crc8(byte[] bArr, int i, int i2, int i3) {
    }

    public static Handler createHandler(Looper looper, Handler.Callback callback) {
    }

    public static Handler createHandlerForCurrentLooper() {
    }

    public static Handler createHandlerForCurrentOrMainLooper() {
    }

    private static HashMap<String, String> createIsoLanguageReplacementMap() {
    }

    public static File createTempDirectory(Context context, String str) throws IOException {
    }

    public static File createTempFile(Context context, String str) throws IOException {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(ListenableFuture listenableFuture, SettableFuture settableFuture, AsyncFunction asyncFunction) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(SettableFuture settableFuture, Runnable runnable, Object obj) {
    }

    public static /* synthetic */ Thread dpbdpqRKAscW1lll1l(String str, Runnable runnable) {
    }

    public static /* synthetic */ void dqqppqiKzJi1l1lll1l(SettableFuture settableFuture, ListenableFuture listenableFuture) {
    }

    public static String escapeFileName(String str) {
    }

    public static Uri fixSmoothStreamingIsmManifestUri(Uri uri) {
    }

    public static String formatInvariant(String str, Object... objArr) {
    }

    public static String fromUtf8Bytes(byte[] bArr) {
    }

    public static int generateAudioSessionIdV21(Context context) {
    }

    public static String getAdaptiveMimeTypeForContentType(int i) {
    }

    public static int getAudioContentTypeForStreamType(int i) {
    }

    @SuppressLint({"InlinedApi"})
    public static int getAudioTrackChannelConfig(int i) {
    }

    public static int getAudioUsageForStreamType(int i) {
    }

    public static Player.Commands getAvailableCommands(Player player, Player.Commands commands) {
    }

    public static int getBigEndianInt(ByteBuffer byteBuffer, int i) {
    }

    public static byte[] getBytesFromHexString(String str) {
    }

    public static int getCodecCountOfType(String str, int i) {
    }

    public static String getCodecsOfType(String str, int i) {
    }

    public static String getCommaDelimitedSimpleClassNames(Object[] objArr) {
    }

    public static String getCountryCode(Context context) {
    }

    public static Point getCurrentDisplayModeSize(Context context) {
    }

    public static Looper getCurrentOrMainLooper() {
    }

    public static Uri getDataUriForString(String str, String str2) {
    }

    public static Locale getDefaultDisplayLocale() {
    }

    private static void getDisplaySizeV16(Display display, Point point) {
    }

    private static void getDisplaySizeV17(Display display, Point point) {
    }

    private static void getDisplaySizeV23(Display display, Point point) {
    }

    public static Drawable getDrawable(Context context, Resources resources, int i) {
    }

    public static UUID getDrmUuid(String str) {
    }

    public static int getErrorCodeForMediaDrmErrorCode(int i) {
    }

    public static int getErrorCodeFromPlatformDiagnosticsInfo(String str) {
    }

    public static String getFormatSupportString(int i) {
    }

    public static int getIntegerCodeForString(String str) {
    }

    public static String getLocaleLanguageTag(Locale locale) {
    }

    private static String getLocaleLanguageTagV21(Locale locale) {
    }

    public static long getMediaDurationForPlayoutDuration(long j, float f) {
    }

    public static long getNowUnixTimeMs(long j) {
    }

    public static int getPcmEncoding(int i) {
    }

    public static Format getPcmFormat(int i, int i2, int i3) {
    }

    public static int getPcmFrameSize(int i, int i2) {
    }

    public static long getPlayoutDurationForMediaDuration(long j, float f) {
    }

    public static int getStreamTypeForAudioUsage(int i) {
    }

    public static String getStringForTime(StringBuilder sb, Formatter formatter, long j) {
    }

    public static String[] getSystemLanguageCodes() {
    }

    private static String[] getSystemLocales() {
    }

    private static String[] getSystemLocalesV24(Configuration configuration) {
    }

    private static String getSystemProperty(String str) {
    }

    public static String getTrackTypeString(int i) {
    }

    public static String getUserAgent(Context context, String str) {
    }

    public static byte[] getUtf8Bytes(String str) {
    }

    public static byte[] gzip(byte[] bArr) {
    }

    @Deprecated
    public static int inferContentType(Uri uri, String str) {
    }

    public static int inferContentTypeForExtension(String str) {
    }

    public static int inferContentTypeForUriAndMimeType(Uri uri, String str) {
    }

    public static boolean inflate(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, Inflater inflater) {
    }

    public static String intToStringMaxRadix(int i) {
    }

    public static boolean isAutomotive(Context context) {
    }

    public static boolean isEncodingHighResolutionPcm(int i) {
    }

    public static boolean isEncodingLinearPcm(int i) {
    }

    public static boolean isLinebreak(int i) {
    }

    public static boolean isLocalFileUri(Uri uri) {
    }

    private static boolean isMediaStoreExternalContentUri(Uri uri) {
    }

    private static boolean isTrafficRestricted(Uri uri) {
    }

    public static boolean isTv(Context context) {
    }

    private static /* synthetic */ Thread lambda$newSingleThreadExecutor$3(String str, Runnable runnable) {
    }

    private static /* synthetic */ void lambda$postOrRunWithCompletion$0(SettableFuture settableFuture, Runnable runnable, Object obj) {
    }

    private static /* synthetic */ void lambda$transformFutureAsync$1(SettableFuture settableFuture, ListenableFuture listenableFuture) {
    }

    private static /* synthetic */ void lambda$transformFutureAsync$2(ListenableFuture listenableFuture, SettableFuture settableFuture, AsyncFunction asyncFunction) {
    }

    public static int linearSearch(int[] iArr, int i) {
    }

    public static long maxValue(SparseLongArray sparseLongArray) {
    }

    private static String maybeReplaceLegacyLanguageTags(String str) {
    }

    public static boolean maybeRequestReadExternalStoragePermission(Activity activity, Uri... uriArr) {
    }

    public static long minValue(SparseLongArray sparseLongArray) {
    }

    public static <T> void moveItems(List<T> list, int i, int i2, int i3) {
    }

    public static long msToUs(long j) {
    }

    public static ExecutorService newSingleThreadExecutor(String str) {
    }

    public static String normalizeLanguageCode(String str) {
    }

    public static <T> T[] nullSafeArrayAppend(T[] tArr, T t) {
    }

    public static <T> T[] nullSafeArrayConcatenation(T[] tArr, T[] tArr2) {
    }

    public static <T> T[] nullSafeArrayCopy(T[] tArr, int i) {
    }

    public static <T> T[] nullSafeArrayCopyOfRange(T[] tArr, int i, int i2) {
    }

    public static <T> void nullSafeListToArray(List<T> list, T[] tArr) {
    }

    public static long parseXsDateTime(String str) throws ParserException {
    }

    public static long parseXsDuration(String str) {
    }

    public static boolean postOrRun(Handler handler, Runnable runnable) {
    }

    public static <T> ListenableFuture<T> postOrRunWithCompletion(Handler handler, Runnable runnable, T t) {
    }

    public static boolean readBoolean(Parcel parcel) {
    }

    public static void recursiveDelete(File file) {
    }

    public static Intent registerReceiverNotExported(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
    }

    public static <T> void removeRange(List<T> list, int i, int i2) {
    }

    private static boolean requestExternalStoragePermission(Activity activity) {
    }

    public static long scaleLargeTimestamp(long j, long j2, long j3) {
    }

    public static long[] scaleLargeTimestamps(List<Long> list, long j, long j2) {
    }

    public static void scaleLargeTimestampsInPlace(long[] jArr, long j, long j2) {
    }

    private static boolean shouldEscapeCharacter(char c) {
    }

    public static void sneakyThrow(Throwable th) {
    }

    private static <T extends Throwable> void sneakyThrowInternal(Throwable th) throws Throwable {
    }

    public static String[] split(String str, String str2) {
    }

    public static String[] splitAtFirst(String str, String str2) {
    }

    public static String[] splitCodecs(String str) {
    }

    public static ComponentName startForegroundService(Context context, Intent intent) {
    }

    public static long subtractWithOverflowDefault(long j, long j2, long j3) {
    }

    public static long sum(long... jArr) {
    }

    public static boolean tableExists(SQLiteDatabase sQLiteDatabase, String str) {
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
    }

    public static String toHexString(byte[] bArr) {
    }

    public static long toLong(int i, int i2) {
    }

    public static long toUnsignedLong(int i) {
    }

    public static <T, U> ListenableFuture<T> transformFutureAsync(ListenableFuture<U> listenableFuture, AsyncFunction<U, T> asyncFunction) {
    }

    public static CharSequence truncateAscii(CharSequence charSequence, int i) {
    }

    public static String unescapeFileName(String str) {
    }

    public static long usToMs(long j) {
    }

    public static void writeBoolean(Parcel parcel, boolean z) {
    }

    public static long ceilDivide(long j, long j2) {
    }

    public static long constrainValue(long j, long j2, long j3) {
    }

    public static Handler createHandlerForCurrentLooper(Handler.Callback callback) {
    }

    public static Handler createHandlerForCurrentOrMainLooper(Handler.Callback callback) {
    }

    public static String fromUtf8Bytes(byte[] bArr, int i, int i2) {
    }

    public static float constrainValue(float f, float f2, float f3) {
    }

    public static int linearSearch(long[] jArr, long j) {
    }

    public static int binarySearchCeil(long[] jArr, long j, boolean z, boolean z2) {
    }

    public static int binarySearchFloor(long[] jArr, long j, boolean z, boolean z2) {
    }

    public static int inferContentType(Uri uri) {
    }

    public static boolean maybeRequestReadExternalStoragePermission(Activity activity, MediaItem... mediaItemArr) {
    }

    public static <T extends Comparable<? super T>> int binarySearchCeil(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
    }

    public static <T extends Comparable<? super T>> int binarySearchFloor(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
    }

    public static Point getCurrentDisplayModeSize(Context context, Display display) {
    }

    public static int binarySearchFloor(LongArray longArray, long j, boolean z, boolean z2) {
    }

    private static boolean maybeRequestReadExternalStoragePermission(Activity activity, Uri uri) {
    }

    @Deprecated
    public static int inferContentType(String str) {
    }
}
