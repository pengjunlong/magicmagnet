package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.Metadata;
import p000.aj1;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface CacheRequest {
    void abort();

    aj1 body() throws IOException;
}
