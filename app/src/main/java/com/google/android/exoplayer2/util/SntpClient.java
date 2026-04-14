package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class SntpClient {
    public static final String DEFAULT_NTP_HOST = "time.android.com";
    private static final int NTP_LEAP_NOSYNC = 3;
    private static final int NTP_MODE_BROADCAST = 5;
    private static final int NTP_MODE_CLIENT = 3;
    private static final int NTP_MODE_SERVER = 4;
    private static final int NTP_PACKET_SIZE = 48;
    private static final int NTP_PORT = 123;
    private static final int NTP_STRATUM_DEATH = 0;
    private static final int NTP_STRATUM_MAX = 15;
    private static final int NTP_VERSION = 3;
    private static final long OFFSET_1900_TO_1970 = 2208988800L;
    private static final int ORIGINATE_TIME_OFFSET = 24;
    private static final int RECEIVE_TIME_OFFSET = 32;
    private static final int TIMEOUT_MS = 10000;
    private static final int TRANSMIT_TIME_OFFSET = 40;
    private static long elapsedRealtimeOffsetMs = 0;
    private static boolean isInitialized = false;
    private static final Object loaderLock = null;
    private static String ntpHost = "time.android.com";
    private static final Object valueLock = null;

    public interface InitializationCallback {
        void onInitializationFailed(IOException iOException);

        void onInitialized();
    }

    private static final class NtpTimeCallback implements Loader.Callback<Loader.Loadable> {
        private final InitializationCallback callback;

        public NtpTimeCallback(InitializationCallback initializationCallback) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCanceled(Loader.Loadable loadable, long j, long j2, boolean z) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCompleted(Loader.Loadable loadable, long j, long j2) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(Loader.Loadable loadable, long j, long j2, IOException iOException, int i) {
        }
    }

    private static final class NtpTimeLoadable implements Loader.Loadable {
        private NtpTimeLoadable() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void cancelLoad() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void load() throws IOException {
        }

        /* synthetic */ NtpTimeLoadable(C02361 c02361) {
        }
    }

    private SntpClient() {
    }

    static /* synthetic */ Object access$100() {
    }

    static /* synthetic */ Object access$200() {
    }

    static /* synthetic */ boolean access$300() {
    }

    static /* synthetic */ boolean access$302(boolean z) {
    }

    static /* synthetic */ long access$400() throws IOException {
    }

    static /* synthetic */ long access$502(long j) {
    }

    private static void checkValidServerReply(byte b, byte b2, int i, long j) throws IOException {
    }

    public static long getElapsedRealtimeOffsetMs() {
    }

    public static String getNtpHost() {
    }

    public static void initialize(Loader loader, InitializationCallback initializationCallback) {
    }

    public static boolean isInitialized() {
    }

    private static long loadNtpTimeOffsetMs() throws IOException {
    }

    private static long read32(byte[] bArr, int i) {
    }

    private static long readTimestamp(byte[] bArr, int i) {
    }

    public static void setNtpHost(String str) {
    }

    private static void writeTimestamp(byte[] bArr, int i, long j) {
    }
}
