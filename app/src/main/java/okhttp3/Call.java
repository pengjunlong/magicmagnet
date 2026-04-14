package okhttp3;

import java.io.IOException;
import kotlin.Metadata;
import okio.dpbdbdpbLwkLpObyKsq1lll1;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface Call extends Cloneable {

    @xc0
    public interface Factory {
        Call newCall(Request request);
    }

    void cancel();

    Call clone();

    void enqueue(Callback callback);

    Response execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    dpbdbdpbLwkLpObyKsq1lll1 timeout();
}
