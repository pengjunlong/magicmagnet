package com.google.android.datatransport.cct.internal;

import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;

@AutoValue
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class LogResponse {
    private static final String LOG_TAG = "LogResponseInternal";

    static LogResponse create(long j) {
    }

    public static LogResponse fromJson(Reader reader) throws IOException {
    }

    public abstract long getNextRequestWaitMillis();
}
