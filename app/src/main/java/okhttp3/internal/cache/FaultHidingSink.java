package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.Metadata;
import p000.aj1;
import p000.dppbpdpFXDhtOnccosy1lll1l;
import p000.kg;
import p000.mv1;
import p000.sh;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class FaultHidingSink extends kg {
    private boolean hasErrors;
    private final sh<IOException, mv1> onException;

    public FaultHidingSink(aj1 aj1Var, sh<? super IOException, mv1> shVar) {
    }

    @Override // p000.kg, p000.aj1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p000.kg, p000.aj1, java.io.Flushable
    public void flush() {
    }

    public final sh<IOException, mv1> getOnException() {
    }

    @Override // p000.kg, p000.aj1
    public void write(dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l, long j) {
    }
}
