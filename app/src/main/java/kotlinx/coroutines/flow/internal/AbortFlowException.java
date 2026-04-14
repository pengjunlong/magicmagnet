package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class AbortFlowException extends CancellationException {
    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
    }
}
