package io.antmedia.rtmp_client;

import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class RtmpClient {
    private long dbpqdHhmDSIHIJiwc1ll1l1;
    private int dpbdbdpbLwkLpObyKsq1lll1;
    private int dqqppqiKzJi1l1lll1l;

    public static class RtmpIOException extends IOException {
        public final int dpbdpqRKAscW1lll1l;

        public RtmpIOException(int i) {
        }
    }

    private native long nativeAlloc();

    private native void nativeClose(long j);

    private native int nativeOpen(String str, boolean z, long j, int i, int i2);

    private native int nativeRead(byte[] bArr, int i, int i2, long j) throws IllegalStateException;

    public void dbpqdHhmDSIHIJiwc1ll1l1() {
    }

    public void dpbdbdpbLwkLpObyKsq1lll1(String str, boolean z) throws RtmpIOException {
    }

    public int dqqppqiKzJi1l1lll1l(byte[] bArr, int i, int i2) throws RtmpIOException, IllegalStateException {
    }
}
