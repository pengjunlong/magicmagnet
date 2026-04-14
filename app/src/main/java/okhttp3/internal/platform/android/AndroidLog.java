package okhttp3.internal.platform.android;

import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;
import kotlin.Metadata;
import okhttp3.internal.SuppressSignatureCheck;

@SuppressSignatureCheck
@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class AndroidLog {
    public static final AndroidLog INSTANCE = null;
    private static final int MAX_LOG_LENGTH = 4000;
    private static final CopyOnWriteArraySet<Logger> configuredLoggers = null;
    private static final Map<String, String> knownLoggers = null;

    private AndroidLog() {
    }

    private final void enableLogging(String str, String str2) {
    }

    private final String loggerTag(String str) {
    }

    public final void androidLog$okhttp(String str, int i, String str2, Throwable th) {
    }

    public final void enable() {
    }
}
