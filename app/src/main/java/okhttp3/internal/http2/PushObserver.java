package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import p000.qbbbpbbbiFxIAmEwllll11;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface PushObserver {
    public static final PushObserver CANCEL = null;
    public static final Companion Companion = null;

    @xc0
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        @Metadata
        private static final class PushObserverCancel implements PushObserver {
            @Override // okhttp3.internal.http2.PushObserver
            public boolean onData(int i, qbbbpbbbiFxIAmEwllll11 qbbbpbbbifxiamewllll11, int i2, boolean z) throws IOException {
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onHeaders(int i, List<Header> list, boolean z) {
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onRequest(int i, List<Header> list) {
            }

            @Override // okhttp3.internal.http2.PushObserver
            public void onReset(int i, ErrorCode errorCode) {
            }
        }

        private Companion() {
        }
    }

    boolean onData(int i, qbbbpbbbiFxIAmEwllll11 qbbbpbbbifxiamewllll11, int i2, boolean z) throws IOException;

    boolean onHeaders(int i, List<Header> list, boolean z);

    boolean onRequest(int i, List<Header> list);

    void onReset(int i, ErrorCode errorCode);
}
