package org.adblockplus.libadblockplus;

import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class EventCallback implements Disposable {
    private final Disposer disposer;
    protected final long ptr;

    private static final class DisposeWrapper implements Disposable {
        private final long ptr;

        public DisposeWrapper(long j) {
        }

        @Override // org.adblockplus.libadblockplus.Disposable
        public void dispose() {
        }
    }

    static /* synthetic */ void access$000(long j) {
    }

    private static native long ctor(Object obj);

    private static native void dtor(long j);

    private static native void registerNatives();

    @Override // org.adblockplus.libadblockplus.Disposable
    public void dispose() {
    }

    public abstract void eventCallback(List<JsValue> list);
}
