package androidx.lifecycle;

import java.io.Closeable;
import java.util.Map;
import java.util.Set;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class bbdbbpdOJSuInlll111l {
    private final Map<String, Object> mBagOfTags;
    private volatile boolean mCleared;
    private final Set<Closeable> mCloseables;

    public bbdbbpdOJSuInlll111l() {
    }

    private static void closeWithRuntimeException(Object obj) {
    }

    public void addCloseable(Closeable closeable) {
    }

    final void clear() {
    }

    <T> T getTag(String str) {
    }

    protected void onCleared() {
    }

    <T> T setTagIfAbsent(String str, T t) {
    }

    public bbdbbpdOJSuInlll111l(Closeable... closeableArr) {
    }
}
