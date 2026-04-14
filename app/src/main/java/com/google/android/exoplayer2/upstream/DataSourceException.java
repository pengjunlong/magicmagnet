package com.google.android.exoplayer2.upstream;

import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class DataSourceException extends IOException {

    @Deprecated
    public static final int POSITION_OUT_OF_RANGE = 2008;
    public final int reason;

    public DataSourceException(int i) {
    }

    public static boolean isCausedByPositionOutOfRange(IOException iOException) {
    }

    public DataSourceException(Throwable th, int i) {
    }

    public DataSourceException(String str, int i) {
    }

    public DataSourceException(String str, Throwable th, int i) {
    }
}
